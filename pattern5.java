import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
		    for(int k=i;k>0;k--){
		        System.out.print(" ");
		    }
		    for(int j=n-i;j>=0;j--){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		
		
	}
}









output:4
    *
   **
  ***
 ****


