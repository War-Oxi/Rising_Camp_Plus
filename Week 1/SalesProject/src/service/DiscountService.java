package service;

public class DiscountService implements SaleService {

    private Grade grade;

    public DiscountService(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "할인 결제 방식";
    }

    @Override
    public int calculate(int price) {
        return price - (int)(price * grade.getRatio());
    }
}
