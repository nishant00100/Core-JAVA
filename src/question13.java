class A{
    static int var = 10;
}
class B{
    void change(){
        A.var = 13;
        System.out.println(A.var);
    }

}



public class question13 {
    public static void main(String[] args) {
        B obj = new B();
        obj.change();
    }
}
