package org.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() < 19){
            return true;
        } else return false;
    }
}


/*
 Полные требования:
-в строке не меньше 3 и не больше 19 символов,
-в строке есть только один пробел,
-пробел стоит не в начале и не в конце строки.
 */