package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAprchld {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCHLD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidm,NNumber seqNo,NString lastName,NString firstName,NString mi,NString sex,NDate birthDate,NString ssn,NString atypCode,NDate activityDate,NString xrefCode,NNumber chldPidm,NString dispWebInd,NString deceasedInd,NDate deceasedDate,NString okForNotesInd,NString dispNotesInd,NDate dispNotesDate,NString user,NString reviewedInd,NString reviewedUser,NString comment,NString surnamePrefix,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCHLD.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@SEX", sex);
			cmd.addParameter("@BIRTH_DATE", birthDate);
			cmd.addParameter("@SSN", ssn);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@XREF_CODE", xrefCode);
			cmd.addParameter("@CHLD_PIDM", chldPidm);
			cmd.addParameter("@DISP_WEB_IND", dispWebInd);
			cmd.addParameter("@DECEASED_IND", deceasedInd);
			cmd.addParameter("@DECEASED_DATE", deceasedDate);
			cmd.addParameter("@OK_FOR_NOTES_IND", okForNotesInd);
			cmd.addParameter("@DISP_NOTES_IND", dispNotesInd);
			cmd.addParameter("@DISP_NOTES_DATE", dispNotesDate);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@REVIEWED_IND", reviewedInd);
			cmd.addParameter("@REVIEWED_USER", reviewedUser);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCHLD.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
