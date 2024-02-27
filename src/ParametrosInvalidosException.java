public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensage) {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
