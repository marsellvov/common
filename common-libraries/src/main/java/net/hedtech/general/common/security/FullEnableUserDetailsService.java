package net.hedtech.general.common.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@SuppressWarnings("serial")
public class FullEnableUserDetailsService implements UserDetailsService, Serializable {

	private static Collection<GrantedAuthority> defaultAuthorities = new ArrayList();
	
	static{
		defaultAuthorities.add(new GrantedAuthority() {
			
			@Override
			public String getAuthority() {
				return "ROLE_USER";
			}
		});
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		return new FullEnableUserDetails(username);
	}

	class FullEnableUserDetails implements UserDetails {

		private String username;

		public FullEnableUserDetails(String username) {
			this.username = username;
		}

		@Override
		public Collection<GrantedAuthority> getAuthorities() {
			
			return Collections.unmodifiableCollection(defaultAuthorities);
		}

		@Override
		public String getPassword() {
			return "";
		}

		@Override
		public String getUsername() {
			return username;
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() { //
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}
	}
}
