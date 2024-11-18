public class convertTime {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please provide a Time-String as Argument");
            System.exit(0);
        }
        if (args.length > 1) {
            System.out.println("Please provide a Time-String as Argument");
            System.exit(0);
        }

        String argument = args[0].toLowerCase();

        if (argument.length() == 0) {
            System.out.println("Argument too short");
            System.exit(0);
        }

        if (argument.contains("pm") || argument.contains("am")) {
            String[] splitArgument = argument.substring(0, argument.length() - 3).split(":");
            int hour = Integer.parseInt(splitArgument[0]);
            int minute = Integer.parseInt(splitArgument[1]);
            if (argument.contains("am") && hour == 12) {
                hour = 0;
            } else if (argument.contains("pm") && hour != 12) {
                hour += 12;
            }
            String minuteString = minute < 10 ? "0" + minute : String.valueOf(minute);
                System.out.println(hour + ":" + minuteString);
        } else {
            String [] splitArgument = argument.split(":");
            int hour = Integer.parseInt(splitArgument[0]);
            int minute = Integer.parseInt(splitArgument[1]);
            if (hour > 12) {
                hour -= 12;
                String minuteString = minute < 10 ? "0" + minute : String.valueOf(minute);
                System.out.println(hour + ":" + minuteString + " pm");
            } else {
                hour = hour == 0 ? 12 : hour;
                String minuteString = minute < 10 ? "0" + minute : String.valueOf(minute);
                System.out.println(hour + ":" + minuteString + " am");
            }
        }

    }
}
