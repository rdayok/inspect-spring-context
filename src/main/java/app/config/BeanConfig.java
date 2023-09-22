package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Denote that this is a configuration class
@ComponentScan("app.beans") //use this to tell that in this class we specify where spring should scan for components
public class BeanConfig {

}
