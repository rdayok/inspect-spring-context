package app.config;

import app.beans.DiaryServiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration // Denote that this is a configuration class
@ComponentScan("app.beans") //use this to tell that in this class we specify where spring should scan for components
public class BeanConfig {


    // So when you check this DiaryServiceRepository class You would see I didn't annotate it with the stereotype
    // annotation and this is another method of creating bean and add it to the application context by using the
    // class constructor in the configuration class.
    // Note that the @Bean annotation must be used for the constructor here if not the bean would not be added into the
    // context
    @Bean
    public DiaryServiceRepository diaryServiceRepository() {
        // We could make get the object here and check its object address in memory here and if we still go to the main
        // and get the bean in the application context, we would see it with the same object address in memory
        DiaryServiceRepository diaryServiceRepository = new DiaryServiceRepository();
        System.out.println("Here is the address of the Bean created in the configuration class "
                +diaryServiceRepository);
        return diaryServiceRepository;
    }

    // So if I want to have a Bean of a class I didn't creat like say the Scanner class
    // I would use the configuration class and annotate the method that returns the Bean of such a class
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

}

