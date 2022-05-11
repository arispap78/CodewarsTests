package SmilingFaces;

import java.util.ArrayList;
import java.util.List;

public class MainSmilingFaces 
{
	public static void main(String [] args)
	{
		List<String> arr= new ArrayList <String> ();
		arr.add(";D");
		arr.add(":-(");
		arr.add(":-)");
		arr.add(";~)");
		long start=System.currentTimeMillis();
		int smiles=MySolution.countSmileys(arr);
		//int smiles=Solution1.countSmileys(arr);
		System.out.println(smiles);
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}
	

}
