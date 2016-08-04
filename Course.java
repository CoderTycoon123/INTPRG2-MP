import java.util.ArrayList;

public class Course 
{
    private String name, 
    			   code;
    private int    units;
    private ArrayList<Section> sections;
    
    public Course(String name, String code, int nUnits)
    {
        sections = new ArrayList<>();
        this.name = name;
        if (code.length() == 7 && code.equals(code.toUpperCase()))
        	this.code = code;
        else
        	System.out.println("invalid course code input.");
        units = nUnits;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public int getUnits()
    {
        return units;
    }
    
    public void addSection(Section sect)
    {
        sections.add(sect);
    }
    
    public ArrayList<Section> getSections()
    {
        return sections;
    }
}
