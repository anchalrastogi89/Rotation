package Game.Rotation;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author AnchalRastogi
 *
 */
public class App 
{
	/* Static function for finding the winner. 
	 * Used delegate as a return type */
	
	@SuppressWarnings("unchecked")
	public static <E> E winnerChild(int n, int k) { 
		if (n >=1 && k >=1) { 
			ArrayList<Integer> circle = new ArrayList<Integer>();
		    for (int i=1; i<= n; i++) 
		    	circle.add(i); 
	        System.out.println("Children in circle:" + circle);        
	        int killIndex = k-1; 
	        System.out.println("Children removed in order:");
	        while (circle.size() > 1) 
	        {
	        	System.out.print(circle.get(killIndex) + " ");
	        	circle.remove(killIndex);
	        	killIndex += k-1;	           
        		killIndex %= circle.size();			
	        }
	        System.out.println();
	        System.out.println("Winner is :" + circle.get(0));	
	        return (E) circle.get(0);        
		}  else {
			return (E) new StringBuilder("Invalid Value Provided").toString();
		}
    } 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		/* Reading user input for n and k */
		System.out.println("Enter number of children");
	    int n = myObj.nextInt();  
	    System.out.println("Enter count to be skip");
	    int k = myObj.nextInt();      
		winnerChild(n,k);	//Calling function
	}
}
