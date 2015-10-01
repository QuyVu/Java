package collection;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise1 {
	public static void main(String[] args) {
		//Use map with key is the word, value is number of appearance
		//Map<String, Integer> map = new HMap<String, Integer>();
		//Tree map is sorted map
		SortedMap<String, Integer> map = new TreeMap<String, Integer>();
		map.comparator();
		int value = 0; //use to count number of appearance 
		
		//Input String
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toLowerCase();
		String[] tmp = input.split(" "); //catch words
		
		//put Caught words into map
		for (String s : tmp) {
			if (map.get(s) != null) {
				value = map.get(s) + 1;
				map.put(s, value);
			} else {
				map.put(s, 1);
			}
		}
		for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
		sc.close();
	}

}
