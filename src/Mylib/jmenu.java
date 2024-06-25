package Mylib;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class jmenu {
    JMenu menu;
    jmenuitems pop;
    int xn;
    int yn;
    int height;
    String name;
    int cnt = 0;

    public jmenu(int xn, int yn, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.name = name;
    }
    public Component getjmenu(String ls) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, ls.length()*12, this.height);
        menu.setName(this.name);
//        menu.setBackground(new Color(184, 218, 45));
        menu.setText(ls);
        pop=new jmenuitems(0,0,ls.length(),30,ls);

        menu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println(menu.getText());
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

        menu.setEnabled(true);
        menu.setVisible(true);
        return menu;
    }
    public Component getjmenuComp(ArrayList<Component> ls) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, ls.size()*12, this.height);
        menu.setName(this.name);
//        menu.setBackground(new Color(184, 218, 45));
        menu.setText(this.name);
        pop=new jmenuitems(0,0,ls.size(),30,this.name);

        menu.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println(menu.getText());
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

        menu.setEnabled(true);
        menu.setVisible(true);
        return menu;
    }

}
