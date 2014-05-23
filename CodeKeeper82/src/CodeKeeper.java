import java.util.*;

public class CodeKeeper {

	ArrayList list;
	String[] codes = { "alpha", "lambda", "gamma", "delta", "zeta" };
	
	public static void main(String[] args)
	{
		System.out.println("Projct 8.2\n");
		
		CodeKeeper keeper = new CodeKeeper(args);
	}
	
	public CodeKeeper(String[] userCodes)
	{
		list = new ArrayList();
		// load built-in codes
		for (int i = 0; i < codes.length; i++)
		{
			addCode(codes[i]);
		}
			
		// load user codes
		for (int j = 0; j < userCodes.length; j++)
		{
			addCode(userCodes[j]);
		}
		
		// display all codes
		//for (Iterator ite = list.iterator(); ite.hasNext(); )
		for (Object output : list)
		{
			//String output = (String) ite.next();
			System.out.println((String) output);
		}
	}
		
	private void addCode(String code)
	{
		if (!list.contains(code))
		{
			list.add(code);
		}
	}
}
