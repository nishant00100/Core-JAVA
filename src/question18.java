class  shadow{
    int x = 100;
    void show()
    {
        int x = 50;
        System.out.println("local : " + x);
        System.out.println("instance : " + this.x);
    }
}

public class question18 {
    public static void main(String[] args) {
        shadow obj = new shadow();
        obj.show();
    }
}
