package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SctPtest {
		public static void pBuildcall(NString plsown,NString plstyp,NString plsnme,NString plssnm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCT_PTEST.P_BUILDCALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLSOWN", plsown);
			cmd.addParameter("@PLSTYP", plstyp);
			cmd.addParameter("@PLSNME", plsnme);
			cmd.addParameter("@PLSSNM", plssnm);
				
			cmd.execute();


		}
		
		public static void pCallit(NString plsown,NString plstyp,NString plsnme,NString plssnm,NString plsend,NString prmlo,NString prm1,NString prm2,NString prm3,NString prm4,NString prm5,NString prm6,NString prm7,NString prm8,NString prm9,NString prm10,NString prm11,NString prm12,NString prm13,NString prm14,NString prm15,NString prm16,NString prm17,NString prm18,NString prm19,NString prm20,NString prm21,NString prm22,NString prm23,NString prm24,NString prm25,NString prm26,NString prm27,NString prm28,NString prm29,NString prm30,NString prm31,NString prm32,NString prm33,NString prm34,NString prm35,NString prm36,NString prm37,NString prm38,NString prm39,NString prm40,NString prm41,NString prm42,NString prm43,NString prm44,NString prm45,NString prm46,NString prm47,NString prm48,NString prm49,NString prm50,NString prm51,NString prm52,NString prm53,NString prm54,NString prm55,NString prm56,NString prm57,NString prm58,NString prm59,NString prm60,NString prm61,NString prm62,NString prm63,NString prm64,NString prm65,NString prm66,NString prm67,NString prm68,NString prm69,NString prm70,NString prm71,NString prm72,NString prm73,NString prm74,NString prm75,NString prm76,NString prm77,NString prm78,NString prm79,NString prm80,NString prm81,NString prm82,NString prm83,NString prm84,NString prm85,NString prm86,NString prm87,NString prm88,NString prm89,NString prm90,NString prm91,NString prm92,NString prm93,NString prm94,NString prm95,NString prm96,NString prm97,NString prm98,NString prm99,NString prm100,NString prmhi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCT_PTEST.P_CALLIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLSOWN", plsown);
			cmd.addParameter("@PLSTYP", plstyp);
			cmd.addParameter("@PLSNME", plsnme);
			cmd.addParameter("@PLSSNM", plssnm);
			cmd.addParameter("@PLSEND", plsend);
			cmd.addParameter("@PRMLO", prmlo);
			cmd.addParameter("@PRM1", prm1);
			cmd.addParameter("@PRM2", prm2);
			cmd.addParameter("@PRM3", prm3);
			cmd.addParameter("@PRM4", prm4);
			cmd.addParameter("@PRM5", prm5);
			cmd.addParameter("@PRM6", prm6);
			cmd.addParameter("@PRM7", prm7);
			cmd.addParameter("@PRM8", prm8);
			cmd.addParameter("@PRM9", prm9);
			cmd.addParameter("@PRM10", prm10);
			cmd.addParameter("@PRM11", prm11);
			cmd.addParameter("@PRM12", prm12);
			cmd.addParameter("@PRM13", prm13);
			cmd.addParameter("@PRM14", prm14);
			cmd.addParameter("@PRM15", prm15);
			cmd.addParameter("@PRM16", prm16);
			cmd.addParameter("@PRM17", prm17);
			cmd.addParameter("@PRM18", prm18);
			cmd.addParameter("@PRM19", prm19);
			cmd.addParameter("@PRM20", prm20);
			cmd.addParameter("@PRM21", prm21);
			cmd.addParameter("@PRM22", prm22);
			cmd.addParameter("@PRM23", prm23);
			cmd.addParameter("@PRM24", prm24);
			cmd.addParameter("@PRM25", prm25);
			cmd.addParameter("@PRM26", prm26);
			cmd.addParameter("@PRM27", prm27);
			cmd.addParameter("@PRM28", prm28);
			cmd.addParameter("@PRM29", prm29);
			cmd.addParameter("@PRM30", prm30);
			cmd.addParameter("@PRM31", prm31);
			cmd.addParameter("@PRM32", prm32);
			cmd.addParameter("@PRM33", prm33);
			cmd.addParameter("@PRM34", prm34);
			cmd.addParameter("@PRM35", prm35);
			cmd.addParameter("@PRM36", prm36);
			cmd.addParameter("@PRM37", prm37);
			cmd.addParameter("@PRM38", prm38);
			cmd.addParameter("@PRM39", prm39);
			cmd.addParameter("@PRM40", prm40);
			cmd.addParameter("@PRM41", prm41);
			cmd.addParameter("@PRM42", prm42);
			cmd.addParameter("@PRM43", prm43);
			cmd.addParameter("@PRM44", prm44);
			cmd.addParameter("@PRM45", prm45);
			cmd.addParameter("@PRM46", prm46);
			cmd.addParameter("@PRM47", prm47);
			cmd.addParameter("@PRM48", prm48);
			cmd.addParameter("@PRM49", prm49);
			cmd.addParameter("@PRM50", prm50);
			cmd.addParameter("@PRM51", prm51);
			cmd.addParameter("@PRM52", prm52);
			cmd.addParameter("@PRM53", prm53);
			cmd.addParameter("@PRM54", prm54);
			cmd.addParameter("@PRM55", prm55);
			cmd.addParameter("@PRM56", prm56);
			cmd.addParameter("@PRM57", prm57);
			cmd.addParameter("@PRM58", prm58);
			cmd.addParameter("@PRM59", prm59);
			cmd.addParameter("@PRM60", prm60);
			cmd.addParameter("@PRM61", prm61);
			cmd.addParameter("@PRM62", prm62);
			cmd.addParameter("@PRM63", prm63);
			cmd.addParameter("@PRM64", prm64);
			cmd.addParameter("@PRM65", prm65);
			cmd.addParameter("@PRM66", prm66);
			cmd.addParameter("@PRM67", prm67);
			cmd.addParameter("@PRM68", prm68);
			cmd.addParameter("@PRM69", prm69);
			cmd.addParameter("@PRM70", prm70);
			cmd.addParameter("@PRM71", prm71);
			cmd.addParameter("@PRM72", prm72);
			cmd.addParameter("@PRM73", prm73);
			cmd.addParameter("@PRM74", prm74);
			cmd.addParameter("@PRM75", prm75);
			cmd.addParameter("@PRM76", prm76);
			cmd.addParameter("@PRM77", prm77);
			cmd.addParameter("@PRM78", prm78);
			cmd.addParameter("@PRM79", prm79);
			cmd.addParameter("@PRM80", prm80);
			cmd.addParameter("@PRM81", prm81);
			cmd.addParameter("@PRM82", prm82);
			cmd.addParameter("@PRM83", prm83);
			cmd.addParameter("@PRM84", prm84);
			cmd.addParameter("@PRM85", prm85);
			cmd.addParameter("@PRM86", prm86);
			cmd.addParameter("@PRM87", prm87);
			cmd.addParameter("@PRM88", prm88);
			cmd.addParameter("@PRM89", prm89);
			cmd.addParameter("@PRM90", prm90);
			cmd.addParameter("@PRM91", prm91);
			cmd.addParameter("@PRM92", prm92);
			cmd.addParameter("@PRM93", prm93);
			cmd.addParameter("@PRM94", prm94);
			cmd.addParameter("@PRM95", prm95);
			cmd.addParameter("@PRM96", prm96);
			cmd.addParameter("@PRM97", prm97);
			cmd.addParameter("@PRM98", prm98);
			cmd.addParameter("@PRM99", prm99);
			cmd.addParameter("@PRM100", prm100);
			cmd.addParameter("@PRMHI", prmhi);
				
			cmd.execute();


		}
		
		public static void pMain() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCT_PTEST.P_MAIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPickname(NString plsown,NString plstyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCT_PTEST.P_PICKNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLSOWN", plsown);
			cmd.addParameter("@PLSTYP", plstyp);
				
			cmd.execute();


		}
		
		public static void pPicksub(NString plsown,NString plstyp,NString plsnme) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SCT_PTEST.P_PICKSUB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLSOWN", plsown);
			cmd.addParameter("@PLSTYP", plstyp);
			cmd.addParameter("@PLSNME", plsnme);
				
			cmd.execute();


		}
		
	
	
	
}
