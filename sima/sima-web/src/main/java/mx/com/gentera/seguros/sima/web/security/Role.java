package mx.com.gentera.seguros.sima.web.security;

import java.security.Permission;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	private String name;
	private List<Permission> permissions;

	 public Role(String name) {
		    this.name = name;
		  }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the permissions
	 */
	public List<Permission> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String getAuthority() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", permissions=" + permissions + "]";
	}
	
	

}
