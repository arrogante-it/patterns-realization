package sinko.patterns.adapterDONE;

public class Army {

    public void enterToArmy(String password) {
        if(password == "Я хочу Служить!"){
            System.out.println("Добро пожаловать в Армию, мы вас ждали!");
        }else {
            System.out.println("Подбери правильные слова!");
        }
    }
}
