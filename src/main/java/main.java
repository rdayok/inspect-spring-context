import app.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // the BeanConfig.clas passed as an argument to the AnnotationConfigApplicationContext constructor tells where our scan config is
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("number of beans in context: " + context.getBeanDefinitionCount());
        System.out.println("The beans by name: \n"+ Arrays.toString(context.getBeanDefinitionNames()));
    }
}
