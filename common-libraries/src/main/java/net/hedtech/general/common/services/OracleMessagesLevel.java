package net.hedtech.general.common.services;

import morphis.foundations.core.appsupportlib.runtime.MessageLevel;
import morphis.foundations.core.appsupportlib.runtime.MessageServices;

public class OracleMessagesLevel {
	
	//MORPHIS TODO: This method was created to emulate the Oracle Message Level.  -- TMP

	public static MessageLevel decodeMessageLevel(int level) {
		
		if (level == 0)
			return MessageLevel.ALL;
		//MORPHIS TODO: Other Levels
		else if (level <=20)
			return MessageLevel.USER;
		else
			return MessageLevel.NONE;
		
	}
/*	
	public static int getMessageLevel() {
		
		int var = MessageServices.getMessageLevel().getValue();
		
		if (var == 0)
			return 0;
		else
			return 5;
	}
	
	public static void setMessageLevel(int level) {
		
		
		if (level == 0)
			MessageServices.resetMessageLevel();
		else
			MessageServices.setMessageLevel(MessageLevel.NONE);
		
	}
*/
}
