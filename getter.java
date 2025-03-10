class User{
  private String name;
  private String password;

  //getter and setter methods to access private data
  public String getName(){
    return name;
  }
  public String getPassword(){
    return password;
  }
 
  User(String name, String password){
    this.name = name;
    this.password = password;
  }
}

public class getter{
  public static void main(String[] args){
    // User u = new User("Riya", "Mhatre");
    // System.out.println(u);
    User u = new User("Riya", "Mhatre");
    System.out.println(u.getName());
  }
}