# 12 vs 24 Hours
Create a function that converts 12-hour time to 24-hour time or vice versa. Return the output as a string.

## Examples
```bash
convertTime("12:00 am")
output = "0:00"

convertTime("6:20 pm")
output = "18:20"

convertTime("21:00")
output = "9:00 pm"

convertTime("5:05")
output ="5:05 am"
```
## Notes
- A 12-hour time input will be denoted with an am or pm suffix.
- A 24-hour input time contains no suffix.

## Solution
- Compile the App.java with `javac convertTime.java`
- Run the App with `java convertTime <timeString>` where `<timeString>` is your Time you want to convert
```bash
java convertTime "00:05"   
0:05

java convertTime "12:00 pm"
12:00

java convertTime "13:04"
1:04 pm
```