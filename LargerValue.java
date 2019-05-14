/**Program to check larger value 
author Idris Wonuola  5/14/2019
 */


/*Program to check for vlaue of M to compute N

Author: Idris Wonuola,  Date: 14/5/2019*/

import java.util.Scanner;


public class LargerValue{
    public static void main(String... args){

        Scanner accept = new Scanner(System.in);  //import java libraies like Scanner for easy acceptance of user value

        System.out.println("Enter you first M :");// value of m is accepted here after the prompt sign
        int m  = accept.nextInt();

        if(m > 0){
            int n = 1;
            System.out.println(n);
        }    

        else if(m == 0){
            int n = 0;
            System.out.println(n);
        }

        else if(m < 0){
            int n = -1;
            System.out.println(n);
        }
        else{
            System.out.println("try again");
        }
   }
}