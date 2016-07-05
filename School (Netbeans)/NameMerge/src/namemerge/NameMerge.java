/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namemerge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class NameMerge 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner (new File("name1.txt"));
        PrintWriter pw = new PrintWriter(new File("mergedfile.txt"));
        // TODO code application logic here
        ArrayList<String> merged = new ArrayList<>();
        
        while (sc.hasNext())
            merged.add(sc.next());
        sc.close();
        
        sc = new Scanner(new File("name2.txt"));
        
        while (sc.hasNext())
            merged.add(sc.next());
        sc.close();
        
        sc = new Scanner(System.in);
        
        Collections.sort(merged);
        
        for(int i = 1; i < merged.size(); i++)
        {
            if (merged.get(i).equals(merged.get(i - 1)))
                merged.remove(i - 1);
        }
        
        for (int i = 0; i < merged.size(); i++)
            pw.println(merged.get(i));
        
        pw.close();
        
        System.out.println("Do you want the names to be displayed? (y or n)");
        if (sc.next().charAt(0) == 'y')
        {
            for (int i = 0; i < merged.size(); i++) 
                System.out.println(merged.get(i));
        }
        else
        {
            System.exit(0);
        }
        
        
    }
    
}
