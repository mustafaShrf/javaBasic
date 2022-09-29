package test;

public class weekendTest8 {

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 1;i<=50; i++) {
			if(i%2==0) 
			{
				sumEven +=i;
				
			}else 
			{
				sumOdd +=i;
				
			}
			
		}
		System.out.println("sum of the even numnber = "+sumEven);
		System.out.println("sum of the odd numnber = "+sumOdd);
		
	}
	

}
