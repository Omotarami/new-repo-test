package revision;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
	
	public static void main (String[] args){
		String user = "awofeso_titilola@gmail.com";
		String Seq= "[A-Za-z0-9._]+@[a-z.]+\\.[a-z]{2,3}$";
		Pattern pt = Pattern.compile(Seq);
		Matcher mt = pt.matcher(user);
//		return mt.find();
		
		if (mt.find()) {
			System.out.print("Regex is correct!");
		}else {
			System.out.print("This Regex is not correct! ");
		}
		
		
		
		
	}

}
