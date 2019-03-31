package me.bongho.demospring14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    //Spring 2.05 이상부터는 Validator 구현체(EventValidator)를 따로 사용하지 않아도
    //Validator 타입의 필드 변수에 의존성 주입 애노테이션 사용시 LocalValidationFactoryBean 빈이 자동 등록
    //이 LocalValidationFactoryBean은 @NotEmpty, @Email과 같은 Bean Validation을 체크하여 검증
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass());

        Event event = new Event();
        event.setLimit(1);
        event.setEmail("asdf");

        Errors errors = new BeanPropertyBindingResult(event, "event2");

        validator.validate(event, errors);
        System.out.println(errors.hasErrors());
        for(ObjectError e : errors.getAllErrors()){
            for(String out : e.getCodes())
                System.out.println(out);
        }


    }


//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Event event = new Event();
//        EventValidator eventValidator = new EventValidator();
//
//        //BeanPropertyBindingResult는 객체에 대한 '에러정보'를 담는 객체로써 Errors의 구현체
//        //파라미터로 넘어간 event에 에러가 있을 경우 이 객체에 정보가 담기게 되며 errors를 통해 에러 정보 확인 가능
//        Errors errors = new BeanPropertyBindingResult(event, "event");
//
//        eventValidator.validate(event, errors);
//        System.out.println(errors.hasErrors());
//
//        for(ObjectError e : errors.getAllErrors()){
//            for(String out : e.getCodes())
//                System.out.println(out);
//        }
//
//    }
}
