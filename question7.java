class demo1{
    final int val = 300;
}

public class question7 {
    public static void main(String[] args) {
        demo1 obj = new demo1();
        //obj.val = 350;   // error : cannot assign a value to final variable val
        System.out.println(obj.val);
    }
}
