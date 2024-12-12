package firstpkg;

public class Insertbetweenstring {

	public static void main(String[] args) {
		// Java String Program to Insert a string into another string
		String original = "God Love";
	    String tobeinsert = "is ";
	    int index=3;
	    String newstring=" ";
	    for(int i=0;i<original.length();i++)
	    {
	    	newstring=newstring+original.charAt(i);
	    	
	    	if(i==index)
	    	{
	    		newstring=newstring+tobeinsert;
	    	}
	    }
	    System.out.println(newstring);
	}

}
