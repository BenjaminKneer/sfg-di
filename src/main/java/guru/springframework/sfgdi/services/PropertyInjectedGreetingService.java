package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "hello world1 - property";
    }
}
