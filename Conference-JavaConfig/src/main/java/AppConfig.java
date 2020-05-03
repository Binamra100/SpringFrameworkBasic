import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.binamra100"})
public class AppConfig {

    /*
        The below code can be replace by adding @Component @Service or @Resposity
        in the class level after adding component scan.
        Example on SpeakerServiceImpl class.
     */
//    @Bean(name="speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
//        /*
//            Constructor Injection
//         */
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        /*
//            Setter Injection
//         */
//        //service.setRepository(getSpeakerRepository());
//
//        /*
//            Autowire Example
//         */
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return  service;
//    }
//
//    @Bean(name="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
