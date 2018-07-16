package com.mendonca.heartbeat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// The heartbeat service guarantees whether our service is alive or not
@RestController
public class ServiceController {

    // This simple service sends ACK for an incoming req verifying the request met the service successfully
    @RequestMapping(value = "/heartbeat", method = RequestMethod.GET)
    public ResponseEntity<String> heartBeat() {
        return new ResponseEntity<String>("I am aliiive. Let's do this!", HttpStatus.OK);
    }

}
