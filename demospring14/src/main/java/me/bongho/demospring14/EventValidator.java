package me.bongho.demospring14;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


//Validator 인터페이스를 구현
public class EventValidator implements Validator {

    //인자로 넘어온 객체(clazz)의 Class type Event인지 확인
    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);

    }

    @Override
    public void validate(Object o, Errors errors) {

        //title 필드가 비어있거나 공백일 경우 errors에 에러 정보를 담는다. notempty는 에러코드
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title"
                                                        , "notempty"
                                                        , "Empty title is now allowed");


    }
}
