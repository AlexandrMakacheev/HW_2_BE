package HW_2.coffeeShop.config;

import HW_2.coffeeShop.administration.Administrator;
import HW_2.coffeeShop.administration.Director;
import HW_2.coffeeShop.staff.Barista;
import HW_2.coffeeShop.staff.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Administrator getAdministrator() {
        return new Administrator();
    }

    @Bean
    public Director getDirector() {
        return new Director();
    }

    @Bean
    public Barista getBarista() {
        return new Barista();
    }

    @Bean
    public Waiter getWaiter() {
        return new Waiter();
    }
}
