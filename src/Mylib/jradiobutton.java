package Mylib;
import javax.swing.*;
import java.awt.*;

public class jradiobutton {
    int xn;
    int yn;
    String name;
    public int count=0;
    public jradiobutton(int xn, int yn, String name){
        this.xn=xn;
        this.yn=yn;
        this.name=name;
    }
    public Component getradio(){
        JRadioButton rad=new JRadioButton();
        rad.setName(this.name);
        rad.setBounds(this.xn,this.yn,40,40);
        rad.setActionCommand(this.name);
//        rad.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent itemEvent) {
//                System.out.println("changed");
//            }
//        });
        rad.setEnabled(true);
        rad.setVisible(true);
        return rad;
    }
}
