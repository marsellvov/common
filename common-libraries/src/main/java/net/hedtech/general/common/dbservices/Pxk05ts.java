package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxk05ts {
//		public static void pGetW2c(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<NNumber> pStateCount,Ref<NNumber> pLocalCount,Ref<NNumber> pMiscCount,Ref<NNumber> pOtherCount,Ref<List<W2TabtypeRow>> pFormTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK05TS.P_GET_W2C", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QUARTER", pQuarter);
//			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_STATE_COUNT", NNumber.class);
//			cmd.addParameter("@P_LOCAL_COUNT", NNumber.class);
//			cmd.addParameter("@P_MISC_COUNT", NNumber.class);
//			cmd.addParameter("@P_OTHER_COUNT", NNumber.class);
//			// cmd.addParameter(DbTypes.getTableType("P_FORM_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			pStateCount.val = cmd.getParameterValue("@P_STATE_COUNT", NNumber.class);
//			pLocalCount.val = cmd.getParameterValue("@P_LOCAL_COUNT", NNumber.class);
//			pMiscCount.val = cmd.getParameterValue("@P_MISC_COUNT", NNumber.class);
//			pOtherCount.val = cmd.getParameterValue("@P_OTHER_COUNT", NNumber.class);
//			// pFormTableOut.val = cmd.getTableParameterValue("@P_FORM_TABLE_OUT", object.class);
//
//
//		}
		
//		public static void pGetW2cForm(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<List<W2TabtypeRow>> pFormTableOut,Ref<NNumber> pFormIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK05TS.P_GET_W2C_FORM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QUARTER", pQuarter);
//			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			// cmd.addParameter(DbTypes.getTableType("P_FORM_TABLE_OUT", "", object.class));
//			cmd.addParameter("@P_FORM_INDEX", pFormIndex, true);
//				
//			cmd.execute();
//			// pFormTableOut.val = cmd.getTableParameterValue("@P_FORM_TABLE_OUT", object.class);
//			pFormIndex.val = cmd.getParameterValue("@P_FORM_INDEX", NNumber.class);
//
//
//		}
		
		public static void pPrintW2Preview2005(NString inTaxYear,NString inEmprCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK05TS.P_PRINT_W2_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2005(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK05TS.P_PRINT_W2C_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
