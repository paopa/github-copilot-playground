package github.copilot.playground.service;

import github.copilot.playground.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService
{
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService()
    {
        employees.add(new Employee(1, "Doe", "d@b.com"));
        employees.add(new Employee(2, "Smith", "s@b.com"));
    }

    public List<Employee> getAll()
    {
        return employees;
    }

    public Employee get(int id)
    {
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void add(Employee employee)
    {
        employees.add(employee);
    }

    public void update(Employee employee)
    {
        Employee existing = get(employee.getId());
        if (existing != null) {
            existing.setName(employee.getName());
            existing.setEmail(employee.getEmail());
        }
    }

    public void delete(int id)
    {
        employees.removeIf(e -> e.getId() == id);
    }
}
