package test.suprdaily.Exceptions;

public class OrderReservationException extends Throwable {

    private String message;

    public OrderReservationException() {}

    public OrderReservationException(String message) {
        this.message = message;
    }
}
