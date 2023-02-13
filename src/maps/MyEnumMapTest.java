package maps;

import java.util.EnumMap;
import java.util.Map;

import static maps.MyEnum.*;
enum MyEnum {
    K1, K2, K3, K4, K5, K6, K7, K8, K9, A1, A2, A3, A4, A5, A6, A7, A8, A9
}


public class MyEnumMapTest {
    public static void main(String[] args) {
        EnumMap<MyEnum, Command> myMap = new EnumMap<>(MyEnum.class);
        myMap.put(K1, () -> System.out.println("First try"));
        myMap.put(K2, () -> System.out.println("Second"));
        myMap.put(A8, () -> System.out.println("You've lost"));

        for(Map.Entry<MyEnum, Command> entry : myMap.entrySet()){
            System.out.print(entry.getKey() + ": ");
            entry.getValue().action();
        }
    }
}
