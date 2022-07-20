package pro.sky.skyprospringdemo.domain;

public class TruckDriver extends Driver {
    public TruckDriver(String name, String surname, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, driverLicenseNumber, professionNumber);
    }

    public void setDriverLincenseNumber(String driverLincenseNumber) {
        if (driverLincenseNumber != null && driverLincenseNumber.startsWith("2")) {
            super.setDriverLicenserNumber(driverLincenseNumber);
        }
    }
}
