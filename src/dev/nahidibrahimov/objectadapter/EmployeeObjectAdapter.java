package dev.nahidibrahimov.objectadapter;

public class EmployeeObjectAdapter implements Customer {

    private final Employee adapted;

    public EmployeeObjectAdapter(Employee employee) {
        this.adapted = employee;
    }

    @Override
    public String getName() {
        return adapted.getFullName();
    }

    @Override
    public String getDesignation() {
        return adapted.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adapted.getOfficeLocation();
    }
}
