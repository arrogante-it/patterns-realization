package sinko.patterns.wrapper_decorator;

// ��������� � ��� ����������� �������,
// ������� ��������� ��������� �������� ����� ��������� �� ����,
// ������� �� � �������-������.
//
// by Alexandr Sinko

public class Main {

    public static void main(String[] args) {

        Man man = new Man("Man");

        SuperMan superMan = new SuperMan(man);

        System.out.println("�������������� �������� ������:");
        printManProperties(man);

        System.out.println();

        System.out.println("�������������� ����� ������:");
        printManProperties(superMan);

    }

    public static void printManProperties(Man man){
        System.out.println(man.getName());
        System.out.println("���� " + man.getPower());
        System.out.println("�������� " + man.getSpeed());
    }
}
