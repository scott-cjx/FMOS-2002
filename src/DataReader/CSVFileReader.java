package DataReader;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CSVFileReader {
	protected static final String SEPARATOR = ",";
    protected static final String MENUFILE = "menu.csv";
    protected static final String STAFFFILE = "staff_list.csv";

    /** Read the contents of the given file. 
	 * 	First line of csv file is names of the columns.
	*/
  	public static List read(String fileName) throws IOException {
	List data = new ArrayList();
    Scanner scanner = new Scanner(new FileInputStream(fileName));
    try {
		scanner.nextLine();
            while (scanner.hasNextLine()){
				
                data.add(scanner.nextLine());
            }
        }
        finally{
            scanner.close();
        }
        return data;
    }

	public static void write(String fileName, List data) throws IOException  {
		PrintWriter out = new PrintWriter(new FileWriter(fileName));
	
		try {
			for (int i =0; i < data.size() ; i++) {
				  out.println((String)data.get(i));
			}
		}
		finally {
		  out.close();
		}
	  }

public static void main(String[] aArgs)  {/*
    	CSVFileReader txtDB = new CSVFileReader();
    	String filename = "Database/professor.txt" ;    //TO PUT FILE
		try {
			// read file containing Professor records.
			ArrayList al = CSVFileReader.readProfessors(filename) ;
			for (int i = 0 ; i < al.size() ; i++) {
                Professor prof = (Professor)al.get(i);
                System.out.println("Name " + prof.getName() );
                System.out.println("Contact " + prof.getContact() );
			}
			Professor p1 = new Professor("Joseph","jos@ntu.edu.sg",67909999);
			// al is an array list containing Professor objs
			al.add(p1);
			// write Professor record/s to file.
			CSVFileReader.saveProfessors(filename, al);
            }catch (IOException e) {
                System.out.println("IOException > " + e.getMessage());
		}*/
  }
}