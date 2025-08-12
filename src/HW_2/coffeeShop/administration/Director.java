package HW_2.coffeeShop.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {

    @Autowired
    private Administrator administrator;

    public  void CoffeeShopWork() {
        administrator.reportWork();
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
