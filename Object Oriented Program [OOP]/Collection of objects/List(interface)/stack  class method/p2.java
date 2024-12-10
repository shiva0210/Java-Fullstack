//METHODS

import java.util.*;
class Demo{
	public static void main(String[]args){
		Stack ls= new Stack();
		ls.push(10);
		ls.push(20);
		ls.push(30);
	//boolean empty():this method check whether stack is empty or not

		System.out.println(ls.empty());

	//element pop():this method return the last element of stack
		
		ls.pop();
		System.out.println(ls);

	//element peek():this methodreturn the last element of stack

		System.out.println(ls.peek());
	}
}

/*false
[10, 20]
20*/