class Employee{
  int id;
  String name;
  double salary;
  Employee(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  public void increaseSalary(double percentage){
    this.salary+= this.salary*(percentage / 100);
  }
  @Override
  public String toString(){
    return "ID:"+id+"\nName:"+name+"\nSalary:"+salary+"\n";
  }
}

public class SimpleEmployeeClass {
  public static void main(String args[]){
    Employee employee1 = new Employee(1,"Harsh", 50000);
    Employee employee2 = new Employee(2,"Ram", 40000);

    // Increase the 1st employee salary by  10%
    employee1.increaseSalary(10);

    System.out.println(employee1);
    System.out.println(employee2);
  }  
}
