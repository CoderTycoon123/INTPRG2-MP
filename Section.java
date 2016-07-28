import java.util.ArrayList;

public class Section 
{
    private String name, faculty, schedule;
    private int startTime, endTime, capacity;
    private ArrayList<Student> students;
    
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
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public Student removeStudent(String ID)
    {
        int i = 0;
        Student s = null;
        
        while (i < students.size() && !students.get(i).getID().equals(ID))
        {
            i ++;
        }
        
        if (i < students.size())
        {
            s = students.get(i);
        }
        
        return s;
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
}
