package sets;

import java.util.EnumSet;

import static sets.MyEnum.*;

enum MyEnum {
    K1, K2, K3, K4, K5, K6, K7, K8, K9, A1, A2, A3, A4, A5, A6, A7, A8, A9
}

public class MyEnumSetTest {
    public static void main(String[] args) {
        EnumSet<MyEnum> mySet = EnumSet.noneOf(MyEnum.class);
        mySet.add(A2);
        mySet.add(A3);
        mySet.add(K7);
        mySet.add(A1);
        mySet.addAll(EnumSet.allOf(MyEnum.class));

        System.out.println(mySet);

        mySet.removeIf(s -> s.name().charAt(1) == '6');

        mySet.removeAll(EnumSet.of(K3, K2, A1));

        System.out.println(mySet);

        mySet.removeAll(EnumSet.range(A5, A8));

        System.out.println(mySet);

        mySet = EnumSet.complementOf(mySet);
        System.out.println(mySet);

    }
}
