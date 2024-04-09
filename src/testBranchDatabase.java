import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import DataReader.*;

public class testBranchDatabase {

    public static void main(String[] aArgs)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Beginning Program");
        System.out.println("[1] Reading All Branch Data");
        System.out.println("");

        // Read branch database using BranchListDB class, returning an array list of the text file.
        ArrayList<BranchData> al;
        try{
            al = BranchListDB.readAllBranch();

            // Iterate and print thru entire array list
            for(int i=0; i<al.size(); i++)
            {
                BranchData branch = (BranchData) al.get(i);
                
                System.out.println("Branch Number: " + i);
                // System.out.println("branchID: " + branch.get);
                System.out.println("name: " + branch.getName());
                System.out.println("location: " + branch.location);
                System.out.println("staffQuota: " + branch.staffQuota);
                System.out.println();
            }
        } catch (IOException e){
            System.out.println("IOException > " + e.getMessage());
        }
        





        sc.close();
    }

}
