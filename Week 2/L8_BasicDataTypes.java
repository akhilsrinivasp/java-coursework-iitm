public class L8_BasicDataTypes {
    public static void main(String[] args) {
        int x, y;
        double z;
        char c;
        boolean c1, c2;

        x=5;
        y=7;
        c='x';

        char d = '\u03C0'; // pi
        System.out.println(d);
    
        boolean b1 = true;
        boolean b2 = false;
        
        float pi = 3.1415927f;
        pi = 22f/7f;
        System.out.println(pi);

        final float pi2 = 3.1415927f; // final == constant
        // pi2 = 22/7;
        System.out.println(pi2);

        String s = "hello", t = "world";
        System.out.println(s + " " + t);

        s = s.substring(0,3) + "p!" ;
        System.out.println(s);

        int[] a = new int[100];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println("Length of array a: " + a.length);
        // for string it is a method
        System.out.println("Length of string: " + s.length());

        // Dynamic integer array initialisation using array constants
        int[] b = {1,2,3,4,5};
        System.out.println("Length of array b: " + b.length);
        System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3] + " " + b[4]);
    }
}