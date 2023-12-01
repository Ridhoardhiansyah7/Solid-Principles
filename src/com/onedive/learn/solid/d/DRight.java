package com.onedive.learn.solid.d;

/*
Class ini merupakan class yg mengikuti prinsip DIP karna pada class CopyProgram class tsb bergantung pada abstraksi
sedangkan class low level nya KeyboardTextCopySource,FileCopySource juga bergantung pada abstaksi
 */
interface ICopyProgramSource {
    String sourceName();
}

class KeyboardTextCopySource implements ICopyProgramSource{

    @Override
    public String sourceName() {
        return "keyboard selected text";
    }
}

class FileCopySource implements ICopyProgramSource{

    @Override
    public String sourceName() {
        return "file";
    }
}

class CopyProgram {

    private ICopyProgramSource source;
    public CopyProgram(ICopyProgramSource source){
        this.source = source;
    }

    public String getSource(){
        return source.sourceName();
    }

}


public class DRight {

    public static void main(String[] args) {
        CopyProgram copyProgram = new CopyProgram(new FileCopySource());
        System.out.println("Copy program from : " + copyProgram.getSource());

        copyProgram = new CopyProgram(new KeyboardTextCopySource());
        System.out.println("Copy program from : " + copyProgram.getSource());

    }


}
