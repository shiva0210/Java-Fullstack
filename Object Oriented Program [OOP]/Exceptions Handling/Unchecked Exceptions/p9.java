class Demo{
	public static void main(String[]args){
	try{
		System.out.println(10/0);
		}catch(ArithmeticException e){
		System.out.println(e);
		}catch(Exception a){
		System.out.println(a);
		}
	}
}

//error: exception ArithmeticException has already been caught }catch(ArithmeticException a){