package basic;

public class Day2_Class {
	public static void main(String[] args) {

	/*
		 *  Notes: Output & Basic Data types:Agenda--evaluate expression, concatination operator & variable
		 * Operators: (+-/,*) operands are values, like 10+30-- 10 and 30 are the operands
		 * runtime error-issue with the logic and compilation error--issue with syntax
		 * order of execution of operators: 
		 * 1-->Brackets,
		 * 2-->* ,/
		 * 3-->+-
		 * --->if * and / suppose (6*7/6) then we should consider left to right---i.e 6*7=42,42/6=7 so ans is 7
		 * Concatination--> System.out.println("Hello"+"World");---> HelloWorld
		 * + acts as concatination operator in case if one of the operands is a text
		 * System.out.println("\"Hello\"");--->"Hello"
		 * No other operator works as concationation operator expect +
		 * System.out.print("Hello"+3);---Hello3
		 * introduction to variable:
		 * int a; ---declaration
		 * a=10;---initialization
		 * int a =10; we can do both declaration and initialization at a time

			int a =10;
			System.out.ptintln(a+b); //b cannot be resolved to a variable
	        int b =20;
			
	        We cannot have same name for two different variables
			int x=10;
			int x=20;
			System.out.println(x);  //Duplicate local variable x
	*/
/*   	Question 1---
 		Hello 40
		50 World !
		
		System.out.println("Hello  "+40);
		System.out.print(50+" World !");
*/
		
/* Question 2--
       Hello

    	World !
 */
//		System.out.println("Hello");
//		System.out.println();
//		System.out.print("World !");
		
		System.out.println("Hello");
		System.out.print("World !");
		System.out.println();
		
		System.out.print("3 6 9 12 15" );
		System.out.println();
		
		int a = 1;
		int b =3;
		int c = 5;
		int d = 7;
		int e = 9;
		System.out.print(a+" "+b+" "+c+" "+d+" "+e+" ");
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
