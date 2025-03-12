class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void Introduce(){
         System.out.println("welcome");
        System.out.println("name :"+name);
         System.out.println("age:"+age);
    }
    public static void main(String[] args) {
        Person obj=new Person("dheekshi",18);
        obj.Introduce();
    }
}
