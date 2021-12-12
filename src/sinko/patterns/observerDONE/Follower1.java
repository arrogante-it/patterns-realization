package sinko.patterns.observerDONE;

public class Follower1 implements Subscribe {
    private String name;

    public Follower1(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String notification) {
        System.out.println(name + " Получил оповещение от Ютуб канала: " + notification);
    }

    @Override
    public String toString() {
        return "Follower1{" +
                "name='" + name + '\'' +
                '}';
    }
}
