public class Test4 {
    static int x = 5;
    public Test4() { }
    public static void main(String[] args) {
        Test4 t = new Test4();
        int x = 0;
        int y = 0;
        lbl: while(y  < 3) {
            y++;
            while(x < 5) {
                x++;
                if(x % 2 == 0) continue lbl;
                System.out.println("x=" + x + " y="+y);
            }
        }
    }
}