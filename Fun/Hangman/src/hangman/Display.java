/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author anshulkamath
 */
public class Display extends JFrame
{
    
    private JFrame window;
    private Canvas canvas;
    private JLabel word;
    
    // Strings
    private String key;
    private String sText = "";

    // ArrayLists
    private ArrayList<Character> letters = new ArrayList<>();
    private ArrayList<Character> text = new ArrayList<>();
    
    private final int WIDTH = 640,
            HEIGHT = 640;
    
    public Display (String title, String key)
    {
        this.key = key;
        convert();
        
        // JLabel
        word.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        word.setAlignmentX(0); word.setAlignmentY(0);
        
        // JFrame
        window = new JFrame();
        window.setSize(new Dimension(WIDTH, HEIGHT));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setTitle(title);
        window.setResizable(true);
        
        // JLabel
        canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        
        // Adding components to window
        window.add(canvas);
        
        window.pack();
    }
    
    private void convert()
    {
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
            sText += temp;
        
        word = new JLabel(sText, JLabel.SOUTH_EAST);
    }
    
}
