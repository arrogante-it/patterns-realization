package sinko.patterns.observerDONE;

public class SomeYouTubeChannel {
    private boolean notification_Signal;

    public boolean isNotification_Signal(){
        return notification_Signal;
    }

    void On_Notification_Signal(){
        notification_Signal = true;
        System.out.println("����� ����� �����!");
    }

    void Off_Notification_Signal(){
        notification_Signal = false;
        System.out.println("������������ ���������� ����� �� ����������!");
    }
}
