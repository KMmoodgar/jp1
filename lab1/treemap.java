package program_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, generic_object> hm = new TreeMap<String, generic_object>();
		
		while(true)
		{
			System.out.println("1.Enter data\n2.Display\n3.Search\n4.Size\n5.Delete\n6.Exxit\nEnter your choice:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter state : ");
				String state = sc.next();
				System.out.println("Enter capital : ");
				String capital = sc.next();
				generic_object go = new generic_object();
				go.setState(state);
				go.setCapital(capital);
				hm.put(state, go);
				break;
			case 2:
				for(String key : hm.keySet())
				{
					generic_object g = hm.get(key);
					System.out.println("State = "+g.getState() + "Capital = "+g.getCapital());
				}
				break;
			case 3:
				System.out.println("Enter state name to search : ");
				String s =sc.next();
				System.out.println(hm.containsKey(s));
				break;	
			case 4:
				System.out.println(hm.size());
				break;
			case 5:
				System.out.println("Enter the state name to delete :");
				String name = sc.next();
				hm.remove(name);
				break;
				
			case 6:
				System.exit(0);
			}
		}
	}
}
