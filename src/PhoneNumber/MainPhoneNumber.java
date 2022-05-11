package PhoneNumber;

public class MainPhoneNumber 
{
	public static void main(String [] args)
	{
		long start = System.currentTimeMillis();
		String phoneNumber=Solution7.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
		//String phoneNumber=MySolution.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
		System.out.println(phoneNumber);
		long end = System.currentTimeMillis();
	    System.out.println((end - start) + " ms");
	}

}
