// Lim, Ivana
// Tan, Nigel
package EnrollmentSysMP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminGUIdraft extends JFrame implements ItemListener, ActionListener
{   
    private Admin admin;
    private CardLayout cl;
    private JComboBox cbMenu;
	private JComboBox cbCourses; 
	private JComboBox cbSections;
	private JComboBox cbStudentIDs;
    private JLabel lbl;
    private JPanel pnls, cbpanel, pnl1, pnl2, pnl3, pnl4, pnl5, main, cbpane;
    private String s1, s2, s3, s4, s5;
    private JTextField tfID,		// register student account text field vars
		    		   tfPW,
		    		   tfLN,
		    		   tfFN,
		    		   tfMin,
		    		   tfMax,
		    		   //tfEditID,	// edit student account vars
		    		   tfEditLN,
		    		   tfEditFN,
		    		   tfCourseCode,// add course vars
		    		   tfCouseName,
		    		   tfCourseUnits,
		    		   tfSectionName,	// open Section vars
		    		   tfFaculty,
		    		   tfDay,
		    		   tfStartTime,
		    		   tfEndTime,
		    		   tfCapacity;	
    private JButton btn,	// register student
    				btnRegister,
    				btnEdit,
    				btnAddCourse,
    				btnOpenSec;
    //ImageIcon icon = new ImageIcon("C:\\Users\\nigel marcus\\Documents\\NetBeansProjects\\INTPRG2\\src\\Chess\\2-flower-wallpaper.preview.jpg");
    public AdminGUIdraft(Admin admin)
    {
        super ("Admin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.admin = admin;
        
        
        build();
        setSize(750, 500);
        setBounds(300,100,750,500);
        setVisible(true);
    }
    
    public void build()
    {
        s1 = "Register Student Account";
        s2 = "Edit Student Account";
        s3 = "Add Course";
        s4 = "Open Section";
        s5 = "View Class List";
    
        String[] menu = {s1, s2, s3, s4, s5};
        
        cl = new CardLayout();
        
        cbpanel = new JPanel();
        pnls = new JPanel(cl);
        
        pnl1 = new JPanel(new GridBagLayout());
        pnl1.add(registerStudentAccountPanel());
        pnl1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s1, 0, 0, new Font("Jokerman", Font.BOLD,20), Color.black));
        pnls.add(pnl1, s1);
        
        pnl2 = new JPanel(new GridBagLayout());
        pnl2.add(editStudentAccountPanel());
        pnl2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s2, 0, 0, new Font("Jokerman", Font.BOLD, 20), Color.black));
        pnls.add(pnl2, s2);
        
        pnl3 = new JPanel(new GridBagLayout());
        pnl3.add(addCoursePanel());
        pnl3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s3, 0, 0, new Font("Jokerman", Font.BOLD, 20), Color.black));
        pnls.add(pnl3, s3);
        
        pnl4 = new JPanel(new GridBagLayout());
        pnl4.add(openSectionPanel());
        pnl4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s4, 0, 0, new Font("Jokerman", Font.BOLD, 20), Color.black));
        pnls.add(pnl4, s4);
        
        pnl5 = new JPanel(new GridBagLayout());
        pnl5.add(viewClassListPanel());
        pnl5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), s5, 0, 0, new Font("Jokerman", Font.BOLD, 20), Color.black));
        pnls.add(pnl5, s5);
        
        cbMenu = new JComboBox(menu);
        cbpanel.add(cbMenu);
        
        main = new JPanel(new BorderLayout());
        
        main.add(cbpanel, BorderLayout.WEST);
        main.add(pnls, BorderLayout.CENTER);
        
        cbMenu.addItemListener(this);
        
        main.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Admin Account", 0, 0, new Font("Serif", Font.BOLD, 12), Color.black));
        add(main);
    }
    
    public JPanel registerStudentAccountPanel()	// register student account
    {
        JPanel jp;
        //JButton btn;
        
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("ID Number");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tfID = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tfID, c);
        
        lbl = new JLabel("Password");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tfPW = new JPasswordField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tfPW, c);
        
        lbl = new JLabel("Last Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tfFN = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tfFN, c);
        
        lbl = new JLabel("First Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tfLN = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tfLN, c);
        
        lbl = new JLabel("Minimum Units");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        tfMin = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 4;
        jp.add(tfMin, c);
        
        lbl = new JLabel("Maximum Units");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tfMax = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tfMax, c);
        
        btnRegister = new JButton("Register Student!");
        btnRegister.addActionListener(this);
        c.gridx = 1;
        c.gridy = 6;
        jp.add(btnRegister, c);
        
        return jp;
    }
    
    public JPanel editStudentAccountPanel()	// edit student account
    {
        JPanel pnl;
        JButton btn;
        JLabel lbl;
        //JTextField tf;
        GridBagConstraints c;
        
        pnl = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        /*
        lbl = new JLabel("Enter ID Number");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tfEditID = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tfEditID, c);
        */
        //admin.getVectorStudents()
        
        String [] IDnos = new String [admin.getAllStudents().size()];
        int i;
        for (i = 0; i < IDnos.length; i ++)
        {
            IDnos [i] = admin.getAllStudents().get(i).getID();
        }
        
        cbStudentIDs = new JComboBox(IDnos);
        //cbStudentIDs.addActionListener(this);
        cbpane = new JPanel();
        cbpane.add(cbStudentIDs);
        cbpane.setOpaque(false);
        cbStudentIDs.setPreferredSize(new Dimension(150, 35));
        cbStudentIDs.addActionListener(this);
        
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(cbpane, c);
        
        lbl = new JLabel("New Last Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(lbl, c);
        
        tfEditLN = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(tfEditLN, c);
        
        lbl = new JLabel("New First Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        pnl.add(lbl, c);
        
        tfEditFN = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        pnl.add(tfEditFN, c);
        
        btnEdit = new JButton("Edit Student Account!");
        btnEdit.addActionListener(this);
        c.gridx = 1;
        c.gridy = 3;
        pnl.add(btnEdit, c);
        
        return pnl;
    }
    
    public JPanel addCoursePanel()	// add course
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        //JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("Course Code");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        tfCourseCode = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        jp.add(tfCourseCode, c);
        
        lbl = new JLabel("Course Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tfCouseName = new JTextField(25);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tfCouseName, c);
        
        lbl = new JLabel("Number of Units");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tfCourseUnits = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tfCourseUnits, c);
        
        btnAddCourse = new JButton("Add Course!");
        btnAddCourse.addActionListener(this);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(btnAddCourse, c);
        
        return jp;
    }
    
    public JPanel openSectionPanel()	// open section
    {
        JPanel jp;
        JButton btn;
        JLabel lbl;
        //JTextField tf;
        GridBagConstraints c;
        
        jp = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        
        lbl = new JLabel("Course");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 0;
        jp.add(lbl, c);
        
        cbCourses = new JComboBox(admin.getVectorCourses());
        cbCourses.addActionListener(this);
        cbpane = new JPanel();
        cbpane.add(cbCourses);
        cbpane.setOpaque(false);
        cbCourses.setPreferredSize(new Dimension(150, 35));
        
        c.gridx = 1;
        c.gridy = 0;
        jp.add(cbpane, c);
        
        lbl = new JLabel("Section Name");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        jp.add(lbl, c);
        
        tfSectionName = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 1;
        jp.add(tfSectionName, c);
        
        lbl = new JLabel("Faculty");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 2;
        jp.add(lbl, c);
        
        tfFaculty = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 2;
        jp.add(tfFaculty, c);
        
        lbl = new JLabel("Class Schedule");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 3;
        jp.add(lbl, c);
        
        tfDay = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 3;
        jp.add(tfDay, c);
        
        lbl = new JLabel("Start Time");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 4;
        jp.add(lbl, c);
        
        tfStartTime = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 4;
        jp.add(tfStartTime, c);
        
        lbl = new JLabel("End Time");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 5;
        jp.add(lbl, c);
        
        tfEndTime = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 5;
        jp.add(tfEndTime, c);
        
        lbl = new JLabel("Capacity");
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 0;
        c.gridy = 6;
        jp.add(lbl, c);
        
        tfCapacity = new JTextField(15);
        c.insets = new Insets(10, 10, 0, 0);
        c.gridx = 1;
        c.gridy = 6;
        jp.add(tfCapacity, c);
        
        btnOpenSec = new JButton("Open Section!");
        btnOpenSec.addActionListener(this);
        c.gridx = 1;
        c.gridy = 7;
        jp.add(btnOpenSec, c);
        
        return jp;
    }
    
    public JPanel viewClassListPanel()	// view class list still NOT done
    {
        JPanel outer = new JPanel();
    	JPanel pnl = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel lbl = new JLabel("Course");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(lbl, c);
        
        cbCourses = new JComboBox(admin.getVectorCourses());
        cbCourses.addActionListener(this);
        c.gridx = 1;
        c.gridy = 0;
        cbCourses.setPreferredSize(new Dimension(150, 25));
        cbpane = new JPanel();
        cbpane.add(cbCourses);
        cbpane.setOpaque(false);
        pnl.add(cbpane);
        
        lbl = new JLabel("Section");
        c.gridx = 2;
        c.gridy = 0;
        pnl.add(lbl, c);
        
        Course cse = (Course) cbCourses.getSelectedItem();
        cbSections = new JComboBox(/*cse.getVectorSections()*/);
        cbSections.addActionListener(this);
        c.gridx = 3;
        c.gridy = 0;
        cbSections.setPreferredSize(new Dimension(150, 25));
        cbpane = new JPanel();
        cbpane.add(cbSections);
        pnl.add(cbpane,c);
        
       
       /* 
        JTextArea area = new JTextArea();
        area.setFont(new Font("Arial", Font.PLAIN, 12));
        
        JScrollPane pane = new JScrollPane(area);
        pane.setPreferredSize(new Dimension(250, 100));
        outer.add(pane);*/
        outer.add(pnl,BorderLayout.WEST);
        
        return outer;
        
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
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getActionCommand().equals(btnRegister.getText()))
    	{
    		double minUnits = Double.parseDouble(tfMin.getText());
    		double maxUnits = Double.parseDouble(tfMax.getText());
    		admin.registerStudent(tfID.getText(), tfPW.getText(), tfLN.getText(), tfFN.getText(), minUnits, maxUnits);
    		//JOptionPane.showMessageDialog(null, "Unsuccessful Registration.");
    		
    	}
    	
    	else if(e.getActionCommand().equals(btnEdit.getText()))
    	{
    		String s = cbStudentIDs.getSelectedItem().toString();
    		admin.editStudent(s, tfEditLN.getText(), tfEditFN.getText());
    	}
    	
    	else if(e.getActionCommand().equals("Add Course!"))
    	{
    		double courseUnits = Double.parseDouble(tfCourseUnits.getText());
    		admin.addCourse(tfCourseCode.getText(), tfCouseName.getText(), courseUnits);
    	}
    	
    	else if(e.getActionCommand().equals(btnOpenSec.getText()))
    	{
    		Course c = (Course) cbCourses.getSelectedItem();
    		int startTime = Integer.parseInt(tfStartTime.getText());
    		int endTime = Integer.parseInt(tfEndTime.getText());
    		int nCapacity = Integer.parseInt(tfCapacity.getText());
    		admin.openSection(c, tfSectionName.getText(), tfFaculty.getText(), tfDay.getText(), startTime, endTime, nCapacity);
    	}
    	
    	else if (e.getActionCommand().equals("View Class List"))
    	{
    		
    	}
    }
    
   
    public static void main(String[] args)
    {
        Admin admin = new Admin();
    	AdminGUIdraft app = new AdminGUIdraft(admin);
    	
    }
}
