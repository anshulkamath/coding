/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachingoutline;

/**
 *
 * @author anshulkamath
 */
public class TeachingOutline {

    /**
     * @param args the command line arguments
     */
    
    /*
        Hello and welcome to Netbeans! This is a comment. When the computer runs 
        the code it does not read whatever is in the comment section so I will 
        be writing you notes in here.
    */
    
    /*
        The basics you have to know before you get started are how to run a 
        program and how to see what is output.
        To run a program just press the big PLAY button in the toolbar up there 
        ^. Don't mind that red line it doesn't do anything (->).
        
        When you run a program the console will pop up on the bottom. 
        The console is where we will see all of the data that is run through our 
        program. Everything we do in Java is run through a console which 
        compiles our code (which means it turns the code into stuff that the 
        computer can read) and then it executes the code (basically just does 
        what the code says to do).
        
        When code is executed the ONLY THING that will be executed will be in
        the function called public static void main (more on functions later). 
        (Every java application has this. Netbeans automatically creates it for 
        you and it is right down there). All you have it know is that is the 
        only place where code will be executed.
    */
    
    public static void main(String[] args) 
    {
        /*
            The thing about computer programming that you will realize and soon
            understand is that EVERYTHING is represented in numbers. CS is all 
            about the hard raw data of everything. Anything, even the letters on
            this page can be represented as a number. This may seem kind of 
            confusing at first but as we work more with programming then it will
            be easier to see. Also you will see Sys.out.println(stuff) which 
            basically just tells the console that it needs to print out whatever 
            is in the parentheses. Also, when you end a line of code you have to 
            put a semicolon there so the computer knows that the line is over.
        */
        
        /*
            When it comes to numbers it is pretty self explanatory. Something
            you must understand is that EVERYTHING is stored in some data type.
            All data is stored in the computer's memory bank (RAM) and I will 
            cover this more in depth later. To start you off I will give you a 
            few data types that you should familiarize yourself with ASAP:
                
                int - The int data type is basically just holds whole numbers.
                      The int data type will not hold decimal values OR anything
                      over 32,700.
                      If you give the int data type a decimal it will truncate 
                      it, which means it will get rid of the decimal (i.e. 4.6 -> 4)
                
                double - The double data type is very similar to the int data 
                         type except for the fact that it holds a bigger number, 
                         AND it holds decimal values.
        
                char - The char data type holds a SINGLE character. THIS DOESN'T
                       HOLD WORDS. The way a character works is that depending 
                       on what letter you assign it, it assigns a number to that 
                       letter (This is called the ASCII chart... you can Google
                       it if you want).
        */
        
        /*
            Here I DECLARED int a and set its initial value to 0. Whenever you 
            create a new data type you need to define it so the computer knows: 
                - what its name is (in this case its name is a)
                - what type of data it holds (in this case an int value)
                - and what its initial value is
        */
        
        
        int a = 0;
        System.out.println("A is: " + a);
        
        int b = 5;
        System.out.println("B is: " + b);
        
        a = 3;
        System.out.println("A is now: " + a);
        
        a = b;
        System.out.println("A is now: " + a);
        
        double aa = 1.1;
        double bb = 2.2;
        
        char letter = 'c';
        
        System.out.println("Char letter displays: " + letter);
        
        /*
            The STRING:
                A string is quite literally a "string" of characters. The way a 
                string works is that it takes multiple characters and makes an
                "array" of them. An array is basically just a set. I will go 
                into more depth later on arrays. But notice that you declare 
                everything the same way:
                    
                    (Data type) (identifier) =    (value);
                      String        name     = "Anshul Kamath";
                NOTE:
                    The difference between a character and a string is very big, 
                    and I will show you why later, but ALWAYS REMEMBER that a 
                    char uses a ' ' and a string uses a " ".
        */
        
        String name = "Anshul Kamath";
        System.out.println("My name is: " + name);
        
        /*
            Arrays: In programming we will work with A LOT of data, so something
            that is very useful to programmers are arrays. An array is a data 
            SET which is useful for storing multiple items of data. An example 
            where an array would be useful is for storing the scores from all 
            quarters of a game.
        
            For now, we will only use homogeneous arrays, or arrays that only 
            contain one data type (such as an array of ints).
        
            One thing that you should always remember in programming is that 
            arrays start from the 0th index.
        
            To declare an array the notation is:
            
            data_type[] identifier = new data_type[#_of_elements];
            
              int[]       arr      = new        int[10];
        
            This creates an array of ints called "arr", and it has 10 elements 
            inside of this array.
        
            NOTE: Since arrays start from the 0th element, the last element of 
            the array will be at index 9.
        
            NOTE: When coders refer to any unknown index in an array, they call
            it "i" for index.
        */
        
        int[] arr = new int[10];
        
        /*
            To populate an array you can either do:
            
            identifier[i] = value;
            arr       [0]     = 1;
        
            OR:
        
            data_type[] identifier = {value, value, ...};
            int[]        arr    = {1, 2, 3, 4, ...};
        */
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        
        System.out.println("The first element of this array is " + arr[0]);
        System.out.println("The second element of this array is " + arr[2]);
        System.out.println("The third element of this array is " + arr[3]);
        
        // OR YOU CAN DO THIS
        int[] arr2 = {1, 2, 3, 4};
        
    }
    
}
