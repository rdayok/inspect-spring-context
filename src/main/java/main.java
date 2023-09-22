import app.beans.DiaryServiceRepository;
import app.beans.UserService;
import app.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // the BeanConfig.clas passed as an argument to the AnnotationConfigApplicationContext constructor tells where
        // our scan config is
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("number of beans in context: " + context.getBeanDefinitionCount());
        System.out.println("The context view: \n" + Arrays.toString(context.getBeanDefinitionNames()));
        // This returns false because the beans are named starting with lower-case
        System.out.println("Is the bean name as the class or not?"
                +context.containsBeanDefinition("UserService"));
        // Just to show that an actual object has been put into the application context
        UserService userServiceBeanGottenFromTheApplicationContext = context.getBean(UserService.class);
        userServiceBeanGottenFromTheApplicationContext.sayHello();
        DiaryServiceRepository diaryServiceRepositoryGottenFromTheApplicationContext =
                context.getBean(DiaryServiceRepository.class);
        //The print message here prints the object address in memory that is printed in the configuration method that
        //Created the diaryServiceRepository bean
        System.out.println("Here is the address of the same Bean created in the configuration class: "
                +diaryServiceRepositoryGottenFromTheApplicationContext);
    }
}
