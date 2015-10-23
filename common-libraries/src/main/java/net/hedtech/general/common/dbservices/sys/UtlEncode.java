package net.hedtech.general.common.dbservices.sys;

import java.sql.Blob;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBlob;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class UtlEncode {
	public static byte[] base64Encode(byte[] r) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTL_ENCODE.BASE64_ENCODE", DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NBlob.class);
		NBlob data = new NBlob(r);
		cmd.addParameter("@R", data);
		
		cmd.execute();

		return cmd.getReturnValue(NBlob.class).getValue();
	}
}