package com.team.study.designpatten;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

}
