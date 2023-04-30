// name : Khadiga Mohamed 
// id ; 20216283
import java.util.Arrays;
import java.util.*;
public class first {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();    
        int [] arr = new int[size];   
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();    
        }
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
