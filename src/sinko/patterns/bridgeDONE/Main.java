package sinko.patterns.bridgeDONE;

// ���� � ��� ����������� �������,
// ������� ��������� ������-������ ��� ������� ����� �� ��������� ��������� ��������,
// ������� ����� ����� ��������� �������� ���� �� �����.
//
// ���� �� ���� �������� (����������) ������� ������ �� ������� ������ �������� (����������)
// � ����� ������������ �� �������� ������.
// ��������� ����, ��� ��� ���������� ����� ��������� ������ ����������,
// �� ����� ����� �������������� ������ ����������.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) {
        testStudy(new Student());
    }

    public static void testStudy(Study study){
        System.out.println("����� � \"��������\".");
        Teacher teacher = new Teacher(study);
        teacher.teach();
        study.printInformation();

        System.out.println("����� � \"����������� ��������\".");
        AdvancedTeacher advancedTeacher = new AdvancedTeacher(study);
        advancedTeacher.teach();
        advancedTeacher.teachingBetter();
        study.printInformation();
    }
}
