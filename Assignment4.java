package session7;

public class Assignment4 {
public static void main(String[] args)
{
	String myString="Length";
	try{
		int s=myString.charAt(10);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String index is out of bound");
	}
}
}