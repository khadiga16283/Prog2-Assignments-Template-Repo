// name : khadiga mohamed 
// id : 20216283 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2  = sc.nextInt();
        int sum = 0;
        if (num1 < num2){
            for (int i = num1; i < num2 ; i++) {
                if (i%2==1 ){
                    sum = sum + i;
                }        
            }
        }else if(num1 > num2){
           for (int i = num2; i < num1 ; i++) {
                if (i % 2 ==1 ){
                    sum = sum + i; 
                }
            }
        }
        System.out.print(sum);
    
    }
}