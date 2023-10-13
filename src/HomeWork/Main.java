package HomeWork;

import HomeWork.Test;
import HomeWork.Utils;
import lesson6.SaperUtils;

public class Main {
    public static void main(String[] args) {
        String inputString = "Не та шинель, что пуговицами блестит, а та, что греет.\n" +
                "Accept who you are. Unless you’re a serial killer.» (Ellen DeGeneres, Seriously… I’m Kidding";
        Utils.vowels(inputString);
        Utils.foamMarks(inputString);
        Utils.reverseText(inputString);
        Utils.reversText2(inputString);
        int[][] mass =  new int [4][49];
        Utils.mass2(mass);
        Utils.mass();
    }
}
