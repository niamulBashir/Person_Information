class PersonInfo{
private String name="niamul";
private int id =8;
private int age=39;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

}

public class Person{
    public static void main(String a[]){
PersonInfo obj1 = new PersonInfo();
obj1.setName("Bashir");
 System.out.println(obj1.getName());
 obj1.setAge(38);
 System.out.println(obj1.getAge());
 obj1.setId(9);
 System.out.println(obj1.getId());
}

}