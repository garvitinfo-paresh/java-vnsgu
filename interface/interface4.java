// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

interface Printable {
  void print();
}

interface Showable {
  void show();
}

class interface4 implements Printable, Showable {

  public void print() {
    System.out.println("Hello");
  }

  public void show() {
    System.out.println("Welcome");
  }

  public static void main(String args[]) {
    interface4 obj = new interface4();
    obj.print();
    obj.show();
  }
}
