public class Test2 {
    static int x = 5;
    static {

    }
    public Test2() {
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        int L2 = 0;
        Test2: for(int i = 0; i< 10;i++) {
            test: for(int j = 0; j< 10;j++) {
                System.out.println(i+"\\"+j);
                if( i*j > 50) break Test2;
            }
        }
    }
    private void test() {
        ;
    }
}