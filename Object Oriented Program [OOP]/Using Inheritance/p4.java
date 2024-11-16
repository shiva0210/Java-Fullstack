class University{
	int a=20;
	void Syllabus(){
	System.out.println("java Syllabus");
}
}
class College extends University{
	void department(){
	System.out.println("AI");
}
	}
class Demo{
	public static void main(String[]args){
	System.out.println("clg Syllabus");
	College obj = new College();
	obj.Syllabus();
	System.out.println("uni Syllabus");
	University obj1 = new University();
	obj1.Syllabus();


}
 }
 /*clg Syllabus
java Syllabus
uni Syllabus
java Syllabus*/