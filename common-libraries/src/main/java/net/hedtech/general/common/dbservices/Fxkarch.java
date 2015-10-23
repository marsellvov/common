package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fxkarch {
		public static NBool fCheckArch(NString docCode,NNumber docSeqCode,NNumber subNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FXKARCH.F_CHECK_ARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_SEQ_CODE", docSeqCode);
			cmd.addParameter("@SUB_NUM", subNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
