package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAprehis {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APREHIS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidm,NNumber seqNo,NString emprName,NString jobcCode,NString emplPosition,NDate fromDate,NDate toDate,NNumber emprPidm,NString emprId,NDate activityDate,NString siccCode,NString xrefCode,NString empsCode,NNumber wklyHours,NString user,NString primaryInd,NString atypCode,NNumber atypSeqno,NString jobcCode2,NString jobcCode3,NString jobcCode4,NString okForNotesInd,NString dispNotesInd,NDate dispNotesDate,NString mgInd,NString reviewedInd,NString reviewedUser,NString comment,NString coopInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APREHIS.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR_NAME", emprName);
			cmd.addParameter("@JOBC_CODE", jobcCode);
			cmd.addParameter("@EMPL_POSITION", emplPosition);
			cmd.addParameter("@FROM_DATE", fromDate);
			cmd.addParameter("@TO_DATE", toDate);
			cmd.addParameter("@EMPR_PIDM", emprPidm);
			cmd.addParameter("@EMPR_ID", emprId);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@SICC_CODE", siccCode);
			cmd.addParameter("@XREF_CODE", xrefCode);
			cmd.addParameter("@EMPS_CODE", empsCode);
			cmd.addParameter("@WKLY_HOURS", wklyHours);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@PRIMARY_IND", primaryInd);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@ATYP_SEQNO", atypSeqno);
			cmd.addParameter("@JOBC_CODE2", jobcCode2);
			cmd.addParameter("@JOBC_CODE3", jobcCode3);
			cmd.addParameter("@JOBC_CODE4", jobcCode4);
			cmd.addParameter("@OK_FOR_NOTES_IND", okForNotesInd);
			cmd.addParameter("@DISP_NOTES_IND", dispNotesInd);
			cmd.addParameter("@DISP_NOTES_DATE", dispNotesDate);
			cmd.addParameter("@MG_IND", mgInd);
			cmd.addParameter("@REVIEWED_IND", reviewedInd);
			cmd.addParameter("@REVIEWED_USER", reviewedUser);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@COOP_IND", coopInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APREHIS.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
