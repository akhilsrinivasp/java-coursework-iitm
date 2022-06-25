public class L9_Conditionals {
    public static void main(String[] args) {
        System.out.println("hello, world");
    }
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static int sum2(int[] a) {
        int sum = 0;
        int i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);
        return sum;
    }
    //write a function to calculate sum of an array using while loop
    public static int sum3(int[] a) {
        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        return sum;
    }
    
    public static String evenOrOdd(int n) {
        switch (n % 2) {
            case 0:
                return "even";
            case 1:
                return "odd";
            default:
                return "invalid";
        }
    }

    public static String evenOrOdd2(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int sum6(int[] a) {
        int sum = 0;
        for (int v : a) {
            sum += v;
        }
        return sum;
    }
}