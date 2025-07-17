public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Платеж на 36 мес: " + payment1);


    }
}