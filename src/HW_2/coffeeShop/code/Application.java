package HW_2.coffeeShop.code;

import HW_2.coffeeShop.administration.Administrator;
import HW_2.coffeeShop.administration.Director;
import HW_2.coffeeShop.staff.Barista;
import HW_2.coffeeShop.staff.Waiter;

public class Application {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        Barista barista = new Barista();

        Administrator administrator = new Administrator();
        administrator.setWaiter(waiter);
        administrator.setBarista(barista);

        Director director = new Director();
        director.setAdministrator(administrator);

        director.CoffeeShopWork();
    }
}
