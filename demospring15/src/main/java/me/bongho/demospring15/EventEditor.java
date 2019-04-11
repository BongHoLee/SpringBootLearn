package me.bongho.demospring15;

import java.beans.PropertyEditorSupport;


//PropertyEditorSupport를 상속하여 getAsText, setAsText 구현
// 텍스트를 Event로 변환

//getValue, setValue에서의 Value는 PropertyEditor가 가지고 있는 공유하는 값
// 해당 Value가 서로다른 스레드에게 공유가된다.
// 즉 상태정보를 저장하고 있기 때문에 스레드-세이프 하지 않음.
// 따라서 이와같은 PropertyEditor의 구현체들은 빈으로 등록해서 사용하면 안된다.
// Thread 스코프 빈을 등록할 수 있지만 아예 빈으로 등록 하지 않는게 좋다.

public class EventEditor extends PropertyEditorSupport {



    @Override
    public String getAsText() {
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
         setValue(new Event(Integer.parseInt(text)));
    }
}
