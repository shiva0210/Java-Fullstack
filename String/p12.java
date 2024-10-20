class Demo{
	public static void main(String[]args){
	String s = "Shivam";
	System.out.println(System.identityHashCode(s));
	s = "Shivam";
	System.out.println(System.identityHashCode(s));

}
}
