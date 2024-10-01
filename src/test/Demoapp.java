package test;

import java.util.Scanner;

public class Demoapp {

	public static void main(String[] args) {

		try{Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter phone number");
		
		String number=sc.nextLine();
		
		
				if(number.length() !=10) {
					throw new InvalidPhoneNumberDigits("not 10 digits");
				}
				if(!number.startsWith("0")) {
					throw new InvalidPhoneNumberStart("not 0");
				}
				
		}catch(InvalidPhoneNumberDigits e) {
					System.out.println(e.getMessage());
				}
				catch(InvalidPhoneNumberStart e) {
					System.out.println(e.getMessage());
					
				}
				finally {
					
				}

		
	}

}
