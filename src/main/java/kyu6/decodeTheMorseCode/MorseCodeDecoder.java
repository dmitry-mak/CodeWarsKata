package kyu6.decodeTheMorseCode;

public class MorseCodeDecoder {

    public static void main(String[] args) {
        decode(".... . -.--   .--- ..- -.. .");

    }

    public static String decode(String morseCode) {


        String[] morseToArray = morseCode.split(" ");
        StringBuilder arrayToString = new StringBuilder();

        for (int i = 0; i < morseToArray.length; i++) {
            if (morseToArray[i].isEmpty()) {
                arrayToString.append(" ");
            } else {
                String decodedCharTemp = MorseCode.get(morseToArray[i]);
                if (decodedCharTemp != null) {
                    arrayToString.append(decodedCharTemp);
                }
            }
        }


        String finalString = arrayToString.toString().replaceAll(" +", " ").trim();
        System.out.println(finalString);

        return finalString;
    }
}
