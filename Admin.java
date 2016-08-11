package EnrollmentSysMP;

import java.util.ArrayList;
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
	
	// other methods
	public void registerStudent(String ID, String pw, String LN, String FN, double minUnits, double maxUnits)
	{
		if (allStudents.size() == 0)
		{
			allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits));
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
				allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits));
			else
				System.out.println("The student already is in the list.");
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
			System.out.println("Successful!");
		else
			System.out.println("could not find student with ID no."+ID+".");
	}
	
	public void addCourse(String code, String name, double nUnits)
	{
		if (code.length() == 7 && code.equals(code.toUpperCase()))
		{	int i;
			boolean check = true;
			for(i = 0; i < courses.size(); i++)
			{
				if (courses.get(i).getCode().equals(name))
					check = false;
			}
			if(check)
        		courses.add(new Course( code,  name,  nUnits));
			else
				System.out.println("The course code already exists.");
		}
		else
        	System.out.println("invalid course code input.");
	}
	
	public void openSection(String courseName,String name, String faculty, String schedule, 
            int startTime, int endTime, int nCapacity)
	{
		//if(SecName.matches([A-Z],[]))		// to be edited
		int i;
		for(i = 0; i < courses.size(); i++)
		{
			if(courses.get(i).getCode().equals(courseName))
			{
				courses.get(i).addSection(new Section(  name,  faculty,  schedule, 
			             startTime,  endTime,  nCapacity));
			}
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
						int k;
						for(k = 0; k < s.getStudents().size(); j++)
						{
							System.out.println("List of students enrolled: "+s.getStudents().size());
							System.out.println("Total number of slots: "+ s.getCapacity());
							System.out.println("number of slots remaining: "+(s.getCapacity() - s.getStudents().size()));
						}
					}
					
				}
			}
			
		}
	}
}
