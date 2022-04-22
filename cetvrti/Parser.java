package hr.fer.oop;

public class Parser {
    public static User parseInputString (String input) throws Throwable {
        String[] inputArray = input.split("/");
        if (inputArray.length != 4) {
            throw new InvalidNumberOfArgumentsException("Invalid input!");
        }
        try {
            Double OIB = Double.parseDouble(inputArray[0]);
            String name = inputArray[1];
            String surname = inputArray[2];
            String serviceTypeValue = inputArray[3];

            ServiceType serviceType;
            switch (serviceTypeValue) {
                case "A":
                    serviceType = ServiceType.SUBSCRIBE;
                    break;
                case "B":
                    serviceType = ServiceType.PREPAID;
                    break;
                case "C":
                    serviceType = ServiceType.VIRTUAL;
                    break;
                default:
                    serviceType = null;
            }
                if (serviceType == null) {
                    throw new ArgumentParseException("Invalid service type!");
                }
            return new User(OIB, name, surname, serviceType);
        } catch (Exception e) {
            throw new ArgumentParseException("Invalid input!").initCause(e);
        }
    }
}
