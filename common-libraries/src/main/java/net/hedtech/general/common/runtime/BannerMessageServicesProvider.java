package net.hedtech.general.common.runtime;

import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appsupportlib.runtime.DefaultMessageServicesProvider;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageType;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.types.NString;
import net.hedtech.general.common.dbservices.GNls;

public class BannerMessageServicesProvider extends DefaultMessageServicesProvider {
	private static final String ERROR_ID = "*ERROR*";
	
	@Override
	public void message(String message, OutputMessageType type, OutputMessageUserResponse userResponse) {
		if (type == OutputMessageType.MESSAGE) {
			NString errorId = GNls.Fget(toStr("ERROR"), toStr("FORM"), toStr(ERROR_ID));
			if (message.contains(errorId.getValue()))
				type = OutputMessageType.ERROR;
		}
		super.message(message, type, userResponse);
	}
}
