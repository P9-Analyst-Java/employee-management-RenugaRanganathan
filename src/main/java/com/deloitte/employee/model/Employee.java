 package com.deloitte.employee.model;
 
import java.util.Date;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "employees")
@Data
public class Employee {
 

    @Id
    @Column(name="emp_id")
    private Long empId;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String LastName;
    
    private String gender;
    
    private Date dob;
    
    @Column(name="pan_num")
    private String panNum;
    
    @Column(name="aadhaar_num")
    private String aadhaarNum;
    
    @Column(name="mobile_num")
    private String mobileNum;
    
    @Column(name="email_id")
    private String emailId;
    
    @Column(name="office_mail")
    private String officeMail;
    
    @Column(name="permanent_address")
    private String permanentAddress;
    
    @Column(name="present_address")
    private String presentAddress;
    
    @Column(name="blood_group")
    private String bloodGroup;
    
    @Column(name="profile_pict")
    private String profilePic;
    
    private Date doj;
    
    @Column(name="emp_level")
    private Integer empLevel;
    
    @Column(name="post_name")
    private String postName;
    
    @Column(name="basic_pay")
    private Long basicPay;
    
    @Column(name="house_allowance")
    private Long houseAllowance;
 
    
    public Employee() {
        
    }
 
    public Employee(Long empId, String firstName, String lastName, String gender, Date dob, String panNum,
            String aadhaarNum, String mobileNum, String emailId, String officeMail, String permanentAddress,
            String presentAddress, String bloodGroup, String profilePic, Date doj, Integer empLevel,
            String postName, Long basicPay, Long houseAllowance) {
        super();
        this.empId = empId;
        this.firstName = firstName;
        LastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.panNum = panNum;
        this.aadhaarNum = aadhaarNum;
        this.mobileNum = mobileNum;
        this.emailId = emailId;
        this.officeMail = officeMail;
        this.permanentAddress = permanentAddress;
        this.presentAddress = presentAddress;
        this.bloodGroup = bloodGroup;
        this.profilePic = profilePic;
        this.doj = doj;
        this.empLevel = empLevel;
        this.postName = postName;
        this.basicPay = basicPay;
        this.houseAllowance = houseAllowance;
        //this.empName=firstName+lastName;
    }
 
    public Long getEmpId() {
        return empId;
    }
 
    public void setEmpId(Long empId) {
        this.empId = empId;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }
 
    public void setLastName(String lastName) {
        LastName = lastName;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public Date getDob() {
        return dob;
    }
 
    public void setDob(Date dob) {
        this.dob = dob;
    }
 
    public String getPanNum() {
        return panNum;
    }
 
    public void setPanNum(String panNum) {
        this.panNum = panNum;
    }
 
    public String getAadhaarNum() {
        return aadhaarNum;
    }
 
    public void setAadhaarNum(String aadhaarNum) {
        this.aadhaarNum = aadhaarNum;
    }
 
    public String getMobileNum() {
        return mobileNum;
    }
 
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
 
    public String getEmailId() {
        return emailId;
    }
 
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
 
    public String getOfficeMail() {
        return officeMail;
    }
 
    public void setOfficeMail(String officeMail) {
        this.officeMail = officeMail;
    }
 
    public String getPermanentAddress() {
        return permanentAddress;
    }
 
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
 
    public String getPresentAddress() {
        return presentAddress;
    }
 
    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }
 
    public String getBloodGroup() {
        return bloodGroup;
    }
 
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
 
    public String getProfilePic() {
        return profilePic;
    }
 
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
 
    public Date getDoj() {
        return doj;
    }
 
    public void setDoj(Date doj) {
        this.doj = doj;
    }
 
    public Integer getEmpLevel() {
        return empLevel;
    }
 
    public void setEmpLevel(Integer empLevel) {
        this.empLevel = empLevel;
    }
 
    public String getPostName() {
        return postName;
    }
 
    public void setPostName(String postName) {
        this.postName = postName;
    }
 
    public Long getBasicPay() {
        return basicPay;
    }
 
    public void setBasicPay(Long basicPay) {
        this.basicPay = basicPay;
    }
 
    public Long getHouseAllowance() {
        return houseAllowance;
    }
 
    public void setHouseAllowance(Long houseAllowance) {
        this.houseAllowance = houseAllowance;
    }
    
 
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", firstName=" + firstName + ", LastName=" + LastName + ", gender=" + gender
                + ", dob=" + dob + ", panNum=" + panNum + ", aadhaarNum=" + aadhaarNum + ", mobileNum=" + mobileNum
                + ", emailId=" + emailId + ", officeMail=" + officeMail + ", permanentAddress=" + permanentAddress
                + ", presentAddress=" + presentAddress + ", bloodGroup=" + bloodGroup + ", profilePic=" + profilePic
                + ", doj=" + doj + ", empLevel=" + empLevel + ", postName=" + postName + ", basicPay=" + basicPay
                + ", houseAllowance=" + houseAllowance + "]";
    }
    
    
}

