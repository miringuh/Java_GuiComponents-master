package Mylib;

import javax.swing.*;
import java.awt.*;


public class jinternalFrame {
    JInternalFrame frame;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    public jinternalFrame(int x, int y,int w, int h, String name) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public Component getintrnalJframe(String nm) {
        frame=new JInternalFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle(this.name);
        frame.setSize(this.width,this.height);
        frame.setName(nm);
        frame.setIconifiable(true);
        frame.setClosable(true);
        frame.setVisible(true);
        return frame;
    }
}
