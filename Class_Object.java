class Riya{
  int a;
  String b;

  //This a parametrized constructor
  //syntax:
  //classname(Datatype variable, Datatype variable, ...){
    //this.variable = variable;
  //}
  Riya(int a, String b){
    this.a = a;
    this.b = b;
  }

  //This is a Method
  //syntax:
  //return type (eg. void, string, int, etc.) method name() {
    //block of code
  //}
  void display(){
    System.out.println(a + b);
  }
}

public class Class_Object{
  public static void main(String[] args){
    //This is an Object (Instance of class) with a constuctor
    //syntax:
    //classname objectname = new classname()
    Riya r = new Riya(34, "Mthatre");
    
    //This is an Object without using constructor
    //Riya r = new Riya();
    // r.a = 34;
    // r.b = "Mhatre";
    r.display();
  }
}