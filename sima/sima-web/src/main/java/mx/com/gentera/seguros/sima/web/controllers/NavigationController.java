package mx.com.gentera.seguros.sima.web.controllers;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavigationController {
	@RequestMapping({ "/user" })
	public Principal user(Principal principal) {
		return principal;
	}
}
