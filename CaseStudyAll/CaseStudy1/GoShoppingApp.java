package CaseStudy;

//GoShoppingApp.java
public class GoShoppingApp {
 public static void main(String[] args) {
     // Create an instance of GSShopFactory
     ShopFactory shopFactory = new GSShopFactory();

     // Instantiate GSPrimeAcc and GSNormalAcc
     PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(1, "Prime Customer");
     NormalAcc normalAcc = shopFactory.getNewNormalAccount(2, "Normal Customer");

     // Invoke methods
     primeAcc.bookProduct(100.0f);
     normalAcc.bookProduct(50.0f);

     // Invoke toString() method
     System.out.println(primeAcc.toString());
     System.out.println(normalAcc.toString());
 }
}
