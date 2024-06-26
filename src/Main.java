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
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame = new JFrame();
        Main mn = new Main();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("Main");
        frame.setSize(mn.width, mn.height);

//        ArrayList<Component>comp=new ArrayList<>(2);
//        jlabel lab=new jlabel(0,0,30,"label");
//        Component value = lab.getlabel("Welcome: ");
//        jbutton butt=new jbutton(80,120,80,30,"button");
//        Component getb = butt.getbutton();
//        comp.add(value);
//        comp.add(getb);
//
//        ArrayList<Component> obj=new ArrayList<>(2);
//        jdialog dlog=new jdialog(30,80,260,160,"dialog");
//        dlog.getdialog(comp,"Dialog");
//
//        ArrayList<String> file = new ArrayList<>(4);
//        file.add("Open");
//        file.add("New");
//        file.add("Recent");
//        file.add("Exit");
//
//        ArrayList<String> tabs=new ArrayList<>(4);
//        tabs.add("File");
//        tabs.add("Views");
//        tabs.add("Debug");
//        tabs.add("Options");
//        tabs.add("Help");
//
//        ArrayList<String> file = new ArrayList<>(4);
//        file.add("Open");
//        file.add("New");
//        file.add("Recent");
//        file.add("Exit");
//
//        ArrayList<String> view = new ArrayList<>(3);
//        view.add("Tool");
//        view.add("Settings");
//        view.add("Appearance");
//
//        ArrayList<String> debug = new ArrayList<>(2);
//        debug.add("Debug");
//        debug.add("Debug & Run");
//
//        ArrayList<String> options = new ArrayList<>(4);
//        options.add("Cut");
//        options.add("Copy");
//        options.add("Paste");
//        options.add("Delete");
//
//        ArrayList<String> help = new ArrayList<>(4);
//        help.add("Authors");
//        help.add("License");
//        help.add("Documentation");
//        help.add("www.website.com");
//
//        jmenubar bar=new jmenubar(0,0, mn.width, 30,"bar");
//        Component getjbar = bar.getjbar(tabs,file,view,debug,options,help);
//        frame.add(getjbar);
//        jprogress prog=new jprogress(20,20,"progress");
//        Component setprogress = prog.setprogress();
//        frame.add(setprogress);
//        jradiobutton rad=new jradiobutton(0,0,"radio");
//        frame.add(rad.getradio());
//        jslider sld=new jslider(0,0,120,30,"slider");
//        frame.add(sld.getSliderH(20));
//        ArrayList<String> el=new ArrayList<>(4);
//        el.add("file");
//        el.add("open");
//        el.add("settings");
//        el.add("exit");
//        jspinner spin=new jspinner(10,10,120,30,"spinner");
//        Component spinnerList = spin.getSpinnerList(el);
//        frame.add(spinnerList);
//
//        ArrayList<Integer> numbs=new ArrayList<>(4);
//        numbs.add(10);
//        numbs.add(30);
//        numbs.add(40);
//        numbs.add(50);
//        jspinner spin=new jspinner(10,10,120,30,"spinner");
//        Component spinnerList = spin.getSpinnerList(numbs);
//        frame.add(spinnerList);

        ArrayList<String>tabs=new ArrayList<>(4);
        tabs.add("File");
        tabs.add("Open");
        tabs.add("Settings");
        tabs.add("Exit");
        jtabbedpane tab=new jtabbedpane(0,0,220,120,"tabs");
        Component tabbedpane = tab.getTabbedpane(tabs);
        frame.add(tabbedpane);

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

