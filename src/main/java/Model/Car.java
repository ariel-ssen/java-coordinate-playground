package Model;

public abstract class Car {
    // 리터당 이동 거리 (연비)
    public abstract double getDistancePerLiter();

    // 여행 거리
    public abstract double getTripDistance();

    // 차종 이름
    public abstract String getName();

    // 주입해야 할 연료량 계산
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
