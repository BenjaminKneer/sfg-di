package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Used if you want to inject 3rd party libs which code u dont own
@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    public I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Profile("EN")
    @Bean
    public I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    public PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    public ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    public PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    public SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
