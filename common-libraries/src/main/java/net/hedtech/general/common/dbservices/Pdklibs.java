package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Noklist.ListRectypeRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdklibs {
		public static NString fCoredednind(NString inBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_COREDEDNIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_BDCA_CODE", inBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDednamounttype(NString inRule,NNumber inAmtNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNAMOUNTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_RULE", inRule);
			cmd.addParameter("@IN_AMT_NO", inAmtNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fDednfieldentryallowed(NString inInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNFIELDENTRYALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_IND", inInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDednfieldentryrequired(NString inInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNFIELDENTRYREQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_IND", inInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fDednfuturerecdate(NNumber inPidm,NString inCode,NDate inEfdt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNFUTURERECDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_CODE", inCode);
			cmd.addParameter("@IN_EFDT", inEfdt);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fDednhasplan(NString inRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNHASPLAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_RULE", inRule);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDednisrequired(NNumber inPidm,NString inCode,NDate inDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNISREQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_CODE", inCode);
			cmd.addParameter("@IN_DATE", inDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDednstatallowsupdates(NString inStat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_DEDNSTATALLOWSUPDATES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_STAT", inStat);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fExpandbdcafieldind(NString inInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_EXPANDBDCAFIELDIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_IND", inInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExpanddednstatus(NString inStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_EXPANDDEDNSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_STATUS", inStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdedngroup(NString inDedn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_GETDEDNGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_DEDN", inDedn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLockinLetterStatus(NString inStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_LOCKIN_LETTER_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_STATUS", inStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVerifycorebdcabcat(NString inAction,NString inBcatCode,NString inBdcaCode,NDate inBeginDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_VERIFYCOREBDCABCAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_ACTION", inAction);
			cmd.addParameter("@IN_BCAT_CODE", inBcatCode);
			cmd.addParameter("@IN_BDCA_CODE", inBdcaCode);
			cmd.addParameter("@IN_BEGIN_DATE", inBeginDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDednpayperiodend(NNumber pidm,NString bdcaCode,NDate effDate,Ref<NDate> calnEnd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.P_DEDNPAYPERIODEND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@CALN_END", NDate.class);
				
			cmd.execute();
			calnEnd.val = cmd.getParameterValue("@CALN_END", NDate.class);


		}
		
		public static void pSetdednstatus(NNumber pidm,NString bdcaCode,NString bcatCode,NString newStatus,NDate effectiveDate,NString userId,Ref<NString> returnFlag,Ref<NString> returnText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.P_SETDEDNSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
			cmd.addParameter("@BCAT_CODE", bcatCode);
			cmd.addParameter("@NEW_STATUS", newStatus);
			cmd.addParameter("@EFFECTIVE_DATE", effectiveDate);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@RETURN_FLAG", returnFlag, true);
			cmd.addParameter("@RETURN_TEXT", returnText, true);
				
			cmd.execute();
			returnFlag.val = cmd.getParameterValue("@RETURN_FLAG", NString.class);
			returnText.val = cmd.getParameterValue("@RETURN_TEXT", NString.class);


		}
		
		public static void pVerifycorebdcaemp(NNumber inParPidm,NString inParBdcaCode,NDate parDate,NString parAction,NString parStatus,NString parExeSource,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.P_VERIFYCOREBDCAEMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PAR_PIDM", inParPidm);
			cmd.addParameter("@IN_PAR_BDCA_CODE", inParBdcaCode);
			cmd.addParameter("@PAR_DATE", parDate);
			cmd.addParameter("@PAR_ACTION", parAction);
			cmd.addParameter("@PAR_STATUS", parStatus);
			cmd.addParameter("@PAR_EXE_SOURCE", parExeSource);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static NString fCodeExists(NString listName, NString pCode){
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LIST_NAME", listName);
			cmd.addParameter("@P_CODE", pCode);
			cmd.execute();
			return cmd.getReturnValue(NString.class);
			
		}
		
		
		
		public static ListArrayTypeRow fList(NString pListName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.getCollectionType(Pdklibs.ListArrayTypeRow.class));
			cmd.addParameter("@P_LIST_NAME", pListName);
				
			cmd.execute();

			return (ListArrayTypeRow) cmd.getReturnValueObj();

		}
		
		public static ListRectypeRow fListRec(NString pListName,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIBS.F_LIST_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(ListRectypeRow.class));
			cmd.addParameter("@P_LIST_NAME", pListName);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(ListRectypeRow.class);

		}
		
		@DbRecordType(id="ListRectypeRow", dataSourceName="PDKLIBS.LIST_RECTYPE")
		public static class ListRectypeRow
		{
			@DbRecordField(dataSourceName="R_LIST_NAME")
			public NString RListName;
			@DbRecordField(dataSourceName="R_CODE")
			public NString RCode;
			@DbRecordField(dataSourceName="R_DESC")
			public NString RDesc;
		}
		
		@DbTableType(id="ListArrayTypeRow", dataSourceName="PDKLIBS.LIST_TABTYPE", indexed=true)
		public static class ListArrayTypeRow extends Table<ListRectypeRow> {
			@Override
			protected ListRectypeRow newValue(){
				return new ListRectypeRow();
			}
		}
	
	
}
