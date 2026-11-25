public class Lab2_E5_Lalangui {
    static int sumPares(int n) {
        if (n < 2) return 0;
        if (n % 2 != 0) return sumPares(n - 1);
        return n + sumPares(n - 2);
    }
    static boolean esCapicua(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return esCapicua(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println("sumPares(10) = " + sumPares(10));
        System.out.println("sumPares(7) = " + sumPares(7));
        System.out.println("esCapicua(\"12321\") = " + esCapicua("12321"));
    }
}