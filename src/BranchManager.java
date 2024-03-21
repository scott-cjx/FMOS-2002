/**
 Represents a BranchManager.
 BranchManager manages menu items.
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class BranchManager extends Staff {

//    Staff[] staffs;
//    ^ Technically staff can be accessed via this.branch.getStaffs();

    /**
     * creating a new branch manager instance
     * @param name
     * @param staffType
     * @param branch
     */
    public BranchManager(String name, STAFF_TYPE staffType, Branch branch) {
        super(name, staffType);
        this.setBranch(branch);
    }

    /**
     * displays staff in branch manager's branch
     */
    void displayStaffList() {
//        maybe call it from Branch?
//        but is it all managers in branch handle all the staff OR
//        individual manager to their staff
        this.branch.displayStaffs();
    }

    /**
     * remove a menu item from the branch manager's branch
     * @param menuItem
     * @return is menu item removed from branch listing
     */
    boolean removeMenuItem(MenuItem menuItem) {
        return false;
    }

    /**
     * add a menu item from the branch manager's branch
     * @param menuItem
     * @return is menu item added from branch listing
     */
    boolean addMenuItem(MenuItem menuItem) {
        return false;
    }

    /**
     * edit a menu item from the branch manager's branch
     * @param menuItem
     * @return is menu item edited from branch listing
     */
    boolean editMenuItem(MenuItem menuItem) {
        return false;
    }

}
