/*
 * Evan Robertson
 * FourTuples.java
 * April 16th 2020
 * This program takes 4 numbers and uses an alogorithm that lowers each number using recursion
 * until one of them reaches zero. The output is how many recursions it took to reach zero.
 */

package fourtuples;
import javax.swing.*;
/**
 *
 * @author Evan
 */
public class FourTuples {
    public static int recursions = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input for all four numbers
        int a = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the non-negative first number")));
        int b = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the non-negative second number")));
        int c = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the non-negative third number")));
        int d = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the non-negative fourth number")));
        //Find how many steps it takes to reach zero
        int steps = fourTuple(a,b,c,d);
        //Output answer
        JOptionPane.showMessageDialog(null, "It took " + steps + " recursions to reach zero");
        
    }
    public static int fourTuple(int a, int b, int c, int d) {
        //Check if any of the numbers have reached zero
        if (a == 0 || b== 0 || c==0 ||d==0){
            return recursions;
        }
        //Otherwise perform the algorithm, increase the amount of steps by 1
        //And call the method again to see if it has reached zero
        else {
            a = Math.abs(a-b);
            b = Math.abs(b-c);
            c = Math.abs(c-d);
            d = Math.abs(d-a);
            fourTuple(a,b,c,d);
            recursions +=1;
            return recursions;
        }
        
    }
    
}
