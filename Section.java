package EnrollmentSysMP;
import java.util.ArrayList;

public class Section 
{
    private String name, 
    			   faculty, 
    			   schedule;
    private int    startTime, 
    			   endTime, 
    			   capacity;
    private Course course;
    private ArrayList<Student> students;
    
    // constructor
    public Section(String name, String faculty, String schedule, 
            int startTime, int endTime, int nCapacity)
    {
        students = new ArrayList<>();
        this.name = name;
        this.faculty = faculty;
        this.schedule = schedule;
        this.startTime = startTime;
        this.endTime = endTime;
        capacity = nCapacity;
    }
    
    // getters
    public String getName()
    {
        return name;
    }
    
    public String getFaculty()
    {
        return faculty;
    }
    
    public String getSchedule()
    {
        return schedule;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
    
    public int getEndTime()
    {
        return endTime;
    }
    public int getCapacity()
    {
    	return capacity;
    }
    public Course getCourse()
    {
    	return course;
    }
    
    // other methods
    public void addStudent(Student student)
    {
    	boolean check = true;
    	if (students == null)
        {
        	students.add(student);
        }
        else
        {	
        	int i;
            for(i = 0; i < students.size(); i++)
            {
            	if (student.getID().equals(students.get(i).getID()))
            		check = false;
            }
        	if(check)
        		students.add(student);
        	else
        		System.out.println("sutdent is already enlisted in this section.");
        }
    	
    }
    
    public Student removeStudent(Student student)
    {
        int i = 0;
        Student s = null;
        
        while (i < students.size() && !students.get(i).getID().equals(student.getID()))
        {
            i ++;
        }
        
        if (i < students.size())
        {
            s = students.remove(i);
        }
        
        return s;
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
}
