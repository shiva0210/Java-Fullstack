class Parent{
	void education(){
	System.out.println("enginnering");
	}
}
class Child extends Parent{
	int education(){
	System.out.println("enginnering sodun sagl");
}
	}
class Demo{
	public static void main(String[]args){
	Child c =new Child();
	c.education();
   }
     
}

     //error: education() in Child cannot override education() in Parent

