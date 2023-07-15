package service;

public class BonusService implements SaleService {

    private Grade grade;
    private int point;

    public BonusService(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "보너스 결제 방식";
    }

    @Override
    public int calculate(int price) {
        point += (int)(price * grade.getRatio());
        return price;
    }
}
