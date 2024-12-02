package exercicio1.entities;

public class Employee {
    private String name;
    private int hours; // Alterado para tipo primitivo para evitar null
    private double valuePerHour; // Alterado para tipo primitivo para evitar null

    public Employee(String name, int hours, double valuePerHour) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        if (valuePerHour < 0) {
            throw new IllegalArgumentException("Value per hour cannot be negative");
        }
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        if (valuePerHour < 0) {
            throw new IllegalArgumentException("Value per hour cannot be negative");
        }
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }
}
