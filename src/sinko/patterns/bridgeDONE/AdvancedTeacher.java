package sinko.patterns.bridgeDONE;

public class AdvancedTeacher extends Teacher{
    public AdvancedTeacher(Study study) {
        super.study = study;
    }

    public void teachingBetter(){
        System.out.println("- ��� ����� ��� ������ ����� �� ��� \"�������\"..!");
        study.Student_studing();
    }
}
