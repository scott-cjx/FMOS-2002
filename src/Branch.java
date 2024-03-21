public class Branch {
    private BranchManager[] managers;
    private int numberManagers = 0;
    private Staff[] staff;
    private int numberStaff = 0;

    private final String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public Staff[] getStaffs() {
        return this.staff;
    }

    void displayStaffs() {

    }

    public boolean addStaff(Staff staff) {
        this.numberStaff++;
        return false;
    }

    public boolean removeStaff(Staff staff) {
        this.numberStaff--;
        return false;
    }

    public boolean addBranchManager(BranchManager branchManager) {
        this.numberManagers++;
        return false;
    }

    public boolean removeBranchManager(BranchManager branchManager) {
        this.numberManagers--;
        return false;
    }

    int getManagerQuota() {
        if (numberStaff < 1) return 0;
        if (numberStaff <= 4) return 1;
        if (numberStaff <= 8) return 2;
        if (numberStaff <= 15) return 3;

        return 0;
    }
}
