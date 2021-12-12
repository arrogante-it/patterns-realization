package sinko.patterns.observerDONE;

// ����������� � ��� ������������� ������� ��������������,
// ������� ������ �������� ��������,
// ����������� ����� �������� ������� � ����������� �� �������,
// ������������ � ������ ��������.
//
// by Alexandr Sinko

public class Main {
    public static void main(String[] args) {
        SomeYouTubeChannel someYouTubeChannel = new SomeYouTubeChannel();
        ObserverFunction observerFunction = new ObserverFunction("\"������� ����������\"", someYouTubeChannel);

        Follower1 follower1 = new Follower1("���������");
        Follower2 follower2 = new Follower2("������");

        System.out.println("==============================================================================");
        observerFunction.subscribe(follower1);
        observerFunction.subscribe(follower2);
        System.out.println("==============================================================================");

        someYouTubeChannel.On_Notification_Signal();
        System.out.println("==============================================================================");

        observerFunction.observer_function();
        System.out.println("==============================================================================");

        someYouTubeChannel.Off_Notification_Signal();
        System.out.println("��������� ��������� �����");
        observerFunction.un_subsctibe(follower2);
        System.out.println("=============================================================================");
    }
}
