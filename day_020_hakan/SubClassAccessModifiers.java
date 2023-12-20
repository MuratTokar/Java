package day_020_hakan;

import day_036_hakan.AccessModifiers;

public class SubClassAccessModifiers extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicName);
        // System.out.println(AccessModifiers.defaultName); farkli packageta oldugu icin erisilemez
        System.out.println(AccessModifiers.protectedName);

    }
}
