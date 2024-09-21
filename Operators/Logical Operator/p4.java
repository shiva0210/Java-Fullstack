class Demo{
	public static void main(String[]args){
	int x=4;
	int y=5;
	boolean c=++x>++y||++x>y++;
	System.out.println(c);
	System.out.println(x);
	System.out.println(y);
}
}

O/P-- false 6,7