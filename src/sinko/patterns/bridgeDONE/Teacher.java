package sinko.patterns.bridgeDONE;

public class Teacher implements TeachersFuncion{
    public Study study;

    public Teacher(){

    }

    public Teacher(Study study) {
        this.study = study;
    }

    @Override
    public void teach() {
        System.out.println("- учу студента..");
        if(study.type_of_study()){
            study.Student_studing();
        }else {
            study.Student_studing_lazy();
        }
    }
}
