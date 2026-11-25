public class Lab2_E3_Lalangui {
    static void m(int a, int[] v) {
        a++;
        v[1] = a + a;
    }
    public static void main(String[] args) {
        int a = 5;
        int[] v = {1, 2, 3};
        m(a, v);
        System.out.println(a + " " + v[1]);
    }
}