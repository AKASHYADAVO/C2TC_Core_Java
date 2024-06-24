package CaseStudy;

//PrimeAcc.java
public abstract class PrimeAcc extends ShopAcc {
 public PrimeAcc(int accNo, String accNm) {
     super(accNo, accNm);
 }

 @Override
 public void bookProduct(float amount) {
     System.out.println("Booking product for Prime Account: " + amount);
     // Specific logic for prime accounts
 }
}
