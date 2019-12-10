package by.bsu.rent.service;

import by.bsu.rent.model.PageError;

public class PageErrorCreator {
    private static final String PICK_UP_TIME_ERROR =
            "testdata.case1.pickUpTime.error";

    private static final String DROP_OFF_TIME_ERROR =
            "testdata.case2.dropOffTime.error";

    private static final String PICK_UP_AND_DROP_OFF_LOCATION_ERROR =
            "testdata.case3.pickUpAndDropOffLocation.error";

    private static final String PICK_UP_LOCATION_ERROR =
            "testdata.case4.pickUpLocation.error";

    private static final String PICK_UP_AND_CURRENT_TIME_ERROR =
            "testdata.case6.pickUpTime.error";

    private static final String PICK_UP_AND_DROP_OFF_TIME_ERROR =
            "testdata.case8.pickUpAndDropOffTime.error";

    private static final String AGAIN_PASSWORD_ERROR =
            "testdata.case10.account.againPassword.error";

    public static PageError forZeroPeriod() {
        return new PageError(TestDataReader.getTestData(PICK_UP_TIME_ERROR));
    }

    public static PageError forReturnTimeBeforeRentalTime() {
        return new PageError(TestDataReader.getTestData(DROP_OFF_TIME_ERROR));
    }

    public static PageError forBigDistanceBetweenPickAndDropPlaces() {
        return new PageError(TestDataReader.getTestData(PICK_UP_AND_DROP_OFF_LOCATION_ERROR));
    }

    public static PageError forIncorrectPickUpLocation() {
        return new PageError(TestDataReader.getTestData(PICK_UP_LOCATION_ERROR));
    }

    public static PageError forInvalidTime() {
        return new PageError(TestDataReader.getTestData(PICK_UP_AND_CURRENT_TIME_ERROR));
    }

    public static PageError forLongTime() {
        return new PageError(TestDataReader.getTestData(PICK_UP_AND_DROP_OFF_TIME_ERROR));
    }

    public static PageError forInvalidAgainPassword() {
        return new PageError(TestDataReader.getTestData(AGAIN_PASSWORD_ERROR));
    }










}
