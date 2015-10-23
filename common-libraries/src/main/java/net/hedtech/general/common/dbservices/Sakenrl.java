package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakenrl {
		public static void pExistsSfrenrl(NNumber pidm,NDate startDate,NDate endDate,Ref<NString> found) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKENRL.P_EXISTS_SFRENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
			cmd.addParameter("@FOUND", found, true);
				
			cmd.execute();
			found.val = cmd.getParameterValue("@FOUND", NString.class);


		}
		
		public static void pInsertSfrenrl(NNumber pidm,NDate startDate,NDate endDate,NString userIn,NDate requestDate,NDate activityDate,NString eprtCode,NString emplCode,NString idno,NString addrName,NString houNum,NString street1,NString street2,NString street3,NString street4,NString city,NString statCode,NString zip,NString sessionid,NDate printDate,NString printer,NString acyrCode,NString natnCode,NNumber numberCopies,NString minTerm,NString wssoCode,NString wpyoCode,NString faxNumber,NString faxArea,NString faxCtryCode,NDate sentDate,Ref<NNumber> records) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKENRL.P_INSERT_SFRENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@REQUEST_DATE", requestDate);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@EPRT_CODE", eprtCode);
			cmd.addParameter("@EMPL_CODE", emplCode);
			cmd.addParameter("@IDNO", idno);
			cmd.addParameter("@ADDR_NAME", addrName);
			cmd.addParameter("@HOU_NUM", houNum);
			cmd.addParameter("@STREET1", street1);
			cmd.addParameter("@STREET2", street2);
			cmd.addParameter("@STREET3", street3);
			cmd.addParameter("@STREET4", street4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_CODE", statCode);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@SESSIONID", sessionid);
			cmd.addParameter("@PRINT_DATE", printDate);
			cmd.addParameter("@PRINTER", printer);
			cmd.addParameter("@ACYR_CODE", acyrCode);
			cmd.addParameter("@NATN_CODE", natnCode);
			cmd.addParameter("@NUMBER_COPIES", numberCopies);
			cmd.addParameter("@MIN_TERM", minTerm);
			cmd.addParameter("@WSSO_CODE", wssoCode);
			cmd.addParameter("@WPYO_CODE", wpyoCode);
			cmd.addParameter("@FAX_NUMBER", faxNumber);
			cmd.addParameter("@FAX_AREA", faxArea);
			cmd.addParameter("@FAX_CTRY_CODE", faxCtryCode);
			cmd.addParameter("@SENT_DATE", sentDate);
			cmd.addParameter("@RECORDS", records, true);
				
			cmd.execute();
			records.val = cmd.getParameterValue("@RECORDS", NNumber.class);


		}
		
		public static void pMintermSfrenrl(NNumber pidm,NDate startDate,NDate endDate,Ref<NString> termOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKENRL.P_MINTERM_SFRENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
			cmd.addParameter("@TERM_OUT", termOut, true);
				
			cmd.execute();
			termOut.val = cmd.getParameterValue("@TERM_OUT", NString.class);


		}
		
	
	
	
}
