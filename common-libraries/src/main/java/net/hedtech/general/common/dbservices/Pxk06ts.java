package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxk06ts {
		public static void pGetW2Form(PpW22006.W2RectypeRow pRecIn,Ref<PpW22006.W2RectypeRow> pRecOut,Ref<NNumber> pFormIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK06TS.P_GET_W2_FORM", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_REC_IN", pRecIn, PpW22006.W2RectypeRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_REC_OUT", pRecOut.val, PpW22006.W2RectypeRow.class, true ));
			cmd.addParameter("@P_FORM_INDEX", pFormIndex, true);
				
			cmd.execute();
			pRecOut.val = cmd.getParameterValue("@P_REC_OUT", PpW22006.W2RectypeRow.class);
			pFormIndex.val = cmd.getParameterValue("@P_FORM_INDEX", NNumber.class);


		}
		
//		public static void pGetW2c(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<List<W2TabtypeRow>> pFormTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK06TS.P_GET_W2C", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QUARTER", pQuarter);
//			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			// cmd.addParameter(DbTypes.getTableType("P_FORM_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			// pFormTableOut.val = cmd.getTableParameterValue("@P_FORM_TABLE_OUT", object.class);
//
//
//		}
		
//		public static void pGetW2cForm(List<W2TabtypeRow> pRecTableIn,Ref<List<W2TabtypeRow>> pRecTableOut,Ref<NNumber> pFormIndex) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK06TS.P_GET_W2C_FORM", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_REC_TABLE_IN", "", pRecTableIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_REC_TABLE_OUT", "", object.class));
//			cmd.addParameter("@P_FORM_INDEX", pFormIndex, true);
//				
//			cmd.execute();
//			// pRecTableOut.val = cmd.getTableParameterValue("@P_REC_TABLE_OUT", object.class);
//			pFormIndex.val = cmd.getParameterValue("@P_FORM_INDEX", NNumber.class);
//
//
//		}
		
		public static void pPrintW2Preview2006(NString inTaxYear,NString inEmprCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK06TS.P_PRINT_W2_PREVIEW_2006", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2006(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK06TS.P_PRINT_W2C_PREVIEW_2006", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
