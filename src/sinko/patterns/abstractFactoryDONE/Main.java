package sinko.patterns.abstractFactoryDONE;

// јбстрактна€ фабрика Ч это порождающий паттерн проектировани€,
// который позвол€ет создавать семейства св€занных объектов,
// не прив€зыва€сь к конкретным классам создаваемых объектов.
//
// јбстрактна€ фабрика задаЄт интерфейс создани€ всех доступных типов продуктов,
// а кажда€ конкретна€ реализаци€ фабрики порождает продукты одной из вариаций.
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








































































