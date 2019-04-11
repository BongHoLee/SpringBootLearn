package bh.bongho.demospring16;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//Converter
public class EventConverter {

    //Converter<source, target>
    @Component      //SpringBoot에서는 WebConversionService가 자동으로 ConversionService에 Converter등록 (빈으로 등록되어 있는 경우)
    public static class StringToEvent implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }

    //Converter<source, target>
    @Component
    public static class EventToString implements Converter<Event, String> {
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
