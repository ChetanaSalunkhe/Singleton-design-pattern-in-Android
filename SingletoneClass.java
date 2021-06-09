package com.chetana.singletonedesignpattern;

public class SingletoneClass {

    String edtValue;

    public SingletoneClass(){ }

    private static SingletoneClass INSTANCE = null;

    public SingletoneClass getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletoneClass();
        }

        return INSTANCE;
    }

    public String getEdtValue() {
        return edtValue;
    }

    public void setEdtValue(String edtValue) {
        this.edtValue = edtValue;
    }
}
