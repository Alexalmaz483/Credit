public class CreditPaymentService {
    public int calculate(int amount, int period, double yearRate) {
        double monthRate = yearRate / 12 / 100; // Преобразуем процент в долю, разделённую на 12 мес.
        double coefficient = (monthRate * Math.pow(1 + monthRate, period)) / (Math.pow(1 + monthRate, period) - 1);
        double payment = amount * coefficient;
        return (int) payment; // Округляем до целого
    }
}