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
        System.out.println(and(true, true));
        System.out.println(and(true, false));
        System.out.println(and(false, true));
        System.out.println(and(false, false));
        System.out.println();
        System.out.println("Nand");
        System.out.println(nand(true, true));
        System.out.println(nand(true, false));
        System.out.println(nand(false, true));
        System.out.println(nand(false, false));
        System.out.println();
        System.out.println("Or");
        System.out.println(or(true, true));
        System.out.println(or(true, false));
        System.out.println(or(false, true));
        System.out.println(or(false, false));
        System.out.println();
        System.out.println("Nor");
        System.out.println(nor(true, true));
        System.out.println(nor(true, false));
        System.out.println(nor(false, true));
        System.out.println(nor(false, false));
        System.out.println();
        System.out.println("Xor");
        System.out.println(xor(true, true));  
        System.out.println(xor(true, false));
        System.out.println(xor(false, true));
        System.out.println(xor(false, false));
        System.out.println();
        System.out.println("Xnor");
        System.out.println(xnor(true, true));  
        System.out.println(xnor(true, false));
        System.out.println(xnor(false, true));
        System.out.println(xnor(false, false));
    }

}
