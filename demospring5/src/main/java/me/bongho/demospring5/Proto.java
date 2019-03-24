package me.bongho.demospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//proxy 모드 사용, 이 빈을 프록시로 감싼다.
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

    @Autowired
    Single single;      //프로토타입 내에서 싱글톤 빈을 주입받아도 아무런 문제가 되지 않음.
}
