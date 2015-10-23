package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkoprf {
		public static NBool fCheckClassYr(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECK_CLASS_YR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckCollDesc(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECK_COLL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckJobDesc(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECK_JOB_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckMaidenName(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECK_MAIDEN_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckPrefColl(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECK_PREF_COLL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckiteminfo(NNumber pidm,NString diroCode,NString itemType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_CHECKITEMINFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
			cmd.addParameter("@ITEM_TYPE", itemType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fProfileitemfound(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_PROFILEITEMFOUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTableexists(NString tablename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.F_TABLEEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TABLENAME", tablename);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pClassYr(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_CLASS_YR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();


		}
		
		public static void pCollDesc(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_COLL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();


		}
		
		public static void pGetitemrules(NNumber pidm,NString diroCode,NString dispProfileInd,NString updProfileInd,NString nonProfileDefInd,Ref<NString> description,Ref<NBool> displayed,Ref<NBool> _checked,Ref<NBool> changeable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_GETITEMRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
			cmd.addParameter("@DISP_PROFILE_IND", dispProfileInd);
			cmd.addParameter("@UPD_PROFILE_IND", updProfileInd);
			cmd.addParameter("@NON_PROFILE_DEF_IND", nonProfileDefInd);
			cmd.addParameter("@DESCRIPTION", NString.class);
			cmd.addParameter("@DISPLAYED", NBool.class);
			cmd.addParameter("@CHECKED", NBool.class);
			cmd.addParameter("@CHANGEABLE", NBool.class);
				
			cmd.execute();
			description.val = cmd.getParameterValue("@DESCRIPTION", NString.class);
			displayed.val = cmd.getParameterValue("@DISPLAYED", NBool.class);
			_checked.val = cmd.getParameterValue("@CHECKED", NBool.class);
			changeable.val = cmd.getParameterValue("@CHANGEABLE", NBool.class);


		}
		
		public static void pJobDesc(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_JOB_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();


		}
		
		public static void pMaidenName(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_MAIDEN_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();


		}
		
		public static void pModifydiroitem(NNumber pidm,NString code,NString valu) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_MODIFYDIROITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@VALU", valu);
				
			cmd.execute();


		}
		
		public static void pPrefColl(NNumber pidm,NString diroCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_PREF_COLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
				
			cmd.execute();


		}
		
		public static void pSavediroitems(NString cd1,NString vl1,NString cd2,NString vl2,NString cd3,NString vl3,NString cd4,NString vl4,NString cd5,NString vl5,NString cd6,NString vl6,NString cd7,NString vl7,NString cd8,NString vl8,NString cd9,NString vl9,NString cd10,NString vl10,NString cd11,NString vl11,NString cd12,NString vl12,NString cd13,NString vl13,NString cd14,NString vl14,NString cd15,NString vl15,NString cd16,NString vl16,NString cd17,NString vl17,NString cd18,NString vl18,NString cd19,NString vl19,NString cd20,NString vl20) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_SAVEDIROITEMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CD1", cd1);
			cmd.addParameter("@VL1", vl1);
			cmd.addParameter("@CD2", cd2);
			cmd.addParameter("@VL2", vl2);
			cmd.addParameter("@CD3", cd3);
			cmd.addParameter("@VL3", vl3);
			cmd.addParameter("@CD4", cd4);
			cmd.addParameter("@VL4", vl4);
			cmd.addParameter("@CD5", cd5);
			cmd.addParameter("@VL5", vl5);
			cmd.addParameter("@CD6", cd6);
			cmd.addParameter("@VL6", vl6);
			cmd.addParameter("@CD7", cd7);
			cmd.addParameter("@VL7", vl7);
			cmd.addParameter("@CD8", cd8);
			cmd.addParameter("@VL8", vl8);
			cmd.addParameter("@CD9", cd9);
			cmd.addParameter("@VL9", vl9);
			cmd.addParameter("@CD10", cd10);
			cmd.addParameter("@VL10", vl10);
			cmd.addParameter("@CD11", cd11);
			cmd.addParameter("@VL11", vl11);
			cmd.addParameter("@CD12", cd12);
			cmd.addParameter("@VL12", vl12);
			cmd.addParameter("@CD13", cd13);
			cmd.addParameter("@VL13", vl13);
			cmd.addParameter("@CD14", cd14);
			cmd.addParameter("@VL14", vl14);
			cmd.addParameter("@CD15", cd15);
			cmd.addParameter("@VL15", vl15);
			cmd.addParameter("@CD16", cd16);
			cmd.addParameter("@VL16", vl16);
			cmd.addParameter("@CD17", cd17);
			cmd.addParameter("@VL17", vl17);
			cmd.addParameter("@CD18", cd18);
			cmd.addParameter("@VL18", vl18);
			cmd.addParameter("@CD19", cd19);
			cmd.addParameter("@VL19", vl19);
			cmd.addParameter("@CD20", cd20);
			cmd.addParameter("@VL20", vl20);
				
			cmd.execute();


		}
		
		public static void pShowaddress(NString houseNumber,NString streetLine1,NString streetLine2,NString streetLine3,NString streetLine4,NString city,NString statCode,NString zip,NString natnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_SHOWADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@HOUSE_NUMBER", houseNumber);
			cmd.addParameter("@STREET_LINE1", streetLine1);
			cmd.addParameter("@STREET_LINE2", streetLine2);
			cmd.addParameter("@STREET_LINE3", streetLine3);
			cmd.addParameter("@STREET_LINE4", streetLine4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_CODE", statCode);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@NATN_CODE", natnCode);
				
			cmd.execute();


		}
		
		public static void pShowdiroitems() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_SHOWDIROITEMS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pShowiteminfo(NNumber pidm,NString diroCode,NString itemType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_SHOWITEMINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
			cmd.addParameter("@ITEM_TYPE", itemType);
				
			cmd.execute();


		}
		
		public static void pShowtelephone(NString phoneCtry,NString phoneArea,NString phoneNumber,NString phoneExt,NString unlistInd,NString intlAccess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOPRF.P_SHOWTELEPHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHONE_CTRY", phoneCtry);
			cmd.addParameter("@PHONE_AREA", phoneArea);
			cmd.addParameter("@PHONE_NUMBER", phoneNumber);
			cmd.addParameter("@PHONE_EXT", phoneExt);
			cmd.addParameter("@UNLIST_IND", unlistInd);
			cmd.addParameter("@INTL_ACCESS", intlAccess);
				
			cmd.execute();


		}
		
	
	
	
}
