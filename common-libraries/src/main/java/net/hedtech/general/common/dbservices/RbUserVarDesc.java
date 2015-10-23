package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbUserVarDesc {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(UserVarDescRecRow recOne,UserVarDescRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, UserVarDescRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, UserVarDescRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NString pUserId,NString pDataOrigin,NString pDesc1,NString pDesc2,NString pDesc3,NString pDesc4,NString pDesc5,NString pDesc6,NString pDesc7,NString pDesc8,NString pDesc9,NString pDesc10,NString pDesc11,NString pDesc12,NString pDesc13,NString pDesc14,NString pDesc15,NString pDesc16,NString pDesc17,NString pDesc18,NString pDesc19,NString pDesc20,NString pDesc21,NString pDesc22,NString pDesc23,NString pDesc24,NString pDesc25,NString pDesc26,NString pDesc27,NString pDesc28,NString pDesc29,NString pDesc30,NString pDesc31,NString pDesc32,NString pDesc33,NString pDesc34,NString pDesc35,NString pDesc36,NString pDesc37,NString pDesc38,NString pDesc39,NString pDesc40,NString pDesc41,NString pDesc42,NString pDesc43,NString pDesc44,NString pDesc45,NString pDesc46,NString pDesc47,NString pDesc48,NString pDesc49,NString pDesc50,NString pDesc51,NString pDesc52,NString pDesc53,NString pDesc54,NString pDesc55,NString pDesc56,NString pDesc57,NString pDesc58,NString pDesc59,NString pDesc60,NString pDesc61,NString pDesc62,NString pDesc63,NString pDesc64,NString pDesc65,NString pDesc66,NString pDesc67,NString pDesc68,NString pDesc69,NString pDesc70,NString pDesc71,NString pDesc72,NString pDesc73,NString pDesc74,NString pDesc75,NString pDesc76,NString pDesc77,NString pDesc78,NString pDesc79,NString pDesc80,NString pDesc81,NString pDesc82,NString pDesc83,NString pDesc84,NString pDesc85,NString pDesc86,NString pDesc87,NString pDesc88,NString pDesc89,NString pDesc90,NString pDesc91,NString pDesc92,NString pDesc93,NString pDesc94,NString pDesc95,NString pDesc96,NString pDesc97,NString pDesc98,NString pDesc99,NString pDesc100,NString pDesc101,NString pDesc102,NString pDesc103,NString pDesc104,NString pDesc105,NString pDesc106,NString pDesc107,NString pDesc108,NString pDesc109,NString pDesc110,NString pDesc111,NString pDesc112,NString pDesc113,NString pDesc114,NString pDesc115,NString pDesc116,NString pDesc117,NString pDesc118,NString pDesc119,NString pDesc120,NString pDesc121,NString pDesc122,NString pDesc123,NString pDesc124,NString pDesc125,NString pDesc126,NString pDesc127,NString pDesc128,NString pDesc129,NString pDesc130,NString pDesc131,NString pDesc132,NString pDesc133,NString pDesc134,NString pDesc135,NString pDesc136,NString pDesc137,NString pDesc138,NString pDesc139,NString pDesc140,NString pDesc141,NString pDesc142,NString pDesc143,NString pDesc144,NString pDesc145,NString pDesc146,NString pDesc147,NString pDesc148,NString pDesc149,NString pDesc150,NString pDesc151,NString pDesc152,NString pDesc153,NString pDesc154,NString pDesc155,NString pDesc156,NString pDesc157,NString pDesc158,NString pDesc159,NString pDesc160,NString pDesc161,NString pDesc162,NString pDesc163,NString pDesc164,NString pDesc165,NString pDesc166,NString pDesc167,NString pDesc168,NString pDesc169,NString pDesc170,NString pDesc171,NString pDesc172,NString pDesc173,NString pDesc174,NString pDesc175,NString pDesc176,NString pDesc177,NString pDesc178,NString pDesc179,NString pDesc180,NString pDesc181,NString pDesc182,NString pDesc183,NString pDesc184,NString pDesc185,NString pDesc186,NString pDesc187,NString pDesc188,NString pDesc189,NString pDesc190,NString pDesc191,NString pDesc192,NString pDesc193,NString pDesc194,NString pDesc195,NString pDesc196,NString pDesc197,NString pDesc198,NString pDesc199,NString pDesc200,NString pDesc201,NString pDesc202,NString pDesc203,NString pDesc204,NString pDesc205,NString pDesc206,NString pDesc207,NString pDesc208,NString pDesc209,NString pDesc210,NString pDesc211,NString pDesc212,NString pDesc213,NString pDesc214,NString pDesc215,NString pDesc216,NString pDesc217,NString pDesc218,NString pDesc219,NString pDesc220,NString pDesc221,NString pDesc222,NString pDesc223,NString pDesc224,NString pDesc225,NString pDesc226,NString pDesc227,NString pDesc228,NString pDesc229,NString pDesc230,NString pDesc231,NString pDesc232,NString pDesc233,NString pDesc234,NString pDesc235,NString pDesc236,NString pDesc237,NString pDesc238,NString pDesc239,NString pDesc240,NString pDesc241,NString pDesc242,NString pDesc243,NString pDesc244,NString pDesc245,NString pDesc246,NString pDesc247,NString pDesc248,NString pDesc249,NString pDesc250,NString pDesc251,NString pDesc252,NString pDesc253,NString pDesc254,NString pDesc255,NString pDesc256,NString pDesc257,NString pDesc258,NString pDesc259,NString pDesc260,NString pDesc261,NString pDesc262,NString pDesc263,NString pDesc264,NString pDesc265,NString pDesc266,NString pDesc267,NString pDesc268,NString pDesc269,NString pDesc270,NString pDesc271,NString pDesc272,NString pDesc273,NString pDesc274,NString pDesc275,NString pDesc276,NString pDesc277,NString pDesc278,NString pDesc279,NString pDesc280,NString pDesc281,NString pDesc282,NString pDesc283,NString pDesc284,NString pDesc285,NString pDesc286,NString pDesc287,NString pDesc288,NString pDesc289,NString pDesc290,NString pDesc291,NString pDesc292,NString pDesc293,NString pDesc294,NString pDesc295,NString pDesc296,NString pDesc297,NString pDesc298,NString pDesc299,NString pDesc300,NString pDesc301,NString pDesc302,NString pDesc303,NString pDesc304,NString pDesc305,NString pDesc306,NString pDesc307,NString pDesc308,NString pDesc309,NString pDesc310,NString pDesc311,NString pDesc312,NString pDesc313,NString pDesc314,NString pDesc315,NString pDesc316,NString pDesc317,NString pDesc318,NString pDesc319,NString pDesc320,NString pDesc321,NString pDesc322,NString pDesc323,NString pDesc324,NString pDesc325,NString pDesc326,NString pDesc327,NString pDesc328,NString pDesc329,NString pDesc330,NString pDesc331,NString pDesc332,NString pDesc333,NString pDesc334,NString pDesc335,NString pDesc336,NString pDesc337,NString pDesc338,NString pDesc339,NString pDesc340,NString pDesc341,NString pDesc342,NString pDesc343,NString pDesc344,NString pDesc345,NString pDesc346,NString pDesc347,NString pDesc348,NString pDesc349,NString pDesc350,NString pDesc351,NString pDesc352,NString pDesc353,NString pDesc354,NString pDesc355,NString pDesc356,NString pDesc357,NString pDesc358,NString pDesc359,NString pDesc360,NString pAssocCssQuest1,NString pAssocCssQuest2,NString pAssocCssQuest3,NString pAssocCssQuest4,NString pAssocCssQuest5,NString pAssocCssQuest6,NString pAssocCssQuest7,NString pAssocCssQuest8,NString pAssocCssQuest9,NString pAssocCssQuest10,NString pAssocCssQuest11,NString pAssocCssQuest12,NString pAssocCssQuest13,NString pAssocCssQuest14,NString pAssocCssQuest15,NString pAssocCssQuest16,NString pAssocCssQuest17,NString pAssocCssQuest18,NString pAssocCssQuest19,NString pAssocCssQuest20,NString pAssocCssQuest21,NString pAssocCssQuest22,NString pAssocCssQuest23,NString pAssocCssQuest24,NString pAssocCssQuest25,NString pAssocCssQuest26,NString pAssocCssQuest27,NString pAssocCssQuest28,NString pAssocCssQuest29,NString pAssocCssQuest30,NString pAssocCssQuest31,NString pAssocCssQuest32,NString pAssocCssQuest33,NString pAssocCssQuest34,NString pAssocCssQuest35,NString pAssocCssQuest36,NString pAssocCssQuest37,NString pAssocCssQuest38,NString pAssocCssQuest39,NString pAssocCssQuest40,NString pAssocCssQuest41,NString pAssocCssQuest42,NString pAssocCssQuest43,NString pAssocCssQuest44,NString pAssocCssQuest45,NString pAssocCssQuest46,NString pAssocCssQuest47,NString pAssocCssQuest48,NString pAssocCssQuest49,NString pAssocCssQuest50,NString pAssocCssQuest51,NString pAssocCssQuest52,NString pAssocCssQuest53,NString pAssocCssQuest54,NString pAssocCssQuest55,NString pAssocCssQuest56,NString pAssocCssQuest57,NString pAssocCssQuest58,NString pAssocCssQuest59,NString pAssocCssQuest60,NString pAssocCssQuest61,NString pAssocCssQuest62,NString pAssocCssQuest63,NString pAssocCssQuest64,NString pAssocCssQuest65,NString pAssocCssQuest66,NString pAssocCssQuest67,NString pAssocCssQuest68,NString pAssocCssQuest69,NString pAssocCssQuest70,NString pAssocCssQuest71,NString pAssocCssQuest72,NString pAssocCssQuest73,NString pAssocCssQuest74,NString pAssocCssQuest75,NString pAssocCssQuest76,NString pAssocCssQuest77,NString pAssocCssQuest78,NString pAssocCssQuest79,NString pAssocCssQuest80,NString pAssocCssQuest81,NString pAssocCssQuest82,NString pAssocCssQuest83,NString pAssocCssQuest84,NString pAssocCssQuest85,NString pAssocCssQuest86,NString pAssocCssQuest87,NString pAssocCssQuest88,NString pAssocCssQuest89,NString pAssocCssQuest90,NString pAssocCssQuest91,NString pAssocCssQuest92,NString pAssocCssQuest93,NString pAssocCssQuest94,NString pAssocCssQuest95,NString pAssocCssQuest96,NString pAssocCssQuest97,NString pAssocCssQuest98,NString pAssocCssQuest99,NString pAssocCssQuest100,NString pAssocCssQuest101,NString pAssocCssQuest102,NString pAssocCssQuest103,NString pAssocCssQuest104,NString pAssocCssQuest105,NString pAssocCssQuest106,NString pAssocCssQuest107,NString pAssocCssQuest108,NString pAssocCssQuest109,NString pAssocCssQuest110,NString pAssocCssQuest111,NString pAssocCssQuest112,NString pAssocCssQuest113,NString pAssocCssQuest114,NString pAssocCssQuest115,NString pAssocCssQuest116,NString pAssocCssQuest117,NString pAssocCssQuest118,NString pAssocCssQuest119,NString pAssocCssQuest120,NString pAssocCssQuest121,NString pAssocCssQuest122,NString pAssocCssQuest123,NString pAssocCssQuest124,NString pAssocCssQuest125,NString pAssocCssQuest126,NString pAssocCssQuest127,NString pAssocCssQuest128,NString pAssocCssQuest129,NString pAssocCssQuest130,NString pAssocCssQuest131,NString pAssocCssQuest132,NString pAssocCssQuest133,NString pAssocCssQuest134,NString pAssocCssQuest135,NString pAssocCssQuest136,NString pAssocCssQuest137,NString pAssocCssQuest138,NString pAssocCssQuest139,NString pAssocCssQuest140,NString pAssocCssQuest141,NString pAssocCssQuest142,NString pAssocCssQuest143,NString pAssocCssQuest144,NString pAssocCssQuest145,NString pAssocCssQuest146,NString pAssocCssQuest147,NString pAssocCssQuest148,NString pAssocCssQuest149,NString pAssocCssQuest150,NString pAssocCssQuest151,NString pAssocCssQuest152,NString pAssocCssQuest153,NString pAssocCssQuest154,NString pAssocCssQuest155,NString pAssocCssQuest156,NString pAssocCssQuest157,NString pAssocCssQuest158,NString pAssocCssQuest159,NString pAssocCssQuest160,NString pAssocCssQuest161,NString pAssocCssQuest162,NString pAssocCssQuest163,NString pAssocCssQuest164,NString pAssocCssQuest165,NString pAssocCssQuest166,NString pAssocCssQuest167,NString pAssocCssQuest168,NString pAssocCssQuest169,NString pAssocCssQuest170,NString pAssocCssQuest171,NString pAssocCssQuest172,NString pAssocCssQuest173,NString pAssocCssQuest174,NString pAssocCssQuest175,NString pAssocCssQuest176,NString pAssocCssQuest177,NString pAssocCssQuest178,NString pAssocCssQuest179,NString pAssocCssQuest180,NString pAssocCssQuest181,NString pAssocCssQuest182,NString pAssocCssQuest183,NString pAssocCssQuest184,NString pAssocCssQuest185,NString pAssocCssQuest186,NString pAssocCssQuest187,NString pAssocCssQuest188,NString pAssocCssQuest189,NString pAssocCssQuest190,NString pAssocCssQuest191,NString pAssocCssQuest192,NString pAssocCssQuest193,NString pAssocCssQuest194,NString pAssocCssQuest195,NString pAssocCssQuest196,NString pAssocCssQuest197,NString pAssocCssQuest198,NString pAssocCssQuest199,NString pAssocCssQuest200,NString pAssocCssQuest201,NString pAssocCssQuest202,NString pAssocCssQuest203,NString pAssocCssQuest204,NString pAssocCssQuest205,NString pAssocCssQuest206,NString pAssocCssQuest207,NString pAssocCssQuest208,NString pAssocCssQuest209,NString pAssocCssQuest210,NString pAssocCssQuest211,NString pAssocCssQuest212,NString pAssocCssQuest213,NString pAssocCssQuest214,NString pAssocCssQuest215,NString pAssocCssQuest216,NString pAssocCssQuest217,NString pAssocCssQuest218,NString pAssocCssQuest219,NString pAssocCssQuest220,NString pAssocCssQuest221,NString pAssocCssQuest222,NString pAssocCssQuest223,NString pAssocCssQuest224,NString pAssocCssQuest225,NString pAssocCssQuest226,NString pAssocCssQuest227,NString pAssocCssQuest228,NString pAssocCssQuest229,NString pAssocCssQuest230,NString pAssocCssQuest231,NString pAssocCssQuest232,NString pAssocCssQuest233,NString pAssocCssQuest234,NString pAssocCssQuest235,NString pAssocCssQuest236,NString pAssocCssQuest237,NString pAssocCssQuest238,NString pAssocCssQuest239,NString pAssocCssQuest240,NString pAssocCssQuest241,NString pAssocCssQuest242,NString pAssocCssQuest243,NString pAssocCssQuest244,NString pAssocCssQuest245,NString pAssocCssQuest246,NString pAssocCssQuest247,NString pAssocCssQuest248,NString pAssocCssQuest249,NString pAssocCssQuest250,NString pAssocCssQuest251,NString pAssocCssQuest252,NString pAssocCssQuest253,NString pAssocCssQuest254,NString pAssocCssQuest255,NString pAssocCssQuest256,NString pAssocCssQuest257,NString pAssocCssQuest258,NString pAssocCssQuest259,NString pAssocCssQuest260,NString pAssocCssQuest261,NString pAssocCssQuest262,NString pAssocCssQuest263,NString pAssocCssQuest264,NString pAssocCssQuest265,NString pAssocCssQuest266,NString pAssocCssQuest267,NString pAssocCssQuest268,NString pAssocCssQuest269,NString pAssocCssQuest270,NString pAssocCssQuest271,NString pAssocCssQuest272,NString pAssocCssQuest273,NString pAssocCssQuest274,NString pAssocCssQuest275,NString pAssocCssQuest276,NString pAssocCssQuest277,NString pAssocCssQuest278,NString pAssocCssQuest279,NString pAssocCssQuest280,NString pAssocCssQuest281,NString pAssocCssQuest282,NString pAssocCssQuest283,NString pAssocCssQuest284,NString pAssocCssQuest285,NString pAssocCssQuest286,NString pAssocCssQuest287,NString pAssocCssQuest288,NString pAssocCssQuest289,NString pAssocCssQuest290,NString pAssocCssQuest291,NString pAssocCssQuest292,NString pAssocCssQuest293,NString pAssocCssQuest294,NString pAssocCssQuest295,NString pAssocCssQuest296,NString pAssocCssQuest297,NString pAssocCssQuest298,NString pAssocCssQuest299,NString pAssocCssQuest300,NString pAssocCssQuest301,NString pAssocCssQuest302,NString pAssocCssQuest303,NString pAssocCssQuest304,NString pAssocCssQuest305,NString pAssocCssQuest306,NString pAssocCssQuest307,NString pAssocCssQuest308,NString pAssocCssQuest309,NString pAssocCssQuest310,NString pAssocCssQuest311,NString pAssocCssQuest312,NString pAssocCssQuest313,NString pAssocCssQuest314,NString pAssocCssQuest315,NString pAssocCssQuest316,NString pAssocCssQuest317,NString pAssocCssQuest318,NString pAssocCssQuest319,NString pAssocCssQuest320,NString pAssocCssQuest321,NString pAssocCssQuest322,NString pAssocCssQuest323,NString pAssocCssQuest324,NString pAssocCssQuest325,NString pAssocCssQuest326,NString pAssocCssQuest327,NString pAssocCssQuest328,NString pAssocCssQuest329,NString pAssocCssQuest330,NString pAssocCssQuest331,NString pAssocCssQuest332,NString pAssocCssQuest333,NString pAssocCssQuest334,NString pAssocCssQuest335,NString pAssocCssQuest336,NString pAssocCssQuest337,NString pAssocCssQuest338,NString pAssocCssQuest339,NString pAssocCssQuest340,NString pAssocCssQuest341,NString pAssocCssQuest342,NString pAssocCssQuest343,NString pAssocCssQuest344,NString pAssocCssQuest345,NString pAssocCssQuest346,NString pAssocCssQuest347,NString pAssocCssQuest348,NString pAssocCssQuest349,NString pAssocCssQuest350,NString pAssocCssQuest351,NString pAssocCssQuest352,NString pAssocCssQuest353,NString pAssocCssQuest354,NString pAssocCssQuest355,NString pAssocCssQuest356,NString pAssocCssQuest357,NString pAssocCssQuest358,NString pAssocCssQuest359,NString pAssocCssQuest360,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_DESC_1", pDesc1);
//			cmd.addParameter("@P_DESC_2", pDesc2);
//			cmd.addParameter("@P_DESC_3", pDesc3);
//			cmd.addParameter("@P_DESC_4", pDesc4);
//			cmd.addParameter("@P_DESC_5", pDesc5);
//			cmd.addParameter("@P_DESC_6", pDesc6);
//			cmd.addParameter("@P_DESC_7", pDesc7);
//			cmd.addParameter("@P_DESC_8", pDesc8);
//			cmd.addParameter("@P_DESC_9", pDesc9);
//			cmd.addParameter("@P_DESC_10", pDesc10);
//			cmd.addParameter("@P_DESC_11", pDesc11);
//			cmd.addParameter("@P_DESC_12", pDesc12);
//			cmd.addParameter("@P_DESC_13", pDesc13);
//			cmd.addParameter("@P_DESC_14", pDesc14);
//			cmd.addParameter("@P_DESC_15", pDesc15);
//			cmd.addParameter("@P_DESC_16", pDesc16);
//			cmd.addParameter("@P_DESC_17", pDesc17);
//			cmd.addParameter("@P_DESC_18", pDesc18);
//			cmd.addParameter("@P_DESC_19", pDesc19);
//			cmd.addParameter("@P_DESC_20", pDesc20);
//			cmd.addParameter("@P_DESC_21", pDesc21);
//			cmd.addParameter("@P_DESC_22", pDesc22);
//			cmd.addParameter("@P_DESC_23", pDesc23);
//			cmd.addParameter("@P_DESC_24", pDesc24);
//			cmd.addParameter("@P_DESC_25", pDesc25);
//			cmd.addParameter("@P_DESC_26", pDesc26);
//			cmd.addParameter("@P_DESC_27", pDesc27);
//			cmd.addParameter("@P_DESC_28", pDesc28);
//			cmd.addParameter("@P_DESC_29", pDesc29);
//			cmd.addParameter("@P_DESC_30", pDesc30);
//			cmd.addParameter("@P_DESC_31", pDesc31);
//			cmd.addParameter("@P_DESC_32", pDesc32);
//			cmd.addParameter("@P_DESC_33", pDesc33);
//			cmd.addParameter("@P_DESC_34", pDesc34);
//			cmd.addParameter("@P_DESC_35", pDesc35);
//			cmd.addParameter("@P_DESC_36", pDesc36);
//			cmd.addParameter("@P_DESC_37", pDesc37);
//			cmd.addParameter("@P_DESC_38", pDesc38);
//			cmd.addParameter("@P_DESC_39", pDesc39);
//			cmd.addParameter("@P_DESC_40", pDesc40);
//			cmd.addParameter("@P_DESC_41", pDesc41);
//			cmd.addParameter("@P_DESC_42", pDesc42);
//			cmd.addParameter("@P_DESC_43", pDesc43);
//			cmd.addParameter("@P_DESC_44", pDesc44);
//			cmd.addParameter("@P_DESC_45", pDesc45);
//			cmd.addParameter("@P_DESC_46", pDesc46);
//			cmd.addParameter("@P_DESC_47", pDesc47);
//			cmd.addParameter("@P_DESC_48", pDesc48);
//			cmd.addParameter("@P_DESC_49", pDesc49);
//			cmd.addParameter("@P_DESC_50", pDesc50);
//			cmd.addParameter("@P_DESC_51", pDesc51);
//			cmd.addParameter("@P_DESC_52", pDesc52);
//			cmd.addParameter("@P_DESC_53", pDesc53);
//			cmd.addParameter("@P_DESC_54", pDesc54);
//			cmd.addParameter("@P_DESC_55", pDesc55);
//			cmd.addParameter("@P_DESC_56", pDesc56);
//			cmd.addParameter("@P_DESC_57", pDesc57);
//			cmd.addParameter("@P_DESC_58", pDesc58);
//			cmd.addParameter("@P_DESC_59", pDesc59);
//			cmd.addParameter("@P_DESC_60", pDesc60);
//			cmd.addParameter("@P_DESC_61", pDesc61);
//			cmd.addParameter("@P_DESC_62", pDesc62);
//			cmd.addParameter("@P_DESC_63", pDesc63);
//			cmd.addParameter("@P_DESC_64", pDesc64);
//			cmd.addParameter("@P_DESC_65", pDesc65);
//			cmd.addParameter("@P_DESC_66", pDesc66);
//			cmd.addParameter("@P_DESC_67", pDesc67);
//			cmd.addParameter("@P_DESC_68", pDesc68);
//			cmd.addParameter("@P_DESC_69", pDesc69);
//			cmd.addParameter("@P_DESC_70", pDesc70);
//			cmd.addParameter("@P_DESC_71", pDesc71);
//			cmd.addParameter("@P_DESC_72", pDesc72);
//			cmd.addParameter("@P_DESC_73", pDesc73);
//			cmd.addParameter("@P_DESC_74", pDesc74);
//			cmd.addParameter("@P_DESC_75", pDesc75);
//			cmd.addParameter("@P_DESC_76", pDesc76);
//			cmd.addParameter("@P_DESC_77", pDesc77);
//			cmd.addParameter("@P_DESC_78", pDesc78);
//			cmd.addParameter("@P_DESC_79", pDesc79);
//			cmd.addParameter("@P_DESC_80", pDesc80);
//			cmd.addParameter("@P_DESC_81", pDesc81);
//			cmd.addParameter("@P_DESC_82", pDesc82);
//			cmd.addParameter("@P_DESC_83", pDesc83);
//			cmd.addParameter("@P_DESC_84", pDesc84);
//			cmd.addParameter("@P_DESC_85", pDesc85);
//			cmd.addParameter("@P_DESC_86", pDesc86);
//			cmd.addParameter("@P_DESC_87", pDesc87);
//			cmd.addParameter("@P_DESC_88", pDesc88);
//			cmd.addParameter("@P_DESC_89", pDesc89);
//			cmd.addParameter("@P_DESC_90", pDesc90);
//			cmd.addParameter("@P_DESC_91", pDesc91);
//			cmd.addParameter("@P_DESC_92", pDesc92);
//			cmd.addParameter("@P_DESC_93", pDesc93);
//			cmd.addParameter("@P_DESC_94", pDesc94);
//			cmd.addParameter("@P_DESC_95", pDesc95);
//			cmd.addParameter("@P_DESC_96", pDesc96);
//			cmd.addParameter("@P_DESC_97", pDesc97);
//			cmd.addParameter("@P_DESC_98", pDesc98);
//			cmd.addParameter("@P_DESC_99", pDesc99);
//			cmd.addParameter("@P_DESC_100", pDesc100);
//			cmd.addParameter("@P_DESC_101", pDesc101);
//			cmd.addParameter("@P_DESC_102", pDesc102);
//			cmd.addParameter("@P_DESC_103", pDesc103);
//			cmd.addParameter("@P_DESC_104", pDesc104);
//			cmd.addParameter("@P_DESC_105", pDesc105);
//			cmd.addParameter("@P_DESC_106", pDesc106);
//			cmd.addParameter("@P_DESC_107", pDesc107);
//			cmd.addParameter("@P_DESC_108", pDesc108);
//			cmd.addParameter("@P_DESC_109", pDesc109);
//			cmd.addParameter("@P_DESC_110", pDesc110);
//			cmd.addParameter("@P_DESC_111", pDesc111);
//			cmd.addParameter("@P_DESC_112", pDesc112);
//			cmd.addParameter("@P_DESC_113", pDesc113);
//			cmd.addParameter("@P_DESC_114", pDesc114);
//			cmd.addParameter("@P_DESC_115", pDesc115);
//			cmd.addParameter("@P_DESC_116", pDesc116);
//			cmd.addParameter("@P_DESC_117", pDesc117);
//			cmd.addParameter("@P_DESC_118", pDesc118);
//			cmd.addParameter("@P_DESC_119", pDesc119);
//			cmd.addParameter("@P_DESC_120", pDesc120);
//			cmd.addParameter("@P_DESC_121", pDesc121);
//			cmd.addParameter("@P_DESC_122", pDesc122);
//			cmd.addParameter("@P_DESC_123", pDesc123);
//			cmd.addParameter("@P_DESC_124", pDesc124);
//			cmd.addParameter("@P_DESC_125", pDesc125);
//			cmd.addParameter("@P_DESC_126", pDesc126);
//			cmd.addParameter("@P_DESC_127", pDesc127);
//			cmd.addParameter("@P_DESC_128", pDesc128);
//			cmd.addParameter("@P_DESC_129", pDesc129);
//			cmd.addParameter("@P_DESC_130", pDesc130);
//			cmd.addParameter("@P_DESC_131", pDesc131);
//			cmd.addParameter("@P_DESC_132", pDesc132);
//			cmd.addParameter("@P_DESC_133", pDesc133);
//			cmd.addParameter("@P_DESC_134", pDesc134);
//			cmd.addParameter("@P_DESC_135", pDesc135);
//			cmd.addParameter("@P_DESC_136", pDesc136);
//			cmd.addParameter("@P_DESC_137", pDesc137);
//			cmd.addParameter("@P_DESC_138", pDesc138);
//			cmd.addParameter("@P_DESC_139", pDesc139);
//			cmd.addParameter("@P_DESC_140", pDesc140);
//			cmd.addParameter("@P_DESC_141", pDesc141);
//			cmd.addParameter("@P_DESC_142", pDesc142);
//			cmd.addParameter("@P_DESC_143", pDesc143);
//			cmd.addParameter("@P_DESC_144", pDesc144);
//			cmd.addParameter("@P_DESC_145", pDesc145);
//			cmd.addParameter("@P_DESC_146", pDesc146);
//			cmd.addParameter("@P_DESC_147", pDesc147);
//			cmd.addParameter("@P_DESC_148", pDesc148);
//			cmd.addParameter("@P_DESC_149", pDesc149);
//			cmd.addParameter("@P_DESC_150", pDesc150);
//			cmd.addParameter("@P_DESC_151", pDesc151);
//			cmd.addParameter("@P_DESC_152", pDesc152);
//			cmd.addParameter("@P_DESC_153", pDesc153);
//			cmd.addParameter("@P_DESC_154", pDesc154);
//			cmd.addParameter("@P_DESC_155", pDesc155);
//			cmd.addParameter("@P_DESC_156", pDesc156);
//			cmd.addParameter("@P_DESC_157", pDesc157);
//			cmd.addParameter("@P_DESC_158", pDesc158);
//			cmd.addParameter("@P_DESC_159", pDesc159);
//			cmd.addParameter("@P_DESC_160", pDesc160);
//			cmd.addParameter("@P_DESC_161", pDesc161);
//			cmd.addParameter("@P_DESC_162", pDesc162);
//			cmd.addParameter("@P_DESC_163", pDesc163);
//			cmd.addParameter("@P_DESC_164", pDesc164);
//			cmd.addParameter("@P_DESC_165", pDesc165);
//			cmd.addParameter("@P_DESC_166", pDesc166);
//			cmd.addParameter("@P_DESC_167", pDesc167);
//			cmd.addParameter("@P_DESC_168", pDesc168);
//			cmd.addParameter("@P_DESC_169", pDesc169);
//			cmd.addParameter("@P_DESC_170", pDesc170);
//			cmd.addParameter("@P_DESC_171", pDesc171);
//			cmd.addParameter("@P_DESC_172", pDesc172);
//			cmd.addParameter("@P_DESC_173", pDesc173);
//			cmd.addParameter("@P_DESC_174", pDesc174);
//			cmd.addParameter("@P_DESC_175", pDesc175);
//			cmd.addParameter("@P_DESC_176", pDesc176);
//			cmd.addParameter("@P_DESC_177", pDesc177);
//			cmd.addParameter("@P_DESC_178", pDesc178);
//			cmd.addParameter("@P_DESC_179", pDesc179);
//			cmd.addParameter("@P_DESC_180", pDesc180);
//			cmd.addParameter("@P_DESC_181", pDesc181);
//			cmd.addParameter("@P_DESC_182", pDesc182);
//			cmd.addParameter("@P_DESC_183", pDesc183);
//			cmd.addParameter("@P_DESC_184", pDesc184);
//			cmd.addParameter("@P_DESC_185", pDesc185);
//			cmd.addParameter("@P_DESC_186", pDesc186);
//			cmd.addParameter("@P_DESC_187", pDesc187);
//			cmd.addParameter("@P_DESC_188", pDesc188);
//			cmd.addParameter("@P_DESC_189", pDesc189);
//			cmd.addParameter("@P_DESC_190", pDesc190);
//			cmd.addParameter("@P_DESC_191", pDesc191);
//			cmd.addParameter("@P_DESC_192", pDesc192);
//			cmd.addParameter("@P_DESC_193", pDesc193);
//			cmd.addParameter("@P_DESC_194", pDesc194);
//			cmd.addParameter("@P_DESC_195", pDesc195);
//			cmd.addParameter("@P_DESC_196", pDesc196);
//			cmd.addParameter("@P_DESC_197", pDesc197);
//			cmd.addParameter("@P_DESC_198", pDesc198);
//			cmd.addParameter("@P_DESC_199", pDesc199);
//			cmd.addParameter("@P_DESC_200", pDesc200);
//			cmd.addParameter("@P_DESC_201", pDesc201);
//			cmd.addParameter("@P_DESC_202", pDesc202);
//			cmd.addParameter("@P_DESC_203", pDesc203);
//			cmd.addParameter("@P_DESC_204", pDesc204);
//			cmd.addParameter("@P_DESC_205", pDesc205);
//			cmd.addParameter("@P_DESC_206", pDesc206);
//			cmd.addParameter("@P_DESC_207", pDesc207);
//			cmd.addParameter("@P_DESC_208", pDesc208);
//			cmd.addParameter("@P_DESC_209", pDesc209);
//			cmd.addParameter("@P_DESC_210", pDesc210);
//			cmd.addParameter("@P_DESC_211", pDesc211);
//			cmd.addParameter("@P_DESC_212", pDesc212);
//			cmd.addParameter("@P_DESC_213", pDesc213);
//			cmd.addParameter("@P_DESC_214", pDesc214);
//			cmd.addParameter("@P_DESC_215", pDesc215);
//			cmd.addParameter("@P_DESC_216", pDesc216);
//			cmd.addParameter("@P_DESC_217", pDesc217);
//			cmd.addParameter("@P_DESC_218", pDesc218);
//			cmd.addParameter("@P_DESC_219", pDesc219);
//			cmd.addParameter("@P_DESC_220", pDesc220);
//			cmd.addParameter("@P_DESC_221", pDesc221);
//			cmd.addParameter("@P_DESC_222", pDesc222);
//			cmd.addParameter("@P_DESC_223", pDesc223);
//			cmd.addParameter("@P_DESC_224", pDesc224);
//			cmd.addParameter("@P_DESC_225", pDesc225);
//			cmd.addParameter("@P_DESC_226", pDesc226);
//			cmd.addParameter("@P_DESC_227", pDesc227);
//			cmd.addParameter("@P_DESC_228", pDesc228);
//			cmd.addParameter("@P_DESC_229", pDesc229);
//			cmd.addParameter("@P_DESC_230", pDesc230);
//			cmd.addParameter("@P_DESC_231", pDesc231);
//			cmd.addParameter("@P_DESC_232", pDesc232);
//			cmd.addParameter("@P_DESC_233", pDesc233);
//			cmd.addParameter("@P_DESC_234", pDesc234);
//			cmd.addParameter("@P_DESC_235", pDesc235);
//			cmd.addParameter("@P_DESC_236", pDesc236);
//			cmd.addParameter("@P_DESC_237", pDesc237);
//			cmd.addParameter("@P_DESC_238", pDesc238);
//			cmd.addParameter("@P_DESC_239", pDesc239);
//			cmd.addParameter("@P_DESC_240", pDesc240);
//			cmd.addParameter("@P_DESC_241", pDesc241);
//			cmd.addParameter("@P_DESC_242", pDesc242);
//			cmd.addParameter("@P_DESC_243", pDesc243);
//			cmd.addParameter("@P_DESC_244", pDesc244);
//			cmd.addParameter("@P_DESC_245", pDesc245);
//			cmd.addParameter("@P_DESC_246", pDesc246);
//			cmd.addParameter("@P_DESC_247", pDesc247);
//			cmd.addParameter("@P_DESC_248", pDesc248);
//			cmd.addParameter("@P_DESC_249", pDesc249);
//			cmd.addParameter("@P_DESC_250", pDesc250);
//			cmd.addParameter("@P_DESC_251", pDesc251);
//			cmd.addParameter("@P_DESC_252", pDesc252);
//			cmd.addParameter("@P_DESC_253", pDesc253);
//			cmd.addParameter("@P_DESC_254", pDesc254);
//			cmd.addParameter("@P_DESC_255", pDesc255);
//			cmd.addParameter("@P_DESC_256", pDesc256);
//			cmd.addParameter("@P_DESC_257", pDesc257);
//			cmd.addParameter("@P_DESC_258", pDesc258);
//			cmd.addParameter("@P_DESC_259", pDesc259);
//			cmd.addParameter("@P_DESC_260", pDesc260);
//			cmd.addParameter("@P_DESC_261", pDesc261);
//			cmd.addParameter("@P_DESC_262", pDesc262);
//			cmd.addParameter("@P_DESC_263", pDesc263);
//			cmd.addParameter("@P_DESC_264", pDesc264);
//			cmd.addParameter("@P_DESC_265", pDesc265);
//			cmd.addParameter("@P_DESC_266", pDesc266);
//			cmd.addParameter("@P_DESC_267", pDesc267);
//			cmd.addParameter("@P_DESC_268", pDesc268);
//			cmd.addParameter("@P_DESC_269", pDesc269);
//			cmd.addParameter("@P_DESC_270", pDesc270);
//			cmd.addParameter("@P_DESC_271", pDesc271);
//			cmd.addParameter("@P_DESC_272", pDesc272);
//			cmd.addParameter("@P_DESC_273", pDesc273);
//			cmd.addParameter("@P_DESC_274", pDesc274);
//			cmd.addParameter("@P_DESC_275", pDesc275);
//			cmd.addParameter("@P_DESC_276", pDesc276);
//			cmd.addParameter("@P_DESC_277", pDesc277);
//			cmd.addParameter("@P_DESC_278", pDesc278);
//			cmd.addParameter("@P_DESC_279", pDesc279);
//			cmd.addParameter("@P_DESC_280", pDesc280);
//			cmd.addParameter("@P_DESC_281", pDesc281);
//			cmd.addParameter("@P_DESC_282", pDesc282);
//			cmd.addParameter("@P_DESC_283", pDesc283);
//			cmd.addParameter("@P_DESC_284", pDesc284);
//			cmd.addParameter("@P_DESC_285", pDesc285);
//			cmd.addParameter("@P_DESC_286", pDesc286);
//			cmd.addParameter("@P_DESC_287", pDesc287);
//			cmd.addParameter("@P_DESC_288", pDesc288);
//			cmd.addParameter("@P_DESC_289", pDesc289);
//			cmd.addParameter("@P_DESC_290", pDesc290);
//			cmd.addParameter("@P_DESC_291", pDesc291);
//			cmd.addParameter("@P_DESC_292", pDesc292);
//			cmd.addParameter("@P_DESC_293", pDesc293);
//			cmd.addParameter("@P_DESC_294", pDesc294);
//			cmd.addParameter("@P_DESC_295", pDesc295);
//			cmd.addParameter("@P_DESC_296", pDesc296);
//			cmd.addParameter("@P_DESC_297", pDesc297);
//			cmd.addParameter("@P_DESC_298", pDesc298);
//			cmd.addParameter("@P_DESC_299", pDesc299);
//			cmd.addParameter("@P_DESC_300", pDesc300);
//			cmd.addParameter("@P_DESC_301", pDesc301);
//			cmd.addParameter("@P_DESC_302", pDesc302);
//			cmd.addParameter("@P_DESC_303", pDesc303);
//			cmd.addParameter("@P_DESC_304", pDesc304);
//			cmd.addParameter("@P_DESC_305", pDesc305);
//			cmd.addParameter("@P_DESC_306", pDesc306);
//			cmd.addParameter("@P_DESC_307", pDesc307);
//			cmd.addParameter("@P_DESC_308", pDesc308);
//			cmd.addParameter("@P_DESC_309", pDesc309);
//			cmd.addParameter("@P_DESC_310", pDesc310);
//			cmd.addParameter("@P_DESC_311", pDesc311);
//			cmd.addParameter("@P_DESC_312", pDesc312);
//			cmd.addParameter("@P_DESC_313", pDesc313);
//			cmd.addParameter("@P_DESC_314", pDesc314);
//			cmd.addParameter("@P_DESC_315", pDesc315);
//			cmd.addParameter("@P_DESC_316", pDesc316);
//			cmd.addParameter("@P_DESC_317", pDesc317);
//			cmd.addParameter("@P_DESC_318", pDesc318);
//			cmd.addParameter("@P_DESC_319", pDesc319);
//			cmd.addParameter("@P_DESC_320", pDesc320);
//			cmd.addParameter("@P_DESC_321", pDesc321);
//			cmd.addParameter("@P_DESC_322", pDesc322);
//			cmd.addParameter("@P_DESC_323", pDesc323);
//			cmd.addParameter("@P_DESC_324", pDesc324);
//			cmd.addParameter("@P_DESC_325", pDesc325);
//			cmd.addParameter("@P_DESC_326", pDesc326);
//			cmd.addParameter("@P_DESC_327", pDesc327);
//			cmd.addParameter("@P_DESC_328", pDesc328);
//			cmd.addParameter("@P_DESC_329", pDesc329);
//			cmd.addParameter("@P_DESC_330", pDesc330);
//			cmd.addParameter("@P_DESC_331", pDesc331);
//			cmd.addParameter("@P_DESC_332", pDesc332);
//			cmd.addParameter("@P_DESC_333", pDesc333);
//			cmd.addParameter("@P_DESC_334", pDesc334);
//			cmd.addParameter("@P_DESC_335", pDesc335);
//			cmd.addParameter("@P_DESC_336", pDesc336);
//			cmd.addParameter("@P_DESC_337", pDesc337);
//			cmd.addParameter("@P_DESC_338", pDesc338);
//			cmd.addParameter("@P_DESC_339", pDesc339);
//			cmd.addParameter("@P_DESC_340", pDesc340);
//			cmd.addParameter("@P_DESC_341", pDesc341);
//			cmd.addParameter("@P_DESC_342", pDesc342);
//			cmd.addParameter("@P_DESC_343", pDesc343);
//			cmd.addParameter("@P_DESC_344", pDesc344);
//			cmd.addParameter("@P_DESC_345", pDesc345);
//			cmd.addParameter("@P_DESC_346", pDesc346);
//			cmd.addParameter("@P_DESC_347", pDesc347);
//			cmd.addParameter("@P_DESC_348", pDesc348);
//			cmd.addParameter("@P_DESC_349", pDesc349);
//			cmd.addParameter("@P_DESC_350", pDesc350);
//			cmd.addParameter("@P_DESC_351", pDesc351);
//			cmd.addParameter("@P_DESC_352", pDesc352);
//			cmd.addParameter("@P_DESC_353", pDesc353);
//			cmd.addParameter("@P_DESC_354", pDesc354);
//			cmd.addParameter("@P_DESC_355", pDesc355);
//			cmd.addParameter("@P_DESC_356", pDesc356);
//			cmd.addParameter("@P_DESC_357", pDesc357);
//			cmd.addParameter("@P_DESC_358", pDesc358);
//			cmd.addParameter("@P_DESC_359", pDesc359);
//			cmd.addParameter("@P_DESC_360", pDesc360);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_1", pAssocCssQuest1);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_2", pAssocCssQuest2);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_3", pAssocCssQuest3);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_4", pAssocCssQuest4);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_5", pAssocCssQuest5);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_6", pAssocCssQuest6);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_7", pAssocCssQuest7);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_8", pAssocCssQuest8);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_9", pAssocCssQuest9);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_10", pAssocCssQuest10);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_11", pAssocCssQuest11);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_12", pAssocCssQuest12);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_13", pAssocCssQuest13);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_14", pAssocCssQuest14);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_15", pAssocCssQuest15);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_16", pAssocCssQuest16);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_17", pAssocCssQuest17);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_18", pAssocCssQuest18);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_19", pAssocCssQuest19);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_20", pAssocCssQuest20);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_21", pAssocCssQuest21);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_22", pAssocCssQuest22);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_23", pAssocCssQuest23);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_24", pAssocCssQuest24);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_25", pAssocCssQuest25);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_26", pAssocCssQuest26);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_27", pAssocCssQuest27);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_28", pAssocCssQuest28);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_29", pAssocCssQuest29);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_30", pAssocCssQuest30);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_31", pAssocCssQuest31);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_32", pAssocCssQuest32);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_33", pAssocCssQuest33);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_34", pAssocCssQuest34);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_35", pAssocCssQuest35);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_36", pAssocCssQuest36);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_37", pAssocCssQuest37);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_38", pAssocCssQuest38);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_39", pAssocCssQuest39);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_40", pAssocCssQuest40);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_41", pAssocCssQuest41);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_42", pAssocCssQuest42);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_43", pAssocCssQuest43);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_44", pAssocCssQuest44);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_45", pAssocCssQuest45);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_46", pAssocCssQuest46);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_47", pAssocCssQuest47);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_48", pAssocCssQuest48);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_49", pAssocCssQuest49);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_50", pAssocCssQuest50);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_51", pAssocCssQuest51);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_52", pAssocCssQuest52);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_53", pAssocCssQuest53);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_54", pAssocCssQuest54);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_55", pAssocCssQuest55);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_56", pAssocCssQuest56);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_57", pAssocCssQuest57);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_58", pAssocCssQuest58);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_59", pAssocCssQuest59);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_60", pAssocCssQuest60);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_61", pAssocCssQuest61);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_62", pAssocCssQuest62);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_63", pAssocCssQuest63);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_64", pAssocCssQuest64);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_65", pAssocCssQuest65);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_66", pAssocCssQuest66);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_67", pAssocCssQuest67);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_68", pAssocCssQuest68);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_69", pAssocCssQuest69);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_70", pAssocCssQuest70);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_71", pAssocCssQuest71);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_72", pAssocCssQuest72);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_73", pAssocCssQuest73);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_74", pAssocCssQuest74);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_75", pAssocCssQuest75);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_76", pAssocCssQuest76);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_77", pAssocCssQuest77);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_78", pAssocCssQuest78);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_79", pAssocCssQuest79);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_80", pAssocCssQuest80);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_81", pAssocCssQuest81);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_82", pAssocCssQuest82);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_83", pAssocCssQuest83);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_84", pAssocCssQuest84);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_85", pAssocCssQuest85);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_86", pAssocCssQuest86);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_87", pAssocCssQuest87);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_88", pAssocCssQuest88);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_89", pAssocCssQuest89);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_90", pAssocCssQuest90);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_91", pAssocCssQuest91);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_92", pAssocCssQuest92);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_93", pAssocCssQuest93);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_94", pAssocCssQuest94);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_95", pAssocCssQuest95);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_96", pAssocCssQuest96);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_97", pAssocCssQuest97);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_98", pAssocCssQuest98);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_99", pAssocCssQuest99);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_100", pAssocCssQuest100);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_101", pAssocCssQuest101);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_102", pAssocCssQuest102);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_103", pAssocCssQuest103);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_104", pAssocCssQuest104);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_105", pAssocCssQuest105);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_106", pAssocCssQuest106);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_107", pAssocCssQuest107);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_108", pAssocCssQuest108);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_109", pAssocCssQuest109);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_110", pAssocCssQuest110);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_111", pAssocCssQuest111);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_112", pAssocCssQuest112);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_113", pAssocCssQuest113);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_114", pAssocCssQuest114);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_115", pAssocCssQuest115);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_116", pAssocCssQuest116);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_117", pAssocCssQuest117);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_118", pAssocCssQuest118);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_119", pAssocCssQuest119);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_120", pAssocCssQuest120);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_121", pAssocCssQuest121);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_122", pAssocCssQuest122);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_123", pAssocCssQuest123);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_124", pAssocCssQuest124);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_125", pAssocCssQuest125);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_126", pAssocCssQuest126);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_127", pAssocCssQuest127);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_128", pAssocCssQuest128);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_129", pAssocCssQuest129);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_130", pAssocCssQuest130);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_131", pAssocCssQuest131);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_132", pAssocCssQuest132);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_133", pAssocCssQuest133);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_134", pAssocCssQuest134);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_135", pAssocCssQuest135);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_136", pAssocCssQuest136);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_137", pAssocCssQuest137);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_138", pAssocCssQuest138);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_139", pAssocCssQuest139);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_140", pAssocCssQuest140);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_141", pAssocCssQuest141);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_142", pAssocCssQuest142);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_143", pAssocCssQuest143);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_144", pAssocCssQuest144);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_145", pAssocCssQuest145);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_146", pAssocCssQuest146);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_147", pAssocCssQuest147);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_148", pAssocCssQuest148);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_149", pAssocCssQuest149);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_150", pAssocCssQuest150);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_151", pAssocCssQuest151);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_152", pAssocCssQuest152);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_153", pAssocCssQuest153);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_154", pAssocCssQuest154);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_155", pAssocCssQuest155);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_156", pAssocCssQuest156);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_157", pAssocCssQuest157);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_158", pAssocCssQuest158);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_159", pAssocCssQuest159);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_160", pAssocCssQuest160);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_161", pAssocCssQuest161);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_162", pAssocCssQuest162);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_163", pAssocCssQuest163);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_164", pAssocCssQuest164);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_165", pAssocCssQuest165);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_166", pAssocCssQuest166);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_167", pAssocCssQuest167);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_168", pAssocCssQuest168);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_169", pAssocCssQuest169);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_170", pAssocCssQuest170);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_171", pAssocCssQuest171);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_172", pAssocCssQuest172);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_173", pAssocCssQuest173);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_174", pAssocCssQuest174);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_175", pAssocCssQuest175);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_176", pAssocCssQuest176);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_177", pAssocCssQuest177);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_178", pAssocCssQuest178);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_179", pAssocCssQuest179);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_180", pAssocCssQuest180);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_181", pAssocCssQuest181);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_182", pAssocCssQuest182);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_183", pAssocCssQuest183);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_184", pAssocCssQuest184);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_185", pAssocCssQuest185);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_186", pAssocCssQuest186);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_187", pAssocCssQuest187);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_188", pAssocCssQuest188);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_189", pAssocCssQuest189);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_190", pAssocCssQuest190);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_191", pAssocCssQuest191);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_192", pAssocCssQuest192);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_193", pAssocCssQuest193);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_194", pAssocCssQuest194);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_195", pAssocCssQuest195);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_196", pAssocCssQuest196);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_197", pAssocCssQuest197);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_198", pAssocCssQuest198);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_199", pAssocCssQuest199);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_200", pAssocCssQuest200);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_201", pAssocCssQuest201);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_202", pAssocCssQuest202);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_203", pAssocCssQuest203);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_204", pAssocCssQuest204);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_205", pAssocCssQuest205);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_206", pAssocCssQuest206);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_207", pAssocCssQuest207);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_208", pAssocCssQuest208);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_209", pAssocCssQuest209);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_210", pAssocCssQuest210);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_211", pAssocCssQuest211);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_212", pAssocCssQuest212);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_213", pAssocCssQuest213);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_214", pAssocCssQuest214);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_215", pAssocCssQuest215);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_216", pAssocCssQuest216);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_217", pAssocCssQuest217);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_218", pAssocCssQuest218);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_219", pAssocCssQuest219);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_220", pAssocCssQuest220);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_221", pAssocCssQuest221);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_222", pAssocCssQuest222);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_223", pAssocCssQuest223);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_224", pAssocCssQuest224);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_225", pAssocCssQuest225);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_226", pAssocCssQuest226);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_227", pAssocCssQuest227);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_228", pAssocCssQuest228);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_229", pAssocCssQuest229);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_230", pAssocCssQuest230);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_231", pAssocCssQuest231);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_232", pAssocCssQuest232);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_233", pAssocCssQuest233);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_234", pAssocCssQuest234);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_235", pAssocCssQuest235);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_236", pAssocCssQuest236);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_237", pAssocCssQuest237);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_238", pAssocCssQuest238);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_239", pAssocCssQuest239);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_240", pAssocCssQuest240);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_241", pAssocCssQuest241);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_242", pAssocCssQuest242);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_243", pAssocCssQuest243);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_244", pAssocCssQuest244);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_245", pAssocCssQuest245);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_246", pAssocCssQuest246);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_247", pAssocCssQuest247);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_248", pAssocCssQuest248);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_249", pAssocCssQuest249);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_250", pAssocCssQuest250);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_251", pAssocCssQuest251);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_252", pAssocCssQuest252);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_253", pAssocCssQuest253);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_254", pAssocCssQuest254);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_255", pAssocCssQuest255);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_256", pAssocCssQuest256);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_257", pAssocCssQuest257);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_258", pAssocCssQuest258);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_259", pAssocCssQuest259);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_260", pAssocCssQuest260);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_261", pAssocCssQuest261);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_262", pAssocCssQuest262);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_263", pAssocCssQuest263);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_264", pAssocCssQuest264);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_265", pAssocCssQuest265);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_266", pAssocCssQuest266);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_267", pAssocCssQuest267);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_268", pAssocCssQuest268);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_269", pAssocCssQuest269);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_270", pAssocCssQuest270);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_271", pAssocCssQuest271);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_272", pAssocCssQuest272);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_273", pAssocCssQuest273);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_274", pAssocCssQuest274);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_275", pAssocCssQuest275);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_276", pAssocCssQuest276);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_277", pAssocCssQuest277);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_278", pAssocCssQuest278);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_279", pAssocCssQuest279);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_280", pAssocCssQuest280);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_281", pAssocCssQuest281);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_282", pAssocCssQuest282);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_283", pAssocCssQuest283);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_284", pAssocCssQuest284);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_285", pAssocCssQuest285);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_286", pAssocCssQuest286);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_287", pAssocCssQuest287);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_288", pAssocCssQuest288);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_289", pAssocCssQuest289);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_290", pAssocCssQuest290);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_291", pAssocCssQuest291);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_292", pAssocCssQuest292);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_293", pAssocCssQuest293);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_294", pAssocCssQuest294);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_295", pAssocCssQuest295);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_296", pAssocCssQuest296);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_297", pAssocCssQuest297);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_298", pAssocCssQuest298);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_299", pAssocCssQuest299);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_300", pAssocCssQuest300);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_301", pAssocCssQuest301);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_302", pAssocCssQuest302);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_303", pAssocCssQuest303);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_304", pAssocCssQuest304);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_305", pAssocCssQuest305);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_306", pAssocCssQuest306);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_307", pAssocCssQuest307);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_308", pAssocCssQuest308);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_309", pAssocCssQuest309);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_310", pAssocCssQuest310);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_311", pAssocCssQuest311);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_312", pAssocCssQuest312);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_313", pAssocCssQuest313);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_314", pAssocCssQuest314);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_315", pAssocCssQuest315);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_316", pAssocCssQuest316);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_317", pAssocCssQuest317);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_318", pAssocCssQuest318);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_319", pAssocCssQuest319);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_320", pAssocCssQuest320);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_321", pAssocCssQuest321);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_322", pAssocCssQuest322);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_323", pAssocCssQuest323);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_324", pAssocCssQuest324);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_325", pAssocCssQuest325);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_326", pAssocCssQuest326);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_327", pAssocCssQuest327);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_328", pAssocCssQuest328);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_329", pAssocCssQuest329);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_330", pAssocCssQuest330);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_331", pAssocCssQuest331);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_332", pAssocCssQuest332);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_333", pAssocCssQuest333);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_334", pAssocCssQuest334);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_335", pAssocCssQuest335);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_336", pAssocCssQuest336);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_337", pAssocCssQuest337);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_338", pAssocCssQuest338);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_339", pAssocCssQuest339);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_340", pAssocCssQuest340);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_341", pAssocCssQuest341);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_342", pAssocCssQuest342);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_343", pAssocCssQuest343);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_344", pAssocCssQuest344);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_345", pAssocCssQuest345);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_346", pAssocCssQuest346);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_347", pAssocCssQuest347);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_348", pAssocCssQuest348);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_349", pAssocCssQuest349);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_350", pAssocCssQuest350);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_351", pAssocCssQuest351);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_352", pAssocCssQuest352);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_353", pAssocCssQuest353);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_354", pAssocCssQuest354);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_355", pAssocCssQuest355);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_356", pAssocCssQuest356);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_357", pAssocCssQuest357);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_358", pAssocCssQuest358);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_359", pAssocCssQuest359);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_360", pAssocCssQuest360);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NString pUserId,NString pDataOrigin,NString pDesc1,NString pDesc2,NString pDesc3,NString pDesc4,NString pDesc5,NString pDesc6,NString pDesc7,NString pDesc8,NString pDesc9,NString pDesc10,NString pDesc11,NString pDesc12,NString pDesc13,NString pDesc14,NString pDesc15,NString pDesc16,NString pDesc17,NString pDesc18,NString pDesc19,NString pDesc20,NString pDesc21,NString pDesc22,NString pDesc23,NString pDesc24,NString pDesc25,NString pDesc26,NString pDesc27,NString pDesc28,NString pDesc29,NString pDesc30,NString pDesc31,NString pDesc32,NString pDesc33,NString pDesc34,NString pDesc35,NString pDesc36,NString pDesc37,NString pDesc38,NString pDesc39,NString pDesc40,NString pDesc41,NString pDesc42,NString pDesc43,NString pDesc44,NString pDesc45,NString pDesc46,NString pDesc47,NString pDesc48,NString pDesc49,NString pDesc50,NString pDesc51,NString pDesc52,NString pDesc53,NString pDesc54,NString pDesc55,NString pDesc56,NString pDesc57,NString pDesc58,NString pDesc59,NString pDesc60,NString pDesc61,NString pDesc62,NString pDesc63,NString pDesc64,NString pDesc65,NString pDesc66,NString pDesc67,NString pDesc68,NString pDesc69,NString pDesc70,NString pDesc71,NString pDesc72,NString pDesc73,NString pDesc74,NString pDesc75,NString pDesc76,NString pDesc77,NString pDesc78,NString pDesc79,NString pDesc80,NString pDesc81,NString pDesc82,NString pDesc83,NString pDesc84,NString pDesc85,NString pDesc86,NString pDesc87,NString pDesc88,NString pDesc89,NString pDesc90,NString pDesc91,NString pDesc92,NString pDesc93,NString pDesc94,NString pDesc95,NString pDesc96,NString pDesc97,NString pDesc98,NString pDesc99,NString pDesc100,NString pDesc101,NString pDesc102,NString pDesc103,NString pDesc104,NString pDesc105,NString pDesc106,NString pDesc107,NString pDesc108,NString pDesc109,NString pDesc110,NString pDesc111,NString pDesc112,NString pDesc113,NString pDesc114,NString pDesc115,NString pDesc116,NString pDesc117,NString pDesc118,NString pDesc119,NString pDesc120,NString pDesc121,NString pDesc122,NString pDesc123,NString pDesc124,NString pDesc125,NString pDesc126,NString pDesc127,NString pDesc128,NString pDesc129,NString pDesc130,NString pDesc131,NString pDesc132,NString pDesc133,NString pDesc134,NString pDesc135,NString pDesc136,NString pDesc137,NString pDesc138,NString pDesc139,NString pDesc140,NString pDesc141,NString pDesc142,NString pDesc143,NString pDesc144,NString pDesc145,NString pDesc146,NString pDesc147,NString pDesc148,NString pDesc149,NString pDesc150,NString pDesc151,NString pDesc152,NString pDesc153,NString pDesc154,NString pDesc155,NString pDesc156,NString pDesc157,NString pDesc158,NString pDesc159,NString pDesc160,NString pDesc161,NString pDesc162,NString pDesc163,NString pDesc164,NString pDesc165,NString pDesc166,NString pDesc167,NString pDesc168,NString pDesc169,NString pDesc170,NString pDesc171,NString pDesc172,NString pDesc173,NString pDesc174,NString pDesc175,NString pDesc176,NString pDesc177,NString pDesc178,NString pDesc179,NString pDesc180,NString pDesc181,NString pDesc182,NString pDesc183,NString pDesc184,NString pDesc185,NString pDesc186,NString pDesc187,NString pDesc188,NString pDesc189,NString pDesc190,NString pDesc191,NString pDesc192,NString pDesc193,NString pDesc194,NString pDesc195,NString pDesc196,NString pDesc197,NString pDesc198,NString pDesc199,NString pDesc200,NString pDesc201,NString pDesc202,NString pDesc203,NString pDesc204,NString pDesc205,NString pDesc206,NString pDesc207,NString pDesc208,NString pDesc209,NString pDesc210,NString pDesc211,NString pDesc212,NString pDesc213,NString pDesc214,NString pDesc215,NString pDesc216,NString pDesc217,NString pDesc218,NString pDesc219,NString pDesc220,NString pDesc221,NString pDesc222,NString pDesc223,NString pDesc224,NString pDesc225,NString pDesc226,NString pDesc227,NString pDesc228,NString pDesc229,NString pDesc230,NString pDesc231,NString pDesc232,NString pDesc233,NString pDesc234,NString pDesc235,NString pDesc236,NString pDesc237,NString pDesc238,NString pDesc239,NString pDesc240,NString pDesc241,NString pDesc242,NString pDesc243,NString pDesc244,NString pDesc245,NString pDesc246,NString pDesc247,NString pDesc248,NString pDesc249,NString pDesc250,NString pDesc251,NString pDesc252,NString pDesc253,NString pDesc254,NString pDesc255,NString pDesc256,NString pDesc257,NString pDesc258,NString pDesc259,NString pDesc260,NString pDesc261,NString pDesc262,NString pDesc263,NString pDesc264,NString pDesc265,NString pDesc266,NString pDesc267,NString pDesc268,NString pDesc269,NString pDesc270,NString pDesc271,NString pDesc272,NString pDesc273,NString pDesc274,NString pDesc275,NString pDesc276,NString pDesc277,NString pDesc278,NString pDesc279,NString pDesc280,NString pDesc281,NString pDesc282,NString pDesc283,NString pDesc284,NString pDesc285,NString pDesc286,NString pDesc287,NString pDesc288,NString pDesc289,NString pDesc290,NString pDesc291,NString pDesc292,NString pDesc293,NString pDesc294,NString pDesc295,NString pDesc296,NString pDesc297,NString pDesc298,NString pDesc299,NString pDesc300,NString pDesc301,NString pDesc302,NString pDesc303,NString pDesc304,NString pDesc305,NString pDesc306,NString pDesc307,NString pDesc308,NString pDesc309,NString pDesc310,NString pDesc311,NString pDesc312,NString pDesc313,NString pDesc314,NString pDesc315,NString pDesc316,NString pDesc317,NString pDesc318,NString pDesc319,NString pDesc320,NString pDesc321,NString pDesc322,NString pDesc323,NString pDesc324,NString pDesc325,NString pDesc326,NString pDesc327,NString pDesc328,NString pDesc329,NString pDesc330,NString pDesc331,NString pDesc332,NString pDesc333,NString pDesc334,NString pDesc335,NString pDesc336,NString pDesc337,NString pDesc338,NString pDesc339,NString pDesc340,NString pDesc341,NString pDesc342,NString pDesc343,NString pDesc344,NString pDesc345,NString pDesc346,NString pDesc347,NString pDesc348,NString pDesc349,NString pDesc350,NString pDesc351,NString pDesc352,NString pDesc353,NString pDesc354,NString pDesc355,NString pDesc356,NString pDesc357,NString pDesc358,NString pDesc359,NString pDesc360,NString pAssocCssQuest1,NString pAssocCssQuest2,NString pAssocCssQuest3,NString pAssocCssQuest4,NString pAssocCssQuest5,NString pAssocCssQuest6,NString pAssocCssQuest7,NString pAssocCssQuest8,NString pAssocCssQuest9,NString pAssocCssQuest10,NString pAssocCssQuest11,NString pAssocCssQuest12,NString pAssocCssQuest13,NString pAssocCssQuest14,NString pAssocCssQuest15,NString pAssocCssQuest16,NString pAssocCssQuest17,NString pAssocCssQuest18,NString pAssocCssQuest19,NString pAssocCssQuest20,NString pAssocCssQuest21,NString pAssocCssQuest22,NString pAssocCssQuest23,NString pAssocCssQuest24,NString pAssocCssQuest25,NString pAssocCssQuest26,NString pAssocCssQuest27,NString pAssocCssQuest28,NString pAssocCssQuest29,NString pAssocCssQuest30,NString pAssocCssQuest31,NString pAssocCssQuest32,NString pAssocCssQuest33,NString pAssocCssQuest34,NString pAssocCssQuest35,NString pAssocCssQuest36,NString pAssocCssQuest37,NString pAssocCssQuest38,NString pAssocCssQuest39,NString pAssocCssQuest40,NString pAssocCssQuest41,NString pAssocCssQuest42,NString pAssocCssQuest43,NString pAssocCssQuest44,NString pAssocCssQuest45,NString pAssocCssQuest46,NString pAssocCssQuest47,NString pAssocCssQuest48,NString pAssocCssQuest49,NString pAssocCssQuest50,NString pAssocCssQuest51,NString pAssocCssQuest52,NString pAssocCssQuest53,NString pAssocCssQuest54,NString pAssocCssQuest55,NString pAssocCssQuest56,NString pAssocCssQuest57,NString pAssocCssQuest58,NString pAssocCssQuest59,NString pAssocCssQuest60,NString pAssocCssQuest61,NString pAssocCssQuest62,NString pAssocCssQuest63,NString pAssocCssQuest64,NString pAssocCssQuest65,NString pAssocCssQuest66,NString pAssocCssQuest67,NString pAssocCssQuest68,NString pAssocCssQuest69,NString pAssocCssQuest70,NString pAssocCssQuest71,NString pAssocCssQuest72,NString pAssocCssQuest73,NString pAssocCssQuest74,NString pAssocCssQuest75,NString pAssocCssQuest76,NString pAssocCssQuest77,NString pAssocCssQuest78,NString pAssocCssQuest79,NString pAssocCssQuest80,NString pAssocCssQuest81,NString pAssocCssQuest82,NString pAssocCssQuest83,NString pAssocCssQuest84,NString pAssocCssQuest85,NString pAssocCssQuest86,NString pAssocCssQuest87,NString pAssocCssQuest88,NString pAssocCssQuest89,NString pAssocCssQuest90,NString pAssocCssQuest91,NString pAssocCssQuest92,NString pAssocCssQuest93,NString pAssocCssQuest94,NString pAssocCssQuest95,NString pAssocCssQuest96,NString pAssocCssQuest97,NString pAssocCssQuest98,NString pAssocCssQuest99,NString pAssocCssQuest100,NString pAssocCssQuest101,NString pAssocCssQuest102,NString pAssocCssQuest103,NString pAssocCssQuest104,NString pAssocCssQuest105,NString pAssocCssQuest106,NString pAssocCssQuest107,NString pAssocCssQuest108,NString pAssocCssQuest109,NString pAssocCssQuest110,NString pAssocCssQuest111,NString pAssocCssQuest112,NString pAssocCssQuest113,NString pAssocCssQuest114,NString pAssocCssQuest115,NString pAssocCssQuest116,NString pAssocCssQuest117,NString pAssocCssQuest118,NString pAssocCssQuest119,NString pAssocCssQuest120,NString pAssocCssQuest121,NString pAssocCssQuest122,NString pAssocCssQuest123,NString pAssocCssQuest124,NString pAssocCssQuest125,NString pAssocCssQuest126,NString pAssocCssQuest127,NString pAssocCssQuest128,NString pAssocCssQuest129,NString pAssocCssQuest130,NString pAssocCssQuest131,NString pAssocCssQuest132,NString pAssocCssQuest133,NString pAssocCssQuest134,NString pAssocCssQuest135,NString pAssocCssQuest136,NString pAssocCssQuest137,NString pAssocCssQuest138,NString pAssocCssQuest139,NString pAssocCssQuest140,NString pAssocCssQuest141,NString pAssocCssQuest142,NString pAssocCssQuest143,NString pAssocCssQuest144,NString pAssocCssQuest145,NString pAssocCssQuest146,NString pAssocCssQuest147,NString pAssocCssQuest148,NString pAssocCssQuest149,NString pAssocCssQuest150,NString pAssocCssQuest151,NString pAssocCssQuest152,NString pAssocCssQuest153,NString pAssocCssQuest154,NString pAssocCssQuest155,NString pAssocCssQuest156,NString pAssocCssQuest157,NString pAssocCssQuest158,NString pAssocCssQuest159,NString pAssocCssQuest160,NString pAssocCssQuest161,NString pAssocCssQuest162,NString pAssocCssQuest163,NString pAssocCssQuest164,NString pAssocCssQuest165,NString pAssocCssQuest166,NString pAssocCssQuest167,NString pAssocCssQuest168,NString pAssocCssQuest169,NString pAssocCssQuest170,NString pAssocCssQuest171,NString pAssocCssQuest172,NString pAssocCssQuest173,NString pAssocCssQuest174,NString pAssocCssQuest175,NString pAssocCssQuest176,NString pAssocCssQuest177,NString pAssocCssQuest178,NString pAssocCssQuest179,NString pAssocCssQuest180,NString pAssocCssQuest181,NString pAssocCssQuest182,NString pAssocCssQuest183,NString pAssocCssQuest184,NString pAssocCssQuest185,NString pAssocCssQuest186,NString pAssocCssQuest187,NString pAssocCssQuest188,NString pAssocCssQuest189,NString pAssocCssQuest190,NString pAssocCssQuest191,NString pAssocCssQuest192,NString pAssocCssQuest193,NString pAssocCssQuest194,NString pAssocCssQuest195,NString pAssocCssQuest196,NString pAssocCssQuest197,NString pAssocCssQuest198,NString pAssocCssQuest199,NString pAssocCssQuest200,NString pAssocCssQuest201,NString pAssocCssQuest202,NString pAssocCssQuest203,NString pAssocCssQuest204,NString pAssocCssQuest205,NString pAssocCssQuest206,NString pAssocCssQuest207,NString pAssocCssQuest208,NString pAssocCssQuest209,NString pAssocCssQuest210,NString pAssocCssQuest211,NString pAssocCssQuest212,NString pAssocCssQuest213,NString pAssocCssQuest214,NString pAssocCssQuest215,NString pAssocCssQuest216,NString pAssocCssQuest217,NString pAssocCssQuest218,NString pAssocCssQuest219,NString pAssocCssQuest220,NString pAssocCssQuest221,NString pAssocCssQuest222,NString pAssocCssQuest223,NString pAssocCssQuest224,NString pAssocCssQuest225,NString pAssocCssQuest226,NString pAssocCssQuest227,NString pAssocCssQuest228,NString pAssocCssQuest229,NString pAssocCssQuest230,NString pAssocCssQuest231,NString pAssocCssQuest232,NString pAssocCssQuest233,NString pAssocCssQuest234,NString pAssocCssQuest235,NString pAssocCssQuest236,NString pAssocCssQuest237,NString pAssocCssQuest238,NString pAssocCssQuest239,NString pAssocCssQuest240,NString pAssocCssQuest241,NString pAssocCssQuest242,NString pAssocCssQuest243,NString pAssocCssQuest244,NString pAssocCssQuest245,NString pAssocCssQuest246,NString pAssocCssQuest247,NString pAssocCssQuest248,NString pAssocCssQuest249,NString pAssocCssQuest250,NString pAssocCssQuest251,NString pAssocCssQuest252,NString pAssocCssQuest253,NString pAssocCssQuest254,NString pAssocCssQuest255,NString pAssocCssQuest256,NString pAssocCssQuest257,NString pAssocCssQuest258,NString pAssocCssQuest259,NString pAssocCssQuest260,NString pAssocCssQuest261,NString pAssocCssQuest262,NString pAssocCssQuest263,NString pAssocCssQuest264,NString pAssocCssQuest265,NString pAssocCssQuest266,NString pAssocCssQuest267,NString pAssocCssQuest268,NString pAssocCssQuest269,NString pAssocCssQuest270,NString pAssocCssQuest271,NString pAssocCssQuest272,NString pAssocCssQuest273,NString pAssocCssQuest274,NString pAssocCssQuest275,NString pAssocCssQuest276,NString pAssocCssQuest277,NString pAssocCssQuest278,NString pAssocCssQuest279,NString pAssocCssQuest280,NString pAssocCssQuest281,NString pAssocCssQuest282,NString pAssocCssQuest283,NString pAssocCssQuest284,NString pAssocCssQuest285,NString pAssocCssQuest286,NString pAssocCssQuest287,NString pAssocCssQuest288,NString pAssocCssQuest289,NString pAssocCssQuest290,NString pAssocCssQuest291,NString pAssocCssQuest292,NString pAssocCssQuest293,NString pAssocCssQuest294,NString pAssocCssQuest295,NString pAssocCssQuest296,NString pAssocCssQuest297,NString pAssocCssQuest298,NString pAssocCssQuest299,NString pAssocCssQuest300,NString pAssocCssQuest301,NString pAssocCssQuest302,NString pAssocCssQuest303,NString pAssocCssQuest304,NString pAssocCssQuest305,NString pAssocCssQuest306,NString pAssocCssQuest307,NString pAssocCssQuest308,NString pAssocCssQuest309,NString pAssocCssQuest310,NString pAssocCssQuest311,NString pAssocCssQuest312,NString pAssocCssQuest313,NString pAssocCssQuest314,NString pAssocCssQuest315,NString pAssocCssQuest316,NString pAssocCssQuest317,NString pAssocCssQuest318,NString pAssocCssQuest319,NString pAssocCssQuest320,NString pAssocCssQuest321,NString pAssocCssQuest322,NString pAssocCssQuest323,NString pAssocCssQuest324,NString pAssocCssQuest325,NString pAssocCssQuest326,NString pAssocCssQuest327,NString pAssocCssQuest328,NString pAssocCssQuest329,NString pAssocCssQuest330,NString pAssocCssQuest331,NString pAssocCssQuest332,NString pAssocCssQuest333,NString pAssocCssQuest334,NString pAssocCssQuest335,NString pAssocCssQuest336,NString pAssocCssQuest337,NString pAssocCssQuest338,NString pAssocCssQuest339,NString pAssocCssQuest340,NString pAssocCssQuest341,NString pAssocCssQuest342,NString pAssocCssQuest343,NString pAssocCssQuest344,NString pAssocCssQuest345,NString pAssocCssQuest346,NString pAssocCssQuest347,NString pAssocCssQuest348,NString pAssocCssQuest349,NString pAssocCssQuest350,NString pAssocCssQuest351,NString pAssocCssQuest352,NString pAssocCssQuest353,NString pAssocCssQuest354,NString pAssocCssQuest355,NString pAssocCssQuest356,NString pAssocCssQuest357,NString pAssocCssQuest358,NString pAssocCssQuest359,NString pAssocCssQuest360,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_VAR_DESC.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_DESC_1", pDesc1);
//			cmd.addParameter("@P_DESC_2", pDesc2);
//			cmd.addParameter("@P_DESC_3", pDesc3);
//			cmd.addParameter("@P_DESC_4", pDesc4);
//			cmd.addParameter("@P_DESC_5", pDesc5);
//			cmd.addParameter("@P_DESC_6", pDesc6);
//			cmd.addParameter("@P_DESC_7", pDesc7);
//			cmd.addParameter("@P_DESC_8", pDesc8);
//			cmd.addParameter("@P_DESC_9", pDesc9);
//			cmd.addParameter("@P_DESC_10", pDesc10);
//			cmd.addParameter("@P_DESC_11", pDesc11);
//			cmd.addParameter("@P_DESC_12", pDesc12);
//			cmd.addParameter("@P_DESC_13", pDesc13);
//			cmd.addParameter("@P_DESC_14", pDesc14);
//			cmd.addParameter("@P_DESC_15", pDesc15);
//			cmd.addParameter("@P_DESC_16", pDesc16);
//			cmd.addParameter("@P_DESC_17", pDesc17);
//			cmd.addParameter("@P_DESC_18", pDesc18);
//			cmd.addParameter("@P_DESC_19", pDesc19);
//			cmd.addParameter("@P_DESC_20", pDesc20);
//			cmd.addParameter("@P_DESC_21", pDesc21);
//			cmd.addParameter("@P_DESC_22", pDesc22);
//			cmd.addParameter("@P_DESC_23", pDesc23);
//			cmd.addParameter("@P_DESC_24", pDesc24);
//			cmd.addParameter("@P_DESC_25", pDesc25);
//			cmd.addParameter("@P_DESC_26", pDesc26);
//			cmd.addParameter("@P_DESC_27", pDesc27);
//			cmd.addParameter("@P_DESC_28", pDesc28);
//			cmd.addParameter("@P_DESC_29", pDesc29);
//			cmd.addParameter("@P_DESC_30", pDesc30);
//			cmd.addParameter("@P_DESC_31", pDesc31);
//			cmd.addParameter("@P_DESC_32", pDesc32);
//			cmd.addParameter("@P_DESC_33", pDesc33);
//			cmd.addParameter("@P_DESC_34", pDesc34);
//			cmd.addParameter("@P_DESC_35", pDesc35);
//			cmd.addParameter("@P_DESC_36", pDesc36);
//			cmd.addParameter("@P_DESC_37", pDesc37);
//			cmd.addParameter("@P_DESC_38", pDesc38);
//			cmd.addParameter("@P_DESC_39", pDesc39);
//			cmd.addParameter("@P_DESC_40", pDesc40);
//			cmd.addParameter("@P_DESC_41", pDesc41);
//			cmd.addParameter("@P_DESC_42", pDesc42);
//			cmd.addParameter("@P_DESC_43", pDesc43);
//			cmd.addParameter("@P_DESC_44", pDesc44);
//			cmd.addParameter("@P_DESC_45", pDesc45);
//			cmd.addParameter("@P_DESC_46", pDesc46);
//			cmd.addParameter("@P_DESC_47", pDesc47);
//			cmd.addParameter("@P_DESC_48", pDesc48);
//			cmd.addParameter("@P_DESC_49", pDesc49);
//			cmd.addParameter("@P_DESC_50", pDesc50);
//			cmd.addParameter("@P_DESC_51", pDesc51);
//			cmd.addParameter("@P_DESC_52", pDesc52);
//			cmd.addParameter("@P_DESC_53", pDesc53);
//			cmd.addParameter("@P_DESC_54", pDesc54);
//			cmd.addParameter("@P_DESC_55", pDesc55);
//			cmd.addParameter("@P_DESC_56", pDesc56);
//			cmd.addParameter("@P_DESC_57", pDesc57);
//			cmd.addParameter("@P_DESC_58", pDesc58);
//			cmd.addParameter("@P_DESC_59", pDesc59);
//			cmd.addParameter("@P_DESC_60", pDesc60);
//			cmd.addParameter("@P_DESC_61", pDesc61);
//			cmd.addParameter("@P_DESC_62", pDesc62);
//			cmd.addParameter("@P_DESC_63", pDesc63);
//			cmd.addParameter("@P_DESC_64", pDesc64);
//			cmd.addParameter("@P_DESC_65", pDesc65);
//			cmd.addParameter("@P_DESC_66", pDesc66);
//			cmd.addParameter("@P_DESC_67", pDesc67);
//			cmd.addParameter("@P_DESC_68", pDesc68);
//			cmd.addParameter("@P_DESC_69", pDesc69);
//			cmd.addParameter("@P_DESC_70", pDesc70);
//			cmd.addParameter("@P_DESC_71", pDesc71);
//			cmd.addParameter("@P_DESC_72", pDesc72);
//			cmd.addParameter("@P_DESC_73", pDesc73);
//			cmd.addParameter("@P_DESC_74", pDesc74);
//			cmd.addParameter("@P_DESC_75", pDesc75);
//			cmd.addParameter("@P_DESC_76", pDesc76);
//			cmd.addParameter("@P_DESC_77", pDesc77);
//			cmd.addParameter("@P_DESC_78", pDesc78);
//			cmd.addParameter("@P_DESC_79", pDesc79);
//			cmd.addParameter("@P_DESC_80", pDesc80);
//			cmd.addParameter("@P_DESC_81", pDesc81);
//			cmd.addParameter("@P_DESC_82", pDesc82);
//			cmd.addParameter("@P_DESC_83", pDesc83);
//			cmd.addParameter("@P_DESC_84", pDesc84);
//			cmd.addParameter("@P_DESC_85", pDesc85);
//			cmd.addParameter("@P_DESC_86", pDesc86);
//			cmd.addParameter("@P_DESC_87", pDesc87);
//			cmd.addParameter("@P_DESC_88", pDesc88);
//			cmd.addParameter("@P_DESC_89", pDesc89);
//			cmd.addParameter("@P_DESC_90", pDesc90);
//			cmd.addParameter("@P_DESC_91", pDesc91);
//			cmd.addParameter("@P_DESC_92", pDesc92);
//			cmd.addParameter("@P_DESC_93", pDesc93);
//			cmd.addParameter("@P_DESC_94", pDesc94);
//			cmd.addParameter("@P_DESC_95", pDesc95);
//			cmd.addParameter("@P_DESC_96", pDesc96);
//			cmd.addParameter("@P_DESC_97", pDesc97);
//			cmd.addParameter("@P_DESC_98", pDesc98);
//			cmd.addParameter("@P_DESC_99", pDesc99);
//			cmd.addParameter("@P_DESC_100", pDesc100);
//			cmd.addParameter("@P_DESC_101", pDesc101);
//			cmd.addParameter("@P_DESC_102", pDesc102);
//			cmd.addParameter("@P_DESC_103", pDesc103);
//			cmd.addParameter("@P_DESC_104", pDesc104);
//			cmd.addParameter("@P_DESC_105", pDesc105);
//			cmd.addParameter("@P_DESC_106", pDesc106);
//			cmd.addParameter("@P_DESC_107", pDesc107);
//			cmd.addParameter("@P_DESC_108", pDesc108);
//			cmd.addParameter("@P_DESC_109", pDesc109);
//			cmd.addParameter("@P_DESC_110", pDesc110);
//			cmd.addParameter("@P_DESC_111", pDesc111);
//			cmd.addParameter("@P_DESC_112", pDesc112);
//			cmd.addParameter("@P_DESC_113", pDesc113);
//			cmd.addParameter("@P_DESC_114", pDesc114);
//			cmd.addParameter("@P_DESC_115", pDesc115);
//			cmd.addParameter("@P_DESC_116", pDesc116);
//			cmd.addParameter("@P_DESC_117", pDesc117);
//			cmd.addParameter("@P_DESC_118", pDesc118);
//			cmd.addParameter("@P_DESC_119", pDesc119);
//			cmd.addParameter("@P_DESC_120", pDesc120);
//			cmd.addParameter("@P_DESC_121", pDesc121);
//			cmd.addParameter("@P_DESC_122", pDesc122);
//			cmd.addParameter("@P_DESC_123", pDesc123);
//			cmd.addParameter("@P_DESC_124", pDesc124);
//			cmd.addParameter("@P_DESC_125", pDesc125);
//			cmd.addParameter("@P_DESC_126", pDesc126);
//			cmd.addParameter("@P_DESC_127", pDesc127);
//			cmd.addParameter("@P_DESC_128", pDesc128);
//			cmd.addParameter("@P_DESC_129", pDesc129);
//			cmd.addParameter("@P_DESC_130", pDesc130);
//			cmd.addParameter("@P_DESC_131", pDesc131);
//			cmd.addParameter("@P_DESC_132", pDesc132);
//			cmd.addParameter("@P_DESC_133", pDesc133);
//			cmd.addParameter("@P_DESC_134", pDesc134);
//			cmd.addParameter("@P_DESC_135", pDesc135);
//			cmd.addParameter("@P_DESC_136", pDesc136);
//			cmd.addParameter("@P_DESC_137", pDesc137);
//			cmd.addParameter("@P_DESC_138", pDesc138);
//			cmd.addParameter("@P_DESC_139", pDesc139);
//			cmd.addParameter("@P_DESC_140", pDesc140);
//			cmd.addParameter("@P_DESC_141", pDesc141);
//			cmd.addParameter("@P_DESC_142", pDesc142);
//			cmd.addParameter("@P_DESC_143", pDesc143);
//			cmd.addParameter("@P_DESC_144", pDesc144);
//			cmd.addParameter("@P_DESC_145", pDesc145);
//			cmd.addParameter("@P_DESC_146", pDesc146);
//			cmd.addParameter("@P_DESC_147", pDesc147);
//			cmd.addParameter("@P_DESC_148", pDesc148);
//			cmd.addParameter("@P_DESC_149", pDesc149);
//			cmd.addParameter("@P_DESC_150", pDesc150);
//			cmd.addParameter("@P_DESC_151", pDesc151);
//			cmd.addParameter("@P_DESC_152", pDesc152);
//			cmd.addParameter("@P_DESC_153", pDesc153);
//			cmd.addParameter("@P_DESC_154", pDesc154);
//			cmd.addParameter("@P_DESC_155", pDesc155);
//			cmd.addParameter("@P_DESC_156", pDesc156);
//			cmd.addParameter("@P_DESC_157", pDesc157);
//			cmd.addParameter("@P_DESC_158", pDesc158);
//			cmd.addParameter("@P_DESC_159", pDesc159);
//			cmd.addParameter("@P_DESC_160", pDesc160);
//			cmd.addParameter("@P_DESC_161", pDesc161);
//			cmd.addParameter("@P_DESC_162", pDesc162);
//			cmd.addParameter("@P_DESC_163", pDesc163);
//			cmd.addParameter("@P_DESC_164", pDesc164);
//			cmd.addParameter("@P_DESC_165", pDesc165);
//			cmd.addParameter("@P_DESC_166", pDesc166);
//			cmd.addParameter("@P_DESC_167", pDesc167);
//			cmd.addParameter("@P_DESC_168", pDesc168);
//			cmd.addParameter("@P_DESC_169", pDesc169);
//			cmd.addParameter("@P_DESC_170", pDesc170);
//			cmd.addParameter("@P_DESC_171", pDesc171);
//			cmd.addParameter("@P_DESC_172", pDesc172);
//			cmd.addParameter("@P_DESC_173", pDesc173);
//			cmd.addParameter("@P_DESC_174", pDesc174);
//			cmd.addParameter("@P_DESC_175", pDesc175);
//			cmd.addParameter("@P_DESC_176", pDesc176);
//			cmd.addParameter("@P_DESC_177", pDesc177);
//			cmd.addParameter("@P_DESC_178", pDesc178);
//			cmd.addParameter("@P_DESC_179", pDesc179);
//			cmd.addParameter("@P_DESC_180", pDesc180);
//			cmd.addParameter("@P_DESC_181", pDesc181);
//			cmd.addParameter("@P_DESC_182", pDesc182);
//			cmd.addParameter("@P_DESC_183", pDesc183);
//			cmd.addParameter("@P_DESC_184", pDesc184);
//			cmd.addParameter("@P_DESC_185", pDesc185);
//			cmd.addParameter("@P_DESC_186", pDesc186);
//			cmd.addParameter("@P_DESC_187", pDesc187);
//			cmd.addParameter("@P_DESC_188", pDesc188);
//			cmd.addParameter("@P_DESC_189", pDesc189);
//			cmd.addParameter("@P_DESC_190", pDesc190);
//			cmd.addParameter("@P_DESC_191", pDesc191);
//			cmd.addParameter("@P_DESC_192", pDesc192);
//			cmd.addParameter("@P_DESC_193", pDesc193);
//			cmd.addParameter("@P_DESC_194", pDesc194);
//			cmd.addParameter("@P_DESC_195", pDesc195);
//			cmd.addParameter("@P_DESC_196", pDesc196);
//			cmd.addParameter("@P_DESC_197", pDesc197);
//			cmd.addParameter("@P_DESC_198", pDesc198);
//			cmd.addParameter("@P_DESC_199", pDesc199);
//			cmd.addParameter("@P_DESC_200", pDesc200);
//			cmd.addParameter("@P_DESC_201", pDesc201);
//			cmd.addParameter("@P_DESC_202", pDesc202);
//			cmd.addParameter("@P_DESC_203", pDesc203);
//			cmd.addParameter("@P_DESC_204", pDesc204);
//			cmd.addParameter("@P_DESC_205", pDesc205);
//			cmd.addParameter("@P_DESC_206", pDesc206);
//			cmd.addParameter("@P_DESC_207", pDesc207);
//			cmd.addParameter("@P_DESC_208", pDesc208);
//			cmd.addParameter("@P_DESC_209", pDesc209);
//			cmd.addParameter("@P_DESC_210", pDesc210);
//			cmd.addParameter("@P_DESC_211", pDesc211);
//			cmd.addParameter("@P_DESC_212", pDesc212);
//			cmd.addParameter("@P_DESC_213", pDesc213);
//			cmd.addParameter("@P_DESC_214", pDesc214);
//			cmd.addParameter("@P_DESC_215", pDesc215);
//			cmd.addParameter("@P_DESC_216", pDesc216);
//			cmd.addParameter("@P_DESC_217", pDesc217);
//			cmd.addParameter("@P_DESC_218", pDesc218);
//			cmd.addParameter("@P_DESC_219", pDesc219);
//			cmd.addParameter("@P_DESC_220", pDesc220);
//			cmd.addParameter("@P_DESC_221", pDesc221);
//			cmd.addParameter("@P_DESC_222", pDesc222);
//			cmd.addParameter("@P_DESC_223", pDesc223);
//			cmd.addParameter("@P_DESC_224", pDesc224);
//			cmd.addParameter("@P_DESC_225", pDesc225);
//			cmd.addParameter("@P_DESC_226", pDesc226);
//			cmd.addParameter("@P_DESC_227", pDesc227);
//			cmd.addParameter("@P_DESC_228", pDesc228);
//			cmd.addParameter("@P_DESC_229", pDesc229);
//			cmd.addParameter("@P_DESC_230", pDesc230);
//			cmd.addParameter("@P_DESC_231", pDesc231);
//			cmd.addParameter("@P_DESC_232", pDesc232);
//			cmd.addParameter("@P_DESC_233", pDesc233);
//			cmd.addParameter("@P_DESC_234", pDesc234);
//			cmd.addParameter("@P_DESC_235", pDesc235);
//			cmd.addParameter("@P_DESC_236", pDesc236);
//			cmd.addParameter("@P_DESC_237", pDesc237);
//			cmd.addParameter("@P_DESC_238", pDesc238);
//			cmd.addParameter("@P_DESC_239", pDesc239);
//			cmd.addParameter("@P_DESC_240", pDesc240);
//			cmd.addParameter("@P_DESC_241", pDesc241);
//			cmd.addParameter("@P_DESC_242", pDesc242);
//			cmd.addParameter("@P_DESC_243", pDesc243);
//			cmd.addParameter("@P_DESC_244", pDesc244);
//			cmd.addParameter("@P_DESC_245", pDesc245);
//			cmd.addParameter("@P_DESC_246", pDesc246);
//			cmd.addParameter("@P_DESC_247", pDesc247);
//			cmd.addParameter("@P_DESC_248", pDesc248);
//			cmd.addParameter("@P_DESC_249", pDesc249);
//			cmd.addParameter("@P_DESC_250", pDesc250);
//			cmd.addParameter("@P_DESC_251", pDesc251);
//			cmd.addParameter("@P_DESC_252", pDesc252);
//			cmd.addParameter("@P_DESC_253", pDesc253);
//			cmd.addParameter("@P_DESC_254", pDesc254);
//			cmd.addParameter("@P_DESC_255", pDesc255);
//			cmd.addParameter("@P_DESC_256", pDesc256);
//			cmd.addParameter("@P_DESC_257", pDesc257);
//			cmd.addParameter("@P_DESC_258", pDesc258);
//			cmd.addParameter("@P_DESC_259", pDesc259);
//			cmd.addParameter("@P_DESC_260", pDesc260);
//			cmd.addParameter("@P_DESC_261", pDesc261);
//			cmd.addParameter("@P_DESC_262", pDesc262);
//			cmd.addParameter("@P_DESC_263", pDesc263);
//			cmd.addParameter("@P_DESC_264", pDesc264);
//			cmd.addParameter("@P_DESC_265", pDesc265);
//			cmd.addParameter("@P_DESC_266", pDesc266);
//			cmd.addParameter("@P_DESC_267", pDesc267);
//			cmd.addParameter("@P_DESC_268", pDesc268);
//			cmd.addParameter("@P_DESC_269", pDesc269);
//			cmd.addParameter("@P_DESC_270", pDesc270);
//			cmd.addParameter("@P_DESC_271", pDesc271);
//			cmd.addParameter("@P_DESC_272", pDesc272);
//			cmd.addParameter("@P_DESC_273", pDesc273);
//			cmd.addParameter("@P_DESC_274", pDesc274);
//			cmd.addParameter("@P_DESC_275", pDesc275);
//			cmd.addParameter("@P_DESC_276", pDesc276);
//			cmd.addParameter("@P_DESC_277", pDesc277);
//			cmd.addParameter("@P_DESC_278", pDesc278);
//			cmd.addParameter("@P_DESC_279", pDesc279);
//			cmd.addParameter("@P_DESC_280", pDesc280);
//			cmd.addParameter("@P_DESC_281", pDesc281);
//			cmd.addParameter("@P_DESC_282", pDesc282);
//			cmd.addParameter("@P_DESC_283", pDesc283);
//			cmd.addParameter("@P_DESC_284", pDesc284);
//			cmd.addParameter("@P_DESC_285", pDesc285);
//			cmd.addParameter("@P_DESC_286", pDesc286);
//			cmd.addParameter("@P_DESC_287", pDesc287);
//			cmd.addParameter("@P_DESC_288", pDesc288);
//			cmd.addParameter("@P_DESC_289", pDesc289);
//			cmd.addParameter("@P_DESC_290", pDesc290);
//			cmd.addParameter("@P_DESC_291", pDesc291);
//			cmd.addParameter("@P_DESC_292", pDesc292);
//			cmd.addParameter("@P_DESC_293", pDesc293);
//			cmd.addParameter("@P_DESC_294", pDesc294);
//			cmd.addParameter("@P_DESC_295", pDesc295);
//			cmd.addParameter("@P_DESC_296", pDesc296);
//			cmd.addParameter("@P_DESC_297", pDesc297);
//			cmd.addParameter("@P_DESC_298", pDesc298);
//			cmd.addParameter("@P_DESC_299", pDesc299);
//			cmd.addParameter("@P_DESC_300", pDesc300);
//			cmd.addParameter("@P_DESC_301", pDesc301);
//			cmd.addParameter("@P_DESC_302", pDesc302);
//			cmd.addParameter("@P_DESC_303", pDesc303);
//			cmd.addParameter("@P_DESC_304", pDesc304);
//			cmd.addParameter("@P_DESC_305", pDesc305);
//			cmd.addParameter("@P_DESC_306", pDesc306);
//			cmd.addParameter("@P_DESC_307", pDesc307);
//			cmd.addParameter("@P_DESC_308", pDesc308);
//			cmd.addParameter("@P_DESC_309", pDesc309);
//			cmd.addParameter("@P_DESC_310", pDesc310);
//			cmd.addParameter("@P_DESC_311", pDesc311);
//			cmd.addParameter("@P_DESC_312", pDesc312);
//			cmd.addParameter("@P_DESC_313", pDesc313);
//			cmd.addParameter("@P_DESC_314", pDesc314);
//			cmd.addParameter("@P_DESC_315", pDesc315);
//			cmd.addParameter("@P_DESC_316", pDesc316);
//			cmd.addParameter("@P_DESC_317", pDesc317);
//			cmd.addParameter("@P_DESC_318", pDesc318);
//			cmd.addParameter("@P_DESC_319", pDesc319);
//			cmd.addParameter("@P_DESC_320", pDesc320);
//			cmd.addParameter("@P_DESC_321", pDesc321);
//			cmd.addParameter("@P_DESC_322", pDesc322);
//			cmd.addParameter("@P_DESC_323", pDesc323);
//			cmd.addParameter("@P_DESC_324", pDesc324);
//			cmd.addParameter("@P_DESC_325", pDesc325);
//			cmd.addParameter("@P_DESC_326", pDesc326);
//			cmd.addParameter("@P_DESC_327", pDesc327);
//			cmd.addParameter("@P_DESC_328", pDesc328);
//			cmd.addParameter("@P_DESC_329", pDesc329);
//			cmd.addParameter("@P_DESC_330", pDesc330);
//			cmd.addParameter("@P_DESC_331", pDesc331);
//			cmd.addParameter("@P_DESC_332", pDesc332);
//			cmd.addParameter("@P_DESC_333", pDesc333);
//			cmd.addParameter("@P_DESC_334", pDesc334);
//			cmd.addParameter("@P_DESC_335", pDesc335);
//			cmd.addParameter("@P_DESC_336", pDesc336);
//			cmd.addParameter("@P_DESC_337", pDesc337);
//			cmd.addParameter("@P_DESC_338", pDesc338);
//			cmd.addParameter("@P_DESC_339", pDesc339);
//			cmd.addParameter("@P_DESC_340", pDesc340);
//			cmd.addParameter("@P_DESC_341", pDesc341);
//			cmd.addParameter("@P_DESC_342", pDesc342);
//			cmd.addParameter("@P_DESC_343", pDesc343);
//			cmd.addParameter("@P_DESC_344", pDesc344);
//			cmd.addParameter("@P_DESC_345", pDesc345);
//			cmd.addParameter("@P_DESC_346", pDesc346);
//			cmd.addParameter("@P_DESC_347", pDesc347);
//			cmd.addParameter("@P_DESC_348", pDesc348);
//			cmd.addParameter("@P_DESC_349", pDesc349);
//			cmd.addParameter("@P_DESC_350", pDesc350);
//			cmd.addParameter("@P_DESC_351", pDesc351);
//			cmd.addParameter("@P_DESC_352", pDesc352);
//			cmd.addParameter("@P_DESC_353", pDesc353);
//			cmd.addParameter("@P_DESC_354", pDesc354);
//			cmd.addParameter("@P_DESC_355", pDesc355);
//			cmd.addParameter("@P_DESC_356", pDesc356);
//			cmd.addParameter("@P_DESC_357", pDesc357);
//			cmd.addParameter("@P_DESC_358", pDesc358);
//			cmd.addParameter("@P_DESC_359", pDesc359);
//			cmd.addParameter("@P_DESC_360", pDesc360);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_1", pAssocCssQuest1);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_2", pAssocCssQuest2);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_3", pAssocCssQuest3);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_4", pAssocCssQuest4);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_5", pAssocCssQuest5);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_6", pAssocCssQuest6);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_7", pAssocCssQuest7);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_8", pAssocCssQuest8);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_9", pAssocCssQuest9);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_10", pAssocCssQuest10);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_11", pAssocCssQuest11);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_12", pAssocCssQuest12);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_13", pAssocCssQuest13);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_14", pAssocCssQuest14);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_15", pAssocCssQuest15);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_16", pAssocCssQuest16);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_17", pAssocCssQuest17);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_18", pAssocCssQuest18);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_19", pAssocCssQuest19);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_20", pAssocCssQuest20);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_21", pAssocCssQuest21);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_22", pAssocCssQuest22);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_23", pAssocCssQuest23);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_24", pAssocCssQuest24);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_25", pAssocCssQuest25);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_26", pAssocCssQuest26);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_27", pAssocCssQuest27);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_28", pAssocCssQuest28);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_29", pAssocCssQuest29);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_30", pAssocCssQuest30);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_31", pAssocCssQuest31);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_32", pAssocCssQuest32);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_33", pAssocCssQuest33);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_34", pAssocCssQuest34);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_35", pAssocCssQuest35);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_36", pAssocCssQuest36);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_37", pAssocCssQuest37);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_38", pAssocCssQuest38);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_39", pAssocCssQuest39);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_40", pAssocCssQuest40);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_41", pAssocCssQuest41);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_42", pAssocCssQuest42);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_43", pAssocCssQuest43);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_44", pAssocCssQuest44);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_45", pAssocCssQuest45);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_46", pAssocCssQuest46);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_47", pAssocCssQuest47);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_48", pAssocCssQuest48);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_49", pAssocCssQuest49);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_50", pAssocCssQuest50);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_51", pAssocCssQuest51);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_52", pAssocCssQuest52);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_53", pAssocCssQuest53);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_54", pAssocCssQuest54);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_55", pAssocCssQuest55);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_56", pAssocCssQuest56);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_57", pAssocCssQuest57);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_58", pAssocCssQuest58);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_59", pAssocCssQuest59);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_60", pAssocCssQuest60);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_61", pAssocCssQuest61);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_62", pAssocCssQuest62);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_63", pAssocCssQuest63);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_64", pAssocCssQuest64);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_65", pAssocCssQuest65);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_66", pAssocCssQuest66);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_67", pAssocCssQuest67);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_68", pAssocCssQuest68);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_69", pAssocCssQuest69);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_70", pAssocCssQuest70);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_71", pAssocCssQuest71);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_72", pAssocCssQuest72);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_73", pAssocCssQuest73);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_74", pAssocCssQuest74);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_75", pAssocCssQuest75);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_76", pAssocCssQuest76);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_77", pAssocCssQuest77);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_78", pAssocCssQuest78);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_79", pAssocCssQuest79);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_80", pAssocCssQuest80);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_81", pAssocCssQuest81);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_82", pAssocCssQuest82);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_83", pAssocCssQuest83);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_84", pAssocCssQuest84);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_85", pAssocCssQuest85);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_86", pAssocCssQuest86);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_87", pAssocCssQuest87);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_88", pAssocCssQuest88);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_89", pAssocCssQuest89);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_90", pAssocCssQuest90);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_91", pAssocCssQuest91);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_92", pAssocCssQuest92);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_93", pAssocCssQuest93);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_94", pAssocCssQuest94);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_95", pAssocCssQuest95);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_96", pAssocCssQuest96);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_97", pAssocCssQuest97);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_98", pAssocCssQuest98);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_99", pAssocCssQuest99);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_100", pAssocCssQuest100);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_101", pAssocCssQuest101);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_102", pAssocCssQuest102);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_103", pAssocCssQuest103);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_104", pAssocCssQuest104);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_105", pAssocCssQuest105);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_106", pAssocCssQuest106);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_107", pAssocCssQuest107);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_108", pAssocCssQuest108);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_109", pAssocCssQuest109);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_110", pAssocCssQuest110);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_111", pAssocCssQuest111);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_112", pAssocCssQuest112);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_113", pAssocCssQuest113);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_114", pAssocCssQuest114);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_115", pAssocCssQuest115);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_116", pAssocCssQuest116);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_117", pAssocCssQuest117);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_118", pAssocCssQuest118);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_119", pAssocCssQuest119);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_120", pAssocCssQuest120);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_121", pAssocCssQuest121);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_122", pAssocCssQuest122);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_123", pAssocCssQuest123);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_124", pAssocCssQuest124);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_125", pAssocCssQuest125);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_126", pAssocCssQuest126);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_127", pAssocCssQuest127);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_128", pAssocCssQuest128);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_129", pAssocCssQuest129);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_130", pAssocCssQuest130);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_131", pAssocCssQuest131);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_132", pAssocCssQuest132);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_133", pAssocCssQuest133);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_134", pAssocCssQuest134);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_135", pAssocCssQuest135);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_136", pAssocCssQuest136);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_137", pAssocCssQuest137);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_138", pAssocCssQuest138);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_139", pAssocCssQuest139);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_140", pAssocCssQuest140);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_141", pAssocCssQuest141);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_142", pAssocCssQuest142);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_143", pAssocCssQuest143);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_144", pAssocCssQuest144);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_145", pAssocCssQuest145);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_146", pAssocCssQuest146);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_147", pAssocCssQuest147);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_148", pAssocCssQuest148);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_149", pAssocCssQuest149);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_150", pAssocCssQuest150);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_151", pAssocCssQuest151);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_152", pAssocCssQuest152);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_153", pAssocCssQuest153);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_154", pAssocCssQuest154);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_155", pAssocCssQuest155);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_156", pAssocCssQuest156);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_157", pAssocCssQuest157);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_158", pAssocCssQuest158);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_159", pAssocCssQuest159);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_160", pAssocCssQuest160);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_161", pAssocCssQuest161);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_162", pAssocCssQuest162);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_163", pAssocCssQuest163);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_164", pAssocCssQuest164);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_165", pAssocCssQuest165);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_166", pAssocCssQuest166);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_167", pAssocCssQuest167);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_168", pAssocCssQuest168);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_169", pAssocCssQuest169);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_170", pAssocCssQuest170);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_171", pAssocCssQuest171);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_172", pAssocCssQuest172);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_173", pAssocCssQuest173);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_174", pAssocCssQuest174);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_175", pAssocCssQuest175);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_176", pAssocCssQuest176);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_177", pAssocCssQuest177);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_178", pAssocCssQuest178);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_179", pAssocCssQuest179);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_180", pAssocCssQuest180);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_181", pAssocCssQuest181);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_182", pAssocCssQuest182);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_183", pAssocCssQuest183);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_184", pAssocCssQuest184);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_185", pAssocCssQuest185);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_186", pAssocCssQuest186);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_187", pAssocCssQuest187);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_188", pAssocCssQuest188);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_189", pAssocCssQuest189);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_190", pAssocCssQuest190);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_191", pAssocCssQuest191);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_192", pAssocCssQuest192);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_193", pAssocCssQuest193);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_194", pAssocCssQuest194);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_195", pAssocCssQuest195);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_196", pAssocCssQuest196);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_197", pAssocCssQuest197);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_198", pAssocCssQuest198);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_199", pAssocCssQuest199);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_200", pAssocCssQuest200);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_201", pAssocCssQuest201);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_202", pAssocCssQuest202);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_203", pAssocCssQuest203);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_204", pAssocCssQuest204);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_205", pAssocCssQuest205);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_206", pAssocCssQuest206);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_207", pAssocCssQuest207);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_208", pAssocCssQuest208);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_209", pAssocCssQuest209);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_210", pAssocCssQuest210);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_211", pAssocCssQuest211);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_212", pAssocCssQuest212);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_213", pAssocCssQuest213);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_214", pAssocCssQuest214);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_215", pAssocCssQuest215);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_216", pAssocCssQuest216);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_217", pAssocCssQuest217);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_218", pAssocCssQuest218);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_219", pAssocCssQuest219);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_220", pAssocCssQuest220);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_221", pAssocCssQuest221);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_222", pAssocCssQuest222);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_223", pAssocCssQuest223);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_224", pAssocCssQuest224);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_225", pAssocCssQuest225);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_226", pAssocCssQuest226);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_227", pAssocCssQuest227);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_228", pAssocCssQuest228);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_229", pAssocCssQuest229);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_230", pAssocCssQuest230);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_231", pAssocCssQuest231);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_232", pAssocCssQuest232);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_233", pAssocCssQuest233);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_234", pAssocCssQuest234);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_235", pAssocCssQuest235);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_236", pAssocCssQuest236);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_237", pAssocCssQuest237);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_238", pAssocCssQuest238);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_239", pAssocCssQuest239);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_240", pAssocCssQuest240);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_241", pAssocCssQuest241);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_242", pAssocCssQuest242);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_243", pAssocCssQuest243);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_244", pAssocCssQuest244);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_245", pAssocCssQuest245);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_246", pAssocCssQuest246);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_247", pAssocCssQuest247);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_248", pAssocCssQuest248);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_249", pAssocCssQuest249);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_250", pAssocCssQuest250);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_251", pAssocCssQuest251);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_252", pAssocCssQuest252);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_253", pAssocCssQuest253);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_254", pAssocCssQuest254);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_255", pAssocCssQuest255);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_256", pAssocCssQuest256);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_257", pAssocCssQuest257);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_258", pAssocCssQuest258);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_259", pAssocCssQuest259);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_260", pAssocCssQuest260);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_261", pAssocCssQuest261);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_262", pAssocCssQuest262);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_263", pAssocCssQuest263);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_264", pAssocCssQuest264);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_265", pAssocCssQuest265);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_266", pAssocCssQuest266);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_267", pAssocCssQuest267);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_268", pAssocCssQuest268);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_269", pAssocCssQuest269);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_270", pAssocCssQuest270);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_271", pAssocCssQuest271);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_272", pAssocCssQuest272);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_273", pAssocCssQuest273);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_274", pAssocCssQuest274);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_275", pAssocCssQuest275);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_276", pAssocCssQuest276);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_277", pAssocCssQuest277);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_278", pAssocCssQuest278);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_279", pAssocCssQuest279);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_280", pAssocCssQuest280);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_281", pAssocCssQuest281);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_282", pAssocCssQuest282);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_283", pAssocCssQuest283);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_284", pAssocCssQuest284);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_285", pAssocCssQuest285);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_286", pAssocCssQuest286);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_287", pAssocCssQuest287);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_288", pAssocCssQuest288);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_289", pAssocCssQuest289);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_290", pAssocCssQuest290);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_291", pAssocCssQuest291);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_292", pAssocCssQuest292);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_293", pAssocCssQuest293);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_294", pAssocCssQuest294);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_295", pAssocCssQuest295);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_296", pAssocCssQuest296);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_297", pAssocCssQuest297);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_298", pAssocCssQuest298);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_299", pAssocCssQuest299);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_300", pAssocCssQuest300);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_301", pAssocCssQuest301);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_302", pAssocCssQuest302);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_303", pAssocCssQuest303);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_304", pAssocCssQuest304);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_305", pAssocCssQuest305);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_306", pAssocCssQuest306);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_307", pAssocCssQuest307);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_308", pAssocCssQuest308);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_309", pAssocCssQuest309);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_310", pAssocCssQuest310);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_311", pAssocCssQuest311);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_312", pAssocCssQuest312);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_313", pAssocCssQuest313);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_314", pAssocCssQuest314);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_315", pAssocCssQuest315);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_316", pAssocCssQuest316);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_317", pAssocCssQuest317);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_318", pAssocCssQuest318);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_319", pAssocCssQuest319);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_320", pAssocCssQuest320);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_321", pAssocCssQuest321);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_322", pAssocCssQuest322);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_323", pAssocCssQuest323);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_324", pAssocCssQuest324);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_325", pAssocCssQuest325);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_326", pAssocCssQuest326);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_327", pAssocCssQuest327);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_328", pAssocCssQuest328);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_329", pAssocCssQuest329);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_330", pAssocCssQuest330);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_331", pAssocCssQuest331);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_332", pAssocCssQuest332);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_333", pAssocCssQuest333);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_334", pAssocCssQuest334);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_335", pAssocCssQuest335);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_336", pAssocCssQuest336);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_337", pAssocCssQuest337);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_338", pAssocCssQuest338);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_339", pAssocCssQuest339);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_340", pAssocCssQuest340);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_341", pAssocCssQuest341);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_342", pAssocCssQuest342);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_343", pAssocCssQuest343);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_344", pAssocCssQuest344);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_345", pAssocCssQuest345);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_346", pAssocCssQuest346);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_347", pAssocCssQuest347);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_348", pAssocCssQuest348);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_349", pAssocCssQuest349);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_350", pAssocCssQuest350);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_351", pAssocCssQuest351);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_352", pAssocCssQuest352);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_353", pAssocCssQuest353);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_354", pAssocCssQuest354);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_355", pAssocCssQuest355);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_356", pAssocCssQuest356);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_357", pAssocCssQuest357);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_358", pAssocCssQuest358);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_359", pAssocCssQuest359);
//			cmd.addParameter("@P_ASSOC_CSS_QUEST_360", pAssocCssQuest360);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="UserVarDescRecRow", dataSourceName="USER_VAR_DESC_REC")
	public static class UserVarDescRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DESC_1")
		public NString RDesc1;
		@DbRecordField(dataSourceName="R_DESC_2")
		public NString RDesc2;
		@DbRecordField(dataSourceName="R_DESC_3")
		public NString RDesc3;
		@DbRecordField(dataSourceName="R_DESC_4")
		public NString RDesc4;
		@DbRecordField(dataSourceName="R_DESC_5")
		public NString RDesc5;
		@DbRecordField(dataSourceName="R_DESC_6")
		public NString RDesc6;
		@DbRecordField(dataSourceName="R_DESC_7")
		public NString RDesc7;
		@DbRecordField(dataSourceName="R_DESC_8")
		public NString RDesc8;
		@DbRecordField(dataSourceName="R_DESC_9")
		public NString RDesc9;
		@DbRecordField(dataSourceName="R_DESC_10")
		public NString RDesc10;
		@DbRecordField(dataSourceName="R_DESC_11")
		public NString RDesc11;
		@DbRecordField(dataSourceName="R_DESC_12")
		public NString RDesc12;
		@DbRecordField(dataSourceName="R_DESC_13")
		public NString RDesc13;
		@DbRecordField(dataSourceName="R_DESC_14")
		public NString RDesc14;
		@DbRecordField(dataSourceName="R_DESC_15")
		public NString RDesc15;
		@DbRecordField(dataSourceName="R_DESC_16")
		public NString RDesc16;
		@DbRecordField(dataSourceName="R_DESC_17")
		public NString RDesc17;
		@DbRecordField(dataSourceName="R_DESC_18")
		public NString RDesc18;
		@DbRecordField(dataSourceName="R_DESC_19")
		public NString RDesc19;
		@DbRecordField(dataSourceName="R_DESC_20")
		public NString RDesc20;
		@DbRecordField(dataSourceName="R_DESC_21")
		public NString RDesc21;
		@DbRecordField(dataSourceName="R_DESC_22")
		public NString RDesc22;
		@DbRecordField(dataSourceName="R_DESC_23")
		public NString RDesc23;
		@DbRecordField(dataSourceName="R_DESC_24")
		public NString RDesc24;
		@DbRecordField(dataSourceName="R_DESC_25")
		public NString RDesc25;
		@DbRecordField(dataSourceName="R_DESC_26")
		public NString RDesc26;
		@DbRecordField(dataSourceName="R_DESC_27")
		public NString RDesc27;
		@DbRecordField(dataSourceName="R_DESC_28")
		public NString RDesc28;
		@DbRecordField(dataSourceName="R_DESC_29")
		public NString RDesc29;
		@DbRecordField(dataSourceName="R_DESC_30")
		public NString RDesc30;
		@DbRecordField(dataSourceName="R_DESC_31")
		public NString RDesc31;
		@DbRecordField(dataSourceName="R_DESC_32")
		public NString RDesc32;
		@DbRecordField(dataSourceName="R_DESC_33")
		public NString RDesc33;
		@DbRecordField(dataSourceName="R_DESC_34")
		public NString RDesc34;
		@DbRecordField(dataSourceName="R_DESC_35")
		public NString RDesc35;
		@DbRecordField(dataSourceName="R_DESC_36")
		public NString RDesc36;
		@DbRecordField(dataSourceName="R_DESC_37")
		public NString RDesc37;
		@DbRecordField(dataSourceName="R_DESC_38")
		public NString RDesc38;
		@DbRecordField(dataSourceName="R_DESC_39")
		public NString RDesc39;
		@DbRecordField(dataSourceName="R_DESC_40")
		public NString RDesc40;
		@DbRecordField(dataSourceName="R_DESC_41")
		public NString RDesc41;
		@DbRecordField(dataSourceName="R_DESC_42")
		public NString RDesc42;
		@DbRecordField(dataSourceName="R_DESC_43")
		public NString RDesc43;
		@DbRecordField(dataSourceName="R_DESC_44")
		public NString RDesc44;
		@DbRecordField(dataSourceName="R_DESC_45")
		public NString RDesc45;
		@DbRecordField(dataSourceName="R_DESC_46")
		public NString RDesc46;
		@DbRecordField(dataSourceName="R_DESC_47")
		public NString RDesc47;
		@DbRecordField(dataSourceName="R_DESC_48")
		public NString RDesc48;
		@DbRecordField(dataSourceName="R_DESC_49")
		public NString RDesc49;
		@DbRecordField(dataSourceName="R_DESC_50")
		public NString RDesc50;
		@DbRecordField(dataSourceName="R_DESC_51")
		public NString RDesc51;
		@DbRecordField(dataSourceName="R_DESC_52")
		public NString RDesc52;
		@DbRecordField(dataSourceName="R_DESC_53")
		public NString RDesc53;
		@DbRecordField(dataSourceName="R_DESC_54")
		public NString RDesc54;
		@DbRecordField(dataSourceName="R_DESC_55")
		public NString RDesc55;
		@DbRecordField(dataSourceName="R_DESC_56")
		public NString RDesc56;
		@DbRecordField(dataSourceName="R_DESC_57")
		public NString RDesc57;
		@DbRecordField(dataSourceName="R_DESC_58")
		public NString RDesc58;
		@DbRecordField(dataSourceName="R_DESC_59")
		public NString RDesc59;
		@DbRecordField(dataSourceName="R_DESC_60")
		public NString RDesc60;
		@DbRecordField(dataSourceName="R_DESC_61")
		public NString RDesc61;
		@DbRecordField(dataSourceName="R_DESC_62")
		public NString RDesc62;
		@DbRecordField(dataSourceName="R_DESC_63")
		public NString RDesc63;
		@DbRecordField(dataSourceName="R_DESC_64")
		public NString RDesc64;
		@DbRecordField(dataSourceName="R_DESC_65")
		public NString RDesc65;
		@DbRecordField(dataSourceName="R_DESC_66")
		public NString RDesc66;
		@DbRecordField(dataSourceName="R_DESC_67")
		public NString RDesc67;
		@DbRecordField(dataSourceName="R_DESC_68")
		public NString RDesc68;
		@DbRecordField(dataSourceName="R_DESC_69")
		public NString RDesc69;
		@DbRecordField(dataSourceName="R_DESC_70")
		public NString RDesc70;
		@DbRecordField(dataSourceName="R_DESC_71")
		public NString RDesc71;
		@DbRecordField(dataSourceName="R_DESC_72")
		public NString RDesc72;
		@DbRecordField(dataSourceName="R_DESC_73")
		public NString RDesc73;
		@DbRecordField(dataSourceName="R_DESC_74")
		public NString RDesc74;
		@DbRecordField(dataSourceName="R_DESC_75")
		public NString RDesc75;
		@DbRecordField(dataSourceName="R_DESC_76")
		public NString RDesc76;
		@DbRecordField(dataSourceName="R_DESC_77")
		public NString RDesc77;
		@DbRecordField(dataSourceName="R_DESC_78")
		public NString RDesc78;
		@DbRecordField(dataSourceName="R_DESC_79")
		public NString RDesc79;
		@DbRecordField(dataSourceName="R_DESC_80")
		public NString RDesc80;
		@DbRecordField(dataSourceName="R_DESC_81")
		public NString RDesc81;
		@DbRecordField(dataSourceName="R_DESC_82")
		public NString RDesc82;
		@DbRecordField(dataSourceName="R_DESC_83")
		public NString RDesc83;
		@DbRecordField(dataSourceName="R_DESC_84")
		public NString RDesc84;
		@DbRecordField(dataSourceName="R_DESC_85")
		public NString RDesc85;
		@DbRecordField(dataSourceName="R_DESC_86")
		public NString RDesc86;
		@DbRecordField(dataSourceName="R_DESC_87")
		public NString RDesc87;
		@DbRecordField(dataSourceName="R_DESC_88")
		public NString RDesc88;
		@DbRecordField(dataSourceName="R_DESC_89")
		public NString RDesc89;
		@DbRecordField(dataSourceName="R_DESC_90")
		public NString RDesc90;
		@DbRecordField(dataSourceName="R_DESC_91")
		public NString RDesc91;
		@DbRecordField(dataSourceName="R_DESC_92")
		public NString RDesc92;
		@DbRecordField(dataSourceName="R_DESC_93")
		public NString RDesc93;
		@DbRecordField(dataSourceName="R_DESC_94")
		public NString RDesc94;
		@DbRecordField(dataSourceName="R_DESC_95")
		public NString RDesc95;
		@DbRecordField(dataSourceName="R_DESC_96")
		public NString RDesc96;
		@DbRecordField(dataSourceName="R_DESC_97")
		public NString RDesc97;
		@DbRecordField(dataSourceName="R_DESC_98")
		public NString RDesc98;
		@DbRecordField(dataSourceName="R_DESC_99")
		public NString RDesc99;
		@DbRecordField(dataSourceName="R_DESC_100")
		public NString RDesc100;
		@DbRecordField(dataSourceName="R_DESC_101")
		public NString RDesc101;
		@DbRecordField(dataSourceName="R_DESC_102")
		public NString RDesc102;
		@DbRecordField(dataSourceName="R_DESC_103")
		public NString RDesc103;
		@DbRecordField(dataSourceName="R_DESC_104")
		public NString RDesc104;
		@DbRecordField(dataSourceName="R_DESC_105")
		public NString RDesc105;
		@DbRecordField(dataSourceName="R_DESC_106")
		public NString RDesc106;
		@DbRecordField(dataSourceName="R_DESC_107")
		public NString RDesc107;
		@DbRecordField(dataSourceName="R_DESC_108")
		public NString RDesc108;
		@DbRecordField(dataSourceName="R_DESC_109")
		public NString RDesc109;
		@DbRecordField(dataSourceName="R_DESC_110")
		public NString RDesc110;
		@DbRecordField(dataSourceName="R_DESC_111")
		public NString RDesc111;
		@DbRecordField(dataSourceName="R_DESC_112")
		public NString RDesc112;
		@DbRecordField(dataSourceName="R_DESC_113")
		public NString RDesc113;
		@DbRecordField(dataSourceName="R_DESC_114")
		public NString RDesc114;
		@DbRecordField(dataSourceName="R_DESC_115")
		public NString RDesc115;
		@DbRecordField(dataSourceName="R_DESC_116")
		public NString RDesc116;
		@DbRecordField(dataSourceName="R_DESC_117")
		public NString RDesc117;
		@DbRecordField(dataSourceName="R_DESC_118")
		public NString RDesc118;
		@DbRecordField(dataSourceName="R_DESC_119")
		public NString RDesc119;
		@DbRecordField(dataSourceName="R_DESC_120")
		public NString RDesc120;
		@DbRecordField(dataSourceName="R_DESC_121")
		public NString RDesc121;
		@DbRecordField(dataSourceName="R_DESC_122")
		public NString RDesc122;
		@DbRecordField(dataSourceName="R_DESC_123")
		public NString RDesc123;
		@DbRecordField(dataSourceName="R_DESC_124")
		public NString RDesc124;
		@DbRecordField(dataSourceName="R_DESC_125")
		public NString RDesc125;
		@DbRecordField(dataSourceName="R_DESC_126")
		public NString RDesc126;
		@DbRecordField(dataSourceName="R_DESC_127")
		public NString RDesc127;
		@DbRecordField(dataSourceName="R_DESC_128")
		public NString RDesc128;
		@DbRecordField(dataSourceName="R_DESC_129")
		public NString RDesc129;
		@DbRecordField(dataSourceName="R_DESC_130")
		public NString RDesc130;
		@DbRecordField(dataSourceName="R_DESC_131")
		public NString RDesc131;
		@DbRecordField(dataSourceName="R_DESC_132")
		public NString RDesc132;
		@DbRecordField(dataSourceName="R_DESC_133")
		public NString RDesc133;
		@DbRecordField(dataSourceName="R_DESC_134")
		public NString RDesc134;
		@DbRecordField(dataSourceName="R_DESC_135")
		public NString RDesc135;
		@DbRecordField(dataSourceName="R_DESC_136")
		public NString RDesc136;
		@DbRecordField(dataSourceName="R_DESC_137")
		public NString RDesc137;
		@DbRecordField(dataSourceName="R_DESC_138")
		public NString RDesc138;
		@DbRecordField(dataSourceName="R_DESC_139")
		public NString RDesc139;
		@DbRecordField(dataSourceName="R_DESC_140")
		public NString RDesc140;
		@DbRecordField(dataSourceName="R_DESC_141")
		public NString RDesc141;
		@DbRecordField(dataSourceName="R_DESC_142")
		public NString RDesc142;
		@DbRecordField(dataSourceName="R_DESC_143")
		public NString RDesc143;
		@DbRecordField(dataSourceName="R_DESC_144")
		public NString RDesc144;
		@DbRecordField(dataSourceName="R_DESC_145")
		public NString RDesc145;
		@DbRecordField(dataSourceName="R_DESC_146")
		public NString RDesc146;
		@DbRecordField(dataSourceName="R_DESC_147")
		public NString RDesc147;
		@DbRecordField(dataSourceName="R_DESC_148")
		public NString RDesc148;
		@DbRecordField(dataSourceName="R_DESC_149")
		public NString RDesc149;
		@DbRecordField(dataSourceName="R_DESC_150")
		public NString RDesc150;
		@DbRecordField(dataSourceName="R_DESC_151")
		public NString RDesc151;
		@DbRecordField(dataSourceName="R_DESC_152")
		public NString RDesc152;
		@DbRecordField(dataSourceName="R_DESC_153")
		public NString RDesc153;
		@DbRecordField(dataSourceName="R_DESC_154")
		public NString RDesc154;
		@DbRecordField(dataSourceName="R_DESC_155")
		public NString RDesc155;
		@DbRecordField(dataSourceName="R_DESC_156")
		public NString RDesc156;
		@DbRecordField(dataSourceName="R_DESC_157")
		public NString RDesc157;
		@DbRecordField(dataSourceName="R_DESC_158")
		public NString RDesc158;
		@DbRecordField(dataSourceName="R_DESC_159")
		public NString RDesc159;
		@DbRecordField(dataSourceName="R_DESC_160")
		public NString RDesc160;
		@DbRecordField(dataSourceName="R_DESC_161")
		public NString RDesc161;
		@DbRecordField(dataSourceName="R_DESC_162")
		public NString RDesc162;
		@DbRecordField(dataSourceName="R_DESC_163")
		public NString RDesc163;
		@DbRecordField(dataSourceName="R_DESC_164")
		public NString RDesc164;
		@DbRecordField(dataSourceName="R_DESC_165")
		public NString RDesc165;
		@DbRecordField(dataSourceName="R_DESC_166")
		public NString RDesc166;
		@DbRecordField(dataSourceName="R_DESC_167")
		public NString RDesc167;
		@DbRecordField(dataSourceName="R_DESC_168")
		public NString RDesc168;
		@DbRecordField(dataSourceName="R_DESC_169")
		public NString RDesc169;
		@DbRecordField(dataSourceName="R_DESC_170")
		public NString RDesc170;
		@DbRecordField(dataSourceName="R_DESC_171")
		public NString RDesc171;
		@DbRecordField(dataSourceName="R_DESC_172")
		public NString RDesc172;
		@DbRecordField(dataSourceName="R_DESC_173")
		public NString RDesc173;
		@DbRecordField(dataSourceName="R_DESC_174")
		public NString RDesc174;
		@DbRecordField(dataSourceName="R_DESC_175")
		public NString RDesc175;
		@DbRecordField(dataSourceName="R_DESC_176")
		public NString RDesc176;
		@DbRecordField(dataSourceName="R_DESC_177")
		public NString RDesc177;
		@DbRecordField(dataSourceName="R_DESC_178")
		public NString RDesc178;
		@DbRecordField(dataSourceName="R_DESC_179")
		public NString RDesc179;
		@DbRecordField(dataSourceName="R_DESC_180")
		public NString RDesc180;
		@DbRecordField(dataSourceName="R_DESC_181")
		public NString RDesc181;
		@DbRecordField(dataSourceName="R_DESC_182")
		public NString RDesc182;
		@DbRecordField(dataSourceName="R_DESC_183")
		public NString RDesc183;
		@DbRecordField(dataSourceName="R_DESC_184")
		public NString RDesc184;
		@DbRecordField(dataSourceName="R_DESC_185")
		public NString RDesc185;
		@DbRecordField(dataSourceName="R_DESC_186")
		public NString RDesc186;
		@DbRecordField(dataSourceName="R_DESC_187")
		public NString RDesc187;
		@DbRecordField(dataSourceName="R_DESC_188")
		public NString RDesc188;
		@DbRecordField(dataSourceName="R_DESC_189")
		public NString RDesc189;
		@DbRecordField(dataSourceName="R_DESC_190")
		public NString RDesc190;
		@DbRecordField(dataSourceName="R_DESC_191")
		public NString RDesc191;
		@DbRecordField(dataSourceName="R_DESC_192")
		public NString RDesc192;
		@DbRecordField(dataSourceName="R_DESC_193")
		public NString RDesc193;
		@DbRecordField(dataSourceName="R_DESC_194")
		public NString RDesc194;
		@DbRecordField(dataSourceName="R_DESC_195")
		public NString RDesc195;
		@DbRecordField(dataSourceName="R_DESC_196")
		public NString RDesc196;
		@DbRecordField(dataSourceName="R_DESC_197")
		public NString RDesc197;
		@DbRecordField(dataSourceName="R_DESC_198")
		public NString RDesc198;
		@DbRecordField(dataSourceName="R_DESC_199")
		public NString RDesc199;
		@DbRecordField(dataSourceName="R_DESC_200")
		public NString RDesc200;
		@DbRecordField(dataSourceName="R_DESC_201")
		public NString RDesc201;
		@DbRecordField(dataSourceName="R_DESC_202")
		public NString RDesc202;
		@DbRecordField(dataSourceName="R_DESC_203")
		public NString RDesc203;
		@DbRecordField(dataSourceName="R_DESC_204")
		public NString RDesc204;
		@DbRecordField(dataSourceName="R_DESC_205")
		public NString RDesc205;
		@DbRecordField(dataSourceName="R_DESC_206")
		public NString RDesc206;
		@DbRecordField(dataSourceName="R_DESC_207")
		public NString RDesc207;
		@DbRecordField(dataSourceName="R_DESC_208")
		public NString RDesc208;
		@DbRecordField(dataSourceName="R_DESC_209")
		public NString RDesc209;
		@DbRecordField(dataSourceName="R_DESC_210")
		public NString RDesc210;
		@DbRecordField(dataSourceName="R_DESC_211")
		public NString RDesc211;
		@DbRecordField(dataSourceName="R_DESC_212")
		public NString RDesc212;
		@DbRecordField(dataSourceName="R_DESC_213")
		public NString RDesc213;
		@DbRecordField(dataSourceName="R_DESC_214")
		public NString RDesc214;
		@DbRecordField(dataSourceName="R_DESC_215")
		public NString RDesc215;
		@DbRecordField(dataSourceName="R_DESC_216")
		public NString RDesc216;
		@DbRecordField(dataSourceName="R_DESC_217")
		public NString RDesc217;
		@DbRecordField(dataSourceName="R_DESC_218")
		public NString RDesc218;
		@DbRecordField(dataSourceName="R_DESC_219")
		public NString RDesc219;
		@DbRecordField(dataSourceName="R_DESC_220")
		public NString RDesc220;
		@DbRecordField(dataSourceName="R_DESC_221")
		public NString RDesc221;
		@DbRecordField(dataSourceName="R_DESC_222")
		public NString RDesc222;
		@DbRecordField(dataSourceName="R_DESC_223")
		public NString RDesc223;
		@DbRecordField(dataSourceName="R_DESC_224")
		public NString RDesc224;
		@DbRecordField(dataSourceName="R_DESC_225")
		public NString RDesc225;
		@DbRecordField(dataSourceName="R_DESC_226")
		public NString RDesc226;
		@DbRecordField(dataSourceName="R_DESC_227")
		public NString RDesc227;
		@DbRecordField(dataSourceName="R_DESC_228")
		public NString RDesc228;
		@DbRecordField(dataSourceName="R_DESC_229")
		public NString RDesc229;
		@DbRecordField(dataSourceName="R_DESC_230")
		public NString RDesc230;
		@DbRecordField(dataSourceName="R_DESC_231")
		public NString RDesc231;
		@DbRecordField(dataSourceName="R_DESC_232")
		public NString RDesc232;
		@DbRecordField(dataSourceName="R_DESC_233")
		public NString RDesc233;
		@DbRecordField(dataSourceName="R_DESC_234")
		public NString RDesc234;
		@DbRecordField(dataSourceName="R_DESC_235")
		public NString RDesc235;
		@DbRecordField(dataSourceName="R_DESC_236")
		public NString RDesc236;
		@DbRecordField(dataSourceName="R_DESC_237")
		public NString RDesc237;
		@DbRecordField(dataSourceName="R_DESC_238")
		public NString RDesc238;
		@DbRecordField(dataSourceName="R_DESC_239")
		public NString RDesc239;
		@DbRecordField(dataSourceName="R_DESC_240")
		public NString RDesc240;
		@DbRecordField(dataSourceName="R_DESC_241")
		public NString RDesc241;
		@DbRecordField(dataSourceName="R_DESC_242")
		public NString RDesc242;
		@DbRecordField(dataSourceName="R_DESC_243")
		public NString RDesc243;
		@DbRecordField(dataSourceName="R_DESC_244")
		public NString RDesc244;
		@DbRecordField(dataSourceName="R_DESC_245")
		public NString RDesc245;
		@DbRecordField(dataSourceName="R_DESC_246")
		public NString RDesc246;
		@DbRecordField(dataSourceName="R_DESC_247")
		public NString RDesc247;
		@DbRecordField(dataSourceName="R_DESC_248")
		public NString RDesc248;
		@DbRecordField(dataSourceName="R_DESC_249")
		public NString RDesc249;
		@DbRecordField(dataSourceName="R_DESC_250")
		public NString RDesc250;
		@DbRecordField(dataSourceName="R_DESC_251")
		public NString RDesc251;
		@DbRecordField(dataSourceName="R_DESC_252")
		public NString RDesc252;
		@DbRecordField(dataSourceName="R_DESC_253")
		public NString RDesc253;
		@DbRecordField(dataSourceName="R_DESC_254")
		public NString RDesc254;
		@DbRecordField(dataSourceName="R_DESC_255")
		public NString RDesc255;
		@DbRecordField(dataSourceName="R_DESC_256")
		public NString RDesc256;
		@DbRecordField(dataSourceName="R_DESC_257")
		public NString RDesc257;
		@DbRecordField(dataSourceName="R_DESC_258")
		public NString RDesc258;
		@DbRecordField(dataSourceName="R_DESC_259")
		public NString RDesc259;
		@DbRecordField(dataSourceName="R_DESC_260")
		public NString RDesc260;
		@DbRecordField(dataSourceName="R_DESC_261")
		public NString RDesc261;
		@DbRecordField(dataSourceName="R_DESC_262")
		public NString RDesc262;
		@DbRecordField(dataSourceName="R_DESC_263")
		public NString RDesc263;
		@DbRecordField(dataSourceName="R_DESC_264")
		public NString RDesc264;
		@DbRecordField(dataSourceName="R_DESC_265")
		public NString RDesc265;
		@DbRecordField(dataSourceName="R_DESC_266")
		public NString RDesc266;
		@DbRecordField(dataSourceName="R_DESC_267")
		public NString RDesc267;
		@DbRecordField(dataSourceName="R_DESC_268")
		public NString RDesc268;
		@DbRecordField(dataSourceName="R_DESC_269")
		public NString RDesc269;
		@DbRecordField(dataSourceName="R_DESC_270")
		public NString RDesc270;
		@DbRecordField(dataSourceName="R_DESC_271")
		public NString RDesc271;
		@DbRecordField(dataSourceName="R_DESC_272")
		public NString RDesc272;
		@DbRecordField(dataSourceName="R_DESC_273")
		public NString RDesc273;
		@DbRecordField(dataSourceName="R_DESC_274")
		public NString RDesc274;
		@DbRecordField(dataSourceName="R_DESC_275")
		public NString RDesc275;
		@DbRecordField(dataSourceName="R_DESC_276")
		public NString RDesc276;
		@DbRecordField(dataSourceName="R_DESC_277")
		public NString RDesc277;
		@DbRecordField(dataSourceName="R_DESC_278")
		public NString RDesc278;
		@DbRecordField(dataSourceName="R_DESC_279")
		public NString RDesc279;
		@DbRecordField(dataSourceName="R_DESC_280")
		public NString RDesc280;
		@DbRecordField(dataSourceName="R_DESC_281")
		public NString RDesc281;
		@DbRecordField(dataSourceName="R_DESC_282")
		public NString RDesc282;
		@DbRecordField(dataSourceName="R_DESC_283")
		public NString RDesc283;
		@DbRecordField(dataSourceName="R_DESC_284")
		public NString RDesc284;
		@DbRecordField(dataSourceName="R_DESC_285")
		public NString RDesc285;
		@DbRecordField(dataSourceName="R_DESC_286")
		public NString RDesc286;
		@DbRecordField(dataSourceName="R_DESC_287")
		public NString RDesc287;
		@DbRecordField(dataSourceName="R_DESC_288")
		public NString RDesc288;
		@DbRecordField(dataSourceName="R_DESC_289")
		public NString RDesc289;
		@DbRecordField(dataSourceName="R_DESC_290")
		public NString RDesc290;
		@DbRecordField(dataSourceName="R_DESC_291")
		public NString RDesc291;
		@DbRecordField(dataSourceName="R_DESC_292")
		public NString RDesc292;
		@DbRecordField(dataSourceName="R_DESC_293")
		public NString RDesc293;
		@DbRecordField(dataSourceName="R_DESC_294")
		public NString RDesc294;
		@DbRecordField(dataSourceName="R_DESC_295")
		public NString RDesc295;
		@DbRecordField(dataSourceName="R_DESC_296")
		public NString RDesc296;
		@DbRecordField(dataSourceName="R_DESC_297")
		public NString RDesc297;
		@DbRecordField(dataSourceName="R_DESC_298")
		public NString RDesc298;
		@DbRecordField(dataSourceName="R_DESC_299")
		public NString RDesc299;
		@DbRecordField(dataSourceName="R_DESC_300")
		public NString RDesc300;
		@DbRecordField(dataSourceName="R_DESC_301")
		public NString RDesc301;
		@DbRecordField(dataSourceName="R_DESC_302")
		public NString RDesc302;
		@DbRecordField(dataSourceName="R_DESC_303")
		public NString RDesc303;
		@DbRecordField(dataSourceName="R_DESC_304")
		public NString RDesc304;
		@DbRecordField(dataSourceName="R_DESC_305")
		public NString RDesc305;
		@DbRecordField(dataSourceName="R_DESC_306")
		public NString RDesc306;
		@DbRecordField(dataSourceName="R_DESC_307")
		public NString RDesc307;
		@DbRecordField(dataSourceName="R_DESC_308")
		public NString RDesc308;
		@DbRecordField(dataSourceName="R_DESC_309")
		public NString RDesc309;
		@DbRecordField(dataSourceName="R_DESC_310")
		public NString RDesc310;
		@DbRecordField(dataSourceName="R_DESC_311")
		public NString RDesc311;
		@DbRecordField(dataSourceName="R_DESC_312")
		public NString RDesc312;
		@DbRecordField(dataSourceName="R_DESC_313")
		public NString RDesc313;
		@DbRecordField(dataSourceName="R_DESC_314")
		public NString RDesc314;
		@DbRecordField(dataSourceName="R_DESC_315")
		public NString RDesc315;
		@DbRecordField(dataSourceName="R_DESC_316")
		public NString RDesc316;
		@DbRecordField(dataSourceName="R_DESC_317")
		public NString RDesc317;
		@DbRecordField(dataSourceName="R_DESC_318")
		public NString RDesc318;
		@DbRecordField(dataSourceName="R_DESC_319")
		public NString RDesc319;
		@DbRecordField(dataSourceName="R_DESC_320")
		public NString RDesc320;
		@DbRecordField(dataSourceName="R_DESC_321")
		public NString RDesc321;
		@DbRecordField(dataSourceName="R_DESC_322")
		public NString RDesc322;
		@DbRecordField(dataSourceName="R_DESC_323")
		public NString RDesc323;
		@DbRecordField(dataSourceName="R_DESC_324")
		public NString RDesc324;
		@DbRecordField(dataSourceName="R_DESC_325")
		public NString RDesc325;
		@DbRecordField(dataSourceName="R_DESC_326")
		public NString RDesc326;
		@DbRecordField(dataSourceName="R_DESC_327")
		public NString RDesc327;
		@DbRecordField(dataSourceName="R_DESC_328")
		public NString RDesc328;
		@DbRecordField(dataSourceName="R_DESC_329")
		public NString RDesc329;
		@DbRecordField(dataSourceName="R_DESC_330")
		public NString RDesc330;
		@DbRecordField(dataSourceName="R_DESC_331")
		public NString RDesc331;
		@DbRecordField(dataSourceName="R_DESC_332")
		public NString RDesc332;
		@DbRecordField(dataSourceName="R_DESC_333")
		public NString RDesc333;
		@DbRecordField(dataSourceName="R_DESC_334")
		public NString RDesc334;
		@DbRecordField(dataSourceName="R_DESC_335")
		public NString RDesc335;
		@DbRecordField(dataSourceName="R_DESC_336")
		public NString RDesc336;
		@DbRecordField(dataSourceName="R_DESC_337")
		public NString RDesc337;
		@DbRecordField(dataSourceName="R_DESC_338")
		public NString RDesc338;
		@DbRecordField(dataSourceName="R_DESC_339")
		public NString RDesc339;
		@DbRecordField(dataSourceName="R_DESC_340")
		public NString RDesc340;
		@DbRecordField(dataSourceName="R_DESC_341")
		public NString RDesc341;
		@DbRecordField(dataSourceName="R_DESC_342")
		public NString RDesc342;
		@DbRecordField(dataSourceName="R_DESC_343")
		public NString RDesc343;
		@DbRecordField(dataSourceName="R_DESC_344")
		public NString RDesc344;
		@DbRecordField(dataSourceName="R_DESC_345")
		public NString RDesc345;
		@DbRecordField(dataSourceName="R_DESC_346")
		public NString RDesc346;
		@DbRecordField(dataSourceName="R_DESC_347")
		public NString RDesc347;
		@DbRecordField(dataSourceName="R_DESC_348")
		public NString RDesc348;
		@DbRecordField(dataSourceName="R_DESC_349")
		public NString RDesc349;
		@DbRecordField(dataSourceName="R_DESC_350")
		public NString RDesc350;
		@DbRecordField(dataSourceName="R_DESC_351")
		public NString RDesc351;
		@DbRecordField(dataSourceName="R_DESC_352")
		public NString RDesc352;
		@DbRecordField(dataSourceName="R_DESC_353")
		public NString RDesc353;
		@DbRecordField(dataSourceName="R_DESC_354")
		public NString RDesc354;
		@DbRecordField(dataSourceName="R_DESC_355")
		public NString RDesc355;
		@DbRecordField(dataSourceName="R_DESC_356")
		public NString RDesc356;
		@DbRecordField(dataSourceName="R_DESC_357")
		public NString RDesc357;
		@DbRecordField(dataSourceName="R_DESC_358")
		public NString RDesc358;
		@DbRecordField(dataSourceName="R_DESC_359")
		public NString RDesc359;
		@DbRecordField(dataSourceName="R_DESC_360")
		public NString RDesc360;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_1")
		public NString RAssocCssQuest1;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_2")
		public NString RAssocCssQuest2;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_3")
		public NString RAssocCssQuest3;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_4")
		public NString RAssocCssQuest4;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_5")
		public NString RAssocCssQuest5;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_6")
		public NString RAssocCssQuest6;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_7")
		public NString RAssocCssQuest7;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_8")
		public NString RAssocCssQuest8;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_9")
		public NString RAssocCssQuest9;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_10")
		public NString RAssocCssQuest10;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_11")
		public NString RAssocCssQuest11;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_12")
		public NString RAssocCssQuest12;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_13")
		public NString RAssocCssQuest13;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_14")
		public NString RAssocCssQuest14;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_15")
		public NString RAssocCssQuest15;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_16")
		public NString RAssocCssQuest16;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_17")
		public NString RAssocCssQuest17;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_18")
		public NString RAssocCssQuest18;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_19")
		public NString RAssocCssQuest19;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_20")
		public NString RAssocCssQuest20;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_21")
		public NString RAssocCssQuest21;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_22")
		public NString RAssocCssQuest22;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_23")
		public NString RAssocCssQuest23;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_24")
		public NString RAssocCssQuest24;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_25")
		public NString RAssocCssQuest25;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_26")
		public NString RAssocCssQuest26;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_27")
		public NString RAssocCssQuest27;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_28")
		public NString RAssocCssQuest28;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_29")
		public NString RAssocCssQuest29;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_30")
		public NString RAssocCssQuest30;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_31")
		public NString RAssocCssQuest31;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_32")
		public NString RAssocCssQuest32;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_33")
		public NString RAssocCssQuest33;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_34")
		public NString RAssocCssQuest34;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_35")
		public NString RAssocCssQuest35;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_36")
		public NString RAssocCssQuest36;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_37")
		public NString RAssocCssQuest37;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_38")
		public NString RAssocCssQuest38;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_39")
		public NString RAssocCssQuest39;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_40")
		public NString RAssocCssQuest40;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_41")
		public NString RAssocCssQuest41;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_42")
		public NString RAssocCssQuest42;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_43")
		public NString RAssocCssQuest43;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_44")
		public NString RAssocCssQuest44;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_45")
		public NString RAssocCssQuest45;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_46")
		public NString RAssocCssQuest46;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_47")
		public NString RAssocCssQuest47;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_48")
		public NString RAssocCssQuest48;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_49")
		public NString RAssocCssQuest49;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_50")
		public NString RAssocCssQuest50;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_51")
		public NString RAssocCssQuest51;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_52")
		public NString RAssocCssQuest52;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_53")
		public NString RAssocCssQuest53;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_54")
		public NString RAssocCssQuest54;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_55")
		public NString RAssocCssQuest55;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_56")
		public NString RAssocCssQuest56;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_57")
		public NString RAssocCssQuest57;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_58")
		public NString RAssocCssQuest58;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_59")
		public NString RAssocCssQuest59;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_60")
		public NString RAssocCssQuest60;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_61")
		public NString RAssocCssQuest61;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_62")
		public NString RAssocCssQuest62;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_63")
		public NString RAssocCssQuest63;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_64")
		public NString RAssocCssQuest64;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_65")
		public NString RAssocCssQuest65;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_66")
		public NString RAssocCssQuest66;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_67")
		public NString RAssocCssQuest67;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_68")
		public NString RAssocCssQuest68;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_69")
		public NString RAssocCssQuest69;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_70")
		public NString RAssocCssQuest70;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_71")
		public NString RAssocCssQuest71;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_72")
		public NString RAssocCssQuest72;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_73")
		public NString RAssocCssQuest73;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_74")
		public NString RAssocCssQuest74;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_75")
		public NString RAssocCssQuest75;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_76")
		public NString RAssocCssQuest76;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_77")
		public NString RAssocCssQuest77;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_78")
		public NString RAssocCssQuest78;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_79")
		public NString RAssocCssQuest79;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_80")
		public NString RAssocCssQuest80;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_81")
		public NString RAssocCssQuest81;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_82")
		public NString RAssocCssQuest82;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_83")
		public NString RAssocCssQuest83;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_84")
		public NString RAssocCssQuest84;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_85")
		public NString RAssocCssQuest85;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_86")
		public NString RAssocCssQuest86;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_87")
		public NString RAssocCssQuest87;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_88")
		public NString RAssocCssQuest88;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_89")
		public NString RAssocCssQuest89;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_90")
		public NString RAssocCssQuest90;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_91")
		public NString RAssocCssQuest91;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_92")
		public NString RAssocCssQuest92;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_93")
		public NString RAssocCssQuest93;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_94")
		public NString RAssocCssQuest94;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_95")
		public NString RAssocCssQuest95;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_96")
		public NString RAssocCssQuest96;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_97")
		public NString RAssocCssQuest97;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_98")
		public NString RAssocCssQuest98;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_99")
		public NString RAssocCssQuest99;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_100")
		public NString RAssocCssQuest100;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_101")
		public NString RAssocCssQuest101;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_102")
		public NString RAssocCssQuest102;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_103")
		public NString RAssocCssQuest103;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_104")
		public NString RAssocCssQuest104;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_105")
		public NString RAssocCssQuest105;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_106")
		public NString RAssocCssQuest106;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_107")
		public NString RAssocCssQuest107;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_108")
		public NString RAssocCssQuest108;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_109")
		public NString RAssocCssQuest109;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_110")
		public NString RAssocCssQuest110;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_111")
		public NString RAssocCssQuest111;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_112")
		public NString RAssocCssQuest112;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_113")
		public NString RAssocCssQuest113;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_114")
		public NString RAssocCssQuest114;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_115")
		public NString RAssocCssQuest115;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_116")
		public NString RAssocCssQuest116;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_117")
		public NString RAssocCssQuest117;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_118")
		public NString RAssocCssQuest118;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_119")
		public NString RAssocCssQuest119;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_120")
		public NString RAssocCssQuest120;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_121")
		public NString RAssocCssQuest121;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_122")
		public NString RAssocCssQuest122;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_123")
		public NString RAssocCssQuest123;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_124")
		public NString RAssocCssQuest124;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_125")
		public NString RAssocCssQuest125;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_126")
		public NString RAssocCssQuest126;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_127")
		public NString RAssocCssQuest127;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_128")
		public NString RAssocCssQuest128;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_129")
		public NString RAssocCssQuest129;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_130")
		public NString RAssocCssQuest130;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_131")
		public NString RAssocCssQuest131;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_132")
		public NString RAssocCssQuest132;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_133")
		public NString RAssocCssQuest133;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_134")
		public NString RAssocCssQuest134;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_135")
		public NString RAssocCssQuest135;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_136")
		public NString RAssocCssQuest136;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_137")
		public NString RAssocCssQuest137;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_138")
		public NString RAssocCssQuest138;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_139")
		public NString RAssocCssQuest139;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_140")
		public NString RAssocCssQuest140;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_141")
		public NString RAssocCssQuest141;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_142")
		public NString RAssocCssQuest142;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_143")
		public NString RAssocCssQuest143;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_144")
		public NString RAssocCssQuest144;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_145")
		public NString RAssocCssQuest145;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_146")
		public NString RAssocCssQuest146;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_147")
		public NString RAssocCssQuest147;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_148")
		public NString RAssocCssQuest148;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_149")
		public NString RAssocCssQuest149;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_150")
		public NString RAssocCssQuest150;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_151")
		public NString RAssocCssQuest151;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_152")
		public NString RAssocCssQuest152;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_153")
		public NString RAssocCssQuest153;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_154")
		public NString RAssocCssQuest154;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_155")
		public NString RAssocCssQuest155;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_156")
		public NString RAssocCssQuest156;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_157")
		public NString RAssocCssQuest157;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_158")
		public NString RAssocCssQuest158;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_159")
		public NString RAssocCssQuest159;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_160")
		public NString RAssocCssQuest160;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_161")
		public NString RAssocCssQuest161;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_162")
		public NString RAssocCssQuest162;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_163")
		public NString RAssocCssQuest163;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_164")
		public NString RAssocCssQuest164;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_165")
		public NString RAssocCssQuest165;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_166")
		public NString RAssocCssQuest166;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_167")
		public NString RAssocCssQuest167;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_168")
		public NString RAssocCssQuest168;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_169")
		public NString RAssocCssQuest169;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_170")
		public NString RAssocCssQuest170;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_171")
		public NString RAssocCssQuest171;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_172")
		public NString RAssocCssQuest172;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_173")
		public NString RAssocCssQuest173;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_174")
		public NString RAssocCssQuest174;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_175")
		public NString RAssocCssQuest175;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_176")
		public NString RAssocCssQuest176;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_177")
		public NString RAssocCssQuest177;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_178")
		public NString RAssocCssQuest178;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_179")
		public NString RAssocCssQuest179;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_180")
		public NString RAssocCssQuest180;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_181")
		public NString RAssocCssQuest181;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_182")
		public NString RAssocCssQuest182;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_183")
		public NString RAssocCssQuest183;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_184")
		public NString RAssocCssQuest184;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_185")
		public NString RAssocCssQuest185;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_186")
		public NString RAssocCssQuest186;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_187")
		public NString RAssocCssQuest187;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_188")
		public NString RAssocCssQuest188;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_189")
		public NString RAssocCssQuest189;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_190")
		public NString RAssocCssQuest190;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_191")
		public NString RAssocCssQuest191;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_192")
		public NString RAssocCssQuest192;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_193")
		public NString RAssocCssQuest193;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_194")
		public NString RAssocCssQuest194;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_195")
		public NString RAssocCssQuest195;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_196")
		public NString RAssocCssQuest196;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_197")
		public NString RAssocCssQuest197;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_198")
		public NString RAssocCssQuest198;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_199")
		public NString RAssocCssQuest199;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_200")
		public NString RAssocCssQuest200;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_201")
		public NString RAssocCssQuest201;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_202")
		public NString RAssocCssQuest202;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_203")
		public NString RAssocCssQuest203;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_204")
		public NString RAssocCssQuest204;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_205")
		public NString RAssocCssQuest205;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_206")
		public NString RAssocCssQuest206;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_207")
		public NString RAssocCssQuest207;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_208")
		public NString RAssocCssQuest208;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_209")
		public NString RAssocCssQuest209;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_210")
		public NString RAssocCssQuest210;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_211")
		public NString RAssocCssQuest211;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_212")
		public NString RAssocCssQuest212;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_213")
		public NString RAssocCssQuest213;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_214")
		public NString RAssocCssQuest214;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_215")
		public NString RAssocCssQuest215;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_216")
		public NString RAssocCssQuest216;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_217")
		public NString RAssocCssQuest217;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_218")
		public NString RAssocCssQuest218;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_219")
		public NString RAssocCssQuest219;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_220")
		public NString RAssocCssQuest220;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_221")
		public NString RAssocCssQuest221;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_222")
		public NString RAssocCssQuest222;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_223")
		public NString RAssocCssQuest223;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_224")
		public NString RAssocCssQuest224;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_225")
		public NString RAssocCssQuest225;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_226")
		public NString RAssocCssQuest226;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_227")
		public NString RAssocCssQuest227;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_228")
		public NString RAssocCssQuest228;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_229")
		public NString RAssocCssQuest229;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_230")
		public NString RAssocCssQuest230;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_231")
		public NString RAssocCssQuest231;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_232")
		public NString RAssocCssQuest232;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_233")
		public NString RAssocCssQuest233;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_234")
		public NString RAssocCssQuest234;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_235")
		public NString RAssocCssQuest235;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_236")
		public NString RAssocCssQuest236;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_237")
		public NString RAssocCssQuest237;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_238")
		public NString RAssocCssQuest238;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_239")
		public NString RAssocCssQuest239;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_240")
		public NString RAssocCssQuest240;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_241")
		public NString RAssocCssQuest241;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_242")
		public NString RAssocCssQuest242;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_243")
		public NString RAssocCssQuest243;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_244")
		public NString RAssocCssQuest244;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_245")
		public NString RAssocCssQuest245;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_246")
		public NString RAssocCssQuest246;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_247")
		public NString RAssocCssQuest247;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_248")
		public NString RAssocCssQuest248;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_249")
		public NString RAssocCssQuest249;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_250")
		public NString RAssocCssQuest250;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_251")
		public NString RAssocCssQuest251;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_252")
		public NString RAssocCssQuest252;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_253")
		public NString RAssocCssQuest253;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_254")
		public NString RAssocCssQuest254;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_255")
		public NString RAssocCssQuest255;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_256")
		public NString RAssocCssQuest256;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_257")
		public NString RAssocCssQuest257;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_258")
		public NString RAssocCssQuest258;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_259")
		public NString RAssocCssQuest259;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_260")
		public NString RAssocCssQuest260;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_261")
		public NString RAssocCssQuest261;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_262")
		public NString RAssocCssQuest262;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_263")
		public NString RAssocCssQuest263;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_264")
		public NString RAssocCssQuest264;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_265")
		public NString RAssocCssQuest265;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_266")
		public NString RAssocCssQuest266;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_267")
		public NString RAssocCssQuest267;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_268")
		public NString RAssocCssQuest268;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_269")
		public NString RAssocCssQuest269;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_270")
		public NString RAssocCssQuest270;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_271")
		public NString RAssocCssQuest271;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_272")
		public NString RAssocCssQuest272;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_273")
		public NString RAssocCssQuest273;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_274")
		public NString RAssocCssQuest274;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_275")
		public NString RAssocCssQuest275;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_276")
		public NString RAssocCssQuest276;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_277")
		public NString RAssocCssQuest277;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_278")
		public NString RAssocCssQuest278;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_279")
		public NString RAssocCssQuest279;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_280")
		public NString RAssocCssQuest280;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_281")
		public NString RAssocCssQuest281;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_282")
		public NString RAssocCssQuest282;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_283")
		public NString RAssocCssQuest283;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_284")
		public NString RAssocCssQuest284;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_285")
		public NString RAssocCssQuest285;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_286")
		public NString RAssocCssQuest286;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_287")
		public NString RAssocCssQuest287;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_288")
		public NString RAssocCssQuest288;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_289")
		public NString RAssocCssQuest289;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_290")
		public NString RAssocCssQuest290;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_291")
		public NString RAssocCssQuest291;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_292")
		public NString RAssocCssQuest292;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_293")
		public NString RAssocCssQuest293;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_294")
		public NString RAssocCssQuest294;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_295")
		public NString RAssocCssQuest295;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_296")
		public NString RAssocCssQuest296;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_297")
		public NString RAssocCssQuest297;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_298")
		public NString RAssocCssQuest298;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_299")
		public NString RAssocCssQuest299;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_300")
		public NString RAssocCssQuest300;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_301")
		public NString RAssocCssQuest301;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_302")
		public NString RAssocCssQuest302;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_303")
		public NString RAssocCssQuest303;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_304")
		public NString RAssocCssQuest304;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_305")
		public NString RAssocCssQuest305;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_306")
		public NString RAssocCssQuest306;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_307")
		public NString RAssocCssQuest307;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_308")
		public NString RAssocCssQuest308;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_309")
		public NString RAssocCssQuest309;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_310")
		public NString RAssocCssQuest310;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_311")
		public NString RAssocCssQuest311;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_312")
		public NString RAssocCssQuest312;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_313")
		public NString RAssocCssQuest313;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_314")
		public NString RAssocCssQuest314;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_315")
		public NString RAssocCssQuest315;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_316")
		public NString RAssocCssQuest316;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_317")
		public NString RAssocCssQuest317;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_318")
		public NString RAssocCssQuest318;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_319")
		public NString RAssocCssQuest319;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_320")
		public NString RAssocCssQuest320;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_321")
		public NString RAssocCssQuest321;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_322")
		public NString RAssocCssQuest322;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_323")
		public NString RAssocCssQuest323;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_324")
		public NString RAssocCssQuest324;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_325")
		public NString RAssocCssQuest325;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_326")
		public NString RAssocCssQuest326;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_327")
		public NString RAssocCssQuest327;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_328")
		public NString RAssocCssQuest328;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_329")
		public NString RAssocCssQuest329;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_330")
		public NString RAssocCssQuest330;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_331")
		public NString RAssocCssQuest331;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_332")
		public NString RAssocCssQuest332;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_333")
		public NString RAssocCssQuest333;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_334")
		public NString RAssocCssQuest334;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_335")
		public NString RAssocCssQuest335;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_336")
		public NString RAssocCssQuest336;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_337")
		public NString RAssocCssQuest337;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_338")
		public NString RAssocCssQuest338;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_339")
		public NString RAssocCssQuest339;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_340")
		public NString RAssocCssQuest340;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_341")
		public NString RAssocCssQuest341;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_342")
		public NString RAssocCssQuest342;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_343")
		public NString RAssocCssQuest343;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_344")
		public NString RAssocCssQuest344;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_345")
		public NString RAssocCssQuest345;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_346")
		public NString RAssocCssQuest346;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_347")
		public NString RAssocCssQuest347;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_348")
		public NString RAssocCssQuest348;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_349")
		public NString RAssocCssQuest349;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_350")
		public NString RAssocCssQuest350;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_351")
		public NString RAssocCssQuest351;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_352")
		public NString RAssocCssQuest352;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_353")
		public NString RAssocCssQuest353;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_354")
		public NString RAssocCssQuest354;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_355")
		public NString RAssocCssQuest355;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_356")
		public NString RAssocCssQuest356;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_357")
		public NString RAssocCssQuest357;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_358")
		public NString RAssocCssQuest358;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_359")
		public NString RAssocCssQuest359;
		@DbRecordField(dataSourceName="R_ASSOC_CSS_QUEST_360")
		public NString RAssocCssQuest360;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
