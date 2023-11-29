package mx.com.gentera.seguros.sima.web.security;

import java.util.Collection;
import java.util.List;
//import mx.com.gentera.seguros.sima.web.security.Menu;
//import mx.com.gentera.seguros.sima.web.security.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUser implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String rol;
	private List<Menu> menu;
	private boolean exito;
	private String mensaje;
	private Collection<Role> authorities;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Menu> getMenu() {
		return this.menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAuthorities(Collection<Role> authorities) {
		this.authorities = authorities;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isExito() {
		return this.exito;
	}

	public void setExito(boolean exito) {
		this.exito = exito;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return (Collection<? extends GrantedAuthority>) this.authorities;
	}

	public String getPassword() {
		return this.password;
	}

	public String getUsername() {
		return this.username;
	}

	public boolean isAccountNonExpired() {
		return false;
	}

	public boolean isAccountNonLocked() {
		return this.accountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	@Override
	public String toString() {
		return "CustomUser [username=" + username + ", password=" + password + ", rol=" + rol + ", exito=" + exito
				+ ", mensaje=" + mensaje + ", accountNonExpired=" + accountNonExpired + ", accountNonLocked="
				+ accountNonLocked + ", credentialsNonExpired=" + credentialsNonExpired + ", enabled=" + enabled + "]";
	}
	
	
}