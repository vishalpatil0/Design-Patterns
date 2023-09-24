// Expression interface used to
// check the interpreter.
interface Expression
{
	boolean interpret(String context);
}

// TerminalExpression class implementing
// the above interface. This interpreter
// just check if the data is same as the
// interpreter data.
class TerminalExpression implements Expression
{
	String data;

	public TerminalExpression(String data)
	{
		this.data = data;
	}

	public boolean interpret(String context)
	{
		return data.contains(context);
	}
}
// OrExpression class implementing
// the above interface. This interpreter
// just returns the or condition of the
// data is same as the interpreter data.
class OrExpression implements Expression
{
	Expression expr1;
	Expression expr2;

	public OrExpression(Expression expr1, Expression expr2)
	{
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	public boolean interpret(String context)
	{		
		return expr1.interpret(context) || expr2.interpret(context);
	}
}

// AndExpression class implementing
// the above interface. This interpreter
// just returns the And condition of the
// data is same as the interpreter data.
class AndExpression implements Expression
{
	Expression expr1;
	Expression expr2;

	public AndExpression(Expression expr1, Expression expr2)
	{
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	public boolean interpret(String con)
	{		
		return expr1.interpret(con) && expr2.interpret(con);
	}
}

// Driver class
class InterpreterPattern
{

	public static void main(String[] args)
	{
		Expression person1 = new TerminalExpression("Kushagra");
		Expression person2 = new TerminalExpression("Lokesh");
		Expression isSingle = new OrExpression(person1, person2);
		
		Expression vikram = new TerminalExpression("Vikram");
		Expression committed = new TerminalExpression("Committed");
		Expression isCommitted = new AndExpression(vikram, isSingle);	

		System.out.println(isSingle.interpret("Kushagra"));
		System.out.println(isSingle.interpret("Lokesh"));
		System.out.println(isSingle.interpret("Achint"));
		
		System.out.println(isCommitted.interpret("Vikram"));
		System.out.println(isCommitted.interpret("Vikram"));

	}
}

