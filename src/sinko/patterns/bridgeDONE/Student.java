package sinko.patterns.bridgeDONE;

public class Student implements Study{
    private boolean typeChoose = false;

    @Override
    public boolean type_of_study() {
        return typeChoose;
    }

    @Override
    public void Student_studing() {
        typeChoose = true;
    }

    @Override
    public void Student_studing_lazy() {
        typeChoose = false;
    }

    public void printInformation(){
        System.out.println("===========================================");
        System.out.println("- Я студент!");
        System.out.println("Я " + (typeChoose ? "- учусь усердно потому что мне стало интерестно!" : "- учусь лениво и мне скучно и не интересно"));
        System.out.println("############################################\n");

    }
}
