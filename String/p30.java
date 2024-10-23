class Demo{
	public static void main(String[]args){
	StringBuffer sb= new StringBuffer("shiva");
	StringBuffer s=sb.append("zodge");
	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(s));
	System.out.println(sb);
	System.out.println(s);
	}
 }


//incompatible types: StringBuffer cannot be converted to String