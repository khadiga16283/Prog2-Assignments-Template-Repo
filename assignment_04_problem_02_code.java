// name : Khadiga mohamed 
// id : 20216283
import java.util.Scanner;  
public class ArrayInputExample1   
{  
    public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);  
        int num=sc.nextInt(); 
        
        int[] array = new int[num];  
        for(int i=0; i<num; i++){  
            array[i]=sc.nextInt(); 
        }
        for(int i=0 ; i < array.length ; i++){
            if (array[i] <= 10 ){
                System.out.println("A[" + i +"]"+ " = " + array[i]);
            }
        }
    }  
}