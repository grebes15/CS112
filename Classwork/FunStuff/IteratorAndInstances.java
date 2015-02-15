import java.util.Iterator;
import java.util.ArrayList;

public class IteratorAndInstances
{

    public static void main(String[] args)
    {

	ArrayList list = new ArrayList();
	list.add(new Integer(10));
	list.add(new Float(3.4));
	list.add(new Double(29.2222));
	list.add(new String("Computer Science 112"));

	Iterator iterate = list.iterator();
	int i = 0;
	while(iterate.hasNext())
	    {

		Object current = iterate.next();
		if( current instanceof String )
		    {

			System.out.println("Found String");
			System.out.println(current);
			System.out.println(i);

		    }
		else if ( current instanceof Double){
		    System.out.println("Found Double");
		    System.out.println(current);
		    System.out.println(i);
		    i++;
		}
		else if ( current instanceof Float){
		    System.out.println("FOund Float");
		    System.out.println(current);
		    System.out.println(i);
		    i++;
		}
		else if ( current instanceof Integer){
		    System.out.println("Found Integer");
		    System.out.println(current);
		    System.out.println(i);
		    i++;
		}
	    }
    }
}
