package jungle.cave; //belongs to

import jungle.tree.Bear;

public class Tiger {
	
	private void privateMethodA() {
		System.out.println("Tiger is privateMethodA...");
	}
	protected void protectedMethodB() {
		System.out.println("Tiger is protectedMethodB....");
	}
	public void publicMethodC() {
		System.out.println("Tiger is publicMethodC...");
	}
	void defaultMethodD() { //available to default package
		System.out.println("Tiger is defaultMethodD..");
	}
}

class WhiteTiger extends Tiger //child - in DIFF PACKAGE
{
	void playWith(Tiger tiger) { //tiger = new BengalTiger();
		Bear bear = new Bear();
		bear.huntHoney();
	
		tiger.defaultMethodD();
		tiger.protectedMethodB();//Tiger is not WhiteTiger
		tiger.privateMethodA();//NEVER
		tiger.publicMethodC();//ALWAYS
	}
	
	void roaming() {
		
		super.defaultMethodD();
		protectedMethodB(); //becuase of extends 
		super.privateMethodA();//NEVER
		super.publicMethodC();//ALWAYS
		
		Tiger tiger = new Tiger();
		tiger.privateMethodA(); // NEVER-EVER
		tiger.protectedMethodB();//same cave, trust factor broken due to diff package
		tiger.defaultMethodD();//diff package 
		tiger.publicMethodC(); //EVERYWHERE
		
	}
}
