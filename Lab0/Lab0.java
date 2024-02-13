
/**
 * Lab0 - Getting Started With Java
 * This is a simple program to print paramters from the String along with Hello World .
 * @author Laxman Poudel 
 * @version 1.0
 */


public class Lab0
{
    /**
     * Prints Hello World! along with the argument we pass
     * @param args The arguments we are having here is a String used is being printed after the text.
     * 
     */

    public static void main(String[] args) {
        System.out.println("Hello World !");
        for(int i=0; i<args.length; i++)
        // For loop to perform iteration
        {
            System.out.println(args[i]);   
            //Prints an argument using iteration.
        }
    }
}
