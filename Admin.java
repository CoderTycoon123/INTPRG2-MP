import java.util.ArrayList;
public class Admin
{
	
	private ArrayList<Student> allStudents;
	
	public void registerStudent(String ID, String pw, String LN, String FN, int minUnits, int maxUnits)
	{
		if (allStudents == null)
		{
			allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits);
		}
		int i;
		boolean check = true;
		for(i = 0; i < allStudents.size(), i++)
		{
			if (allStudents.get(i).getID().equals(ID))
				check = false;
		}
		if (check)
			allStudents.add(new Student(ID, pw, LN, FN, minUnits, maxUnits);
	}
}