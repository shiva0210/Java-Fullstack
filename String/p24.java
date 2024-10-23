class Demo{
	public static void main(String[]args){
	Codex chavi = new Codex();
	String name = chavi.LowerCase();
	System.out.println(name);
	}
 }
	class Codex{
	String LowerCase(){
	char names[]= {'S','H','I','V','A'};
	for(int i =0;i<names.length;i++){
	names[i]+=32;
}
	String name = new String (names);
	return name;

}
}