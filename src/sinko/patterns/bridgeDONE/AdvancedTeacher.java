package sinko.patterns.bridgeDONE;

public class AdvancedTeacher extends Teacher{
    public AdvancedTeacher(Study study) {
        super.study = study;
    }

    public void teachingBetter(){
        System.out.println("- Учу лучше чем просто какой то там \"учитель\"..!");
        study.Student_studing();
    }
}
