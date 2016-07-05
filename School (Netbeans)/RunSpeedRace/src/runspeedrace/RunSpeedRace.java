/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runspeedrace;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class RunSpeedRace 
{
    
    public static double runSpeed(double height, double weight, double stride)
    {
        double a = weight / height;
        double speed = a * stride;
        return speed;
    }
    
    public static double race(double person1, double person2, double person3, double person4, double person5)        
    {
        double random = Math.random();
        double finalRandom = (random * 100) % 4;
        
        double[] racer = new double[5];
        racer[0] = person1;
        racer[1] = person2;
        racer[2] = person3;
        racer[3] = person4;
        racer[4] = person5;
        
        racer[(int)finalRandom] -= 5;
        
        if(racer[(int)finalRandom] <= 0)
        {
            racer[(int)finalRandom] = 0;
        }
        
        Arrays.sort(racer);
        double winner = racer[racer.length - 1];
        return winner;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        double[] john = new double[3];
        double[] simon = new double[3];
        double[] ansil = new double[3];
        double[] josh = new double [3];
        double[] kyle = new double [3];
            
        System.out.println("Please input value height for John (inches)");
        john[0] = sc.nextDouble();
        System.out.println("Please input value weight for John (pounds)");
        john[1] = sc.nextDouble();
        System.out.println("Please input value stride for John (feet)");
        john[2] = sc.nextDouble();
        
        System.out.println("Please input value height for Simon (inches)");
        simon[0] = sc.nextDouble();
        System.out.println("Please input value weight for Simon (pounds)");
        simon[1] = sc.nextDouble();
        System.out.println("Please input value stride for Simon (feet)");
        simon[2] = sc.nextDouble();
        
        System.out.println("Please input value height for Ansil (inches)");
        ansil[0] = sc.nextDouble();
        System.out.println("Please input value weight for Ansil (pounds)");
        ansil[1] = sc.nextDouble();
        System.out.println("Please input value stride for Ansil (feet)");
        ansil[2] = sc.nextDouble();
        
        System.out.println("Please input value height for Josh (inches)");
        josh[0] = sc.nextDouble();
        System.out.println("Please input value weight for Josh (pounds)");
        josh[1] = sc.nextDouble();
        System.out.println("Please input value stride for Josh (feet)");
        josh[2] = sc.nextDouble();
        
        System.out.println("Please input value height for Kyle (inches)");
        kyle[0] = sc.nextDouble();
        System.out.println("Please input value weight for Kyle (pounds)");
        kyle[1] = sc.nextDouble();
        System.out.println("Please input value stride for Kyle (feet)");
        kyle[2] = sc.nextDouble();
        
        double[] speed = new double[5];
        speed[0] = runSpeed(john[0], john[1], john[2]);
        speed[1] = runSpeed(simon[0], simon[1], simon[2]);
        speed[2] = runSpeed(ansil[0], ansil[1], ansil[2]);
        speed[3] = runSpeed(josh[0], josh[1], josh[2]);
        speed[4] = runSpeed(kyle[0], kyle[1], kyle[2]);
        
        Arrays.sort(speed);
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Racer " + i + ":" + speed[i]);
        }
        
        double winner = race(speed[0], speed[1], speed[2], speed[3], speed[4]);
        
        System.out.println("The winner's speed " + winner + "!");
        
    }
    
}
