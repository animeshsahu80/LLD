package org.LLDLogger;

public class ErrorLogProcessor extends  LogProcessor{

    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR){
            System.out.println("ERROR "+ message);
        }
        super.log(logLevel, message);
    }
}
