package Mylib;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class database {
    int xn;
    int yn;
    int width;
    int height;
    String name;
    String source;
    Component comp;
    public database(int xn,int yn,int w,int h,String nm){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=nm;
    }
    public Component getParent(Component comp){
        this.comp=comp;
        return comp;
    }
    public String getSource(String src){
        this.source=src;
        return this.source;
    }

    public Component getSource() throws IOException {
        JTextArea field=new JTextArea();
        field.setName(this.name);
        field.setToolTipText(field.getName());
        field.setBounds(this.xn,this.yn,this.width,this.height);
        Border border=new LineBorder(new Color(70,170,170),2,true);
        field.setBorder(border);
        field.setWrapStyleWord(true);
            //////
        files fs=new files(this.source);
        byte[] bytes = fs.readFile();
        int length = bytes.length;
        char[] chars=new char[length];
        for (int i = 0; i <length ; i++) {
            chars[i]=((char)bytes[i]);
        }
        String st=new String(chars);
        field.setText(st);
            ///////
        field.getParent();

        field.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                System.out.println("comp: "+comp);
//                try {
//                    fs.writeFile("welcome home");
//
//                } catch (IOException e) {
//                    System.out.println("error "+e);
//                    throw new RuntimeException(e);
//                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
//                System.out.println("mouse pressed");

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });





        //////////////
//        field.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent keyEvent) {
//                System.out.println("char "+keyEvent.getKeyChar());
//            }
//            @Override
//            public void keyPressed(KeyEvent keyEvent) {
////                System.out.print("key pressed "+keyEvent.getKeyChar());
//            }
//            @Override
//            public void keyReleased(KeyEvent keyEvent) {
////                System.out.println("key released "+keyEvent.getKeyChar());
//
//            }
//        });
        ////////////////////
        field.setVisible(true);
        field.setBounds(this.xn,this.yn,this.width,this.height);
        return field;
    }
}
