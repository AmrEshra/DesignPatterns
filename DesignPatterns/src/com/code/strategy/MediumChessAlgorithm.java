package com.code.strategy;


public class MediumChessAlgorithm implements ChessAlgorithm{

    @Override
    public String calculateNextStep() {
    	return getClass().getName();
    }
}
