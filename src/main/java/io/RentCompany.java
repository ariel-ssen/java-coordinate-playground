// RentCompany Class (Singleton Pattern 적용)
package io;

import java.util.ArrayList;
import java.util.List;
import Model.Car;
import Massage.Messages; // 메시지 상수 클래스 import

public class RentCompany {
    private static RentCompany instance; // RentCompany 싱글톤 인스턴스를 저장할 변수
    private final List<Car> cars = new ArrayList<>(); // 자동차 리스트를 저장할 변수

    private RentCompany() {} // private 생성자: 외부에서 객체 생성 불가

    // RentCompany 객체를 생성하거나 반환하는 메서드 (싱글톤 구현)
    public static RentCompany getInstance() {
        if (instance == null) { // 인스턴스가 없으면 새로 생성
            instance = new RentCompany();
        }
        return instance; // 기존 인스턴스를 반환
    }

    // 자동차를 추가하는 메서드
    public void addCar(Car car) {
        cars.add(car);
    }

    // 보고서를 생성하는 메서드
    public String generateReport() {
        StringBuilder report = new StringBuilder(); // 보고서를 저장할 변수

        for (Car car : cars) {
            // 자동차 이름과 연료량 정보를 메시지 포맷에 맞게 추가
            report.append(String.format(Messages.REPORT_LINE_FORMAT, car.getName(), car.getChargeQuantity()))
                    .append(Messages.LINE_SEPARATOR);
        }

        return report.toString(); // 최종 보고서 반환
    }
}
