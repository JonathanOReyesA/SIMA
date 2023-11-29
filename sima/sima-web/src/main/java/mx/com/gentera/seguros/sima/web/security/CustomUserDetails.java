package mx.com.gentera.seguros.sima.web.security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {

	private static final long serialVersionUID = 1L;
	private String displayName;
	private byte[] photo;
	private String email;

	public CustomUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
			String displayName, byte[] photo, String email) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		setDisplayName(displayName);
		setPhoto(photo);
		setEmail(email);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}