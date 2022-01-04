package com.example.unimalb.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private  String fullName;
    private  String regNum;
    private  String email;
    private  String loanType;
    private  boolean loanStatus;
    private LocalDate year;
    private  String pwd;

    public Student() {
    }

    public Student(Long id, String fullName, String regNum, String email,
                   String loanType, boolean loanStatus,
                   LocalDate year, String pwd) {
        this.id = id;
        this.fullName = fullName;
        this.regNum = regNum;
        this.email = email;
        this.loanType = loanType;
        this.loanStatus = loanStatus;
        this.year = year;
        this.pwd = pwd;
    }

    public Student(String fullName, String regNum, String email,
                   String loanType, boolean loanStatus,
                   LocalDate year, String pwd) {
        this.fullName = fullName;
        this.regNum = regNum;
        this.email = email;
        this.loanType = loanType;
        this.loanStatus = loanStatus;
        this.year = year;
        this.pwd = pwd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public boolean isLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(boolean loanStatus) {
        this.loanStatus = loanStatus;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", regNum='" + regNum + '\'' +
                ", email='" + email + '\'' +
                ", loanType='" + loanType + '\'' +
                ", loanStatus=" + loanStatus +
                ", year=" + year +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
