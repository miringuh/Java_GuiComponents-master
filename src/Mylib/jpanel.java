package Mylib;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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
    public Component getpanel(Component comp) {
        JPanel panel=new JPanel();
        panel.setToolTipText("my jpanel");
        panel.setName(this.name);
        Border border = new LineBorder(new Color(77, 134, 165, 255), 2, true);
        panel.setBorder(border);
        panel.setOpaque(true);
        Color color = new Color(210, 221, 221);
        panel.setBackground(color);
        panel.setLayout(null);
        panel.setEnabled(true);
        panel.add(comp);
        panel.setVisible(true);
        return panel;
    }


}
