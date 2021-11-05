public class Test5 {
    public Test5() {
    }
    public static void main(String[] args) {
        Test5 t = new Test5();
        t.test();
    }
    void test() {
        Test5: {
            test: for(int i =0;true;i++) {
                if(i % 2 == 0) continue test;
                if(i > 10) break Test5;
                System.out.print(i + " ");
            }
        }
    }
}