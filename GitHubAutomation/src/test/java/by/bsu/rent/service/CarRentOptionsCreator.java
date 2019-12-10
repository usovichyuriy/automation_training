package by.bsu.rent.service;

import by.bsu.rent.model.CarRentOptions;

public class CarRentOptionsCreator {
    private static final String TESTDATA_CASE_1_CAR_SEARCH_PICKUP_LOCATION = "testdata.case1.pickUpLocation";
    private static final String TESTDATA_CASE_1_CAR_SEARCH_PICKUP_DATE = "testdata.case1.pickUpDate";
    private static final String TESTDATA_CASE_1_CAR_SEARCH_PICKUP_TIME = "testdata.case1.pickUpTime";
    private static final String TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case1.dropOffLocation";
    private static final String TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_DATA = "testdata.case1.dropOffDate";
    private static final String TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_TIME = "testdata.case1.dropOffTime";

    private static final String TESTDATA_CASE_2_CAR_SEARCH_PICKUP_LOCATION = "testdata.case2.pickUpLocation";
    private static final String TESTDATA_CASE_2_CAR_SEARCH_PICKUP_DATE = "testdata.case2.pickUpDate";
    private static final String TESTDATA_CASE_2_CAR_SEARCH_PICKUP_TIME = "testdata.case2.pickUpTime";
    private static final String TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case2.dropOffLocation";
    private static final String TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_DATA = "testdata.case2.dropOffDate";
    private static final String TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_TIME = "testdata.case2.dropOffTime";



    private static final String TESTDATA_CASE_3_CAR_SEARCH_PICKUP_LOCATION = "testdata.case3.pickUpLocation";
    private static final String TESTDATA_CASE_3_CAR_SEARCH_PICKUP_DATE = "testdata.case3.pickUpDate";
    private static final String TESTDATA_CASE_3_CAR_SEARCH_PICKUP_TIME = "testdata.case3.pickUpTime";
    private static final String TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case3.dropOffLocation";
    private static final String TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_DATA = "testdata.case3.dropOffDate";
    private static final String TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_TIME = "testdata.case3.dropOffTime";


    private static final String TESTDATA_CASE_4_CAR_SEARCH_PICKUP_LOCATION = "testdata.case4.pickUpLocation";
    private static final String TESTDATA_CASE_4_CAR_SEARCH_PICKUP_DATE = "testdata.case4.pickUpDate";
    private static final String TESTDATA_CASE_4_CAR_SEARCH_PICKUP_TIME = "testdata.case4.pickUpTime";
    private static final String TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case4.dropOffLocation";
    private static final String TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_DATA = "testdata.case4.dropOffDate";
    private static final String TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_TIME = "testdata.case4.dropOffTime";


    private static final String TESTDATA_CASE_5_CAR_SEARCH_PICKUP_LOCATION = "testdata.case5.pickUpLocation";
    private static final String TESTDATA_CASE_5_CAR_SEARCH_PICKUP_DATE = "testdata.case5.pickUpDate";
    private static final String TESTDATA_CASE_5_CAR_SEARCH_PICKUP_TIME = "testdata.case5.pickUpTime";
    private static final String TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case5.dropOffLocation";
    private static final String TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_DATA = "testdata.case5.dropOffDate";
    private static final String TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_TIME = "testdata.case5.dropOffTime";


    private static final String TESTDATA_CASE_6_CAR_SEARCH_PICKUP_LOCATION = "testdata.case6.pickUpLocation";
    private static final String TESTDATA_CASE_6_CAR_SEARCH_PICKUP_DATE = "testdata.case6.pickUpDate";
    private static final String TESTDATA_CASE_6_CAR_SEARCH_PICKUP_TIME = "testdata.case6.pickUpTime";
    private static final String TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case6.dropOffLocation";
    private static final String TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_DATA = "testdata.case6.dropOffDate";
    private static final String TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_TIME = "testdata.case6.dropOffTime";


    private static final String TESTDATA_CASE_7_CAR_SEARCH_PICKUP_LOCATION = "testdata.case7.pickUpLocation";
    private static final String TESTDATA_CASE_7_CAR_SEARCH_PICKUP_DATE = "testdata.case7.pickUpDate";
    private static final String TESTDATA_CASE_7_CAR_SEARCH_PICKUP_TIME = "testdata.case7.pickUpTime";
    private static final String TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case7.dropOffLocation";
    private static final String TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_DATA = "testdata.case7.dropOffDate";
    private static final String TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_TIME = "testdata.case7.dropOffTime";


    private static final String TESTDATA_CASE_8_CAR_SEARCH_PICKUP_LOCATION = "testdata.case8.pickUpLocation";
    private static final String TESTDATA_CASE_8_CAR_SEARCH_PICKUP_DATE = "testdata.case8.pickUpDate";
    private static final String TESTDATA_CASE_8_CAR_SEARCH_PICKUP_TIME = "testdata.case8.pickUpTime";
    private static final String TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_LOCATION = "testdata.case8.dropOffLocation";
    private static final String TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_DATA = "testdata.case8.dropOffDate";
    private static final String TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_TIME = "testdata.case8.dropOffTime";



    public static CarRentOptions withTheSameTimeOfPickUpAndDropOff() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_1_CAR_SEARCH_DROPOFF_TIME)
                );
    }

    public static CarRentOptions withTheReturnTimeBeforeTheRentalTime() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_2_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withBigDistanceBetweenPickUpAndDropOffPlaces() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_3_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withIncorrectPickUpLocation() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_4_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withAllCorrectCriterias() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_5_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withInvalidTime() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_6_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withDifferentCountriesInPickUpAndDropOffLocations() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_7_CAR_SEARCH_DROPOFF_TIME)
        );
    }

    public static CarRentOptions withLongTime() {
        return new CarRentOptions(
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_PICKUP_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_PICKUP_DATE),
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_PICKUP_TIME),
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_LOCATION),
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_DATA),
                TestDataReader.getTestData(TESTDATA_CASE_8_CAR_SEARCH_DROPOFF_TIME)
        );
    }
}
