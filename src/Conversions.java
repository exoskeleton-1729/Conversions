import java.util.*;

public class Conversions {
	
	public static String decimalToBinary(long n)
	{
		StringBuilder sb = new StringBuilder();
		while(n > 0)
		{
			sb.append(""+ n % 2);
			n = n/2;
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type BtD to convert from Binary to Decimal, and DtB to convert from Decimal to Binary.");
		String input = kb.nextLine();
		System.out.println("What number would you like to convert?");
		long number = Long.parseLong(kb.nextLine());
		if(input.equalsIgnoreCase("btd"))
			System.out.println();	
		else if(input.contentEquals("dtb"))
			System.out.println(decimalToBinary(number));
		kb.close();
	}

}