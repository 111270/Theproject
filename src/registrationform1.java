 
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.util.*;
import java.awt.GridLayout;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tina Lubira
 */
public class registrationform1 extends JFrame implements ActionListener {
JLabel title,namesLabel,genderLabel,telephoneLabel, DOBLabel,ageLabel;
JTextField namesField, genderField,telephoneField, DOBField, ageField;
JButton registerButton,exitButton;
JRadioButton male,female;
ButtonGroup bg;
JPanel panel;
List<User1> list= new ArrayList<User1>();

JTable table;
String gender="";
DefaultTableModel model;
JScrollPane scrollpane;
Object[][] data;

registrationform1(){
    setSize(700,260);
    setLayout (null);
    //Defining Labels
    title = new JLabel("Registration Form");
    add(title);
    title.setBounds(60,7,200,30);
    namesLabel= new JLabel("Names");
    namesLabel.setBounds(30,50,60,30);
    
    genderLabel= new JLabel("Gender");
    genderLabel.setBounds(30,120,60,30);
    
    telephoneLabel =new JLabel("Telephone");
    telephoneLabel.setBounds(30,155,60,30);
    
    DOBLabel= new JLabel ("Date of Birth");
    DOBLabel.setBounds(30,190,60,30);
    
    ageLabel =new JLabel("Age");
    ageLabel.setBounds(30,190,60,30);
    
    //Defining Name Field
    namesField=new JTextField();
    namesField.setBounds(95,85,100,30);
    //Defining gender Buttons
    male=new JRadioButton("Male");
    male.setBounds(95,120,60,30);
    male.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
gender = "Male";
        }
    });
    female=new JRadioButton("Female");
    female.setBounds(155,120,70,30);
    female.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
gender = "Female";        }
    });
    {
    bg=new ButtonGroup();
    bg.add(male);
    bg.add(female);
    genderField=new JTextField();
    genderField.setBounds(95,190,100,30);
    DOBField =new JTextField();
    DOBField.setBounds(95,190,100,30);
    
    telephoneField=new JTextField();
    telephoneField.setBounds(95,190,100,30);
    telephoneField.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e){
            char c =e.getKeyChar();
            if(!((c>='0')&&(c<='9')||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
                e.consume();
            }
        }
    });
    //Defining Exit Button
    exitButton = new JButton("Exit");
    exitButton.setBounds(25,230,80,30);
    
    exitButton.addActionListener(this);
    //Defining Reguster Button
    registerButton= new JButton("Register");
    registerButton.setBounds(110,230,100,30);
    
    registerButton.addActionListener(this);
    //fixing all Label,TextField,Button
    add(title);
    add(namesLabel);
    add(genderLabel);
    add(telephoneLabel);
    add(DOBLabel);
    add(ageLabel);
    add(namesField);
    add(male);
    add(female);
    add(telephoneField);
    add(DOBField);
    add(ageField);
    add(exitButton);
    add(registerButton);
    //Defining Panel
    panel =new JPanel();
    panel.setLayout(new GridLayout());
    panel.setBounds(250,10,400,300);
    
    panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
    add(panel);
    //Defining Model for Table
    model= new DefaultTableModel();
    table =new table1(model);
    
    table.setEnabled(false);
    //Defining Column Names on model
    model.addColumn("Names");
    model.addColumn("Gender");
    model.addColumn("Telephone");
    model.addColumn("Date of birth");
    model.addColumn("Age");
    
    scrollpane= new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);panel.add(scrollpane);
    panel.setEnabled(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
}    
}

    /**
     *
     * @param ae
     */
    @Override
  public void actionPerformed(ActionEvent ae) {
      if (ae.getSource()== exitButton){
          System.exit(0);
      }
      if (ae.getSource()== registerButton) {
          if (namesField.getText().equals("")) 
              JOptionPane.showMessageDialog(namesField,"Please add names field");
          else if (telephoneField.getText().equals(""))
              JOptionPane.showMessageDialog(namesField, "Please add telephone");
          else if(DOBField.getText().equals(""))
              JOptionPane.showMessageDialog(namesField,"Please add date of birth");
          else if (ageField.getText().equals(""))
              JOptionPane.showMessageDialog(namesField,"Please add age");
          else{
              //storing records in List
              list.add(new User1(namesField.getText(),telephoneField.getText(),DOBField.getText(),ageField.getText()));
              addRows();
              //using for DialogBox
              JOptionPane.showMessageDialog(this,"Successfully Registered");
              namesField.setText("");
              gender="";
              bg.clearSelection();
              telephoneField.setText("");
              DOBField.setText("");
             ageField.setText("");
         }
      }
  }
  //Adding records inlist
  public void addRows(){
    Object object = null;
if(object!=null){      
      User1 str = list.get(list.size()- 1);
      String string= str.unames+","+str.gender+","+str.utelephone+","+str.uDOB+","+str.uage;
    String[] row = string.split(",");
   
      //add records to table
      model.addRow(row);
      panel.revalidate();
  }
  }
    public static void main(String[]args){
new registrationform1();
    }
}

      
      


    


