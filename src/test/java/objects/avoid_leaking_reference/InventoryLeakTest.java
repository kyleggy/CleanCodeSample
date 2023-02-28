package objects.avoid_leaking_reference;

import general.Supply;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InventoryLeakTest {

    @Test
    public void test() {
        List<Supply> supplies = new ArrayList<>();
        Inventory inventory = new Inventory(supplies);

        inventory.getSupplies().size(); // == 0
        supplies.add(new Supply("Apple"));
        inventory.getSupplies().size(); // == 1

        inventory.getSupplies().add(new Supply("Banana"));
        inventory.getSupplies().size(); // == 2
    }
}
