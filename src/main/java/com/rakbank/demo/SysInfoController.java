package com.rakbank.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/info")
public class SysInfoController {

    @GetMapping
    public String getInfo() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String hostname = inetAddress.getHostName();
            String ipAddress = inetAddress.getHostAddress();
            return String.format("Hostname: %s, IP Address: %s", hostname, ipAddress);
        } catch (UnknownHostException e) {
            return "Unable to retrieve hostname and IP address.";
        }
    }
}

