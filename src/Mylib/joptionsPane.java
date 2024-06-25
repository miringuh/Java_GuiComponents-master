package Mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class joptionsPane {
    JOptionPane pane;
    int xn;
    int yn;
    int height;
    int width;
    String name;

    public joptionsPane(int x, int y,int w, int h, String name) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.width = w;
        this.name = name;
    }
/* JOPTION(Object message, int messageType, int optionType, Icon icon,Object options[], Object initialValue)
        MESSAGE-TYPE
    ERROR_MESSAGE
    INFORMATION_MESSAGE
    QUESTION_MESSAGE
    WARNING_MESSAGE
    PLAIN_MESSAGE....[ DEFAULT ]

        OPTION-TYPE [BUTTONS]
    DEFAULT_OPTION [DEFAULT]
    OK_CANCEL_OPTION
    YES_NO_CANCEL_OPTION
    YES_NO_OPTION

       OPTION-ARRAY-TYPE/initial VALUE
    if-COMPONENT =places the Component on jbutton area
    if-ICON =places the icon within the jbutton
    if-OBJECT =convert tostring() place a string in a JButton
*/


    public JOptionPane getPane(Object[] obj) {
        pane=new JOptionPane();
        pane.setName(obj[0].toString());
        pane.setMessageType((Integer) obj[1]);
        pane.setOptionType((Integer) obj[2]);
        pane.setIcon((Icon) obj[3]);
//        pane.setOptions();
        pane.setInitialValue(obj[5]);
        pane.setMessage(obj[0].toString());

        pane.setBounds(this.xn,this.yn,this.width,this.height);
        Border border=new LineBorder(new Color(29, 83, 216),2,true);
        pane.setBorder(border);
        pane.setEnabled(true);
        pane.setFocusable(true);
        pane.setWantsInput(true);

        pane.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                System.out.println(pane.getInputValue());
                if(pane.getValue().equals(0)){
                    pane.setEnabled(false);
                    pane.setVisible(false);
                }

            }
        });
        pane.setVisible(true);
        return pane;
    }

}
