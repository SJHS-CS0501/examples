
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author woytek
 */
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter an integer to factorialize: " );
        int foo = in.nextInt();
        int ans = fact(foo);
        System.out.println( foo + "! = " + ans );
        
        //System.out.print( "Enter a maximum figure for the fibonacci: " );
        //foo = in.nextInt();
        System.out.print( "FIBONACCI RULEZ: " );
        fibonacci( 1, 1, ans );
    }
    
    public static int fact( int x ) {
        if( x <= 1 ) {
            return 1;
        } else {
            int ans = x * fact(--x);
            return ans;
        }
    }
    
    public static void fibonacci( int a, int b, int max ) {
        int num = a + b;
        if( num <= max ) {
            System.out.print( num + ", " );
            fibonacci( b, num, max );
        } else {
            System.out.print(" [END]\n" );
        }
    }
    
}
