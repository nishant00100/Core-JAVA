class demo{
    int x = 100;
    void print(int x){
        System.out.println("local : " + x);
        System.out.println("insatnce : " + this.x);
        }
}

public class Question6 {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.print(5);
    }
}
