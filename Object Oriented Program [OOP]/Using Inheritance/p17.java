class Father{
	int x=20;
	}
class Mother{
	int x =10;
	}
class Child extends Father,Mother{
	void fun(){
	System.out.println(x);
	}
}
		
		//multiple inheritance is not supported in java