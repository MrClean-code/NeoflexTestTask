package pr.exseption;

public class CalcDAOExseption extends Exception{
    public CalcDAOExseption() {
        super();
    }

    public CalcDAOExseption(String message) {
        super(message);
    }

    public CalcDAOExseption(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcDAOExseption(Throwable cause) {
        super(cause);
    }

    protected CalcDAOExseption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
