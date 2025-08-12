package kyu7.complementaryDNA;

public class DnaStrand {
    public static String makeComplement(String dna) {
        //Your code
        String a = "A";
        String t = "T";
        String c = "C";
        String g = "G";

        StringBuilder result = new StringBuilder();

        String[] dnaCode = dna.split("");
        for (int i = 0; i < dnaCode.length; i++) {
            switch (dnaCode[i]) {
                case "A":
                    dnaCode[i] = t;
                    break;
                case "T":
                    dnaCode[i] = a;
                    break;
                case "C":
                    dnaCode[i] = g;
                    break;
                case "G":
                    dnaCode[i] = c;
                    break;
                default:
                    break;
            }
        }

        for (String dnaElements : dnaCode) {
            result.append(dnaElements);
        }

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(makeComplement("ATCG"));
    }
}
