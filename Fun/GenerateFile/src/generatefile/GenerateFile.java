/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatefile;

import java.io.*;
import java.lang.*;
import java.util.*;

public class GenerateFile
{
    public static void main (String args[])
    {   
        File file = new File("generate.txt");
        try
        {
            int rand = 0;
            String complex = new String("");
            
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < 20; i++)
            {
                for (int j = 0; j < 20; j++)
                {
                    if (i == 0 || j == 0 || i == 19 || j == 19)
                        rand = 1;
                    else
                        rand = ((int)(Math.random() * 100)) % 3;
                    
                    complex += rand;
                    complex += " ";
                }
                fw.write(complex + "\n");
                complex = "";
            }
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
}