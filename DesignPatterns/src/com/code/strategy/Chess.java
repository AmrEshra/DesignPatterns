package com.code.strategy;

public class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    public String calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
