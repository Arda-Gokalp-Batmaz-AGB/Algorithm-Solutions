package Caesar_Cipher;

import java.util.Scanner;

import javax.security.auth.Subject;

public class Caesar_Cipher {

	public static String caesarCipher(String s, int k) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String newAlphabet = "";
		k = k % 26;
		String tempPart = alphabet.substring(0,k);
		newAlphabet = alphabet.substring(k,alphabet.length());
		newAlphabet = newAlphabet + tempPart;
		String result = "";
		for (int i = 0; i < s.length(); i++) 
		{
			boolean uppercase = false;
			if(Character.isUpperCase(s.charAt(i)))
			{
				uppercase = true;
			}
			for (int j = 0; j < alphabet.length(); j++) {
				//    			if(s.charAt(i)=='-')
				//    			{
				//    				result = result + '-';
				//    				break;
				//    			}
				if(!(Character.toLowerCase(s.charAt(i))<=122 && Character.toLowerCase(s.charAt(i))>=97))
				{
					result = result + s.charAt(i);
					break;
				}
				if(uppercase == true && Character.toUpperCase(alphabet.charAt(j)) == s.charAt(i))
				{
					result = result + Character.toUpperCase(newAlphabet.charAt(j));
				}
				if(s.charAt(i)==alphabet.charAt(j))
				{
					result = result + newAlphabet.charAt(j);
					break;
				}
			}
		}
		return result;


	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		System.out.println(caesarCipher(s,k));
	}

}
