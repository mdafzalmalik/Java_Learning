package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(1, -9);
		list.add(0, 25);
		System.out.println(list);
		// get
		System.out.println(list.get(3));
		// remove
		System.out.println(list.remove(2)); // index based
		System.out.println(list);
		list.set(4, -11);
		System.out.println(list);
		System.out.println(list.size()); // size is a method
		// sort
		Collections.sort(list);
		System.out.println(list);

		// display using loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// for each loop
		for (int val : list) {
			System.out.print(val + " ");
		}

	}

}
