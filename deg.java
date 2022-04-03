package degercy;
import java.util.Scanner;
public class deg {
	public static void main(String[] args) {
 
	Scanner v = new Scanner (System.in);		
	int N;
	System.out.println("The Value of Energy Level = ");
	N=v.nextInt();
	
 	int Values=0;	
	int count_a=0; int count_b=0; int count_c=0;
   	
	for(int k=1; k<=N; k++) {		
		int z=k*k;
		count_a=z;

	for(int j=1; j<=N; j++) {		
		int y=j*j;
		count_b=y;
	
	for(int i=1; i<=N; i++) {	
		int x=i*i;
		count_c=x;
		
	int sum =count_a+count_b+count_c;			

	if(sum==N) {
		System.out.println( "A= "+k+" , B= "+j+" , C= "+i+" , Given = "+sum );
			Values++;	
			}
		}
	}}
	
	System.out.println("Number Of Degenercy = " + Values );
	if(Values==0) {
		
		System.out.println("Not Avalible"  );
	}
}}