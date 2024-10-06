class Demo{
	public static void main(String []args){
	int sum= arithmetic.add(10,20);
	int sub= arithmetic.sub(10,20);
	System.out.println(sum);
	System.out.println(sub);
}
class arithmetic{
	static int add(int a,int b){	
	int sum=a+b;
	return sum;
}
	static int sub(int a,int b){	
	int sub=a-b;
	return sub;
}
}
}

O/P- 30,-10