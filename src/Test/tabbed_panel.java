package Test;

import Mylib.jbutton;
import Mylib.jlabel;
import Mylib.jpanel;
import java.awt.*;

public class tabbed_panel {

//    public tabbed_panel(){
//    }
    public Component gettabbed_panel(String str){
        jpanel panel=new jpanel(0,0,200,200,str);
        jlabel label=new jlabel(90,0,30,"label");
        jbutton button=new jbutton(0,5,80,20,"pbutton");

       panel.add(label.getlabel("label"));
       panel.add(button.getbutton());
       panel.setLayout(null);
        return panel;
    }
}
