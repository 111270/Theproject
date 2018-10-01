/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Tina Lubira
 */
public class login1 extends JFrame implements ActionListener
{
    JFrame frame;
    JFrame frame2;
    JTextField field;
    JPasswordField B;
    JLabel A;
    JButton button;
    
    login1(){
       frame = new JFrame ("Login");
       frame.setSize(500,200);
       frame.getContentPane().setBackground(Color.yellow);
       frame.setLocation(300,200);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       A=new JLabel("Username");
       A.setLocation(10,10);
       A.setSize(A.getPreferredSize());
       frame.add(A);
       
       field = new JTextField();
              field.setColumns(15);
       field.setSize(field.getPreferredSize());
       
       field.setLocation(90,10);
       field.setToolTipText("Username");
       frame.add(field);
       
       A=new JLabel("Password");
       A.setLocation(10,40);
       A.setSize(A.getPreferredSize());
       frame.add(A);
       
        B = new JPasswordField();
              B.setColumns(15);
       B.setSize(B.getPreferredSize());
       
       B.setLocation(90,40);
       B.setToolTipText("Password");
       frame.add(B);
       
       button = new JButton("OK");
       button.setSize(button.getPreferredSize());
       button.setLocation(90,80);
       frame.add(button);
       
        frame.setVisible(true);
        
                
 
}
   public void actionlogin(){
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
String puname= field.getText();
String ppasword= B. getText();  
           if(puname.equals("Adminme")&& ppasword.equals("worker1")){
           newframe regFace= new newframe();
           regFace.setVisible(true);
           dispose();
       }else{
               JOptionPane.showMessageDialog(null,"Wrong Password / Username");
field.setText("");
B.setText("");
field.requestFocus();
           }
      }

           private void dispose() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
   }
    public static void main(String args[]){
        new login1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 
