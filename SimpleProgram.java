/**
 * SimpleProgram
 */
public class SimpleProgram {

    public static void printupto(int n) {
        if(n > 1){
            printupto(n-1);
        }
        System.out.println(n);
        return;
    }
    public static void main(String[] args) {
        System.out.println("This program will print 1 to n using Recursion");
        int n = 10;
        printupto(n);
    }
}