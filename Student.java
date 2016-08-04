package EnrollmentSysMP;

import java.util.ArrayList;

public class Student
{
	private String usrIDno,
				   password,
				   firstName,
				   lastName;
	private int    minUnits,
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
		ArrayList<Course> enlistedCourses = new ArrayList<>();
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
	public void enlistSection(Section section) // still lacks checking of schedule conflicts
	{
		if (isEnrolled == false && section.getCapacity() != section.getStudents().size())
		{
			boolean check = true;
			int i;
			for(i = 0; i < enlistedCourses.size(); i++)
			{
				if (section.getCourse().getCode().equalsIgnoreCase(enlistedCourses.get(i).getCode()))
					check = false;
			}
			if(check)
			{
				enlistedCourses.add(section.getCourse());
				section.addStudent(this);
			}
				
		}
		else
			System.out.println("Student is already enrolled or the section is closed.");
	}
	
	public Course removeEnlistment(Course course)
	{
		if (isEnrolled == false)
		{
			int i;
			for(i = 0; i < enlistedCourses.size(); i++)
			{
				if(course.getCode().equals(enlistedCourses.get(i).getCode()))
					return enlistedCourses.remove(i);
			}
		}
		return null;
	}
	
	public void enroll()
	{
		int totalUnits =0;
		int i;
		for(i = 0; i < enlistedCourses.size(); i++)
		{
			totalUnits += enlistedCourses.get(i).getUnits();
		}
		if (totalUnits >= this.minUnits && totalUnits <= this.maxUnits)
			isEnrolled = true;
	}
	public void viewEAF()
	{
		
	}

}
