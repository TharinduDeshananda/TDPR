package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class frame2 extends JFrame{
frame2(){
    this.setTitle("Profile Information");
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    JTabbedPane tp=new JTabbedPane();
    tp.setBackground(Color.white);

    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    p1.setBackground(Color.white);
    p2.setBackground(Color.white);
    tp.add("Subject Enrolment",p1);
    tp.add("Profile",p2);
    tp.setBounds(10,10,600,520);
    this.add(tp);
    this.setBounds(150,50,640,600);
    this.setLayout(null);
    this.setResizable(false);
    this.setVisible(true);

}



}
