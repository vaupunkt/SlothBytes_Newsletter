# Numbers to English
Write a function that accepts a positive integer between 0 and 999 inclusive and returns a string representation of that integer written in English.

## Examples
```numToEng(0)
output = "zero"

numToEng(18)
output = "eighteen"

numToEng(126)
output = "one hundred twenty six"

numToEng(909)
output = "nine hundred nine" 
```

## Notes
There are no hyphens used (e.g. "thirty five" not "thirty-five").

The word "and" is not used (e.g. "one hundred one" not "one hundred and one").

## Solution
- Compile the App.java with ```javac App.java```
- Run the App with ```java App <number>``` where ```<number>``` is the number you want to convert to English Words

```
java App 22
twenty two

java App 34
thirty four
```