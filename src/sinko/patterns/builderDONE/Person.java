package sinko.patterns.builderDONE;

public class Person {
    private String name;
    private int age;
    private String proffesion;
    private int id;

    public Person(String name, int age, String proffesion, int id) {
        this.name = name;
        this.age = age;
        this.proffesion = proffesion;
        this.id = id;

        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProffesion() {
        return proffesion;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", proffesion='" + proffesion + '\'' +
                ", id=" + id +
                '}';
    }
}
