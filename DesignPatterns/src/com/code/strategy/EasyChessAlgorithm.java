package com.code.strategy;

public class EasyChessAlgorithm implements ChessAlgorithm{

    @Override
    public String calculateNextStep() {
        return getClass().getName();
    }
}
