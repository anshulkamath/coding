/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author anshulkamath
 */
public class Hangman 
{

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
        
        //String
        String key;
        
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
        
        key = JOptionPane.showInputDialog("Please enter the word you would like to use");
        
        JOptionPane.showOptionDialog(null, "Ready to play?", "Hangman", 
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.QUESTION_MESSAGE,
                null,
                play,
                play[0]);
        
        Display window = new Display("Hangman", key);
        
    }
    
}
