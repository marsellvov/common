package net.hedtech.general.common.services;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appsupportlib.profile.SessionInteractionUserProfileServicesProvider;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.util.profile.UserProfile;
import morphis.workspace.forms.main.services.ILoginData;
import morphis.workspace.forms.main.services.LoginServices;

public class UserProfileServicesProvider extends SessionInteractionUserProfileServicesProvider {
	@Override
	public UserProfile getCurrentUserProfile() {
		String user = getCurrentUser();
		UserProfile profile = super.fetchUserProfile(user);
		return profile != null ? profile : super.getCurrentUserProfile();
	}
	
	@Override
	public UserProfile refreshCurrentUserProfile() {
		String user = getCurrentUser();
		super.setUserProfile(user, null);
		
		return getCurrentUserProfile();
	}

	@Override
	public void updateUserProfile(UserProfile profile) {
		super.setUserProfile(profile.getUser(), profile);
	}

	@Override
	protected String getCurrentUser() {
		ILoginData loginData = LoginServices.getLoginData();
		if (loginData != null)
			return loginData.getLoginCredentials().getUser();

		return getCurrentDbUser(true);
	}

	@Override
	protected String getUserLanguage() {
		try {
			String header = InteractionManager.getRequestState().getHttpRequest().getHeader("Accept-Language");
			if (header != null) {
				String[] acceptLangs = header.split(";");
				if (acceptLangs.length > 0) {
					String preferredLang = acceptLangs[0];
					String[] components = preferredLang.split(",");
					if (components.length > 1) {
						String lang = components[components[0].indexOf('=') < 0 ? 0 : 1];
						return lang;
					}
				}
			}
		}
		catch (Exception e) {
		}
		return super.getUserLanguage();
	}
	
	private String getCurrentDbUser(boolean checkEnvironment) {
		String user = DbManager.getUser();
		if (user == null) {
			user = DbManager.getConnectionUser();
			if (user == null && checkEnvironment) {
				// the user may come from an externalized data source, force it's initialization
				DbManager.getDataBaseFactory().getDataSource();
				user = getCurrentDbUser(false);
			}
		}
		return user;
	}
}
