package class8;

  public class evenAndOddNumber {
	public static void main(System[]arge) {
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 1;i<=50; i++) {
			if(i%2==0) 
			{
				sumEven +=i;
				System.out.println("sum of the even numnber = "+sumEven);
			}else 
			{
				sumOdd +=i;
				System.out.println("sum of the odd numnber = "+sumOdd);
			}
			
		}
		
		
	}
	

}
  
