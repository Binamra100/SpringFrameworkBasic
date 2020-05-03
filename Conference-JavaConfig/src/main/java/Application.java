import com.binamra100.service.SpeakerService;
import com.binamra100.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        // Singleton Example
        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println("Service 1 Hascode: " + service.hashCode());
        System.out.println("Service 2 Hascode: " + service2.hashCode());

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
