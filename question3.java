
class CLASS{
    static void local(){
        int val = 350;
        System.out.println("val = " + val);
    }

}

public class question3 {


    public static void main(String[] args) {
        CLASS obj = new CLASS();
        obj.local();
       // System.out.println(obj.val);  //  error : cannot find symbol
    }
}
