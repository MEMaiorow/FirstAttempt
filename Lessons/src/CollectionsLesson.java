import java.util.LinkedList;
import java.util.Queue;

public class CollectionsLesson {

	public static void main(String[] args) {
		 Queue<String> coll = new LinkedList<String>();
		 
		 coll.add("hello");
		 coll.add("hello");
		 coll.add("hello");
		 coll.add("hello");
		 
		 System.out.println("Numbers of elements: " + coll);
		 
		 coll.remove("hello");
		 
		 System.out.println("Numbers of elements: " + coll);

	}

}
