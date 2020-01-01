package com.code.flyweight;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordProcessor {

    private List<Letter> letters = new ArrayList<Letter>();

    public void addLetter(Letter letter){
        this.letters.add(letter);
    }

    public void printLetters(){
    	System.out.println(Arrays.toString(letters.toArray()));
    	for (Letter letter : letters) {
            System.out.print(letter.getValue());
        }
    }

}
