public class recursionLvl1 {
    static int sum = 0;
    public static void main(String[] args) {
//        fun(10);
//        funRev(10);
//        System.out.println(fact(5));
        reverse(2205);
        System.out.println(sum);
//        System.out.println(sumOfDigits(22026));

    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static int fact(int n) {
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
        }

        static void reverse(int n){
        int sum = 0;
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse(n/10);
        }

        static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
        }
    }

