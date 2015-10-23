package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkpref {
		public static void pBuildMangMyPros(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_BUILD_MANG_MY_PROS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pBuildProfiles(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_BUILD_PROFILES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pInputConsPref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_INPUT_CONS_PREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInputGnrlPref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_INPUT_GNRL_PREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInputMyprosPref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_INPUT_MYPROS_PREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInputOrgPref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_INPUT_ORG_PREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInputProsPref() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_INPUT_PROS_PREF", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateConsPref(NString longInd1,NString shortInd1,NNumber seqNo1,NString dowpCode1,NString longInd2,NString shortInd2,NNumber seqNo2,NString dowpCode2,NString longInd3,NString shortInd3,NNumber seqNo3,NString dowpCode3,NString longInd4,NString shortInd4,NNumber seqNo4,NString dowpCode4,NString longInd5,NString shortInd5,NNumber seqNo5,NString dowpCode5,NString longInd6,NString shortInd6,NNumber seqNo6,NString dowpCode6,NString longInd7,NString shortInd7,NNumber seqNo7,NString dowpCode7,NString longInd8,NString shortInd8,NNumber seqNo8,NString dowpCode8,NString longInd9,NString shortInd9,NNumber seqNo9,NString dowpCode9,NString longInd10,NString shortInd10,NNumber seqNo10,NString dowpCode10,NString longInd11,NString shortInd11,NNumber seqNo11,NString dowpCode11,NString longInd12,NString shortInd12,NNumber seqNo12,NString dowpCode12,NString longInd13,NString shortInd13,NNumber seqNo13,NString dowpCode13,NString longInd14,NString shortInd14,NNumber seqNo14,NString dowpCode14,NString longInd15,NString shortInd15,NNumber seqNo15,NString dowpCode15,NString longInd16,NString shortInd16,NNumber seqNo16,NString dowpCode16,NString longInd17,NString shortInd17,NNumber seqNo17,NString dowpCode17,NString longInd18,NString shortInd18,NNumber seqNo18,NString dowpCode18,NString longInd19,NString shortInd19,NNumber seqNo19,NString dowpCode19,NString longInd20,NString shortInd20,NNumber seqNo20,NString dowpCode20,NString longInd21,NString shortInd21,NNumber seqNo21,NString dowpCode21,NString longInd22,NString shortInd22,NNumber seqNo22,NString dowpCode22,NString longInd23,NString shortInd23,NNumber seqNo23,NString dowpCode23,NString longInd24,NString shortInd24,NNumber seqNo24,NString dowpCode24,NString longInd25,NString shortInd25,NNumber seqNo25,NString dowpCode25,NString longInd26,NString shortInd26,NNumber seqNo26,NString dowpCode26,NString longInd27,NString shortInd27,NNumber seqNo27,NString dowpCode27) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_UPDATE_CONS_PREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LONG_IND1", longInd1);
			cmd.addParameter("@SHORT_IND1", shortInd1);
			cmd.addParameter("@SEQ_NO1", seqNo1);
			cmd.addParameter("@DOWP_CODE1", dowpCode1);
			cmd.addParameter("@LONG_IND2", longInd2);
			cmd.addParameter("@SHORT_IND2", shortInd2);
			cmd.addParameter("@SEQ_NO2", seqNo2);
			cmd.addParameter("@DOWP_CODE2", dowpCode2);
			cmd.addParameter("@LONG_IND3", longInd3);
			cmd.addParameter("@SHORT_IND3", shortInd3);
			cmd.addParameter("@SEQ_NO3", seqNo3);
			cmd.addParameter("@DOWP_CODE3", dowpCode3);
			cmd.addParameter("@LONG_IND4", longInd4);
			cmd.addParameter("@SHORT_IND4", shortInd4);
			cmd.addParameter("@SEQ_NO4", seqNo4);
			cmd.addParameter("@DOWP_CODE4", dowpCode4);
			cmd.addParameter("@LONG_IND5", longInd5);
			cmd.addParameter("@SHORT_IND5", shortInd5);
			cmd.addParameter("@SEQ_NO5", seqNo5);
			cmd.addParameter("@DOWP_CODE5", dowpCode5);
			cmd.addParameter("@LONG_IND6", longInd6);
			cmd.addParameter("@SHORT_IND6", shortInd6);
			cmd.addParameter("@SEQ_NO6", seqNo6);
			cmd.addParameter("@DOWP_CODE6", dowpCode6);
			cmd.addParameter("@LONG_IND7", longInd7);
			cmd.addParameter("@SHORT_IND7", shortInd7);
			cmd.addParameter("@SEQ_NO7", seqNo7);
			cmd.addParameter("@DOWP_CODE7", dowpCode7);
			cmd.addParameter("@LONG_IND8", longInd8);
			cmd.addParameter("@SHORT_IND8", shortInd8);
			cmd.addParameter("@SEQ_NO8", seqNo8);
			cmd.addParameter("@DOWP_CODE8", dowpCode8);
			cmd.addParameter("@LONG_IND9", longInd9);
			cmd.addParameter("@SHORT_IND9", shortInd9);
			cmd.addParameter("@SEQ_NO9", seqNo9);
			cmd.addParameter("@DOWP_CODE9", dowpCode9);
			cmd.addParameter("@LONG_IND10", longInd10);
			cmd.addParameter("@SHORT_IND10", shortInd10);
			cmd.addParameter("@SEQ_NO10", seqNo10);
			cmd.addParameter("@DOWP_CODE10", dowpCode10);
			cmd.addParameter("@LONG_IND11", longInd11);
			cmd.addParameter("@SHORT_IND11", shortInd11);
			cmd.addParameter("@SEQ_NO11", seqNo11);
			cmd.addParameter("@DOWP_CODE11", dowpCode11);
			cmd.addParameter("@LONG_IND12", longInd12);
			cmd.addParameter("@SHORT_IND12", shortInd12);
			cmd.addParameter("@SEQ_NO12", seqNo12);
			cmd.addParameter("@DOWP_CODE12", dowpCode12);
			cmd.addParameter("@LONG_IND13", longInd13);
			cmd.addParameter("@SHORT_IND13", shortInd13);
			cmd.addParameter("@SEQ_NO13", seqNo13);
			cmd.addParameter("@DOWP_CODE13", dowpCode13);
			cmd.addParameter("@LONG_IND14", longInd14);
			cmd.addParameter("@SHORT_IND14", shortInd14);
			cmd.addParameter("@SEQ_NO14", seqNo14);
			cmd.addParameter("@DOWP_CODE14", dowpCode14);
			cmd.addParameter("@LONG_IND15", longInd15);
			cmd.addParameter("@SHORT_IND15", shortInd15);
			cmd.addParameter("@SEQ_NO15", seqNo15);
			cmd.addParameter("@DOWP_CODE15", dowpCode15);
			cmd.addParameter("@LONG_IND16", longInd16);
			cmd.addParameter("@SHORT_IND16", shortInd16);
			cmd.addParameter("@SEQ_NO16", seqNo16);
			cmd.addParameter("@DOWP_CODE16", dowpCode16);
			cmd.addParameter("@LONG_IND17", longInd17);
			cmd.addParameter("@SHORT_IND17", shortInd17);
			cmd.addParameter("@SEQ_NO17", seqNo17);
			cmd.addParameter("@DOWP_CODE17", dowpCode17);
			cmd.addParameter("@LONG_IND18", longInd18);
			cmd.addParameter("@SHORT_IND18", shortInd18);
			cmd.addParameter("@SEQ_NO18", seqNo18);
			cmd.addParameter("@DOWP_CODE18", dowpCode18);
			cmd.addParameter("@LONG_IND19", longInd19);
			cmd.addParameter("@SHORT_IND19", shortInd19);
			cmd.addParameter("@SEQ_NO19", seqNo19);
			cmd.addParameter("@DOWP_CODE19", dowpCode19);
			cmd.addParameter("@LONG_IND20", longInd20);
			cmd.addParameter("@SHORT_IND20", shortInd20);
			cmd.addParameter("@SEQ_NO20", seqNo20);
			cmd.addParameter("@DOWP_CODE20", dowpCode20);
			cmd.addParameter("@LONG_IND21", longInd21);
			cmd.addParameter("@SHORT_IND21", shortInd21);
			cmd.addParameter("@SEQ_NO21", seqNo21);
			cmd.addParameter("@DOWP_CODE21", dowpCode21);
			cmd.addParameter("@LONG_IND22", longInd22);
			cmd.addParameter("@SHORT_IND22", shortInd22);
			cmd.addParameter("@SEQ_NO22", seqNo22);
			cmd.addParameter("@DOWP_CODE22", dowpCode22);
			cmd.addParameter("@LONG_IND23", longInd23);
			cmd.addParameter("@SHORT_IND23", shortInd23);
			cmd.addParameter("@SEQ_NO23", seqNo23);
			cmd.addParameter("@DOWP_CODE23", dowpCode23);
			cmd.addParameter("@LONG_IND24", longInd24);
			cmd.addParameter("@SHORT_IND24", shortInd24);
			cmd.addParameter("@SEQ_NO24", seqNo24);
			cmd.addParameter("@DOWP_CODE24", dowpCode24);
			cmd.addParameter("@LONG_IND25", longInd25);
			cmd.addParameter("@SHORT_IND25", shortInd25);
			cmd.addParameter("@SEQ_NO25", seqNo25);
			cmd.addParameter("@DOWP_CODE25", dowpCode25);
			cmd.addParameter("@LONG_IND26", longInd26);
			cmd.addParameter("@SHORT_IND26", shortInd26);
			cmd.addParameter("@SEQ_NO26", seqNo26);
			cmd.addParameter("@DOWP_CODE26", dowpCode26);
			cmd.addParameter("@LONG_IND27", longInd27);
			cmd.addParameter("@SHORT_IND27", shortInd27);
			cmd.addParameter("@SEQ_NO27", seqNo27);
			cmd.addParameter("@DOWP_CODE27", dowpCode27);
				
			cmd.execute();


		}
		
		public static void pUpdateGnrlPref(NString addrPref,NString emplPref,NNumber contMnth,NString givHistPref,NString headerPref,NString idLinkPref,NString altNamePref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_UPDATE_GNRL_PREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDR_PREF", addrPref);
			cmd.addParameter("@EMPL_PREF", emplPref);
			cmd.addParameter("@CONT_MNTH", contMnth);
			cmd.addParameter("@GIV_HIST_PREF", givHistPref);
			cmd.addParameter("@HEADER_PREF", headerPref);
			cmd.addParameter("@ID_LINK_PREF", idLinkPref);
			cmd.addParameter("@ALT_NAME_PREF", altNamePref);
				
			cmd.execute();


		}
		
		public static void pUpdateMyprosPref(NNumber seqNo1,NString doppCode1,NString dispInd1,NNumber seqNo2,NString doppCode2,NString dispInd2,NNumber seqNo3,NString doppCode3,NString dispInd3,NNumber seqNo4,NString doppCode4,NString dispInd4,NNumber seqNo5,NString doppCode5,NString dispInd5,NNumber seqNo6,NString doppCode6,NString dispInd6,NNumber seqNo7,NString doppCode7,NString dispInd7,NNumber seqNo8,NString doppCode8,NString dispInd8,NNumber seqNo9,NString doppCode9,NString dispInd9,NNumber seqNo10,NString doppCode10,NString dispInd10,NNumber seqNo11,NString doppCode11,NString dispInd11,NNumber seqNo12,NString doppCode12,NString dispInd12,NNumber seqNo13,NString doppCode13,NString dispInd13,NNumber seqNo14,NString doppCode14,NString dispInd14) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_UPDATE_MYPROS_PREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQ_NO1", seqNo1);
			cmd.addParameter("@DOPP_CODE1", doppCode1);
			cmd.addParameter("@DISP_IND1", dispInd1);
			cmd.addParameter("@SEQ_NO2", seqNo2);
			cmd.addParameter("@DOPP_CODE2", doppCode2);
			cmd.addParameter("@DISP_IND2", dispInd2);
			cmd.addParameter("@SEQ_NO3", seqNo3);
			cmd.addParameter("@DOPP_CODE3", doppCode3);
			cmd.addParameter("@DISP_IND3", dispInd3);
			cmd.addParameter("@SEQ_NO4", seqNo4);
			cmd.addParameter("@DOPP_CODE4", doppCode4);
			cmd.addParameter("@DISP_IND4", dispInd4);
			cmd.addParameter("@SEQ_NO5", seqNo5);
			cmd.addParameter("@DOPP_CODE5", doppCode5);
			cmd.addParameter("@DISP_IND5", dispInd5);
			cmd.addParameter("@SEQ_NO6", seqNo6);
			cmd.addParameter("@DOPP_CODE6", doppCode6);
			cmd.addParameter("@DISP_IND6", dispInd6);
			cmd.addParameter("@SEQ_NO7", seqNo7);
			cmd.addParameter("@DOPP_CODE7", doppCode7);
			cmd.addParameter("@DISP_IND7", dispInd7);
			cmd.addParameter("@SEQ_NO8", seqNo8);
			cmd.addParameter("@DOPP_CODE8", doppCode8);
			cmd.addParameter("@DISP_IND8", dispInd8);
			cmd.addParameter("@SEQ_NO9", seqNo9);
			cmd.addParameter("@DOPP_CODE9", doppCode9);
			cmd.addParameter("@DISP_IND9", dispInd9);
			cmd.addParameter("@SEQ_NO10", seqNo10);
			cmd.addParameter("@DOPP_CODE10", doppCode10);
			cmd.addParameter("@DISP_IND10", dispInd10);
			cmd.addParameter("@SEQ_NO11", seqNo11);
			cmd.addParameter("@DOPP_CODE11", doppCode11);
			cmd.addParameter("@DISP_IND11", dispInd11);
			cmd.addParameter("@SEQ_NO12", seqNo12);
			cmd.addParameter("@DOPP_CODE12", doppCode12);
			cmd.addParameter("@DISP_IND12", dispInd12);
			cmd.addParameter("@SEQ_NO13", seqNo13);
			cmd.addParameter("@DOPP_CODE13", doppCode13);
			cmd.addParameter("@DISP_IND13", dispInd13);
			cmd.addParameter("@SEQ_NO14", seqNo14);
			cmd.addParameter("@DOPP_CODE14", doppCode14);
			cmd.addParameter("@DISP_IND14", dispInd14);
				
			cmd.execute();


		}
		
		public static void pUpdateOrgPref(NString longInd1,NString shortInd1,NNumber seqNo1,NString dowpCode1,NString longInd2,NString shortInd2,NNumber seqNo2,NString dowpCode2,NString longInd3,NString shortInd3,NNumber seqNo3,NString dowpCode3,NString longInd4,NString shortInd4,NNumber seqNo4,NString dowpCode4,NString longInd5,NString shortInd5,NNumber seqNo5,NString dowpCode5,NString longInd6,NString shortInd6,NNumber seqNo6,NString dowpCode6,NString longInd7,NString shortInd7,NNumber seqNo7,NString dowpCode7,NString longInd8,NString shortInd8,NNumber seqNo8,NString dowpCode8,NString longInd9,NString shortInd9,NNumber seqNo9,NString dowpCode9,NString longInd10,NString shortInd10,NNumber seqNo10,NString dowpCode10,NString longInd11,NString shortInd11,NNumber seqNo11,NString dowpCode11,NString longInd12,NString shortInd12,NNumber seqNo12,NString dowpCode12,NString longInd13,NString shortInd13,NNumber seqNo13,NString dowpCode13,NString longInd14,NString shortInd14,NNumber seqNo14,NString dowpCode14,NString longInd15,NString shortInd15,NNumber seqNo15,NString dowpCode15,NString longInd16,NString shortInd16,NNumber seqNo16,NString dowpCode16,NString longInd17,NString shortInd17,NNumber seqNo17,NString dowpCode17,NString longInd18,NString shortInd18,NNumber seqNo18,NString dowpCode18,NString longInd19,NString shortInd19,NNumber seqNo19,NString dowpCode19,NString longInd20,NString shortInd20,NNumber seqNo20,NString dowpCode20,NString longInd21,NString shortInd21,NNumber seqNo21,NString dowpCode21,NString longInd22,NString shortInd22,NNumber seqNo22,NString dowpCode22,NString longInd23,NString shortInd23,NNumber seqNo23,NString dowpCode23,NString longInd24,NString shortInd24,NNumber seqNo24,NString dowpCode24,NString longInd25,NString shortInd25,NNumber seqNo25,NString dowpCode25) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_UPDATE_ORG_PREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LONG_IND1", longInd1);
			cmd.addParameter("@SHORT_IND1", shortInd1);
			cmd.addParameter("@SEQ_NO1", seqNo1);
			cmd.addParameter("@DOWP_CODE1", dowpCode1);
			cmd.addParameter("@LONG_IND2", longInd2);
			cmd.addParameter("@SHORT_IND2", shortInd2);
			cmd.addParameter("@SEQ_NO2", seqNo2);
			cmd.addParameter("@DOWP_CODE2", dowpCode2);
			cmd.addParameter("@LONG_IND3", longInd3);
			cmd.addParameter("@SHORT_IND3", shortInd3);
			cmd.addParameter("@SEQ_NO3", seqNo3);
			cmd.addParameter("@DOWP_CODE3", dowpCode3);
			cmd.addParameter("@LONG_IND4", longInd4);
			cmd.addParameter("@SHORT_IND4", shortInd4);
			cmd.addParameter("@SEQ_NO4", seqNo4);
			cmd.addParameter("@DOWP_CODE4", dowpCode4);
			cmd.addParameter("@LONG_IND5", longInd5);
			cmd.addParameter("@SHORT_IND5", shortInd5);
			cmd.addParameter("@SEQ_NO5", seqNo5);
			cmd.addParameter("@DOWP_CODE5", dowpCode5);
			cmd.addParameter("@LONG_IND6", longInd6);
			cmd.addParameter("@SHORT_IND6", shortInd6);
			cmd.addParameter("@SEQ_NO6", seqNo6);
			cmd.addParameter("@DOWP_CODE6", dowpCode6);
			cmd.addParameter("@LONG_IND7", longInd7);
			cmd.addParameter("@SHORT_IND7", shortInd7);
			cmd.addParameter("@SEQ_NO7", seqNo7);
			cmd.addParameter("@DOWP_CODE7", dowpCode7);
			cmd.addParameter("@LONG_IND8", longInd8);
			cmd.addParameter("@SHORT_IND8", shortInd8);
			cmd.addParameter("@SEQ_NO8", seqNo8);
			cmd.addParameter("@DOWP_CODE8", dowpCode8);
			cmd.addParameter("@LONG_IND9", longInd9);
			cmd.addParameter("@SHORT_IND9", shortInd9);
			cmd.addParameter("@SEQ_NO9", seqNo9);
			cmd.addParameter("@DOWP_CODE9", dowpCode9);
			cmd.addParameter("@LONG_IND10", longInd10);
			cmd.addParameter("@SHORT_IND10", shortInd10);
			cmd.addParameter("@SEQ_NO10", seqNo10);
			cmd.addParameter("@DOWP_CODE10", dowpCode10);
			cmd.addParameter("@LONG_IND11", longInd11);
			cmd.addParameter("@SHORT_IND11", shortInd11);
			cmd.addParameter("@SEQ_NO11", seqNo11);
			cmd.addParameter("@DOWP_CODE11", dowpCode11);
			cmd.addParameter("@LONG_IND12", longInd12);
			cmd.addParameter("@SHORT_IND12", shortInd12);
			cmd.addParameter("@SEQ_NO12", seqNo12);
			cmd.addParameter("@DOWP_CODE12", dowpCode12);
			cmd.addParameter("@LONG_IND13", longInd13);
			cmd.addParameter("@SHORT_IND13", shortInd13);
			cmd.addParameter("@SEQ_NO13", seqNo13);
			cmd.addParameter("@DOWP_CODE13", dowpCode13);
			cmd.addParameter("@LONG_IND14", longInd14);
			cmd.addParameter("@SHORT_IND14", shortInd14);
			cmd.addParameter("@SEQ_NO14", seqNo14);
			cmd.addParameter("@DOWP_CODE14", dowpCode14);
			cmd.addParameter("@LONG_IND15", longInd15);
			cmd.addParameter("@SHORT_IND15", shortInd15);
			cmd.addParameter("@SEQ_NO15", seqNo15);
			cmd.addParameter("@DOWP_CODE15", dowpCode15);
			cmd.addParameter("@LONG_IND16", longInd16);
			cmd.addParameter("@SHORT_IND16", shortInd16);
			cmd.addParameter("@SEQ_NO16", seqNo16);
			cmd.addParameter("@DOWP_CODE16", dowpCode16);
			cmd.addParameter("@LONG_IND17", longInd17);
			cmd.addParameter("@SHORT_IND17", shortInd17);
			cmd.addParameter("@SEQ_NO17", seqNo17);
			cmd.addParameter("@DOWP_CODE17", dowpCode17);
			cmd.addParameter("@LONG_IND18", longInd18);
			cmd.addParameter("@SHORT_IND18", shortInd18);
			cmd.addParameter("@SEQ_NO18", seqNo18);
			cmd.addParameter("@DOWP_CODE18", dowpCode18);
			cmd.addParameter("@LONG_IND19", longInd19);
			cmd.addParameter("@SHORT_IND19", shortInd19);
			cmd.addParameter("@SEQ_NO19", seqNo19);
			cmd.addParameter("@DOWP_CODE19", dowpCode19);
			cmd.addParameter("@LONG_IND20", longInd20);
			cmd.addParameter("@SHORT_IND20", shortInd20);
			cmd.addParameter("@SEQ_NO20", seqNo20);
			cmd.addParameter("@DOWP_CODE20", dowpCode20);
			cmd.addParameter("@LONG_IND21", longInd21);
			cmd.addParameter("@SHORT_IND21", shortInd21);
			cmd.addParameter("@SEQ_NO21", seqNo21);
			cmd.addParameter("@DOWP_CODE21", dowpCode21);
			cmd.addParameter("@LONG_IND22", longInd22);
			cmd.addParameter("@SHORT_IND22", shortInd22);
			cmd.addParameter("@SEQ_NO22", seqNo22);
			cmd.addParameter("@DOWP_CODE22", dowpCode22);
			cmd.addParameter("@LONG_IND23", longInd23);
			cmd.addParameter("@SHORT_IND23", shortInd23);
			cmd.addParameter("@SEQ_NO23", seqNo23);
			cmd.addParameter("@DOWP_CODE23", dowpCode23);
			cmd.addParameter("@LONG_IND24", longInd24);
			cmd.addParameter("@SHORT_IND24", shortInd24);
			cmd.addParameter("@SEQ_NO24", seqNo24);
			cmd.addParameter("@DOWP_CODE24", dowpCode24);
			cmd.addParameter("@LONG_IND25", longInd25);
			cmd.addParameter("@SHORT_IND25", shortInd25);
			cmd.addParameter("@SEQ_NO25", seqNo25);
			cmd.addParameter("@DOWP_CODE25", dowpCode25);
				
			cmd.execute();


		}
		
		public static void pUpdateProsPref(NString longInd1,NString shortInd1,NNumber seqNo1,NString dowpCode1,NString longInd2,NString shortInd2,NNumber seqNo2,NString dowpCode2,NString longInd3,NString shortInd3,NNumber seqNo3,NString dowpCode3,NString longInd4,NString shortInd4,NNumber seqNo4,NString dowpCode4,NString longInd5,NString shortInd5,NNumber seqNo5,NString dowpCode5,NString longInd6,NString shortInd6,NNumber seqNo6,NString dowpCode6,NString longInd7,NString shortInd7,NNumber seqNo7,NString dowpCode7,NString longInd8,NString shortInd8,NNumber seqNo8,NString dowpCode8,NString longInd9,NString shortInd9,NNumber seqNo9,NString dowpCode9,NString longInd10,NString shortInd10,NNumber seqNo10,NString dowpCode10,NString longInd11,NString shortInd11,NNumber seqNo11,NString dowpCode11,NString longInd12,NString shortInd12,NNumber seqNo12,NString dowpCode12,NString longInd13,NString shortInd13,NNumber seqNo13,NString dowpCode13,NString longInd14,NString shortInd14,NNumber seqNo14,NString dowpCode14,NString longInd15,NString shortInd15,NNumber seqNo15,NString dowpCode15,NString longInd16,NString shortInd16,NNumber seqNo16,NString dowpCode16,NString longInd17,NString shortInd17,NNumber seqNo17,NString dowpCode17,NString longInd18,NString shortInd18,NNumber seqNo18,NString dowpCode18,NString longInd19,NString shortInd19,NNumber seqNo19,NString dowpCode19,NString longInd20,NString shortInd20,NNumber seqNo20,NString dowpCode20,NString longInd21,NString shortInd21,NNumber seqNo21,NString dowpCode21) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPREF.P_UPDATE_PROS_PREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LONG_IND1", longInd1);
			cmd.addParameter("@SHORT_IND1", shortInd1);
			cmd.addParameter("@SEQ_NO1", seqNo1);
			cmd.addParameter("@DOWP_CODE1", dowpCode1);
			cmd.addParameter("@LONG_IND2", longInd2);
			cmd.addParameter("@SHORT_IND2", shortInd2);
			cmd.addParameter("@SEQ_NO2", seqNo2);
			cmd.addParameter("@DOWP_CODE2", dowpCode2);
			cmd.addParameter("@LONG_IND3", longInd3);
			cmd.addParameter("@SHORT_IND3", shortInd3);
			cmd.addParameter("@SEQ_NO3", seqNo3);
			cmd.addParameter("@DOWP_CODE3", dowpCode3);
			cmd.addParameter("@LONG_IND4", longInd4);
			cmd.addParameter("@SHORT_IND4", shortInd4);
			cmd.addParameter("@SEQ_NO4", seqNo4);
			cmd.addParameter("@DOWP_CODE4", dowpCode4);
			cmd.addParameter("@LONG_IND5", longInd5);
			cmd.addParameter("@SHORT_IND5", shortInd5);
			cmd.addParameter("@SEQ_NO5", seqNo5);
			cmd.addParameter("@DOWP_CODE5", dowpCode5);
			cmd.addParameter("@LONG_IND6", longInd6);
			cmd.addParameter("@SHORT_IND6", shortInd6);
			cmd.addParameter("@SEQ_NO6", seqNo6);
			cmd.addParameter("@DOWP_CODE6", dowpCode6);
			cmd.addParameter("@LONG_IND7", longInd7);
			cmd.addParameter("@SHORT_IND7", shortInd7);
			cmd.addParameter("@SEQ_NO7", seqNo7);
			cmd.addParameter("@DOWP_CODE7", dowpCode7);
			cmd.addParameter("@LONG_IND8", longInd8);
			cmd.addParameter("@SHORT_IND8", shortInd8);
			cmd.addParameter("@SEQ_NO8", seqNo8);
			cmd.addParameter("@DOWP_CODE8", dowpCode8);
			cmd.addParameter("@LONG_IND9", longInd9);
			cmd.addParameter("@SHORT_IND9", shortInd9);
			cmd.addParameter("@SEQ_NO9", seqNo9);
			cmd.addParameter("@DOWP_CODE9", dowpCode9);
			cmd.addParameter("@LONG_IND10", longInd10);
			cmd.addParameter("@SHORT_IND10", shortInd10);
			cmd.addParameter("@SEQ_NO10", seqNo10);
			cmd.addParameter("@DOWP_CODE10", dowpCode10);
			cmd.addParameter("@LONG_IND11", longInd11);
			cmd.addParameter("@SHORT_IND11", shortInd11);
			cmd.addParameter("@SEQ_NO11", seqNo11);
			cmd.addParameter("@DOWP_CODE11", dowpCode11);
			cmd.addParameter("@LONG_IND12", longInd12);
			cmd.addParameter("@SHORT_IND12", shortInd12);
			cmd.addParameter("@SEQ_NO12", seqNo12);
			cmd.addParameter("@DOWP_CODE12", dowpCode12);
			cmd.addParameter("@LONG_IND13", longInd13);
			cmd.addParameter("@SHORT_IND13", shortInd13);
			cmd.addParameter("@SEQ_NO13", seqNo13);
			cmd.addParameter("@DOWP_CODE13", dowpCode13);
			cmd.addParameter("@LONG_IND14", longInd14);
			cmd.addParameter("@SHORT_IND14", shortInd14);
			cmd.addParameter("@SEQ_NO14", seqNo14);
			cmd.addParameter("@DOWP_CODE14", dowpCode14);
			cmd.addParameter("@LONG_IND15", longInd15);
			cmd.addParameter("@SHORT_IND15", shortInd15);
			cmd.addParameter("@SEQ_NO15", seqNo15);
			cmd.addParameter("@DOWP_CODE15", dowpCode15);
			cmd.addParameter("@LONG_IND16", longInd16);
			cmd.addParameter("@SHORT_IND16", shortInd16);
			cmd.addParameter("@SEQ_NO16", seqNo16);
			cmd.addParameter("@DOWP_CODE16", dowpCode16);
			cmd.addParameter("@LONG_IND17", longInd17);
			cmd.addParameter("@SHORT_IND17", shortInd17);
			cmd.addParameter("@SEQ_NO17", seqNo17);
			cmd.addParameter("@DOWP_CODE17", dowpCode17);
			cmd.addParameter("@LONG_IND18", longInd18);
			cmd.addParameter("@SHORT_IND18", shortInd18);
			cmd.addParameter("@SEQ_NO18", seqNo18);
			cmd.addParameter("@DOWP_CODE18", dowpCode18);
			cmd.addParameter("@LONG_IND19", longInd19);
			cmd.addParameter("@SHORT_IND19", shortInd19);
			cmd.addParameter("@SEQ_NO19", seqNo19);
			cmd.addParameter("@DOWP_CODE19", dowpCode19);
			cmd.addParameter("@LONG_IND20", longInd20);
			cmd.addParameter("@SHORT_IND20", shortInd20);
			cmd.addParameter("@SEQ_NO20", seqNo20);
			cmd.addParameter("@DOWP_CODE20", dowpCode20);
			cmd.addParameter("@LONG_IND21", longInd21);
			cmd.addParameter("@SHORT_IND21", shortInd21);
			cmd.addParameter("@SEQ_NO21", seqNo21);
			cmd.addParameter("@DOWP_CODE21", dowpCode21);
				
			cmd.execute();


		}
		
	
	
	
}
