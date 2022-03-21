public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("This program will tell the nth fibonacci number");
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n < 2)
        return n;
        return fib(n-1) + fib(n-2);
    }
}
