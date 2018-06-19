
public class fizzbuzz {
	
	public static void main(String args[])
	{
		int j = 0;
		int k = 0;
		
		for(int i = 1; i <= 100;i++){
			String print = "";
			
			if(i > 29 && i < 40) print+="fizz";
			if(i > 49 && i < 60) print+="buzz";
			if(i >= 3) {
				if(j % 10 == 0 && i!=33) print+="fizz";
				j++;
			}
			if(i >= 5) {
				if(k % 10 == 0 && i!=55) print+="buzz";
				k++;
			}
			
			if(print == "") print+= i;
			
			System.out.println(print);
		}
	}
}
