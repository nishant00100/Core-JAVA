class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void display(){

        System.out.println("name: " + name);
        System.out.println("marks: " + marks);
    }
}

public class question4 {
    public static void main(String[] args) {
        Student s1 = new Student("Nishant", 99);
        Student s2 = new Student("Mayank", 100);
        System.out.println("Detail of Student 1 : ");
        s1.display();
        System.out.println("Detail of Student 2 : ");
        s2.display();
    }
}
