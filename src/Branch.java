/**
 Represents a Branch
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class Branch {

    /**
     * list of managers in the branch
     */
    private BranchManager[] managers;

    /**
     * number of managers in the branch
     */
    private int numberManagers = 0;

    /**
     * list of staff in the branch
     */
    private Staff[] staff;

    /**
     * number of staff in the branch
     */
    private int numberStaff = 0;

    /**
     * name of the branch
     */
    private final String branchName;

    /**
     * Create a new branch
     * @param branchName name of branch
     */
    public Branch(String branchName) {
        this.branchName = branchName;
    }

    /**
     * get name of branch
     * @return name of branch
     */
    public String getBranchName() {
        return branchName;
    }

    public Staff[] getStaffs() {
        return this.staff;
    }

    /**
     * prints out the staff in the branch
     */
    void displayStaffs() {

    }

    /**
     * add a staff to the branch
     * @param staff
     * @return is staff added to branch
     */
    public boolean addStaff(Staff staff) {
        this.numberStaff++;
        return false;
    }

    /**
     * remove a staff from the branch
     * @param staff
     * @return is staff removed from branch
     */
    public boolean removeStaff(Staff staff) {
        this.numberStaff--;
        return false;
    }

    /**
     * add a branch manager from branch
     * @param branchManager
     * @return is branch manager added to branch
     */
    public boolean addBranchManager(BranchManager branchManager) {
        this.numberManagers++;
        return false;
    }

    /**
     * remove a branch manager from branch
     * @param branchManager
     * @return is branch manager removed from branch
     */
    public boolean removeBranchManager(BranchManager branchManager) {
        this.numberManagers--;
        return false;
    }

    /**
     * get the quota of managers for the branch
     * @return manager quota
     */
    int getManagerQuota() {
        if (numberStaff < 1) return 0;
        if (numberStaff <= 4) return 1;
        if (numberStaff <= 8) return 2;
        if (numberStaff <= 15) return 3;

        return 0;
    }
}
