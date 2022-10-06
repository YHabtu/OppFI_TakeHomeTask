# OppFI_TakeHomeTask
## Framework Description
The Framework is a Maven Project where I used pom.xml file to store dependcies. I used Junit for assertion purpose and test ordering and display name.
Rest Assured as Rest client.

The project consists of 2 folders POJO (Plain old Java Object) where the post request payload is converted to Java class, PostCreditRequestTest where all the testing happen and Base class is where the Before and After methods are. The Framework also have Configuration.properties where URL and API Key should exist (API Key is removed), and pom.xml file is where all dependecies exist.

## How to Run the test cases:
First after cloning the progect from GitHub is to reload Maven so it can download all the libraries from pom.xml file
![Image 10-5-22 at 7 57 PM copy](https://user-images.githubusercontent.com/78940196/194190799-6da1dc81-6c48-4864-934f-70c130f1d13e.jpeg)

## After reload is done click on Maven again Clean and compile the project
<img width="480" alt="Untitled" src="https://user-images.githubusercontent.com/78940196/194195151-d2317fd8-3304-4c02-bc6c-6d7aa4b4973f.png">

 To run test the only this that needs to be done is to click on Green run button.
 <img width="564" alt="Untitled" src="https://user-images.githubusercontent.com/78940196/194191775-95d6112c-7edf-44a2-9a2b-c03558737085.png">

## To Run test API key needs to be inserted in Configrations.properties file APIKey= with out any double quotes 
## The test consist three test cases 
###### 1, where user gets approved with 200 status code
###### 2, where user gets declined with 200 status code 
###### 3, where customer miss required fields ``SSN, leadOfferlead, gossMonthlyIncome, requestedAmount, stateCode, email``


 

