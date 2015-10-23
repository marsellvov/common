package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlow {
//		public static void accept(NString pRequest,NString pInstance,NString pFlowId,NNumber pCompany,NString pFlowStepId,List<WwvFlowGlobal.VcArr2Row> pArgNames,List<WwvFlowGlobal.VcArr2Row> pArgValues,List<WwvFlowGlobal.VcArr2Row> pAcceptProcessing,List<WwvFlowGlobal.VcArr2Row> pV01,List<WwvFlowGlobal.VcArr2Row> pV02,List<WwvFlowGlobal.VcArr2Row> pV03,List<WwvFlowGlobal.VcArr2Row> pV04,List<WwvFlowGlobal.VcArr2Row> pV05,List<WwvFlowGlobal.VcArr2Row> pV06,List<WwvFlowGlobal.VcArr2Row> pV07,List<WwvFlowGlobal.VcArr2Row> pV08,List<WwvFlowGlobal.VcArr2Row> pV09,List<WwvFlowGlobal.VcArr2Row> pV10,List<WwvFlowGlobal.VcArr2Row> pV11,List<WwvFlowGlobal.VcArr2Row> pV12,List<WwvFlowGlobal.VcArr2Row> pV13,List<WwvFlowGlobal.VcArr2Row> pV14,List<WwvFlowGlobal.VcArr2Row> pV15,List<WwvFlowGlobal.VcArr2Row> pV16,List<WwvFlowGlobal.VcArr2Row> pV17,List<WwvFlowGlobal.VcArr2Row> pV18,List<WwvFlowGlobal.VcArr2Row> pV19,List<WwvFlowGlobal.VcArr2Row> pV20,List<WwvFlowGlobal.VcArr2Row> pV21,List<WwvFlowGlobal.VcArr2Row> pV22,List<WwvFlowGlobal.VcArr2Row> pV23,List<WwvFlowGlobal.VcArr2Row> pV24,List<WwvFlowGlobal.VcArr2Row> pV25,List<WwvFlowGlobal.VcArr2Row> pV26,List<WwvFlowGlobal.VcArr2Row> pV27,List<WwvFlowGlobal.VcArr2Row> pV28,List<WwvFlowGlobal.VcArr2Row> pV29,List<WwvFlowGlobal.VcArr2Row> pV30,List<WwvFlowGlobal.VcArr2Row> pV31,List<WwvFlowGlobal.VcArr2Row> pV32,List<WwvFlowGlobal.VcArr2Row> pV33,List<WwvFlowGlobal.VcArr2Row> pV34,List<WwvFlowGlobal.VcArr2Row> pV35,List<WwvFlowGlobal.VcArr2Row> pV36,List<WwvFlowGlobal.VcArr2Row> pV37,List<WwvFlowGlobal.VcArr2Row> pV38,List<WwvFlowGlobal.VcArr2Row> pV39,List<WwvFlowGlobal.VcArr2Row> pV40,List<WwvFlowGlobal.VcArr2Row> pV41,List<WwvFlowGlobal.VcArr2Row> pV42,List<WwvFlowGlobal.VcArr2Row> pV43,List<WwvFlowGlobal.VcArr2Row> pV44,List<WwvFlowGlobal.VcArr2Row> pV45,List<WwvFlowGlobal.VcArr2Row> pV46,List<WwvFlowGlobal.VcArr2Row> pV47,List<WwvFlowGlobal.VcArr2Row> pV48,List<WwvFlowGlobal.VcArr2Row> pV49,List<WwvFlowGlobal.VcArr2Row> pV50,List<WwvFlowGlobal.VcArr2Row> pV51,List<WwvFlowGlobal.VcArr2Row> pV52,List<WwvFlowGlobal.VcArr2Row> pV53,List<WwvFlowGlobal.VcArr2Row> pV54,List<WwvFlowGlobal.VcArr2Row> pV55,List<WwvFlowGlobal.VcArr2Row> pV56,List<WwvFlowGlobal.VcArr2Row> pV57,List<WwvFlowGlobal.VcArr2Row> pV58,List<WwvFlowGlobal.VcArr2Row> pV59,List<WwvFlowGlobal.VcArr2Row> pV60,List<WwvFlowGlobal.VcArr2Row> pV61,List<WwvFlowGlobal.VcArr2Row> pV62,List<WwvFlowGlobal.VcArr2Row> pV63,List<WwvFlowGlobal.VcArr2Row> pV64,List<WwvFlowGlobal.VcArr2Row> pV65,List<WwvFlowGlobal.VcArr2Row> pV66,List<WwvFlowGlobal.VcArr2Row> pV67,List<WwvFlowGlobal.VcArr2Row> pV68,List<WwvFlowGlobal.VcArr2Row> pV69,List<WwvFlowGlobal.VcArr2Row> pV70,List<WwvFlowGlobal.VcArr2Row> pV71,List<WwvFlowGlobal.VcArr2Row> pV72,List<WwvFlowGlobal.VcArr2Row> pV73,List<WwvFlowGlobal.VcArr2Row> pV74,List<WwvFlowGlobal.VcArr2Row> pV75,List<WwvFlowGlobal.VcArr2Row> pV76,List<WwvFlowGlobal.VcArr2Row> pV77,List<WwvFlowGlobal.VcArr2Row> pV78,List<WwvFlowGlobal.VcArr2Row> pV79,List<WwvFlowGlobal.VcArr2Row> pV80,List<WwvFlowGlobal.VcArr2Row> pV81,List<WwvFlowGlobal.VcArr2Row> pV82,List<WwvFlowGlobal.VcArr2Row> pV83,List<WwvFlowGlobal.VcArr2Row> pV84,List<WwvFlowGlobal.VcArr2Row> pV85,List<WwvFlowGlobal.VcArr2Row> pV86,List<WwvFlowGlobal.VcArr2Row> pV87,List<WwvFlowGlobal.VcArr2Row> pV88,List<WwvFlowGlobal.VcArr2Row> pV89,List<WwvFlowGlobal.VcArr2Row> pV90,List<WwvFlowGlobal.VcArr2Row> pV91,List<WwvFlowGlobal.VcArr2Row> pV92,List<WwvFlowGlobal.VcArr2Row> pV93,List<WwvFlowGlobal.VcArr2Row> pV94,List<WwvFlowGlobal.VcArr2Row> pV95,List<WwvFlowGlobal.VcArr2Row> pV96,List<WwvFlowGlobal.VcArr2Row> pV97,List<WwvFlowGlobal.VcArr2Row> pV98,List<WwvFlowGlobal.VcArr2Row> pV99,List<WwvFlowGlobal.VcArr2Row> pV100,NString pT01,NString pT02,NString pT03,NString pT04,NString pT05,NString pT06,NString pT07,NString pT08,NString pT09,NString pT10,NString pT11,NString pT12,NString pT13,NString pT14,NString pT15,NString pT16,NString pT17,NString pT18,NString pT19,NString pT20,NString pT21,NString pT22,NString pT23,NString pT24,NString pT25,NString pT26,NString pT27,NString pT28,NString pT29,NString pT30,NString pT31,NString pT32,NString pT33,NString pT34,NString pT35,NString pT36,NString pT37,NString pT38,NString pT39,NString pT40,NString pT41,NString pT42,NString pT43,NString pT44,NString pT45,NString pT46,NString pT47,NString pT48,NString pT49,NString pT50,NString pT51,NString pT52,NString pT53,NString pT54,NString pT55,NString pT56,NString pT57,NString pT58,NString pT59,NString pT60,NString pT61,NString pT62,NString pT63,NString pT64,NString pT65,NString pT66,NString pT67,NString pT68,NString pT69,NString pT70,NString pT71,NString pT72,NString pT73,NString pT74,NString pT75,NString pT76,NString pT77,NString pT78,NString pT79,NString pT80,NString pT81,NString pT82,NString pT83,NString pT84,NString pT85,NString pT86,NString pT87,NString pT88,NString pT89,NString pT90,NString pT91,NString pT92,NString pT93,NString pT94,NString pT95,NString pT96,NString pT97,NString pT98,NString pT99,NString pT100,List<WwvFlowGlobal.VcArr2Row> f01,List<WwvFlowGlobal.VcArr2Row> f02,List<WwvFlowGlobal.VcArr2Row> f03,List<WwvFlowGlobal.VcArr2Row> f04,List<WwvFlowGlobal.VcArr2Row> f05,List<WwvFlowGlobal.VcArr2Row> f06,List<WwvFlowGlobal.VcArr2Row> f07,List<WwvFlowGlobal.VcArr2Row> f08,List<WwvFlowGlobal.VcArr2Row> f09,List<WwvFlowGlobal.VcArr2Row> f10,List<WwvFlowGlobal.VcArr2Row> f11,List<WwvFlowGlobal.VcArr2Row> f12,List<WwvFlowGlobal.VcArr2Row> f13,List<WwvFlowGlobal.VcArr2Row> f14,List<WwvFlowGlobal.VcArr2Row> f15,List<WwvFlowGlobal.VcArr2Row> f16,List<WwvFlowGlobal.VcArr2Row> f17,List<WwvFlowGlobal.VcArr2Row> f18,List<WwvFlowGlobal.VcArr2Row> f19,List<WwvFlowGlobal.VcArr2Row> f20,List<WwvFlowGlobal.VcArr2Row> f21,List<WwvFlowGlobal.VcArr2Row> f22,List<WwvFlowGlobal.VcArr2Row> f23,List<WwvFlowGlobal.VcArr2Row> f24,List<WwvFlowGlobal.VcArr2Row> f25,List<WwvFlowGlobal.VcArr2Row> f26,List<WwvFlowGlobal.VcArr2Row> f27,List<WwvFlowGlobal.VcArr2Row> f28,List<WwvFlowGlobal.VcArr2Row> f29,List<WwvFlowGlobal.VcArr2Row> f30,List<WwvFlowGlobal.VcArr2Row> f31,List<WwvFlowGlobal.VcArr2Row> f32,List<WwvFlowGlobal.VcArr2Row> f33,List<WwvFlowGlobal.VcArr2Row> f34,List<WwvFlowGlobal.VcArr2Row> f35,List<WwvFlowGlobal.VcArr2Row> f36,List<WwvFlowGlobal.VcArr2Row> f37,List<WwvFlowGlobal.VcArr2Row> f38,List<WwvFlowGlobal.VcArr2Row> f39,List<WwvFlowGlobal.VcArr2Row> f40,List<WwvFlowGlobal.VcArr2Row> f41,List<WwvFlowGlobal.VcArr2Row> f42,List<WwvFlowGlobal.VcArr2Row> f43,List<WwvFlowGlobal.VcArr2Row> f44,List<WwvFlowGlobal.VcArr2Row> f45,List<WwvFlowGlobal.VcArr2Row> f46,List<WwvFlowGlobal.VcArr2Row> f47,List<WwvFlowGlobal.VcArr2Row> f48,List<WwvFlowGlobal.VcArr2Row> f49,List<WwvFlowGlobal.VcArr2Row> f50,List<WwvFlowGlobal.VcArr2Row> fcs,NString x01,NString x02,NString x03,NString x04,NString x05,NString x06,NString x07,NString x08,NString x09,NString x10,NString x11,NString x12,NString x13,NString x14,NString x15,NString x16,NString x17,NString x18,NString x19,NString x20,List<WwvFlowGlobal.VcArr2Row> pMap1,List<WwvFlowGlobal.VcArr2Row> pMap2,List<WwvFlowGlobal.VcArr2Row> pMap3,NString pSurveyMap,NString pFlowCurrentMinRow,NString pFlowCurrentMaxRows,NString pFlowCurrentRowsFetched,NString pDebug,NString pTrace,NString pMd5Checksum,NString pPageSubmissionId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.ACCEPT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_REQUEST", pRequest);
//			cmd.addParameter("@P_INSTANCE", pInstance);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_COMPANY", pCompany);
//			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
//			// cmd.addParameter(DbTypes.getTableType("P_ARG_NAMES", "", pArgNames, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ARG_VALUES", "", pArgValues, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ACCEPT_PROCESSING", "", pAcceptProcessing, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V01", "", pV01, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V02", "", pV02, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V03", "", pV03, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V04", "", pV04, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V05", "", pV05, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V06", "", pV06, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V07", "", pV07, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V08", "", pV08, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V09", "", pV09, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V10", "", pV10, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V11", "", pV11, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V12", "", pV12, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V13", "", pV13, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V14", "", pV14, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V15", "", pV15, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V16", "", pV16, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V17", "", pV17, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V18", "", pV18, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V19", "", pV19, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V20", "", pV20, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V21", "", pV21, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V22", "", pV22, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V23", "", pV23, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V24", "", pV24, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V25", "", pV25, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V26", "", pV26, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V27", "", pV27, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V28", "", pV28, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V29", "", pV29, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V30", "", pV30, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V31", "", pV31, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V32", "", pV32, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V33", "", pV33, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V34", "", pV34, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V35", "", pV35, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V36", "", pV36, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V37", "", pV37, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V38", "", pV38, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V39", "", pV39, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V40", "", pV40, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V41", "", pV41, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V42", "", pV42, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V43", "", pV43, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V44", "", pV44, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V45", "", pV45, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V46", "", pV46, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V47", "", pV47, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V48", "", pV48, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V49", "", pV49, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V50", "", pV50, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V51", "", pV51, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V52", "", pV52, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V53", "", pV53, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V54", "", pV54, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V55", "", pV55, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V56", "", pV56, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V57", "", pV57, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V58", "", pV58, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V59", "", pV59, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V60", "", pV60, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V61", "", pV61, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V62", "", pV62, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V63", "", pV63, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V64", "", pV64, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V65", "", pV65, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V66", "", pV66, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V67", "", pV67, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V68", "", pV68, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V69", "", pV69, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V70", "", pV70, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V71", "", pV71, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V72", "", pV72, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V73", "", pV73, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V74", "", pV74, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V75", "", pV75, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V76", "", pV76, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V77", "", pV77, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V78", "", pV78, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V79", "", pV79, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V80", "", pV80, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V81", "", pV81, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V82", "", pV82, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V83", "", pV83, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V84", "", pV84, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V85", "", pV85, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V86", "", pV86, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V87", "", pV87, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V88", "", pV88, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V89", "", pV89, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V90", "", pV90, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V91", "", pV91, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V92", "", pV92, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V93", "", pV93, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V94", "", pV94, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V95", "", pV95, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V96", "", pV96, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V97", "", pV97, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V98", "", pV98, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V99", "", pV99, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_V100", "", pV100, object.class));
//			cmd.addParameter("@P_T01", pT01);
//			cmd.addParameter("@P_T02", pT02);
//			cmd.addParameter("@P_T03", pT03);
//			cmd.addParameter("@P_T04", pT04);
//			cmd.addParameter("@P_T05", pT05);
//			cmd.addParameter("@P_T06", pT06);
//			cmd.addParameter("@P_T07", pT07);
//			cmd.addParameter("@P_T08", pT08);
//			cmd.addParameter("@P_T09", pT09);
//			cmd.addParameter("@P_T10", pT10);
//			cmd.addParameter("@P_T11", pT11);
//			cmd.addParameter("@P_T12", pT12);
//			cmd.addParameter("@P_T13", pT13);
//			cmd.addParameter("@P_T14", pT14);
//			cmd.addParameter("@P_T15", pT15);
//			cmd.addParameter("@P_T16", pT16);
//			cmd.addParameter("@P_T17", pT17);
//			cmd.addParameter("@P_T18", pT18);
//			cmd.addParameter("@P_T19", pT19);
//			cmd.addParameter("@P_T20", pT20);
//			cmd.addParameter("@P_T21", pT21);
//			cmd.addParameter("@P_T22", pT22);
//			cmd.addParameter("@P_T23", pT23);
//			cmd.addParameter("@P_T24", pT24);
//			cmd.addParameter("@P_T25", pT25);
//			cmd.addParameter("@P_T26", pT26);
//			cmd.addParameter("@P_T27", pT27);
//			cmd.addParameter("@P_T28", pT28);
//			cmd.addParameter("@P_T29", pT29);
//			cmd.addParameter("@P_T30", pT30);
//			cmd.addParameter("@P_T31", pT31);
//			cmd.addParameter("@P_T32", pT32);
//			cmd.addParameter("@P_T33", pT33);
//			cmd.addParameter("@P_T34", pT34);
//			cmd.addParameter("@P_T35", pT35);
//			cmd.addParameter("@P_T36", pT36);
//			cmd.addParameter("@P_T37", pT37);
//			cmd.addParameter("@P_T38", pT38);
//			cmd.addParameter("@P_T39", pT39);
//			cmd.addParameter("@P_T40", pT40);
//			cmd.addParameter("@P_T41", pT41);
//			cmd.addParameter("@P_T42", pT42);
//			cmd.addParameter("@P_T43", pT43);
//			cmd.addParameter("@P_T44", pT44);
//			cmd.addParameter("@P_T45", pT45);
//			cmd.addParameter("@P_T46", pT46);
//			cmd.addParameter("@P_T47", pT47);
//			cmd.addParameter("@P_T48", pT48);
//			cmd.addParameter("@P_T49", pT49);
//			cmd.addParameter("@P_T50", pT50);
//			cmd.addParameter("@P_T51", pT51);
//			cmd.addParameter("@P_T52", pT52);
//			cmd.addParameter("@P_T53", pT53);
//			cmd.addParameter("@P_T54", pT54);
//			cmd.addParameter("@P_T55", pT55);
//			cmd.addParameter("@P_T56", pT56);
//			cmd.addParameter("@P_T57", pT57);
//			cmd.addParameter("@P_T58", pT58);
//			cmd.addParameter("@P_T59", pT59);
//			cmd.addParameter("@P_T60", pT60);
//			cmd.addParameter("@P_T61", pT61);
//			cmd.addParameter("@P_T62", pT62);
//			cmd.addParameter("@P_T63", pT63);
//			cmd.addParameter("@P_T64", pT64);
//			cmd.addParameter("@P_T65", pT65);
//			cmd.addParameter("@P_T66", pT66);
//			cmd.addParameter("@P_T67", pT67);
//			cmd.addParameter("@P_T68", pT68);
//			cmd.addParameter("@P_T69", pT69);
//			cmd.addParameter("@P_T70", pT70);
//			cmd.addParameter("@P_T71", pT71);
//			cmd.addParameter("@P_T72", pT72);
//			cmd.addParameter("@P_T73", pT73);
//			cmd.addParameter("@P_T74", pT74);
//			cmd.addParameter("@P_T75", pT75);
//			cmd.addParameter("@P_T76", pT76);
//			cmd.addParameter("@P_T77", pT77);
//			cmd.addParameter("@P_T78", pT78);
//			cmd.addParameter("@P_T79", pT79);
//			cmd.addParameter("@P_T80", pT80);
//			cmd.addParameter("@P_T81", pT81);
//			cmd.addParameter("@P_T82", pT82);
//			cmd.addParameter("@P_T83", pT83);
//			cmd.addParameter("@P_T84", pT84);
//			cmd.addParameter("@P_T85", pT85);
//			cmd.addParameter("@P_T86", pT86);
//			cmd.addParameter("@P_T87", pT87);
//			cmd.addParameter("@P_T88", pT88);
//			cmd.addParameter("@P_T89", pT89);
//			cmd.addParameter("@P_T90", pT90);
//			cmd.addParameter("@P_T91", pT91);
//			cmd.addParameter("@P_T92", pT92);
//			cmd.addParameter("@P_T93", pT93);
//			cmd.addParameter("@P_T94", pT94);
//			cmd.addParameter("@P_T95", pT95);
//			cmd.addParameter("@P_T96", pT96);
//			cmd.addParameter("@P_T97", pT97);
//			cmd.addParameter("@P_T98", pT98);
//			cmd.addParameter("@P_T99", pT99);
//			cmd.addParameter("@P_T100", pT100);
//			// cmd.addParameter(DbTypes.getTableType("F01", "", f01, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F02", "", f02, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F03", "", f03, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F04", "", f04, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F05", "", f05, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F06", "", f06, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F07", "", f07, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F08", "", f08, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F09", "", f09, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F10", "", f10, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F11", "", f11, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F12", "", f12, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F13", "", f13, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F14", "", f14, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F15", "", f15, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F16", "", f16, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F17", "", f17, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F18", "", f18, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F19", "", f19, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F20", "", f20, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F21", "", f21, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F22", "", f22, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F23", "", f23, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F24", "", f24, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F25", "", f25, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F26", "", f26, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F27", "", f27, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F28", "", f28, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F29", "", f29, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F30", "", f30, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F31", "", f31, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F32", "", f32, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F33", "", f33, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F34", "", f34, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F35", "", f35, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F36", "", f36, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F37", "", f37, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F38", "", f38, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F39", "", f39, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F40", "", f40, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F41", "", f41, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F42", "", f42, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F43", "", f43, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F44", "", f44, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F45", "", f45, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F46", "", f46, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F47", "", f47, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F48", "", f48, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F49", "", f49, object.class));
//			// cmd.addParameter(DbTypes.getTableType("F50", "", f50, object.class));
//			// cmd.addParameter(DbTypes.getTableType("FCS", "", fcs, object.class));
//			cmd.addParameter("@X01", x01);
//			cmd.addParameter("@X02", x02);
//			cmd.addParameter("@X03", x03);
//			cmd.addParameter("@X04", x04);
//			cmd.addParameter("@X05", x05);
//			cmd.addParameter("@X06", x06);
//			cmd.addParameter("@X07", x07);
//			cmd.addParameter("@X08", x08);
//			cmd.addParameter("@X09", x09);
//			cmd.addParameter("@X10", x10);
//			cmd.addParameter("@X11", x11);
//			cmd.addParameter("@X12", x12);
//			cmd.addParameter("@X13", x13);
//			cmd.addParameter("@X14", x14);
//			cmd.addParameter("@X15", x15);
//			cmd.addParameter("@X16", x16);
//			cmd.addParameter("@X17", x17);
//			cmd.addParameter("@X18", x18);
//			cmd.addParameter("@X19", x19);
//			cmd.addParameter("@X20", x20);
//			// cmd.addParameter(DbTypes.getTableType("P_MAP1", "", pMap1, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MAP2", "", pMap2, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MAP3", "", pMap3, object.class));
//			cmd.addParameter("@P_SURVEY_MAP", pSurveyMap);
//			cmd.addParameter("@P_FLOW_CURRENT_MIN_ROW", pFlowCurrentMinRow);
//			cmd.addParameter("@P_FLOW_CURRENT_MAX_ROWS", pFlowCurrentMaxRows);
//			cmd.addParameter("@P_FLOW_CURRENT_ROWS_FETCHED", pFlowCurrentRowsFetched);
//			cmd.addParameter("@P_DEBUG", pDebug);
//			cmd.addParameter("@P_TRACE", pTrace);
//			cmd.addParameter("@P_MD5_CHECKSUM", pMd5Checksum);
//			cmd.addParameter("@P_PAGE_SUBMISSION_ID", pPageSubmissionId);
//				
//			cmd.execute();
//
//
//		}
		
		public static void clearAppCache(NString pAppId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CLEAR_APP_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APP_ID", pAppId);
				
			cmd.execute();


		}
		
		public static void clearFlowCache(NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CLEAR_FLOW_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void clearPageCache(NNumber pFlowPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CLEAR_PAGE_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_PAGE_ID", pFlowPageId);
				
			cmd.execute();


		}
		
//		public static void clearPageCaches(List<WwvFlowGlobal.VcArr2Row> pFlowPageId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CLEAR_PAGE_CACHES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_FLOW_PAGE_ID", "", pFlowPageId, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void clearUserCache() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CLEAR_USER_CACHE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FconvertFlowAliasToId(NString pFlowAliasOrId,NNumber pSecurityGroupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.CONVERT_FLOW_ALIAS_TO_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FLOW_ALIAS_OR_ID", pFlowAliasOrId);
			cmd.addParameter("@P_SECURITY_GROUP_ID", pSecurityGroupId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void debug(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DEBUG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();


		}
		
		public static NString FdoSubstitutions(NString pString,NString pSubType,NBool pPerformOracleSubstitutions,NBool pPrintResults) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DO_SUBSTITUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_SUB_TYPE", pSubType);
			cmd.addParameter("@P_PERFORM_ORACLE_SUBSTITUTIONS", pPerformOracleSubstitutions);
			cmd.addParameter("@P_PRINT_RESULTS", pPrintResults);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FdoTemplateSubstitutions(NString pString,NString pOnload) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DO_TEMPLATE_SUBSTITUTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
			cmd.addParameter("@P_ONLOAD", pOnload);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void drawBodyClose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DRAW_BODY_CLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void drawBodyOpen(NString pTitle,NString pWidth,NString pBoxBorder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DRAW_BODY_OPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_BOX_BORDER", pBoxBorder);
				
			cmd.execute();


		}
		
		public static NString FdrawIconNavigationBar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.DRAW_ICON_NAVIGATION_BAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchAppItem(NString pItem,NNumber pApp,NNumber pInstance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FETCH_APP_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_APP", pApp);
			cmd.addParameter("@P_INSTANCE", pInstance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchFlowItem(NString pItem,NNumber pFlow,NNumber pInstance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FETCH_FLOW_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_FLOW", pFlow);
			cmd.addParameter("@P_INSTANCE", pInstance);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchItem(NString pItemName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FETCH_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchValue(NString pItemId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FETCH_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ITEM_ID", pItemId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber findItemId(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FIND_ITEM_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString findItemName(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.FIND_ITEM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetBrowserVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_BROWSER_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCompanyName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_COMPANY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetCurrentFlowSgid(NNumber pFlowId,NNumber pCompanyId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_CURRENT_FLOW_SGID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_COMPANY_ID", pCompanyId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetCustomAuthLoginUrl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_CUSTOM_AUTH_LOGIN_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNextSessionId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_NEXT_SESSION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNlsGroupSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_NLS_GROUP_SEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetPageAlias() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_PAGE_ALIAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetSgid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_SGID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetTranslatedAppId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_TRANSLATED_APP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetUniqueId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.GET_UNIQUE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void help(NString pRequest,NString pFlowId,NString pFlowStepId,NString pShowItemHelp,NString pShowRegions,NString pBeforePageHtml,NString pAfterPageHtml,NString pBeforeRegionHtml,NString pAfterRegionHtml,NString pBeforePromptHtml,NString pAfterPromptHtml,NString pBeforeItemHtml,NString pAfterItemHtml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.HELP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST", pRequest);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
			cmd.addParameter("@P_SHOW_ITEM_HELP", pShowItemHelp);
			cmd.addParameter("@P_SHOW_REGIONS", pShowRegions);
			cmd.addParameter("@P_BEFORE_PAGE_HTML", pBeforePageHtml);
			cmd.addParameter("@P_AFTER_PAGE_HTML", pAfterPageHtml);
			cmd.addParameter("@P_BEFORE_REGION_HTML", pBeforeRegionHtml);
			cmd.addParameter("@P_AFTER_REGION_HTML", pAfterRegionHtml);
			cmd.addParameter("@P_BEFORE_PROMPT_HTML", pBeforePromptHtml);
			cmd.addParameter("@P_AFTER_PROMPT_HTML", pAfterPromptHtml);
			cmd.addParameter("@P_BEFORE_ITEM_HTML", pBeforeItemHtml);
			cmd.addParameter("@P_AFTER_ITEM_HTML", pAfterItemHtml);
				
			cmd.execute();


		}
		
		public static NBool FisCustomAuthPage() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.IS_CUSTOM_AUTH_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void nullPageCache(NNumber pFlowPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.NULL_PAGE_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_PAGE_ID", pFlowPageId);
				
			cmd.execute();


		}
		
//		public static void nullPageCaches(List<WwvFlowGlobal.VcArr2Row> pFlowPageId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.NULL_PAGE_CACHES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_FLOW_PAGE_ID", "", pFlowPageId, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void nullStepCache(NNumber pFlowStepId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.NULL_STEP_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
				
			cmd.execute();


		}
		
//		public static void nullStepCaches(List<WwvFlowGlobal.VcArr2Row> pFlowStepId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.NULL_STEP_CACHES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_FLOW_STEP_ID", "", pFlowStepId, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static NString FpaintButtons(NString pPosition,NString pPlugId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.PAINT_BUTTONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_PLUG_ID", pPlugId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FpaintFormopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.PAINT_FORMOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FprocessState(NNumber pProcessId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.PROCESS_STATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROCESS_ID", pProcessId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FpublicRoleCheck(NString pRole,NString pComponent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.PUBLIC_ROLE_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_COMPONENT", pComponent);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FpublicSecurityCheck(NString pSecurityScheme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.PUBLIC_SECURITY_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SECURITY_SCHEME", pSecurityScheme);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FreplaceCgiEnv(NString pIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.REPLACE_CGI_ENV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IN", pIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void resetGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetGNlsDateFormat() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_G_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetGNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_G_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void resetPageProcess(NNumber pProcessId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_PAGE_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_ID", pProcessId);
				
			cmd.execute();


		}
		
		public static void resetPageProcessess(NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_PAGE_PROCESSESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void resetSecurityCheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.RESET_SECURITY_CHECK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void s(NString p) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.S", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P", p);
				
			cmd.execute();


		}
		
		public static void saveInSubstitutionCache(NString pName,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SAVE_IN_SUBSTITUTION_CACHE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void setGBaseHref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SET_G_BASE_HREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setGNlsDateFormat() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SET_G_NLS_DATE_FORMAT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setGNlsDecimalSeparator() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SET_G_NLS_DECIMAL_SEPARATOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void show(NString pRequest,NString pInstance,NString pFlowId,NString pFlowStepId,NString pDebug,List<WwvFlowGlobal.VcArr2Row> pArgNames,List<WwvFlowGlobal.VcArr2Row> pArgValues,List<WwvFlowGlobal.VcArr2Row> pClearCache,NString pBoxBorder,NString pPrinterFriendly,NString pTrace,NNumber pCompany,NString pMd5Checksum,NString pLastButtonPressed,NString pArgName,NString pArgValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SHOW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_REQUEST", pRequest);
//			cmd.addParameter("@P_INSTANCE", pInstance);
//			cmd.addParameter("@P_FLOW_ID", pFlowId);
//			cmd.addParameter("@P_FLOW_STEP_ID", pFlowStepId);
//			cmd.addParameter("@P_DEBUG", pDebug);
//			// cmd.addParameter(DbTypes.getTableType("P_ARG_NAMES", "", pArgNames, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ARG_VALUES", "", pArgValues, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CLEAR_CACHE", "", pClearCache, object.class));
//			cmd.addParameter("@P_BOX_BORDER", pBoxBorder);
//			cmd.addParameter("@P_PRINTER_FRIENDLY", pPrinterFriendly);
//			cmd.addParameter("@P_TRACE", pTrace);
//			cmd.addParameter("@P_COMPANY", pCompany);
//			cmd.addParameter("@P_MD5_CHECKSUM", pMd5Checksum);
//			cmd.addParameter("@P_LAST_BUTTON_PRESSED", pLastButtonPressed);
//			cmd.addParameter("@P_ARG_NAME", pArgName);
//			cmd.addParameter("@P_ARG_VALUE", pArgValue);
//				
//			cmd.execute();
//
//
//		}
		
		public static void showErrorMessage(NString pMessage,NString pFooter,NString pQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.SHOW_ERROR_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_FOOTER", pFooter);
			cmd.addParameter("@P_QUERY", pQuery);
				
			cmd.execute();


		}
		
		public static NString FtabTitle(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.TAB_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FtrimSql(NString pSql,NBool pEndsInSemicolon,NBool pDoSubstitutions) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.TRIM_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_ENDS_IN_SEMICOLON", pEndsInSemicolon);
			cmd.addParameter("@P_DO_SUBSTITUTIONS", pDoSubstitutions);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void updateCacheWithWrite(NString pName,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW.UPDATE_CACHE_WITH_WRITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
	
	
	
}
