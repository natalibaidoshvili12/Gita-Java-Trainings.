package january22;

public class User {

    private String name;
    private String lastname;
    private String id;
    private int day;
    private int month;
    private int year;
    private String password;
    private String username;

    public User() {
    }

    public User(String name, String lastname, String id, int day, int month, int year, String password, String username) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
