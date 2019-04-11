package bh.bongho.demospring20;


//AOP 적용을 위해 에노테이션을 만들 수 있따.
//

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//해당 에노테이션 정보를 얼마나 유지할 것인가
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {

}
