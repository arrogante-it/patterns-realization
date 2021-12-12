package sinko.patterns.adapterDONE;

public class Feminist_GirlToArmyAdapter extends Soldier {

    private Feminist_Girl feminist_girl;

    public Feminist_GirlToArmyAdapter(Feminist_Girl feminist_girl){
        this.feminist_girl = feminist_girl;
    }

    @Override
    public String getPasswordWords() {
        return super.getPasswordWords();
    }
}
