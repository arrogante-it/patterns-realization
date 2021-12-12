package sinko.patterns.abstractFactoryDONE.animalFactories;

import sinko.patterns.abstractFactoryDONE.animalType1.AfricanAnimal;
import sinko.patterns.abstractFactoryDONE.animalType2.EuropeanAnimal;

//����������� ������� ����� ��� ���� (�����������) �����
public interface AnimalFactory {
    AfricanAnimal createAfrican();
    EuropeanAnimal createEuropean();
}
