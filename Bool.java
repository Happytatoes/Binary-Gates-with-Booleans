public class Bool {
    
    public static boolean swap (boolean bool) {
        return bool == true ? false : true;
    }
    
    public static boolean and (boolean b1, boolean b2) {
        return b1 == true && b2 == true ? true : false;
    }

    public static boolean nand (boolean b1, boolean b2) {
        return b1 == true && b2 == true ? false : true;
    }

    public static boolean or (boolean b1, boolean b2) {
        return b1 == false && b2 == false ? false : true;
    }

    public static boolean nor (boolean b1, boolean b2) {
        return b1 == false && b2 == false ? true : false;
    }
    
    public static boolean xor (boolean b1, boolean b2) {
        return b1 == b2 ? true : false;
    }

    public static boolean xnor (boolean b1, boolean b2) {
        return b1 == b2 ? false : true;
    }

}