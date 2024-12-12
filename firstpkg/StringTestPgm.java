package firstpkg;

public class StringTestPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		String s2="To Paradise";
		String s3="welcome";
		String s4="     God";
		
		//concat()
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(2+3+s1+4+5);   //5Welcome45
		
		//equals()
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3));  //true
		
		//toUpper and toLower
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//length
		System.out.println(s2.length());
		
		//startswith and endswith
		System.out.println(s2.startsWith("T"));
		System.out.println(s2.endsWith("x"));
		
		//contains
		System.out.println(s2.contains("dise"));
		
		//trim
		System.out.println(s4.trim());
		
		//replace
		System.out.println(s4.replace("G", "Go"));
		
		//charAt
		System.out.println(s2.charAt(7));
		
		//substring
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(3, 10));
		System.out.println(s2.substring(3, 5));
				
		//chararray
		String s6="Love";
		char[] carray=s6.toCharArray();
		for(char ele:carray)
		System.out.println(ele);
		
		//split
		String s5="Hello, Welcome to Luminar Technolab";
		String[] strarray=s5.split(",");
		for (String e:strarray)
			System.out.println(e);
		
		
		
		
	}

}
