abstract class BCCI{
	abstract void selectionCommittee();
	void playing11(){
	System.out.println("6 batsman & 5 Bowler");
}
   }
class IPL extends BCCI{
	void selectionCommittee(){
	System.out.println("15 player");
}
	}
class RANJI extends BCCI{
	void selectionCommittee(){
	System.out.println("15 player");
}
	void playing11(){
	System.out.println("7 batsman & 4 Bowler");
}
   }
 class Demo{
	public static void main(String[]args){
	System.out.println("IPL data: ");
	IPL i1 = new IPL();
	i1.selectionCommittee();
	i1.playing11();

	System.out.println("RANJI data: ");
	RANJI r1=new RANJI();
	r1.selectionCommittee();
	r1.playing11();
}
   }
/*
IPL data:
15 player
6 batsman & 5 Bowler
RANJI data:
15 player
7 batsman & 4 Bowler/*