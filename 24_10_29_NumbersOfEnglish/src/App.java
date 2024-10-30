public class App {
    public static void main(String[] args) throws Exception {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : -1;
        if (number < 0) {
            System.out.println("Please provide a number as an argument.");
         }
         if (number > 999) {
            System.out.println("Please provide a number between 0 and 999.");
         } 
        String[] units = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen","nineteen"};
        String[] tens = {"twenty","thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"one hundred","two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (number < 10) {
            System.out.println(units[number]);
        }
        if (number >= 10 && number < 20) {
            System.out.println(teens[number - 10]);
        }
        if (number >= 20 && number < 100) {
            int tensDigit = number /10;
            int unitsDigit = number % 10;

            String result = tens[tensDigit - 2] + " " + units[unitsDigit];
            System.out.println(result);
        }
         

    }
}
