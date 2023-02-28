package names.tryyourself;

import java.util.ArrayList;
import java.util.List;

/*
1. Please write a new function to rename these variables and add meaningful names.
2. Write a unit test in InventoryTest to verify it works correctly.
 */
class Inventory {
    List<Supply> sl = new ArrayList<>();

    boolean isInStock(String n) {
        Supply s = new Supply(n);
        int l = 0;
        int h = sl.size() - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            int c = sl.get(m).compareTo(s);

            if (c < 0) {
                l = m + 1;
            } else if (c > 0) {
                h = m - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}

class Supply {
    Supply(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String name;

    int compareTo(Supply supply) {
        return 0;
    }
}