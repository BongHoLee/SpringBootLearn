package bh.bongho.demospring16;


//Converter, Formatter를 ConversionService로 등록
//ConversionService로 등록을 해야 데이터 바인딩이 가능
//실제 데이터 바인딩이 일어나는 주체는 ConversionService이기 때문
//즉 ConversionService를 통해 데이터 바인딩이 발생

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new EventConverter.StringToEvent());
        registry.addFormatter(new EventFormatter());
    }
}
