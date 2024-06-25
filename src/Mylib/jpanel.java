package Mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class jpanel extends JPanel{
    int xn;
    int yn;
    int width;
    int height;
    String name;
    Component comp;

    public jpanel(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getComp(Component comp){
        this.comp=comp;
        return comp;
    }
    public Component getpanel(ArrayList<Component> comp) {
        JPanel panel=new JPanel();
        panel.setToolTipText("my jpanel");
        panel.setName(this.name);
        Border border = new LineBorder(new Color(77, 134, 165, 255), 2, true);
        panel.setBorder(border);
//        panel.setOpaque(true);
        panel.setBounds(this.xn,this.yn,this.width,this.height);
        Color color = new Color(156, 191, 227, 115);
        panel.setBackground(color);
        for (int i = 0; i < comp.size(); i++) {
            panel.add(comp.get(i),i);
        }
        panel.setLayout(null);
        panel.setEnabled(true);


        panel.setVisible(true);
        return panel;
    }


}
