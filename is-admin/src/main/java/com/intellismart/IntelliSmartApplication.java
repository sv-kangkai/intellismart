package com.intellismart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author IntelliSmart
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class IntelliSmartApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(IntelliSmartApplication.class, args);
        System.out.println("START IntelliSmart SUCCESSFUL.\n" +
                " " +
                "██╗███╗   ██╗████████╗███████╗██╗     ██╗     ██╗███████╗███╗   ███╗ █████╗ ██████╗ ████████╗ \n " +
                "██║████╗  ██║╚══██╔══╝██╔════╝██║     ██║     ██║██╔════╝████╗ ████║██╔══██╗██╔══██╗╚══██╔══╝ \n " +
                "██║██╔██╗ ██║   ██║   █████╗  ██║     ██║     ██║███████╗██╔████╔██║███████║██████╔╝   ██║    \n " +
                "██║██║╚██╗██║   ██║   ██╔══╝  ██║     ██║     ██║╚════██║██║╚██╔╝██║██╔══██║██╔══██╗   ██║    \n " +
                "██║██║ ╚████║   ██║   ███████╗███████╗███████╗██║███████║██║ ╚═╝ ██║██║  ██║██║  ██║   ██║    \n " +
                "╚═╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚══════╝╚══════╝╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    \n " +
                " ");
    }
}
