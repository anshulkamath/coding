/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class StringClass{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println(isPalindromeRecursion(""));
    }

    public static String replace(String str, char b, char c) {
        char[] a = str.toCharArray();
        char[] f = new char[a.length];
        for (int i = 0; i < f.length; i++)
            if (a[i] == b)
                f[i] = c;
            else
                f[i] = a[i];

        return new String(f);
    }

    public static boolean regionMatches(String str1, String str2, int start, int end) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        if (a == b)
            return true;
        
        for (int i = start; i < end; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    public static String encrypt(String encrypt, int num) {
        char[] string = encrypt.toCharArray();
        char[] encrypted = new char[string.length];

        for (int i = 0; i < string.length; i++)
            encrypted[i] = (char) ((int) (string[i]) + num);

        return new String(encrypted);
    }

    public static void bubblesort(String x[]) {
        int j;
        boolean bool = true;  // will determine when the sort is finished
        String temp;

        while (bool) {
            bool = false;
            for (j = 0; j < x.length - 1; j++) {
                if (x[j].compareToIgnoreCase(x[j + 1]) > 0) {
                    temp = x[j];
                    x[j] = x[j + 1];     // swapping
                    x[j + 1] = temp;
                    bool = true;
                }
            }
        }
    }

    public static void sort() {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int pos = 0;
        String complex = "";

        System.out.println("Please enter 5 words: ");
        String[] str = {sc.next(), sc.next(), sc.next(), sc.next(), sc.next()};

        for (int i = 0; i < 5; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                pos = i;
            }
            complex += str[i].charAt(i);
        }

        System.out.println(complex);
        System.out.println(str[pos]);
        bubblesort(str);

        for (String name : str) {
            System.out.println(name);
        }
    }

    public static String reverseString() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a string for me to reverse: ");
        String norm = sc.nextLine();
        String rev = "";
        for (int i = norm.length(); i > 0; i--) {
            rev += norm.charAt(i - 1);
        }
        return rev;
    }
    
    public static void countChars() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Please enter a word for me to count: ");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        
        int lCount = 0,
           nCount = 0,
           sCount = 0,
           total = chars.length;
        
        
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i]))
                lCount++;
            else if (Character.isDigit(chars[i]))
                nCount++;
            else if(chars[i] == ' ')
                sCount++;
        }
        
        System.out.println("There are " + lCount + " letters in this string.");
        System.out.println("There are " + nCount + " numbers in this string.");
        System.out.println("There are " + total + " total characters in this string (" + sCount + " spaces).");
    }
    
    public static void count()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Please enter a word for me: ");
        String word = sc.next();
        char[] words = word.toCharArray();
        
        System.out.println("Please enter a character for me to count: ");
        char c = sc.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < words.length; i++)
            if (words[i] == c)
                count++;
        
        System.out.println("There are " + count + " occurrences of this character in this sentence.");
    }
    
    public static void flipName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name for me to reverse");
        String first = sc.next();
        String last = sc.next();
        
        System.out.println("The name reversed is " + last + ", " + first);
    }
    
    public static void encryption ()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a word: ");
        String word = sc.next();
        System.out.println("The word you entered is: " + word);
        char[] letters = word.toCharArray();
        
        while (true)
        {
            System.out.println("Would you like me to encode or decode this? (e or d)");
            char c = sc.next().charAt(0);
            if (c == 'e')
            {
                for (int i = 0; i < letters.length; i++)
                    letters[i] += 3;
                System.out.println("The encoded word is: " + new String(letters));
                break;
            }
            else if (c == 'd')
            {
                for (int i = 0; i < letters.length; i++)
                    letters[i] -= 3;
                System.out.println("The decoded word is: " + new String(letters));
                break;
            }
        }
    }
    
    public static void isPalindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        
        char[] reverse = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
            reverse[i] = word.charAt((word.length() - 1) - i);
        
        if (word.equals(new String(reverse)))
            System.out.println("This word is a palindrome.");
        else
            System.out.println("This word is not a palindrome.");
    }
    
    public static void dictionary() throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("dictionary.txt")).useDelimiter(",");
        HashMap<String, String> dict = new HashMap<>();
        
        while(sc.hasNext())
            dict.put(sc.next().trim(), sc.next().trim());
        
        sc.close();
        sc = new Scanner(System.in);
        
        System.out.println("Please enter a word that you would like me to define: ");
        String word = sc.next();
        
        if (dict.containsKey(word))
            System.out.println("The definition of " + word + " is " + dict.get(word));
        else
            System.out.println("The word does not exist.");
    }
    
    public static void grep() throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which word would you like me to find? ");
        String key = sc.next();
        String temp;
        
        int i = 0;
        
        sc.close();
        sc = new Scanner(new File("story.txt"));
        
        while(sc.hasNextLine())
        {
            i++;
            temp = sc.nextLine();
            
            if (temp.contains(key))
            {
                System.out.println("The word " + key + " is on line " + i);
                return;
            }
        }
        System.out.println("That word does not exist in this story.");
    }
    
    public static boolean isPalindromeRecursion (String a)
    {

        if (a.length() <= 1)
            return true;
        else if (a.charAt(0) == a.charAt(a.length() - 1))
            return isPalindromeRecursion(a.substring(1, a.length() - 1));
        else
            return false;
        
    }
}
