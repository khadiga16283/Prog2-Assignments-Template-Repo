// name : khadiga mohamed 
// id : 20216283 
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        for (int i = N ; i > 0 ; i--) {
            for (int K = 0; K < i; K++) {
                System.out.print("*");
            }   
            System.out.println();
        }
    }
}
