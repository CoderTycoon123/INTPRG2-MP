// Lim, Ivana
// Tan, Nigel
package EnrollmentSysMP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;

public class StudentGUIdraft extends JFrame implements ItemListener, ListSelectionListener, ActionListener
{
    ArrayList<JList> lists = new ArrayList<> ();
    JButton btn;
    CardLayout cl, ct;
    JPanel pnls, pnl1, pnl2, pnl3, pnl4, cbpane, main;
    JLabel lbl;
    JComboBox cb;
    String s1, s2, s3, s4, d1, d2, d3, d4;
    JList list, listing;
    String data[] = { "Andrew", "Nigel", "Xtian", "Jeremy", "Alec", "Shirley" };
    String sections[] = {"S15", "S16", "S17" };
    
    public StudentGUIdraft()
    {
        super ("Student");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        build();
        setSize(750, 500);
        setBounds(300,100,750,500);
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
        
        pnl1 = new JPanel(new GridBagLayout());
        pnl1.add(enlistPanel());
        pnl1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Enlist in Section"));
        pnls.add(pnl1, s1);
        
        pnl2 = new JPanel(new GridBagLayout());
        pnl2.add(removeEnlistmentPanel());
        pnl2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Remove Enlistment"));
        pnls.add(pnl2, s2);
        
        pnl3 = new JPanel(new GridBagLayout());
        pnl3.add(enrollPanel());
        pnl3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Enroll"));
        pnls.add(pnl3, s3);
        
        pnl4 = new JPanel(new GridBagLayout());
        pnl4.add(viewEAFPanel());
        pnl4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "View EAF"));
        pnls.add(pnl4, s4);
        
        main = new JPanel(new BorderLayout());
        
        main.add(pnls, BorderLayout.CENTER);
        main.add(cbpane, BorderLayout.WEST);
        
        cb.addItemListener(this);
        main.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Student"));
        
        btn.addActionListener(this);
        add(main);
        
        
    }
    
    public JPanel enlistPanel()
    {
        JPanel main = new JPanel(new BorderLayout());
        JPanel pnl = new JPanel(new GridBagLayout());
        JPanel cbpane = new JPanel();
        JPanel cbpane2 = new JPanel();
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel lbl = new JLabel("Course");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(lbl, c);
        
        JComboBox cb = new JComboBox(data);
        cbpane.add(cb);
        
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(cbpane, c);
        
        lbl = new JLabel("Sections");
        c.gridx = 2;
        c.gridy = 0;
        pnl.add(lbl, c);
        
        JComboBox cb1 = new JComboBox(sections);
        cbpane2.add(cb1);
        
        c.gridx = 3;
        c.gridy = 0;
        pnl.add(cbpane2, c);
        
        String str = "S1\nS2\nS3\nS4\nS5\nS6\nS7\nS8\nS9\nS10\nS11\nS12\nS13\nS14\nS15\nS16\nS17";
        
        JTextArea area = new JTextArea(str);
        area.setFont(new Font("Algerian", Font.PLAIN, 35));
        
        JScrollPane pane = new JScrollPane(area);
        pane.setPreferredSize(new Dimension(250, 100));
        
        main.add(pane);
        main.add(pnl, BorderLayout.NORTH);
        
        return main;
    }
    
    public JPanel removeEnlistmentPanel()
    {
        JPanel pnl = new JPanel();
        String data[] = { "INTPRG2", "ARCH-OS", "FIMODIT", "ITMATH3", "FILDLAR", "FTDANCE", "LOGPROG", "INTPRG1", "ITMATH1", "ITMATH2","TREDONE","SYSTANA", "ANMODEL","DASTAPP" };
        
        list = new JList(data);
        JScrollPane scroll = new JScrollPane(list);
        
        scroll.setPreferredSize(new Dimension(200, 200));
        list.addListSelectionListener(this);
        
        pnl.add(scroll);
        return pnl;
    }
    
    public JPanel enrollPanel()
    {
        JPanel pnl = new JPanel();
        pnl.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("ENROLL!");
        
        btn = new JButton(lbl.getText());
        btn.setFont(new Font("Impact", Font.PLAIN, 20));
        
        pnl.add(btn);
        
        return pnl;
    }
    
    public JPanel viewEAFPanel()
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
        scroll.setPreferredSize(new Dimension(100, 100));
        
        JLabel lbl = new JLabel("OPAQUE");
        scroll.add(lbl);
        
        JPanel jp = new JPanel(new BorderLayout());
        jp.add(scroll);
        
        return jp;
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        switch ((String) e.getItem())
        {
            case "Enlist in Section": cl.show(pnls, s1); break;
            case "Remove Enlistment": cl.show(pnls, s2); break;
            case "Enroll"           : cl.show(pnls, s3); break;
            case "View EAF"         : cl.show(pnls, s4); break;
        }
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
    	if (e.getActionCommand().equals("Enlist!"))
    	{
    		// enlistSection();
    	}
    	
    	else if(e.getActionCommand().equals("Remove Enlistment!"))
    	{
    		
    	}
    	else if (e.getActionCommand().equals("ENROLL!"))
        {
            JOptionPane.showMessageDialog(this, "This will state your eligibility to enroll based on your\nminimum and maximum units.", "Enrolling Capability", JOptionPane.ERROR_MESSAGE);
            System.out.println("This will state your eligibility to enroll based on your minimum and maximum units.");
        }
        else if (e.getActionCommand().equals("View EAF"))
        {
        	
        }
    }
    
    public static void main(String[] args) {
        StudentGUIdraft s = new StudentGUIdraft();
    }
}
