public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                // break; //para no 3 --> 1, 2
                continue;// pula a 3 --> 1, 2, 4, 5

            System.out.println(numero);
        }
    }
}