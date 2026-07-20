import java.util.Scanner;

//Enhanced Operator

public class EnhancedCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		char operator;
		double results=0;
		boolean isValid = true;
		
		System.out.println("Enter the first number");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the operator(+, -, *, /, ^): ");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the second number");
		num2 = sc.nextDouble();
		
		
		switch(operator){
		    case '+' -> results = num1 + num2;
		    case '-' -> results = num1 - num2;
		    case '*' -> results = num1 * num2;
		    case '/' -> {
		    if(num2==0){
		        System.out.println("You cannot divide by 0");
		        isValid= false;
		    }else{
		      results = num1 / num2;  
		    }
		    }
		    case '^' -> results = Math.pow(num1, num2);
		    default ->{
		           System.out.println("Invalid Operator");
		           isValid = false;
		    }
		}
		if(isValid){
		    System.out.println(results);
		}
		
		sc.close();
		
	}
}
