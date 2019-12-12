package com.company;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class frame1 extends JFrame{
    frame1(){
        try{
                JPanel panel1=new JPanel();

                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setTitle("University Management System");

                JButton bin=new JButton("Sign In");
                JButton bup=new JButton("Sign Up");
                JLabel lin=new JLabel("Sign In");
                JLabel lup=new JLabel("Sign Up");
                JLabel lname=new JLabel("User Name");
                JLabel lnameup=new JLabel("User Name");
                JLabel lword=new JLabel("PassWord");
                JLabel lwordup=new JLabel("PassWord");
                JLabel lreword=new JLabel("Re-Type Password");
                JTextField tnamein=new JTextField();
                JTextField twordin=new JTextField();
                JTextField tnameup=new JTextField();
                JTextField twordup=new JTextField();
                JTextField trewordup=new JTextField();

                lin.setBounds(50,30,50,30);
                lname.setBounds(50,70,100,30);
                tnamein.setBounds(150,70,200,30);
                lword.setBounds(50,120,100,30);
                twordin.setBounds(150,120,200,30);
                bin.setBounds(400,120,100,30);
                lup.setBounds(50,290,50,30);
                lnameup.setBounds(50,330,100,30);
                tnameup.setBounds(150,330,200,30);
                lwordup.setBounds(50,380,100,30);
                twordup.setBounds(150,380,200,30);
                bup.setBounds(400,380,100,30);

                this.add(bup);
                this.add(twordup);
                this.add(lwordup);
                this.add(tnameup);
                this.add(lnameup);
                this.add(lup);
                this.add(bin);
                this.add(lword);
                this.add(twordin);
                this.add(lin);
                this.add(lname);
                this.add(tnamein);
                this.setSize(640,600);
                this.setLayout(null);
                this.setVisible(true);





        }catch(Exception e){System.out.println(e);}


    }


}
