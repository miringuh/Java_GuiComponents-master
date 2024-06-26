package Mylib;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jtooltip {
        JToolTip tip;
        int xn;
        int yn;
        int height;
        String name;
    public jtooltip(int x, int y, int h, String name) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.name = name;
    }
    public JToolTip getTip(String name) {
        tip = new JToolTip();
        tip.setName(this.name);
        tip.setTipText(name);
        tip.setBounds(this.xn, this.yn, name.length() * 10, this.height);
        tip.setLayout(null);
        tip.setInheritsPopupMenu(true);

        tip.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println(tip.getTipText());
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

        tip.setEnabled(true);
        tip.setVisible(true);
        return tip;
    }
}
