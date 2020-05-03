
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    for(int k=t-i;k>0;k--){
		        System.out.print(" ");
		    }
		    
		    for(int j=0;j<=i;j++){
		        System.out.print("* ");
		    }System.out.println();
		}
	
	}
}



output: 4
   * 
  * * 
 * * * 
* * * * 


