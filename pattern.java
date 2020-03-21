/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    for(int k=t-i;k>1;k--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=(i+1);j++){
		        System.out.print("* ");
		    }System.out.println();
		}
		for(int i=(t-1);i>0;i--){
		    for(int k=t-i;k>0;k--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }System.out.println();
		}
	}
}
