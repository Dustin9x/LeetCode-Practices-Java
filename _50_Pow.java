public class _50_Pow {
    public static double myPow(double x, int n) {
        if(n==0) return 1;

        int k=0;
        if(n<0) {
            //chuyen n ve so duong
            //giam mot nua gia tri cua n ve so chan floor
            k = n % 2 == 0 ? -(n/2) : (-n-1)/2;
            x = 1/x;
        } else {
            k = n % 2 == 0 ? n/2 : (n-1)/2;
        }

        double t = myPow(x, k);
        return n%2 == 0 ? t*t : (x * t * t); //neu n la so le thi nhan them voi x
    }

    public static void main(String[] args) {
        System.out.println(myPow(5,2));
    }
}
