package Mylib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class jcheckbox {
    JCheckBox jbox;
    int xn;
    int yn;
    String name;
    public  jcheckbox(int xn,int yn,String name){
        this.xn=xn;
        this.yn=yn;
        this.name=name;
    }
    public Component getjbox(){
        jbox=new JCheckBox();
        jbox.setName(this.name);
        jbox.setBounds(this.xn,this.yn,18,15);
        jbox.setBorderPaintedFlat(true);
        jbox.setContentAreaFilled(false);
        jbox.setBackground(Color.magenta);

        jbox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println(jbox.getName());
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
        jbox.setVisible(true);
        return jbox;
    }

}
