package sinko.patterns.abstractFactoryDONE.animalFactories;

import sinko.patterns.abstractFactoryDONE.animalType1.AfricanAnimal;
import sinko.patterns.abstractFactoryDONE.animalType1.BearAfrican;
import sinko.patterns.abstractFactoryDONE.animalType2.EuropeanAnimal;
import sinko.patterns.abstractFactoryDONE.animalType2.BearEuropean;

public class BearFactory implements AnimalFactory{
    @Override
    public AfricanAnimal createAfrican() {
        return new BearAfrican();
    }

    @Override
    public EuropeanAnimal createEuropean() {
        return new BearEuropean();
    }
}
