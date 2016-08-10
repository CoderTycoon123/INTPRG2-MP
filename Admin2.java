/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MPEnrollmentSystem.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin2 extends JFrame implements ActionListener
{
    JLabel lbl;
    JPanel pnl1, pnl2, pnl3, pnl4, pnl5;
    JButton btn1, btn2, btn3, btn4, btn5;
    ImageIcon icon  = new ImageIcon("src\\Chess\\Abstract-Green-HD-Wallpaper.jpg");
    ImageIcon icon1 = new ImageIcon("src\\Chess\\facebook-icon.gif");
    ImageIcon icon2 = new ImageIcon("src\\Chess\\google-maps-2014.png");
    ImageIcon icon3 = new ImageIcon("src\\Chess\\PokemonGO.jpeg");
    ImageIcon icon4 = new ImageIcon("src\\Chess\\yahoo-icon.png");
    ImageIcon icon5 = new ImageIcon("src\\Chess\\Canvas.jpeg");
    
    public Admin2()
    {
        super ("Admin");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setLayout(new BorderLayout());
        setSize(1250, 750);
        setResizable(false);
        setVisible(true);
    }
    
    public void build()
    {
        lbl = new JLabel(icon);
        setContentPane(lbl);
        
        lbl = new JLabel("MP Enrolment System");
        lbl.setFont(new Font("Verdana", Font.ITALIC, 70));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(0, 0, 1000, 100);
        add(lbl);
        
        btn1 = new JButton(icon1);
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(true);
        btn1.setBounds(0, 100, 100, 100);
        add(btn1);
        btn1.addActionListener(this);
        
        lbl = new JLabel("Register Student Account");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(125, 100, 1000, 125);
        add(lbl);
        
        btn2 = new JButton(icon2);
        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(true);
        btn2.setBounds(0, 225, 100, 100);
        add(btn2);
        btn2.addActionListener(this);
        
        lbl = new JLabel("Edit Student Account");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(125, 225, 1000, 125);
        add(lbl);
        
        btn3 = new JButton(icon3);
        btn3.setOpaque(false);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(true);
        btn3.setBounds(0, 350, 100, 100);
        add(btn3);
        btn3.addActionListener(this);
        
        lbl = new JLabel("Add Course");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(125, 350, 1000, 125);
        add(lbl);
        
        btn4 = new JButton(icon4);
        btn4.setOpaque(false);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(true);
        btn4.setBounds(0, 475, 100, 100);
        add(btn4);
        btn4.addActionListener(this);
        
        lbl = new JLabel("Open Section");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(125, 475, 1000, 125);
        add(lbl);
        
        btn5 = new JButton(icon5);
        btn5.setOpaque(false);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(true);
        btn5.setBounds(0, 600, 100, 100);
        add(btn5);
        btn5.addActionListener(this);
        
        lbl = new JLabel("View Class List");
        lbl.setFont(new Font("Verdana", Font.BOLD, 20));
        lbl.setForeground(Color.WHITE);
        lbl.setBounds(125, 600, 1000, 125);
        add(lbl);
        
        pnl1 = initpnl1();
        pnl2 = initpnl2();
        pnl3 = initpnl3();
        pnl4 = initpnl4();
        pnl5 = initpnl5();
        
        pnl1.setBounds(400, 100, 1000, 800);
        pnl1.setOpaque(false);
        pnl1.setVisible(false);
        add(pnl1);
        
        pnl2.setBounds(400, 100, 1000, 800);
        pnl2.setOpaque(false);
        pnl2.setVisible(false);
        add(pnl2);
        
        pnl3.setBounds(400, 100, 1000, 800);
        pnl3.setOpaque(false);
        pnl3.setVisible(false);
        add(pnl3);
        
        pnl4.setBounds(400, 100, 1000, 800);
        pnl4.setOpaque(false);
        pnl4.setVisible(false);
        add(pnl4);
        
        pnl5.setBounds(400, 100, 1000, 800);
        pnl5.setOpaque(false);
        pnl5.setVisible(false);
        add(pnl5);
    }
    
    public JPanel initpnl1()
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        JTextField tf;
        JPasswordField pf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("REGISTER STUDENT ACCOUNT");
        lbl.setFont(new Font("Serif", Font.BOLD, 30));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 1;
        c.gridy = 0;
        jp.add(lbl, c);
        
        lbl = new JLabel("ID Number");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("Password");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        pf = new JPasswordField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(pf, c);
        
        lbl = new JLabel("Confirm Password");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        pf = new JPasswordField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 4;
        jp.add(pf, c);
        
        lbl = new JLabel("Last Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tf, c);
        
        lbl = new JLabel("First Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 6;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 6;
        jp.add(tf, c);
        
        lbl = new JLabel("Minimum Units");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 7;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 7;
        jp.add(tf, c);
        
        lbl = new JLabel("Maximum Units");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 8;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 8;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.ipadx = 50;
        c.ipady = 30;
        c.gridx = 1;
        c.gridy = 9;
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
        
        lbl = new JLabel("EDIT STUDENT ACCOUNT");
        lbl.setFont(new Font("Serif", Font.BOLD, 30));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 1;
        c.gridy = 0;
        jp.add(lbl, c);
        
        lbl = new JLabel("Enter ID Number");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("New Last Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("New First Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.ipadx = 50;
        c.ipady = 30;
        c.gridx = 1;
        c.gridy = 4;
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
        
        lbl = new JLabel("ADD COURSE");
        lbl.setFont(new Font("Serif", Font.BOLD, 30));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 1;
        c.gridy = 0;
        jp.add(lbl, c);
        
        lbl = new JLabel("Course Code");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("Course Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("Number of Units");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.ipadx = 50;
        c.ipady = 30;
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 4;
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
        
        lbl = new JLabel("OPEN SECTION");
        lbl.setFont(new Font("Serif", Font.BOLD, 30));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.gridx = 1;
        c.gridy = 0;
        jp.add(lbl, c);
        
        lbl = new JLabel("Section Name");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tf, c);
        
        lbl = new JLabel("Faculty");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tf, c);
        
        lbl = new JLabel("Class Schedule");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tf, c);
        
        lbl = new JLabel("Start Time");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 4;
        jp.add(tf, c);
        
        lbl = new JLabel("End Time");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tf, c);
        
        lbl = new JLabel("Capacity");
        lbl.setFont(new Font("Serif", Font.BOLD, 20));
        lbl.setForeground(Color.MAGENTA.brighter());
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 6;
        jp.add(lbl, c);
        
        tf = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 6;
        jp.add(tf, c);
        
        btn = new JButton("Done");
        c.ipadx = 50;
        c.ipady = 30;
        c.gridx = 1;
        c.gridy = 7;
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
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        pnl5.setVisible(false);
        
        switch (((ImageIcon) ((JButton) e.getSource()).getIcon()).getDescription())
        {
            case "src\\Chess\\facebook-icon.gif"    : pnl1.setVisible(true); break;
            case "src\\Chess\\google-maps-2014.png" : pnl2.setVisible(true); break;
            case "src\\Chess\\PokemonGO.jpeg"       : pnl3.setVisible(true); break;
            case "src\\Chess\\yahoo-icon.png"       : pnl4.setVisible(true); break;
            case "src\\Chess\\Canvas.jpeg"          : pnl5.setVisible(true); break;
        }
    }
    
    public static void main(String[] args) {
        Admin2 a = new Admin2();
    }
}
