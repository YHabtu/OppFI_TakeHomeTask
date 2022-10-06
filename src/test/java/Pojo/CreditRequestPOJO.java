package Pojo;
public class CreditRequestPOJO {
    public boolean isProduction;
    public String language;
    public String currency;
    public String campaignId;
    public String socialSecurityNumber;
    public String leadOfferId;
    public String email;
    public String stateCode;
    public int grossMonthlyIncome;
    public PersonalInfo personalInfo;
    public BankInfo bankInfo;
    public IncomeInfo incomeInfo;
    public EmploymentInfo employmentInfo;
    public int requestedLoanAmount;

    public CreditRequestPOJO(boolean isProduction, String language, String currency, String campaignId, String socialSecurityNumber, String leadOfferId, String email, String stateCode, int grossMonthlyIncome, PersonalInfo personalInfo, BankInfo bankInfo, IncomeInfo incomeInfo, EmploymentInfo employmentInfo, int requestedLoanAmount) {
        this.isProduction = isProduction;
        this.language = language;
        this.currency = currency;
        this.campaignId = campaignId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.leadOfferId = leadOfferId;
        this.email = email;
        this.stateCode = stateCode;
        this.grossMonthlyIncome = grossMonthlyIncome;
        this.personalInfo = personalInfo;
        this.bankInfo = bankInfo;
        this.incomeInfo = incomeInfo;
        this.employmentInfo = employmentInfo;
        this.requestedLoanAmount = requestedLoanAmount;
    }

}
     class Address{
        public String streetAddress;
         public String city;
         public String zip;
         public String countryCode;

         public Address(String streetAddress, String city, String zip, String countryCode) {
             this.streetAddress = streetAddress;
             this.city = city;
             this.zip = zip;
             this.countryCode = countryCode;
         }


    }

     class BankInfo{
         public String bankName;
         public String abaRoutingNumber;
         public String accountNumber;
         public int accountType;
         public int accountLength;

         public BankInfo(String bankName, String abaRoutingNumber, String accountNumber, int accountType, int accountLength) {
             this.bankName = bankName;
             this.abaRoutingNumber = abaRoutingNumber;
             this.accountNumber = accountNumber;
             this.accountType = accountType;
             this.accountLength = accountLength;
         }


    }

     class EmploymentInfo{
        public String employerName;
         public String hireDate;
         public EmploymentInfo(String employerName, String hireDate) {
             this.employerName = employerName;
             this.hireDate = hireDate;
         }


    }

     class IncomeInfo{
        public String incomeType;
        public String payrollType;
        public int payrollFrequency;
        public String lastPayrollDate;

         public IncomeInfo(String incomeType, String payrollType, int payrollFrequency, String lastPayrollDate) {
             this.incomeType = incomeType;
             this.payrollType = payrollType;
             this.payrollFrequency = payrollFrequency;
             this.lastPayrollDate = lastPayrollDate;
         }


    }

     class PersonalInfo{
        public String firstName;
        public String lastName;
        public String dateOfBirth;
        public Address address;
        public String mobilePhone;
        public String homePhone;

         public PersonalInfo(String firstName, String lastName, String dateOfBirth, Address address, String mobilePhone, String homePhone) {
             this.firstName = firstName;
             this.lastName = lastName;
             this.dateOfBirth = dateOfBirth;
             this.address = address;
             this.mobilePhone = mobilePhone;
             this.homePhone = homePhone;
         }

    }


