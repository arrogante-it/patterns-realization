package sinko.patterns.builderDONE;

// ��������� � ��� ����������� ������� ��������������, ������� ��������� ��������� ������� ��������.
// ������� ��������� ���������� ������� ��������������� ������� �� ������� ��� ������������ ������,
// ������� ��� ���� ��������� ��������, ���������� �����������.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================================================");
        // � ������ ������ "����������" ��������� ����� PersonBuilder
        // � �������� ���� ������ ����������� ����������� ������� �������� ������� Person

        // ������ ������ ���������, ��� ������ � ��������
        // ������� ����� ����������� ������������ ������ Person
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
