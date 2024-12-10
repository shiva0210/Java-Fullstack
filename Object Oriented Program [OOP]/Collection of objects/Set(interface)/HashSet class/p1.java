import java.util.*;
class Demo{
	public static void main(String[]args){
	HashSet s = new HashSet();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(10);
	System.out.println(s);
	}
}

//[20, 40, 10, 30]