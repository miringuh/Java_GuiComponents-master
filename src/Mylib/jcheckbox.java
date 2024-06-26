package Mylib;

import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleState;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;



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
    public Component getjbox(Component comp){
        jbox=new JCheckBox();
        jbox.setName(this.name);
        jbox.setBounds(this.xn,this.yn,18,15);
        jbox.setBorderPaintedFlat(true);
        jbox.setContentAreaFilled(false);
        jbox.setBackground(Color.magenta);

        jbox.addItemListener((ItemEvent itemEvent) -> {
            AccessibleContext accessibleContext = jbox.getAccessibleContext();
            if(accessibleContext.getAccessibleStateSet().contains(AccessibleState.CHECKED)){
                System.out.println(comp.getName());
            }
        });

        jbox.setVisible(true);
        return jbox;
    }

}
