// Lim, Ivana
// Tan, Nigel
package EnrollmentSysMP;

import java.util.ArrayList;
import java.util.Vector;
public class Admin
{
	
	private String usrName,
				   password;
	private ArrayList<Course> courses;
	private ArrayList<Student> allStudents;
	
	// constructor
	public Admin()
	{
		usrName = "admin";
		password = "DLSU";
		courses = new ArrayList<>();
		allStudents = new ArrayList<>();
	}
	// getters
	public ArrayList<Course> getCourses()
	{
		return courses;
	}
	public ArrayList<Student> getAllStudents()
	{
		return allStudents;
	}
	
	public Vector getVectorCourses()
	{
		return new Vector(courses);
	}
	
	public Vector getVectorStudents()
	{
		return new Vector(allStudents);
	}
	// other methods
	public void registerStudent(String ID, String pw, String LN, String FN, double minUnits, double maxUnits)
	{
		if(!ID.matches("[0-9]{8}"))
		{
			InfoDialog info = new InfoDialog ("Register Student","ID number should only have 8 digits");
		}
		if(minUnits > 0 && maxUnits > 0 && minUnits <= maxUnits)
		{
			if (allStudents.size() == 0)
			{
				allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits));
				InfoDialog info = new InfoDialog("Register Student","Successful Registration!");
			}
			else
			{
				int i;
				boolean check = true;
				for(i = 0; i < allStudents.size(); i++)
				{
					if (allStudents.get(i).getID().equals(ID))
						check = false;
				}
				if (check)
				{
					allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits));
					InfoDialog info = new InfoDialog("Register Student","Successful Registration!");
				}
				else
				{
					InfoDialog info = new InfoDialog ("Register Student","The student is already in the list.");
				}
			}
		}
		else
		{
			InfoDialog info = new InfoDialog ("Register Student","invalid unit inputs");
		}
			
	}
	
	public void editStudent(String ID, String LN, String FN)
	{	boolean check = false;
		int i;
		for(i = 0; i < allStudents.size(); i++)
		{
			if (allStudents.get(i).getID().equalsIgnoreCase(ID))
			{
				allStudents.get(i).setFirstName(FN);
				allStudents.get(i).setLastName(LN);
				check = true;
			}
		}
		if(check)
		{
			InfoDialog info = new InfoDialog ("Edit Student","Successful!");
		}
		else
		{
			InfoDialog info = new InfoDialog ("Edit Student","Could not find student with ID no."+ID+".");
		}
	}
	
	public void addCourse(String code, String name, double nUnits)
	{
		if (code.matches("[A-Z[0-9]]{7}"))
		{	int i;
			boolean check = true;
			for(i = 0; i < courses.size(); i++)
			{
				if (courses.get(i).getCode().equals(code))
				{
					InfoDialog info = new InfoDialog ("Add Course","The course code already exists.");
					check = false;
					return;
				}
			}
			if(check)
			{
				courses.add(new Course( code,  name,  nUnits));
				InfoDialog info = new InfoDialog ("Add Course","Successful! Course Added!");
			}
		}
		else
		{
			InfoDialog info = new InfoDialog ("Add Course","Invalid course code input.");
		}
    }
	
	public void openSection(Course course, String name, String faculty, String schedule, 
            int startTime, int endTime, int nCapacity)
	{
		if(name.matches("[A-Z][0-9]{2}"))
		{
			int i;
			for(i = 0; i < courses.size(); i++)
			{
				if(courses.get(i).getCode().equals(course.getCode()))
				{
					courses.get(i).addSection(new Section(courses.get(i),  name,  faculty,  schedule, 
				             startTime,  endTime,  nCapacity));
					
				}
			}
		}
		else
		{
			InfoDialog info = new InfoDialog ("Add Course","Invalid section format.");
		}
	}
	
	public void viewClassList(Course course, Section section)
	{	
		int i;
		for(i = 0; i < courses.size(); i++)
		{	Course c = courses.get(i);
			String courseCode = c.getCode();
			if(courseCode.equals(course.getCode()))
			{
				int j;
				for(j = 0; j < c.getSections().size(); j++)
				{	Section s = c.getSections().get(j);
					String sectName = c.getSections().get(j).getName();
					if (sectName.equals(section.getName()))
					{
						section.viewEnrolledStudents();
					}
					
				}
			}
			
		}
	}
	
	
}
