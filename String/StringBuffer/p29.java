class Demo{
	public static void main(String[]args){
	StringBuffer sb= new StringBuffer("shiva");
	String s=sb.append("zodge");
	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(s));
}
 }

//error: incompatible types: StringBuffer cannot be converted to String