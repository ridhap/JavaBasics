/*Java constructor chaining
Constructor chaining occurs when a class inherits another class i.e. in inheritance, as in inheritance sub class inherits the properties of super class. Both the super and sub class may have constructor methods, when an object of sub class is created it's constructor is invoked it initializes sub class attributes, now super class constructor needs to be invoked, to achieve this java provides a super keyword through which we can pass arguments to super class constructor. */

class GrandParent {
  int a;
 
  GrandParent(int a) {
    this.a = a;
  }
}
 
class Parent extends GrandParent {
  int b;
 
  Parent(int a, int b) {
    super(a);
    this.b = b;
  }
 
  void show() {
    System.out.println("GrandParent's a = " + a);
    System.out.println("Parent's b      = " + b);
  }
}
 
class Child {
  public static void main(String[] args) {
    Parent object = new Parent(8, 9);
    object.show();
  }
}