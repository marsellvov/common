package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Slkress {
		public static NString fGetMulSlbbldgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKRESS.F_GET_MUL_SLBBLDG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlbrdefValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKRESS.F_GET_MUL_SLBRDEF_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrmasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKRESS.F_GET_MUL_SLRMASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrpasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKRESS.F_GET_MUL_SLRPASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrrasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKRESS.F_GET_MUL_SLRRASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
