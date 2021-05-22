package com.backend.jwt.controller;

import com.backend.jwt.registration.RegistrationRequest;
import com.backend.jwt.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The RegistrationController Class implements an Rest Controller that
 * handles registration requests.
 **/





@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;


    /**
     * This is the main method which receives a POST
     * request for the registration
     * @param request is a RegistrationRequest object.
     * @see RegistrationRequest class for more info.
     **/
    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
