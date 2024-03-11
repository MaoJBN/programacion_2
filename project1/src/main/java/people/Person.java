
package people;

public class Person {
    private String name;
    private int age;
    private String lastname;
    private String fullname;
    public Person(String name, int age,String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createfullname(name,lastname);
    }
    private void createfullname(String name,String lastname){
        this.fullname=name + " " + lastname;
        
    }
    public int getAge() {
        return age;
    }

    public String getFullname() {
        return fullname;
    }
    
}
