package sinko.patterns.adapterDONE;

// Адаптер — это структурный паттерн,
// который позволяет подружить несовместимые объекты.
//
// Адаптер выступает прослойкой между двумя объектами,
// превращая вызовы одного в вызовы понятные другому.
//
// by Alexandr Sinko.

public class Main {
    public static void main(String[] args) {
        Army army = new Army();

        System.out.println("Солдат заходит в штаб армии: ");
        Soldier soldier = new Soldier("Василий", 18);
        System.out.println(soldier.getPasswordWords());
        army.enterToArmy(soldier.getPasswordWords());

        System.out.println();

        System.out.println("Фемикистка заходит в штаб армии: ");
        Feminist_Girl feminist_girl = new Feminist_Girl("Грета", 18);
        System.out.println(feminist_girl.getPassword());
        army.enterToArmy(feminist_girl.getPassword());

        System.out.println();
        System.out.println("Феминистка адаптируется! И пробует снова!");
        Feminist_GirlToArmyAdapter feminist_girlToArmyAdapter = new Feminist_GirlToArmyAdapter(feminist_girl);
        System.out.println(feminist_girlToArmyAdapter.getPasswordWords());
        army.enterToArmy(feminist_girlToArmyAdapter.getPasswordWords());
    }
}
