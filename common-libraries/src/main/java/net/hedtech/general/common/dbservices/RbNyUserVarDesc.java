package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbNyUserVarDesc {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(NyUserVarDescRecRow recOne,NyUserVarDescRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, NyUserVarDescRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, NyUserVarDescRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NNumber pKey,NString pUserId,NString pDataOrigin,NString pDesc1,NString pDesc2,NString pDesc3,NString pDesc4,NString pDesc5,NString pDesc6,NString pDesc7,NString pDesc8,NString pDesc9,NString pDesc10,NString pDesc11,NString pDesc12,NString pDesc13,NString pDesc14,NString pDesc15,NString pDesc16,NString pDesc17,NString pDesc18,NString pDesc19,NString pDesc20,NString pDesc21,NString pDesc22,NString pDesc23,NString pDesc24,NString pDesc25,NString pDesc26,NString pDesc27,NString pDesc28,NString pDesc29,NString pDesc30,NString pDesc31,NString pDesc32,NString pDesc33,NString pDesc34,NString pDesc35,NString pDesc36,NString pDesc37,NString pDesc38,NString pDesc39,NString pDesc40,NString pDesc41,NString pDesc42,NString pDesc43,NString pDesc44,NString pDesc45,NString pDesc46,NString pDesc47,NString pDesc48,NString pDesc49,NString pDesc50,NString pDesc51,NString pDesc52,NString pDesc53,NString pDesc54,NString pDesc55,NString pDesc56,NString pDesc57,NString pDesc58,NString pDesc59,NString pDesc60,NString pDesc61,NString pDesc62,NString pDesc63,NString pDesc64,NString pDesc65,NString pDesc66,NString pDesc67,NString pDesc68,NString pDesc69,NString pDesc70,NString pDesc71,NString pDesc72,NString pDesc73,NString pDesc74,NString pDesc75,NString pDesc76,NString pDesc77,NString pDesc78,NString pDesc79,NString pDesc80,NString pDesc81,NString pDesc82,NString pDesc83,NString pDesc84,NString pDesc85,NString pDesc86,NString pDesc87,NString pDesc88,NString pDesc89,NString pDesc90,NString pDesc91,NString pDesc92,NString pDesc93,NString pDesc94,NString pDesc95,NString pDesc96,NString pDesc97,NString pDesc98,NString pDesc99,NString pDesc100,NString pDesc101,NString pDesc102,NString pDesc103,NString pDesc104,NString pDesc105,NString pDesc106,NString pDesc107,NString pDesc108,NString pDesc109,NString pDesc110,NString pDesc111,NString pDesc112,NString pDesc113,NString pDesc114,NString pDesc115,NString pDesc116,NString pDesc117,NString pDesc118,NString pDesc119,NString pDesc120,NString pDesc121,NString pDesc122,NString pDesc123,NString pDesc124,NString pDesc125,NString pDesc126,NString pDesc127,NString pDesc128,NString pDesc129,NString pDesc130,NString pDesc131,NString pDesc132,NString pDesc133,NString pDesc134,NString pDesc135,NString pDesc136,NString pDesc137,NString pDesc138,NString pDesc139,NString pDesc140,NString pDesc141,NString pDesc142,NString pDesc143,NString pDesc144,NString pDesc145,NString pDesc146,NString pDesc147,NString pDesc148,NString pDesc149,NString pDesc150,NString pDesc151,NString pDesc152,NString pDesc153,NString pDesc154,NString pDesc155,NString pDesc156,NString pDesc157,NString pDesc158,NString pDesc159,NString pDesc160,NString pDesc161,NString pDesc162,NString pDesc163,NString pDesc164,NString pDesc165,NString pDesc166,NString pDesc167,NString pDesc168,NString pDesc169,NString pDesc170,NString pDesc171,NString pDesc172,NString pDesc173,NString pDesc174,NString pDesc175,NString pDesc176,NString pDesc177,NString pDesc178,NString pDesc179,NString pDesc180,NString pDesc181,NString pDesc182,NString pDesc183,NString pDesc184,NString pDesc185,NString pDesc186,NString pDesc187,NString pDesc188,NString pDesc189,NString pDesc190,NString pDesc191,NString pDesc192,NString pDesc193,NString pDesc194,NString pDesc195,NString pDesc196,NString pDesc197,NString pDesc198,NString pDesc199,NString pDesc200,NString pDesc201,NString pDesc202,NString pDesc203,NString pDesc204,NString pDesc205,NString pDesc206,NString pDesc207,NString pDesc208,NString pDesc209,NString pDesc210,NString pDesc211,NString pDesc212,NString pDesc213,NString pDesc214,NString pDesc215,NString pDesc216,NString pDesc217,NString pDesc218,NString pDesc219,NString pDesc220,NString pDesc221,NString pDesc222,NString pDesc223,NString pDesc224,NString pDesc225,NString pDesc226,NString pDesc227,NString pDesc228,NString pDesc229,NString pDesc230,NString pDesc231,NString pDesc232,NString pDesc233,NString pDesc234,NString pDesc235,NString pDesc236,NString pDesc237,NString pDesc238,NString pDesc239,NString pDesc240,NString pDesc241,NString pDesc242,NString pDesc243,NString pDesc244,NString pDesc245,NString pDesc246,NString pDesc247,NString pDesc248,NString pDesc249,NString pDesc250,NString pDesc251,NString pDesc252,NString pDesc253,NString pDesc254,NString pDesc255,NString pDesc256,NString pDesc257,NString pDesc258,NString pDesc259,NString pDesc260,NString pDesc261,NString pDesc262,NString pDesc263,NString pDesc264,NString pDesc265,NString pDesc266,NString pDesc267,NString pDesc268,NString pDesc269,NString pDesc270,NString pDesc271,NString pDesc272,NString pDesc273,NString pDesc274,NString pDesc275,NString pDesc276,NString pDesc277,NString pDesc278,NString pDesc279,NString pDesc280,NString pDesc281,NString pDesc282,NString pDesc283,NString pDesc284,NString pDesc285,NString pDesc286,NString pDesc287,NString pDesc288,NString pDesc289,NString pDesc290,NString pDesc291,NString pDesc292,NString pDesc293,NString pDesc294,NString pDesc295,NString pDesc296,NString pDesc297,NString pDesc298,NString pDesc299,NString pDesc300,NString pDesc301,NString pDesc302,NString pDesc303,NString pDesc304,NString pDesc305,NString pDesc306,NString pDesc307,NString pDesc308,NString pDesc309,NString pDesc310,NString pDesc311,NString pDesc312,NString pDesc313,NString pDesc314,NString pDesc315,NString pDesc316,NString pDesc317,NString pDesc318,NString pDesc319,NString pDesc320,NString pDesc321,NString pDesc322,NString pDesc323,NString pDesc324,NString pDesc325,NString pDesc326,NString pDesc327,NString pDesc328,NString pDesc329,NString pDesc330,NString pDesc331,NString pDesc332,NString pDesc333,NString pDesc334,NString pDesc335,NString pDesc336,NString pDesc337,NString pDesc338,NString pDesc339,NString pDesc340,NString pDesc341,NString pDesc342,NString pDesc343,NString pDesc344,NString pDesc345,NString pDesc346,NString pDesc347,NString pDesc348,NString pDesc349,NString pDesc350,NString pDesc351,NString pDesc352,NString pDesc353,NString pDesc354,NString pDesc355,NString pDesc356,NString pDesc357,NString pDesc358,NString pDesc359,NString pDesc360,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_KEY", pKey);
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
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NNumber pKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pKey,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_KEY", pKey);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NNumber pKey,NString pUserId,NString pDataOrigin,NString pDesc1,NString pDesc2,NString pDesc3,NString pDesc4,NString pDesc5,NString pDesc6,NString pDesc7,NString pDesc8,NString pDesc9,NString pDesc10,NString pDesc11,NString pDesc12,NString pDesc13,NString pDesc14,NString pDesc15,NString pDesc16,NString pDesc17,NString pDesc18,NString pDesc19,NString pDesc20,NString pDesc21,NString pDesc22,NString pDesc23,NString pDesc24,NString pDesc25,NString pDesc26,NString pDesc27,NString pDesc28,NString pDesc29,NString pDesc30,NString pDesc31,NString pDesc32,NString pDesc33,NString pDesc34,NString pDesc35,NString pDesc36,NString pDesc37,NString pDesc38,NString pDesc39,NString pDesc40,NString pDesc41,NString pDesc42,NString pDesc43,NString pDesc44,NString pDesc45,NString pDesc46,NString pDesc47,NString pDesc48,NString pDesc49,NString pDesc50,NString pDesc51,NString pDesc52,NString pDesc53,NString pDesc54,NString pDesc55,NString pDesc56,NString pDesc57,NString pDesc58,NString pDesc59,NString pDesc60,NString pDesc61,NString pDesc62,NString pDesc63,NString pDesc64,NString pDesc65,NString pDesc66,NString pDesc67,NString pDesc68,NString pDesc69,NString pDesc70,NString pDesc71,NString pDesc72,NString pDesc73,NString pDesc74,NString pDesc75,NString pDesc76,NString pDesc77,NString pDesc78,NString pDesc79,NString pDesc80,NString pDesc81,NString pDesc82,NString pDesc83,NString pDesc84,NString pDesc85,NString pDesc86,NString pDesc87,NString pDesc88,NString pDesc89,NString pDesc90,NString pDesc91,NString pDesc92,NString pDesc93,NString pDesc94,NString pDesc95,NString pDesc96,NString pDesc97,NString pDesc98,NString pDesc99,NString pDesc100,NString pDesc101,NString pDesc102,NString pDesc103,NString pDesc104,NString pDesc105,NString pDesc106,NString pDesc107,NString pDesc108,NString pDesc109,NString pDesc110,NString pDesc111,NString pDesc112,NString pDesc113,NString pDesc114,NString pDesc115,NString pDesc116,NString pDesc117,NString pDesc118,NString pDesc119,NString pDesc120,NString pDesc121,NString pDesc122,NString pDesc123,NString pDesc124,NString pDesc125,NString pDesc126,NString pDesc127,NString pDesc128,NString pDesc129,NString pDesc130,NString pDesc131,NString pDesc132,NString pDesc133,NString pDesc134,NString pDesc135,NString pDesc136,NString pDesc137,NString pDesc138,NString pDesc139,NString pDesc140,NString pDesc141,NString pDesc142,NString pDesc143,NString pDesc144,NString pDesc145,NString pDesc146,NString pDesc147,NString pDesc148,NString pDesc149,NString pDesc150,NString pDesc151,NString pDesc152,NString pDesc153,NString pDesc154,NString pDesc155,NString pDesc156,NString pDesc157,NString pDesc158,NString pDesc159,NString pDesc160,NString pDesc161,NString pDesc162,NString pDesc163,NString pDesc164,NString pDesc165,NString pDesc166,NString pDesc167,NString pDesc168,NString pDesc169,NString pDesc170,NString pDesc171,NString pDesc172,NString pDesc173,NString pDesc174,NString pDesc175,NString pDesc176,NString pDesc177,NString pDesc178,NString pDesc179,NString pDesc180,NString pDesc181,NString pDesc182,NString pDesc183,NString pDesc184,NString pDesc185,NString pDesc186,NString pDesc187,NString pDesc188,NString pDesc189,NString pDesc190,NString pDesc191,NString pDesc192,NString pDesc193,NString pDesc194,NString pDesc195,NString pDesc196,NString pDesc197,NString pDesc198,NString pDesc199,NString pDesc200,NString pDesc201,NString pDesc202,NString pDesc203,NString pDesc204,NString pDesc205,NString pDesc206,NString pDesc207,NString pDesc208,NString pDesc209,NString pDesc210,NString pDesc211,NString pDesc212,NString pDesc213,NString pDesc214,NString pDesc215,NString pDesc216,NString pDesc217,NString pDesc218,NString pDesc219,NString pDesc220,NString pDesc221,NString pDesc222,NString pDesc223,NString pDesc224,NString pDesc225,NString pDesc226,NString pDesc227,NString pDesc228,NString pDesc229,NString pDesc230,NString pDesc231,NString pDesc232,NString pDesc233,NString pDesc234,NString pDesc235,NString pDesc236,NString pDesc237,NString pDesc238,NString pDesc239,NString pDesc240,NString pDesc241,NString pDesc242,NString pDesc243,NString pDesc244,NString pDesc245,NString pDesc246,NString pDesc247,NString pDesc248,NString pDesc249,NString pDesc250,NString pDesc251,NString pDesc252,NString pDesc253,NString pDesc254,NString pDesc255,NString pDesc256,NString pDesc257,NString pDesc258,NString pDesc259,NString pDesc260,NString pDesc261,NString pDesc262,NString pDesc263,NString pDesc264,NString pDesc265,NString pDesc266,NString pDesc267,NString pDesc268,NString pDesc269,NString pDesc270,NString pDesc271,NString pDesc272,NString pDesc273,NString pDesc274,NString pDesc275,NString pDesc276,NString pDesc277,NString pDesc278,NString pDesc279,NString pDesc280,NString pDesc281,NString pDesc282,NString pDesc283,NString pDesc284,NString pDesc285,NString pDesc286,NString pDesc287,NString pDesc288,NString pDesc289,NString pDesc290,NString pDesc291,NString pDesc292,NString pDesc293,NString pDesc294,NString pDesc295,NString pDesc296,NString pDesc297,NString pDesc298,NString pDesc299,NString pDesc300,NString pDesc301,NString pDesc302,NString pDesc303,NString pDesc304,NString pDesc305,NString pDesc306,NString pDesc307,NString pDesc308,NString pDesc309,NString pDesc310,NString pDesc311,NString pDesc312,NString pDesc313,NString pDesc314,NString pDesc315,NString pDesc316,NString pDesc317,NString pDesc318,NString pDesc319,NString pDesc320,NString pDesc321,NString pDesc322,NString pDesc323,NString pDesc324,NString pDesc325,NString pDesc326,NString pDesc327,NString pDesc328,NString pDesc329,NString pDesc330,NString pDesc331,NString pDesc332,NString pDesc333,NString pDesc334,NString pDesc335,NString pDesc336,NString pDesc337,NString pDesc338,NString pDesc339,NString pDesc340,NString pDesc341,NString pDesc342,NString pDesc343,NString pDesc344,NString pDesc345,NString pDesc346,NString pDesc347,NString pDesc348,NString pDesc349,NString pDesc350,NString pDesc351,NString pDesc352,NString pDesc353,NString pDesc354,NString pDesc355,NString pDesc356,NString pDesc357,NString pDesc358,NString pDesc359,NString pDesc360,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_NY_USER_VAR_DESC.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_KEY", pKey);
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
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="NyUserVarDescRecRow", dataSourceName="NY_USER_VAR_DESC_REC")
	public static class NyUserVarDescRecRow
	{
		@DbRecordField(dataSourceName="R_KEY")
		public NNumber RKey;
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
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
