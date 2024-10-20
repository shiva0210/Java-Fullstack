class Demo{
	public static void main(String[]args){
	String s = "Shivaa";
	String s1 = s.concat("Zodge");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));

}
}
