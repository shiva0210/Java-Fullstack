import java.io.*;
class Demo{
	public static void main(String[]args){
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	try{
		String s = br.readLine();
	}
	catch(IOException e){
		System.out.println(e);
		}
	}
}