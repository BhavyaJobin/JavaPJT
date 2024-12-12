package OOPS;

import java.util.Scanner;

interface Bank{
	public void AccountDetail();
	public void BalanceView();
	public void Withdraw();
	public void Deposit();
}
class SBI implements Bank{
	int b=754900;
	Scanner sc=new Scanner(System.in);
	@Override
	public void AccountDetail() {
		// TODO Auto-generated method stub
		System.out.println("         Account           ");
		System.out.println("AccNo     :10796530230011");
		System.out.println("HolderName:Jobin Jose");
		System.out.println("Branch    :Kakkand");
	}

	@Override
	public void BalanceView() {
		// TODO Auto-generated method stub
		
		System.out.println("Your account(10796530230011) balance is "+b);
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing amount:");
		int wm=sc.nextInt();
		
		b=b-wm;
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depositng amount:");
		int dm=sc.nextInt();
		
		b=b+dm;
	}
	
}
public class InterfaceTaskBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ob=new SBI();
		ob.AccountDetail();
		ob.BalanceView();
		ob.Withdraw();
		ob.Deposit();
		ob.BalanceView();
	}

}
