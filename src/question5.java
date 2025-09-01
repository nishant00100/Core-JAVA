class class1{
     static int var = 350;

}

public class question5 {
    public static void main(String[] args) {
        class1 obj1 = new class1();
        obj1.var = 340;

        class1 obj2 = new class1();
        System.out.println(obj2.var);
    }
}
