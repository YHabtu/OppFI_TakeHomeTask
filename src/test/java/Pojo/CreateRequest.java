package Pojo;

public class CreateRequest {
    public static CreditRequestPOJO GetLoanRequest(String SSN, String stateCode, int grossMonthlyIncome, int requestedAmount, String leadOfferId, String email)
    {
        Address address = new Address("123 Main Street","Miami","33125","US");
        PersonalInfo personalInfo = new PersonalInfo("Jennifer", "Smith","19451009",
                address, "3224340098","4523452232");
        BankInfo bankInfo = new BankInfo("Chase","123456789","012345789",1, 6);
        IncomeInfo incomeInfo = new IncomeInfo("Employment","DirectDeposit",1,"20160915");
        EmploymentInfo employmentInfo = new EmploymentInfo("ToysRUs","20110516");

        CreditRequestPOJO Request = new CreditRequestPOJO(false, "en",
                "USD", "11-50-newhope", SSN,leadOfferId
                ,email, stateCode,grossMonthlyIncome
                , personalInfo, bankInfo, incomeInfo,employmentInfo
                ,requestedAmount);

        return Request;

    }
}

/*

{
"isProduction": false,
"language": "en",
"currency": "USD",
"campaignId": "11-50-newhope",
"socialSecurityNumber":"123456780",
"leadOfferId": "20160912-21EC2020-3AEA-4069-A2DD-08002B30309D",
"email": "test_customer@gmail.com",
"stateCode": "FL",
"grossMonthlyIncome": 2800,
"personalInfo": {
"firstName": "Jennifer",
"lastName": "Smith",
"dateOfBirth": "19451009",
"address": {
"streetAddress": "123 Main Street",
"city": "Miami",
"zip": "33125",
"countryCode":"US"
},
"mobilePhone": "3224340098",
"homePhone": "4523452232"
},
"bankInfo": {
"bankName": "Chase",
"abaRoutingNumber": "123456789",
"accountNumber": "012345789",
"accountType": 1,
"accountLength": 6
},
"incomeInfo": {
"incomeType": "Employment",
"payrollType": "DirectDeposit",
"payrollFrequency": 1,
"lastPayrollDate": "20160915"
},
"employmentInfo": {
"employerName": "ToysRUs",
"hireDate": "20110516"
},
"requestedLoanAmount": 1500}
 */
