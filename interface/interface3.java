// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
interface Bank {
  float rateOfInterest();
}
class SBI implements Bank {
  public float rateOfInterest() {
    return 9.15f;
  }
}
class PNB implements Bank {
  public float rateOfInterest() {
    //super.rateOfInterest();
    return 9.7f;
  }
}
class interface3 {
  public static void main(String[] args) {
    Bank b = new PNB();
    System.out.println("ROI of PNB : " + b.rateOfInterest());
    Bank b1 = new SBI();
    System.out.println("ROI of SBI : " + b1.rateOfInterest());
  }
}
