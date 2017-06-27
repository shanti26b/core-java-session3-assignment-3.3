package assignment$3;

public class Bitwise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Logical And operator
        System. out .println( "Logical AND Operator" );
 
        int a = 5;//0100
        int b = 10;//1010
        int c = 15;//1111
        int d = 20;//10100
        
        boolean ans = b>a && b<c && c<d;
        /* here b is greater than a,
           and b is less than c,
           and c is less than d, here exp1 and exp2 and exp3  is true statement
        */
        System. out .println( " answer is " +ans);
       
        boolean ans1 = b<a && b<c && c<d;
        /* here b is less  than a,
        and b is less than c,
        and c is less than d,
          exp2 is less than a the given expression is false
     */
        System. out .println( " answer is " +ans1);
 
        boolean ans2 = b>a && b>c && c>d;
        /* here b is greater  than a,
        and b is greater than c,
        and c is greater than d,
          here exp1 and exp2 and exp3 is given false statement
     */
        System. out .println( " answer is " +ans2); 
              
        boolean ans3 = b<a && b>c && b<d && c<d;
        /* here b is less  than a,
        and b is greater than c,
        b is less than d,
        and c is less than d,
         therefore the given expression there is  an error at b<a ,b>c so it is false
     */
        System. out .println( " answer is " +ans3);
 
        System. out .println( "***** bitwise AND operator *****");
        /* BITWISE AND OPERATOR*/
        System. out .println( " answer is "  +(a&b));//here value is zero 
        System. out .println( " answer is "  +(b&c));//here value is 10 
        System. out .println( " answer is "  +(b&d));//here value is 0
   
        System. out .println( " answer is "  +(c&d));//here value is 4
       
      
       
        
        
        
	}

}
