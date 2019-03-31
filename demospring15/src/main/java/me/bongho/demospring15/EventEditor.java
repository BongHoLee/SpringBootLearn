package me.bongho.demospring15;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText(){
        Event event = (Event)getValue();
        return event.getId().toString();
    }


    //setAsText : 사용자가 입력한 데이터를 Event 객체로 변환
    @Override
    public void setAsText(String text){
        setValue(new Event(Integer.parseInt(text)));
    }


}
