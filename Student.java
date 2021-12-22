public class Student extends Person {
    protected final String STATUS = "senior";

    public Student() {

    }

    public Student(String name, String adress, String phoneNumber, String email) {
        super(name, adress, phoneNumber, email);
    }

    public String getStatus() {
        return STATUS;
    }
    public String toString() {
        return " class Name : Student" + getName();
    }
    
}