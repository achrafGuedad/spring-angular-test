package lu.atozdigital.api.web;


import lombok.Data;
import lu.atozdigital.api.models.Acheteur;
import lu.atozdigital.api.security.JWTAuthorizationFiler;
import lu.atozdigital.api.security.JwtUtils;
import lu.atozdigital.api.security.UserDetailsServiceImpl;
import lu.atozdigital.api.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class LoginRestController {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AccountService accountService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired(required=false)
    private JWTAuthorizationFiler jwtAuthorizationFiler;

    @Autowired
    private JwtUtils jwtUtils;

/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> loginAdim(@RequestBody AppUser appUser) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getUsername(), appUser.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(appUser.getUsername());

        String jwt =jwtUtils.generateToken(userDetails);

        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        AppUser user = accountService.loadUserByUsername(userDetails.getUsername());

        //final String roles= String.valueOf(userDetails.getAuthorities());
        return ResponseEntity.ok(new JwtResponse("Bearer "+jwt,

                user.getUsername(),
                user.getId(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),roles));
    }




    //-----------------------------------------------------------------------------------------


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> loginAcheteur(@RequestBody Acheteur acheteur) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getUsername(), appUser.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(appUser.getUsername());

        String jwt =jwtUtils.generateToken(userDetails);

        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        AppUser user = accountService.loadUserByUsername(userDetails.getUsername());

        //final String roles= String.valueOf(userDetails.getAuthorities());
        return ResponseEntity.ok(new JwtResponse("Bearer "+jwt,

                user.getUsername(),
                user.getId(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),roles));
    }












































































    @PostMapping("/register")
    public AppUser register(@RequestBody  UserForm userForm){
        return  accountService.saveUser(
                userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
    }
    @Data
    class UserForm{
        private String username;
        private String password;
        private String confirmedPassword;
    }






*/






}
