import MyException.DivisionByZeroException;

public class Calculator {
    public double divide (int x, int y){
        if (y == 0) {
            try {
                throw new DivisionByZeroException("Попытка деления на 0");
            }catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
        return (double) x / y;
    }

}
