package Pojo;

import java.util.ArrayList;

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
    public ArrayList<Offer> offers;

    public class Address{
        public String streetAddress;
        public String city;
        public String zip;
        public String countryCode;
    }

    public class BankInfo{
        public String bankName;
        public String abaRoutingNumber;
        public String accountNumber;
        public int accountType;
        public int accountLength;
    }

    public class EmploymentInfo{
        public String employerName;
        public String hireDate;
    }

    public class IncomeInfo{
        public String incomeType;
        public String payrollType;
        public int payrollFrequency;
        public String lastPayrollDate;
    }

    public class PersonalInfo{
        public String firstName;
        public String lastName;
        public String dateOfBirth;
        public Address address;
        public String mobilePhone;
        public String homePhone;
    }

    public class Offer{
        public String url;
        public int term;
        public int monthlyPayment;
        public int amount;
        public String currency;
        public int interestRate;
        public String description;
        public double representativeAPR;
    }

    public class Request{
        public String email;
        public IncomeInfo incomeInfo;
        public String campaignId;
        public int requestedLoanAmount;
        public int grossMonthlyIncome;
        public String leadOfferId;
        public String socialSecurityNumber;
        public boolean isProduction;
        public PersonalInfo personalInfo;
        public String currency;
        public String language;
        public String stateCode;
        public EmploymentInfo employmentInfo;
        public BankInfo bankInfo;
    }

    public class Root{
        public Request request;
        public boolean accepted;
        public int partnerId;
        public String reference_id;
        public int code;
        public String status;
        public String apiVersion;
        public ArrayList<Offer> offers;
    }

    public void setProduction(boolean production) {
        isProduction = production;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setLeadOfferId(String leadOfferId) {
        this.leadOfferId = leadOfferId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public void setGrossMonthlyIncome(int grossMonthlyIncome) {
        this.grossMonthlyIncome = grossMonthlyIncome;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public void setIncomeInfo(IncomeInfo incomeInfo) {
        this.incomeInfo = incomeInfo;
    }

    public void setEmploymentInfo(EmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
    }

    public void setRequestedLoanAmount(int requestedLoanAmount) {
        this.requestedLoanAmount = requestedLoanAmount;
    }

    public boolean isProduction() {
        return isProduction;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getLeadOfferId() {
        return leadOfferId;
    }

    public String getEmail() {
        return email;
    }

    public String getStateCode() {
        return stateCode;
    }

    public int getGrossMonthlyIncome() {
        return grossMonthlyIncome;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public IncomeInfo getIncomeInfo() {
        return incomeInfo;
    }

    public EmploymentInfo getEmploymentInfo() {
        return employmentInfo;
    }

    public int getRequestedLoanAmount() {
        return requestedLoanAmount;
    }


}

