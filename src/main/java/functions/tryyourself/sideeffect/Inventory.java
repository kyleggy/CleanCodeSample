package functions.tryyourself.sideeffect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
There is side effects in this function, please correct it
 */
public class Inventory {
    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        List<String> names = new ArrayList<>();

        Consumer<String> addToNames = name -> names.add(name);

        supplies.stream()
                .filter(Supply::isUncontaminated)
                .map(Supply::getName)
                .distinct()
                .forEach(addToNames);
        return names.size();
    }
    interface Supply {

        String getName();

        boolean isUncontaminated();
    }
}
