import java.util.Vector;
import java.util.Iterator;

//Vector<Integer> 사용 예
//2023.11.02

public class Exam {
	
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		list.add(11);
		list.add(22);
		list.add(33);
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		list.remove(1);
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println();
		
		for(int i = 0; i < 10; i++)
			list.add(i*i);
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			System.out.println("> " + n);
		}
		
		System.out.println(list.size());
	}
}
