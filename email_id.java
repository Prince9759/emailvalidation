package EmailVarification;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_id {
	void validation(String arr[]) 
	{
		Scanner sc  =  new Scanner(System.in); 
		System.out.println("enter user String ");
		String s = sc.next();
		 Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		 Matcher m = p.matcher(s); 
		 boolean b = m.matches();
		 int c=0;
		 for(int i=0;i<arr.length;i++) 
		 {
			 String k=arr[i];
			 if(k.equals(s)) 
			 {
				 c++;
			 }
			
		 }
		 if(c>0) 
		 {
			 System.out.println("email id is present in the array");
		 }
		 else 
		 {
			 System.out.println("not present in the array");
		 }
		 if(b==true) 
		 {
			 System.out.println("email id is valid");
		 }
		 else 
		 {
			 System.out.println("notvalid ");
		 }
		 
	}

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		String  arr[] = {"ramu@gmail.com","print7869@yahoo.com","jai.imp@redmil.com","ye_rj@g.co.in"};
		
			email_id obj =  new email_id();
			obj.validation(arr);

	}

}
