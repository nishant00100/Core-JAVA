class instan{
    int var = 50;
}

public class question19 {
    public static void main(String[] args) {
        instan obj1 = new instan();
        instan obj2 = new instan();
        obj1.var = 55;
        obj2.var = 66;
        System.out.println(obj1.var);
        System.out.println(obj2.var);
    }
}
