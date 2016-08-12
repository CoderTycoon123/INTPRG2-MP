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
import javax.swing.event.*;

public class Student2 extends JFrame implements ListSelectionListener, ActionListener
{
    JLabel lbl;
    ImageIcon icon = new ImageIcon("src\\Chess\\download.jpg");
    ImageIcon icon1 = new ImageIcon("src\\Chess\\150px-USTLogo.jpg");
    ImageIcon icon2 = new ImageIcon("src\\Chess\\s200_dlsu.theology_and_religious_education_department_tred_.png");
    ImageIcon icon3 = new ImageIcon("src\\Chess\\admu_logo_v_b2_0_by_shaoron.jpg");
    ImageIcon icon4 = new ImageIcon("src\\Chess\\up___diliman_seal_revamped_by_simplyvermelho-d61vyzk.jpg");
    JButton btn, btn1, btn2, btn3, btn4;
    JPanel pnl1, pnl2, pnl3, pnl4;
    CardLayout cl;
    JList list, listing;
    String data[] = { "Andrew", "Nigel", "Xtian", "Jeremy", "Alec", "Shirley" };
    String sections[] = {"S15", "S16", "S17" };
    
    public Student2()
    {
        super("Student");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setLayout(null);
        setSize(1250, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public void build()
    {
        lbl = new JLabel(icon);
        setContentPane(lbl);
        
        lbl = new JLabel("Student Enrolment System");
        lbl.setFont(new Font("Verdana", Font.ITALIC, 70));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(0, 0, 1000, 100);
        add(lbl);
        
        btn1 = new JButton(icon1);
        btn1.setBounds(200, 500, 100, 100);
        btn1.addActionListener(this);
        add(btn1);
        
        btn2 = new JButton(icon2);
        btn2.setBounds(450, 500, 100, 100);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3 = new JButton(icon3);
        btn3.setBounds(700, 500, 100, 100);
        btn3.addActionListener(this);
        add(btn3);
        
        btn4 = new JButton(icon4);
        btn4.setBounds(950, 500, 100, 100);
        btn4.addActionListener(this);
        add(btn4);
        
        lbl = new JLabel("Enlist in Section");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA);
        lbl.setBounds(160, 600, 1000, 100);
        add(lbl);
        
        lbl = new JLabel("Remove Enlistment");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA);
        lbl.setBounds(390, 600, 1000, 100);
        add(lbl);
        
        lbl = new JLabel("Enroll!");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA);
        lbl.setBounds(715, 600, 1000, 100);
        add(lbl);
        
        lbl = new JLabel("View EAF");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA);
        lbl.setBounds(948, 600, 1000, 100);
        add(lbl);
        
        pnl1 = initpnl1();
        pnl2 = initpnl2();
        pnl3 = initpnl3();
        pnl4 = initpnl4();
        
        pnl1.setBounds(150, 100, 1000, 350);
        pnl1.setOpaque(false);
        pnl1.setVisible(false);
        add(pnl1);
        
        pnl2.setBounds(150, 100, 1000, 350);
        pnl2.setOpaque(false);
        pnl2.setVisible(false);
        add(pnl2);
        
        pnl3.setBounds(150, 100, 1000, 350);
        pnl3.setOpaque(false);
        pnl3.setVisible(false);
        add(pnl3);
        
        pnl4.setBounds(150, 100, 1000, 350);
        pnl4.setOpaque(false);
        pnl4.setVisible(false);
        add(pnl4);
    }
    
    public JPanel initpnl1()
    {
        JPanel main = new JPanel(new BorderLayout());
        JPanel pnl = new JPanel(new GridBagLayout());
        JPanel cbpane = new JPanel();
        JPanel cbpane2 = new JPanel();
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel lbl1 = new JLabel("Enlist in Section");
        lbl1.setFont(new Font("Serif", Font.BOLD, 40));
        lbl1.setForeground(Color.MAGENTA.brighter());
        /*c.gridx = 2;
        c.gridy = 0;
        pnl.add(lbl, c);*/
        
        JLabel lbl;
        lbl = new JLabel("Course");
        lbl.setFont(new Font("Serif", Font.BOLD, 25));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(lbl, c);
        
        JComboBox cb = new JComboBox(data);
        cbpane.add(cb);
        cb.setPreferredSize(new Dimension(125, 35));
        
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(cbpane, c);
        
        lbl = new JLabel("Sections");
        lbl.setFont(new Font("Serif", Font.BOLD, 25));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 2;
        c.gridy = 1;
        pnl.add(lbl, c);
        
        JComboBox cb1 = new JComboBox(sections);
        cbpane2.add(cb1);
        cb1.setPreferredSize(new Dimension(125, 35));
        
        c.gridx = 3;
        c.gridy = 1;
        pnl.add(cbpane2, c);
        
        JList area = new JList(data);
        area.setFont(new Font("Algerian", Font.PLAIN, 35));
        
        area.setOpaque(false);
        
        JScrollPane pane = new JScrollPane(area);
        pane.setPreferredSize(new Dimension(250, 100));
        
        pane.setOpaque(false);
        pane.setViewportView(area);
        pane.getViewport().setOpaque(false);
        
        main.add(pane);
        main.add(lbl1, BorderLayout.NORTH);
        main.add(pnl, BorderLayout.SOUTH);
        
        pnl.setOpaque(false);
        cbpane.setOpaque(false);
        cbpane2.setOpaque(false);
        
        return main;
    }
    
    public JPanel initpnl2()
    {
        JPanel pnl = new JPanel(new BorderLayout());
        String data[] = { "INTPRG2", "ARCH-OS", "FIMODIT", "ITMATH3", "FILDLAR", "FTDANCE", "LOGPROG", "INTPRG1", "ITMATH1", "ITMATH2" };
        
        list = new JList(data);
        JScrollPane scroll = new JScrollPane(list);
        
        scroll.setPreferredSize(new Dimension(1000, 100));
        list.addListSelectionListener(this);
        /*
        list.setOpaque(false);
        scroll.setOpaque(false);
        scroll.setViewportView(list);
        scroll.getViewport().setOpaque(false);
        */
        JLabel lbl1 = new JLabel("Remove Enlistment");
        lbl1.setFont(new Font("Serif", Font.BOLD, 40));
        lbl1.setForeground(Color.MAGENTA.brighter());
        
        JLabel lbl2 = new JLabel("List of Enlisted Sections");
        lbl2.setFont(new Font("Serif", Font.BOLD, 25));
        lbl2.setForeground(Color.MAGENTA.brighter());
        lbl2.setHorizontalAlignment(JLabel.RIGHT);
        
        pnl.add(lbl1, BorderLayout.NORTH);
        pnl.add(scroll);
        pnl.add(lbl2, BorderLayout.SOUTH);
        
        return pnl;
    }
    
    public JPanel initpnl3()
    {
        JPanel pnl = new JPanel(new BorderLayout());
        
        JLabel lbl = new JLabel("Enroll");
        lbl.setFont(new Font("Serif", Font.BOLD, 40));
        lbl.setForeground(Color.MAGENTA.brighter());
        pnl.add(lbl, BorderLayout.NORTH);
        
        btn = new JButton("ENROLL!");
        btn.setFont(new Font("Serif", Font.BOLD, 35));
        
        btn.setPreferredSize(new Dimension(400, 400));
        pnl.add(btn);
        
        return pnl;
    }
    
    public JPanel initpnl4()
    {
        String[][] strings = {{"IDNUMBER: 11500000", "", "", "", "", ""},
                           {"CODE", "COURSE NAME", "SECTION", "TEACHER", "SCHEDULE", "UNITS"},
                           {"INTPRG2", "OBJECT-BASED PROGRAMMING IN JAVA", "S15", "CHU, SHIRLEY", "MW 0915-1045", "3.0"},
                           {"ARCH-OS", "COMPUTER ARCHITECTURE", "S16", "UY, ROGER", "TH  1245-1415", "3.0"},
                           {"TOTAL UNITS", "", "", "", "", "6.0"}};
        String[] datum = {"NAME: DELA CRUZ, JUAN", "", "", "", "", ""};
        
        JTable table = new JTable(strings, datum);
        table.setEnabled(false);
        
        JScrollPane scroll = new JScrollPane(table);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        table.setFillsViewportHeight(true);
        scroll.setPreferredSize(new Dimension(1000, 100));
        
        JLabel lbl = new JLabel("View EAF");
        lbl.setFont(new Font("Serif", Font.BOLD, 40));
        lbl.setForeground(Color.MAGENTA.brighter());
        
        table.setOpaque(false);
        scroll.setOpaque(false);
        scroll.setViewportView(table);
        scroll.getViewport().setOpaque(false);
        
        JPanel jp = new JPanel(new BorderLayout());
        jp.add(scroll);
        
        jp.add(lbl, BorderLayout.NORTH);
        
        return jp;
    }
    
    public void valueChanged(ListSelectionEvent e)
    {
        if (e.getValueIsAdjusting())
        {
            System.out.println(list.getSelectedValue());
            System.out.println(listing.getSelectedValue());
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        
        switch (((ImageIcon)((JButton) e.getSource()).getIcon()).getDescription())
        {
            case "src\\Chess\\150px-USTLogo.jpg": pnl1.setVisible(true); break;
            case "src\\Chess\\s200_dlsu.theology_and_religious_education_department_tred_.png": pnl2.setVisible(true); break;
            case "src\\Chess\\admu_logo_v_b2_0_by_shaoron.jpg": pnl3.setVisible(true); break; 
            case "src\\Chess\\up___diliman_seal_revamped_by_simplyvermelho-d61vyzk.jpg": pnl4.setVisible(true); break;
                //JOptionPane.showMessageDialog(this, "This will state your eligibility to enroll based on your\nminimum and maximum units.", "Enrolling Capability", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        Student2 a = new Student2();
    }
}
