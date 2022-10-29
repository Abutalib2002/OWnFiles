package MyJavaCode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetProerty {
public static void main(String[] args) {
	Set <String> mmyset = new HashSet<String>();
	

	mmyset.add("hi");
	mmyset.add("hi1");
	mmyset.add("hi");
	mmyset.add("hi2");
	mmyset.add("hi");
	mmyset.add("hi3");
	System.out.println(mmyset);

Iterator <String>iter = mmyset.iterator();

while(iter.hasNext())
{
	System.out.println(iter.next());
}


Set <String>myset = new TreeSet<String>( new mycampare());
myset.add("hi");
myset.add("hi1");
myset.add("hi");
myset.add("hi2");
myset.add("hi");
myset.add("hi3");
System.out.println(myset);


}
}

class mycampare implements  Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
