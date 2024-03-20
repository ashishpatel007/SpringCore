import org.springframework.context.annotation.Bean;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Bean
    @Override
    public void sayHi(String name) {
        System.out.println("Hi " + name);
    }
}
