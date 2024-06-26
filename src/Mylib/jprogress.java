package Mylib;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;

public class jprogress {
    JProgressBar bar;
    int xn;
    int yn;
    int progVal;
    String name;
    public jprogress(int xn, int yn, String name){
        this.xn=xn;
        this.yn=yn;
        this.name=name;
    }
    public Component getprogress() throws InterruptedException {
       bar=new JProgressBar();
        bar.setMinimum(0);
        bar.setMaximum(100);
        Border brd=new LineBorder(new Color(18, 25, 17),1,true);
//        Border brd=new BevelBorder(2);
        bar.setBorder(brd);
        bar.setBounds(this.xn,this.yn,80,20);
        bar.setValue(10);
        bar.addChangeListener((ChangeEvent changeEvent) -> {
            //                System.out.println(bar.getValue());
            if (bar.getValue()==99){
                bar.setVisible(false);}
       });
        bar.setEnabled(true);
        bar.setVisible(true);
        return bar;
    }
    public Component setprogress() throws InterruptedException {
        getprogress();
        Thread th=new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                bar.setValue(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });th.start();
        return bar;
    }
    public int getprogVal(){
        return this.progVal;
    }
}
