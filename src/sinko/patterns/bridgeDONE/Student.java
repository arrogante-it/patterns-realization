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
        System.out.println("- � �������!");
        System.out.println("� " + (typeChoose ? "- ����� ������� ������ ��� ��� ����� ����������!" : "- ����� ������ � ��� ������ � �� ���������"));
        System.out.println("############################################\n");

    }
}
