package sinko.patterns.bridgeDONE;

// Мост — это структурный паттерн,
// который разделяет бизнес-логику или большой класс на несколько отдельных иерархий,
// которые потом можно развивать отдельно друг от друга.
//
// Одна из этих иерархий (абстракция) получит ссылку на объекты другой иерархии (реализация)
// и будет делегировать им основную работу.
// Благодаря тому, что все реализации будут следовать общему интерфейсу,
// их можно будет взаимозаменять внутри абстракции.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) {
        testStudy(new Student());
    }

    public static void testStudy(Study study){
        System.out.println("Учусь с \"Учителем\".");
        Teacher teacher = new Teacher(study);
        teacher.teach();
        study.printInformation();

        System.out.println("Учусь с \"Продвинутым Учителем\".");
        AdvancedTeacher advancedTeacher = new AdvancedTeacher(study);
        advancedTeacher.teach();
        advancedTeacher.teachingBetter();
        study.printInformation();
    }
}
