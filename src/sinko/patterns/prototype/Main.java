package sinko.patterns.prototype;

// Прототип — это порождающий паттерн,
// который позволяет копировать объекты любой сложности без привязки к их конкретным классам.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Оригинал
        Person personOriginal = new Person(
                "Alexandr",
                21,
                "male",
                "java back end dev"
        );

        // Копия
        Person personClone = (Person) personOriginal.clone();
        personClone.setName("Vasiliy");



        // Вывод оригинала
        System.out.println("Оригинал:");
        System.out.println(personOriginal.toString());
        System.out.println();
        System.out.println();

        System.out.println("Копия:");
        System.out.println("Объект \"Alexandr\" был клонирован," +
                " было изменино имя");

        // Вывод копии
        System.out.println(personClone.toString());

    }
}
