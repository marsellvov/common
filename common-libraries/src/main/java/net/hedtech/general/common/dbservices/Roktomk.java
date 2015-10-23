package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Roktomk {
		public static NBool fExtendedDbaseNaming(NString pOwner,NString pTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKTOMK.F_EXTENDED_DBASE_NAMING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fMaxGuboutpFileNumber(NString pUsername,NNumber pUserIndication,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKTOMK.F_MAX_GUBOUTP_FILE_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_USER_INDICATION", pUserIndication);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pInsertGuboutp(NString pUsername,NNumber pUserIndication,NNumber pOneUpNo,NString pJob,NString pFileName,NNumber pFileNumber,NNumber pNumberOfLines,NDate pDateSaved,NDate pDatePrinted,NString pOperatingSystem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKTOMK.P_INSERT_GUBOUTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_USER_INDICATION", pUserIndication);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_JOB", pJob);
			cmd.addParameter("@P_FILE_NAME", pFileName);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
			cmd.addParameter("@P_NUMBER_OF_LINES", pNumberOfLines);
			cmd.addParameter("@P_DATE_SAVED", pDateSaved);
			cmd.addParameter("@P_DATE_PRINTED", pDatePrinted);
			cmd.addParameter("@P_OPERATING_SYSTEM", pOperatingSystem);
				
			cmd.execute();


		}
		
		public static void pInsertGuroutp(NNumber pUserIndication,NNumber pOneUpNo,NNumber pFileNumber,NNumber pSeqNo,NString pLine) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKTOMK.P_INSERT_GUROUTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_INDICATION", pUserIndication);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_LINE", pLine);
				
			cmd.execute();


		}
		
		public static void pUpdateGuboutp(NString pUsername,NNumber pUserIndication,NNumber pOneUpNo,NString pJob,NNumber pFileNumber,NNumber pNumberOfLines,NDate pDateSaved) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKTOMK.P_UPDATE_GUBOUTP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_USER_INDICATION", pUserIndication);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_JOB", pJob);
			cmd.addParameter("@P_FILE_NUMBER", pFileNumber);
			cmd.addParameter("@P_NUMBER_OF_LINES", pNumberOfLines);
			cmd.addParameter("@P_DATE_SAVED", pDateSaved);
				
			cmd.execute();


		}
		
	
	
	
}
