class Demo{
	public static void main(String[]args){
	String s =new String("shiva");
	System.out.println(System.identityHashCode(s));
	System.out.println(s);
	
 	s.concat("shiv");
	System.out.println(System.identityHashCode(s));
	System.out.println(s);

	StringBuffer sb = new StringBuffer("shiva");
	System.out.println(System.identityHashCode(sb));
	

	sb =sb.append("zodge");
	System.out.println(System.identityHashCode(sb));
	System.out.println(sb);

	}
 }


/*925858445
shiva
925858445
shiva
798154996
798154996
shivazodge/*