package employee.model;


public class AreaSalesmanager extends SalesManager {
    private String area;

    public AreaSalesmanager(int id, String name, double salary, int target, double incentive, String area) {
        super(id, name, salary, target, incentive);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + area;
    }
}
