package hkpl_backend.hkpl_backend.api;

import com.google.firebase.auth.FirebaseToken;
import hkpl_backend.hkpl_backend.data.UserDetailsResponseDto;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

public class userApi {
    @RestController
    @RequestMapping("/user")
    public class UserApi {
        @GetMapping("/me/details")
        public UserDetailsResponseDto getMyUserDetails(Principal principal) {
            if (principal instanceof
                    PreAuthenticatedAuthenticationToken) {
                PreAuthenticatedAuthenticationToken preAuthenticated
                        = (PreAuthenticatedAuthenticationToken) principal;
                if (preAuthenticated.getPrincipal() instanceof
                        FirebaseToken) {
                    return new
                            UserDetailsResponseDto((FirebaseToken)
                            preAuthenticated.getPrincipal());
                }
            }
            return null;
        }
    }
}
