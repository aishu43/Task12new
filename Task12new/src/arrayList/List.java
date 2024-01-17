package arrayList;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  list = new ArrayList<String>();
	      list.add("jeni");
	      list.add("bavi");
	      list.add("sumi");

	      System.out.println(" list Name : "+  list);
	      String[] Array = new String[list.size()];
	      list.toArray(Array);

	      for(int i=0; i<Array.length; i++){
	         System.out.println("Specified Name "+  i  +" : "+Array[i]);

	         list.removeAll(list);
	         System.out.println("new list1 :"+list);
	         
	      }
	}
	}


