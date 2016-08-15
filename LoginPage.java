// Lim, Ivana
// Tan, Nigel
package EnrollmentSysMP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.BevelBorder;

import EnrollmentSysMP.StudentGUI;
import sun.audio.*;

public class LoginPage extends JFrame implements ActionListener
{
    StudentGUI studentApp;
    AdminGUI adminApp;
    Admin admin;
    JPanel pnl, jp, pane;
    JTextField username;
    JPasswordField password;
    JLabel lbl, lbl1, lbl2, lbl3;
    //ImageIcon icon = new ImageIcon("src/Chess/_yin_yang___zekrom_and_reshiram_by_hibiyoruchihiyro-d56hr85.png");
    JButton butn, btn;
    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints d = new GridBagConstraints();
    String ko, ok;
    
    public LoginPage(Admin admin)
    {
        super ("ANIMOSYS 2.0");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(750, 500);
        setBounds(300,100,750,500);
        setVisible(true);
        this.admin = admin;
    }
    
    public void build()
    {
        pnl = new JPanel(new GridBagLayout());
        jp = new JPanel(new GridBagLayout());
        pane = new JPanel();
        
        JTextArea area = new JTextArea();
        pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), ""));
        
        String str = "\t                MEMO NO......: 2016\n"
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
        /*
        //butn = new JButton(icon);
        //btn.setOpaque(false);
        //butn.setContentAreaFilled(false);
        //butn.setBorderPainted(false);
        c.insets = new Insets(20, 20, 0, 20);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(butn, c);
        butn.addActionListener(this);
        */
        JPanel forlbl = new JPanel();
        lbl = new JLabel("ADMIN:XXXXX PASSWORD:XXXX            STUDENT:XXXXXXXX PASSWORD:X");
        c.gridx = 0;
        c.gridy = 1;
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
        
        lbl3 = new JLabel();
        
        JRootPane rp = SwingUtilities.getRootPane(btn);
        rp.setDefaultButton(btn);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("LOGIN") && (username.getText()).equals("admin")) 
        {
        	if (username.getText().equals("admin") && (ok = password.getText()).equals("DLSU"))
			{
				btn = (JButton) e.getSource();
	            btn.setText("LOGOUT");
	            Admin admin = new Admin();
	            adminApp = new AdminGUI(admin);
	            lbl3.setText("You have successfully logged in");
	            c.gridx = 0;
	            c.gridy = 2;
	            jp.add(lbl3, c);
			}
			else
			{
				InfoDialog info = new InfoDialog("AnimoSys 2.0", "Username and Password do not match.");
			}
            
        }
        else if (e.getActionCommand().equals("LOGOUT"))
        {
            adminApp.setVisible(false);
            btn = (JButton) e.getSource();
            btn.setText("LOGIN");
            lbl3.setText("You have successfully logged out");
            c.gridx = 0;
            c.gridy = 2;
            jp.add(lbl3, c);
        }
        else if (e.getActionCommand().equals("LOGIN"))
        {
            String user = username.getText(),
            		pw = password.getText();
            boolean wrongLogin = true;
            for(int i = 0; i < admin.getAllStudents().size(); i++)
            {
            	if(admin.getAllStudents().get(i).getID().equals(user) && admin.getAllStudents().get(i).getPW().equals(pw))
            	{
            		btn = (JButton) e.getSource();
                    btn.setText("LOGOUT");
                    
                    studentApp = new StudentGUI(admin.getAllStudents().get(i),admin);
                    lbl3.setText("You have successfully logged in");
                    c.gridx = 0;
                    c.gridy = 2;
                    jp.add(lbl3, c);
                    wrongLogin = false;
                    i = admin.getAllStudents().size();
            	}
            }
            if(wrongLogin)
            {
            	InfoDialog info = new InfoDialog("AnimoSys 2.0", "Username and Password do not match.");
            }
        	
        }
        else if (e.getActionCommand().equals("LOGOUT"))
        {
            studentApp.setVisible(false);
            btn = (JButton) e.getSource();
            btn.setText("LOGIN");
            lbl3.setText("You have successfully logged out");
            c.gridx = 0;
            c.gridy = 2;
            jp.add(lbl3, c);
        }
       /* 
        try
        {
            if (((ImageIcon) ((JButton) e.getSource()).getIcon()).getDescription().compareTo(icon.getDescription()) == 0) 
            {
                music();
            } 
        }
        catch (Exception ex) {}
        */
    }
    
   /* public void music() throws Exception
    {
        InputStream file = new FileInputStream("C:\\Users\\nigel marcus\\Music\\Nigel's Folder\\TV_Themes_-_Pokemon.mid");
        AudioStream audio = new AudioStream(file);
        AudioPlayer.player.start(audio);
    }*/
    
    public static void main(String[] args) 
    {
        Admin admin = new Admin();
    	LoginPage adminApp = new LoginPage(admin);
        //EnrollmentSysTest oop = new EnrollmentSysTest(); 
    }
}
