package CaseStudy;

//NormalAcc.java
public abstract class NormalAcc extends ShopAcc {
 public NormalAcc(int accNo, String accNm) {
     super(accNo, accNm);
 }

 @Override
 public void bookProduct(float amount) {
     float deliveryCharge = 10.0f; // Example delivery charge
     System.out.println("Booking product for Normal Account with delivery charge: " + (amount + deliveryCharge));
     // Specific logic for normal accounts
 }
}
