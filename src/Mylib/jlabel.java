package Mylib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jlabel {
    JLabel lab;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public jlabel(int xn, int yn, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.width = (name.length()*15) ;
        this.height = h;
        this.name = name;
    }
    public Component getparentComp(Component comp){
        return comp;
    }

    public Component getlabel(String val) {
//        ImageIcon icon = new ImageIcon("src/images/"+png);

        lab = new JLabel();
        lab.setName(this.name);
        lab.setBounds(this.xn, this.yn, this.width, this.height);
//        lab.setFont(new Font("Arial",Font.BOLD,14));
        lab.setText(val);

        lab.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String text = lab.getText();
                System.out.println(text);
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

        lab.setEnabled(true);
        lab.setVisible(true);

        return lab;
    }}
