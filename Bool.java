public class Bool {
    
    // true => false
    // false => true
    public static boolean swap (boolean b1) {
        return !b1;
    }
    
    // if they are both true, true. otherwise, false
    public static boolean and (boolean b1, boolean b2) {
        return b1 && b2;
    }

    // if they are both true, false. otherwise, true
    public static boolean nand (boolean b1, boolean b2) {
        return !(b1 && b2);
    }

    // if one is true, true. otherwise, false
    public static boolean or (boolean b1, boolean b2) {
        return !(!b1 && !b2);
    }

    // if one is true, false. otherwise true
    public static boolean nor (boolean b1, boolean b2) {
        return !b1 && !b2;
    }
    
     // if they are the same, true
    public static boolean xor (boolean b1, boolean b2) {
        return b1 == b2;
    }
    
    // if they are different, true
    public static boolean xnor (boolean b1, boolean b2) {
        return b1 != b2;
    }

    // // // // //
    // TESTING! //
    // // // // //
    System.out.println("And");
        System.out.println(bool.and(true, true));
        System.out.println(bool.and(true, false));
        System.out.println(bool.and(false, true));
        System.out.println(bool.and(false, false));
        System.out.println();
        System.out.println("Nand");
        System.out.println(bool.nand(true, true));
        System.out.println(bool.nand(true, false));
        System.out.println(bool.nand(false, true));
        System.out.println(bool.nand(false, false));
        System.out.println();
        System.out.println("Or");
        System.out.println(bool.or(true, true));
        System.out.println(bool.or(true, false));
        System.out.println(bool.or(false, true));
        System.out.println(bool.or(false, false));
        System.out.println();
        System.out.println("Nor");
        System.out.println(bool.nor(true, true));
        System.out.println(bool.nor(true, false));
        System.out.println(bool.nor(false, true));
        System.out.println(bool.nor(false, false));
        System.out.println();
        System.out.println("Xor");
        System.out.println(bool.xor(true, true));  
        System.out.println(bool.xor(true, false));
        System.out.println(bool.xor(false, true));
        System.out.println(bool.xor(false, false));
        System.out.println();
        System.out.println("Xnor");
        System.out.println(bool.xnor(true, true));  
        System.out.println(bool.xnor(true, false));
        System.out.println(bool.xnor(false, true));
        System.out.println(bool.xnor(false, false));
    }

}
