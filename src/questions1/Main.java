/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions1;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Kullanıcı
 */
public class Main {
    public static void main(String[] args) {
        Questions1 q1=new Questions1();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");    //  The number of elements is requested from the user
        int number_of_elements=input.nextInt();                //  The number of elements entered in this variable is thrown
        
        String[] array=new String[number_of_elements];         //  This array is created for elements
        for(int i=0; i<array.length; i++) {
            System.out.println(i+1+". element: ");             //  insertion of elements into the array
            array[i]=input.next();
        }
        q1.sortFunction(array);                                //  sending the array to the function
        
    }

   
}
