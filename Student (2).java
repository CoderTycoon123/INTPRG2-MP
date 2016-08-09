/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MPEnrollmentSystem.GUI;

/**
 *
 * @author Dell Inspiron 15
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame implements ItemListener
{
    CardLayout cl;
    JPanel pnls, pnl1, pnl2, pnl3, pnl4, cbpane, main;
    JLabel lbl;
    JComboBox cb;
    String s1, s2, s3, s4;
    
    public Student()
    {
        super ("Student");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(500, 200);
        setResizable(true);
        setVisible(true);
    }
    
    public void build()
    {
        s1 = "Enlist in Section";
        s2 = "Remove Enlistment";
        s3 = "Enroll";
        s4 = "View EAF";
        
        String data[] = {s1, s2, s3, s4};
        
        cl = new CardLayout();
        cb = new JComboBox(data);
        
        cbpane = new JPanel();
        cbpane.add(cb);
        
        pnls = new JPanel(cl);
        
        pnl1 = new JPanel();
        pnls.add(pnl1, s1);
        
        pnl2 = new JPanel();
        pnls.add(pnl2, s2);
        
        pnl3 = new JPanel();
        pnl3.add(initpnl3());
        pnls.add(pnl3, s3);
        
        pnl4 = new JPanel();
        pnl4.add(initpnl4());
        pnls.add(pnl4, s4);
        
        main = new JPanel(new BorderLayout());
        
        main.add(pnls, BorderLayout.CENTER);
        main.add(cbpane, BorderLayout.WEST);
        
        cb.addItemListener(this);
        add(main);
    }
    
    public JTextArea initpnl3()
    {
        JTextArea txt = new JTextArea(8, 0);
        String str = "LIST OF\nENLISTED COURSES\nWITH SECTIONS";
        txt.setText(str);
        return txt;
    }
    
    public JTable initpnl4()
    {
        String[][] strings = {{"NAME: DELA CRUZ, JUAN", "", "", "", "", ""},
                           {"IDNUMBER: 11500000", "", "", "", "", ""},
                           {"CODE", "COURSE NAME", "SECTION", "TEACHER", "SCHEDULE", "UNITS"},
                           {"INTPRG2", "OBJECT-BASED PROGRAMMING IN JAVA", "S15", "CHU, SHIRLEY", "MW 0915-1045", "3.0"},
                           {"ARCH-OS", "COMPUTER ARCHITECTURE", "S16", "UY, ROGER", "TH  1245-1415", "3.0"},
                           {"TOTAL UNITS", "", "", "", "", "6.0"}};
        String[] datum = {"NAME: DELA CRUZ, JUAN", "", "", "", "", ""};
        
        JTable table = new JTable(strings, datum);
        table.setEnabled(false);
        
        return table;
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        switch ((String) e.getItem())
        {
            case "Enroll": cl.show(pnls, s3); break;
            case "View EAF": cl.show(pnls, s4); break;
        }
    }
    
    public static void main(String[] args) {
        Student s = new Student();
    }
}
