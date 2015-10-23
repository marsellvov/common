package net.hedtech.general.common.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import morphis.foundations.core.util.StringHelper;
import morphis.foundations.core.util.logging.ILogger;
import morphis.foundations.core.util.logging.LoggerFactory;

import org.springframework.security.cas.authentication.CasAuthenticationToken;
import org.springframework.security.core.Authentication;

public class CasLoginProvider extends SSOLoginProvider {
	private static ILogger logger = LoggerFactory.getInstance(CasLoginProvider.class);
	
	private String logoutUrl ="/j_spring_cas_security_logout";

	public String getLogoutUrl() {
		return this.logoutUrl;
	}

	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}

	@Override
	protected String getAssertAttributeValue(Authentication authentication) {
		Map<String, Object> attributeMap = ((CasAuthenticationToken)authentication).getAssertion().getPrincipal().getAttributes();

		String assertAttributeValue = (String)getSingleAttributeValue(attributeMap, authenticationAssertionAttribute);
		return assertAttributeValue;
	}

	@Override
	protected void debugLoginAttempt(String userName, Authentication authentication) {
		if (!logger.isDebugEnabled())
			return;

		List<String> attributesList = new ArrayList<String>();

		Map<String, Object> attributeMap = ((CasAuthenticationToken)authentication).getAssertion().getPrincipal().getAttributes();
		if (attributeMap != null) {
			for (String key : attributeMap.keySet()) {
				attributesList.add(key + ": " + attributeMap.get(key));
			}
		}
		logger.debug(this, "Authenticating user %s with attributes [%s]", userName, StringHelper.join(", ", attributesList));
	}
	
	private Object getSingleAttributeValue(Map<String, Object> attributeMap, String key) {
		Object val = null;
		if (attributeMap != null) {
			val = attributeMap.get(key);
			if (val != null) {
				if (val instanceof List)
					return ((List)val).get(0);
			}		
		}
		return val;
	}
}
