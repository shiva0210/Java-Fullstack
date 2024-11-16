class Country{
	int a=20;
	}
class Maha extends Country{
	int a=10;
	void lang(){
        System.out.println(this.a);
	System.out.println(super.a);
}
  }
class Demo{
	public static void main(String[]args){
	System.out.println("maha lang and flag");
	Maha obj = new Maha();
	obj.lang();

}
 }
 