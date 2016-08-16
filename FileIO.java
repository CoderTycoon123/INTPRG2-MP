package EnrollmentSysMP;
import java.io.*;
import java.util.Scanner;
public class FileIO 
{
/*	public static void main(String[] args)
	{
		File StudentAccountsFile = new File("Z:\\CODE REPOSITORY\\INTPRG2\\src\\EnrollmentSysMP\\StudentAccountsFile.txt");
		BufferedWriter bw;
		BufferedReader br;
		String line;
		
		try
		{
			bw = new BufferedWriter (new FileWriter(StudentAccountsFile));
			bw.write ("Hello");
			bw.newLine ();
			bw.write ("World");
			bw.write (49);
			bw.newLine ();
			
			bw.close ();

			br = new BufferedReader (new FileReader (StudentAccountsFile));
			while ((line = br.readLine ()) != null)
				//if (line.substring (0, line.indexOf("=")).equals ("CODE"))
					System.out.println (line.substring (line.indexOf ("=") + 1));
			br.close ();
			/*
			Scanner sc = new Scanner (StudentAccountsFile);
			System.out.println (sc.nextInt ());
			System.out.println (Double.parseDouble (sc.nextLine ()));
			System.out.println (sc.nextLine ());
			System.out.println (sc.nextLine ());
			System.out.println (sc.nextLine ());
			System.out.println (sc.nextLine ());
			System.out.println (sc.nextLine ());
			System.out.println (sc.nextLine ());
			sc.close ();
			*/
			
/*		}
		catch (Exception e)
		{
			System.out.println ("(Files2: main) " + e.toString ());
		}
	}*/
}
