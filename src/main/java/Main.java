import io.RentCompany;
import Model.Avante;
import Model.K5;
import Model.Sonata;

public class Main {
    public static void main(String[] args) {
        RentCompany company = RentCompany.getInstance(); // 싱글톤 인스턴스 사용

        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        System.out.println(report);
    }
}