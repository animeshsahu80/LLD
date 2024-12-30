package org.LLDLogger;

public class Main {
    public static void main(String[] args) {
        LogProcessor log= new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        log.log(LogProcessor.ERROR,"error");
    }
}