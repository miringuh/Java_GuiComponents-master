import Mylib.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public int width=500;
    public int height=500;
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        Main mn = new Main();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("Main");
        frame.setSize(mn.width, mn.height);

//        fd.writeFile("welcome");
//        files fd=new files("src/myfile.txt");
//        jbutton bt = new jbutton(0, 5, 80, 30, "button");
//        Component button = bt.getbutton();
//
//        jlabel lab=new jlabel(85,5,30,"panel button");
//        Component welcome = lab.getlabel("welcome");
//        ArrayList<Component> comps=new ArrayList<>(2);
//        comps.add(button);
//        comps.add(welcome);
//        jpanel pan =new jpanel(20,20,(mn.width/2),(mn.height/2),"jpanel");
//        Component getpanel = pan.getpanel(comp);
//        frame.add(getpanel);
//        jcheckbox box=new jcheckbox(5,10,"check");
//        Component getjbox = box.getjbox(welcome);
//        frame.add(getjbox);
//        ArrayList<String> tabs=new ArrayList<>(2);
//        tabs.add("OPEN");
//        tabs.add("FILE");
//        jdialog dlog=new jdialog(0,0,280,140,"dlog");
//        dlog.getdialog(comps,"SECURITY");
//        jinternalFrame innerframe=new jinternalFrame(0,0,280,220,"inner-frame");
//        Component welc = innerframe.getintrnalJframe(comps,"inframe");
//        frame.add(welc);
//      FILE I/O
//        database db=new database(5,180,280,80,"dbWr");
//        db.getSource("src/myfile.txt");
//        db.getParent(frame);
//        frame.add(db.getSource());
//
//        jlabel lab=new jlabel(5,20,40,20,"google");
//        frame.add(lab.setlabel("https://google.com",18,"computer.png"));
//
//        jtogglebutton tg=new jtogglebutton(5,5,100,20,"toggle");
//        frame.add(tg.getoggle());
//
//        checkbox box=new checkbox(5,5,"check");
//        frame.add(box.getcheck());
//
//         jradiobutton rad=new jradiobutton(5,5,"check");
//        frame.add(rad.getradio());
//
//         jlabel lab1=new jlabel(5,60,40,20,"firefox");
//         frame.add(lab1.setlabel("https://firefox.com",18));
//
//        jtextfield tx=new jtextfield(10,45,120,25,"txtfield");
//        frame.add(tx.getfieldtext("Name"));
//
//        jtextfield tx1=new jtextfield(10,75,120,25,"password");
//        frame.add(tx1.getfieldtext("Name2"));
//        frame.add(tx1.getfieldPasword());
//
//        jtextfield ddate=new jtextfield(10,120,120,25,"date");
//        frame.add(ddate.getdatefield());
//        jtextfield txt=new jtextfield(10,20, mn.width, 300,"date");
//        frame.add(txt.gettextarea());
//
//        jslider sld=new jslider(10,10,200,20,"slide");
//        frame.add(sld.getSliderV(20));
//
//        jspinner spn=new jspinner(10,10 ,120,25,"spin");
//        ArrayList <Integer> numbs=new ArrayList<>(10);
//        numbs.add(0);
//        numbs.add(10);
//        numbs.add(20);
//        numbs.add(30);
//        numbs.add(40);
//        numbs.add(50);
//        numbs.add(60);
//        numbs.add(70);
//        numbs.add(80);
//        numbs.add(90);
//        frame.add(spn.getSpinnerList(numbs));
//
//        jspinner spn1=new jspinner(10,40 ,120,25,"spin1");
//        ArrayList<String> names=new ArrayList<>(4);
//        names.add("joe");
//        names.add("paul");
//        names.add("ben");
//        names.add("carol");
//        frame.add(spn1.getSpinnerList(names));
//
//        jspinner spn2=new jspinner(10,70 ,120,25,"spin2");
//        frame.add(spn2.getSpinnerDate());
//
//        jspinner spn3=new jspinner(10,100 ,120,25,"spin3");
//        frame.add(spn3.getSpinnerNum());
//
//        jprogress prog=new jprogress(10,10,"prog");
//        prog.getprogress();
//        frame.add(prog.setprogress());
//
//        jlabel lb=new jlabel(100,10,80,20,"prog");
//        frame.add(lb.setlabel("Woods"));
//
//        jbutton field=new jbutton(10,35,80,20,"read");
//        field.getparent(prog);///////
//        frame.add(field.getbutton());
//        ArrayList<String> fd = new ArrayList<>(5);
//        fd.add("FILE");
//        fd.add("EDIT");
//        fd.add("VIEW");
//        fd.add("CLOSE");
//        fd.add("HELP");
//

//        Icon my_icon=new ImageIcon("src/images/soccerball.png");
//        Object[] test=new Object[6];
//        test[0]="Team";
//        test[1]=JOptionPane.PLAIN_MESSAGE;
//        test[2]=JOptionPane.DEFAULT_OPTION;
//        test[3]=my_icon;
//        test[4]="send";
//        test[5]="testing";
//
//        jcheckbox box=new jcheckbox(0,30,"box");
//        Component getjbox = box.getjbox();
//        frame.add(getjbox);
//
//        jlabel lb=new jlabel(30,0,80,"welcome");
//        Component ford = lb.getlabel(getjbox,"ford");
//        frame.add(ford);
//        ArrayList<String> help = new ArrayList<>(2);
//        help.add("About");
//        help.add("www.website.com");
//
//        jmenubar bar = new jmenubar(0, 0, mn.width, 30, "bar");
//        Component getjbar = bar.getjbar(fd,file,view,help,close,help);
//        frame.add(getjbar);
//
//                jinternalFrame fm=new jinternalFrame(0,40,250,250,"Internal Frame");
//                frame.add(fm.getintrnalJframe("jframe"));
//
//                joptionsPane pane=new joptionsPane(10,0,200,180,"Pane");
//                JOptionPane welcome = pane.getPane(test);
//                frame.add(welcome);
//
//                jdialog dlog=new jdialog(0,0,260,160,"dialog");
//                dlog.getdialog(help,file.get(0));
        ArrayList<String> tabs=new ArrayList<>(4);
        tabs.add("File");
        tabs.add("Views");
        tabs.add("Debug");
        tabs.add("Options");
        tabs.add("Help");

        ArrayList<String> file = new ArrayList<>(4);
        file.add("Open");
        file.add("New");
        file.add("Recent");
        file.add("Exit");

        ArrayList<String> view = new ArrayList<>(3);
        view.add("Tool");
        view.add("Settings");
        view.add("Appearance");

        ArrayList<String> debug = new ArrayList<>(2);
        debug.add("Debug");
        debug.add("Debug & Run");


        ArrayList<String> options = new ArrayList<>(4);
        options.add("Cut");
        options.add("Copy");
        options.add("Paste");
        options.add("Delete");

        ArrayList<String> help = new ArrayList<>(4);
        help.add("Authors");
        help.add("License");
        help.add("Documentation");
        help.add("www.website.com");




//        jmenuitems menu1 =new jmenuitems(0,0,50,30,"menu");
//        JMenuItem item = menu1.jmenuitem("item");
//        frame.add(item);

//         ArrayList<Component>comp=new ArrayList<>(4);
//         comp.add(menu1.getjmenu(tabs.get(0)));
//         jtabbedpane pane=new jtabbedpane(0,0,400,200,"tabbed");
//         Component tabbedpane = pane.getTabbedpane(tabs);
//         frame.add(tabbedpane);

//        jmenu menu =new jmenu(0,0,50,"menu");
//        Component getjmenu = menu.getjmenu(tabs.get(0));
//        frame.add(getjmenu,0);

//        jmenu menu1 =new jmenu(tabs.size()*12,0,50,"menu1");
//        Component getjmenu1 = menu1.getjmenu(tabs.get(1));
//        frame.add(getjmenu1,1);

//        Component getjmenu1 = menu.getjmenu(tabs.get(1));
//        Component getjmenu2 = menu.getjmenu(tabs.get(2));
//        frame.add(getjmenu1,1);
//        frame.add(getjmenu2,2);

        jmenubar bar=new jmenubar(0,0, mn.width, 30,"bar");
        Component getjbar = bar.getjbar(tabs,file,view,debug,options,help);
        frame.add(getjbar);



        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
//                System.out.print("r ");
            }
            @Override
            public void componentMoved(ComponentEvent componentEvent) {
//                System.out.println("moved");
            }
            @Override
            public void componentShown(ComponentEvent componentEvent) {
//                System.out.println("shown");
            }
            @Override
            public void componentHidden(ComponentEvent componentEvent) {
//                System.out.println("hidden");
            }
        });

        frame.setLayout(null);
        frame.setEnabled(true);
        frame.setVisible(true);
    }
};

