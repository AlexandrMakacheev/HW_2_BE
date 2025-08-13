package HW_2.coffeeShop.code;

import HW_2.coffeeShop.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationSpring {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("HW_2.coffeeShop.config");

        Director director = context.getBean(Director.class);

        director.coffeeShopWork();

    }
}
