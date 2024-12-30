package org.LLDLogger;

public class InfoLogProcessor extends  LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==INFO){
            System.out.println("INFO "+ message);
        }
        super.log(logLevel, message);
    }
}
