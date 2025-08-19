class multiple{
    int value;
    void m1(){
        value=30;
    }
    void m2(int x){
        x = value;
        System.out.println(x);
    }
}



public class question15 {
    public static void main(String[] args) {
        multiple obj = new multiple();
        obj.m1();
        obj.m2(1);
    }
}
