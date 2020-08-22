public class T1 {
    public static void main(String[] args) {
        T1.intSun(317, 180);
        double a = T1.intSun2(100, 200);
        System.out.println(a);

        T2.print2(100, 200);
    }

    public static void intSun(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static int intSun2(int x, int y) {
        return x + y;
    }

}

class T2 {
    public static void print2(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}