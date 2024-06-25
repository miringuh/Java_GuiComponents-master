package Mylib;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class jmenuitems {
    JMenuItem item;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    int count=0;
    public jmenuitems(int xn, int yn, int w, int h, String name){
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public JMenuItem jmenuitem(String lm) {
        item = new JMenuItem();
        Border border = new LineBorder(new Color(167, 168, 155), 1, true);
        item.setBorder(border);
//        item.setBackground(new Color(210, 230, 73));
        item.setText(lm);
        item.setBounds(0, count, this.width, this.height);
        item.setVisible((true));

        item.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.print(lm + " ");
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


        return item;
    }
}

