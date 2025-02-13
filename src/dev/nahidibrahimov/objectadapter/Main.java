package dev.nahidibrahimov.objectadapter;

public class Main {
    public static void main(String[] args) {

        var designer = new BusinessCardDesigner();

        var employee = new Employee();
        populateData(employee);

        var employeeAdapter = new EmployeeObjectAdapter(employee);

        var card = designer.designCard(employeeAdapter);
        System.out.println(card);
    }

    public static void populateData(Employee employee) {
        employee.setFullName("John Doe");
        employee.setJobTitle("Backend Developer");
        employee.setOfficeLocation("Baku, Azerbaijan");
    }

}