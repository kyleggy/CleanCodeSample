package objects.avoid_return_null;

import java.util.Arrays;
import java.util.List;
/*
How to avoid NullPointerException while calling String anguilla = SpaceNations.getByCode("AI").getName();
 */
class SpaceNations {

    static List<SpaceNation> nations = Arrays.asList(
            new SpaceNation("US", "United States"),
            new SpaceNation("RU", "Russia")
    );

    static SpaceNation getByCode(String code) {
        for (SpaceNation nation : nations) {
            if (nation.getCode().equals(code)) {
                return nation;
            }
        }
        return null;
    }
}

class SpaceNation {

    final String code;
    final String name;

    SpaceNation(String code, String name) {
        this.code = code;
        this.name = name;
    }

    String getName() {
        return name;
    }

    String getCode() {
        return code;
    }
}

class Usage {

    static void main(String[] args) {

    }
}
