package core.basesyntax.db;

import core.basesyntax.model.Fruit;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Map<Fruit, Integer> fruitsStorage = new HashMap<>();

    public static Map<Fruit, Integer> getFruitsStorage() {
        return fruitsStorage;
    }
}