public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000;
        int year = 1;
        int monthlyPayment = (int) service.calculate(amountCredit, year);
        System.out.println("Рассчет ежемесячного платежа на 1 год с суммой кредита 1 000 000 рублей");
        System.out.println("Ежемесячный платеж составит: " + monthlyPayment + " рублей");

        System.out.println();
        System.out.println("Рассчет ежемесячного платежа на 2 года с суммой кредита 1 000 000 рублей");
        System.out.println("Ежемесячный платеж составит: " + (int) service.calculate(1_000_000, 2) + " рублей");

        System.out.println();
        System.out.println("Рассчет ежемесячного платежа на 3 года с суммой кредита 1 000 000 рублей");
        System.out.println("Ежемесячный платеж составит: " + (int) service.calculate(1_000_000, 3) + " рублей");
    }
}
