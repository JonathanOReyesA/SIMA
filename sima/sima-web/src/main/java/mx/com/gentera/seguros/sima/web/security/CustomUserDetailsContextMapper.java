package mx.com.gentera.seguros.sima.web.security;

import java.util.Collection;
//import mx.com.gentera.seguros.sima.web.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

public class CustomUserDetailsContextMapper implements UserDetailsContextMapper {
	
	@Value("${spring.ldap.displayNameAttribute}")
	private String displayNameAttribute;

	@Value("${spring.ldap.photoAttribute}")
	private String photoAttribute;

	@Value("${spring.ldap.emailAttribute}")
	private String emailAttribute;

	public UserDetails mapUserFromContext(DirContextOperations ctx, String username,
			Collection<? extends GrantedAuthority> authorities) {
		String displayName = ctx.getStringAttribute(this.displayNameAttribute);
		byte[] photo = (byte[]) ctx.getObjectAttribute(this.photoAttribute);
		String email = ctx.getStringAttribute(this.emailAttribute);
		CustomUserDetails details = new CustomUserDetails(username, "", true, true, true, true, authorities,
				displayName, photo, email);
		return (UserDetails) details;
	}

	public void mapUserToContext(UserDetails user, DirContextAdapter ctx) {
		throw new IllegalStateException("Only retrieving data from AD is currently supported");
	}
}
