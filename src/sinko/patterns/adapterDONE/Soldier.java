package sinko.patterns.adapterDONE;

public class Soldier {
    private String name;
    private int age;
    private String password = "Я хочу Служить!";

    public Soldier(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Soldier(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getPasswordWords() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
