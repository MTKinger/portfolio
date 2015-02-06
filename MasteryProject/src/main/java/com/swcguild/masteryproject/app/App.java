package com.swcguild.masteryproject.app;

import com.swcguild.masteryproject.businesslogic.ManagementController;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, XMLStreamException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagementController controller = ctx.getBean("managementController", ManagementController.class);
        controller.run();
    }

}
