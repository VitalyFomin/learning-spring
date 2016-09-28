import components.GreetingService;
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vitaliy on 28.09.16.
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("Start application context");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.sayGreeting());
    }
}
