package RegularExpression;
import java.util.regex.*;

public class RegExpEx {

	public static void main(String[] args) {
	boolean b=false;
	Pattern p=Pattern.compile("is");
	Matcher m=p.matcher("isMississippi");
	b=m.lookingAt();
	System.out.println("Did we get a part region match?" +b);
	b=m.matches();
	System.out.println("Did we get a full region match?" +b);
	while(b=m.find())
	{
		System.out.println("We got a match at a position:"+m.start());
	}
	b=Pattern.matches("is","Mississippi");
	System.out.println("Did we get a full match?"+b);
	b=Pattern.matches("Mississippi","Mississippi");
	System.out.println("Did we get a full match?"+b);

	}

}
