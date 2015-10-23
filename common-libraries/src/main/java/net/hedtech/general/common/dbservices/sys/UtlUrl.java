package net.hedtech.general.common.dbservices.sys;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NString;

public class UtlUrl {
	public static NString escape(NString url, NBool escapeReservedChars) {
		return escape(url, escapeReservedChars, UtlHttp.getBodyCharset());
	}
	public static NString escape(NString url, NBool escapeReservedChars, NString urlCharset) {
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTL_URL.ESCAPE", DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@URL", url);
		cmd.addParameter("@ESCAPE_RESERVED_CHARS", escapeReservedChars);
		cmd.addParameter("@URL_CHARSET", urlCharset);
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
}