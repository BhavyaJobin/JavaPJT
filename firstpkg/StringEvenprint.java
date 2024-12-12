package firstpkg;

public class StringEvenprint {

	public static void main(String[] args) {
		// Java String Program to Print even length words
		String myStr = "Familiarity with testing tools such as JIRA, Selenium, Postman, or similar.";
	    String[] str=myStr.split(" ");
	    for(String e:str)
	    {
	    //System.out.println(e);
	    int l=e.length();
	    if(l%2==0)
	    	System.out.println(e);
	        
	    }
	}

}
