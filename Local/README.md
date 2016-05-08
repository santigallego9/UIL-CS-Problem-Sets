Global warming is an international concern of many people. George wants to compare the months of January in his locality over several select years to see if he can detect a pattern of local warming. He wants to consider the average temperature for each day (the average of the high and low temperature for a given day), and determine the number of days the average temperature was below freezing (32<sup>o</sup>) and the number of days the average temperature was above 50<sup>o</sup>.

You have been asked to write a program that will provide this data for him.

####Input
The first line of input will contain a single integer n that indicates the number of months to follow. Each of the following n lines will contain 32 integers. The first integer in each line is the four digit year and each of the following 31 integers represent the average temperature for each of 31 days in January. Each of items will be separated by a space.

#####Output
For each year input, you will print : y b w, where y is the four digit year, b is the number of days the average temperature was below freezing and w is the number of days the average temperature was warmer than 50.

####Example Input File
```
3
2011 32 24 16 26 37 48 52 48 57 56 34 23 32 34 23 46 46 56 52 50 43 34 23 28 36 57 59 52 51 50 54
2009 45 54 52 51 58 67 43 32 31 10 18 45 32 21 21 28 29 35 45 54 53 42 51 53 56 44 42 41 42 32 20
2007 54 65 75 74 72 53 52 42 44 41 37 36 39 28 22 25 27 26 45 45 56 57 58 59 63 52 54 63 63 42 12
```

<strong>Note:</strong> If the input lines in the printed version above stretch across two lines, they are all actually only one line each in the local.dat input file.

####Example Output to Screen
```
2011 7 10
2009 8 10
2007 6 16
```
