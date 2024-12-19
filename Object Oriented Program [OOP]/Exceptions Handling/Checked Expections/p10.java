import java.io.*;
class Demo{
	public static void main(String[]args)throws IOException{
	try{
	throw new IOException("IO exception data");
	}catch(IOException e){
		System.out.println(e);
		}
	}
}

//java.io.IOException: IO exception data