public class Test1 {
    static int x = 5;
    public Test1() {
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        {
            int x = 1;
            System.out.println("First block x = "
                    + x);
        }
        {
            int x = 2;
            System.out.println("Second block x = "
                    + x);
        }
        System.out.print("For cycle x = ");
        for(int x =0;x<5;x++) {
            System.out.print(" " + x);
        }
    }
}