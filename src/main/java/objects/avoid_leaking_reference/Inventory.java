package objects.avoid_leaking_reference;

import general.Supply;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
How to avoid leak reference to avoid supplies get leaked
 */
class Inventory {

//    private final List<Supply> supplies;
//
//    Inventory(List<Supply> supplies) {
//        this.supplies = supplies;
//    }
//
//    List<Supply> getSupplies() {
//        return supplies;
//    }

    private final List<Supply> supplies;

    public Inventory(List<Supply> supplies) {
        this.supplies = new ArrayList<>(supplies);
    }

    public List<Supply> getSupplies() {
        return Collections.unmodifiableList(supplies);
    }
}
