public class Power {
    public static double power(double x, int n) {
        long nn = n;
        double ans = 1.0;
        nn = nn < 0 ? -1 * nn : nn;
        while(nn > 0){
            if(nn % 2 == 0){
                x = x * x;
                nn = nn / 2;
            }
            else{
                ans = ans * x;
                nn--;
            }
        }
        return n < 0 ? (1 / ans) : ans;
    }
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println(power(x, n));
    }
}
