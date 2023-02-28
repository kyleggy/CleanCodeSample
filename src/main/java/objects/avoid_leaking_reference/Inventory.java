package objects.avoid_leaking_reference;

import general.Supply;


import java.util.List;

/*
How to avoid leak reference to avoid supplies get leaked
 */
class Inventory {

    private final List<Supply> supplies;

    Inventory(List<Supply> supplies) {
        this.supplies = supplies;
    }

    List<Supply> getSupplies() {
        return supplies;
    }
}
