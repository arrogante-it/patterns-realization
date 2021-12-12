package sinko.patterns.adapterDONE;

public class Feminist_Girl {
    private String name;
    private int age;
    private String password = "Я хочу равенства!";

    public Feminist_Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
