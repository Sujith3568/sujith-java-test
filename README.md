# sujith-java-test
Task 1: Palindrome Checker 
In class PalindromChecker the static method isPalindrome() will accept the String argument as the parameter and return the boolean value(true or false).
Initially the received String is cleaned and converted into lowercase letter by using .replaceAll() and .toLowerCase() method. 
Then using StringBuilder and .reverse() method the cleaned string is revesed and stored. 
By using .equals() the isPalindrome() return true if revered string and cleaned string are same otherwise false.
In the main method the isPalindrome() method is called along with sending the string as argument and the result is printed.

Task 2: Simple Employee Class
The constructor of Employee class is created which take 3 parameter. 
increaseSalary() method  will increase the salary by the percentage that the user is provided. 
In the main method the 2 employees object are created.
The first employee salary is increased by 10% by calling the increaseSalary() method and sending the 10% as the argument.
Finally printed both employee details where first employee salary is increased by 10% and the second employee salary remain same.

Task 3: Database Query Simulator
The getOpenCases() method will take the list of cases as argument and return the list of cases whose status = open.
The for each loop will iterate through the list and with the use of .equalsIgnoreCase() and .add() method the cases with status = open are added to separate list.
Inside the main method 5 sample cases are created and added to the list. 
This list is send to the getOpencases() method as the argument.
The list of cases whose status = open are printed.
