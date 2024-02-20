package ru.gb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gb.api.TimerAspect;

@Configuration
public class methodTimerAutoConfiguration {
    @Bean
    TimerAspect timerAspect() {
        return new TimerAspect();
    }
}
