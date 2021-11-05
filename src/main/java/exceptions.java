public class exceptions {
    public static void main(String[] args) throws Exception {
        int theValue = -2;
        if( theValue < 0) {
            throw new Exception("Параметр для вычисления не должен быть отрицательным");
        }
    }
}
