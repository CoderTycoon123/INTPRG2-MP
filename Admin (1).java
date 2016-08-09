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

public class Admin extends JFrame implements ItemListener, ActionListener
{   
    JComboBox cb;
    CardLayout cl;
    JLabel lbl;
    JPanel pnls, cbpanel, pnl1, pnl2, pnl3, pnl4, pnl5, main;
    String s1, s2, s3, s4, s5;
    
    public Admin()
    {
        super ("Admin");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(500, 200);
        setResizable(false);
        setVisible(true);
    }
    
    public void build()
    {
        s1 = "Register Student Account";
        s2 = "Edit Student Account";
        s3 = "Add Course";
        s4 = "Open Section";
        s5 = "View Class List";
    
        String[] data = {s1, s2, s3, s4, s5};
        
        cl = new CardLayout();
        
        cbpanel = new JPanel();
        pnls = new JPanel(cl);
        
        pnl1 = new JPanel(new GridBagLayout());
        pnl1.add(initpnl1());
        pnl1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s1, 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        pnls.add(pnl1, s1);
        
        pnl2 = new JPanel(new GridBagLayout());
        pnl2.add(initpnl2());
        pnl2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s2, 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        pnls.add(pnl2, s2);
        
        pnl3 = new JPanel(new GridBagLayout());
        pnl3.add(initpnl3());
        pnl3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s3, 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        pnls.add(pnl3, s3);
        
        pnl4 = new JPanel(new GridBagLayout());
        pnl4.add(initpnl4());
        pnl4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s4, 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        pnls.add(pnl4, s4);
        
        pnl5 = new JPanel(new GridBagLayout());
        pnl5.add(initpnl5());
        pnl5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s5, 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        pnls.add(pnl5, s5);
        
        cb = new JComboBox(data);
        cbpanel.add(cb);
        
        main = new JPanel(new BorderLayout());
        
        main.add(cbpanel, BorderLayout.WEST);
        main.add(pnls, BorderLayout.CENTER);
        
        cb.addItemListener(this);
        
        main.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Admin Account", 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        add(main);
    }
    
    public JPanel initpnl1()
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("ID Number");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tf, c);
        
        lbl = new JLabel("Password");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("Last Name");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("First Name");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tf, c);
        
        lbl = new JLabel("Minimum Units");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 4;
        jp.add(tf, c);
        
        lbl = new JLabel("Maximum Units");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.gridx = 1;
        c.gridy = 6;
        jp.add(btn, c);
        
        return jp;
    }
    
    public JPanel initpnl2()
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("Enter ID Number");
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tf, c);
        
        lbl = new JLabel("New Last Name");
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("New First Name");
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.gridx = 1;
        c.gridy = 3;
        jp.add(btn, c);
        
        return jp;
    }
    
    public JPanel initpnl3()
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("Course Code");
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tf, c);
        
        lbl = new JLabel("Course Name");
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("Number of Units");
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.gridx = 1;
        c.gridy = 3;
        jp.add(btn, c);
        
        return jp;
    }
    
    public JPanel initpnl4()
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("Section Name");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tf, c);
        
        lbl = new JLabel("Faculty");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("Class Schedule");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("Start Time");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tf, c);
        
        lbl = new JLabel("End Time");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 4;
        jp.add(tf, c);
        
        lbl = new JLabel("Capacity");
        c.ipady = -5;
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.ipady = -5;
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.gridx = 1;
        c.gridy = 6;
        jp.add(btn, c);
        
        return jp;
    }
    
    public JPanel initpnl5()
    {
        JPanel pnl = new JPanel();
        return pnl;
    }
    
    public void actionPerformed(ActionEvent e)
    {
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        switch ((String) e.getItem())
        {
            case "Register Student Account" : cl.show(pnls, s1); break;
            case "Edit Student Account"     : cl.show(pnls, s2); break;
            case "Add Course"               : cl.show(pnls, s3); break;
            case "Open Section"             : cl.show(pnls, s4); break;
            case "View Class List"          : cl.show(pnls, s5); break;
        }
    }
    
    public static void main(String[] args) {
        Admin a = new Admin();
    }
}
