package sef.module9.activity;
//Needs to be completed
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
			Map map=new HashMap();
			map.put("1","Sasha");
			map.put("2","John");
			map.put("3","Stacie");
			map.put("4","Mike");
			map.put("5","Peter");
			
			//2 - Call print method to print the map passed as its parameter.
			new MapActivity().print(map);
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			Iterator i=map.keySet().iterator();
			
			while(i.hasNext())
			{
				String key=i.next().toString();
				String value=map.get(key).toString();
				System.out.println(key + "\t" + value);
			}
		}
	}
