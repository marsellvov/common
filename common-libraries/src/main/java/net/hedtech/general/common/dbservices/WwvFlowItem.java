package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowItem {
		public static NString Fcheckbox(NNumber pIdx,NString pValue,NString pAttributes,NString pCheckedValues,NString pCheckedValuesDelimitor,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.CHECKBOX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_CHECKED_VALUES", pCheckedValues);
			cmd.addParameter("@P_CHECKED_VALUES_DELIMITOR", pCheckedValuesDelimitor);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdatePopup(NNumber pIdx,NNumber pRow,NDate pValue,NString pDateFormat,NNumber pSize,NNumber pMaxlength,NString pAttributes,NString pItemId,NString pItemLabel,NString pDisplayAs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.DATE_POPUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_ROW", pRow);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_DATE_FORMAT", pDateFormat);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_MAXLENGTH", pMaxlength);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_DISPLAY_AS", pDisplayAs);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdisplayAndSave(NNumber pIdx,NString pValue,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.DISPLAY_AND_SAVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchGBuildOptionsExcluded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.FETCH_G_BUILD_OPTIONS_EXCLUDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchGBuildOptionsIncluded() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.FETCH_G_BUILD_OPTIONS_INCLUDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetFirstRownum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.GET_FIRST_ROWNUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fhidden(NNumber pIdx,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.HIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmd5(NString pValue01,NString pValue02,NString pValue03,NString pValue04,NString pValue05,NString pValue06,NString pValue07,NString pValue08,NString pValue09,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pColSep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MD5", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
			cmd.addParameter("@P_VALUE04", pValue04);
			cmd.addParameter("@P_VALUE05", pValue05);
			cmd.addParameter("@P_VALUE06", pValue06);
			cmd.addParameter("@P_VALUE07", pValue07);
			cmd.addParameter("@P_VALUE08", pValue08);
			cmd.addParameter("@P_VALUE09", pValue09);
			cmd.addParameter("@P_VALUE10", pValue10);
			cmd.addParameter("@P_VALUE11", pValue11);
			cmd.addParameter("@P_VALUE12", pValue12);
			cmd.addParameter("@P_VALUE13", pValue13);
			cmd.addParameter("@P_VALUE14", pValue14);
			cmd.addParameter("@P_VALUE15", pValue15);
			cmd.addParameter("@P_VALUE16", pValue16);
			cmd.addParameter("@P_VALUE17", pValue17);
			cmd.addParameter("@P_VALUE18", pValue18);
			cmd.addParameter("@P_VALUE19", pValue19);
			cmd.addParameter("@P_VALUE20", pValue20);
			cmd.addParameter("@P_VALUE21", pValue21);
			cmd.addParameter("@P_VALUE22", pValue22);
			cmd.addParameter("@P_VALUE23", pValue23);
			cmd.addParameter("@P_VALUE24", pValue24);
			cmd.addParameter("@P_VALUE25", pValue25);
			cmd.addParameter("@P_VALUE26", pValue26);
			cmd.addParameter("@P_VALUE27", pValue27);
			cmd.addParameter("@P_VALUE28", pValue28);
			cmd.addParameter("@P_VALUE29", pValue29);
			cmd.addParameter("@P_VALUE30", pValue30);
			cmd.addParameter("@P_VALUE31", pValue31);
			cmd.addParameter("@P_VALUE32", pValue32);
			cmd.addParameter("@P_VALUE33", pValue33);
			cmd.addParameter("@P_VALUE34", pValue34);
			cmd.addParameter("@P_VALUE35", pValue35);
			cmd.addParameter("@P_VALUE36", pValue36);
			cmd.addParameter("@P_VALUE37", pValue37);
			cmd.addParameter("@P_VALUE38", pValue38);
			cmd.addParameter("@P_VALUE39", pValue39);
			cmd.addParameter("@P_VALUE40", pValue40);
			cmd.addParameter("@P_VALUE41", pValue41);
			cmd.addParameter("@P_VALUE42", pValue42);
			cmd.addParameter("@P_VALUE43", pValue43);
			cmd.addParameter("@P_VALUE44", pValue44);
			cmd.addParameter("@P_VALUE45", pValue45);
			cmd.addParameter("@P_VALUE46", pValue46);
			cmd.addParameter("@P_VALUE47", pValue47);
			cmd.addParameter("@P_VALUE48", pValue48);
			cmd.addParameter("@P_VALUE49", pValue49);
			cmd.addParameter("@P_VALUE50", pValue50);
			cmd.addParameter("@P_COL_SEP", pColSep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmd5Checksum(NString pValue01,NString pValue02,NString pValue03,NString pValue04,NString pValue05,NString pValue06,NString pValue07,NString pValue08,NString pValue09,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pColSep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MD5_CHECKSUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
			cmd.addParameter("@P_VALUE04", pValue04);
			cmd.addParameter("@P_VALUE05", pValue05);
			cmd.addParameter("@P_VALUE06", pValue06);
			cmd.addParameter("@P_VALUE07", pValue07);
			cmd.addParameter("@P_VALUE08", pValue08);
			cmd.addParameter("@P_VALUE09", pValue09);
			cmd.addParameter("@P_VALUE10", pValue10);
			cmd.addParameter("@P_VALUE11", pValue11);
			cmd.addParameter("@P_VALUE12", pValue12);
			cmd.addParameter("@P_VALUE13", pValue13);
			cmd.addParameter("@P_VALUE14", pValue14);
			cmd.addParameter("@P_VALUE15", pValue15);
			cmd.addParameter("@P_VALUE16", pValue16);
			cmd.addParameter("@P_VALUE17", pValue17);
			cmd.addParameter("@P_VALUE18", pValue18);
			cmd.addParameter("@P_VALUE19", pValue19);
			cmd.addParameter("@P_VALUE20", pValue20);
			cmd.addParameter("@P_VALUE21", pValue21);
			cmd.addParameter("@P_VALUE22", pValue22);
			cmd.addParameter("@P_VALUE23", pValue23);
			cmd.addParameter("@P_VALUE24", pValue24);
			cmd.addParameter("@P_VALUE25", pValue25);
			cmd.addParameter("@P_VALUE26", pValue26);
			cmd.addParameter("@P_VALUE27", pValue27);
			cmd.addParameter("@P_VALUE28", pValue28);
			cmd.addParameter("@P_VALUE29", pValue29);
			cmd.addParameter("@P_VALUE30", pValue30);
			cmd.addParameter("@P_VALUE31", pValue31);
			cmd.addParameter("@P_VALUE32", pValue32);
			cmd.addParameter("@P_VALUE33", pValue33);
			cmd.addParameter("@P_VALUE34", pValue34);
			cmd.addParameter("@P_VALUE35", pValue35);
			cmd.addParameter("@P_VALUE36", pValue36);
			cmd.addParameter("@P_VALUE37", pValue37);
			cmd.addParameter("@P_VALUE38", pValue38);
			cmd.addParameter("@P_VALUE39", pValue39);
			cmd.addParameter("@P_VALUE40", pValue40);
			cmd.addParameter("@P_VALUE41", pValue41);
			cmd.addParameter("@P_VALUE42", pValue42);
			cmd.addParameter("@P_VALUE43", pValue43);
			cmd.addParameter("@P_VALUE44", pValue44);
			cmd.addParameter("@P_VALUE45", pValue45);
			cmd.addParameter("@P_VALUE46", pValue46);
			cmd.addParameter("@P_VALUE47", pValue47);
			cmd.addParameter("@P_VALUE48", pValue48);
			cmd.addParameter("@P_VALUE49", pValue49);
			cmd.addParameter("@P_VALUE50", pValue50);
			cmd.addParameter("@P_COL_SEP", pColSep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmd5Hidden(NNumber pIdx,NString pValue01,NString pValue02,NString pValue03,NString pValue04,NString pValue05,NString pValue06,NString pValue07,NString pValue08,NString pValue09,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pColSep) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MD5_HIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
			cmd.addParameter("@P_VALUE04", pValue04);
			cmd.addParameter("@P_VALUE05", pValue05);
			cmd.addParameter("@P_VALUE06", pValue06);
			cmd.addParameter("@P_VALUE07", pValue07);
			cmd.addParameter("@P_VALUE08", pValue08);
			cmd.addParameter("@P_VALUE09", pValue09);
			cmd.addParameter("@P_VALUE10", pValue10);
			cmd.addParameter("@P_VALUE11", pValue11);
			cmd.addParameter("@P_VALUE12", pValue12);
			cmd.addParameter("@P_VALUE13", pValue13);
			cmd.addParameter("@P_VALUE14", pValue14);
			cmd.addParameter("@P_VALUE15", pValue15);
			cmd.addParameter("@P_VALUE16", pValue16);
			cmd.addParameter("@P_VALUE17", pValue17);
			cmd.addParameter("@P_VALUE18", pValue18);
			cmd.addParameter("@P_VALUE19", pValue19);
			cmd.addParameter("@P_VALUE20", pValue20);
			cmd.addParameter("@P_VALUE21", pValue21);
			cmd.addParameter("@P_VALUE22", pValue22);
			cmd.addParameter("@P_VALUE23", pValue23);
			cmd.addParameter("@P_VALUE24", pValue24);
			cmd.addParameter("@P_VALUE25", pValue25);
			cmd.addParameter("@P_VALUE26", pValue26);
			cmd.addParameter("@P_VALUE27", pValue27);
			cmd.addParameter("@P_VALUE28", pValue28);
			cmd.addParameter("@P_VALUE29", pValue29);
			cmd.addParameter("@P_VALUE30", pValue30);
			cmd.addParameter("@P_VALUE31", pValue31);
			cmd.addParameter("@P_VALUE32", pValue32);
			cmd.addParameter("@P_VALUE33", pValue33);
			cmd.addParameter("@P_VALUE34", pValue34);
			cmd.addParameter("@P_VALUE35", pValue35);
			cmd.addParameter("@P_VALUE36", pValue36);
			cmd.addParameter("@P_VALUE37", pValue37);
			cmd.addParameter("@P_VALUE38", pValue38);
			cmd.addParameter("@P_VALUE39", pValue39);
			cmd.addParameter("@P_VALUE40", pValue40);
			cmd.addParameter("@P_VALUE41", pValue41);
			cmd.addParameter("@P_VALUE42", pValue42);
			cmd.addParameter("@P_VALUE43", pValue43);
			cmd.addParameter("@P_VALUE44", pValue44);
			cmd.addParameter("@P_VALUE45", pValue45);
			cmd.addParameter("@P_VALUE46", pValue46);
			cmd.addParameter("@P_VALUE47", pValue47);
			cmd.addParameter("@P_VALUE48", pValue48);
			cmd.addParameter("@P_VALUE49", pValue49);
			cmd.addParameter("@P_VALUE50", pValue50);
			cmd.addParameter("@P_COL_SEP", pColSep);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void mru(NString pTableOwner,NString pTableName,NString pPkCol,NString pPkColSrcType,NString pPkColSrc,List<WwvFlowGlobal.VcArr2Row> pPkVals,NString pPkCol2,NString pPkCol2SrcType,NString pPkCol2Src,List<WwvFlowGlobal.VcArr2Row> pPkVals2,NString pColName01,NString pColName02,NString pColName03,NString pColName04,NString pColName05,NString pColName06,NString pColName07,NString pColName08,NString pColName09,NString pColName10,NString pColName11,NString pColName12,NString pColName13,NString pColName14,NString pColName15,NString pColName16,NString pColName17,NString pColName18,NString pColName19,NString pColName20,NString pColName21,NString pColName22,NString pColName23,NString pColName24,NString pColName25,NString pColName26,NString pColName27,NString pColName28,NString pColName29,NString pColName30,NString pColName31,NString pColName32,NString pColName33,NString pColName34,NString pColName35,NString pColName36,NString pColName37,NString pColName38,NString pColName39,NString pColName40,NString pColName41,NString pColName42,NString pColName43,NString pColName44,NString pColName45,NString pColName46,NString pColName47,NString pColName48,NString pColName49,NString pColName50,NString pColMask01,NString pColMask02,NString pColMask03,NString pColMask04,NString pColMask05,NString pColMask06,NString pColMask07,NString pColMask08,NString pColMask09,NString pColMask10,NString pColMask11,NString pColMask12,NString pColMask13,NString pColMask14,NString pColMask15,NString pColMask16,NString pColMask17,NString pColMask18,NString pColMask19,NString pColMask20,NString pColMask21,NString pColMask22,NString pColMask23,NString pColMask24,NString pColMask25,NString pColMask26,NString pColMask27,NString pColMask28,NString pColMask29,NString pColMask30,NString pColMask31,NString pColMask32,NString pColMask33,NString pColMask34,NString pColMask35,NString pColMask36,NString pColMask37,NString pColMask38,NString pColMask39,NString pColMask40,NString pColMask41,NString pColMask42,NString pColMask43,NString pColMask44,NString pColMask45,NString pColMask46,NString pColMask47,NString pColMask48,NString pColMask49,NString pColMask50,List<WwvFlowGlobal.VcArr2Row> pColVals01,List<WwvFlowGlobal.VcArr2Row> pColVals02,List<WwvFlowGlobal.VcArr2Row> pColVals03,List<WwvFlowGlobal.VcArr2Row> pColVals04,List<WwvFlowGlobal.VcArr2Row> pColVals05,List<WwvFlowGlobal.VcArr2Row> pColVals06,List<WwvFlowGlobal.VcArr2Row> pColVals07,List<WwvFlowGlobal.VcArr2Row> pColVals08,List<WwvFlowGlobal.VcArr2Row> pColVals09,List<WwvFlowGlobal.VcArr2Row> pColVals10,List<WwvFlowGlobal.VcArr2Row> pColVals11,List<WwvFlowGlobal.VcArr2Row> pColVals12,List<WwvFlowGlobal.VcArr2Row> pColVals13,List<WwvFlowGlobal.VcArr2Row> pColVals14,List<WwvFlowGlobal.VcArr2Row> pColVals15,List<WwvFlowGlobal.VcArr2Row> pColVals16,List<WwvFlowGlobal.VcArr2Row> pColVals17,List<WwvFlowGlobal.VcArr2Row> pColVals18,List<WwvFlowGlobal.VcArr2Row> pColVals19,List<WwvFlowGlobal.VcArr2Row> pColVals20,List<WwvFlowGlobal.VcArr2Row> pColVals21,List<WwvFlowGlobal.VcArr2Row> pColVals22,List<WwvFlowGlobal.VcArr2Row> pColVals23,List<WwvFlowGlobal.VcArr2Row> pColVals24,List<WwvFlowGlobal.VcArr2Row> pColVals25,List<WwvFlowGlobal.VcArr2Row> pColVals26,List<WwvFlowGlobal.VcArr2Row> pColVals27,List<WwvFlowGlobal.VcArr2Row> pColVals28,List<WwvFlowGlobal.VcArr2Row> pColVals29,List<WwvFlowGlobal.VcArr2Row> pColVals30,List<WwvFlowGlobal.VcArr2Row> pColVals31,List<WwvFlowGlobal.VcArr2Row> pColVals32,List<WwvFlowGlobal.VcArr2Row> pColVals33,List<WwvFlowGlobal.VcArr2Row> pColVals34,List<WwvFlowGlobal.VcArr2Row> pColVals35,List<WwvFlowGlobal.VcArr2Row> pColVals36,List<WwvFlowGlobal.VcArr2Row> pColVals37,List<WwvFlowGlobal.VcArr2Row> pColVals38,List<WwvFlowGlobal.VcArr2Row> pColVals39,List<WwvFlowGlobal.VcArr2Row> pColVals40,List<WwvFlowGlobal.VcArr2Row> pColVals41,List<WwvFlowGlobal.VcArr2Row> pColVals42,List<WwvFlowGlobal.VcArr2Row> pColVals43,List<WwvFlowGlobal.VcArr2Row> pColVals44,List<WwvFlowGlobal.VcArr2Row> pColVals45,List<WwvFlowGlobal.VcArr2Row> pColVals46,List<WwvFlowGlobal.VcArr2Row> pColVals47,List<WwvFlowGlobal.VcArr2Row> pColVals48,List<WwvFlowGlobal.VcArr2Row> pColVals49,List<WwvFlowGlobal.VcArr2Row> pColVals50,List<WwvFlowGlobal.VcArr2Row> pMd5RowChecksum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MRU", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
//			cmd.addParameter("@P_TABLE_NAME", pTableName);
//			cmd.addParameter("@P_PK_COL", pPkCol);
//			cmd.addParameter("@P_PK_COL_SRC_TYPE", pPkColSrcType);
//			cmd.addParameter("@P_PK_COL_SRC", pPkColSrc);
//			// cmd.addParameter(DbTypes.getTableType("P_PK_VALS", "", pPkVals, object.class));
//			cmd.addParameter("@P_PK_COL2", pPkCol2);
//			cmd.addParameter("@P_PK_COL2_SRC_TYPE", pPkCol2SrcType);
//			cmd.addParameter("@P_PK_COL2_SRC", pPkCol2Src);
//			// cmd.addParameter(DbTypes.getTableType("P_PK_VALS2", "", pPkVals2, object.class));
//			cmd.addParameter("@P_COL_NAME01", pColName01);
//			cmd.addParameter("@P_COL_NAME02", pColName02);
//			cmd.addParameter("@P_COL_NAME03", pColName03);
//			cmd.addParameter("@P_COL_NAME04", pColName04);
//			cmd.addParameter("@P_COL_NAME05", pColName05);
//			cmd.addParameter("@P_COL_NAME06", pColName06);
//			cmd.addParameter("@P_COL_NAME07", pColName07);
//			cmd.addParameter("@P_COL_NAME08", pColName08);
//			cmd.addParameter("@P_COL_NAME09", pColName09);
//			cmd.addParameter("@P_COL_NAME10", pColName10);
//			cmd.addParameter("@P_COL_NAME11", pColName11);
//			cmd.addParameter("@P_COL_NAME12", pColName12);
//			cmd.addParameter("@P_COL_NAME13", pColName13);
//			cmd.addParameter("@P_COL_NAME14", pColName14);
//			cmd.addParameter("@P_COL_NAME15", pColName15);
//			cmd.addParameter("@P_COL_NAME16", pColName16);
//			cmd.addParameter("@P_COL_NAME17", pColName17);
//			cmd.addParameter("@P_COL_NAME18", pColName18);
//			cmd.addParameter("@P_COL_NAME19", pColName19);
//			cmd.addParameter("@P_COL_NAME20", pColName20);
//			cmd.addParameter("@P_COL_NAME21", pColName21);
//			cmd.addParameter("@P_COL_NAME22", pColName22);
//			cmd.addParameter("@P_COL_NAME23", pColName23);
//			cmd.addParameter("@P_COL_NAME24", pColName24);
//			cmd.addParameter("@P_COL_NAME25", pColName25);
//			cmd.addParameter("@P_COL_NAME26", pColName26);
//			cmd.addParameter("@P_COL_NAME27", pColName27);
//			cmd.addParameter("@P_COL_NAME28", pColName28);
//			cmd.addParameter("@P_COL_NAME29", pColName29);
//			cmd.addParameter("@P_COL_NAME30", pColName30);
//			cmd.addParameter("@P_COL_NAME31", pColName31);
//			cmd.addParameter("@P_COL_NAME32", pColName32);
//			cmd.addParameter("@P_COL_NAME33", pColName33);
//			cmd.addParameter("@P_COL_NAME34", pColName34);
//			cmd.addParameter("@P_COL_NAME35", pColName35);
//			cmd.addParameter("@P_COL_NAME36", pColName36);
//			cmd.addParameter("@P_COL_NAME37", pColName37);
//			cmd.addParameter("@P_COL_NAME38", pColName38);
//			cmd.addParameter("@P_COL_NAME39", pColName39);
//			cmd.addParameter("@P_COL_NAME40", pColName40);
//			cmd.addParameter("@P_COL_NAME41", pColName41);
//			cmd.addParameter("@P_COL_NAME42", pColName42);
//			cmd.addParameter("@P_COL_NAME43", pColName43);
//			cmd.addParameter("@P_COL_NAME44", pColName44);
//			cmd.addParameter("@P_COL_NAME45", pColName45);
//			cmd.addParameter("@P_COL_NAME46", pColName46);
//			cmd.addParameter("@P_COL_NAME47", pColName47);
//			cmd.addParameter("@P_COL_NAME48", pColName48);
//			cmd.addParameter("@P_COL_NAME49", pColName49);
//			cmd.addParameter("@P_COL_NAME50", pColName50);
//			cmd.addParameter("@P_COL_MASK01", pColMask01);
//			cmd.addParameter("@P_COL_MASK02", pColMask02);
//			cmd.addParameter("@P_COL_MASK03", pColMask03);
//			cmd.addParameter("@P_COL_MASK04", pColMask04);
//			cmd.addParameter("@P_COL_MASK05", pColMask05);
//			cmd.addParameter("@P_COL_MASK06", pColMask06);
//			cmd.addParameter("@P_COL_MASK07", pColMask07);
//			cmd.addParameter("@P_COL_MASK08", pColMask08);
//			cmd.addParameter("@P_COL_MASK09", pColMask09);
//			cmd.addParameter("@P_COL_MASK10", pColMask10);
//			cmd.addParameter("@P_COL_MASK11", pColMask11);
//			cmd.addParameter("@P_COL_MASK12", pColMask12);
//			cmd.addParameter("@P_COL_MASK13", pColMask13);
//			cmd.addParameter("@P_COL_MASK14", pColMask14);
//			cmd.addParameter("@P_COL_MASK15", pColMask15);
//			cmd.addParameter("@P_COL_MASK16", pColMask16);
//			cmd.addParameter("@P_COL_MASK17", pColMask17);
//			cmd.addParameter("@P_COL_MASK18", pColMask18);
//			cmd.addParameter("@P_COL_MASK19", pColMask19);
//			cmd.addParameter("@P_COL_MASK20", pColMask20);
//			cmd.addParameter("@P_COL_MASK21", pColMask21);
//			cmd.addParameter("@P_COL_MASK22", pColMask22);
//			cmd.addParameter("@P_COL_MASK23", pColMask23);
//			cmd.addParameter("@P_COL_MASK24", pColMask24);
//			cmd.addParameter("@P_COL_MASK25", pColMask25);
//			cmd.addParameter("@P_COL_MASK26", pColMask26);
//			cmd.addParameter("@P_COL_MASK27", pColMask27);
//			cmd.addParameter("@P_COL_MASK28", pColMask28);
//			cmd.addParameter("@P_COL_MASK29", pColMask29);
//			cmd.addParameter("@P_COL_MASK30", pColMask30);
//			cmd.addParameter("@P_COL_MASK31", pColMask31);
//			cmd.addParameter("@P_COL_MASK32", pColMask32);
//			cmd.addParameter("@P_COL_MASK33", pColMask33);
//			cmd.addParameter("@P_COL_MASK34", pColMask34);
//			cmd.addParameter("@P_COL_MASK35", pColMask35);
//			cmd.addParameter("@P_COL_MASK36", pColMask36);
//			cmd.addParameter("@P_COL_MASK37", pColMask37);
//			cmd.addParameter("@P_COL_MASK38", pColMask38);
//			cmd.addParameter("@P_COL_MASK39", pColMask39);
//			cmd.addParameter("@P_COL_MASK40", pColMask40);
//			cmd.addParameter("@P_COL_MASK41", pColMask41);
//			cmd.addParameter("@P_COL_MASK42", pColMask42);
//			cmd.addParameter("@P_COL_MASK43", pColMask43);
//			cmd.addParameter("@P_COL_MASK44", pColMask44);
//			cmd.addParameter("@P_COL_MASK45", pColMask45);
//			cmd.addParameter("@P_COL_MASK46", pColMask46);
//			cmd.addParameter("@P_COL_MASK47", pColMask47);
//			cmd.addParameter("@P_COL_MASK48", pColMask48);
//			cmd.addParameter("@P_COL_MASK49", pColMask49);
//			cmd.addParameter("@P_COL_MASK50", pColMask50);
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS01", "", pColVals01, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS02", "", pColVals02, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS03", "", pColVals03, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS04", "", pColVals04, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS05", "", pColVals05, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS06", "", pColVals06, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS07", "", pColVals07, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS08", "", pColVals08, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS09", "", pColVals09, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS10", "", pColVals10, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS11", "", pColVals11, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS12", "", pColVals12, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS13", "", pColVals13, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS14", "", pColVals14, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS15", "", pColVals15, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS16", "", pColVals16, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS17", "", pColVals17, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS18", "", pColVals18, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS19", "", pColVals19, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS20", "", pColVals20, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS21", "", pColVals21, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS22", "", pColVals22, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS23", "", pColVals23, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS24", "", pColVals24, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS25", "", pColVals25, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS26", "", pColVals26, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS27", "", pColVals27, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS28", "", pColVals28, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS29", "", pColVals29, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS30", "", pColVals30, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS31", "", pColVals31, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS32", "", pColVals32, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS33", "", pColVals33, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS34", "", pColVals34, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS35", "", pColVals35, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS36", "", pColVals36, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS37", "", pColVals37, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS38", "", pColVals38, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS39", "", pColVals39, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS40", "", pColVals40, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS41", "", pColVals41, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS42", "", pColVals42, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS43", "", pColVals43, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS44", "", pColVals44, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS45", "", pColVals45, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS46", "", pColVals46, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS47", "", pColVals47, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS48", "", pColVals48, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS49", "", pColVals49, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_VALS50", "", pColVals50, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MD5_ROW_CHECKSUM", "", pMd5RowChecksum, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void multiRowDelete(NString pMruString,NNumber pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MULTI_ROW_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MRU_STRING", pMruString);
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();


		}
		
		public static void multiRowUpdate(NString pMruString,NNumber pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.MULTI_ROW_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MRU_STRING", pMruString);
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();


		}
		
		public static NString FpopupFromLov(NNumber pIdx,NString pValue,NString pLovName,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.POPUP_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupFromQuery(NNumber pIdx,NString pValue,NString pLovQuery,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.POPUP_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupkeyFromLov(NNumber pIdx,NString pValue,NString pLovName,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.POPUPKEY_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpopupkeyFromQuery(NNumber pIdx,NString pValue,NString pLovQuery,NString pWidth,NString pMaxLength,NString pFormIndex,NString pElementIndex,NString pEscapeHtml,NString pMaxElements,NString pAttributes,NString pEvalValue,NString pOkToQuery,NString pTranslation,NString pReturnKey,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.POPUPKEY_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV_QUERY", pLovQuery);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_FORM_INDEX", pFormIndex);
			cmd.addParameter("@P_ELEMENT_INDEX", pElementIndex);
			cmd.addParameter("@P_ESCAPE_HTML", pEscapeHtml);
			cmd.addParameter("@P_MAX_ELEMENTS", pMaxElements);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_EVAL_VALUE", pEvalValue);
			cmd.addParameter("@P_OK_TO_QUERY", pOkToQuery);
			cmd.addParameter("@P_TRANSLATION", pTranslation);
			cmd.addParameter("@P_RETURN_KEY", pReturnKey);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fradiogroup(NNumber pIdx,NString pValue,NString pSelectedValue,NString pDisplay,NString pAttributes,NString pOnblur,NString pOnchange,NString pOnfocus,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.RADIOGROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_SELECTED_VALUE", pSelectedValue);
			cmd.addParameter("@P_DISPLAY", pDisplay);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ONBLUR", pOnblur);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONFOCUS", pOnfocus);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectList(NNumber pIdx,NString pValue,NString pListValues,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.SELECT_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LIST_VALUES", pListValues);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromLov(NNumber pIdx,NString pValue,NString pLov,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.SELECT_LIST_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromLovXl(NNumber pIdx,NString pValue,NString pLov,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.SELECT_LIST_FROM_LOV_XL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromQuery(NNumber pIdx,NString pValue,NString pQuery,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.SELECT_LIST_FROM_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FselectListFromQueryXl(NNumber pIdx,NString pValue,NString pQuery,NString pAttributes,NString pShowNull,NString pNullValue,NString pNullText,NString pItemId,NString pItemLabel,NString pShowExtra) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.SELECT_LIST_FROM_QUERY_XL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_SHOW_NULL", pShowNull);
			cmd.addParameter("@P_NULL_VALUE", pNullValue);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_SHOW_EXTRA", pShowExtra);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Ftext(NNumber pIdx,NString pValue,NNumber pSize,NNumber pMaxlength,NString pAttributes,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_SIZE", pSize);
			cmd.addParameter("@P_MAXLENGTH", pMaxlength);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtextFromLov(NString pValue,NString pLov,NString pNullText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.TEXT_FROM_LOV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_LOV", pLov);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtextFromLovQuery(NString pValue,NString pQuery,NString pNullText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.TEXT_FROM_LOV_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_NULL_TEXT", pNullText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Ftextarea(NNumber pIdx,NString pValue,NNumber pRows,NNumber pCols,NString pAttributes,NString pItemId,NString pItemLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_ITEM.TEXTAREA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDX", pIdx);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWS", pRows);
			cmd.addParameter("@P_COLS", pCols);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_ITEM_ID", pItemId);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
