package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "hello world1 - PRIMARY BEAN";
    }
}
