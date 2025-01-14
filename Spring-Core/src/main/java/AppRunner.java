import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * https://www.logicbig.com/tutorials/spring-framework/spring-core/quick-start.html
 */

@Configuration
public class AppRunner {

    @Bean
    public HelloWorldService createHelloWorldService() {
        return new HelloWorldServiceImpl();
    }

    @Bean
    public HelloWorldServiceClient createClient() {
        return new HelloWorldServiceClient();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        HelloWorldServiceClient bean = context.getBean(HelloWorldServiceClient.class);
        HelloWorldServiceImpl bean2 = context.getBean(HelloWorldServiceImpl.class);
        bean.showMessage();
        bean2.sayHi("ashish");
    }

}
