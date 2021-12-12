package sinko.patterns.wrapper_decorator;

public class SuperMan extends Man {

    private Man man;

    public SuperMan(Man man) {
        super(man.getName());
        this.man = man;
    }

    @Override
    public String getName() {
        return "Super" + man.getName();
    }

    @Override
    public void setName(String name) {
        man.setName(name);
    }

    @Override
    public int getPower() {
        return man.getPower() + 100;
    }

    @Override
    public void setPower(int power) {
        man.setPower(power);
    }

    @Override
    public int getSpeed() {
        return man.getSpeed() + 100;
    }

    @Override
    public void setSpeed(int speed) {
        man.setSpeed(speed);
    }
}
