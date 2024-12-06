package dz_lyambda_and_stream_api.task_calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        try {
            // Здесь произойдет ошибка, так как b после операции 1 - 1 будет равно 0
            int c = calc.devide.apply(a,b);
            calc.println.accept(c);
            // Поэтому обрабатываем данное исключение и выводим сообщение на экран
        } catch (Exception e) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
    }
}
