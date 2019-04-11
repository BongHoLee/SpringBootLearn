package bh.bongho.demospring18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//같은 타입(EventService)의 bean이 여러 개 있을 때 우선순위가 된다.
@Primary
@Service
public class ProxySimpleEventService implements EventService {

    //proxy가 위임 받아서 일을 처리함
    //proxy가 real Subject를 가지고 있고 위임받아서 일을 처리하고 부가적인 일(시간 재기)을 진행
    //시간재기가 중복이되고 이러한 프록시 클래스를 계속해서 만들어주어야하고... 부가기능(시간재기)를 추가해주어야하고..

    //동적으로(runtime) proxy 객체를 만드는 방법이 있다. (어떤 객체를 감싸는 프록시 객체를 런타임에 만드는 기능이 있다.)


    @Autowired
    SimpleEventService simpleEventService;

    @Override
    public void createEvent()  {
        long begin = System.currentTimeMillis();
        simpleEventService.createEvent();       //simpleEventService의 기능(createEvent())를 위임받아서 처리
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        simpleEventService.deleteEvent();
    }
}
