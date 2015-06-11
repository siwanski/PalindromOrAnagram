import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author Szymon IwaÒski
 *
 */
public class PalindromOrAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader buffer1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader buffer2 = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "";
		String s2 = "";
		
		try {
			System.out.println("Wprowadü s≥owo nr 1:");
			s1 = buffer1.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Wprowadü s≥owo nr 2:");
			s2 = buffer2.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		if (isPalindrom(s1)) System.out.println("S≥owo nr 1 jest palindromem.");
		else System.out.println("B≥πd nr 1");
		if (isPalindrom(s2)) System.out.println("S≥owo nr 2 jest palindromem.");
		else System.out.println("B≥πd nr 2");
		if (isAnagram(s1,s2)) System.out.println("S≥owo nr 1 jest anagramem s≥owa nr 2.");
		else System.out.println("B≥πd nr 3");
	}

	public static boolean isPalindrom(String text) {
		boolean result = true;
		int length = text.length();
		
		if (text == null || text.length() == 0) return false;
		
		for (int i = 0; i < length; i++) {
			if(text.charAt(i) != text.charAt(length - 1 - i)) return false;
		}
		
		return result;
	}
	
	public static boolean isAnagram(String text1, String text2) {
		boolean result = true;
		char[] chars1 = text1.toCharArray();
		char[] chars2 = text2.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		String str1 = new String(chars1);
		String str2 = new String(chars2);
		
		result = str1.equals(str2);
		
		// another solution below
		/*
		String aText = "";
		String bText = "";
		if (text1 == null || text1.length() == 0 && text2 == null || text2.length() == 0) return false;
		else if (text1.length() != text2.length()) return false;
		
		for (int i = 0; i < text1.length(); i++) {
			for (int j = 0; j < text2.length(); j++) {
				if (text1.charAt(i) == text2.charAt(j)) {
					aText = text1.substring(i, i+1);
					bText = text2.replace(aText, "");
				}
			}
		}
		
		if(bText.equals("")) result = true;
		else result = false;
		*/
		
		return result;
	}
}
