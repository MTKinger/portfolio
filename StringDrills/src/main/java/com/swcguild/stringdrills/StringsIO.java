package com.swcguild.stringdrills;

public class StringsIO {

    public String sayHi(String name) {
        String output = "Hello, " + name + ".";
        return output;
    }

    public String abba(String a, String b) {
        String output = a + b + b + a;
        return output;
    }

    public String makeTags(String tag, String comment) {
        String output = "<" + tag + ">" + comment + "</" + tag + ">";
        return output;
    }

    public String insertWord(String container, String word) {
        String output = container.substring(0, 2) + word + container.substring(2, 4);
        return output;
    }

    public String multipleEndings(String word) {
        String output = word.substring(word.length() - 2) + word.substring(word.length() - 2) + word.substring(word.length() - 2);
        return output;
    }
    public String firstHalf(String word) {
        String output = word.substring(0, word.length()/2);
        return output;
    }
    

}

//StringsIO sio = new StringsIO();