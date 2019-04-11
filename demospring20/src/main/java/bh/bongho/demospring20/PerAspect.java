package bh.bongho.demospring20;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerAspect {

    //두가지 정의가 필요
    //1. 해야할 일(advice)
    //2. 해야할 일을 어디에 적용할 것인가(point-cut)

    // 어드바이스
    // 해야할 일 pjp -> advice가 적용되는 대상 (createEvent, publishEvent 즉 메서드 자체 // 메서드를 감싸고 있다?)
    // target에 해당하는 메서드를 호출
    // Around는 메서드를 감싸는 형태로 적용이 된다. 즉 메서드 호출 자체를 감싸고 있기 때문에 메서드 호출 전 후 등에 적용이 가능하다.
    // Around(value) -> value에는 포인트컷 이름을 줄 수 있고, 포인트컷을 정의할 수도 있다(표현식), 어디에 적용할 지 가능.
    // 이 어드바이스를 어떻게 적용할 것인가
    //@Around("execution(* bh.bongho..*.EventService.*(..))") //포인트컷을 정의했다.
    //@Around("@annotation(PerfLogging)")         //에노테이션으로 포인트컷을 정의하는것이 보다 편리할 수 있다.
    @Around("bean(simpleEventService)")             // 해당 빈의 모든 public 메서드에 정의가된다.
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("Hello");
    }
}
