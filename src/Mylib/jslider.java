package Mylib;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class jslider {
    JSlider slid;
    int xn;
    int yn;
    String value;
    int height;
    int width;
    String name;
    public jslider(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }

    public Component getSliderH(int val){
        slid=new JSlider(JSlider.HORIZONTAL);
        slid.setName(this.name);
        slid.setBounds(this.xn,this.yn,this.width,this.height);
        slid.setMaximum(100);
        slid.setMinimum(0);
        slid.setMinorTickSpacing(0);
        slid.setMajorTickSpacing(10);
        slid.setPaintTicks(true);
        slid.setValueIsAdjusting(true);
        slid.setValue(val);
        slid.addChangeListener(new ChangeListener() {
            @Override

            public void stateChanged(ChangeEvent changeEvent) {
//                System.out.print(" "+slid.getValue());
            }
        });
        slid.setEnabled(true);
        slid.setVisible(true);
        return slid;
    }
    public Component getSliderV(int val){
        slid=new JSlider(JSlider.VERTICAL);
        slid.setName(this.name);
        slid.setBounds(this.xn,this.yn,this.height,this.width);
        slid.setMaximum(100);
        slid.setMinimum(0);
        slid.setMinorTickSpacing(0);
        slid.setMajorTickSpacing(10);
        slid.setPaintTicks(true);
        slid.setValue(val);
        slid.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
//                System.out.print(" "+slid.getValue());
            }
        });
        slid.setEnabled(true);
        slid.setVisible(true);
        return slid;
    }

}
