import java.util.*;
public class Patterns
{
	public static void main(String[] args) {
	   
	   // first half
	    int n=4;
        for(int i=1; i<=n; i++){
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
	     }
	     for(int i=n; i>=1; i--){
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
	     }
	}    	    
}

      
