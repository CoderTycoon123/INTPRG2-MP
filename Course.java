/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11526564
 */
import java.util.ArrayList;

public class Course 
{
    private String name, code;
    private int units;
    private ArrayList<Section> sections;
    
    public Course(String name, String code, int nUnits)
    {
        sections = new ArrayList<>();
        this.name = name;
        this.code = code;
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
