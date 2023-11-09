import java.util.HashSet;
import java.util.Iterator;

//HashSet 사용 예
//2023.11.02

public class Exam2 {
	
	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>(5);
		
		System.out.println(list.size());
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(22);
		
		System.out.println(list.size());
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			System.out.println("> " + n);
		}
		
		System.out.println(list.size());
	}
}
