package EnrollmentSysMP;

import java.util.ArrayList;

public class Student
{
	private String usrIDno,
				   password,
				   firstName,
				   lastName;
	private int minUnits,
				maxUnits;
	private boolean isEnrolled;
	private ArrayList<Course> enlistedCourses;
	
	// constructors
	public Student(String ID, String PW, String LN, String FN, int minUnits, int maxUnits)
	{
		usrIDno = ID;
		password = PW;
		firstName = FN;
		lastName = LN;
		isEnrolled = false;
		this.minUnits = minUnits;
		this.maxUnits = maxUnits;
	}
	
	// getters
	public String getID()
	{
		return usrIDno;
	}
	
	public String getUsrIDno() 
	{
		return usrIDno;
	}
	
	// setters
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setMaxUnits(int maxUnits) 
	{
		this.maxUnits = maxUnits;
	}
	
	public void setMinUnits(int minUnits) 
	{
		this.minUnits = minUnits;
	}
	
	// other methods
	public void enlistSection(ArrayList<Course> coursesOffered, String course, String section)
	{
		
	}
	
	public Course removeEnlistment(String course)
	{
		return null;
	}
	
	public 

}
