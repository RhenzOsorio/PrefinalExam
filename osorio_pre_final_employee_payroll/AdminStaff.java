/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osorio_pre_final_employee_payroll;

/**
 *
 * @author User
 */
public class AdminStaff extends Employee{
    private double basicSalary;
    private double overtimePAY;

   

    public AdminStaff( String employeeID, String name, String department, double basicSalary, double overtimePAY) {
        super(employeeID, name, department);
        this.basicSalary = basicSalary;
        this.overtimePAY = overtimePAY;
    }

    
    
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOvertimePAY() {
        return overtimePAY;
    }

    public void setOvertimePAY(double overtimePAY) {
        this.overtimePAY = overtimePAY;
    }
    
    
    
    @Override
    public double calculateSalary() {
        return basicSalary * overtimePAY;
    }
    
     public void displayStaffType(){
        System.out.println("Employee Type: Admin Staff");
    }
}
