package sinko.patterns.observerDONE;

public class Follower2 implements Subscribe{
    private String name;

    public Follower2(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String notification) {
        System.out.println(name + " Получил оповещение от Ютуб канала: " + notification);
    }

    @Override
    public String toString() {
        return "Follower2{" +
                "name='" + name + '\'' +
                '}';
    }
}
