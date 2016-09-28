package components.impl;

import components.GreetingService;

/**
 * Created by vitaliy on 28.09.16.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting";
    }
}
