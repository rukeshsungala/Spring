package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    /*@Bean
    public Alien alien( Computer com){ //@Qualifier("laptop") is used to give preference for the that bean using name.
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }

   // @Bean(name = {"com2","com","com3"}) //It is for creating multiple names for bean
    @Bean
    @Primary //Preference for first
    //@Scope("prototype")
    public Desktop desktop1(){
        return new Desktop();
    }
    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
*/
}
