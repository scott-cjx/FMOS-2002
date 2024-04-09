package DataReader;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BranchListDB extends CSVFileReader {

	protected static final String filename = "Database/branch_list.csv";

    // an example of reading
	public static ArrayList<BranchData> readAllBranch() throws IOException {

		// read String from text file
		ArrayList stringArray = (ArrayList) read(filename);
		ArrayList alr = new ArrayList();// to store branch data

        for (int i = 0 ; i < stringArray.size() ; i++) {
			String st = (String)stringArray.get(i);
			// get individual 'fields' of the string separated by SEPARATOR
			StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

			/* Extract Tokens */
			String name = star.nextToken().trim(); // first token
			String location = star.nextToken().trim(); // second token
			int staffQuota = Integer.parseInt(star.nextToken().trim());	// third token

			/* Create BranchData object and pass to alr */
			BranchData branchData = new BranchData(name, location, staffQuota);
			alr.add(branchData);
		}

		return alr;
	}

    // an example of saving
    public static void saveBranch(List al) throws IOException {
		List alw = new ArrayList();// to store branch data

		alw.add("Name,Location,Staff Quota");
        for (int i = 0 ; i < al.size() ; i++) {
			BranchData branchData = (BranchData)al.get(i);
			StringBuilder st =  new StringBuilder();
			st.append(branchData.name.trim());
			st.append(SEPARATOR);
			st.append(branchData.location.trim());
			st.append(SEPARATOR);
			st.append(branchData.staffQuota);
			alw.add(st.toString());
		}
		CSVFileReader.write(filename,alw);
	}

	public static void printAllBranch() throws IOException {
		try {
			// read file containing Professor records.
			ArrayList<BranchData> al = BranchListDB.readAllBranch() ;
			for (int i = 0 ; i < al.size() ; i++) {
                BranchData branchData = (BranchData)al.get(i);
                System.out.print("Name: " + branchData.name );
                System.out.print("\tLocation: " + branchData.location );
				System.out.println("\tStaff Quota: " + branchData.staffQuota );
			}
		} catch (IOException e) {
			System.out.println("IOException > " + e.getMessage());
		}
	}

	public static void appendBranch(String name, String location, int staffQuota) throws IOException {
		try {
			// read file containing branch records.
			ArrayList al = BranchListDB.readAllBranch();
			BranchData branchData = new BranchData(name, location, staffQuota);
			// al is an array list containing branch objs
			al.add(branchData);
			// write Branch record/s to file.
			BranchListDB.saveBranch(al);
        } catch (IOException e) {
            System.out.println("IOException > " + e.getMessage());
		}
	}



	public static void main(String[] aArgs)  {
		//BranchListDB txtDB = new BranchListDB();

		try {
			
			ArrayList al = BranchListDB.readAllBranch(); // retrieve list containing Professor records.

			BranchListDB.printAllBranch(); // print all Branch records.

			BranchListDB.appendBranch("newname", "newLocation", 10); // append containing Branch records.
			
        }catch (IOException e) {
            System.out.println("IOException > " + e.getMessage());
		}
	}
}