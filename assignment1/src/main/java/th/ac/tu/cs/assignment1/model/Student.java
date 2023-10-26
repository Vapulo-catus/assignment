package th.ac.tu.cs.assignment1.model;

public class Student {
    private Long id;
    private String date;
    private String title;
    private String firstName;
    private String lastName;
    private String registrationNumber;
    private int yearOfStudy;
    private String fieldOfStudy;
    private String advisor;
    private String addressNumber;
    private String moo;
    private String subdistrict;
    private String district;
    private String province;
    private String postalCode;
    private String mobileNumber;
    private String homeNumber;
    private String reason;

    public Student() {

    }

    public Student(Long id, String date, String title, String firstName, String lastName, String registrationNumber, int yearOfStudy, String fieldOfStudy, String advisor, String addressNumber, String moo, String subdistrict, String district, String province, String postalCode, String mobileNumber, String homeNumber, String reason) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.yearOfStudy = yearOfStudy;
        this.fieldOfStudy = fieldOfStudy;
        this.advisor = advisor;
        this.addressNumber = addressNumber;
        this.moo = moo;
        this.subdistrict = subdistrict;
        this.district = district;
        this.province = province;
        this.postalCode = postalCode;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", advisor='" + advisor + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", moo='" + moo + '\'' +
                ", subdistrict='" + subdistrict + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
