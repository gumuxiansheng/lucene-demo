package org.uic.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name="job_num")
    private String jobNum;
    @Column(name="name_zh_cn")
    private String nameZhCn;
    @Column(name="name_en")
    private String nameEn;
    @Column(name="name_comp")
    private String nameComp;
    private String sex;
    private String position;
    @Column(name="staff_type")
    private String staffType;
    @Column(name="pos_type")
    private String posType;
    @Column(name="pos_property")
    private String posProperty;
    private String nationality;
    private String division;
    @Column(name="division_en")
    private String divisionEn;
    @Column(name="division_abbr")
    private String divisionAbbr;
    private String subject;
    private String degree;
    @Column(name="degree_content")
    private String degreeContent;
    @Column(name="id_num")
    private String idNum;
    @Column(name="email_work")
    private String emailWork;
    @Column(name="email_personal")
    private String emailPersonal;

    public Staff() {
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getNameZhCn() {
        return nameZhCn;
    }

    public void setNameZhCn(String nameZhCn) {
        this.nameZhCn = nameZhCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String nameComp) {
        this.nameComp = nameComp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }

    public String getPosProperty() {
        return posProperty;
    }

    public void setPosProperty(String posProperty) {
        this.posProperty = posProperty;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreeContent() {
        return degreeContent;
    }

    public void setDegreeContent(String degreeContent) {
        this.degreeContent = degreeContent;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getEmailWork() {
        return emailWork;
    }

    public void setEmailWork(String emailWork) {
        this.emailWork = emailWork;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getDivisionEn() {
        return divisionEn;
    }

    public void setDivisionEn(String divisionEn) {
        this.divisionEn = divisionEn;
    }

    public String getDivisionAbbr() {
        return divisionAbbr;
    }

    public void setDivisionAbbr(String divisionAbbr) {
        this.divisionAbbr = divisionAbbr;
    }



}