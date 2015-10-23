package net.hedtech.general.common.security;

import java.util.ArrayList;
import java.util.List;

import morphis.foundations.core.util.StringHelper;
import morphis.foundations.core.util.logging.ILogger;
import morphis.foundations.core.util.logging.LoggerFactory;

import org.opensaml.saml2.core.Attribute;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.schema.XSString;
import org.springframework.security.core.Authentication;
import org.springframework.security.saml.SAMLCredential;

public class SamlLoginProvider extends SSOLoginProvider {
	private static ILogger logger = LoggerFactory.getInstance(SamlLoginProvider.class);
	
	@Override
	protected String getAssertAttributeValue(Authentication authentication) {
		SAMLCredential credential = (SAMLCredential)authentication.getCredentials();
		
		String assertAttributeValue = credential.getAttributeAsString(authenticationAssertionAttribute);
		return assertAttributeValue;
	}

	@Override
	protected void debugLoginAttempt(String userName, Authentication authentication) {
		if (!logger.isDebugEnabled())
			return;

		List<String> attributesList = new ArrayList<String>();

		List<Attribute> attributes = ((SAMLCredential)authentication.getCredentials()).getAttributes();
		for (Attribute att : attributes) {
			List<XMLObject> objs = att.getAttributeValues();
			
			List<String> valuesList = new ArrayList<String>();
			for (XMLObject obj : objs) {
				String val;
				if (obj instanceof XSString)
					val = ((XSString)obj).getValue();
				else
					val = obj.toString();
				
				valuesList.add(val);
			}
			
			attributesList.add(att.getName() + " : [" + StringHelper.join(", ", valuesList) + "]");
		}

		logger.debug(this, "Authenticating user %s with attributes [%s]", userName, StringHelper.join(", ", attributesList));
	}
}
