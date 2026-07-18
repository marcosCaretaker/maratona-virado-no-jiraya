package academy.marcoscaretaker.maratonajava.javacore.Kenum.domain;

public enum PaymentType{
        DEBT{
            @Override
            public double calculateDiscount(double price) {
                return price * 0.05;
            }
        }, CREDIT{
        @Override
        public double calculateDiscount(double price) {
            return price * 0.03;
        }
    }, PIX{
        @Override
        public double calculateDiscount(double price) {
            return price * 0.15;
        }
    }, BOLETO{
        @Override
        public double calculateDiscount(double price) {
            return price * 0.1;
        }
    };

        public abstract double calculateDiscount(double price);
    }