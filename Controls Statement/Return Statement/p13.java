class Demo{
	public static void main(String []args){
	char ch=fun();
	System.out.print(ch);
}
	static int fun(){
	System.out.println("in fun ");
	return 65;
}
}

O/P--error: incompatible types: possible lossy conversion from int to char