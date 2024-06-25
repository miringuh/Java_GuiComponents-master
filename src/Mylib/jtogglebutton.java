package Mylib;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class jtogglebutton {
    int xn;
    int yn;
    int height;
    int width;
    String name;
    public int count=0;
    public jtogglebutton(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getoggle(){
        JToggleButton toggle=new JToggleButton("hello");
        toggle.setBounds(this.xn,this.yn,this.width,this.height);
        toggle.setName(this.name);
        toggle.setText("toggle");
        Border bev=new LineBorder(new Color(13, 152, 234),1,true);
        toggle.setBorder(bev);

        toggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                toggle.setBackground(new Color(219, 151, 151));
//                toggle.setText("ON");
            }
        });
//

        toggle.setEnabled(true);
        toggle.setVisible(true);
        return toggle;
    }
}
