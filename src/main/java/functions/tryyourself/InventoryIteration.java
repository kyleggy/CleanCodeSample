package functions.tryyourself;



import general.Supply;

import java.util.ArrayList;
import java.util.List;
/*
How to avoid Collection Modification During Iteration
 */
public class InventoryIteration {
    private List<Supply> supplies = new ArrayList<>();

    void disposeContaminatedSupplies() {
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                supplies.remove(supply);
            }
        }
    }
}
