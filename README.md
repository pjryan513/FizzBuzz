# FizzBuzz
A simple implementation for a fizz buzz problem

## Requirements
 Write a program that prints the numbers from 1 to 100.  For numbers containing the digit '3' print "Fizz" instead of the number.  For numbers containing the digit '5' print "Buzz". For numbers containing both digit ‘3’ and digit ‘5’ print “FizzBuzz” or “BuzzFizz” depending on order.

## Solution Guide
There are patterns in the data that can be used to generate a solution to the problem.  The pattern is clearer if the numbers are thought of as 01, 02, 03, 04, 05 . . . 97, 98, 99, 100.  This way I can break a number down into its first and second digit (100 is the only triple).  The digits can only range from 0-9.   Because the first digit represents the 10s spot the range from (10 x N) to (10 x (N+1))-1, where N is the digit to look for, will give use the desired locations to print fizz or buzz.  Writing fizz or buzz for the second place digit is a bit trickier, but the pattern isn’t too hard to see.  First let’s look at all the second place digits having 3 or 5.  For fizz we have 03, 13, 23, 33, etc and for buzz we have 05, 15, 25, 35, etc.  We can observe that starting at 3 and 5 the next fizz or buzz can be found by adding 10.   I now know where to find the 3 and 5 in the first and second digit spots and can now begin to write my program.

To start the program I need to iterate through all 100 numbers, so a for-loop from 1 to 100 will be used.  Because ordering matters for printing fizzbuzz or buzzfizz checking the first digit spot should be done first.  Two if statements checking if we are in the (10 x N) to (10 x (N+1))-1 range (30-39 and 50-59) can be used to determine if we need to write fizz or buzz.  To check if the second digit is 3 or 5 we need to start two counters one at iteration 3 and one at iteration 5, then each counter will increment.  During each iteration the counters are modulated by 10 and if the result is 0 then we know that 10 iterations have passed and fizz or buzz should be printed.  Because there is overlap at 11 x N (33 and 55) we need account for this to prevent fizzfizz or buzzbuzz from being printed.  Finally a blank String variable will be created at the top of the loop.  When a digit is detected, fizz or buzz will be added to the String.  At the end of the loop if the String variable is still blank add the iteration number to the String variable.  Finally print out the String variable.  This should give the correct result for the problem.

## Output
1
2
fizz
4
buzz
6
7
8
9
10
11
12
fizz
14
buzz
16
17
18
19
20
21
22
fizz
24
buzz
26
27
28
29
fizz
fizz
fizz
fizz
fizz
fizzbuzz
fizz
fizz
fizz
fizz
40
41
42
fizz
44
buzz
46
47
48
49
buzz
buzz
buzz
buzzfizz
buzz
buzz
buzz
buzz
buzz
buzz
60
61
62
fizz
64
buzz
66
67
68
69
70
71
72
fizz
74
buzz
76
77
78
79
80
81
82
fizz
84
buzz
86
87
88
89
90
91
92
fizz
94
buzz
96
97
98
99
100


