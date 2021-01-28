package hw;

public class Example1 {

	public static void main(String[] args) {
		
		int operand1=5;

		int operand2=10;
		
		int answer;
		
		char operator='*';
		
		if(operator=='+')
		{
			answer=operand1+operand2;
			System.out.println(answer);
		}
		else if(operator=='-')
		{
			answer=operand1-operand2;
			System.out.println(answer);
		}
		else if(operator=='*')
		{
			answer=operand1*operand2;
			System.out.println(answer);
		}
		else
		{
			answer=operand1/operand2;
			System.out.println(answer);
		}
		
		switch(operator)
		{
			case '+' : answer=operand1+operand2; 	System.out.println(answer); break;
			case '-' : answer=operand1-operand2;	System.out.println(answer); break;

			case '*' : answer=operand1*operand2;	System.out.println(answer); break;
			case '/' : answer=operand1/operand2;	System.out.println(answer); break;

		}
		

		
	}

}
