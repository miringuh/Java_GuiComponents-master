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
    public Component getdialog(ArrayList<String> ls, String fname){
        dialog=new JDialog();
        jmenubar bar=new jmenubar(this.xn,this.yn,this.width,this.height,"jmenubar");
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setEnabled(true);
        dialog.setName(this.name);
        dialog.setTitle(this.name);
        dialog.setBounds(this.xn,this.yn,this.width,this.height);
        dialog.setEnabled(true);
        dialog.setAlwaysOnTop(true);

        dialog.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                Component abar = bar.get_Abar(ls, fname);
                dialog.add(abar);
            }

            @Override
            public void componentMoved(ComponentEvent componentEvent) {

            }

            @Override
            public void componentShown(ComponentEvent componentEvent) {

            }

            @Override
            public void componentHidden(ComponentEvent componentEvent) {

            }
        });

        dialog.setVisible(true);
        return dialog;
    }
}
