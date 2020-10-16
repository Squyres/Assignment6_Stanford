
import java.util.*;

public class CountNames {

	public static void main(String[] args) {
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		readNames(nameMap);
		printMap(nameMap);
		}
	private static void readNames(Map<String,Integer> map) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter Name: ");
			String name = scan.nextLine();
			if(name.equals("")) break;
			Integer count = map.get(name);
			if(count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			map.put(name, count);
		}
	}
	private static void printMap(Map<String,Integer> map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int count = map.get(key);
			System.out.println("Entry [" + key + "] has count " + count);
		}
	}
}