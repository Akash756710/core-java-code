package strings;

public class DuplicateChar {

	public static void main(String[] args)throws Exception {
		
      String result =removeDup("abcdefff");
      System.out.println(result);}
	public static String removeDup(String str) {
		
		String result=" ";
		for(int i=0;i<str.length();i++)
			if(!result.contains(""+str.charAt(i)))
				result +=""+str.charAt(i);
		return result;
	}

}
