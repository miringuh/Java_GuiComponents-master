package Mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;

public class jspinner {
    JSpinner spin;
    int xn;
    int yn;
    int height;
    int width;
    String name;

    public jspinner(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getSpinnerDate(){
        SpinnerModel md=new SpinnerDateModel();
        spin=new JSpinner(md);
        spin.setBounds(this.xn,this.yn,this.width,this.height);
        spin.setName(this.name);
        Border border=new LineBorder(new Color(20,180, 132),2,true);
        spin.setBorder(border);
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("Date "+md.getValue());
            }
        });
        spin.setEnabled(true);
        spin.setVisible(true);
        return spin;
    }
    public Component getSpinnerNum(){
        SpinnerModel md=new SpinnerNumberModel();
        spin=new JSpinner(md);
        spin.setBounds(this.xn,this.yn,this.width,this.height);
        spin.setName(this.name);
        spin.setValue(0);
        Border border=new LineBorder(new Color(170,180,20),2,true);
        spin.setBorder(border);
    //
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.print("Num- "+md.getValue());
            }
        });
        spin.setEnabled(true);
        spin.setVisible(true);
        return spin;
    }
    public Component getSpinnerList(ArrayList<?> elem){
        SpinnerModel md=new SpinnerListModel(elem);
        spin=new JSpinner(md);
        spin.setBounds(this.xn,this.yn,this.width,this.height);
        spin.setName(this.name);
        Border border=new LineBorder(new Color(8, 239, 186),2,true);
        spin.setBorder(border);
        //
        spin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("list "+spin.getValue());
            }
        });

        spin.setEnabled(true);
        spin.setVisible(true);
        return spin;


    }
}
