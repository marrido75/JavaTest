public class T1 {
    public static void main(String[] args) {
        T1.intSun(317, 180);
        double a = T1.intSun2(100, 200);
        System.out.println(a);
    }

    public static void intSun(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static int intSun2(int x, int y) {
        return x + y;
    }

}