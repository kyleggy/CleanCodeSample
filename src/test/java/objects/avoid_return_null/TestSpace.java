package objects.avoid_return_null;

import org.junit.Test;

public class TestSpace {

    @Test
    public void testGetByCode() {
        String us = SpaceNations.getByCode("US").getName();
        // -> "United States"
        //String anguilla = SpaceNations.getByCode("AI").getName();
        // -> NullPointerException
    }
}
