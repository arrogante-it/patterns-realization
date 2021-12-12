package sinko.patterns.observerDONE;

import java.util.ArrayList;
import java.util.List;

public class ObserverFunction {
    private String name_Of_Function;
    private SomeYouTubeChannel someYouTubeChannel;

    public ObserverFunction(String name_Of_Function, SomeYouTubeChannel someYouTubeChannel) {
        this.name_Of_Function = name_Of_Function;
        this.someYouTubeChannel = someYouTubeChannel;
    }

    public void observer_function(){
        if(someYouTubeChannel.isNotification_Signal()){
            System.out.println(name_Of_Function + " отправляет Сообщение!");
            messageOfNotification("Вышло новое видео!");
        }
    }

    private List<Subscribe> subscribers_List = new ArrayList<>();

    public void subscribe(Subscribe subscribe){
        subscribers_List.add(subscribe);
        System.out.println("Подписчик " + subscribe + " Подписался на уведомления от Ютуб канал!");
    }

    public void un_subsctibe(Subscribe subscribe){
        subscribers_List.remove(subscribe);
        System.out.println("Подписчик " + subscribe + " Отписался от уведомлений Ютуб канал!");
    }


    public void messageOfNotification(String message){
        for(Subscribe subscriber : subscribers_List){
            System.out.println("Ютуб канал отправил сообщение " + subscriber);
            subscriber.getNotification(message);
            System.out.println("");
        }
    }
}





























