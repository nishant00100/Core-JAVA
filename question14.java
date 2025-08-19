class change{
    int x;
    void method(int x){
        this.x = x;
    }
}


public class question14 {
    public static void main(String[] args) {
        change obj = new change();
        obj.method(1);
        System.out.println(obj.x);
    }
}
