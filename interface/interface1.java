// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
interface printable {
  void print();
}
class interface1 implements printable {
  public void print() {
    System.out.println("Hello");
  }
  public static void main(String args[]) {
    interface1 obj = new interface1();
    obj.print();
  }
}
