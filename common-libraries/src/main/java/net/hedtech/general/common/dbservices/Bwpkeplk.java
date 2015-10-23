package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkeplk {
		public static NString fDispSearchLink(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NString transNo,NString sType,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.F_DISP_SEARCH_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@S_TYPE", sType);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAcatdesc(NString acatCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.F_GET_ACATDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACAT_CODE_IN", acatCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetBirthdate(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.F_GET_BIRTHDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetInputcount(NString lastName,NString firstName,NString emplId,NString ssnSinTin,NString transNo,NString sType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.F_GET_INPUTCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@S_TYPE", sType);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetNametype(NString ntypCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.F_GET_NAMETYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NTYP_CODE_IN", ntypCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pOpenApprovalRc(Ref<DataCursor> pApprovalRcInout,NString pUserId,NNumber pPidm,NString pLastName,NString pFirstName,NString pEmplId,NString pTransNo,NString pRole,NString pSortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_OPEN_APPROVAL_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPROVAL_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_EMPL_ID", pEmplId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_SORT_ORDER", pSortOrder);
				
			cmd.execute();
			pApprovalRcInout.val = cmd.getParameterValue("@P_APPROVAL_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenOriginatorRc(Ref<DataCursor> pOriginatorRcInout,NString pUserId,NNumber pPidm,NString pLastName,NString pFirstName,NString pEmplId,NString pTransNo,NString pRole,NString pSortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_OPEN_ORIGINATOR_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ORIGINATOR_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_EMPL_ID", pEmplId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_SORT_ORDER", pSortOrder);
				
			cmd.execute();
			pOriginatorRcInout.val = cmd.getParameterValue("@P_ORIGINATOR_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenPersRc(Ref<DataCursor> pPersonRcInout,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NString employee,NString sortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_OPEN_PERS_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERSON_RC_INOUT", DataCursor.class);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@SORT_ORDER", sortOrder);
				
			cmd.execute();
			pPersonRcInout.val = cmd.getParameterValue("@P_PERSON_RC_INOUT", DataCursor.class);


		}
		
		public static void pPrintInputcontrolFields(NString sType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_PRINT_INPUTCONTROL_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@S_TYPE", sType);
				
			cmd.execute();


		}
		
		public static void pPrintNameIdInputfields(NString lastName,NString firstName,NString emplId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_PRINT_NAME_ID_INPUTFIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
				
			cmd.execute();


		}
		
		public static void pPrintPrevNxtLinks(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NString transNo,NString buttonselected,NNumber startno,NNumber endno,NNumber recNo,NNumber totalRecs,NString sortOrder,NString sType,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_PRINT_PREV_NXT_LINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@STARTNO", startno);
			cmd.addParameter("@ENDNO", endno);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@TOTAL_RECS", totalRecs);
			cmd.addParameter("@SORT_ORDER", sortOrder);
			cmd.addParameter("@S_TYPE", sType);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pPrintpersearchrow(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NNumber recNo,NNumber startno,NNumber totalRecs,NString buttonselected,NString sortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_PRINTPERSEARCHROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@STARTNO", startno);
			cmd.addParameter("@TOTAL_RECS", totalRecs);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
				
			cmd.execute();


		}
		
		public static void pPrinttranssearchrow(NString lastName,NString firstName,NString emplId,NString transNo,NNumber recNo,NNumber startno,NNumber totalRecs,NString buttonselected,NString sortOrder,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPLK.P_PRINTTRANSSEARCHROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@STARTNO", startno);
			cmd.addParameter("@TOTAL_RECS", totalRecs);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
	
	
	
}
