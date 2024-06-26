package  Mylib;

import Test.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

public class jtabbedpane {
    JTabbedPane pane;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public jtabbedpane(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getTabbedpane(ArrayList<String> tab) {
        tabbed_panel panel =new tabbed_panel();
        pane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        pane.setLayout(null);
        for (int i = 0; i <tab.size(); i++) {
            pane.setName(tab.get(i));
            pane.addTab(tab.get(i),panel.gettabbed_panel("panned"));
        }

        pane.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            //    System.out.print(" "+pane.getSelectedIndex());
                // System.out.print(" "+pane.getName());
                System.out.println(" "+tab.get(pane.getSelectedIndex()));
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


        pane.setBounds(this.xn,this.yn,this.width,this.height);
        pane.setVisible(true);
        return pane;
    }
}
