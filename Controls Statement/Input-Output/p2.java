class Demo{
	public static void main(String []args){
	Codex chavi=new Codex();
	int sum=chavi.add(10,20);
	int sub=chavi.sub(10,20);
	System.out.println(sum);
	System.out.println(sub);
}
class Codex{
	int add(int a,int b){	
	return a+b;
}
        int sub(int a,int b){	
	return a-b;
	
}
}
}

O/P--error: non-static variable this cannot be referenced from a static context