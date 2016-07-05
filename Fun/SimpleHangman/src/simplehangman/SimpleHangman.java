/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplehangman;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author anshulkamath
 */
public class SimpleHangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Options
        Object[] options = {"Yes, I would!", "No, I would not", "Cancel"};
        Object[] ok = {"Ok"};
        Object[] cont = {"Continue"};
        Object[] play = {"Play!"};
        
        // Counters
        int incorrect = 0;
        final int TRIES = 7;
        
        boolean isPlaying = true;
        
        //String
        String key;
        String sText = "";
        String guessed = "";

        // ArrayLists
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> text = new ArrayList<>();
        
        // Other
        JLabel word;
        
        int n = JOptionPane.showOptionDialog(null, "Welcome to Hangman! Would you like to continue?", 
                                                "Welcome!", 
                                                JOptionPane.YES_NO_CANCEL_OPTION,
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                options,
                                                options[2]);
        
        System.out.println(n);
        switch(n)
        {
            case 0:
                break;
            case 1:
                JOptionPane.showOptionDialog(null, "Closing!", "Close Screen", 
                        JOptionPane.PLAIN_MESSAGE, 
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        ok,
                        ok[0]);
                System.exit(1);
                break;
            case 2:
                System.exit(1);
        }
        
        JOptionPane.showOptionDialog(null, "Welcome to Hangman!", "Welcome", 
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                cont,
                cont[0]);
        
        key = JOptionPane.showInputDialog("Please enter the word you would like to use").toUpperCase();
        
        JOptionPane.showOptionDialog(null, "Ready to play?", "Hangman", 
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                play,
                play[0]);
        
        char[] letter = key.toCharArray();
        
        for (char temp : letter)
            letters.add(temp);
        
        for (char temp : letters)
        {
            if(Character.isAlphabetic(temp) || Character.isDigit(temp))
                text.add('_');
            else
                text.add(temp);     
        }
        
        for (char temp : text)
            sText += temp + " ";
        
        while (isPlaying)
        {
            char t = JOptionPane.showInputDialog(null, "Your word so far: " + 
                    sText + 
                    " \n  You have " + 
                    (TRIES - incorrect) + 
                    " tries remaining\n You have guessed the following characters:\n" + 
                    guessed + 
                    "\n Please guess a character").toUpperCase().charAt(0);
            
            if (guessed.indexOf(t) > 0)
            {
                JOptionPane.showMessageDialog(null, "You already guessed this character.");
                continue;
            }
            else
                guessed += t;
            
            for (int i = 0; i < letters.size(); i++) 
            {
                if (t == letters.get(i))
                    text.set(i, t);
                else if (!(letters.contains(t)))
                {
                    incorrect++;
                    break;
                }
            }
            
            sText = "";
            
            for (char temp : text)
                sText += temp + " ";
            
            if (incorrect == TRIES)
            {
                JOptionPane.showMessageDialog(null, "You have been hanged! You did not guess the word!");
                isPlaying = false;
            }
            
            if (!(text.contains('_')))
            {
                JOptionPane.showMessageDialog(null, "You have guessed the word!");
                isPlaying = false;
            }
        }
        
        
    }
    
}
