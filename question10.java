
class All{
    int instance = 10;
    static int staticX = 15;

    void print(int local) {
        System.out.println(instance);
        System.out.println(staticX);
        System.out.println(local);
    }
}

public class question10 {
    public static void main(String[] args) {
        All obj = new All();
        obj.print(12);

    }
}
