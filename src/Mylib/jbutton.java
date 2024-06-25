package Mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jbutton extends JButton{
    int xn;
    int yn;
    int height;
    int width;
    String name;
    Component obj;
    public jbutton(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getparent(Component obj){
        this.obj=obj;
        return this.obj;
    }
   public Component getbutton(){
       JButton bt1=new JButton();
       bt1.setText(this.name);
       bt1.setName(this.name);
       bt1.setBounds(this.xn,this.yn,this.width,this.height);
       bt1.setToolTipText(bt1.getName());
       bt1.setBackground(new Color(200,200,200));
       Border border=new LineBorder(new Color(170,180,20),2,true);
       bt1.setBorder(border);
//       bt1.setFocusable(true);

       bt1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               String name1 = bt1.getName();
               System.out.println("name: "+name1);
           }
       });
       bt1.setEnabled(true);
       bt1.setVisible(true);
       return bt1;
   }
}