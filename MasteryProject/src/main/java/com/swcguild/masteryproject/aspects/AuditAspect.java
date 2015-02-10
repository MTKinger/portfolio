package com.swcguild.masteryproject.aspects;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class AuditAspect {
    
    final String TARGET_FILE = "activityLog.txt";
    
    public void auditCreateOrder()throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(TARGET_FILE, true));
        out.println("New order created @ " + LocalDateTime.now());
        out.flush();
        out.close();
    }
    
    public void auditDeleteOrder()throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(TARGET_FILE, true));
        out.println("Order deleted @ " + LocalDateTime.now());
        out.flush();
        out.close();
    }
    
    public void auditUpdateOrder()throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(TARGET_FILE, true));
        out.println("Order edited @ " + LocalDateTime.now());
        out.flush();
        out.close();
    }

}
