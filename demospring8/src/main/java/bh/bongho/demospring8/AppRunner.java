package bh.bongho.demospring8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    //이벤트를 발생시켜준다!
    //이벤트 핸들러가 다수개 이면 차례대로 해당 핸들러 메소드가 실행된다.(이벤트 처리 핸들러)
    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventPublisher.publishEvent(new MyEvent(this, 100));
    }
}
