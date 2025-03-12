public class Employee{
private int id;
private int salary;
public void setSalary(int salary){
this.salary=salary;
}
public int getSalary(){
return salary;
}
public static void main(String[] args){
Employee e1=new Employee();
e1.setSalary(40000);
System.out.println(e1.getSalary());
if(e1.getSalary()<=10000){
System.out.println("accepted");
}
else{
System.out.println("not accepted");
}
}
}
