package in.leginto.randompassword;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		
		System.out.print("Enter the length of password:");
		
		int n = sin.nextInt();
		
		PasswordGenerator pg = new PasswordGenerator();
		System.out.println("New password: "+pg.generateRandom(n));
		
		sin.close();
		
	}

}

class PasswordGenerator
{
	String passwordData = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_=+?><]}{[";
	public String generateRandom(int length)
	{
		
		StringBuffer sb = new StringBuffer();
		
		Random ran = new Random();
		
		for(int i = 0; i < length ; i++)
		{
			sb.append(passwordData.charAt(ran.nextInt(passwordData.length())));
		}
		
		return sb.toString();
	}
}
