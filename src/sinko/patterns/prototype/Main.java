package sinko.patterns.prototype;

// �������� � ��� ����������� �������,
// ������� ��������� ���������� ������� ����� ��������� ��� �������� � �� ���������� �������.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // ��������
        Person personOriginal = new Person(
                "Alexandr",
                21,
                "male",
                "java back end dev"
        );

        // �����
        Person personClone = (Person) personOriginal.clone();
        personClone.setName("Vasiliy");



        // ����� ���������
        System.out.println("��������:");
        System.out.println(personOriginal.toString());
        System.out.println();
        System.out.println();

        System.out.println("�����:");
        System.out.println("������ \"Alexandr\" ��� ����������," +
                " ���� �������� ���");

        // ����� �����
        System.out.println(personClone.toString());

    }
}
