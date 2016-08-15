// Lim, Ivana
// Tan, Nigel
package EnrollmentSysMP;

import java.util.ArrayList;

public class EnrollmentSysTest 
{
	public static void main(String [] args)
	{
		Admin admin = new Admin();
		System.out.println();
		// addCourse Test WORKING (with name checking ex, intprg2 vs INTPRG2)
		admin.addCourse("INTPRG2", "java oop", 3);
		admin.addCourse("ARCHORG", "assembly", 3);
		
		Course intprg2 = admin.getCourses().get(0);
		Course archos = admin.getCourses().get(1);

		// openSection test WORKING (with name checking ex, s17 vs S17)
		admin.openSection(intprg2, "S15", "ms shirley", "TH", 1100, 1230, 20);
		admin.openSection(intprg2, "S16", "ms shirley", "TH", 915, 1045, 20);
		admin.openSection(archos, "S15", "sir roger", "TH", 1100, 1230, 20);
		admin.openSection(archos, "S16", "sir roger", "TH", 915, 1045, 20);
		
		System.out.println("after add course and open Section");
		
		System.out.println("INTPRG2 sections: ");
		for (Section s : intprg2.getSections())
		{
			System.out.println(s.getName());
		}
		System.out.println("ARCHORG sections: ");
		for (Section s : archos.getSections())
		{
			System.out.println(s.getName());
		}
		
		Section s15 = intprg2.getSections().get(0);
		Section s16 = intprg2.getSections().get(1);
		Section S15 = archos.getSections().get(0);
		Section S16 = archos.getSections().get(1);
		
		//registerStudent test WORKING
		admin.registerStudent("11407530", "lalala", "Lim", "IVana", 12, 18);
		admin.registerStudent("11500000", "lalala", "Tan", "Nigel", 12, 18);
		admin.registerStudent("11500001", "lalala", "Inoue", "Yuta", 12, 18);
		
		Student ivy = admin.getAllStudents().get(0);
		Student nigel = admin.getAllStudents().get(1);
		Student yuta = admin.getAllStudents().get(2);

		//enlist Section WORKING 
		ivy.enlistSection(s15);
		ivy.enlistSection(S15);
		nigel.enlistSection(s15);
		yuta.enlistSection(s16);
		System.out.println("after enlisting in intprg2");
		
		ArrayList <Section> ivySections = ivy.getEnlistedSections();
		ivySections = ivy.getEnlistedSections();
		System.out.println("\nenlisted courses");
		for (Section c : ivySections)
		{
			System.out.println(c.getCourse().getCode());
		}
		
		// schedule check NOT working
		ivy.enlistSection(S15);
		System.out.println("after enlisting ARCHOS S15");
		
		// duplicate courses WORKING
		//ivy.enlistSection(S16);
		//System.out.println("after enlisting ARCHOS S16");
		
		ivySections = ivy.getEnlistedSections();
		System.out.println("\nenlisted courses");
		for (Section c : ivySections)
		{
			System.out.println(c.getCourse().getCode());
		}
		
		// remove enlistment WORKING
		System.out.println("\nremove enlistment test");
		System.out.println(ivy.removeEnlistment(intprg2).getCourse().getCode());
		ivySections = ivy.getEnlistedSections();
		System.out.println("\nenlisted courses");
		for (Section c : ivySections)
		{
			System.out.println(c.getCourse().getCode());
		}
		
		// enroll test
		ivy.enroll();
		ivy.enlistSection(S16);
		
		// viewClass list WORKING
		admin.viewClassList(intprg2, intprg2.getSections().get(0));
		
		// editStudent WORKING
		admin.editStudent("11407530", "Uy", "IVY");
		System.out.println(ivy.getFN() + " " + ivy.getLN());
		
		
	}
}
