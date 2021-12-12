package sinko.patterns.adapterDONE;

// ������� � ��� ����������� �������,
// ������� ��������� ��������� ������������� �������.
//
// ������� ��������� ���������� ����� ����� ���������,
// ��������� ������ ������ � ������ �������� �������.
//
// by Alexandr Sinko.

public class Main {
    public static void main(String[] args) {
        Army army = new Army();

        System.out.println("������ ������� � ���� �����: ");
        Soldier soldier = new Soldier("�������", 18);
        System.out.println(soldier.getPasswordWords());
        army.enterToArmy(soldier.getPasswordWords());

        System.out.println();

        System.out.println("���������� ������� � ���� �����: ");
        Feminist_Girl feminist_girl = new Feminist_Girl("�����", 18);
        System.out.println(feminist_girl.getPassword());
        army.enterToArmy(feminist_girl.getPassword());

        System.out.println();
        System.out.println("���������� ������������! � ������� �����!");
        Feminist_GirlToArmyAdapter feminist_girlToArmyAdapter = new Feminist_GirlToArmyAdapter(feminist_girl);
        System.out.println(feminist_girlToArmyAdapter.getPasswordWords());
        army.enterToArmy(feminist_girlToArmyAdapter.getPasswordWords());
    }
}
