# FizzBuzz
A simple implementation for a fizz buzz problem

## Requirements
 Write a program that prints the numbers from 1 to 100.  For numbers containing the digit '3' print "Fizz" instead of the number.  For numbers containing the digit '5' print "Buzz". For numbers containing both digit ‘3’ and digit ‘5’ print “FizzBuzz” or “BuzzFizz” depending on order.

## Solution Guide
There are patterns in the data that can be used to generate a solution to the problem.  The pattern is clearer if the numbers are thought of as 01, 02, 03, 04, 05 . . . 97, 98, 99, 100.  This way I can break a number down into its first and second digit (100 is the only triple).  The digits can only range from 0-9.   Because the first digit represents the 10s spot the range from (10 x N) to (10 x (N+1))-1, where N is the digit to look for, will give use the desired locations to print fizz or buzz.  Writing fizz or buzz for the second place digit is a bit trickier, but the pattern isn’t too hard to see.  First let’s look at all the second place digits having 3 or 5.  For fizz we have 03, 13, 23, 33, etc and for buzz we have 05, 15, 25, 35, etc.  We can observe that starting at 3 and 5 the next fizz or buzz can be found by adding 10.   I now know where to find the 3 and 5 in the first and second digit spots and can now begin to write my program.

To start the program I need to iterate through all 100 numbers, so a for-loop from 1 to 100 will be used.  Because ordering matters for printing fizzbuzz or buzzfizz checking the first digit spot should be done first.  Two if statements checking if we are in the (10 x N) to (10 x (N+1))-1 range (30-39 and 50-59) can be used to determine if we need to write fizz or buzz.  To check if the second digit is 3 or 5 we need to start two counters one at iteration 3 and one at iteration 5, then each counter will increment.  During each iteration the counters are modulated by 10 and if the result is 0 then we know that 10 iterations have passed and fizz or buzz should be printed.  Because there is overlap at 11 x N (33 and 55) we need account for this to prevent fizzfizz or buzzbuzz from being printed.  Finally a blank String variable will be created at the top of the loop.  When a digit is detected, fizz or buzz will be added to the String.  At the end of the loop if the String variable is still blank add the iteration number to the String variable.  Finally print out the String variable.  This should give the correct result for the problem.

## Output
1<br/>
2<br/>
fizz<br/>
4<br/>
buzz<br/>
6<br/>
7<br/>
8<br/>
9<br/>
10<br/>
11<br/>
12<br/>
fizz<br/>
14<br/>
buzz<br/>
16<br/>
17<br/>
18<br/>
19<br/>
20<br/>
21<br/>
22<br/>
fizz<br/>
24<br/>
buzz<br/>
26<br/>
27<br/>
28<br/>
29<br/>
fizz<br/>
fizz<br/>
fizz<br/>
fizz<br/>
fizz<br/>
fizzbuzz<br/>
fizz<br/>
fizz<br/>
fizz<br/>
fizz<br/>
40<br/>
41<br/>
42<br/>
fizz<br/>
44<br/>
buzz<br/>
46<br/>
47<br/>
48<br/>
49<br/>
buzz<br/>
buzz<br/>
buzz<br/>
buzzfizz<br/>
buzz<br/>
buzz<br/>
buzz<br/>
buzz<br/>
buzz<br/>
buzz<br/>
60<br/>
61<br/>
62<br/>
fizz<br/>
64<br/>
buzz<br/>
66<br/>
67<br/>
68<br/>
69<br/>
70<br/>
71<br/>
72<br/>
fizz<br/>
74<br/>
buzz<br/>
76<br/>
77<br/>
78<br/>
79<br/>
80<br/>
81<br/>
82<br/>
fizz<br/>
84<br/>
buzz<br/>
86<br/>
87<br/>
88<br/>
89<br/>
90<br/>
91<br/>
92<br/>
fizz<br/>
94<br/>
buzz<br/>
96<br/>
97<br/>
98<br/>
99<br/>
100<br/>



