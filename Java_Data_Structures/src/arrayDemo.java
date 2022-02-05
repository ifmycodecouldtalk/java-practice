import java.util.*;

public class arrayDemo {
	public static void main (String[] args) {
	    int[] priceOfPen= new int[5];
	    Scanner nin = new Scanner(System.in);
	    for(int i = 0; i < priceOfPen.length; i++)
	        priceOfPen[i] = nin.nextInt();

	    for(int i = 0; i < priceOfPen.length; i++)
		    System.out.print(priceOfPen[i] + " ");
	}
}