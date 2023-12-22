public class CreditPaymentService {
    public double calculate(int amountCredit, int year) {
        int month = year * 12;
        double sizeBet = 0.0999 / 12;
        double a = 1 + sizeBet;
        double b = month;
        double x = Math.pow(a, b);
        double monthlyPayment;
        monthlyPayment = amountCredit * sizeBet * x / (x - 1);
        return monthlyPayment;
    }
}
/* Расчет формулы аннуитетного платежа: Se = S * P / 12 * (1 + P/12)^N / ((1 + P/12)^N - 1)
Se - ежемесячный платеж
S - сумма кредита
P - размер годовой ставки
N - количество месяцев
 */