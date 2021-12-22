public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduteStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }

    class GraduteStudent extends Student {

    }

    class Student extends Person {
        // overiding method
        public String toString() {
            return "Student";
        }
    }

    class Person extends Object {
        /**overring method */
        public String toString() {
            return "person";
        }
    }
}