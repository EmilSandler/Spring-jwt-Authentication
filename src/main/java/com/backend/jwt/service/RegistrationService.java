package com.backend.jwt.service;

import com.backend.jwt.entity.User;
import com.backend.jwt.model.UserRole;
import com.backend.jwt.registration.EmailValidator;
import com.backend.jwt.registration.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * The RegistrationService class handles all Registration related requests.
 **/


@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request){
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("Email not valid.");
        }
        return userService.signUpUser(
                new User(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        UserRole.USER.getGrantedAuthorities(),
                        true,
                        true,
                        true
                )
        );
    }

}
