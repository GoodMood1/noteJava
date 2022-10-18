package pack;

import java.util.Objects;

public class UserAccaunt {
    public static final int NOTSPECIFIED_GENDER = 0;
    public static final int MALE_GENDER = 1;
    public static final int FEMALE_GENDER = 2;
    //
    private static int idCount;
    //
    private final int id;
    private String login;
    private String pass;
    private int age;
    private int gender;
    private boolean activated;

    public UserAccaunt(String login, String pass) {
        id = idCount;
        this.login = login;
        this.pass = pass;
    }

    public UserAccaunt(String login, String pass, int age) {
        this(login, pass);
        this.age = age;
    }

    public UserAccaunt(String login, String pass, int age, int gender) {
        this(login, pass, age);
        this.gender = gender;
    }

    public UserAccaunt(String login, String pass, int age, int gender, boolean activated) {
        this(login, pass, age, gender);
        this.activated = activated;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccaunt)) return false;
        UserAccaunt that = (UserAccaunt) o;
        return id == that.id && getAge() == that.getAge() && getGender() == that.getGender() && isActivated() == that.isActivated() && getLogin().equals(that.getLogin()) && getPass().equals(that.getPass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getLogin(), getPass(), getAge(), getGender(), isActivated());
    }

    @Override
    public String toString() {
        return "UserAccaunt{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", activated=" + activated +
                '}';
    }
}
