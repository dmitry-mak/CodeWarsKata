package kyu6.createPhoneNumber;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String result = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
        return result;
    }

    public static String createPhoneNumberUpdated(int[] numbers) {

        StringBuilder phoneNumber = new StringBuilder("(");
        for (int i = 0; i < 3; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append(") ");
        for (int i = 3; i < 6; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append("-");
        for (int i = 6; i <= 9; i++) {
            phoneNumber.append(numbers[i]);
        }
        return phoneNumber.toString();
    }
}
