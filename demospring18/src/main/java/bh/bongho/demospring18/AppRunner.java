package bh.bongho.demospring18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//AppRunner가 클라이언트 코드
@Component
public class AppRunner implements ApplicationRunner {

    //인터페이스가 있는경우 인터페이스 타입으로 주입 받는것을 권장.
    @Autowired
    EventService eventService;      //@Primary로 설정한 proxy를 가져다가 사용한다.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();
    }
}
