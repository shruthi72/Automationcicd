TestNG Automation Framework
Welcome to the TestNG Automation Framework repository! This project demonstrates the use of TestNG, a powerful Java testing framework, for creating and managing test cases efficiently.

Overview
TestNG is a testing framework inspired by JUnit and NUnit, designed to simplify testing and make it more powerful. This repository showcases:

Creating and managing test cases with TestNG.
Utilizing TestNG annotations for better test organization.
Generating detailed test reports.
Configuring test execution with XML files.

Features
Flexible Annotations: Manage tests with annotations like @Test, @BeforeMethod, and @AfterClass.
Parallel Testing: Execute tests concurrently for faster feedback.
Data-Driven Testing: Use @DataProvider for parameterized tests.
Custom Reports: Generate detailed reports on test execution.

Prerequisites
Ensure the following are installed:
Java 8 or higher
Maven or Gradle
IntelliJ IDEA, Eclipse, or any preferred IDE
Setup and Installation

Clone the repository:
git clone https://github.com/shruthi72/TestNG.git  
cd TestNG  

Install dependencies using Maven:
mvn clean install  
Import the project into your IDE and configure the necessary settings.

Usage
Running Tests
Define test cases in the src/test/java directory using TestNG annotations.
Configure your tests in testng.xml for customized execution.
Execute the tests using Maven:
mvn test  

Example
Sample Test Case (ExampleTest.java)
import org.testng.Assert;  
import org.testng.annotations.Test;  

public class ExampleTest {  

    @Test  
    public void testAddition() {  
        int result = 2 + 3;  
        Assert.assertEquals(result, 5, "Addition test failed!");  
    }  
}  

Sample testng.xml File
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">  
<suite name="Sample Suite">  
    <test name="Sample Test">  
        <classes>  
            <class name="com.example.tests.ExampleTest" />  
        </classes>  
    </test>  
</suite>  
              
Project Structure
TestNG/  
├── src/  
│   ├── test/  
│   │   ├── java/  
│   │   │   ├── tests/         # Test classes  
│   │   │   ├── utils/         # Utility classes  
│   │   │   └── base/          # Base test classes  
│   │   └── resources/  
│   │       └── testng.xml     # TestNG configuration file  
├── pom.xml                    # Maven dependencies  
└── README.md                  # Project documentation  
