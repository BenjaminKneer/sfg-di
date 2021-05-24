package guru.springframework.sfgdi.services;

public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "hello world";
    }
}
