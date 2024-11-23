class Country{
	int a=20;
	}
class Maha extends Country{
	void lang(){
	System.out.println(a);
}
  }
class Demo{
	public static void main(String[]args){
	System.out.println("maha lang and flag");
	Maha obj = new Maha();
	obj.lang();

}
 }
/*maha lang and flag
20*/