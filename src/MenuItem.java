public class MenuItem {
    public enum CATEGORIES {
        SIDE,
        DRINK,
        SET_MEAL,
        NA
    }

    public enum AVAILABILITY {
        AVAILABLE,
        NOT_AVAILABLE,
        NA
    };
    private float price;
    private AVAILABILITY availability;
    private String description;
    private CATEGORIES category;

    public MenuItem(float price, AVAILABILITY availability) {
        this.price = price;
        this.availability = availability;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public AVAILABILITY getAvailability() {
        return availability;
    }

    public void setAvailability(AVAILABILITY availability) {
        this.availability = availability;
    }
}
