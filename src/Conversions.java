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
	
	public static String binaryToDecimal(String n)
	{
		int power = 0;
		long output = 0;
		Long lastDigit;
		StringBuilder sb = new StringBuilder(n);
		
		while(!(sb.toString()).equals(""))
		{
			lastDigit = Long.parseLong(sb.substring(sb.length()-1));
			output += lastDigit*(Math.pow(2, power));
			sb.deleteCharAt(sb.length()-1);
			power++;
		}
		return "" + output;
	}
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type BtD to convert from Binary to Decimal, and DtB to convert from Decimal to Binary.");
		String input = kb.nextLine();
		System.out.println("What number would you like to convert?");
		
		if(input.equalsIgnoreCase("btd"))
		{
			String toConvert = kb.nextLine();
			System.out.println(binaryToDecimal((toConvert)));
		}
		else if(input.contentEquals("dtb"))
		{
			Long toConvert = kb.nextLong();
			System.out.println(decimalToBinary(toConvert));
		}
		kb.close();
	}

}