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
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.BevelBorder;
import sun.audio.*;

public class LoginPage extends JFrame implements ActionListener
{
    Admin2 app;
    JPanel pnl, jp, pane;
    JTextField username;
    JPasswordField password;
    JLabel lbl, lbl1, lbl2;
    ImageIcon icon = new ImageIcon("src/Chess/_yin_yang___zekrom_and_reshiram_by_hibiyoruchihiyro-d56hr85.png");
    JButton butn, btn;
    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints d = new GridBagConstraints();
    String ko, ok;
    
    public LoginPage()
    {
        super ("Ivacus.sys");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(1250, 750);
        setResizable(false);
        setVisible(true);
    }
    
    public void build()
    {
        pnl = new JPanel(new GridBagLayout());
        jp = new JPanel(new GridBagLayout());
        pane = new JPanel();
        
        JTextArea area = new JTextArea();
        pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), ""));
        
        String str = "MEMO NO......: 2016\n"
                + "TO....................: SHIRLEY CHU\n"
                + "FROM..............: NIGEL TAN, IVANA LIM\n"
                + "SUBJECT........: INTPRG2\n"
                + "COURSE DESCRIPTION: INTRODUCTION TO PROGRAMMING 2";
        area.setText(str);
        
        Font font = new Font("Serif", Font.BOLD, 15);
        area.setFont(font);
        
        pane.setBackground(Color.GREEN);
        area.setOpaque(false);
        area.setEditable(false);
        
        pane.add(area);
        d.gridx = 0;
        d.gridy = 0;
        pnl.add(pane, d);
        
        butn = new JButton(icon);
        //btn.setOpaque(false);
        butn.setContentAreaFilled(false);
        butn.setBorderPainted(false);
        c.insets = new Insets(20, 20, 0, 20);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(butn, c);
        butn.addActionListener(this);
        
        JPanel forlbl = new JPanel();
        lbl = new JLabel("ADMIN:XXXXX PASSWORD:XXXX            STUDENT:XXXXXXXX PASSWORD:X");
        c.gridx = 0;
        c.gridy = 2;
        forlbl.add(lbl);
        forlbl.setBackground(Color.GREEN.darker());
        jp.add(forlbl, c);
        
        jp.setBackground(Color.WHITE);
        
        
        lbl1 = new JLabel("USERNAME");
        lbl1.setHorizontalAlignment(JLabel.RIGHT);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl1, c);
        
        username = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 4;
        jp.add(username, c);
        
        lbl2 = new JLabel("PASSWORD");
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl2, c);
        
        password = new JPasswordField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 6;
        jp.add(password, c);
        
        btn = new JButton("LOGIN");
        btn.addActionListener(this);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 7;
        jp.add(btn, c);
        
        jp.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        pnl.setBackground(Color.GREEN);
        
        d.gridx = 0;
        d.gridy = 1;
        d.insets = new Insets(20, 20, 0, 20);
        pnl.add(jp, d);
        add(pnl);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("LOGIN") && 
                (ko = username.getText()).equals("admin") &&
                (ok = password.getText()).equals("DLSU"))
        {
            btn = (JButton) e.getSource();
            btn.setText("LOGOUT");
            app = new Admin2();
            JLabel lbl = new JLabel("You have successfully logged in");
            c.gridx = 0;
            c.gridy = 1;
            jp.add(lbl, c);
        }
        else if (e.getActionCommand().equals("LOGOUT"))
        {
            app.setVisible(false);
            btn = (JButton) e.getSource();
            btn.setText("LOGIN");
        }
        
        try
        {
            if (((ImageIcon) ((JButton) e.getSource()).getIcon()).getDescription().compareTo(icon.getDescription()) == 0) 
            {
                music();
            } 
        }
        catch (Exception ex) {}
        
    }
    
    public void music() throws Exception
    {
        InputStream file = new FileInputStream("C:\\Users\\nigel marcus\\Music\\Nigel's Folder\\TV_Themes_-_Pokemon.mid");
        AudioStream audio = new AudioStream(file);
        AudioPlayer.player.start(audio);
    }
    
    public static void main(String[] args) 
    {
        LoginPage app = new LoginPage();
    }
}
