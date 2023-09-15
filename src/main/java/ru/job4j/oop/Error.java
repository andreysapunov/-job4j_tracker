package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 2;
        message = "Hello!";
    }

    public void printInfo() {
        System.out.println("Булевое значение: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error errorTwo = new Error(false, 2, "Bye!");
        error.printInfo();
        errorTwo.printInfo();
    }
}
