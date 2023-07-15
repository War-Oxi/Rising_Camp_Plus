package customer;

import service.BonusService;
import service.DiscountService;
import service.Grade;
import service.SaleService;

import java.util.Objects;

public abstract class Customer {
    private String name;
    private Grade grade;
    private SaleService saleService;

    public Customer() {
    }

    public Customer(String name, SaleService saleService) {
        if(saleService instanceof BonusService) this.grade = ((BonusService) saleService).getGrade();
        if(saleService instanceof DiscountService) this.grade = ((DiscountService) saleService).getGrade();
        this.name = name;
        this.saleService = saleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public SaleService getSaleService() {
        return saleService;
    }

    public void setSaleService(SaleService saleService) {
        this.saleService = saleService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int calculate(int price) {
        return saleService.calculate(price);
    }

    abstract public void printUserInfo();

}
