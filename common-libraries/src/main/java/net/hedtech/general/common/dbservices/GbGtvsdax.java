package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGtvsdax {
		public static NString fCodeExists(NString pInternalCodeGroup,NString pInternalCode,NString pExternalCode,NNumber pInternalCodeSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVSDAX.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE_GROUP", pInternalCodeGroup);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_EXTERNAL_CODE", pExternalCode);
			cmd.addParameter("@P_INTERNAL_CODE_SEQNO", pInternalCodeSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pInternalCodeGroup,NString pInternalCode,NString pExternalCode,NNumber pInternalCodeSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GTVSDAX.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE_GROUP", pInternalCodeGroup);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_EXTERNAL_CODE", pExternalCode);
			cmd.addParameter("@P_INTERNAL_CODE_SEQNO", pInternalCodeSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
