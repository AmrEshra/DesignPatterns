package com.code.strategy;


public class HardChessAlgorithm implements ChessAlgorithm{

    @Override
    public String calculateNextStep() {
    	return getClass().getName();
    }
}
