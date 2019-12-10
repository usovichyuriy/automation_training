package by.bsu.rent.model;

import java.util.Objects;
import java.lang.Object;
import java.util.Optional;

public class CarRentOptions {
    private String pickUpLocation;
    private String dropOffLocation;
    private String pickUpDate;
    private String dropOffDate;
    private String pickUpTime;
    private String dropOffTime;

    public CarRentOptions(String pickUpLocation, String pickUpDate, String pickUpTime, String dropOffLocation, String dropOffDate, String dropOffTime) {
        this.pickUpLocation = pickUpLocation;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUpTime;
        this.dropOffLocation = dropOffLocation;
        this.dropOffDate = dropOffDate;
        this.dropOffTime = dropOffTime;
    }

    public Optional<String> getPickUpLocation() {
        return Optional.ofNullable(pickUpLocation);
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Optional<String> getPickUpDate() {
        return Optional.ofNullable(pickUpDate);
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Optional<String> getPickUpTime() {
        return Optional.ofNullable(pickUpTime);
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public Optional<String> getDropOffLocation() {
        return Optional.ofNullable(dropOffLocation);
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Optional<String> getDropOffDate() {
        return Optional.ofNullable(pickUpDate);
    }

    public void setDropOffDate(String dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Optional<String> getDropOffTime() {
        return Optional.ofNullable(pickUpDate);
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarRentOptions that = (CarRentOptions) obj;
        return Objects.equals(getPickUpLocation(), that.getPickUpLocation()) &&
                Objects.equals(getPickUpDate(), that.getPickUpDate()) &&
                Objects.equals(getPickUpTime(), that.getPickUpTime()) &&
                Objects.equals(getDropOffLocation(), that.getDropOffLocation()) &&
                Objects.equals(getDropOffDate(), that.getDropOffDate()) &&
                Objects.equals(getDropOffTime(), that.getDropOffTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPickUpLocation(), getPickUpDate(), getPickUpTime(), getDropOffLocation(), getDropOffDate(), getDropOffTime());
    }

    @Override
    public String toString() {
        return "CarRentOption{" +
                "pickUpLocation='" + pickUpLocation + '\'' +
                ", pickUpDate='" + pickUpDate + '\'' +
                ", pickUpTime='" + pickUpTime + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", dropOffDate='" + dropOffDate + '\'' +
                ", dropOffTime=" + dropOffTime +
                '}';
    }
}
