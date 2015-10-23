package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvdoc {
		public static void dispEnteredPara(NString doctype,NString docnumber,NNumber subnum,NNumber chngnum,NString displayActg,NString displayText,NString commText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.DISP_ENTERED_PARA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@COMM_TEXT", commText);
				
			cmd.execute();


		}
		
		public static NString fGetCrsnDesc(NString crsnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.F_GET_CRSN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CRSN_CODE_IN", crsnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCurrDesc(NString currCodeIn,NDate transDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.F_GET_CURR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_CODE_IN", currCodeIn);
			cmd.addParameter("@TRANS_DATE_IN", transDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNatnDesc(NString natnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.F_GET_NATN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NATN_CODE_IN", natnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnTitle(NString coasCodeIn,NString orgnCodeIn,NDate transDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.F_GET_ORGN_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@TRANS_DATE_IN", transDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplayCommText(NString pCommCode,NString pColspan,NString commText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.P_DISPLAY_COMM_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_COLSPAN", pColspan);
			cmd.addParameter("@COMM_TEXT", commText);
				
			cmd.execute();


		}
		
		public static void pDisplayDocItemText(NNumber pDtyp,NString pDocCode,NNumber pItem,NString pColspan,NNumber pChgSeq,NString dispText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.P_DISPLAY_DOC_ITEM_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_COLSPAN", pColspan);
			cmd.addParameter("@P_CHG_SEQ", pChgSeq);
			cmd.addParameter("@DISP_TEXT", dispText);
				
			cmd.execute();


		}
		
		public static void pViewdoc(NString action,NString globalDoc,NNumber subnum,NNumber chngnum,NString docrefnum,NString dispActg,NString dispText,NString viewDoc,NString commText,NString ajaxPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDOC.P_VIEWDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@GLOBAL_DOC", globalDoc);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@DOCREFNUM", docrefnum);
			cmd.addParameter("@DISP_ACTG", dispActg);
			cmd.addParameter("@DISP_TEXT", dispText);
			cmd.addParameter("@VIEW_DOC", viewDoc);
			cmd.addParameter("@COMM_TEXT", commText);
			cmd.addParameter("@AJAX_PAGE", ajaxPage);
				
			cmd.execute();


		}
		
	
	
	
}
