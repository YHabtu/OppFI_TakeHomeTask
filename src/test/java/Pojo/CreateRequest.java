package Pojo;

import com.github.javafaker.Faker;

public class CreateRequest {

    public static CreditRequestPOJO GetLoanRequest(){
        CreditRequestPOJO Request = new CreditRequestPOJO();
        Request.isProduction = false;
        Request.language = "en";
        Request.currency = "USD";
        Request.campaignId = "11-50-newhope";
        Request.socialSecurityNumber = "123456780";
        Request.leadOfferId = "20160912-21EC2020-3AEA-4069-A2DD-08002B30309D";
        Request.email = "test_customer@gmail.com";
        Request.stateCode = "FL";
        Request.grossMonthlyIncome = 2800;
        Request.personalInfo.firstName = "Jennifer";
        Request.personalInfo.lastName = "Smith";
        Request.personalInfo.dateOfBirth = "19451009";
        Request.personalInfo.address.streetAddress = "123 Main Stree";
        Request.personalInfo.address.city = "Miami";
        Request.personalInfo.address.zip = "33125";
        Request.personalInfo.address.countryCode = "US";
        Request.personalInfo.mobilePhone= "3224340098";
        Request.personalInfo.homePhone = "4523452232";
        Request.bankInfo.bankName = "Chase";
        Request.bankInfo.abaRoutingNumber = "123456789";
        Request.bankInfo.accountType = 1;
        Request.bankInfo.accountLength = 6;
        Request.incomeInfo.incomeType = "Employment";
        Request.incomeInfo.payrollType = "DirectDeposit";
        Request.incomeInfo.payrollFrequency = 1;
        Request.incomeInfo.lastPayrollDate = "20160915";
        Request.employmentInfo.employerName = "ToysRUs";
        Request.employmentInfo.hireDate = "20110516";
        Request.requestedLoanAmount = 1500;
        return Request;
    }
}
