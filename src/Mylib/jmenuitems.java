package Mylib;

import javax.swing.*;
import java.awt.*;

public class jmenuitems {
    JMenuItem item;
    int xn;
    int yn;
    int height;
    String name;
    public jmenuitems(int xn, int yn, int h, String name){
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.name = name;
    }
    public JMenuItem jmenuitem(String lm) {
        item = new JMenuItem();
        item.setBackground(new Color(237, 239, 239));
        item.setBounds(this.xn, this.yn,50, this.height);
        item.setText(lm);
        item.setLayout(null);
        item.setVisible((true));
        return item;
    }
}

