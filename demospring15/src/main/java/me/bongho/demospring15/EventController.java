package me.bongho.demospring15;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @InitBinder
    public void init(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    }

    //{event} : event의 id를 등록하기 위한 예제 코드
    //입력한 숫자(id)를 Event 타입으로 변환을 해서 스프링이 받음
    //그렇게 받은 이벤트 타입(도메인 타입)을 활용하여 코딩?
    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event){
        System.out.println(event);
        return event.getId().toString();
    }
}
