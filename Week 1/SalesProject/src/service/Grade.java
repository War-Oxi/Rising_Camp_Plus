package service;

public enum Grade {

    BRONZE(0.1),
    SILVER(0.2),
    GOLD( 0.3);

    private double ratio;

    public double getRatio() {
        return ratio;
    }

    Grade(double ratio) {
        this.ratio = ratio;
    }
}
