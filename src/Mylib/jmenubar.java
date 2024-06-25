package Mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class jmenubar {
    JMenuBar jbar;
    jmenu menu;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    int cnt=30;

    public jmenubar(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.width = w;
        this.height = h;
        this.name = name;
    }

    public Component get_Abar(ArrayList<Component> lm,String ls) {
        jbar=new JMenuBar();
        jbar.setBounds(this.xn, cnt, this.width, this.height);
        jbar.setName(this.name);
        jbar.setSelectionModel(new DefaultSingleSelectionModel());
        jbar.setLayout(null);
        jbar.setVisible(true);
        return jbar;
    }

    public Component getjbar(ArrayList<String> ls){
        jbar=new JMenuBar();
        jbar.setName(this.name);
        Border border=new LineBorder(new Color(160, 227, 190),2,true);
        jbar.setBorder(border);
        jbar.setBackground(new Color(239, 231, 231, 137));
        jbar.setBounds(this.xn, this.yn, this.width, this.height);
        for (int i = 0; i < ls.size(); i++) {
            menu = new jmenu(cnt, 0,this.height, ls.get(i));
            jbar.add(menu.getjmenu(ls.get(i)));
            cnt+=ls.size()*12;
        }

        jbar.setEnabled(true);
        jbar.setVisible(true);
        return jbar;
    }
}
