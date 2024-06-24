package CaseStudy;

//GSShopFactory.java
public class GSShopFactory extends ShopFactory {
 @Override
 public PrimeAcc getNewPrimeAccount(int accNo, String accNm) {
     return new GSPrimeAcc(accNo, accNm);
 }

 @Override
 public NormalAcc getNewNormalAccount(int accNo, String accNm) {
     return new GSNormalAcc(accNo, accNm);
 }
}

