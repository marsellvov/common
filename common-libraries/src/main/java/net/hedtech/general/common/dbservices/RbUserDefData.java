package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbUserDefData {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(UserDefDataRecRow recOne,UserDefDataRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, UserDefDataRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, UserDefDataRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pValue1,NString pValue2,NString pValue3,NString pValue4,NString pValue5,NString pValue6,NString pValue7,NString pValue8,NString pValue9,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pValue51,NString pValue52,NString pValue53,NString pValue54,NString pValue55,NString pValue56,NString pValue57,NString pValue58,NString pValue59,NString pValue60,NString pInfcCode,NString pValue61,NString pValue62,NString pValue63,NString pValue64,NString pValue65,NString pValue66,NString pValue67,NString pValue68,NString pValue69,NString pValue70,NString pValue71,NString pValue72,NString pValue73,NString pValue74,NString pValue75,NString pValue76,NString pValue77,NString pValue78,NString pValue79,NString pValue80,NString pValue81,NString pValue82,NString pValue83,NString pValue84,NString pValue85,NString pValue86,NString pValue87,NString pValue88,NString pValue89,NString pValue90,NString pValue91,NString pValue92,NString pValue93,NString pValue94,NString pValue95,NString pValue96,NString pValue97,NString pValue98,NString pValue99,NString pValue100,NString pValue101,NString pValue102,NString pValue103,NString pValue104,NString pValue105,NString pValue106,NString pValue107,NString pValue108,NString pValue109,NString pValue110,NString pValue111,NString pValue112,NString pValue113,NString pValue114,NString pValue115,NString pValue116,NString pValue117,NString pValue118,NString pValue119,NString pValue120,NString pValue121,NString pValue122,NString pValue123,NString pValue124,NString pValue125,NString pValue126,NString pValue127,NString pValue128,NString pValue129,NString pValue130,NString pValue131,NString pValue132,NString pValue133,NString pValue134,NString pValue135,NString pValue136,NString pValue137,NString pValue138,NString pValue139,NString pValue140,NString pValue141,NString pValue142,NString pValue143,NString pValue144,NString pValue145,NString pValue146,NString pValue147,NString pValue148,NString pValue149,NString pValue150,NString pValue151,NString pValue152,NString pValue153,NString pValue154,NString pValue155,NString pValue156,NString pValue157,NString pValue158,NString pValue159,NString pValue160,NString pValue161,NString pValue162,NString pValue163,NString pValue164,NString pValue165,NString pValue166,NString pValue167,NString pValue168,NString pValue169,NString pValue170,NString pValue171,NString pValue172,NString pValue173,NString pValue174,NString pValue175,NString pValue176,NString pValue177,NString pValue178,NString pValue179,NString pValue180,NString pValue181,NString pValue182,NString pValue183,NString pValue184,NString pValue185,NString pValue186,NString pValue187,NString pValue188,NString pValue189,NString pValue190,NString pValue191,NString pValue192,NString pValue193,NString pValue194,NString pValue195,NString pValue196,NString pValue197,NString pValue198,NString pValue199,NString pValue200,NString pValue201,NString pValue202,NString pValue203,NString pValue204,NString pValue205,NString pValue206,NString pValue207,NString pValue208,NString pValue209,NString pValue210,NString pValue211,NString pValue212,NString pValue213,NString pValue214,NString pValue215,NString pValue216,NString pValue217,NString pValue218,NString pValue219,NString pValue220,NString pValue221,NString pValue222,NString pValue223,NString pValue224,NString pValue225,NString pValue226,NString pValue227,NString pValue228,NString pValue229,NString pValue230,NString pValue231,NString pValue232,NString pValue233,NString pValue234,NString pValue235,NString pValue236,NString pValue237,NString pValue238,NString pValue239,NString pValue240,NString pValue241,NString pValue242,NString pValue243,NString pValue244,NString pValue245,NString pValue246,NString pValue247,NString pValue248,NString pValue249,NString pValue250,NString pValue251,NString pValue252,NString pValue253,NString pValue254,NString pValue255,NString pValue256,NString pValue257,NString pValue258,NString pValue259,NString pValue260,NString pValue261,NString pValue262,NString pValue263,NString pValue264,NString pValue265,NString pValue266,NString pValue267,NString pValue268,NString pValue269,NString pValue270,NString pValue271,NString pValue272,NString pValue273,NString pValue274,NString pValue275,NString pValue276,NString pValue277,NString pValue278,NString pValue279,NString pValue280,NString pValue281,NString pValue282,NString pValue283,NString pValue284,NString pValue285,NString pValue286,NString pValue287,NString pValue288,NString pValue289,NString pValue290,NString pValue291,NString pValue292,NString pValue293,NString pValue294,NString pValue295,NString pValue296,NString pValue297,NString pValue298,NString pValue299,NString pValue300,NString pValue301,NString pValue302,NString pValue303,NString pValue304,NString pValue305,NString pValue306,NString pValue307,NString pValue308,NString pValue309,NString pValue310,NString pValue311,NString pValue312,NString pValue313,NString pValue314,NString pValue315,NString pValue316,NString pValue317,NString pValue318,NString pValue319,NString pValue320,NString pValue321,NString pValue322,NString pValue323,NString pValue324,NString pValue325,NString pValue326,NString pValue327,NString pValue328,NString pValue329,NString pValue330,NString pValue331,NString pValue332,NString pValue333,NString pValue334,NString pValue335,NString pValue336,NString pValue337,NString pValue338,NString pValue339,NString pValue340,NString pValue341,NString pValue342,NString pValue343,NString pValue344,NString pValue345,NString pValue346,NString pValue347,NString pValue348,NString pValue349,NString pValue350,NString pValue351,NString pValue352,NString pValue353,NString pValue354,NString pValue355,NString pValue356,NString pValue357,NString pValue358,NString pValue359,NString pValue360,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_VALUE_1", pValue1);
//			cmd.addParameter("@P_VALUE_2", pValue2);
//			cmd.addParameter("@P_VALUE_3", pValue3);
//			cmd.addParameter("@P_VALUE_4", pValue4);
//			cmd.addParameter("@P_VALUE_5", pValue5);
//			cmd.addParameter("@P_VALUE_6", pValue6);
//			cmd.addParameter("@P_VALUE_7", pValue7);
//			cmd.addParameter("@P_VALUE_8", pValue8);
//			cmd.addParameter("@P_VALUE_9", pValue9);
//			cmd.addParameter("@P_VALUE_10", pValue10);
//			cmd.addParameter("@P_VALUE_11", pValue11);
//			cmd.addParameter("@P_VALUE_12", pValue12);
//			cmd.addParameter("@P_VALUE_13", pValue13);
//			cmd.addParameter("@P_VALUE_14", pValue14);
//			cmd.addParameter("@P_VALUE_15", pValue15);
//			cmd.addParameter("@P_VALUE_16", pValue16);
//			cmd.addParameter("@P_VALUE_17", pValue17);
//			cmd.addParameter("@P_VALUE_18", pValue18);
//			cmd.addParameter("@P_VALUE_19", pValue19);
//			cmd.addParameter("@P_VALUE_20", pValue20);
//			cmd.addParameter("@P_VALUE_21", pValue21);
//			cmd.addParameter("@P_VALUE_22", pValue22);
//			cmd.addParameter("@P_VALUE_23", pValue23);
//			cmd.addParameter("@P_VALUE_24", pValue24);
//			cmd.addParameter("@P_VALUE_25", pValue25);
//			cmd.addParameter("@P_VALUE_26", pValue26);
//			cmd.addParameter("@P_VALUE_27", pValue27);
//			cmd.addParameter("@P_VALUE_28", pValue28);
//			cmd.addParameter("@P_VALUE_29", pValue29);
//			cmd.addParameter("@P_VALUE_30", pValue30);
//			cmd.addParameter("@P_VALUE_31", pValue31);
//			cmd.addParameter("@P_VALUE_32", pValue32);
//			cmd.addParameter("@P_VALUE_33", pValue33);
//			cmd.addParameter("@P_VALUE_34", pValue34);
//			cmd.addParameter("@P_VALUE_35", pValue35);
//			cmd.addParameter("@P_VALUE_36", pValue36);
//			cmd.addParameter("@P_VALUE_37", pValue37);
//			cmd.addParameter("@P_VALUE_38", pValue38);
//			cmd.addParameter("@P_VALUE_39", pValue39);
//			cmd.addParameter("@P_VALUE_40", pValue40);
//			cmd.addParameter("@P_VALUE_41", pValue41);
//			cmd.addParameter("@P_VALUE_42", pValue42);
//			cmd.addParameter("@P_VALUE_43", pValue43);
//			cmd.addParameter("@P_VALUE_44", pValue44);
//			cmd.addParameter("@P_VALUE_45", pValue45);
//			cmd.addParameter("@P_VALUE_46", pValue46);
//			cmd.addParameter("@P_VALUE_47", pValue47);
//			cmd.addParameter("@P_VALUE_48", pValue48);
//			cmd.addParameter("@P_VALUE_49", pValue49);
//			cmd.addParameter("@P_VALUE_50", pValue50);
//			cmd.addParameter("@P_VALUE_51", pValue51);
//			cmd.addParameter("@P_VALUE_52", pValue52);
//			cmd.addParameter("@P_VALUE_53", pValue53);
//			cmd.addParameter("@P_VALUE_54", pValue54);
//			cmd.addParameter("@P_VALUE_55", pValue55);
//			cmd.addParameter("@P_VALUE_56", pValue56);
//			cmd.addParameter("@P_VALUE_57", pValue57);
//			cmd.addParameter("@P_VALUE_58", pValue58);
//			cmd.addParameter("@P_VALUE_59", pValue59);
//			cmd.addParameter("@P_VALUE_60", pValue60);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_VALUE_61", pValue61);
//			cmd.addParameter("@P_VALUE_62", pValue62);
//			cmd.addParameter("@P_VALUE_63", pValue63);
//			cmd.addParameter("@P_VALUE_64", pValue64);
//			cmd.addParameter("@P_VALUE_65", pValue65);
//			cmd.addParameter("@P_VALUE_66", pValue66);
//			cmd.addParameter("@P_VALUE_67", pValue67);
//			cmd.addParameter("@P_VALUE_68", pValue68);
//			cmd.addParameter("@P_VALUE_69", pValue69);
//			cmd.addParameter("@P_VALUE_70", pValue70);
//			cmd.addParameter("@P_VALUE_71", pValue71);
//			cmd.addParameter("@P_VALUE_72", pValue72);
//			cmd.addParameter("@P_VALUE_73", pValue73);
//			cmd.addParameter("@P_VALUE_74", pValue74);
//			cmd.addParameter("@P_VALUE_75", pValue75);
//			cmd.addParameter("@P_VALUE_76", pValue76);
//			cmd.addParameter("@P_VALUE_77", pValue77);
//			cmd.addParameter("@P_VALUE_78", pValue78);
//			cmd.addParameter("@P_VALUE_79", pValue79);
//			cmd.addParameter("@P_VALUE_80", pValue80);
//			cmd.addParameter("@P_VALUE_81", pValue81);
//			cmd.addParameter("@P_VALUE_82", pValue82);
//			cmd.addParameter("@P_VALUE_83", pValue83);
//			cmd.addParameter("@P_VALUE_84", pValue84);
//			cmd.addParameter("@P_VALUE_85", pValue85);
//			cmd.addParameter("@P_VALUE_86", pValue86);
//			cmd.addParameter("@P_VALUE_87", pValue87);
//			cmd.addParameter("@P_VALUE_88", pValue88);
//			cmd.addParameter("@P_VALUE_89", pValue89);
//			cmd.addParameter("@P_VALUE_90", pValue90);
//			cmd.addParameter("@P_VALUE_91", pValue91);
//			cmd.addParameter("@P_VALUE_92", pValue92);
//			cmd.addParameter("@P_VALUE_93", pValue93);
//			cmd.addParameter("@P_VALUE_94", pValue94);
//			cmd.addParameter("@P_VALUE_95", pValue95);
//			cmd.addParameter("@P_VALUE_96", pValue96);
//			cmd.addParameter("@P_VALUE_97", pValue97);
//			cmd.addParameter("@P_VALUE_98", pValue98);
//			cmd.addParameter("@P_VALUE_99", pValue99);
//			cmd.addParameter("@P_VALUE_100", pValue100);
//			cmd.addParameter("@P_VALUE_101", pValue101);
//			cmd.addParameter("@P_VALUE_102", pValue102);
//			cmd.addParameter("@P_VALUE_103", pValue103);
//			cmd.addParameter("@P_VALUE_104", pValue104);
//			cmd.addParameter("@P_VALUE_105", pValue105);
//			cmd.addParameter("@P_VALUE_106", pValue106);
//			cmd.addParameter("@P_VALUE_107", pValue107);
//			cmd.addParameter("@P_VALUE_108", pValue108);
//			cmd.addParameter("@P_VALUE_109", pValue109);
//			cmd.addParameter("@P_VALUE_110", pValue110);
//			cmd.addParameter("@P_VALUE_111", pValue111);
//			cmd.addParameter("@P_VALUE_112", pValue112);
//			cmd.addParameter("@P_VALUE_113", pValue113);
//			cmd.addParameter("@P_VALUE_114", pValue114);
//			cmd.addParameter("@P_VALUE_115", pValue115);
//			cmd.addParameter("@P_VALUE_116", pValue116);
//			cmd.addParameter("@P_VALUE_117", pValue117);
//			cmd.addParameter("@P_VALUE_118", pValue118);
//			cmd.addParameter("@P_VALUE_119", pValue119);
//			cmd.addParameter("@P_VALUE_120", pValue120);
//			cmd.addParameter("@P_VALUE_121", pValue121);
//			cmd.addParameter("@P_VALUE_122", pValue122);
//			cmd.addParameter("@P_VALUE_123", pValue123);
//			cmd.addParameter("@P_VALUE_124", pValue124);
//			cmd.addParameter("@P_VALUE_125", pValue125);
//			cmd.addParameter("@P_VALUE_126", pValue126);
//			cmd.addParameter("@P_VALUE_127", pValue127);
//			cmd.addParameter("@P_VALUE_128", pValue128);
//			cmd.addParameter("@P_VALUE_129", pValue129);
//			cmd.addParameter("@P_VALUE_130", pValue130);
//			cmd.addParameter("@P_VALUE_131", pValue131);
//			cmd.addParameter("@P_VALUE_132", pValue132);
//			cmd.addParameter("@P_VALUE_133", pValue133);
//			cmd.addParameter("@P_VALUE_134", pValue134);
//			cmd.addParameter("@P_VALUE_135", pValue135);
//			cmd.addParameter("@P_VALUE_136", pValue136);
//			cmd.addParameter("@P_VALUE_137", pValue137);
//			cmd.addParameter("@P_VALUE_138", pValue138);
//			cmd.addParameter("@P_VALUE_139", pValue139);
//			cmd.addParameter("@P_VALUE_140", pValue140);
//			cmd.addParameter("@P_VALUE_141", pValue141);
//			cmd.addParameter("@P_VALUE_142", pValue142);
//			cmd.addParameter("@P_VALUE_143", pValue143);
//			cmd.addParameter("@P_VALUE_144", pValue144);
//			cmd.addParameter("@P_VALUE_145", pValue145);
//			cmd.addParameter("@P_VALUE_146", pValue146);
//			cmd.addParameter("@P_VALUE_147", pValue147);
//			cmd.addParameter("@P_VALUE_148", pValue148);
//			cmd.addParameter("@P_VALUE_149", pValue149);
//			cmd.addParameter("@P_VALUE_150", pValue150);
//			cmd.addParameter("@P_VALUE_151", pValue151);
//			cmd.addParameter("@P_VALUE_152", pValue152);
//			cmd.addParameter("@P_VALUE_153", pValue153);
//			cmd.addParameter("@P_VALUE_154", pValue154);
//			cmd.addParameter("@P_VALUE_155", pValue155);
//			cmd.addParameter("@P_VALUE_156", pValue156);
//			cmd.addParameter("@P_VALUE_157", pValue157);
//			cmd.addParameter("@P_VALUE_158", pValue158);
//			cmd.addParameter("@P_VALUE_159", pValue159);
//			cmd.addParameter("@P_VALUE_160", pValue160);
//			cmd.addParameter("@P_VALUE_161", pValue161);
//			cmd.addParameter("@P_VALUE_162", pValue162);
//			cmd.addParameter("@P_VALUE_163", pValue163);
//			cmd.addParameter("@P_VALUE_164", pValue164);
//			cmd.addParameter("@P_VALUE_165", pValue165);
//			cmd.addParameter("@P_VALUE_166", pValue166);
//			cmd.addParameter("@P_VALUE_167", pValue167);
//			cmd.addParameter("@P_VALUE_168", pValue168);
//			cmd.addParameter("@P_VALUE_169", pValue169);
//			cmd.addParameter("@P_VALUE_170", pValue170);
//			cmd.addParameter("@P_VALUE_171", pValue171);
//			cmd.addParameter("@P_VALUE_172", pValue172);
//			cmd.addParameter("@P_VALUE_173", pValue173);
//			cmd.addParameter("@P_VALUE_174", pValue174);
//			cmd.addParameter("@P_VALUE_175", pValue175);
//			cmd.addParameter("@P_VALUE_176", pValue176);
//			cmd.addParameter("@P_VALUE_177", pValue177);
//			cmd.addParameter("@P_VALUE_178", pValue178);
//			cmd.addParameter("@P_VALUE_179", pValue179);
//			cmd.addParameter("@P_VALUE_180", pValue180);
//			cmd.addParameter("@P_VALUE_181", pValue181);
//			cmd.addParameter("@P_VALUE_182", pValue182);
//			cmd.addParameter("@P_VALUE_183", pValue183);
//			cmd.addParameter("@P_VALUE_184", pValue184);
//			cmd.addParameter("@P_VALUE_185", pValue185);
//			cmd.addParameter("@P_VALUE_186", pValue186);
//			cmd.addParameter("@P_VALUE_187", pValue187);
//			cmd.addParameter("@P_VALUE_188", pValue188);
//			cmd.addParameter("@P_VALUE_189", pValue189);
//			cmd.addParameter("@P_VALUE_190", pValue190);
//			cmd.addParameter("@P_VALUE_191", pValue191);
//			cmd.addParameter("@P_VALUE_192", pValue192);
//			cmd.addParameter("@P_VALUE_193", pValue193);
//			cmd.addParameter("@P_VALUE_194", pValue194);
//			cmd.addParameter("@P_VALUE_195", pValue195);
//			cmd.addParameter("@P_VALUE_196", pValue196);
//			cmd.addParameter("@P_VALUE_197", pValue197);
//			cmd.addParameter("@P_VALUE_198", pValue198);
//			cmd.addParameter("@P_VALUE_199", pValue199);
//			cmd.addParameter("@P_VALUE_200", pValue200);
//			cmd.addParameter("@P_VALUE_201", pValue201);
//			cmd.addParameter("@P_VALUE_202", pValue202);
//			cmd.addParameter("@P_VALUE_203", pValue203);
//			cmd.addParameter("@P_VALUE_204", pValue204);
//			cmd.addParameter("@P_VALUE_205", pValue205);
//			cmd.addParameter("@P_VALUE_206", pValue206);
//			cmd.addParameter("@P_VALUE_207", pValue207);
//			cmd.addParameter("@P_VALUE_208", pValue208);
//			cmd.addParameter("@P_VALUE_209", pValue209);
//			cmd.addParameter("@P_VALUE_210", pValue210);
//			cmd.addParameter("@P_VALUE_211", pValue211);
//			cmd.addParameter("@P_VALUE_212", pValue212);
//			cmd.addParameter("@P_VALUE_213", pValue213);
//			cmd.addParameter("@P_VALUE_214", pValue214);
//			cmd.addParameter("@P_VALUE_215", pValue215);
//			cmd.addParameter("@P_VALUE_216", pValue216);
//			cmd.addParameter("@P_VALUE_217", pValue217);
//			cmd.addParameter("@P_VALUE_218", pValue218);
//			cmd.addParameter("@P_VALUE_219", pValue219);
//			cmd.addParameter("@P_VALUE_220", pValue220);
//			cmd.addParameter("@P_VALUE_221", pValue221);
//			cmd.addParameter("@P_VALUE_222", pValue222);
//			cmd.addParameter("@P_VALUE_223", pValue223);
//			cmd.addParameter("@P_VALUE_224", pValue224);
//			cmd.addParameter("@P_VALUE_225", pValue225);
//			cmd.addParameter("@P_VALUE_226", pValue226);
//			cmd.addParameter("@P_VALUE_227", pValue227);
//			cmd.addParameter("@P_VALUE_228", pValue228);
//			cmd.addParameter("@P_VALUE_229", pValue229);
//			cmd.addParameter("@P_VALUE_230", pValue230);
//			cmd.addParameter("@P_VALUE_231", pValue231);
//			cmd.addParameter("@P_VALUE_232", pValue232);
//			cmd.addParameter("@P_VALUE_233", pValue233);
//			cmd.addParameter("@P_VALUE_234", pValue234);
//			cmd.addParameter("@P_VALUE_235", pValue235);
//			cmd.addParameter("@P_VALUE_236", pValue236);
//			cmd.addParameter("@P_VALUE_237", pValue237);
//			cmd.addParameter("@P_VALUE_238", pValue238);
//			cmd.addParameter("@P_VALUE_239", pValue239);
//			cmd.addParameter("@P_VALUE_240", pValue240);
//			cmd.addParameter("@P_VALUE_241", pValue241);
//			cmd.addParameter("@P_VALUE_242", pValue242);
//			cmd.addParameter("@P_VALUE_243", pValue243);
//			cmd.addParameter("@P_VALUE_244", pValue244);
//			cmd.addParameter("@P_VALUE_245", pValue245);
//			cmd.addParameter("@P_VALUE_246", pValue246);
//			cmd.addParameter("@P_VALUE_247", pValue247);
//			cmd.addParameter("@P_VALUE_248", pValue248);
//			cmd.addParameter("@P_VALUE_249", pValue249);
//			cmd.addParameter("@P_VALUE_250", pValue250);
//			cmd.addParameter("@P_VALUE_251", pValue251);
//			cmd.addParameter("@P_VALUE_252", pValue252);
//			cmd.addParameter("@P_VALUE_253", pValue253);
//			cmd.addParameter("@P_VALUE_254", pValue254);
//			cmd.addParameter("@P_VALUE_255", pValue255);
//			cmd.addParameter("@P_VALUE_256", pValue256);
//			cmd.addParameter("@P_VALUE_257", pValue257);
//			cmd.addParameter("@P_VALUE_258", pValue258);
//			cmd.addParameter("@P_VALUE_259", pValue259);
//			cmd.addParameter("@P_VALUE_260", pValue260);
//			cmd.addParameter("@P_VALUE_261", pValue261);
//			cmd.addParameter("@P_VALUE_262", pValue262);
//			cmd.addParameter("@P_VALUE_263", pValue263);
//			cmd.addParameter("@P_VALUE_264", pValue264);
//			cmd.addParameter("@P_VALUE_265", pValue265);
//			cmd.addParameter("@P_VALUE_266", pValue266);
//			cmd.addParameter("@P_VALUE_267", pValue267);
//			cmd.addParameter("@P_VALUE_268", pValue268);
//			cmd.addParameter("@P_VALUE_269", pValue269);
//			cmd.addParameter("@P_VALUE_270", pValue270);
//			cmd.addParameter("@P_VALUE_271", pValue271);
//			cmd.addParameter("@P_VALUE_272", pValue272);
//			cmd.addParameter("@P_VALUE_273", pValue273);
//			cmd.addParameter("@P_VALUE_274", pValue274);
//			cmd.addParameter("@P_VALUE_275", pValue275);
//			cmd.addParameter("@P_VALUE_276", pValue276);
//			cmd.addParameter("@P_VALUE_277", pValue277);
//			cmd.addParameter("@P_VALUE_278", pValue278);
//			cmd.addParameter("@P_VALUE_279", pValue279);
//			cmd.addParameter("@P_VALUE_280", pValue280);
//			cmd.addParameter("@P_VALUE_281", pValue281);
//			cmd.addParameter("@P_VALUE_282", pValue282);
//			cmd.addParameter("@P_VALUE_283", pValue283);
//			cmd.addParameter("@P_VALUE_284", pValue284);
//			cmd.addParameter("@P_VALUE_285", pValue285);
//			cmd.addParameter("@P_VALUE_286", pValue286);
//			cmd.addParameter("@P_VALUE_287", pValue287);
//			cmd.addParameter("@P_VALUE_288", pValue288);
//			cmd.addParameter("@P_VALUE_289", pValue289);
//			cmd.addParameter("@P_VALUE_290", pValue290);
//			cmd.addParameter("@P_VALUE_291", pValue291);
//			cmd.addParameter("@P_VALUE_292", pValue292);
//			cmd.addParameter("@P_VALUE_293", pValue293);
//			cmd.addParameter("@P_VALUE_294", pValue294);
//			cmd.addParameter("@P_VALUE_295", pValue295);
//			cmd.addParameter("@P_VALUE_296", pValue296);
//			cmd.addParameter("@P_VALUE_297", pValue297);
//			cmd.addParameter("@P_VALUE_298", pValue298);
//			cmd.addParameter("@P_VALUE_299", pValue299);
//			cmd.addParameter("@P_VALUE_300", pValue300);
//			cmd.addParameter("@P_VALUE_301", pValue301);
//			cmd.addParameter("@P_VALUE_302", pValue302);
//			cmd.addParameter("@P_VALUE_303", pValue303);
//			cmd.addParameter("@P_VALUE_304", pValue304);
//			cmd.addParameter("@P_VALUE_305", pValue305);
//			cmd.addParameter("@P_VALUE_306", pValue306);
//			cmd.addParameter("@P_VALUE_307", pValue307);
//			cmd.addParameter("@P_VALUE_308", pValue308);
//			cmd.addParameter("@P_VALUE_309", pValue309);
//			cmd.addParameter("@P_VALUE_310", pValue310);
//			cmd.addParameter("@P_VALUE_311", pValue311);
//			cmd.addParameter("@P_VALUE_312", pValue312);
//			cmd.addParameter("@P_VALUE_313", pValue313);
//			cmd.addParameter("@P_VALUE_314", pValue314);
//			cmd.addParameter("@P_VALUE_315", pValue315);
//			cmd.addParameter("@P_VALUE_316", pValue316);
//			cmd.addParameter("@P_VALUE_317", pValue317);
//			cmd.addParameter("@P_VALUE_318", pValue318);
//			cmd.addParameter("@P_VALUE_319", pValue319);
//			cmd.addParameter("@P_VALUE_320", pValue320);
//			cmd.addParameter("@P_VALUE_321", pValue321);
//			cmd.addParameter("@P_VALUE_322", pValue322);
//			cmd.addParameter("@P_VALUE_323", pValue323);
//			cmd.addParameter("@P_VALUE_324", pValue324);
//			cmd.addParameter("@P_VALUE_325", pValue325);
//			cmd.addParameter("@P_VALUE_326", pValue326);
//			cmd.addParameter("@P_VALUE_327", pValue327);
//			cmd.addParameter("@P_VALUE_328", pValue328);
//			cmd.addParameter("@P_VALUE_329", pValue329);
//			cmd.addParameter("@P_VALUE_330", pValue330);
//			cmd.addParameter("@P_VALUE_331", pValue331);
//			cmd.addParameter("@P_VALUE_332", pValue332);
//			cmd.addParameter("@P_VALUE_333", pValue333);
//			cmd.addParameter("@P_VALUE_334", pValue334);
//			cmd.addParameter("@P_VALUE_335", pValue335);
//			cmd.addParameter("@P_VALUE_336", pValue336);
//			cmd.addParameter("@P_VALUE_337", pValue337);
//			cmd.addParameter("@P_VALUE_338", pValue338);
//			cmd.addParameter("@P_VALUE_339", pValue339);
//			cmd.addParameter("@P_VALUE_340", pValue340);
//			cmd.addParameter("@P_VALUE_341", pValue341);
//			cmd.addParameter("@P_VALUE_342", pValue342);
//			cmd.addParameter("@P_VALUE_343", pValue343);
//			cmd.addParameter("@P_VALUE_344", pValue344);
//			cmd.addParameter("@P_VALUE_345", pValue345);
//			cmd.addParameter("@P_VALUE_346", pValue346);
//			cmd.addParameter("@P_VALUE_347", pValue347);
//			cmd.addParameter("@P_VALUE_348", pValue348);
//			cmd.addParameter("@P_VALUE_349", pValue349);
//			cmd.addParameter("@P_VALUE_350", pValue350);
//			cmd.addParameter("@P_VALUE_351", pValue351);
//			cmd.addParameter("@P_VALUE_352", pValue352);
//			cmd.addParameter("@P_VALUE_353", pValue353);
//			cmd.addParameter("@P_VALUE_354", pValue354);
//			cmd.addParameter("@P_VALUE_355", pValue355);
//			cmd.addParameter("@P_VALUE_356", pValue356);
//			cmd.addParameter("@P_VALUE_357", pValue357);
//			cmd.addParameter("@P_VALUE_358", pValue358);
//			cmd.addParameter("@P_VALUE_359", pValue359);
//			cmd.addParameter("@P_VALUE_360", pValue360);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pValue1,NString pValue2,NString pValue3,NString pValue4,NString pValue5,NString pValue6,NString pValue7,NString pValue8,NString pValue9,NString pValue10,NString pValue11,NString pValue12,NString pValue13,NString pValue14,NString pValue15,NString pValue16,NString pValue17,NString pValue18,NString pValue19,NString pValue20,NString pValue21,NString pValue22,NString pValue23,NString pValue24,NString pValue25,NString pValue26,NString pValue27,NString pValue28,NString pValue29,NString pValue30,NString pValue31,NString pValue32,NString pValue33,NString pValue34,NString pValue35,NString pValue36,NString pValue37,NString pValue38,NString pValue39,NString pValue40,NString pValue41,NString pValue42,NString pValue43,NString pValue44,NString pValue45,NString pValue46,NString pValue47,NString pValue48,NString pValue49,NString pValue50,NString pValue51,NString pValue52,NString pValue53,NString pValue54,NString pValue55,NString pValue56,NString pValue57,NString pValue58,NString pValue59,NString pValue60,NString pInfcCode,NString pValue61,NString pValue62,NString pValue63,NString pValue64,NString pValue65,NString pValue66,NString pValue67,NString pValue68,NString pValue69,NString pValue70,NString pValue71,NString pValue72,NString pValue73,NString pValue74,NString pValue75,NString pValue76,NString pValue77,NString pValue78,NString pValue79,NString pValue80,NString pValue81,NString pValue82,NString pValue83,NString pValue84,NString pValue85,NString pValue86,NString pValue87,NString pValue88,NString pValue89,NString pValue90,NString pValue91,NString pValue92,NString pValue93,NString pValue94,NString pValue95,NString pValue96,NString pValue97,NString pValue98,NString pValue99,NString pValue100,NString pValue101,NString pValue102,NString pValue103,NString pValue104,NString pValue105,NString pValue106,NString pValue107,NString pValue108,NString pValue109,NString pValue110,NString pValue111,NString pValue112,NString pValue113,NString pValue114,NString pValue115,NString pValue116,NString pValue117,NString pValue118,NString pValue119,NString pValue120,NString pValue121,NString pValue122,NString pValue123,NString pValue124,NString pValue125,NString pValue126,NString pValue127,NString pValue128,NString pValue129,NString pValue130,NString pValue131,NString pValue132,NString pValue133,NString pValue134,NString pValue135,NString pValue136,NString pValue137,NString pValue138,NString pValue139,NString pValue140,NString pValue141,NString pValue142,NString pValue143,NString pValue144,NString pValue145,NString pValue146,NString pValue147,NString pValue148,NString pValue149,NString pValue150,NString pValue151,NString pValue152,NString pValue153,NString pValue154,NString pValue155,NString pValue156,NString pValue157,NString pValue158,NString pValue159,NString pValue160,NString pValue161,NString pValue162,NString pValue163,NString pValue164,NString pValue165,NString pValue166,NString pValue167,NString pValue168,NString pValue169,NString pValue170,NString pValue171,NString pValue172,NString pValue173,NString pValue174,NString pValue175,NString pValue176,NString pValue177,NString pValue178,NString pValue179,NString pValue180,NString pValue181,NString pValue182,NString pValue183,NString pValue184,NString pValue185,NString pValue186,NString pValue187,NString pValue188,NString pValue189,NString pValue190,NString pValue191,NString pValue192,NString pValue193,NString pValue194,NString pValue195,NString pValue196,NString pValue197,NString pValue198,NString pValue199,NString pValue200,NString pValue201,NString pValue202,NString pValue203,NString pValue204,NString pValue205,NString pValue206,NString pValue207,NString pValue208,NString pValue209,NString pValue210,NString pValue211,NString pValue212,NString pValue213,NString pValue214,NString pValue215,NString pValue216,NString pValue217,NString pValue218,NString pValue219,NString pValue220,NString pValue221,NString pValue222,NString pValue223,NString pValue224,NString pValue225,NString pValue226,NString pValue227,NString pValue228,NString pValue229,NString pValue230,NString pValue231,NString pValue232,NString pValue233,NString pValue234,NString pValue235,NString pValue236,NString pValue237,NString pValue238,NString pValue239,NString pValue240,NString pValue241,NString pValue242,NString pValue243,NString pValue244,NString pValue245,NString pValue246,NString pValue247,NString pValue248,NString pValue249,NString pValue250,NString pValue251,NString pValue252,NString pValue253,NString pValue254,NString pValue255,NString pValue256,NString pValue257,NString pValue258,NString pValue259,NString pValue260,NString pValue261,NString pValue262,NString pValue263,NString pValue264,NString pValue265,NString pValue266,NString pValue267,NString pValue268,NString pValue269,NString pValue270,NString pValue271,NString pValue272,NString pValue273,NString pValue274,NString pValue275,NString pValue276,NString pValue277,NString pValue278,NString pValue279,NString pValue280,NString pValue281,NString pValue282,NString pValue283,NString pValue284,NString pValue285,NString pValue286,NString pValue287,NString pValue288,NString pValue289,NString pValue290,NString pValue291,NString pValue292,NString pValue293,NString pValue294,NString pValue295,NString pValue296,NString pValue297,NString pValue298,NString pValue299,NString pValue300,NString pValue301,NString pValue302,NString pValue303,NString pValue304,NString pValue305,NString pValue306,NString pValue307,NString pValue308,NString pValue309,NString pValue310,NString pValue311,NString pValue312,NString pValue313,NString pValue314,NString pValue315,NString pValue316,NString pValue317,NString pValue318,NString pValue319,NString pValue320,NString pValue321,NString pValue322,NString pValue323,NString pValue324,NString pValue325,NString pValue326,NString pValue327,NString pValue328,NString pValue329,NString pValue330,NString pValue331,NString pValue332,NString pValue333,NString pValue334,NString pValue335,NString pValue336,NString pValue337,NString pValue338,NString pValue339,NString pValue340,NString pValue341,NString pValue342,NString pValue343,NString pValue344,NString pValue345,NString pValue346,NString pValue347,NString pValue348,NString pValue349,NString pValue350,NString pValue351,NString pValue352,NString pValue353,NString pValue354,NString pValue355,NString pValue356,NString pValue357,NString pValue358,NString pValue359,NString pValue360,NString pUserId,NString pDataOrigin,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_USER_DEF_DATA.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_VALUE_1", pValue1);
//			cmd.addParameter("@P_VALUE_2", pValue2);
//			cmd.addParameter("@P_VALUE_3", pValue3);
//			cmd.addParameter("@P_VALUE_4", pValue4);
//			cmd.addParameter("@P_VALUE_5", pValue5);
//			cmd.addParameter("@P_VALUE_6", pValue6);
//			cmd.addParameter("@P_VALUE_7", pValue7);
//			cmd.addParameter("@P_VALUE_8", pValue8);
//			cmd.addParameter("@P_VALUE_9", pValue9);
//			cmd.addParameter("@P_VALUE_10", pValue10);
//			cmd.addParameter("@P_VALUE_11", pValue11);
//			cmd.addParameter("@P_VALUE_12", pValue12);
//			cmd.addParameter("@P_VALUE_13", pValue13);
//			cmd.addParameter("@P_VALUE_14", pValue14);
//			cmd.addParameter("@P_VALUE_15", pValue15);
//			cmd.addParameter("@P_VALUE_16", pValue16);
//			cmd.addParameter("@P_VALUE_17", pValue17);
//			cmd.addParameter("@P_VALUE_18", pValue18);
//			cmd.addParameter("@P_VALUE_19", pValue19);
//			cmd.addParameter("@P_VALUE_20", pValue20);
//			cmd.addParameter("@P_VALUE_21", pValue21);
//			cmd.addParameter("@P_VALUE_22", pValue22);
//			cmd.addParameter("@P_VALUE_23", pValue23);
//			cmd.addParameter("@P_VALUE_24", pValue24);
//			cmd.addParameter("@P_VALUE_25", pValue25);
//			cmd.addParameter("@P_VALUE_26", pValue26);
//			cmd.addParameter("@P_VALUE_27", pValue27);
//			cmd.addParameter("@P_VALUE_28", pValue28);
//			cmd.addParameter("@P_VALUE_29", pValue29);
//			cmd.addParameter("@P_VALUE_30", pValue30);
//			cmd.addParameter("@P_VALUE_31", pValue31);
//			cmd.addParameter("@P_VALUE_32", pValue32);
//			cmd.addParameter("@P_VALUE_33", pValue33);
//			cmd.addParameter("@P_VALUE_34", pValue34);
//			cmd.addParameter("@P_VALUE_35", pValue35);
//			cmd.addParameter("@P_VALUE_36", pValue36);
//			cmd.addParameter("@P_VALUE_37", pValue37);
//			cmd.addParameter("@P_VALUE_38", pValue38);
//			cmd.addParameter("@P_VALUE_39", pValue39);
//			cmd.addParameter("@P_VALUE_40", pValue40);
//			cmd.addParameter("@P_VALUE_41", pValue41);
//			cmd.addParameter("@P_VALUE_42", pValue42);
//			cmd.addParameter("@P_VALUE_43", pValue43);
//			cmd.addParameter("@P_VALUE_44", pValue44);
//			cmd.addParameter("@P_VALUE_45", pValue45);
//			cmd.addParameter("@P_VALUE_46", pValue46);
//			cmd.addParameter("@P_VALUE_47", pValue47);
//			cmd.addParameter("@P_VALUE_48", pValue48);
//			cmd.addParameter("@P_VALUE_49", pValue49);
//			cmd.addParameter("@P_VALUE_50", pValue50);
//			cmd.addParameter("@P_VALUE_51", pValue51);
//			cmd.addParameter("@P_VALUE_52", pValue52);
//			cmd.addParameter("@P_VALUE_53", pValue53);
//			cmd.addParameter("@P_VALUE_54", pValue54);
//			cmd.addParameter("@P_VALUE_55", pValue55);
//			cmd.addParameter("@P_VALUE_56", pValue56);
//			cmd.addParameter("@P_VALUE_57", pValue57);
//			cmd.addParameter("@P_VALUE_58", pValue58);
//			cmd.addParameter("@P_VALUE_59", pValue59);
//			cmd.addParameter("@P_VALUE_60", pValue60);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_VALUE_61", pValue61);
//			cmd.addParameter("@P_VALUE_62", pValue62);
//			cmd.addParameter("@P_VALUE_63", pValue63);
//			cmd.addParameter("@P_VALUE_64", pValue64);
//			cmd.addParameter("@P_VALUE_65", pValue65);
//			cmd.addParameter("@P_VALUE_66", pValue66);
//			cmd.addParameter("@P_VALUE_67", pValue67);
//			cmd.addParameter("@P_VALUE_68", pValue68);
//			cmd.addParameter("@P_VALUE_69", pValue69);
//			cmd.addParameter("@P_VALUE_70", pValue70);
//			cmd.addParameter("@P_VALUE_71", pValue71);
//			cmd.addParameter("@P_VALUE_72", pValue72);
//			cmd.addParameter("@P_VALUE_73", pValue73);
//			cmd.addParameter("@P_VALUE_74", pValue74);
//			cmd.addParameter("@P_VALUE_75", pValue75);
//			cmd.addParameter("@P_VALUE_76", pValue76);
//			cmd.addParameter("@P_VALUE_77", pValue77);
//			cmd.addParameter("@P_VALUE_78", pValue78);
//			cmd.addParameter("@P_VALUE_79", pValue79);
//			cmd.addParameter("@P_VALUE_80", pValue80);
//			cmd.addParameter("@P_VALUE_81", pValue81);
//			cmd.addParameter("@P_VALUE_82", pValue82);
//			cmd.addParameter("@P_VALUE_83", pValue83);
//			cmd.addParameter("@P_VALUE_84", pValue84);
//			cmd.addParameter("@P_VALUE_85", pValue85);
//			cmd.addParameter("@P_VALUE_86", pValue86);
//			cmd.addParameter("@P_VALUE_87", pValue87);
//			cmd.addParameter("@P_VALUE_88", pValue88);
//			cmd.addParameter("@P_VALUE_89", pValue89);
//			cmd.addParameter("@P_VALUE_90", pValue90);
//			cmd.addParameter("@P_VALUE_91", pValue91);
//			cmd.addParameter("@P_VALUE_92", pValue92);
//			cmd.addParameter("@P_VALUE_93", pValue93);
//			cmd.addParameter("@P_VALUE_94", pValue94);
//			cmd.addParameter("@P_VALUE_95", pValue95);
//			cmd.addParameter("@P_VALUE_96", pValue96);
//			cmd.addParameter("@P_VALUE_97", pValue97);
//			cmd.addParameter("@P_VALUE_98", pValue98);
//			cmd.addParameter("@P_VALUE_99", pValue99);
//			cmd.addParameter("@P_VALUE_100", pValue100);
//			cmd.addParameter("@P_VALUE_101", pValue101);
//			cmd.addParameter("@P_VALUE_102", pValue102);
//			cmd.addParameter("@P_VALUE_103", pValue103);
//			cmd.addParameter("@P_VALUE_104", pValue104);
//			cmd.addParameter("@P_VALUE_105", pValue105);
//			cmd.addParameter("@P_VALUE_106", pValue106);
//			cmd.addParameter("@P_VALUE_107", pValue107);
//			cmd.addParameter("@P_VALUE_108", pValue108);
//			cmd.addParameter("@P_VALUE_109", pValue109);
//			cmd.addParameter("@P_VALUE_110", pValue110);
//			cmd.addParameter("@P_VALUE_111", pValue111);
//			cmd.addParameter("@P_VALUE_112", pValue112);
//			cmd.addParameter("@P_VALUE_113", pValue113);
//			cmd.addParameter("@P_VALUE_114", pValue114);
//			cmd.addParameter("@P_VALUE_115", pValue115);
//			cmd.addParameter("@P_VALUE_116", pValue116);
//			cmd.addParameter("@P_VALUE_117", pValue117);
//			cmd.addParameter("@P_VALUE_118", pValue118);
//			cmd.addParameter("@P_VALUE_119", pValue119);
//			cmd.addParameter("@P_VALUE_120", pValue120);
//			cmd.addParameter("@P_VALUE_121", pValue121);
//			cmd.addParameter("@P_VALUE_122", pValue122);
//			cmd.addParameter("@P_VALUE_123", pValue123);
//			cmd.addParameter("@P_VALUE_124", pValue124);
//			cmd.addParameter("@P_VALUE_125", pValue125);
//			cmd.addParameter("@P_VALUE_126", pValue126);
//			cmd.addParameter("@P_VALUE_127", pValue127);
//			cmd.addParameter("@P_VALUE_128", pValue128);
//			cmd.addParameter("@P_VALUE_129", pValue129);
//			cmd.addParameter("@P_VALUE_130", pValue130);
//			cmd.addParameter("@P_VALUE_131", pValue131);
//			cmd.addParameter("@P_VALUE_132", pValue132);
//			cmd.addParameter("@P_VALUE_133", pValue133);
//			cmd.addParameter("@P_VALUE_134", pValue134);
//			cmd.addParameter("@P_VALUE_135", pValue135);
//			cmd.addParameter("@P_VALUE_136", pValue136);
//			cmd.addParameter("@P_VALUE_137", pValue137);
//			cmd.addParameter("@P_VALUE_138", pValue138);
//			cmd.addParameter("@P_VALUE_139", pValue139);
//			cmd.addParameter("@P_VALUE_140", pValue140);
//			cmd.addParameter("@P_VALUE_141", pValue141);
//			cmd.addParameter("@P_VALUE_142", pValue142);
//			cmd.addParameter("@P_VALUE_143", pValue143);
//			cmd.addParameter("@P_VALUE_144", pValue144);
//			cmd.addParameter("@P_VALUE_145", pValue145);
//			cmd.addParameter("@P_VALUE_146", pValue146);
//			cmd.addParameter("@P_VALUE_147", pValue147);
//			cmd.addParameter("@P_VALUE_148", pValue148);
//			cmd.addParameter("@P_VALUE_149", pValue149);
//			cmd.addParameter("@P_VALUE_150", pValue150);
//			cmd.addParameter("@P_VALUE_151", pValue151);
//			cmd.addParameter("@P_VALUE_152", pValue152);
//			cmd.addParameter("@P_VALUE_153", pValue153);
//			cmd.addParameter("@P_VALUE_154", pValue154);
//			cmd.addParameter("@P_VALUE_155", pValue155);
//			cmd.addParameter("@P_VALUE_156", pValue156);
//			cmd.addParameter("@P_VALUE_157", pValue157);
//			cmd.addParameter("@P_VALUE_158", pValue158);
//			cmd.addParameter("@P_VALUE_159", pValue159);
//			cmd.addParameter("@P_VALUE_160", pValue160);
//			cmd.addParameter("@P_VALUE_161", pValue161);
//			cmd.addParameter("@P_VALUE_162", pValue162);
//			cmd.addParameter("@P_VALUE_163", pValue163);
//			cmd.addParameter("@P_VALUE_164", pValue164);
//			cmd.addParameter("@P_VALUE_165", pValue165);
//			cmd.addParameter("@P_VALUE_166", pValue166);
//			cmd.addParameter("@P_VALUE_167", pValue167);
//			cmd.addParameter("@P_VALUE_168", pValue168);
//			cmd.addParameter("@P_VALUE_169", pValue169);
//			cmd.addParameter("@P_VALUE_170", pValue170);
//			cmd.addParameter("@P_VALUE_171", pValue171);
//			cmd.addParameter("@P_VALUE_172", pValue172);
//			cmd.addParameter("@P_VALUE_173", pValue173);
//			cmd.addParameter("@P_VALUE_174", pValue174);
//			cmd.addParameter("@P_VALUE_175", pValue175);
//			cmd.addParameter("@P_VALUE_176", pValue176);
//			cmd.addParameter("@P_VALUE_177", pValue177);
//			cmd.addParameter("@P_VALUE_178", pValue178);
//			cmd.addParameter("@P_VALUE_179", pValue179);
//			cmd.addParameter("@P_VALUE_180", pValue180);
//			cmd.addParameter("@P_VALUE_181", pValue181);
//			cmd.addParameter("@P_VALUE_182", pValue182);
//			cmd.addParameter("@P_VALUE_183", pValue183);
//			cmd.addParameter("@P_VALUE_184", pValue184);
//			cmd.addParameter("@P_VALUE_185", pValue185);
//			cmd.addParameter("@P_VALUE_186", pValue186);
//			cmd.addParameter("@P_VALUE_187", pValue187);
//			cmd.addParameter("@P_VALUE_188", pValue188);
//			cmd.addParameter("@P_VALUE_189", pValue189);
//			cmd.addParameter("@P_VALUE_190", pValue190);
//			cmd.addParameter("@P_VALUE_191", pValue191);
//			cmd.addParameter("@P_VALUE_192", pValue192);
//			cmd.addParameter("@P_VALUE_193", pValue193);
//			cmd.addParameter("@P_VALUE_194", pValue194);
//			cmd.addParameter("@P_VALUE_195", pValue195);
//			cmd.addParameter("@P_VALUE_196", pValue196);
//			cmd.addParameter("@P_VALUE_197", pValue197);
//			cmd.addParameter("@P_VALUE_198", pValue198);
//			cmd.addParameter("@P_VALUE_199", pValue199);
//			cmd.addParameter("@P_VALUE_200", pValue200);
//			cmd.addParameter("@P_VALUE_201", pValue201);
//			cmd.addParameter("@P_VALUE_202", pValue202);
//			cmd.addParameter("@P_VALUE_203", pValue203);
//			cmd.addParameter("@P_VALUE_204", pValue204);
//			cmd.addParameter("@P_VALUE_205", pValue205);
//			cmd.addParameter("@P_VALUE_206", pValue206);
//			cmd.addParameter("@P_VALUE_207", pValue207);
//			cmd.addParameter("@P_VALUE_208", pValue208);
//			cmd.addParameter("@P_VALUE_209", pValue209);
//			cmd.addParameter("@P_VALUE_210", pValue210);
//			cmd.addParameter("@P_VALUE_211", pValue211);
//			cmd.addParameter("@P_VALUE_212", pValue212);
//			cmd.addParameter("@P_VALUE_213", pValue213);
//			cmd.addParameter("@P_VALUE_214", pValue214);
//			cmd.addParameter("@P_VALUE_215", pValue215);
//			cmd.addParameter("@P_VALUE_216", pValue216);
//			cmd.addParameter("@P_VALUE_217", pValue217);
//			cmd.addParameter("@P_VALUE_218", pValue218);
//			cmd.addParameter("@P_VALUE_219", pValue219);
//			cmd.addParameter("@P_VALUE_220", pValue220);
//			cmd.addParameter("@P_VALUE_221", pValue221);
//			cmd.addParameter("@P_VALUE_222", pValue222);
//			cmd.addParameter("@P_VALUE_223", pValue223);
//			cmd.addParameter("@P_VALUE_224", pValue224);
//			cmd.addParameter("@P_VALUE_225", pValue225);
//			cmd.addParameter("@P_VALUE_226", pValue226);
//			cmd.addParameter("@P_VALUE_227", pValue227);
//			cmd.addParameter("@P_VALUE_228", pValue228);
//			cmd.addParameter("@P_VALUE_229", pValue229);
//			cmd.addParameter("@P_VALUE_230", pValue230);
//			cmd.addParameter("@P_VALUE_231", pValue231);
//			cmd.addParameter("@P_VALUE_232", pValue232);
//			cmd.addParameter("@P_VALUE_233", pValue233);
//			cmd.addParameter("@P_VALUE_234", pValue234);
//			cmd.addParameter("@P_VALUE_235", pValue235);
//			cmd.addParameter("@P_VALUE_236", pValue236);
//			cmd.addParameter("@P_VALUE_237", pValue237);
//			cmd.addParameter("@P_VALUE_238", pValue238);
//			cmd.addParameter("@P_VALUE_239", pValue239);
//			cmd.addParameter("@P_VALUE_240", pValue240);
//			cmd.addParameter("@P_VALUE_241", pValue241);
//			cmd.addParameter("@P_VALUE_242", pValue242);
//			cmd.addParameter("@P_VALUE_243", pValue243);
//			cmd.addParameter("@P_VALUE_244", pValue244);
//			cmd.addParameter("@P_VALUE_245", pValue245);
//			cmd.addParameter("@P_VALUE_246", pValue246);
//			cmd.addParameter("@P_VALUE_247", pValue247);
//			cmd.addParameter("@P_VALUE_248", pValue248);
//			cmd.addParameter("@P_VALUE_249", pValue249);
//			cmd.addParameter("@P_VALUE_250", pValue250);
//			cmd.addParameter("@P_VALUE_251", pValue251);
//			cmd.addParameter("@P_VALUE_252", pValue252);
//			cmd.addParameter("@P_VALUE_253", pValue253);
//			cmd.addParameter("@P_VALUE_254", pValue254);
//			cmd.addParameter("@P_VALUE_255", pValue255);
//			cmd.addParameter("@P_VALUE_256", pValue256);
//			cmd.addParameter("@P_VALUE_257", pValue257);
//			cmd.addParameter("@P_VALUE_258", pValue258);
//			cmd.addParameter("@P_VALUE_259", pValue259);
//			cmd.addParameter("@P_VALUE_260", pValue260);
//			cmd.addParameter("@P_VALUE_261", pValue261);
//			cmd.addParameter("@P_VALUE_262", pValue262);
//			cmd.addParameter("@P_VALUE_263", pValue263);
//			cmd.addParameter("@P_VALUE_264", pValue264);
//			cmd.addParameter("@P_VALUE_265", pValue265);
//			cmd.addParameter("@P_VALUE_266", pValue266);
//			cmd.addParameter("@P_VALUE_267", pValue267);
//			cmd.addParameter("@P_VALUE_268", pValue268);
//			cmd.addParameter("@P_VALUE_269", pValue269);
//			cmd.addParameter("@P_VALUE_270", pValue270);
//			cmd.addParameter("@P_VALUE_271", pValue271);
//			cmd.addParameter("@P_VALUE_272", pValue272);
//			cmd.addParameter("@P_VALUE_273", pValue273);
//			cmd.addParameter("@P_VALUE_274", pValue274);
//			cmd.addParameter("@P_VALUE_275", pValue275);
//			cmd.addParameter("@P_VALUE_276", pValue276);
//			cmd.addParameter("@P_VALUE_277", pValue277);
//			cmd.addParameter("@P_VALUE_278", pValue278);
//			cmd.addParameter("@P_VALUE_279", pValue279);
//			cmd.addParameter("@P_VALUE_280", pValue280);
//			cmd.addParameter("@P_VALUE_281", pValue281);
//			cmd.addParameter("@P_VALUE_282", pValue282);
//			cmd.addParameter("@P_VALUE_283", pValue283);
//			cmd.addParameter("@P_VALUE_284", pValue284);
//			cmd.addParameter("@P_VALUE_285", pValue285);
//			cmd.addParameter("@P_VALUE_286", pValue286);
//			cmd.addParameter("@P_VALUE_287", pValue287);
//			cmd.addParameter("@P_VALUE_288", pValue288);
//			cmd.addParameter("@P_VALUE_289", pValue289);
//			cmd.addParameter("@P_VALUE_290", pValue290);
//			cmd.addParameter("@P_VALUE_291", pValue291);
//			cmd.addParameter("@P_VALUE_292", pValue292);
//			cmd.addParameter("@P_VALUE_293", pValue293);
//			cmd.addParameter("@P_VALUE_294", pValue294);
//			cmd.addParameter("@P_VALUE_295", pValue295);
//			cmd.addParameter("@P_VALUE_296", pValue296);
//			cmd.addParameter("@P_VALUE_297", pValue297);
//			cmd.addParameter("@P_VALUE_298", pValue298);
//			cmd.addParameter("@P_VALUE_299", pValue299);
//			cmd.addParameter("@P_VALUE_300", pValue300);
//			cmd.addParameter("@P_VALUE_301", pValue301);
//			cmd.addParameter("@P_VALUE_302", pValue302);
//			cmd.addParameter("@P_VALUE_303", pValue303);
//			cmd.addParameter("@P_VALUE_304", pValue304);
//			cmd.addParameter("@P_VALUE_305", pValue305);
//			cmd.addParameter("@P_VALUE_306", pValue306);
//			cmd.addParameter("@P_VALUE_307", pValue307);
//			cmd.addParameter("@P_VALUE_308", pValue308);
//			cmd.addParameter("@P_VALUE_309", pValue309);
//			cmd.addParameter("@P_VALUE_310", pValue310);
//			cmd.addParameter("@P_VALUE_311", pValue311);
//			cmd.addParameter("@P_VALUE_312", pValue312);
//			cmd.addParameter("@P_VALUE_313", pValue313);
//			cmd.addParameter("@P_VALUE_314", pValue314);
//			cmd.addParameter("@P_VALUE_315", pValue315);
//			cmd.addParameter("@P_VALUE_316", pValue316);
//			cmd.addParameter("@P_VALUE_317", pValue317);
//			cmd.addParameter("@P_VALUE_318", pValue318);
//			cmd.addParameter("@P_VALUE_319", pValue319);
//			cmd.addParameter("@P_VALUE_320", pValue320);
//			cmd.addParameter("@P_VALUE_321", pValue321);
//			cmd.addParameter("@P_VALUE_322", pValue322);
//			cmd.addParameter("@P_VALUE_323", pValue323);
//			cmd.addParameter("@P_VALUE_324", pValue324);
//			cmd.addParameter("@P_VALUE_325", pValue325);
//			cmd.addParameter("@P_VALUE_326", pValue326);
//			cmd.addParameter("@P_VALUE_327", pValue327);
//			cmd.addParameter("@P_VALUE_328", pValue328);
//			cmd.addParameter("@P_VALUE_329", pValue329);
//			cmd.addParameter("@P_VALUE_330", pValue330);
//			cmd.addParameter("@P_VALUE_331", pValue331);
//			cmd.addParameter("@P_VALUE_332", pValue332);
//			cmd.addParameter("@P_VALUE_333", pValue333);
//			cmd.addParameter("@P_VALUE_334", pValue334);
//			cmd.addParameter("@P_VALUE_335", pValue335);
//			cmd.addParameter("@P_VALUE_336", pValue336);
//			cmd.addParameter("@P_VALUE_337", pValue337);
//			cmd.addParameter("@P_VALUE_338", pValue338);
//			cmd.addParameter("@P_VALUE_339", pValue339);
//			cmd.addParameter("@P_VALUE_340", pValue340);
//			cmd.addParameter("@P_VALUE_341", pValue341);
//			cmd.addParameter("@P_VALUE_342", pValue342);
//			cmd.addParameter("@P_VALUE_343", pValue343);
//			cmd.addParameter("@P_VALUE_344", pValue344);
//			cmd.addParameter("@P_VALUE_345", pValue345);
//			cmd.addParameter("@P_VALUE_346", pValue346);
//			cmd.addParameter("@P_VALUE_347", pValue347);
//			cmd.addParameter("@P_VALUE_348", pValue348);
//			cmd.addParameter("@P_VALUE_349", pValue349);
//			cmd.addParameter("@P_VALUE_350", pValue350);
//			cmd.addParameter("@P_VALUE_351", pValue351);
//			cmd.addParameter("@P_VALUE_352", pValue352);
//			cmd.addParameter("@P_VALUE_353", pValue353);
//			cmd.addParameter("@P_VALUE_354", pValue354);
//			cmd.addParameter("@P_VALUE_355", pValue355);
//			cmd.addParameter("@P_VALUE_356", pValue356);
//			cmd.addParameter("@P_VALUE_357", pValue357);
//			cmd.addParameter("@P_VALUE_358", pValue358);
//			cmd.addParameter("@P_VALUE_359", pValue359);
//			cmd.addParameter("@P_VALUE_360", pValue360);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="UserDefDataRecRow", dataSourceName="USER_DEF_DATA_REC")
	public static class UserDefDataRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_VALUE_1")
		public NString RValue1;
		@DbRecordField(dataSourceName="R_VALUE_2")
		public NString RValue2;
		@DbRecordField(dataSourceName="R_VALUE_3")
		public NString RValue3;
		@DbRecordField(dataSourceName="R_VALUE_4")
		public NString RValue4;
		@DbRecordField(dataSourceName="R_VALUE_5")
		public NString RValue5;
		@DbRecordField(dataSourceName="R_VALUE_6")
		public NString RValue6;
		@DbRecordField(dataSourceName="R_VALUE_7")
		public NString RValue7;
		@DbRecordField(dataSourceName="R_VALUE_8")
		public NString RValue8;
		@DbRecordField(dataSourceName="R_VALUE_9")
		public NString RValue9;
		@DbRecordField(dataSourceName="R_VALUE_10")
		public NString RValue10;
		@DbRecordField(dataSourceName="R_VALUE_11")
		public NString RValue11;
		@DbRecordField(dataSourceName="R_VALUE_12")
		public NString RValue12;
		@DbRecordField(dataSourceName="R_VALUE_13")
		public NString RValue13;
		@DbRecordField(dataSourceName="R_VALUE_14")
		public NString RValue14;
		@DbRecordField(dataSourceName="R_VALUE_15")
		public NString RValue15;
		@DbRecordField(dataSourceName="R_VALUE_16")
		public NString RValue16;
		@DbRecordField(dataSourceName="R_VALUE_17")
		public NString RValue17;
		@DbRecordField(dataSourceName="R_VALUE_18")
		public NString RValue18;
		@DbRecordField(dataSourceName="R_VALUE_19")
		public NString RValue19;
		@DbRecordField(dataSourceName="R_VALUE_20")
		public NString RValue20;
		@DbRecordField(dataSourceName="R_VALUE_21")
		public NString RValue21;
		@DbRecordField(dataSourceName="R_VALUE_22")
		public NString RValue22;
		@DbRecordField(dataSourceName="R_VALUE_23")
		public NString RValue23;
		@DbRecordField(dataSourceName="R_VALUE_24")
		public NString RValue24;
		@DbRecordField(dataSourceName="R_VALUE_25")
		public NString RValue25;
		@DbRecordField(dataSourceName="R_VALUE_26")
		public NString RValue26;
		@DbRecordField(dataSourceName="R_VALUE_27")
		public NString RValue27;
		@DbRecordField(dataSourceName="R_VALUE_28")
		public NString RValue28;
		@DbRecordField(dataSourceName="R_VALUE_29")
		public NString RValue29;
		@DbRecordField(dataSourceName="R_VALUE_30")
		public NString RValue30;
		@DbRecordField(dataSourceName="R_VALUE_31")
		public NString RValue31;
		@DbRecordField(dataSourceName="R_VALUE_32")
		public NString RValue32;
		@DbRecordField(dataSourceName="R_VALUE_33")
		public NString RValue33;
		@DbRecordField(dataSourceName="R_VALUE_34")
		public NString RValue34;
		@DbRecordField(dataSourceName="R_VALUE_35")
		public NString RValue35;
		@DbRecordField(dataSourceName="R_VALUE_36")
		public NString RValue36;
		@DbRecordField(dataSourceName="R_VALUE_37")
		public NString RValue37;
		@DbRecordField(dataSourceName="R_VALUE_38")
		public NString RValue38;
		@DbRecordField(dataSourceName="R_VALUE_39")
		public NString RValue39;
		@DbRecordField(dataSourceName="R_VALUE_40")
		public NString RValue40;
		@DbRecordField(dataSourceName="R_VALUE_41")
		public NString RValue41;
		@DbRecordField(dataSourceName="R_VALUE_42")
		public NString RValue42;
		@DbRecordField(dataSourceName="R_VALUE_43")
		public NString RValue43;
		@DbRecordField(dataSourceName="R_VALUE_44")
		public NString RValue44;
		@DbRecordField(dataSourceName="R_VALUE_45")
		public NString RValue45;
		@DbRecordField(dataSourceName="R_VALUE_46")
		public NString RValue46;
		@DbRecordField(dataSourceName="R_VALUE_47")
		public NString RValue47;
		@DbRecordField(dataSourceName="R_VALUE_48")
		public NString RValue48;
		@DbRecordField(dataSourceName="R_VALUE_49")
		public NString RValue49;
		@DbRecordField(dataSourceName="R_VALUE_50")
		public NString RValue50;
		@DbRecordField(dataSourceName="R_VALUE_51")
		public NString RValue51;
		@DbRecordField(dataSourceName="R_VALUE_52")
		public NString RValue52;
		@DbRecordField(dataSourceName="R_VALUE_53")
		public NString RValue53;
		@DbRecordField(dataSourceName="R_VALUE_54")
		public NString RValue54;
		@DbRecordField(dataSourceName="R_VALUE_55")
		public NString RValue55;
		@DbRecordField(dataSourceName="R_VALUE_56")
		public NString RValue56;
		@DbRecordField(dataSourceName="R_VALUE_57")
		public NString RValue57;
		@DbRecordField(dataSourceName="R_VALUE_58")
		public NString RValue58;
		@DbRecordField(dataSourceName="R_VALUE_59")
		public NString RValue59;
		@DbRecordField(dataSourceName="R_VALUE_60")
		public NString RValue60;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_VALUE_61")
		public NString RValue61;
		@DbRecordField(dataSourceName="R_VALUE_62")
		public NString RValue62;
		@DbRecordField(dataSourceName="R_VALUE_63")
		public NString RValue63;
		@DbRecordField(dataSourceName="R_VALUE_64")
		public NString RValue64;
		@DbRecordField(dataSourceName="R_VALUE_65")
		public NString RValue65;
		@DbRecordField(dataSourceName="R_VALUE_66")
		public NString RValue66;
		@DbRecordField(dataSourceName="R_VALUE_67")
		public NString RValue67;
		@DbRecordField(dataSourceName="R_VALUE_68")
		public NString RValue68;
		@DbRecordField(dataSourceName="R_VALUE_69")
		public NString RValue69;
		@DbRecordField(dataSourceName="R_VALUE_70")
		public NString RValue70;
		@DbRecordField(dataSourceName="R_VALUE_71")
		public NString RValue71;
		@DbRecordField(dataSourceName="R_VALUE_72")
		public NString RValue72;
		@DbRecordField(dataSourceName="R_VALUE_73")
		public NString RValue73;
		@DbRecordField(dataSourceName="R_VALUE_74")
		public NString RValue74;
		@DbRecordField(dataSourceName="R_VALUE_75")
		public NString RValue75;
		@DbRecordField(dataSourceName="R_VALUE_76")
		public NString RValue76;
		@DbRecordField(dataSourceName="R_VALUE_77")
		public NString RValue77;
		@DbRecordField(dataSourceName="R_VALUE_78")
		public NString RValue78;
		@DbRecordField(dataSourceName="R_VALUE_79")
		public NString RValue79;
		@DbRecordField(dataSourceName="R_VALUE_80")
		public NString RValue80;
		@DbRecordField(dataSourceName="R_VALUE_81")
		public NString RValue81;
		@DbRecordField(dataSourceName="R_VALUE_82")
		public NString RValue82;
		@DbRecordField(dataSourceName="R_VALUE_83")
		public NString RValue83;
		@DbRecordField(dataSourceName="R_VALUE_84")
		public NString RValue84;
		@DbRecordField(dataSourceName="R_VALUE_85")
		public NString RValue85;
		@DbRecordField(dataSourceName="R_VALUE_86")
		public NString RValue86;
		@DbRecordField(dataSourceName="R_VALUE_87")
		public NString RValue87;
		@DbRecordField(dataSourceName="R_VALUE_88")
		public NString RValue88;
		@DbRecordField(dataSourceName="R_VALUE_89")
		public NString RValue89;
		@DbRecordField(dataSourceName="R_VALUE_90")
		public NString RValue90;
		@DbRecordField(dataSourceName="R_VALUE_91")
		public NString RValue91;
		@DbRecordField(dataSourceName="R_VALUE_92")
		public NString RValue92;
		@DbRecordField(dataSourceName="R_VALUE_93")
		public NString RValue93;
		@DbRecordField(dataSourceName="R_VALUE_94")
		public NString RValue94;
		@DbRecordField(dataSourceName="R_VALUE_95")
		public NString RValue95;
		@DbRecordField(dataSourceName="R_VALUE_96")
		public NString RValue96;
		@DbRecordField(dataSourceName="R_VALUE_97")
		public NString RValue97;
		@DbRecordField(dataSourceName="R_VALUE_98")
		public NString RValue98;
		@DbRecordField(dataSourceName="R_VALUE_99")
		public NString RValue99;
		@DbRecordField(dataSourceName="R_VALUE_100")
		public NString RValue100;
		@DbRecordField(dataSourceName="R_VALUE_101")
		public NString RValue101;
		@DbRecordField(dataSourceName="R_VALUE_102")
		public NString RValue102;
		@DbRecordField(dataSourceName="R_VALUE_103")
		public NString RValue103;
		@DbRecordField(dataSourceName="R_VALUE_104")
		public NString RValue104;
		@DbRecordField(dataSourceName="R_VALUE_105")
		public NString RValue105;
		@DbRecordField(dataSourceName="R_VALUE_106")
		public NString RValue106;
		@DbRecordField(dataSourceName="R_VALUE_107")
		public NString RValue107;
		@DbRecordField(dataSourceName="R_VALUE_108")
		public NString RValue108;
		@DbRecordField(dataSourceName="R_VALUE_109")
		public NString RValue109;
		@DbRecordField(dataSourceName="R_VALUE_110")
		public NString RValue110;
		@DbRecordField(dataSourceName="R_VALUE_111")
		public NString RValue111;
		@DbRecordField(dataSourceName="R_VALUE_112")
		public NString RValue112;
		@DbRecordField(dataSourceName="R_VALUE_113")
		public NString RValue113;
		@DbRecordField(dataSourceName="R_VALUE_114")
		public NString RValue114;
		@DbRecordField(dataSourceName="R_VALUE_115")
		public NString RValue115;
		@DbRecordField(dataSourceName="R_VALUE_116")
		public NString RValue116;
		@DbRecordField(dataSourceName="R_VALUE_117")
		public NString RValue117;
		@DbRecordField(dataSourceName="R_VALUE_118")
		public NString RValue118;
		@DbRecordField(dataSourceName="R_VALUE_119")
		public NString RValue119;
		@DbRecordField(dataSourceName="R_VALUE_120")
		public NString RValue120;
		@DbRecordField(dataSourceName="R_VALUE_121")
		public NString RValue121;
		@DbRecordField(dataSourceName="R_VALUE_122")
		public NString RValue122;
		@DbRecordField(dataSourceName="R_VALUE_123")
		public NString RValue123;
		@DbRecordField(dataSourceName="R_VALUE_124")
		public NString RValue124;
		@DbRecordField(dataSourceName="R_VALUE_125")
		public NString RValue125;
		@DbRecordField(dataSourceName="R_VALUE_126")
		public NString RValue126;
		@DbRecordField(dataSourceName="R_VALUE_127")
		public NString RValue127;
		@DbRecordField(dataSourceName="R_VALUE_128")
		public NString RValue128;
		@DbRecordField(dataSourceName="R_VALUE_129")
		public NString RValue129;
		@DbRecordField(dataSourceName="R_VALUE_130")
		public NString RValue130;
		@DbRecordField(dataSourceName="R_VALUE_131")
		public NString RValue131;
		@DbRecordField(dataSourceName="R_VALUE_132")
		public NString RValue132;
		@DbRecordField(dataSourceName="R_VALUE_133")
		public NString RValue133;
		@DbRecordField(dataSourceName="R_VALUE_134")
		public NString RValue134;
		@DbRecordField(dataSourceName="R_VALUE_135")
		public NString RValue135;
		@DbRecordField(dataSourceName="R_VALUE_136")
		public NString RValue136;
		@DbRecordField(dataSourceName="R_VALUE_137")
		public NString RValue137;
		@DbRecordField(dataSourceName="R_VALUE_138")
		public NString RValue138;
		@DbRecordField(dataSourceName="R_VALUE_139")
		public NString RValue139;
		@DbRecordField(dataSourceName="R_VALUE_140")
		public NString RValue140;
		@DbRecordField(dataSourceName="R_VALUE_141")
		public NString RValue141;
		@DbRecordField(dataSourceName="R_VALUE_142")
		public NString RValue142;
		@DbRecordField(dataSourceName="R_VALUE_143")
		public NString RValue143;
		@DbRecordField(dataSourceName="R_VALUE_144")
		public NString RValue144;
		@DbRecordField(dataSourceName="R_VALUE_145")
		public NString RValue145;
		@DbRecordField(dataSourceName="R_VALUE_146")
		public NString RValue146;
		@DbRecordField(dataSourceName="R_VALUE_147")
		public NString RValue147;
		@DbRecordField(dataSourceName="R_VALUE_148")
		public NString RValue148;
		@DbRecordField(dataSourceName="R_VALUE_149")
		public NString RValue149;
		@DbRecordField(dataSourceName="R_VALUE_150")
		public NString RValue150;
		@DbRecordField(dataSourceName="R_VALUE_151")
		public NString RValue151;
		@DbRecordField(dataSourceName="R_VALUE_152")
		public NString RValue152;
		@DbRecordField(dataSourceName="R_VALUE_153")
		public NString RValue153;
		@DbRecordField(dataSourceName="R_VALUE_154")
		public NString RValue154;
		@DbRecordField(dataSourceName="R_VALUE_155")
		public NString RValue155;
		@DbRecordField(dataSourceName="R_VALUE_156")
		public NString RValue156;
		@DbRecordField(dataSourceName="R_VALUE_157")
		public NString RValue157;
		@DbRecordField(dataSourceName="R_VALUE_158")
		public NString RValue158;
		@DbRecordField(dataSourceName="R_VALUE_159")
		public NString RValue159;
		@DbRecordField(dataSourceName="R_VALUE_160")
		public NString RValue160;
		@DbRecordField(dataSourceName="R_VALUE_161")
		public NString RValue161;
		@DbRecordField(dataSourceName="R_VALUE_162")
		public NString RValue162;
		@DbRecordField(dataSourceName="R_VALUE_163")
		public NString RValue163;
		@DbRecordField(dataSourceName="R_VALUE_164")
		public NString RValue164;
		@DbRecordField(dataSourceName="R_VALUE_165")
		public NString RValue165;
		@DbRecordField(dataSourceName="R_VALUE_166")
		public NString RValue166;
		@DbRecordField(dataSourceName="R_VALUE_167")
		public NString RValue167;
		@DbRecordField(dataSourceName="R_VALUE_168")
		public NString RValue168;
		@DbRecordField(dataSourceName="R_VALUE_169")
		public NString RValue169;
		@DbRecordField(dataSourceName="R_VALUE_170")
		public NString RValue170;
		@DbRecordField(dataSourceName="R_VALUE_171")
		public NString RValue171;
		@DbRecordField(dataSourceName="R_VALUE_172")
		public NString RValue172;
		@DbRecordField(dataSourceName="R_VALUE_173")
		public NString RValue173;
		@DbRecordField(dataSourceName="R_VALUE_174")
		public NString RValue174;
		@DbRecordField(dataSourceName="R_VALUE_175")
		public NString RValue175;
		@DbRecordField(dataSourceName="R_VALUE_176")
		public NString RValue176;
		@DbRecordField(dataSourceName="R_VALUE_177")
		public NString RValue177;
		@DbRecordField(dataSourceName="R_VALUE_178")
		public NString RValue178;
		@DbRecordField(dataSourceName="R_VALUE_179")
		public NString RValue179;
		@DbRecordField(dataSourceName="R_VALUE_180")
		public NString RValue180;
		@DbRecordField(dataSourceName="R_VALUE_181")
		public NString RValue181;
		@DbRecordField(dataSourceName="R_VALUE_182")
		public NString RValue182;
		@DbRecordField(dataSourceName="R_VALUE_183")
		public NString RValue183;
		@DbRecordField(dataSourceName="R_VALUE_184")
		public NString RValue184;
		@DbRecordField(dataSourceName="R_VALUE_185")
		public NString RValue185;
		@DbRecordField(dataSourceName="R_VALUE_186")
		public NString RValue186;
		@DbRecordField(dataSourceName="R_VALUE_187")
		public NString RValue187;
		@DbRecordField(dataSourceName="R_VALUE_188")
		public NString RValue188;
		@DbRecordField(dataSourceName="R_VALUE_189")
		public NString RValue189;
		@DbRecordField(dataSourceName="R_VALUE_190")
		public NString RValue190;
		@DbRecordField(dataSourceName="R_VALUE_191")
		public NString RValue191;
		@DbRecordField(dataSourceName="R_VALUE_192")
		public NString RValue192;
		@DbRecordField(dataSourceName="R_VALUE_193")
		public NString RValue193;
		@DbRecordField(dataSourceName="R_VALUE_194")
		public NString RValue194;
		@DbRecordField(dataSourceName="R_VALUE_195")
		public NString RValue195;
		@DbRecordField(dataSourceName="R_VALUE_196")
		public NString RValue196;
		@DbRecordField(dataSourceName="R_VALUE_197")
		public NString RValue197;
		@DbRecordField(dataSourceName="R_VALUE_198")
		public NString RValue198;
		@DbRecordField(dataSourceName="R_VALUE_199")
		public NString RValue199;
		@DbRecordField(dataSourceName="R_VALUE_200")
		public NString RValue200;
		@DbRecordField(dataSourceName="R_VALUE_201")
		public NString RValue201;
		@DbRecordField(dataSourceName="R_VALUE_202")
		public NString RValue202;
		@DbRecordField(dataSourceName="R_VALUE_203")
		public NString RValue203;
		@DbRecordField(dataSourceName="R_VALUE_204")
		public NString RValue204;
		@DbRecordField(dataSourceName="R_VALUE_205")
		public NString RValue205;
		@DbRecordField(dataSourceName="R_VALUE_206")
		public NString RValue206;
		@DbRecordField(dataSourceName="R_VALUE_207")
		public NString RValue207;
		@DbRecordField(dataSourceName="R_VALUE_208")
		public NString RValue208;
		@DbRecordField(dataSourceName="R_VALUE_209")
		public NString RValue209;
		@DbRecordField(dataSourceName="R_VALUE_210")
		public NString RValue210;
		@DbRecordField(dataSourceName="R_VALUE_211")
		public NString RValue211;
		@DbRecordField(dataSourceName="R_VALUE_212")
		public NString RValue212;
		@DbRecordField(dataSourceName="R_VALUE_213")
		public NString RValue213;
		@DbRecordField(dataSourceName="R_VALUE_214")
		public NString RValue214;
		@DbRecordField(dataSourceName="R_VALUE_215")
		public NString RValue215;
		@DbRecordField(dataSourceName="R_VALUE_216")
		public NString RValue216;
		@DbRecordField(dataSourceName="R_VALUE_217")
		public NString RValue217;
		@DbRecordField(dataSourceName="R_VALUE_218")
		public NString RValue218;
		@DbRecordField(dataSourceName="R_VALUE_219")
		public NString RValue219;
		@DbRecordField(dataSourceName="R_VALUE_220")
		public NString RValue220;
		@DbRecordField(dataSourceName="R_VALUE_221")
		public NString RValue221;
		@DbRecordField(dataSourceName="R_VALUE_222")
		public NString RValue222;
		@DbRecordField(dataSourceName="R_VALUE_223")
		public NString RValue223;
		@DbRecordField(dataSourceName="R_VALUE_224")
		public NString RValue224;
		@DbRecordField(dataSourceName="R_VALUE_225")
		public NString RValue225;
		@DbRecordField(dataSourceName="R_VALUE_226")
		public NString RValue226;
		@DbRecordField(dataSourceName="R_VALUE_227")
		public NString RValue227;
		@DbRecordField(dataSourceName="R_VALUE_228")
		public NString RValue228;
		@DbRecordField(dataSourceName="R_VALUE_229")
		public NString RValue229;
		@DbRecordField(dataSourceName="R_VALUE_230")
		public NString RValue230;
		@DbRecordField(dataSourceName="R_VALUE_231")
		public NString RValue231;
		@DbRecordField(dataSourceName="R_VALUE_232")
		public NString RValue232;
		@DbRecordField(dataSourceName="R_VALUE_233")
		public NString RValue233;
		@DbRecordField(dataSourceName="R_VALUE_234")
		public NString RValue234;
		@DbRecordField(dataSourceName="R_VALUE_235")
		public NString RValue235;
		@DbRecordField(dataSourceName="R_VALUE_236")
		public NString RValue236;
		@DbRecordField(dataSourceName="R_VALUE_237")
		public NString RValue237;
		@DbRecordField(dataSourceName="R_VALUE_238")
		public NString RValue238;
		@DbRecordField(dataSourceName="R_VALUE_239")
		public NString RValue239;
		@DbRecordField(dataSourceName="R_VALUE_240")
		public NString RValue240;
		@DbRecordField(dataSourceName="R_VALUE_241")
		public NString RValue241;
		@DbRecordField(dataSourceName="R_VALUE_242")
		public NString RValue242;
		@DbRecordField(dataSourceName="R_VALUE_243")
		public NString RValue243;
		@DbRecordField(dataSourceName="R_VALUE_244")
		public NString RValue244;
		@DbRecordField(dataSourceName="R_VALUE_245")
		public NString RValue245;
		@DbRecordField(dataSourceName="R_VALUE_246")
		public NString RValue246;
		@DbRecordField(dataSourceName="R_VALUE_247")
		public NString RValue247;
		@DbRecordField(dataSourceName="R_VALUE_248")
		public NString RValue248;
		@DbRecordField(dataSourceName="R_VALUE_249")
		public NString RValue249;
		@DbRecordField(dataSourceName="R_VALUE_250")
		public NString RValue250;
		@DbRecordField(dataSourceName="R_VALUE_251")
		public NString RValue251;
		@DbRecordField(dataSourceName="R_VALUE_252")
		public NString RValue252;
		@DbRecordField(dataSourceName="R_VALUE_253")
		public NString RValue253;
		@DbRecordField(dataSourceName="R_VALUE_254")
		public NString RValue254;
		@DbRecordField(dataSourceName="R_VALUE_255")
		public NString RValue255;
		@DbRecordField(dataSourceName="R_VALUE_256")
		public NString RValue256;
		@DbRecordField(dataSourceName="R_VALUE_257")
		public NString RValue257;
		@DbRecordField(dataSourceName="R_VALUE_258")
		public NString RValue258;
		@DbRecordField(dataSourceName="R_VALUE_259")
		public NString RValue259;
		@DbRecordField(dataSourceName="R_VALUE_260")
		public NString RValue260;
		@DbRecordField(dataSourceName="R_VALUE_261")
		public NString RValue261;
		@DbRecordField(dataSourceName="R_VALUE_262")
		public NString RValue262;
		@DbRecordField(dataSourceName="R_VALUE_263")
		public NString RValue263;
		@DbRecordField(dataSourceName="R_VALUE_264")
		public NString RValue264;
		@DbRecordField(dataSourceName="R_VALUE_265")
		public NString RValue265;
		@DbRecordField(dataSourceName="R_VALUE_266")
		public NString RValue266;
		@DbRecordField(dataSourceName="R_VALUE_267")
		public NString RValue267;
		@DbRecordField(dataSourceName="R_VALUE_268")
		public NString RValue268;
		@DbRecordField(dataSourceName="R_VALUE_269")
		public NString RValue269;
		@DbRecordField(dataSourceName="R_VALUE_270")
		public NString RValue270;
		@DbRecordField(dataSourceName="R_VALUE_271")
		public NString RValue271;
		@DbRecordField(dataSourceName="R_VALUE_272")
		public NString RValue272;
		@DbRecordField(dataSourceName="R_VALUE_273")
		public NString RValue273;
		@DbRecordField(dataSourceName="R_VALUE_274")
		public NString RValue274;
		@DbRecordField(dataSourceName="R_VALUE_275")
		public NString RValue275;
		@DbRecordField(dataSourceName="R_VALUE_276")
		public NString RValue276;
		@DbRecordField(dataSourceName="R_VALUE_277")
		public NString RValue277;
		@DbRecordField(dataSourceName="R_VALUE_278")
		public NString RValue278;
		@DbRecordField(dataSourceName="R_VALUE_279")
		public NString RValue279;
		@DbRecordField(dataSourceName="R_VALUE_280")
		public NString RValue280;
		@DbRecordField(dataSourceName="R_VALUE_281")
		public NString RValue281;
		@DbRecordField(dataSourceName="R_VALUE_282")
		public NString RValue282;
		@DbRecordField(dataSourceName="R_VALUE_283")
		public NString RValue283;
		@DbRecordField(dataSourceName="R_VALUE_284")
		public NString RValue284;
		@DbRecordField(dataSourceName="R_VALUE_285")
		public NString RValue285;
		@DbRecordField(dataSourceName="R_VALUE_286")
		public NString RValue286;
		@DbRecordField(dataSourceName="R_VALUE_287")
		public NString RValue287;
		@DbRecordField(dataSourceName="R_VALUE_288")
		public NString RValue288;
		@DbRecordField(dataSourceName="R_VALUE_289")
		public NString RValue289;
		@DbRecordField(dataSourceName="R_VALUE_290")
		public NString RValue290;
		@DbRecordField(dataSourceName="R_VALUE_291")
		public NString RValue291;
		@DbRecordField(dataSourceName="R_VALUE_292")
		public NString RValue292;
		@DbRecordField(dataSourceName="R_VALUE_293")
		public NString RValue293;
		@DbRecordField(dataSourceName="R_VALUE_294")
		public NString RValue294;
		@DbRecordField(dataSourceName="R_VALUE_295")
		public NString RValue295;
		@DbRecordField(dataSourceName="R_VALUE_296")
		public NString RValue296;
		@DbRecordField(dataSourceName="R_VALUE_297")
		public NString RValue297;
		@DbRecordField(dataSourceName="R_VALUE_298")
		public NString RValue298;
		@DbRecordField(dataSourceName="R_VALUE_299")
		public NString RValue299;
		@DbRecordField(dataSourceName="R_VALUE_300")
		public NString RValue300;
		@DbRecordField(dataSourceName="R_VALUE_301")
		public NString RValue301;
		@DbRecordField(dataSourceName="R_VALUE_302")
		public NString RValue302;
		@DbRecordField(dataSourceName="R_VALUE_303")
		public NString RValue303;
		@DbRecordField(dataSourceName="R_VALUE_304")
		public NString RValue304;
		@DbRecordField(dataSourceName="R_VALUE_305")
		public NString RValue305;
		@DbRecordField(dataSourceName="R_VALUE_306")
		public NString RValue306;
		@DbRecordField(dataSourceName="R_VALUE_307")
		public NString RValue307;
		@DbRecordField(dataSourceName="R_VALUE_308")
		public NString RValue308;
		@DbRecordField(dataSourceName="R_VALUE_309")
		public NString RValue309;
		@DbRecordField(dataSourceName="R_VALUE_310")
		public NString RValue310;
		@DbRecordField(dataSourceName="R_VALUE_311")
		public NString RValue311;
		@DbRecordField(dataSourceName="R_VALUE_312")
		public NString RValue312;
		@DbRecordField(dataSourceName="R_VALUE_313")
		public NString RValue313;
		@DbRecordField(dataSourceName="R_VALUE_314")
		public NString RValue314;
		@DbRecordField(dataSourceName="R_VALUE_315")
		public NString RValue315;
		@DbRecordField(dataSourceName="R_VALUE_316")
		public NString RValue316;
		@DbRecordField(dataSourceName="R_VALUE_317")
		public NString RValue317;
		@DbRecordField(dataSourceName="R_VALUE_318")
		public NString RValue318;
		@DbRecordField(dataSourceName="R_VALUE_319")
		public NString RValue319;
		@DbRecordField(dataSourceName="R_VALUE_320")
		public NString RValue320;
		@DbRecordField(dataSourceName="R_VALUE_321")
		public NString RValue321;
		@DbRecordField(dataSourceName="R_VALUE_322")
		public NString RValue322;
		@DbRecordField(dataSourceName="R_VALUE_323")
		public NString RValue323;
		@DbRecordField(dataSourceName="R_VALUE_324")
		public NString RValue324;
		@DbRecordField(dataSourceName="R_VALUE_325")
		public NString RValue325;
		@DbRecordField(dataSourceName="R_VALUE_326")
		public NString RValue326;
		@DbRecordField(dataSourceName="R_VALUE_327")
		public NString RValue327;
		@DbRecordField(dataSourceName="R_VALUE_328")
		public NString RValue328;
		@DbRecordField(dataSourceName="R_VALUE_329")
		public NString RValue329;
		@DbRecordField(dataSourceName="R_VALUE_330")
		public NString RValue330;
		@DbRecordField(dataSourceName="R_VALUE_331")
		public NString RValue331;
		@DbRecordField(dataSourceName="R_VALUE_332")
		public NString RValue332;
		@DbRecordField(dataSourceName="R_VALUE_333")
		public NString RValue333;
		@DbRecordField(dataSourceName="R_VALUE_334")
		public NString RValue334;
		@DbRecordField(dataSourceName="R_VALUE_335")
		public NString RValue335;
		@DbRecordField(dataSourceName="R_VALUE_336")
		public NString RValue336;
		@DbRecordField(dataSourceName="R_VALUE_337")
		public NString RValue337;
		@DbRecordField(dataSourceName="R_VALUE_338")
		public NString RValue338;
		@DbRecordField(dataSourceName="R_VALUE_339")
		public NString RValue339;
		@DbRecordField(dataSourceName="R_VALUE_340")
		public NString RValue340;
		@DbRecordField(dataSourceName="R_VALUE_341")
		public NString RValue341;
		@DbRecordField(dataSourceName="R_VALUE_342")
		public NString RValue342;
		@DbRecordField(dataSourceName="R_VALUE_343")
		public NString RValue343;
		@DbRecordField(dataSourceName="R_VALUE_344")
		public NString RValue344;
		@DbRecordField(dataSourceName="R_VALUE_345")
		public NString RValue345;
		@DbRecordField(dataSourceName="R_VALUE_346")
		public NString RValue346;
		@DbRecordField(dataSourceName="R_VALUE_347")
		public NString RValue347;
		@DbRecordField(dataSourceName="R_VALUE_348")
		public NString RValue348;
		@DbRecordField(dataSourceName="R_VALUE_349")
		public NString RValue349;
		@DbRecordField(dataSourceName="R_VALUE_350")
		public NString RValue350;
		@DbRecordField(dataSourceName="R_VALUE_351")
		public NString RValue351;
		@DbRecordField(dataSourceName="R_VALUE_352")
		public NString RValue352;
		@DbRecordField(dataSourceName="R_VALUE_353")
		public NString RValue353;
		@DbRecordField(dataSourceName="R_VALUE_354")
		public NString RValue354;
		@DbRecordField(dataSourceName="R_VALUE_355")
		public NString RValue355;
		@DbRecordField(dataSourceName="R_VALUE_356")
		public NString RValue356;
		@DbRecordField(dataSourceName="R_VALUE_357")
		public NString RValue357;
		@DbRecordField(dataSourceName="R_VALUE_358")
		public NString RValue358;
		@DbRecordField(dataSourceName="R_VALUE_359")
		public NString RValue359;
		@DbRecordField(dataSourceName="R_VALUE_360")
		public NString RValue360;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
