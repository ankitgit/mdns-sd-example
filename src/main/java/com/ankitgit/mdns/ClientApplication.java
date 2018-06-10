package com.ankitgit.mdns;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ClientApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        //connect to locally running mDNS
        JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());

        //create service information
        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "ankit", 8888, "path=\\status");

        // register the service
        jmDNS.registerService(serviceInfo);

        // Wait a bit
        Thread.sleep(2500);

        // Unregister all services
        jmDNS.unregisterService(serviceInfo);
    }
}
