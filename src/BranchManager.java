public class BranchManager extends Staff {
    Branch branch;
//    Staff[] staffs;
//    ^ Technically staff can be accessed via this.branch.getStaffs();


    public BranchManager(String name, STAFF_TYPE staffType, Branch branch) {
        super(name, staffType);
        this.branch = branch;
    }

    void displayStaffList() {
//        maybe call it from Branch?
//        but is it all managers in branch handle all the staff OR
//        individual manager to their staff
        this.branch.displayStaffs();
    }

    boolean removeMenuItem(MenuItem menuItem) {
        return false;
    }

    boolean addMenuItem(MenuItem menuItem) {
        return false;
    }

    boolean editMenuItem(MenuItem menuItem) {
        return false;
    }

}
