package sinko.patterns.prototype;

public class Person  implements Cloneable {

    private String name;
    private int age;
    private String gendre;
    private String proffesion;

    public Person(String name, int age, String gendre, String proffesion) {
        this.name = name;
        this.age = age;
        this.gendre = gendre;
        this.proffesion = proffesion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gendre='" + gendre + '\'' +
                ", proffesion=" + proffesion +
                '}';
    }
}
