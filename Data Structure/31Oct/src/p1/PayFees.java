package p1;

public interface PayFees {
   public void payOnline();
   public default void payOffline() {
	   System.out.println("This class does not have the capability of online payment");
	   this.payOnline();
   }
}
