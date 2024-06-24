package CaseStudy;

//ShopFactory.java
public abstract class ShopFactory {
 public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm);
 public abstract NormalAcc getNewNormalAccount(int accNo, String accNm);
}

