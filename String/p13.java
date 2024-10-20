class Demo{
	public static void main(String[]args){
	String s1 = "data";
	System.out.println(System.identityHashCode(s1));
	String s2= "base";
	System.out.println(System.identityHashCode(s2));
	s1=s1+s2;
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));

}
}
