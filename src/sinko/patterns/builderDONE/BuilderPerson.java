package sinko.patterns.builderDONE;

public class BuilderPerson implements Builder{
    private String name;
    private int age;
    private String proffesion;
    private int id;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Person getProperties(){
        return new Person(name, age, proffesion, id);
    }
}
