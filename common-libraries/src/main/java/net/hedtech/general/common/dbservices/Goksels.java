package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Goktabs.MerchIdRecTypeRow;
import net.hedtech.general.common.dbservices.dbtypes.GtvsdaxRow;
import net.hedtech.general.common.dbservices.dbtypes.GubinstRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goksels {
		public static NString fAddressTelephoneValue(NNumber pPidm,NString pAddressInternalCode,NString pActiveInd,NDate pAddressDate,NNumber pAddrOccurance,NString pSysInd,NString pAddressType,NString pAddressColumn,NString pAddrTele,NString pTeleColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_ADDRESS_TELEPHONE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDRESS_INTERNAL_CODE", pAddressInternalCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ADDRESS_DATE", pAddressDate);
			cmd.addParameter("@P_ADDR_OCCURANCE", pAddrOccurance);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_ADDRESS_TYPE", pAddressType);
			cmd.addParameter("@P_ADDRESS_COLUMN", pAddressColumn);
			cmd.addParameter("@P_ADDR_TELE", pAddrTele);
			cmd.addParameter("@P_TELE_COLUMN", pTeleColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBreakString(NString pStr,NNumber pLen,NString pInsChar,NString pBreakChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_BREAK_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_LEN", pLen);
			cmd.addParameter("@P_INS_CHAR", pInsChar);
			cmd.addParameter("@P_BREAK_CHAR", pBreakChar);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCleanText(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_CLEAN_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenerateRandomId(NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GENERATE_RANDOM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCommand(NString packageIn,NString procIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_COMMAND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@PROC_IN", procIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCurrentPin(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_CURRENT_PIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetGobfnxrRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GOBFNXR_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber fGetGormercCount(NString merchantIdIn,NString procCodeIn,NString sysiCodeIn,NString statusIndIn,NString ccrdCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GORMERC_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@MERCHANT_ID_IN", merchantIdIn);
			cmd.addParameter("@PROC_CODE_IN", procCodeIn);
			cmd.addParameter("@SYSI_CODE_IN", sysiCodeIn);
			cmd.addParameter("@STATUS_IND_IN", statusIndIn);
			cmd.addParameter("@CCRD_CODE_IN", ccrdCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void fGetGormercRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GORMERC_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetGtvsdaxRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GTVSDAX_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static GtvsdaxRow fGetGtvsdaxRow(NString groupIn, NString internal_code_in, NString seq_no_in) {

			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GTVSDAX_ROW", DbManager.getDataBaseFactory());

			cmd.addReturnParameter(DbTypes.createStructType(GtvsdaxRow.class));
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@INTERNAL_CODE_IN", internal_code_in);
			cmd.addParameter("@SEQ_NO_IN", seq_no_in);
			
			cmd.execute();

			return cmd.getReturnValue(GtvsdaxRow.class);
		}
		
		public static GtvsdaxRow fGetGtvsdaxRow(NString groupIn, NString internal_code_in) {

			return fGetGtvsdaxRow(groupIn,internal_code_in,NString.getNull());
		}
		
		public static GubinstRow fGetGubinstRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_GUBINST_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();

			return cmd.getReturnValue(GubinstRow.class);
		}
		
		public static NString fGetProc(NString functionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_PROC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNCTION_IN", functionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProcess(NString functionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNCTION_IN", functionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSsbIdContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_GET_SSB_ID_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIbanInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_IBAN_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMaskSsbField(NString pPackageProcedure,NString pColumn,NString pValue,NString pUser,NString pSource,NString pDebug) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_MASK_SSB_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_PROCEDURE", pPackageProcedure);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_DEBUG", pDebug);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNameBioValue(NNumber pPidm,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_NAME_BIO_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidNumber(NString valueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_VALID_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VALUE_IN", valueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateBankAcctNum(NString acctIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_VALIDATE_BANK_ACCT_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACCT_IN", acctIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateBankRoutNum(NString bankIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.F_VALIDATE_BANK_ROUT_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BANK_IN", bankIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetMerchantIds(Ref<List<MerchIdRecTypeRow>> tableInOut,Ref<NNumber> numRecsInOut,NString groupIn,NString criterion1In,NString criterion2In,NString criterion3In,NString criterion4In,NString criterion5In,NString criterion6In,NString criterion7In,NString criterion8In,NString criterion9In,NString criterion10In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.P_GET_MERCHANT_IDS", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getTableType("TABLE_IN_OUT", "", tableInOut.val, object.class , true));
			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
			cmd.addParameter("@GROUP_IN", groupIn);
			cmd.addParameter("@CRITERION1_IN", criterion1In);
			cmd.addParameter("@CRITERION2_IN", criterion2In);
			cmd.addParameter("@CRITERION3_IN", criterion3In);
			cmd.addParameter("@CRITERION4_IN", criterion4In);
			cmd.addParameter("@CRITERION5_IN", criterion5In);
			cmd.addParameter("@CRITERION6_IN", criterion6In);
			cmd.addParameter("@CRITERION7_IN", criterion7In);
			cmd.addParameter("@CRITERION8_IN", criterion8In);
			cmd.addParameter("@CRITERION9_IN", criterion9In);
			cmd.addParameter("@CRITERION10_IN", criterion10In);
				
			cmd.execute();
			// tableInOut.val = cmd.getTableParameterValue("@TABLE_IN_OUT", object.class);
			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);


		}
		
		public static void pResetSsbIdContext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.P_RESET_SSB_ID_CONTEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSetSsbIdAndNameContext(NString pIdIn,NString pNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.P_SET_SSB_ID_AND_NAME_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID_IN", pIdIn);
			cmd.addParameter("@P_NAME_IN", pNameIn);
				
			cmd.execute();


		}
		
		public static void pSetSsbIdContext(NString pIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSELS.P_SET_SSB_ID_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IN", pIn);
				
			cmd.execute();


		}
		
}
