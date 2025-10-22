## Number Systems 
- convert between data types & num systems supported in java
- convert between:
 
    - decimal <--> binary <—> octal <—> hexadecimal

## must know
-   understand how to convert from one base numbering system to another 
    - each digit represents the base of the system to the power of (which?) digit
        - decimal:
            - ones, tens, hundreds, thousands digit, etc
        - binary:
            - ones, twos, fours, eighths etc.
        - octal:
            - ones digit, eighths, sixteens, thirty-twos digit, etc
        - hexadecimal:
            - ones digit, sixteens digit, two-fifty-sixes, etc
## input
- ask user to enter string of 1 - 16 0's and 1's (represent __binary__ value)
    - get value as string
        - use __appropriate lib__ to parse this string of digits to integer & store it in variable
    - dissect integer value
        - __convert to__:
            - octal
            - decimal
            - hexadecimal 
## consider
- if max input digits <= 16, max value of integer = ???
- how many bytes of integer data type do we __really__ use?
- best data type for variable to store __input__ value into?
- what __validations__ would be appropriate to apply to the input?

## output 
- for octal, decimal, hexadecimal: 
    - program to print a series of well-formatted lines with tabs to line up output on the screen
- each line will have number in __first__ column (labels digit position) - __second__ column = value of digit

## hint 
- divide + modulo operators may be useful


## requirements
- main method
- 3 other methods
    - octal
    - decimal
    - hexadecimal
- these methods will be passed the integer value parsed from the input & print the respective rows of text 

