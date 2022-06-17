package hkpl_backend.hkpl_backend.data;

import com.google.firebase.auth.FirebaseToken;

public class UserDetailsResponseDto {
        private String uid;
        private String tenantId;
        private String issuer;
        private String name;
        private String picture;
        private String email;
        public UserDetailsResponseDto(FirebaseToken token) {
            this.uid = token.getUid();
            this.tenantId = token.getTenantId();
            this.issuer = token.getIssuer();
            this.name = token.getName();
            this.picture = token.getPicture();
            this.email = token.getEmail();
        }
}
