package ex25;

public class PaymentCalculator {


    public int calculateMonthsUntilPaidOff(double balance, double apr, double payment)
    {
        double time, a, b, c;

        c = Math.log(1.0 + apr);

        b = 1.0 - Math.pow((1.0 + apr), 30);

        a = Math.log(1.0 + (balance / payment) * b);


        time = 1 + (- (1 / 30.0) * a) /c  ;

        return (int)time;
    }

}
