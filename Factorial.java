public class Factorial {
    
    public static void main(String[] args) {
        System.out.println("This program will print the factorial of a number n");
        int n = 5;
        System.out.println(findfact(n));
        
    }

    public static int findfact(int n) {
        if(n == 1)
        return 1;
        return n * findfact(n -1 );
    }
}
