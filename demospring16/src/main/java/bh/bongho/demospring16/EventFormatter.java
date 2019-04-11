package bh.bongho.demospring16;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component  //SpringBoot에서는 WebConversionService가 자동으로 ConversionService에 Formatter 등록(빈으로 등록이 되어있는 경우)
public class EventFormatter implements Formatter<Event> {
    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }

    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
