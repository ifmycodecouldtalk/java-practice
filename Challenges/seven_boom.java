package testing_code;

import java.util.Arrays;

public class main_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 1, 3, 2, 1, 6, 1};
		String a = Arrays.toString(arr);
		boolean flag = false;
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) == '7') 
			{
				flag = true;
			}
		}
		if(flag)
			System.out.println("Boom!");
		else System.out.println("there is no 7 in the array");
	}

}
