package com.enellpii.tries;

import java.util.Random;

/**
 * Created by melissa on 6/29/17.
 * Class that selects a 'random' letter, where more common letters are selected more often.
 */

public class RandomLetter {
    char[] letters = new char[1000];

    public char getLetter(){
        Random rand = new Random();
        int i = rand.nextInt(1000);
        return this.letters[i];
    }

    public RandomLetter() {
        for(int i = 0; i < 1000; i++){
            if(i < 127)
                letters[i] = 'e';
            else if(i >= 127 && i < 218)
                letters[i] = 't';
            else if(i >= 218 && i < 300)
                letters[i] = 'a';
            else if(i >= 300 && i < 375)
                letters[i] = 'o';
            else if(i >= 375 && i < 445)
                letters[i] = 'i';
            else if(i >= 445 && i < 512)
                letters[i] = 'n';
            else if(i >= 512 && i < 575)
                letters[i] = 's';
            else if(i >= 575 && i < 636)
                letters[i] = 'h';
            else if(i >= 636 && i < 696)
                letters[i] = 'r';
            else if(i >= 696 && i < 739)
                letters[i] = 'd';
            else if(i >= 739 && i < 779)
                letters[i] = 'l';
            else if(i >= 779 && i < 807)
                letters[i] = 'c';
            else if(i >= 807 && i < 835)
                letters[i] = 'u';
            else if(i >= 835 && i < 859)
                letters[i] = 'm';
            else if(i >= 859 && i < 883)
                letters[i] = 'w';
            else if(i >= 883 && i < 905)
                letters[i] = 'f';
            else if(i >= 905 && i < 925)
                letters[i] = 'g';
            else if(i >= 925 && i < 945)
                letters[i] = 'y';
            else if(i >= 945 && i < 964)
                letters[i] = 'p';
            else if(i >= 964 && i < 979)
                letters[i] = 'b';
            else if(i >= 979 && i < 989)
                letters[i] = 'v';
            else if(i >= 989 && i < 995)
                letters[i] = 'k';
            else if(i == 996)
                letters[i] = 'j';
            else if(i == 997)
                letters[i] = 'x';
            else if(i == 998)
                letters[i] = 'q';
            else if(i == 999)
                letters[i] = 'z';
        }
    }
}
