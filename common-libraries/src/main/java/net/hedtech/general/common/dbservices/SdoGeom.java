package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGeom {
		public static NNumber FcheckBounds(NString tablename,NNumber gid,NNumber eseq,NNumber seq,NNumber coordwidth,NNumber dim1lb,NNumber dim1ub,NNumber dim2lb,NNumber dim2ub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.CHECK_BOUNDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@GID", gid);
			cmd.addParameter("@ESEQ", eseq);
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@COORDWIDTH", coordwidth);
			cmd.addParameter("@DIM1LB", dim1lb);
			cmd.addParameter("@DIM1UB", dim1ub);
			cmd.addParameter("@DIM2LB", dim2lb);
			cmd.addParameter("@DIM2UB", dim2ub);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static List<SdoDimArrayRow> FgetDimArray( geom,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.GET_DIM_ARRAY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoDimArrayRow>.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoDimArrayRow>.class);
//
//		}
		
		public static void getOrds(NString tablename,NNumber gid,NNumber eseq,NNumber seq,NNumber columnindex,Ref<NNumber> xrtn,Ref<NNumber> yrtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.GET_ORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@GID", gid);
			cmd.addParameter("@ESEQ", eseq);
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@COLUMNINDEX", columnindex);
			cmd.addParameter("@XRTN", NNumber.class);
			cmd.addParameter("@YRTN", NNumber.class);
				
			cmd.execute();
			xrtn.val = cmd.getParameterValue("@XRTN", NNumber.class);
			yrtn.val = cmd.getParameterValue("@YRTN", NNumber.class);


		}
		
		public static NNumber FinitElement(NString layer,NNumber gid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.INIT_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID", gid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Finteract(NString layer,NNumber gid1,NNumber gid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.INTERACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@GID2", gid2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Finteract(NString layer1,NNumber gid1,NString layer2,NNumber gid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.INTERACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER1", layer1);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@LAYER2", layer2);
			cmd.addParameter("@GID2", gid2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Finteract(NString layer1,NNumber gid1,NNumber xTolerance,NNumber yTolerance,NNumber v000,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.INTERACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER1", layer1);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@X_TOLERANCE", xTolerance);
			cmd.addParameter("@Y_TOLERANCE", yTolerance);
			cmd.addParameter("@V000", v000);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Frelate(NString layer,NNumber gid1,NString mask,NNumber gid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@GID2", gid2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Frelate(NString layer1,NNumber gid1,NString mask,NString layer2,NNumber gid2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER1", layer1);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@LAYER2", layer2);
			cmd.addParameter("@GID2", gid2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Frelate(NString layer1,NNumber gid1,NNumber nord1,NString mask,NString layer2,NNumber gid2,NNumber nord2,NNumber tolerance1,NNumber tolerance2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER1", layer1);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@NORD1", nord1);
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@LAYER2", layer2);
			cmd.addParameter("@GID2", gid2);
			cmd.addParameter("@NORD2", nord2);
			cmd.addParameter("@TOLERANCE1", tolerance1);
			cmd.addParameter("@TOLERANCE2", tolerance2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Frelate(NString layer1,NNumber gid1,NString mask,NNumber xTolerance,NNumber yTolerance,NNumber v000,NNumber v001,NNumber v002,NNumber v003,NNumber v004,NNumber v005,NNumber v006,NNumber v007,NNumber v008,NNumber v009,NNumber v010,NNumber v011,NNumber v012,NNumber v013,NNumber v014,NNumber v015,NNumber v016,NNumber v017,NNumber v018,NNumber v019,NNumber v020,NNumber v021,NNumber v022,NNumber v023,NNumber v024,NNumber v025,NNumber v026,NNumber v027,NNumber v028,NNumber v029,NNumber v030,NNumber v031,NNumber v032,NNumber v033,NNumber v034,NNumber v035,NNumber v036,NNumber v037,NNumber v038,NNumber v039,NNumber v040,NNumber v041,NNumber v042,NNumber v043,NNumber v044,NNumber v045,NNumber v046,NNumber v047,NNumber v048,NNumber v049,NNumber v050,NNumber v051,NNumber v052,NNumber v053,NNumber v054,NNumber v055,NNumber v056,NNumber v057,NNumber v058,NNumber v059,NNumber v060,NNumber v061,NNumber v062,NNumber v063,NNumber v064,NNumber v065,NNumber v066,NNumber v067,NNumber v068,NNumber v069,NNumber v070,NNumber v071,NNumber v072,NNumber v073,NNumber v074,NNumber v075,NNumber v076,NNumber v077,NNumber v078,NNumber v079,NNumber v080,NNumber v081,NNumber v082,NNumber v083,NNumber v084,NNumber v085,NNumber v086,NNumber v087,NNumber v088,NNumber v089,NNumber v090,NNumber v091,NNumber v092,NNumber v093,NNumber v094,NNumber v095,NNumber v096,NNumber v097,NNumber v098,NNumber v099,NNumber v100,NNumber v101,NNumber v102,NNumber v103,NNumber v104,NNumber v105,NNumber v106,NNumber v107,NNumber v108,NNumber v109,NNumber v110,NNumber v111,NNumber v112,NNumber v113,NNumber v114,NNumber v115,NNumber v116,NNumber v117,NNumber v118,NNumber v119,NNumber v120,NNumber v121,NNumber v122,NNumber v123,NNumber v124,NNumber v125,NNumber v126,NNumber v127,NNumber v128,NNumber v129,NNumber v130,NNumber v131,NNumber v132,NNumber v133,NNumber v134,NNumber v135,NNumber v136,NNumber v137,NNumber v138,NNumber v139,NNumber v140,NNumber v141,NNumber v142,NNumber v143,NNumber v144,NNumber v145,NNumber v146,NNumber v147,NNumber v148,NNumber v149,NNumber v150,NNumber v151,NNumber v152,NNumber v153,NNumber v154,NNumber v155,NNumber v156,NNumber v157,NNumber v158,NNumber v159,NNumber v160,NNumber v161,NNumber v162,NNumber v163,NNumber v164,NNumber v165,NNumber v166,NNumber v167,NNumber v168,NNumber v169,NNumber v170,NNumber v171,NNumber v172,NNumber v173,NNumber v174,NNumber v175,NNumber v176,NNumber v177,NNumber v178,NNumber v179,NNumber v180,NNumber v181,NNumber v182,NNumber v183,NNumber v184,NNumber v185,NNumber v186,NNumber v187,NNumber v188,NNumber v189,NNumber v190,NNumber v191,NNumber v192,NNumber v193,NNumber v194,NNumber v195,NNumber v196,NNumber v197,NNumber v198,NNumber v199,NNumber v200,NNumber v201,NNumber v202,NNumber v203,NNumber v204,NNumber v205,NNumber v206,NNumber v207,NNumber v208,NNumber v209,NNumber v210,NNumber v211,NNumber v212,NNumber v213,NNumber v214,NNumber v215,NNumber v216,NNumber v217,NNumber v218,NNumber v219,NNumber v220,NNumber v221,NNumber v222,NNumber v223,NNumber v224,NNumber v225,NNumber v226,NNumber v227,NNumber v228,NNumber v229,NNumber v230,NNumber v231,NNumber v232,NNumber v233,NNumber v234,NNumber v235,NNumber v236,NNumber v237,NNumber v238,NNumber v239,NNumber v240,NNumber v241,NNumber v242,NNumber v243,NNumber v244,NNumber v245,NNumber v246,NNumber v247,NNumber v248,NNumber v249) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LAYER1", layer1);
			cmd.addParameter("@GID1", gid1);
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@X_TOLERANCE", xTolerance);
			cmd.addParameter("@Y_TOLERANCE", yTolerance);
			cmd.addParameter("@V000", v000);
			cmd.addParameter("@V001", v001);
			cmd.addParameter("@V002", v002);
			cmd.addParameter("@V003", v003);
			cmd.addParameter("@V004", v004);
			cmd.addParameter("@V005", v005);
			cmd.addParameter("@V006", v006);
			cmd.addParameter("@V007", v007);
			cmd.addParameter("@V008", v008);
			cmd.addParameter("@V009", v009);
			cmd.addParameter("@V010", v010);
			cmd.addParameter("@V011", v011);
			cmd.addParameter("@V012", v012);
			cmd.addParameter("@V013", v013);
			cmd.addParameter("@V014", v014);
			cmd.addParameter("@V015", v015);
			cmd.addParameter("@V016", v016);
			cmd.addParameter("@V017", v017);
			cmd.addParameter("@V018", v018);
			cmd.addParameter("@V019", v019);
			cmd.addParameter("@V020", v020);
			cmd.addParameter("@V021", v021);
			cmd.addParameter("@V022", v022);
			cmd.addParameter("@V023", v023);
			cmd.addParameter("@V024", v024);
			cmd.addParameter("@V025", v025);
			cmd.addParameter("@V026", v026);
			cmd.addParameter("@V027", v027);
			cmd.addParameter("@V028", v028);
			cmd.addParameter("@V029", v029);
			cmd.addParameter("@V030", v030);
			cmd.addParameter("@V031", v031);
			cmd.addParameter("@V032", v032);
			cmd.addParameter("@V033", v033);
			cmd.addParameter("@V034", v034);
			cmd.addParameter("@V035", v035);
			cmd.addParameter("@V036", v036);
			cmd.addParameter("@V037", v037);
			cmd.addParameter("@V038", v038);
			cmd.addParameter("@V039", v039);
			cmd.addParameter("@V040", v040);
			cmd.addParameter("@V041", v041);
			cmd.addParameter("@V042", v042);
			cmd.addParameter("@V043", v043);
			cmd.addParameter("@V044", v044);
			cmd.addParameter("@V045", v045);
			cmd.addParameter("@V046", v046);
			cmd.addParameter("@V047", v047);
			cmd.addParameter("@V048", v048);
			cmd.addParameter("@V049", v049);
			cmd.addParameter("@V050", v050);
			cmd.addParameter("@V051", v051);
			cmd.addParameter("@V052", v052);
			cmd.addParameter("@V053", v053);
			cmd.addParameter("@V054", v054);
			cmd.addParameter("@V055", v055);
			cmd.addParameter("@V056", v056);
			cmd.addParameter("@V057", v057);
			cmd.addParameter("@V058", v058);
			cmd.addParameter("@V059", v059);
			cmd.addParameter("@V060", v060);
			cmd.addParameter("@V061", v061);
			cmd.addParameter("@V062", v062);
			cmd.addParameter("@V063", v063);
			cmd.addParameter("@V064", v064);
			cmd.addParameter("@V065", v065);
			cmd.addParameter("@V066", v066);
			cmd.addParameter("@V067", v067);
			cmd.addParameter("@V068", v068);
			cmd.addParameter("@V069", v069);
			cmd.addParameter("@V070", v070);
			cmd.addParameter("@V071", v071);
			cmd.addParameter("@V072", v072);
			cmd.addParameter("@V073", v073);
			cmd.addParameter("@V074", v074);
			cmd.addParameter("@V075", v075);
			cmd.addParameter("@V076", v076);
			cmd.addParameter("@V077", v077);
			cmd.addParameter("@V078", v078);
			cmd.addParameter("@V079", v079);
			cmd.addParameter("@V080", v080);
			cmd.addParameter("@V081", v081);
			cmd.addParameter("@V082", v082);
			cmd.addParameter("@V083", v083);
			cmd.addParameter("@V084", v084);
			cmd.addParameter("@V085", v085);
			cmd.addParameter("@V086", v086);
			cmd.addParameter("@V087", v087);
			cmd.addParameter("@V088", v088);
			cmd.addParameter("@V089", v089);
			cmd.addParameter("@V090", v090);
			cmd.addParameter("@V091", v091);
			cmd.addParameter("@V092", v092);
			cmd.addParameter("@V093", v093);
			cmd.addParameter("@V094", v094);
			cmd.addParameter("@V095", v095);
			cmd.addParameter("@V096", v096);
			cmd.addParameter("@V097", v097);
			cmd.addParameter("@V098", v098);
			cmd.addParameter("@V099", v099);
			cmd.addParameter("@V100", v100);
			cmd.addParameter("@V101", v101);
			cmd.addParameter("@V102", v102);
			cmd.addParameter("@V103", v103);
			cmd.addParameter("@V104", v104);
			cmd.addParameter("@V105", v105);
			cmd.addParameter("@V106", v106);
			cmd.addParameter("@V107", v107);
			cmd.addParameter("@V108", v108);
			cmd.addParameter("@V109", v109);
			cmd.addParameter("@V110", v110);
			cmd.addParameter("@V111", v111);
			cmd.addParameter("@V112", v112);
			cmd.addParameter("@V113", v113);
			cmd.addParameter("@V114", v114);
			cmd.addParameter("@V115", v115);
			cmd.addParameter("@V116", v116);
			cmd.addParameter("@V117", v117);
			cmd.addParameter("@V118", v118);
			cmd.addParameter("@V119", v119);
			cmd.addParameter("@V120", v120);
			cmd.addParameter("@V121", v121);
			cmd.addParameter("@V122", v122);
			cmd.addParameter("@V123", v123);
			cmd.addParameter("@V124", v124);
			cmd.addParameter("@V125", v125);
			cmd.addParameter("@V126", v126);
			cmd.addParameter("@V127", v127);
			cmd.addParameter("@V128", v128);
			cmd.addParameter("@V129", v129);
			cmd.addParameter("@V130", v130);
			cmd.addParameter("@V131", v131);
			cmd.addParameter("@V132", v132);
			cmd.addParameter("@V133", v133);
			cmd.addParameter("@V134", v134);
			cmd.addParameter("@V135", v135);
			cmd.addParameter("@V136", v136);
			cmd.addParameter("@V137", v137);
			cmd.addParameter("@V138", v138);
			cmd.addParameter("@V139", v139);
			cmd.addParameter("@V140", v140);
			cmd.addParameter("@V141", v141);
			cmd.addParameter("@V142", v142);
			cmd.addParameter("@V143", v143);
			cmd.addParameter("@V144", v144);
			cmd.addParameter("@V145", v145);
			cmd.addParameter("@V146", v146);
			cmd.addParameter("@V147", v147);
			cmd.addParameter("@V148", v148);
			cmd.addParameter("@V149", v149);
			cmd.addParameter("@V150", v150);
			cmd.addParameter("@V151", v151);
			cmd.addParameter("@V152", v152);
			cmd.addParameter("@V153", v153);
			cmd.addParameter("@V154", v154);
			cmd.addParameter("@V155", v155);
			cmd.addParameter("@V156", v156);
			cmd.addParameter("@V157", v157);
			cmd.addParameter("@V158", v158);
			cmd.addParameter("@V159", v159);
			cmd.addParameter("@V160", v160);
			cmd.addParameter("@V161", v161);
			cmd.addParameter("@V162", v162);
			cmd.addParameter("@V163", v163);
			cmd.addParameter("@V164", v164);
			cmd.addParameter("@V165", v165);
			cmd.addParameter("@V166", v166);
			cmd.addParameter("@V167", v167);
			cmd.addParameter("@V168", v168);
			cmd.addParameter("@V169", v169);
			cmd.addParameter("@V170", v170);
			cmd.addParameter("@V171", v171);
			cmd.addParameter("@V172", v172);
			cmd.addParameter("@V173", v173);
			cmd.addParameter("@V174", v174);
			cmd.addParameter("@V175", v175);
			cmd.addParameter("@V176", v176);
			cmd.addParameter("@V177", v177);
			cmd.addParameter("@V178", v178);
			cmd.addParameter("@V179", v179);
			cmd.addParameter("@V180", v180);
			cmd.addParameter("@V181", v181);
			cmd.addParameter("@V182", v182);
			cmd.addParameter("@V183", v183);
			cmd.addParameter("@V184", v184);
			cmd.addParameter("@V185", v185);
			cmd.addParameter("@V186", v186);
			cmd.addParameter("@V187", v187);
			cmd.addParameter("@V188", v188);
			cmd.addParameter("@V189", v189);
			cmd.addParameter("@V190", v190);
			cmd.addParameter("@V191", v191);
			cmd.addParameter("@V192", v192);
			cmd.addParameter("@V193", v193);
			cmd.addParameter("@V194", v194);
			cmd.addParameter("@V195", v195);
			cmd.addParameter("@V196", v196);
			cmd.addParameter("@V197", v197);
			cmd.addParameter("@V198", v198);
			cmd.addParameter("@V199", v199);
			cmd.addParameter("@V200", v200);
			cmd.addParameter("@V201", v201);
			cmd.addParameter("@V202", v202);
			cmd.addParameter("@V203", v203);
			cmd.addParameter("@V204", v204);
			cmd.addParameter("@V205", v205);
			cmd.addParameter("@V206", v206);
			cmd.addParameter("@V207", v207);
			cmd.addParameter("@V208", v208);
			cmd.addParameter("@V209", v209);
			cmd.addParameter("@V210", v210);
			cmd.addParameter("@V211", v211);
			cmd.addParameter("@V212", v212);
			cmd.addParameter("@V213", v213);
			cmd.addParameter("@V214", v214);
			cmd.addParameter("@V215", v215);
			cmd.addParameter("@V216", v216);
			cmd.addParameter("@V217", v217);
			cmd.addParameter("@V218", v218);
			cmd.addParameter("@V219", v219);
			cmd.addParameter("@V220", v220);
			cmd.addParameter("@V221", v221);
			cmd.addParameter("@V222", v222);
			cmd.addParameter("@V223", v223);
			cmd.addParameter("@V224", v224);
			cmd.addParameter("@V225", v225);
			cmd.addParameter("@V226", v226);
			cmd.addParameter("@V227", v227);
			cmd.addParameter("@V228", v228);
			cmd.addParameter("@V229", v229);
			cmd.addParameter("@V230", v230);
			cmd.addParameter("@V231", v231);
			cmd.addParameter("@V232", v232);
			cmd.addParameter("@V233", v233);
			cmd.addParameter("@V234", v234);
			cmd.addParameter("@V235", v235);
			cmd.addParameter("@V236", v236);
			cmd.addParameter("@V237", v237);
			cmd.addParameter("@V238", v238);
			cmd.addParameter("@V239", v239);
			cmd.addParameter("@V240", v240);
			cmd.addParameter("@V241", v241);
			cmd.addParameter("@V242", v242);
			cmd.addParameter("@V243", v243);
			cmd.addParameter("@V244", v244);
			cmd.addParameter("@V245", v245);
			cmd.addParameter("@V246", v246);
			cmd.addParameter("@V247", v247);
			cmd.addParameter("@V248", v248);
			cmd.addParameter("@V249", v249);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString Frelate( geom1,List<SdoDimArrayRow> dim1,NString mask, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString Frelate( geom1,NString mask, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.RELATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@MASK", mask);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  FsdoArcDensify( geom,List<SdoDimArrayRow> dim,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_ARC_DENSIFY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoArcDensify( geom,NNumber tol,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_ARC_DENSIFY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FsdoArea( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_AREA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoArea( geom,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_AREA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoArea( geom,List<SdoDimArrayRow> dim,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_AREA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoArea( geom,NNumber tol,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_AREA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsdoBuffer( geom,List<SdoDimArrayRow> dim,NNumber dist) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@DIST", dist);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoBuffer( geom,NNumber dist,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoBuffer( geom,List<SdoDimArrayRow> dim,NNumber dist,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoBuffer( geom,NNumber dist,NNumber tol,NString _params) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_BUFFER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@PARAMS", _params);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoCentroid( geom1,List<SdoDimArrayRow> dim1) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_CENTROID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoCentroid( geom1,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_CENTROID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void sdoClosestPoints( geom1, geom2,NNumber tolerance,NString unit,Ref<NNumber> dist,Ref<> geoma,Ref<> geomb) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_CLOSEST_POINTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@DIST", NNumber.class);
//			cmd.addParameter("@GEOMA", geoma.class);
//			cmd.addParameter("@GEOMB", geomb.class);
//				
//			cmd.execute();
//			dist.val = cmd.getParameterValue("@DIST", NNumber.class);
//			geoma.val = cmd.getParameterValue("@GEOMA", geoma.class);
//			geomb.val = cmd.getParameterValue("@GEOMB", geomb.class);
//
//
//		}
		
//		public static  FsdoConvexhull( geom1,List<SdoDimArrayRow> dim1) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_CONVEXHULL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoConvexhull( geom1,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_CONVEXHULL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoDifference( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DIFFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoDifference( geom1, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DIFFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FsdoDistance( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoDistance( geom1, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoDistance( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoDistance( geom1, geom2,NNumber tol,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsdoG3dconv( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_G3DCONV", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoG3dconv( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_G3DCONV", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoIntersection( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_INTERSECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FsdoIntersection( geom1, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_INTERSECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FsdoLength( geom,List<SdoDimArrayRow> dim,NNumber countSharedEdges) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@COUNT_SHARED_EDGES", countSharedEdges);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoLength( geom,NNumber tol,NNumber countSharedEdges) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@COUNT_SHARED_EDGES", countSharedEdges);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoLength( geom,List<SdoDimArrayRow> dim,NString unit,NNumber countSharedEdges) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@COUNT_SHARED_EDGES", countSharedEdges);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoLength( geom,NNumber tol,NString unit,NNumber countSharedEdges) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_LENGTH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@UNIT", unit);
//			cmd.addParameter("@COUNT_SHARED_EDGES", countSharedEdges);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoMaxMbrOrdinate( geom,List<SdoDimArrayRow> dim,NNumber ordinatePos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MAX_MBR_ORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@ORDINATE_POS", ordinatePos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoMaxMbrOrdinate( geom,NNumber ordinatePos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MAX_MBR_ORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@ORDINATE_POS", ordinatePos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsdoMbr( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MBR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoMbr( geom) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MBR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FsdoMinMbrOrdinate( geom,List<SdoDimArrayRow> dim,NNumber ordinatePos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MIN_MBR_ORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//			cmd.addParameter("@ORDINATE_POS", ordinatePos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber FsdoMinMbrOrdinate( geom,NNumber ordinatePos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_MIN_MBR_ORDINATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@ORDINATE_POS", ordinatePos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsdoPointonsurface( geom1,List<SdoDimArrayRow> dim1) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POINTONSURFACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoPointonsurface( geom1,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POINTONSURFACE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoPolyDifference( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POLY_DIFFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoPolyIntersection( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POLY_INTERSECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoPolyUnion( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POLY_UNION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoPolyXor( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_POLY_XOR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoUnion( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_UNION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FsdoUnion( geom1, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_UNION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber FsdoVolume( geom,NNumber tol,NString unit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_VOLUME", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOM", geom);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@UNIT", unit);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static  FsdoXor( geom1,List<SdoDimArrayRow> dim1, geom2,List<SdoDimArrayRow> dim2) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_XOR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FsdoXor( geom1, geom2,NNumber tol) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.SDO_XOR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NString FvalidateGeometry(NString layer,NNumber gid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@LAYER", layer);
//			cmd.addParameter("@GID", gid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FvalidateGeometry( thegeometry,List<SdoDimArrayRow> thediminfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@THEGEOMETRY", thegeometry);
//			// cmd.addParameter(DbTypes.getCollectionType("THEDIMINFO", "", thediminfo, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FvalidateGeometry( thegeometry,NNumber tolerance) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@THEGEOMETRY", thegeometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FvalidateGeometryWithContext( thegeometry,List<SdoDimArrayRow> thediminfo,NString conditional) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@THEGEOMETRY", thegeometry);
//			// cmd.addParameter(DbTypes.getCollectionType("THEDIMINFO", "", thediminfo, object.class));
//			cmd.addParameter("@CONDITIONAL", conditional);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FvalidateGeometryWithContext( thegeometry,NNumber tolerance,NString conditional) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@THEGEOMETRY", thegeometry);
//			cmd.addParameter("@TOLERANCE", tolerance);
//			cmd.addParameter("@CONDITIONAL", conditional);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void validateLayer(NString layer,NString resultTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@RESULT_TABLE", resultTable);
				
			cmd.execute();


		}
		
		public static void validateLayer(NString geomTable,NString geomColumn,NString pkeyColumn,NString resultTable,NNumber commitInterval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_LAYER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GEOM_TABLE", geomTable);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@PKEY_COLUMN", pkeyColumn);
			cmd.addParameter("@RESULT_TABLE", resultTable);
			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
				
			cmd.execute();


		}
		
		public static void validateLayerWithContext(NString geomTable,NString geomColumn,NString resultTable,NNumber commitInterval,NString conditional) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.VALIDATE_LAYER_WITH_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GEOM_TABLE", geomTable);
			cmd.addParameter("@GEOM_COLUMN", geomColumn);
			cmd.addParameter("@RESULT_TABLE", resultTable);
			cmd.addParameter("@COMMIT_INTERVAL", commitInterval);
			cmd.addParameter("@CONDITIONAL", conditional);
				
			cmd.execute();


		}
		
//		public static NString FwithinDistance( geom1,List<SdoDimArrayRow> dim1,NNumber dist, geom2,List<SdoDimArrayRow> dim2,NString units) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM1", "", dim1, object.class));
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@GEOM2", geom2);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM2", "", dim2, object.class));
//			cmd.addParameter("@UNITS", units);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FwithinDistance( geom1,NNumber dist, geom2,NNumber tol,NString units) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOM.WITHIN_DISTANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@GEOM1", geom1);
//			cmd.addParameter("@DIST", dist);
//			cmd.addParameter("@GEOM2", geom2);
//			cmd.addParameter("@TOL", tol);
//			cmd.addParameter("@UNITS", units);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
	
	
	
}
