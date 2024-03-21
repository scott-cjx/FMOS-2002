public class User {
    public enum GENDER {
        MALE,
        FEMALE,
        NA
    };
    private GENDER gender = GENDER.NA;
    private int age = -1;
    String name;

    public User() {
    }

    public User(GENDER gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

