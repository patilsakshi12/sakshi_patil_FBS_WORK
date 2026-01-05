import p1.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // PayFees p1=new OnlineStudent();
  //p1.payOnline();
		
		PayFees[] stu= {new OnlineStudent() , new DemoStudent(), new OfflineStudent()};
		
		for(PayFees ref:stu) {
			ref.payOffline();
		}
	}

}
