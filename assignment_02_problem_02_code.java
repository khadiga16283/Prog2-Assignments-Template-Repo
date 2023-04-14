//name : khadiga mohamed 
//id : 20216283 
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        for (int i = 1; i <= 12; i++) {
        int sum = N * i ; 
        System.out.println( N + " * " + i + " = " + sum );
        }
    }
}
