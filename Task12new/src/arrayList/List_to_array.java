package arrayList;

import java.util.ArrayList;

public class List_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>  list = new ArrayList<String>();
	      list.add("je");
	      list.add("ba");
	      list.add("sam");

	      System.out.println(" list Name : "+  list);
	      String[] Array = new String[list.size()];
	      list.toArray(Array);

	      for(int i=0; i<Array.length; i++){
	         System.out.println("Specified Name "+  i  +" : "+Array[i]);
	      }
	}

}
