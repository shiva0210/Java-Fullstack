class Demo{
	static {
	System.out.println("in static block");
}
	}
class Test{
	public static void main(String[]args){
	Demo t = new Demo();
	System.out.println("in main block");
}
	}