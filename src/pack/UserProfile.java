package pack;

public class UserProfile {
    private static int idCounter;
    private String name;
    private String surname;
    private int age;
    private boolean activated;
    private int userIdInSession;

    public UserProfile() {
    }

    public UserProfile(String name, String surname, int age) {
        userIdInSession=idCounter++;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public UserProfile(String name, String surname, int age, boolean activated) {
        this(name, surname, age);
        this.activated = activated;
    }

    public void setName(String name) {
        if (name==null)this.name="";
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname==null)this.surname="";
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age<0)this.age=0;
        this.age = age;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isActivated() {
        return activated;
    }
}
