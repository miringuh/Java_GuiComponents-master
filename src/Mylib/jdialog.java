package Mylib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

public class jdialog {
    JDialog dialog;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    public jdialog(int x, int y,int w, int h, String name) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public Component getdialog(ArrayList<Component> ls,String title){
        dialog=new JDialog();
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setBounds(this.xn,this.yn,this.width,this.height);
        dialog.setEnabled(true);
        dialog.setName(this.name);
        dialog.setTitle(title);
        dialog.setEnabled(true);
        dialog.setAlwaysOnTop(true);
        dialog.setLayout(null);
        for (Component l : ls) {
            dialog.add(l);
        }
        dialog.setVisible(true);
        return dialog;
    }
}
