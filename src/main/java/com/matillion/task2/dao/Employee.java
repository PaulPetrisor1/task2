package com.matillion.task2.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int employeeId;

    @Column(length = 30)
    private String fullName;

    @Column(length = 30)
    private String firstName;

    @Column(length = 30)
    private String lastName;

    @OneToOne()
    @JoinColumn(name = "position_id")
    private Position positionId;

    @Column(length = 30)
    private String positionTitle;

    @Column(length = 11)
    private int storeId;

    @OneToOne()
    @JoinColumn(name = "department_id")
    private Department departmentId;

    private Date birthDate;

    private Date hireDate;

    private Date endDate;

    @Column(precision = 10, scale = 4)
    private double salary;

    @Column(length = 11)
    private int supervisorId;

    @Column(length = 30)
    private String educationLevel;

    @Column(length = 30)
    private String maritalStatus;

    @Column(length = 30)
    private String gender;

    @Column(length = 30)
    private String managementRole;

    public Employee() {
        // needed by JPA
    }

    public Employee(String fullName, String firstName, String lastName, Position positionId, String positionTitle,
                    int storeId, Department departmentId, Date birthDate, Date hireDate, Date endDate, double salary,
                    int supervisorId, String educationLevel, String maritalStatus, String gender, String managementRole) {

        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.positionId = positionId;
        this.positionTitle = positionTitle;
        this.storeId = storeId;
        this.departmentId = departmentId;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.endDate = endDate;
        this.salary = salary;
        this.supervisorId = supervisorId;
        this.educationLevel = educationLevel;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.managementRole = managementRole;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getManagementRole() {
        return managementRole;
    }

    public void setManagementRole(String managementRole) {
        this.managementRole = managementRole;
    }

    @Override
    public String toString() {
        return
                "employeeId=" + employeeId +
                        ", fullName='" + fullName + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", positionId=" + positionId +
                        ", positionTitle='" + positionTitle + '\'' +
                        ", storeId=" + storeId +
                        ", departmentId=" + departmentId +
                        ", birthDate=" + birthDate +
                        ", hireDate=" + hireDate +
                        ", endDate=" + endDate +
                        ", salary=" + salary +
                        ", supervisorId=" + supervisorId +
                        ", educationLevel='" + educationLevel + '\'' +
                        ", maritalStatus='" + maritalStatus + '\'' +
                        ", gender='" + gender + '\'' +
                        ", managementRole='" + managementRole + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                storeId == employee.storeId &&
                Double.compare(employee.salary, salary) == 0 &&
                supervisorId == employee.supervisorId &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(positionId, employee.positionId) &&
                Objects.equals(positionTitle, employee.positionTitle) &&
                Objects.equals(departmentId, employee.departmentId) &&
                Objects.equals(birthDate, employee.birthDate) &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(endDate, employee.endDate) &&
                Objects.equals(educationLevel, employee.educationLevel) &&
                Objects.equals(maritalStatus, employee.maritalStatus) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(managementRole, employee.managementRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, fullName, firstName, lastName, positionId, positionTitle, storeId, departmentId, birthDate, hireDate, endDate, salary, supervisorId, educationLevel, maritalStatus, gender, managementRole);
    }

}

