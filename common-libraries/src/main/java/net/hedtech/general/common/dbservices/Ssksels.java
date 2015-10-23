package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ssksels {
		public static NString fGetSsbsectCrn(NString seqIn,NString crseIn,NString subjIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSBSECT_CRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSsbsectRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSBSECT_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetSsbxlstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSBXLST_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetSsrlinkLinkConn(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSRLINK_LINK_CONN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSsrresvRowid(NString pResvKey,NString pCrn,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSRRESV_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RESV_KEY", pResvKey);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSsrxlstGroup(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSRXLST_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSsrxlstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_GET_SSRXLST_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber fSectionInstructor(NString pCrn,NString pTerm,NString pPriOrSec,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_SECTION_INSTRUCTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PRI_OR_SEC", pPriOrSec);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fSsbovrrValue(NString pTerm,NString pCrn,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_SSBOVRR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSsrmeetValue(NString pTerm,NString pCrn,NNumber pPosition,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_SSRMEET_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSsrresvOverflowExists(NString pResvKey,NString pCrn,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_SSRRESV_OVERFLOW_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_RESV_KEY", pResvKey);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSsrrtstConnectorExists(NString connectorIn,NString crnIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.F_SSRRTST_CONNECTOR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CONNECTOR_IN", connectorIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static void pGetSsbsectRec(NString crnIn,NString termIn,Ref<NNumber> cnt,Ref<List<Soktabs.Ssbsect1TabTypeRow>> ssbsectTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.P_GET_SSBSECT_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@CRN_IN", crnIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CNT", cnt, true);
//			// cmd.addParameter(DbTypes.getTableType("SSBSECT_TABLE", "", ssbsectTable.val, object.class , true));
//				
//			cmd.execute();
//			cnt.val = cmd.getParameterValue("@CNT", NNumber.class);
//			// ssbsectTable.val = cmd.getTableParameterValue("@SSBSECT_TABLE", object.class);
//
//
//		}
		
//		public static void pGetSsrmeetData(NString codeIn,NString crnIn,NString begTimeIn,NString endTimeIn,Ref<List<Soktabs.SsrmeetTabTypeRow>> ssrmeetTable,Ref<NNumber> rows) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.P_GET_SSRMEET_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@CODE_IN", codeIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//			cmd.addParameter("@BEG_TIME_IN", begTimeIn);
//			cmd.addParameter("@END_TIME_IN", endTimeIn);
//			// cmd.addParameter(DbTypes.getTableType("SSRMEET_TABLE", "", ssrmeetTable.val, object.class , true));
//			cmd.addParameter("@ROWS", rows, true);
//				
//			cmd.execute();
//			// ssrmeetTable.val = cmd.getTableParameterValue("@SSRMEET_TABLE", object.class);
//			rows.val = cmd.getParameterValue("@ROWS", NNumber.class);
//
//
//		}
		
		public static void pGetSsrresvKeyRow(Ref<NNumber> seatsAvailInOut,Ref<NNumber> waitAvailInOut,Ref<NNumber> waitCountInOut,Ref<NNumber> waitCapacityInOut,NString reservedKeyIn,NString crnIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.P_GET_SSRRESV_KEY_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEATS_AVAIL_IN_OUT", seatsAvailInOut, true);
			cmd.addParameter("@WAIT_AVAIL_IN_OUT", waitAvailInOut, true);
			cmd.addParameter("@WAIT_COUNT_IN_OUT", waitCountInOut, true);
			cmd.addParameter("@WAIT_CAPACITY_IN_OUT", waitCapacityInOut, true);
			cmd.addParameter("@RESERVED_KEY_IN", reservedKeyIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			seatsAvailInOut.val = cmd.getParameterValue("@SEATS_AVAIL_IN_OUT", NNumber.class);
			waitAvailInOut.val = cmd.getParameterValue("@WAIT_AVAIL_IN_OUT", NNumber.class);
			waitCountInOut.val = cmd.getParameterValue("@WAIT_COUNT_IN_OUT", NNumber.class);
			waitCapacityInOut.val = cmd.getParameterValue("@WAIT_CAPACITY_IN_OUT", NNumber.class);


		}
		
		public static void pGetSsrresvRow(NNumber pidmIn,NString termIn,NString crnIn,NString clasIn,NString waitIndIn,NString pOldWaitIndIn,Ref<NString> reservedKeyInOut,Ref<NNumber> seatsAvailInOut,Ref<NNumber> waitAvailInOut,Ref<NNumber> waitCountInOut,Ref<NNumber> waitCapacityInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSELS.P_GET_SSRRESV_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@CLAS_IN", clasIn);
			cmd.addParameter("@WAIT_IND_IN", waitIndIn);
			cmd.addParameter("@P_OLD_WAIT_IND_IN", pOldWaitIndIn);
			cmd.addParameter("@RESERVED_KEY_IN_OUT", reservedKeyInOut, true);
			cmd.addParameter("@SEATS_AVAIL_IN_OUT", seatsAvailInOut, true);
			cmd.addParameter("@WAIT_AVAIL_IN_OUT", waitAvailInOut, true);
			cmd.addParameter("@WAIT_COUNT_IN_OUT", waitCountInOut, true);
			cmd.addParameter("@WAIT_CAPACITY_IN_OUT", waitCapacityInOut, true);
				
			cmd.execute();
			reservedKeyInOut.val = cmd.getParameterValue("@RESERVED_KEY_IN_OUT", NString.class);
			seatsAvailInOut.val = cmd.getParameterValue("@SEATS_AVAIL_IN_OUT", NNumber.class);
			waitAvailInOut.val = cmd.getParameterValue("@WAIT_AVAIL_IN_OUT", NNumber.class);
			waitCountInOut.val = cmd.getParameterValue("@WAIT_COUNT_IN_OUT", NNumber.class);
			waitCapacityInOut.val = cmd.getParameterValue("@WAIT_CAPACITY_IN_OUT", NNumber.class);


		}
		
	
	
	
}
