package bh.bongho.demospring17;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner {

    //Value Annotation사용시 () 내에 Expression을 사용 가능하다.
    @Value("#{1 + 1}")
    int value;

    //'' 사용시 문자열 사용 가능
    @Value("#{'hello ' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("${my.data}")
    int myData;

    @Value("#{ ${my.data} + 100}")
    int myDataIs101;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=========================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(myData);
        System.out.println(myDataIs101);
        System.out.println(sampleData);

    }
}
