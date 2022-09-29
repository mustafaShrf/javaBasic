import java.util.Scanner;

public class InputFormKeyBoard {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
       
		System.out.println("please enter your name");
		String name=input.next();
        
		System.out.println("Hello "+name+" dont be confused.");
	}

}
