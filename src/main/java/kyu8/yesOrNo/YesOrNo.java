package kyu8.yesOrNo;

public class YesOrNo {

    public static String boolToWord(boolean b) {
        String yes = "Yes";
        String no = "No";

        if (b) {
            return yes;
        } else {
            return no;
        }
    }
}
