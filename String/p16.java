class Demo{
	public static void main(String[]args){
	String s = "Shivaa";
	System.out.println(System.identityHashCode(s));
	System.out.println(s);
	String s1 = s.concat("Zodge");
	System.out.println(System.identityHashCode(s1));
	System.out.println(s1);
}
}
