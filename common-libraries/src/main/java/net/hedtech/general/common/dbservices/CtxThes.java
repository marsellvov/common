package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxThes {
		public static void alterPhrase(NString tname,NString phrase,NString op,NString operand) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.ALTER_PHRASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@OP", op);
			cmd.addParameter("@OPERAND", operand);
				
			cmd.execute();


		}
		
		public static void alterThesaurus(NString tname,NString op,NString operand) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.ALTER_THESAURUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@OP", op);
			cmd.addParameter("@OPERAND", operand);
				
			cmd.execute();


		}
		
		public static NString Fbt(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void bt(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fbtg(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void btg(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTG", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fbti(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void bti(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTI", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fbtp(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void btp(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.BTP", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static void createPhrase(NString tname,NString phrase,NString rel,NString relname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.CREATE_PHRASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@REL", rel);
			cmd.addParameter("@RELNAME", relname);
				
			cmd.execute();


		}
		
		public static void createRelation(NString tname,NString phrase,NString rel,NString relphrase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.CREATE_RELATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@REL", rel);
			cmd.addParameter("@RELPHRASE", relphrase);
				
			cmd.execute();


		}
		
		public static void createThesaurus(NString _name,NBool casesens) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.CREATE_THESAURUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@CASESENS", casesens);
				
			cmd.execute();


		}
		
		public static void createTranslation(NString tname,NString phrase,NString language,NString translation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.CREATE_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@TRANSLATION", translation);
				
			cmd.execute();


		}
		
		public static void dropPhrase(NString tname,NString phrase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.DROP_PHRASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
				
			cmd.execute();


		}
		
		public static void dropRelation(NString tname,NString phrase,NString rel,NString relphrase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.DROP_RELATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@REL", rel);
			cmd.addParameter("@RELPHRASE", relphrase);
				
			cmd.execute();


		}
		
		public static void dropThesaurus(NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.DROP_THESAURUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();


		}
		
		public static void dropTranslation(NString tname,NString phrase,NString language,NString translation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.DROP_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@TRANSLATION", translation);
				
			cmd.execute();


		}
		
		public static NBool FhasRelation(NString phrase,NString rel,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.HAS_RELATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@REL", rel);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Fnt(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void nt(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fntg(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void ntg(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTG", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fnti(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void nti(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTI", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fntp(NString phrase,NNumber lvl,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LVL", lvl);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void ntp(Ref<List<ExpTabRow>> restab,NString phrase,NNumber lvl,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.NTP", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LVL", lvl);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static void outputStyle(NBool showlevel,NBool showqualify,NBool showpt,NBool showid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.OUTPUT_STYLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SHOWLEVEL", showlevel);
			cmd.addParameter("@SHOWQUALIFY", showqualify);
			cmd.addParameter("@SHOWPT", showpt);
			cmd.addParameter("@SHOWID", showid);
				
			cmd.execute();


		}
		
		public static NString Fpt(NString phrase,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.PT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pt(Ref<List<ExpTabRow>> restab,NString phrase,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.PT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Frt(NString phrase,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.RT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void rt(Ref<List<ExpTabRow>> restab,NString phrase,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.RT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Fsn(NString phrase,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.SN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fsyn(NString phrase,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.SYN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void syn(Ref<List<ExpTabRow>> restab,NString phrase,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.SYN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void thesTt(Ref<List<ExpTabRow>> restab,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.THES_TT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Ftr(NString phrase,NString lang,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LANG", lang);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void tr(Ref<List<ExpTabRow>> restab,NString phrase,NString lang,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TR", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LANG", lang);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Ftrsyn(NString phrase,NString lang,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TRSYN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LANG", lang);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void trsyn(Ref<List<ExpTabRow>> restab,NString phrase,NString lang,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TRSYN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@LANG", lang);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static NString Ftt(NString phrase,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void tt(Ref<List<ExpTabRow>> restab,NString phrase,NString tname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.TT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PHRASE", phrase);
//			cmd.addParameter("@TNAME", tname);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static void updateTranslation(NString tname,NString phrase,NString language,NString translation,NString newTranslation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_THES.UPDATE_TRANSLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TNAME", tname);
			cmd.addParameter("@PHRASE", phrase);
			cmd.addParameter("@LANGUAGE", language);
			cmd.addParameter("@TRANSLATION", translation);
			cmd.addParameter("@NEW_TRANSLATION", newTranslation);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ExpRecRow", dataSourceName="EXP_REC")
	public static class ExpRecRow
	{
		@DbRecordField(dataSourceName="XREL")
		public NString Xrel;
		@DbRecordField(dataSourceName="XLEVEL")
		public NNumber Xlevel;
		@DbRecordField(dataSourceName="XPHRASE")
		public NString Xphrase;
	}

	
	
}
