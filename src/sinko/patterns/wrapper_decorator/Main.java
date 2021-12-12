package sinko.patterns.wrapper_decorator;

// Декоратор — это структурный паттерн,
// который позволяет добавлять объектам новые поведения на лету,
// помещая их в объекты-обёртки.
//
// by Alexandr Sinko

public class Main {

    public static void main(String[] args) {

        Man man = new Man("Man");

        SuperMan superMan = new SuperMan(man);

        System.out.println("Характеристики Простого Мужика:");
        printManProperties(man);

        System.out.println();

        System.out.println("Характеристики Супер Мужика:");
        printManProperties(superMan);

    }

    public static void printManProperties(Man man){
        System.out.println(man.getName());
        System.out.println("сила " + man.getPower());
        System.out.println("скорость " + man.getSpeed());
    }
}
