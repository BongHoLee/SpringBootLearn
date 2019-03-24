package bh.bongho.demospring8;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;



@Component
public class MyEventHandler{

    //이벤트를 받아서 처리해준다.
    @EventListener
    public void handle(MyEvent myEvent) {
        System.out.println("이벤트 받았다 데이터는 " + myEvent.getData());
    }

    @EventListener
    public void handle(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent");
    }


    @EventListener
    public void handle(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent");
    }
}
