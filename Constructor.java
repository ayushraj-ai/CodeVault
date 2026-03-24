public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ayush" , 5);
    }
}
class Student{
    String name;
    int roll_no;

    Student(String newname , int roll){
        this.name = newname;
        this.roll_no = roll;
    }
    Student(){
        System.out.println("heyy");
    }
}
