package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //ARRAYLIST
		ArrayList<String> mylist= new ArrayList<String>();
		
		mylist.add("Linda");
		mylist.add("Robin");
		mylist.add("Nishanth");
		mylist.add("Aiden");
		mylist.add("Salim");
		mylist.add("Semi");
		
		System.out.println("Before sorting");
		System.out.println(mylist);
		
		System.out.println("After sorting");
		Collections.sort(mylist);
		System.out.println(mylist);
		
		System.out.println("After reversing");
		Collections.sort(mylist, Collections.reverseOrder());
		System.out.println(mylist);
		
		//STACK
		Stack<String> myStack= new Stack<String>();
		
		myStack.push("Kriss");
		myStack.push("Monson");
		System.out.println(myStack);
		myStack.pop();
		System.out.println("After pop");
		System.out.println(myStack);
		myStack.push("Charlie");
		System.out.println(myStack);
		//some changes
	}

}
