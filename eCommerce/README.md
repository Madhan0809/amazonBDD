##Prerequisites:

##JAVA_HOME and M3_HOME (Maven) variables are correctly set.

##To Run Tests:

1. From the command line change directory to ~/
eCommerce

2. Then run the tests using the command: mvn clean -PChromeRunner verify -e -fae 

[To run in chrome browser].

## Profiles - ChromeRunner, FirefoxRunner and Parallel

## To view report 
1. Go to target/cucumber
2. and open index.html

For failed scenarios, screenshots will be embeded to the reports
