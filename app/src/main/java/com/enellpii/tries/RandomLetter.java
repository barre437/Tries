package com.enellpii.tries;

import java.util.Random;

/**
 * Created by melissa on 6/29/17.
 * Class that selects a 'random' letter, where more common letters are selected more often.
 */

public class RandomLetter {
    char[] letters = new char[200];

    public char getLetter(){
        Random rand = new Random();
        int i = rand.nextInt(200);
        return this.letters[i];
    }

    public RandomLetter() {
        for(int i = 0; i < 200; i++){
            if(i < 25)
                letters[i] = 'e';
            else if(i >= 25 && i < 43)
                letters[i] = 't';
            else if(i >= 43 && i < 59)
                letters[i] = 'a';
            else if(i >= 59 && i < 74)
                letters[i] = 'o';
            else if(i >= 74 && i < 88)
                letters[i] = 'i';
            else if(i >= 88 && i < 101)
                letters[i] = 'n';
            else if(i >= 101 && i < 114)
                letters[i] = 's';
            else if(i >= 114 && i < 126)
                letters[i] = 'h';
            else if(i >= 126 && i < 138)
                letters[i] = 'r';
            else if(i >= 138 && i < 147)
                letters[i] = 'd';
            else if(i >= 147 && i < 155)
                letters[i] = 'l';
            else if(i >= 155 && i < 161)
                letters[i] = 'c';
            else if(i >= 161 && i < 167)
                letters[i] = 'u';
            else if(i >= 167 && i < 172)
                letters[i] = 'm';
            else if(i >= 172 && i < 177)
                letters[i] = 'w';
            else if(i >= 177 && i < 181)
                letters[i] = 'f';
            else if(i >= 181 && i < 185)
                letters[i] = 'g';
            else if(i >= 185 && i < 189)
                letters[i] = 'y';
            else if(i >= 189 && i < 193)
                letters[i] = 'p';
            else if(i >= 193 && i < 196)
                letters[i] = 'b';
            else if(i >= 196 && i < 198)
                letters[i] = 'v';
            else if(i >= 198 && i < 200)
                letters[i] = 'k';
        }
    }
}
