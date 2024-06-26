package Mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;


public class jmenubar {
    JMenuBar jbar;
    jmenu menu;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public jmenubar(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.width = w;
        this.height = h;
        this.name = name;
    }
    public Component getjbar(ArrayList<String> ls,ArrayList<String> file,ArrayList<String> view,ArrayList<String> debug,ArrayList<String> options,ArrayList<String> help){
        jbar=new JMenuBar();
        jbar.setName(this.name);
        Border border=new LineBorder(new Color(9, 18, 13),1,true);
        jbar.setBorder(border);
        jbar.setBackground(new Color(141, 191, 220, 137));
        jbar.setBounds(this.xn, this.yn, this.width, this.height);
        for (int i = 0; i < ls.size(); i++) {
            menu = new jmenu(this.xn, 0,this.height,this.width, ls.get(i));
            Component getjmenu = menu.getjmenu(ls.get(i),file,view,debug,options,help);
            jbar.add(getjmenu);
        }
        jbar.setEnabled(true);
        jbar.setVisible(true);
        return jbar;
    }
}
