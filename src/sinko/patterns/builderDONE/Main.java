package sinko.patterns.builderDONE;

// Строитель — это порождающий паттерн проектирования, который позволяет создавать объекты пошагово.
// Паттерн Строитель предлагает вынести конструирование объекта за пределы его собственного класса,
// поручив это дело отдельным объектам, называемым строителями.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================================================");
        // В данном случае "Строителем" выступает класс PersonBuilder
        // у которого есть методы позволяющие настраивать процесс создания объекта Person

        // Создаю объект Строителя, для раблты с методами
        // которые будут настраивать возвращаемый объект Person
        BuilderPerson builderPerson = new BuilderPerson();

        builderPerson.setName("Alexandr");
        builderPerson.setAge(21);

        builderPerson.getProperties();
        System.out.println("===========================================================================");

        builderPerson.setProffesion("java back end developer");
        builderPerson.setId(1);

        builderPerson.getProperties();
        System.out.println("===========================================================================");

        builderPerson.setName("Nikolay");
        builderPerson.setAge(22);
        builderPerson.setId(5);

        builderPerson.getProperties();
        System.out.println("===========================================================================");


    }
}
