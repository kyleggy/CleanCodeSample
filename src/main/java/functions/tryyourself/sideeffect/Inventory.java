package functions.tryyourself.sideeffect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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

//        List<String> names =   supplies.stream()
//                .filter(Supply::isUncontaminated)
//                .map(Supply::getName)
//                .distinct().collect(Collectors.toList());


        return names.size();

    }
    interface Supply {

        String getName();

        boolean isUncontaminated();
    }
}
