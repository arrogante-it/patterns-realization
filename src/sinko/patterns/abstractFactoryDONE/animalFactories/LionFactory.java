package sinko.patterns.abstractFactoryDONE.animalFactories;

import sinko.patterns.abstractFactoryDONE.animalType1.AfricanAnimal;
import sinko.patterns.abstractFactoryDONE.animalType1.LionAfrican;
import sinko.patterns.abstractFactoryDONE.animalType2.EuropeanAnimal;
import sinko.patterns.abstractFactoryDONE.animalType2.LionEuropean;

public class LionFactory implements AnimalFactory {
    @Override
    public AfricanAnimal createAfrican() {
        return new LionAfrican();
    }

    @Override
    public EuropeanAnimal createEuropean() {
        return new LionEuropean();
    }
}
