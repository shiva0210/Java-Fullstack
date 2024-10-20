class Demo{
	public static void main(String[]args){
	String s = new String ("Shivam");
	System.out.println(System.identityHashCode(s));
	s = new String ("Zodge");
	System.out.println(System.identityHashCode(s));

}
}
