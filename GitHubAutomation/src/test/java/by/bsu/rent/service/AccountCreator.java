package by.bsu.rent.service;

import by.bsu.rent.model.Account;

public class AccountCreator {
    private static final String TEST_CASE_9_ACCOUNT_EMAIL = "testdata.case9.account.email";
    private static final String TEST_CASE_9_ACCOUNT_PASSWORD = "testdata.case9.account.password";
    private static final String TEST_CASE_9_ACCOUNT_PASSWORD_AGAIN = "testdata.case9.account.passwordAgain";

    private static final String TEST_CASE_10_ACCOUNT_EMAIL = "testdata.case10.account.email";
    private static final String TEST_CASE_10_ACCOUNT_PASSWORD = "testdata.case10.account.password";
    private static final String TEST_CASE_10_ACCOUNT_PASSWORD_AGAIN = "testdata.case10.account.passwordAgain";


    public static Account withValidEmailAndPassword() {
        return new Account(TestDataReader.getTestData(TEST_CASE_9_ACCOUNT_EMAIL),
                TestDataReader.getTestData(TEST_CASE_9_ACCOUNT_PASSWORD),
                TestDataReader.getTestData(TEST_CASE_9_ACCOUNT_PASSWORD_AGAIN));
    }

    public static Account withInvalidAgainPassword() {
        return new Account(TestDataReader.getTestData(TEST_CASE_10_ACCOUNT_EMAIL),
                TestDataReader.getTestData(TEST_CASE_10_ACCOUNT_PASSWORD),
                TestDataReader.getTestData(TEST_CASE_10_ACCOUNT_PASSWORD_AGAIN));
    }
}
