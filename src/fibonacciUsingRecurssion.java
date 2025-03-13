public class fibonacciUsingRecurssion {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
        // this is not a tail recursion because ut us adding the two value in the end after calling the methods

    }
}
