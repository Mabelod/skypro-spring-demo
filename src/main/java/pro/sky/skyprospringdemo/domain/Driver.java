package pro.sky.skyprospringdemo.domain;

public class Driver extends Person{
    private String driverLicenseNumber;

    public Driver(String name, String surname, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, professionNumber);
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getDriverLicenserNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenserNumber(String driverLicenserNumber) {
        this.driverLicenseNumber = driverLicenserNumber;
    }
}
