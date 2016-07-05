/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnum;

import javax.swing.JOptionPane;

/**
 *
 * @author anshulkamath
 */
public class GuessNum 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int play = JOptionPane.showConfirmDialog(null, "Would you like to play the guessing game?");
        if (play == 0)
        {
            JOptionPane.showMessageDialog(null, "Just guess a number anywhere from 1 to 100!");
            int ans = (int)((Math.random() * 100) + 1);
            int guess = 0;
            int c = 0;
            int confirm = 0;
            do
            {
                String g = JOptionPane.showInputDialog("Please enter a guess.");
                
                if (g == null)
                {
                    confirm = JOptionPane.showConfirmDialog(null, "Would you still like to play?");
                    if (confirm == 0)
                        continue;
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Ok. Come again later!");
                        break;
                    }
                }
                else
                    guess = Integer.parseInt(g);
                            
                
                if (guess > ans)
                    JOptionPane.showMessageDialog(null, "Incorrect. Your guess is higher than the answer.");
                else if (guess < ans)
                    JOptionPane.showMessageDialog(null, "Incorrect. Your guess is lower than the answer.");
                else
                {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the answer in " + c + " tries!");
                    break;
                }
                c++;
            }
            while (true);
        }
        else if (play == 1)
        {
            JOptionPane.showMessageDialog(null, "Ok. Come again later!");
        }
    }
    
}
