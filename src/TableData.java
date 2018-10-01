import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tina Lubira
 */
public class TableData {
    JFrame f;
    public TableData(){
        
f= new JFrame();
              
        String[] columnNames = {"Names", "Gender", "Telephone","Date of birth","Age"};
        Object[][] data = new Object[][] {
            {"James", "male","0702556","27th May 1999","19"},
            {"Mary", "Female","0789456","31st December 1995","23"},
                {"Kevin", "Male","0755678","1st January 1998","20"},
               };
               JTable jt=new JTable(data,columnNames);
               jt.setBounds(30,40,200,300);
               JScrollPane sp=new JScrollPane(jt);
               f.add(sp);
               f.setSize(300,400);
               f.setVisible(true);
    }
    public static void main(String[]args){
        new TableData();
    }

    TableData(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TableData(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


