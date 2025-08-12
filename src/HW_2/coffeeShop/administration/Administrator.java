package HW_2.coffeeShop.administration;

import HW_2.coffeeShop.staff.Barista;
import HW_2.coffeeShop.staff.Waiter;
import org.springframework.beans.factory.annotation.Autowired;

public class Administrator {

    @Autowired
    private Barista barista;
    @Autowired
    private Waiter waiter;

    public void reportWork() {
        waiter.work();
        barista.work();
    }

    public Barista getBarista() {
        return barista;
    }

    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
