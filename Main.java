/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String word = "";
	    String ans = "";
	    
	    for(int i=0; i<str.length();i++){
	        if(str.charAt(i)==' '){
	            ans= word+" "+ans;
	            word ="";
	        }else{
	            word+=str.charAt(i);
	        }
	    }
	    ans= word+" "+ans;
	            word ="";
	    
	    System.out.println(ans);
	           
	
	}
}
