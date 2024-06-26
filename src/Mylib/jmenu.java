package Mylib;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;



public class jmenu {
    JMenu menu;
    jmenuitems pop;
    int xn;
    int yn;
    int height;
    int width;
    String name;


    public jmenu(int xn, int yn, int h, int w, String name) {
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = h;
        this.name = name;
    }

    public Component getjmenu(String ls,ArrayList<String> file,ArrayList<String> view,ArrayList<String> debug,ArrayList<String> options,ArrayList<String> help) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, this.width, this.height);
        menu.setName(ls);
//        menu.setBackground(new Color(184, 218, 45));
        menu.setText(ls);

        if(ls.equals("File")){
            for (int i = 0; i < file.size(); i++) {
                pop = new jmenuitems(this.xn, this.yn, this.height, ls);
                JMenuItem jmenuitem = pop.jmenuitem(file.get(i));
                menu.add(jmenuitem);
            }
        }
        if(ls.equals("Views")){
            for (int i = 0; i < view.size(); i++) {
                pop = new jmenuitems(this.xn, this.yn, this.height, ls);
                JMenuItem jmenuitem = pop.jmenuitem(view.get(i));
                menu.add(jmenuitem);
            }
        }
        if(ls.equals("Debug")){
            for (int i = 0; i < debug.size(); i++) {
                pop = new jmenuitems(this.xn, this.yn, this.height, ls);
                JMenuItem jmenuitem = pop.jmenuitem(debug.get(i));
                menu.add(jmenuitem);
            }
        }
        if(ls.equals("Options")){
            for (int i = 0; i < options.size(); i++) {
                pop = new jmenuitems(this.xn, this.yn, this.height, ls);
                JMenuItem jmenuitem = pop.jmenuitem(options.get(i));
                menu.add(jmenuitem);
            }
        }
        if(ls.equals("Help")){
            for (int i = 0; i < help.size(); i++) {
                pop = new jmenuitems(this.xn, this.yn, this.height, ls);
                JMenuItem jmenuitem = pop.jmenuitem(help.get(i));
                menu.add(jmenuitem);
            }
        }

        menu.setEnabled(true);
        menu.setVisible(true);
        return menu;
    }
//    public Component getjmenuComp(ArrayList<Component> ls) {
//        menu = new JMenu();
//        menu.setBounds(this.xn, this.yn, ls.size()*12, this.height);
//        menu.setName(this.name);
////        menu.setBackground(new Color(184, 218, 45));
//        menu.setText(this.name);
//        pop=new jmenuitems(0,0,ls.size(),30,this.name);
//
//        menu.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent mouseEvent) {
//                System.out.println(menu.getText());
//            }
//            @Override
//            public void mousePressed(MouseEvent mouseEvent) {
//            }
//            @Override
//            public void mouseReleased(MouseEvent mouseEvent) {
//            }
//            @Override
//            public void mouseEntered(MouseEvent mouseEvent) {
//            }
//            @Override
//            public void mouseExited(MouseEvent mouseEvent) {
//            }
//        });
//
//        menu.setEnabled(true);
//        menu.setVisible(true);
//        return menu;
//    }

}
