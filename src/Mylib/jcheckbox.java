package Mylib;

import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleSelection;
import javax.accessibility.AccessibleState;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
    public Component getjbox(Component comp){
        jbox=new JCheckBox();
        jbox.setName(this.name);
        jbox.setBounds(this.xn,this.yn,18,15);
        jbox.setBorderPaintedFlat(true);
        jbox.setContentAreaFilled(false);
        jbox.setBackground(Color.magenta);

        jbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                AccessibleContext accessibleContext = jbox.getAccessibleContext();
                if(accessibleContext.getAccessibleStateSet().contains(AccessibleState.CHECKED)){
                    System.out.println(comp.getName());
                }
            }
        });

        jbox.setVisible(true);
        return jbox;
    }

}
