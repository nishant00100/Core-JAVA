class define{
    static int x;
}

public class question11 {
    public static void main(String[] args) {
        define obj = new define();
        System.out.println(obj.x);  // 0
        obj.x = 10;
        System.out.println(obj.x);
    }
}
