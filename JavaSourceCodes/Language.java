class Language {
  String name;
 
  Language() {
    System.out.println("Constructor method called.");
  }
 
  Language(String t) {
    name = t;
  }
 
  public static void main(String[] args) {
    Language cpp  = new Language();
    Language java = new Language("Java");
 
    cpp.setName("C++");
 
    java.getName();
    cpp.getName();
  }
 
  void setName(String t) {
    name = t;
  }
 
  void getName() {
    System.out.println("Language name: " + name);
  }
}


/*Java constructor overloading
Like other methods in java constructor can be overloaded i.e. we can create as many constructors in our class as desired. Number of constructors depends on the information about attributes of an object we have while creating objects.*/