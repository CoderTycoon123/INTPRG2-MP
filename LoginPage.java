/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSysMP;

/**
 *
 * @author Dell Inspiron 15
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener
{
    JPanel pnl;
    JTextField username, password;
    JLabel lbl1, lbl2, lbl3;
    ImageIcon icon = new ImageIcon("src/Chess/the_pokeball_of_mewtwo_by_jonathanjo-d4rpxw6.jpg");
    JButton btn;
    GridBagConstraints c = new GridBagConstraints();
    String ko, ok;
    
    public LoginPage()
    {
        super ("Ivacus.sys");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(500, 200);
        setResizable(false);
        setVisible(true);
    }
    
    public void build()
    {
        pnl = new JPanel(new GridBagLayout());
        
        lbl1 = new JLabel("ID Number    ");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(lbl1, c);
        
        username = new JTextField(15);
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(username, c);
        
        lbl2 = new JLabel("Password     ");
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(lbl2, c);
        
        password = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(password, c);
        
        lbl3 = new JLabel(icon);
        c.gridx = 2;
        c.gridy = 0;
        pnl.add(lbl3, c);
        
        btn = new JButton("Sign in");
        btn.addActionListener(this);
        c.gridx = 2;
        c.gridy = 2;
        pnl.add(btn, c);
        
        pnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Login Page", 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        add(pnl);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Sign in"))
        {
            ko = username.getText();
            ok = password.getText();
            if (ko.equals("admin") && ok.equals("DLSU"))
            {
                Admin app = new Admin();
            }
        }
    }
    
    public static void main(String[] args) {
        LoginPage app = new LoginPage();
    }
}
