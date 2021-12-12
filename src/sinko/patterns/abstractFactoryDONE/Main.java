package sinko.patterns.abstractFactoryDONE;

// ����������� ������� � ��� ����������� ������� ��������������,
// ������� ��������� ��������� ��������� ��������� ��������,
// �� ������������ � ���������� ������� ����������� ��������.
//
// ����������� ������� ����� ��������� �������� ���� ��������� ����� ���������,
// � ������ ���������� ���������� ������� ��������� �������� ����� �� ��������.
//
// by Alexandr Sinko

import sinko.patterns.abstractFactoryDONE.animalFactories.AnimalFactory;
import sinko.patterns.abstractFactoryDONE.animalFactories.BearFactory;
import sinko.patterns.abstractFactoryDONE.animalFactories.LionFactory;

public class Main {

    public static void main(String[] args) {
        createAnimal(AnimalType.BEAR).createAfrican().move();
        createAnimal(AnimalType.BEAR).createEuropean().move();

        System.out.println();

        createAnimal(AnimalType.LION).createAfrican().move();
        createAnimal(AnimalType.LION).createEuropean().move();
    }

    public static AnimalFactory createAnimal(AnimalType animalType){
        AnimalFactory animalFactory = null;

        switch (animalType){
            case BEAR:
                animalFactory = new BearFactory();
                break;
            case LION:
                animalFactory = new LionFactory();
                break;
        }

        return animalFactory;
    }
}








































































