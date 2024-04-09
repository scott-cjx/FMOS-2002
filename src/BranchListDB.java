import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

import DataReader.*;

public class BranchListDB extends CSVFileReader {

	protected static final String filename = "Database/branch_list.csv";

    // an example of reading
	public static ArrayList readBranch() throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
		ArrayList alr = new ArrayList() ;// to store branch data

        for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

				String  name = star.nextToken().trim();	// first token
				String  location = star.nextToken().trim();	// second token
				int  staffQuota = Integer.parseInt(star.nextToken().trim()); // third token
				// create Branch object from file data
				Branch branch = new Branch(name);
				branch.setLocation(location);
				branch.setStaffQuota(staffQuota);
				alr.add(branch) ;
			}
			return alr ;
	}

    // an example of saving
    public static void saveBranch(List al) throws IOException {
		List alw = new ArrayList() ;// to store Professors data

		alw.add("Name,Location,Staff Quota");
        for (int i = 0 ; i < al.size() ; i++) {
				Branch branch = (Branch)al.get(i);
				StringBuilder st =  new StringBuilder() ;
				st.append(branch.getBranchName().trim());
				st.append(SEPARATOR);
				st.append(branch.getLocation().trim());
				st.append(SEPARATOR);
				st.append(branch.getStaffQuota());
				alw.add(st.toString()) ;
			}
			CSVFileReader.write(filename,alw);
	}

	public static void printAllBranch() throws IOException {
		try {
			// read file containing Professor records.
			ArrayList al = BranchListDB.readBranch() ;
			for (int i = 0 ; i < al.size() ; i++) {
                Branch branch = (Branch)al.get(i);
                System.out.print("Name: " + branch.getBranchName() );
                System.out.print("\tLocation: " + branch.getLocation() );
				System.out.println("\tStaff Quota: " + branch.getStaffQuota() );
			}
            }catch (IOException e) {
                System.out.println("IOException > " + e.getMessage());
		}
	}


public static void main(String[] aArgs)  {
		//BranchListDB txtDB = new BranchListDB();

		try {
			// read file containing Professor records.
			BranchListDB.printAllBranch();

			ArrayList al = BranchListDB.readBranch();
			Branch branch = new Branch("newName");
			branch.setLocation("newLocation");
			branch.setStaffQuota(10);
			// al is an array list containing brnach objs
			al.add(branch);
			// write Branch record/s to file.
			BranchListDB.saveBranch(al);
            }catch (IOException e) {
                System.out.println("IOException > " + e.getMessage());
		}
  }
}