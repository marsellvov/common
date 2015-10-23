package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Scksels {
		public static NBool fCheckCatalogLongTitle(NString subjIn,NString crseIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_CHECK_CATALOG_LONG_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckCatalogSyllabus(NString subjIn,NString crseIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_CHECK_CATALOG_SYLLABUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCheckScrgmodGmodCode(NString pSubjCode,NString pCrseNumb,NString pTermCode,NString pGmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_CHECK_SCRGMOD_GMOD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckScrlevlLevlCode(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pLevlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_CHECK_SCRLEVL_LEVL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDefaultGmod(NString subjIn,NString crseIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_DEFAULT_GMOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMinScrlevl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_MIN_SCRLEVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMinScrlevlByMulti(NString pTermCode,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_MIN_SCRLEVL_BY_MULTI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMinScrlevlWithLevl(NString termIn,NString subjIn,NString crseIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_MIN_SCRLEVL_WITH_LEVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetScbcrseMaxTermCode(NString pSubjCode,NString pCrseNumb,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_SCBCRSE_MAX_TERM_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetScbcrseRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_SCBCRSE_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetScbdescTextNar(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NString pAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GET_SCBDESC_TEXT_NAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_AMOUNT", pAmount);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdescclob(NString rowidIn,NString startposIn,NString lobLen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_GETDESCCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@STARTPOS_IN", startposIn);
			cmd.addParameter("@LOB_LEN", lobLen);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fScrattrValue(NString pInternalCode,NString pSubj,NString pCrse,NString pTerm,NNumber pPosition,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_SCRATTR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CRSE", pCrse);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fScrschdValue(NString pInternalCode,NString pSubj,NString pCrse,NString pTerm,NNumber pPosition,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.F_SCRSCHD_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CRSE", pCrse);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pGetCrseGmodCodes(Ref<List<Soktabs.StvgmodTabTypeRow>> stvgmodTable,Ref<NNumber> numGmodInOut,NString subjIn,NString crseIn,NString termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.P_GET_CRSE_GMOD_CODES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("STVGMOD_TABLE", "", stvgmodTable.val, object.class , true));
//			cmd.addParameter("@NUM_GMOD_IN_OUT", numGmodInOut, true);
//			cmd.addParameter("@SUBJ_IN", subjIn);
//			cmd.addParameter("@CRSE_IN", crseIn);
//			cmd.addParameter("@TERM_IN", termIn);
//				
//			cmd.execute();
//			// stvgmodTable.val = cmd.getTableParameterValue("@STVGMOD_TABLE", object.class);
//			numGmodInOut.val = cmd.getParameterValue("@NUM_GMOD_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pGetMinGmod(Ref<NString> minGmodInOut,Ref<NNumber> gmodCountInOut,NString subjIn,NString crseIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCKSELS.P_GET_MIN_GMOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MIN_GMOD_IN_OUT", minGmodInOut, true);
			cmd.addParameter("@GMOD_COUNT_IN_OUT", gmodCountInOut, true);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@CRSE_IN", crseIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			minGmodInOut.val = cmd.getParameterValue("@MIN_GMOD_IN_OUT", NString.class);
			gmodCountInOut.val = cmd.getParameterValue("@GMOD_COUNT_IN_OUT", NNumber.class);


		}
		
	
	
	
}
