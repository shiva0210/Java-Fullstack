import java.util.*;
class Demo{
	public static void main(String[]args){
	HashSet<String> s = new HashSet<String>();
	s.add("viraj");
	s.add("gumrah");
	s.add("rohit");
	s.add("MS");
	s.add("kl");

	Iterator itr = s.iterator();
	while(itr.hasNext()){
	String e = (String)itr.next();
	System.out.println(e);
		}
	}
}

/*kl
MS
viraj
rohit
gumrah*/