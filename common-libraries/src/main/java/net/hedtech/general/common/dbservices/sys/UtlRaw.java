package net.hedtech.general.common.dbservices.sys;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.types.NBlob;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class UtlRaw {
	public static NString castToVarchar2(byte[] r) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTL_RAW.CAST_TO_VARCHAR2", DbManager.getDataBaseFactory());
		cmd.addReturnParameter(NString.class);
		NBlob data = new NBlob(r);
		cmd.addParameter("@R", data);
		
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
}
