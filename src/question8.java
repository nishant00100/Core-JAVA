class demo2{

    static int staticX;
    static{
        staticX=100;
    }
}

public class question8 {
    public static void main(String[] args) {
        demo2 obj = new demo2();
        System.out.println(obj.staticX);
    }
}
