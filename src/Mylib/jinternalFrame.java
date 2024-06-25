package Mylib;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


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
    public Component getintrnalJframe(ArrayList<Component>comp, String nm) {
        frame=new JInternalFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setBounds(this.xn,this.yn,this.width,this.height);
        frame.setTitle(this.name);
        frame.setName(nm);
        frame.setLayout(null);
        frame.setIconifiable(true);
        for (int i = 0; i < comp.size(); i++) {
            frame.add(String.valueOf(comp),comp.get(i));
        }
        frame.setClosable(true);
        frame.setVisible(true);
        return frame;
    }
}
