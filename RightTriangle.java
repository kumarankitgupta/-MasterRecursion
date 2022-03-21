public class RightTriangle {

    public static void main(String[] args) {
    System.out.println("This program print triangle of n rows");
    int n = 15 ;    
    drawTriangle(n);
    }

    public static void drawTriangle(int n) {
        if(n > 1)
        drawTriangle(n-1);
        for (int i = 0; i < n; i++)
            System.out.print("*");
            System.out.println();
            return;
    }
}
