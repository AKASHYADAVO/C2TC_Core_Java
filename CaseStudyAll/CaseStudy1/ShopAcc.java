package CaseStudy;

//ShopAcc.java
public abstract class ShopAcc {
 private int accNo;
 private String accNm;

 public ShopAcc(int accNo, String accNm) {
     this.accNo = accNo;
     this.accNm = accNm;
 }

 public abstract void bookProduct(float amount);

 @Override
 public String toString() {
     return "Account Number: " + accNo + ", Account Name: " + accNm;
 }
}
