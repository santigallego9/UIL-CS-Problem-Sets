Your team has been assigned to write an app that obtains personal information from the users of the app. You have been assigned the part of the program that verifies the user's phone number.

The user is told to enter their phone number in the form ddd-ddd-dddd where d is a digit, 0 through 9. You are to verify that the user's input is correct.


####Input
The first line of input will contain a single integer n that indicates the number of phone numbers to follow. Each of the following n lines will contain a single string with no spaces.

####Output
For each string input, you will print the phone number if it is formatted correctly. If the phone number is not formatted correctly, you will print: INVALID PHONE NUMBER.

####Example Input File
```
4 
214-234-5647 
456.765.3456 
(768)567-4536 
342-3098
```

####Example Output to Screen
```
214-234-5647
INVALID PHONE NUMBER 
INVALID PHONE NUMBER 
INVALID PHONE NUMBER
```
