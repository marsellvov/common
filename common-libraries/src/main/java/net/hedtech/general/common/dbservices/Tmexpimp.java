package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tmexpimp {
		public static void finish() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXPIMP.FINISH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool Fgetnextrecord(Ref<NString> ptext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXPIMP.GETNEXTRECORD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PTEXT", ptext, true);
				
			cmd.execute();
			ptext.val = cmd.getParameterValue("@PTEXT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static void init(NBool pimport,NBool pcompresskeys,NBool poverwrite,NString pcharset,NString pproject,List<LangTransfTabTypeRow> plangs,NString pmodtypes,NString pmodnamepattern) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXPIMP.INIT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIMPORT", pimport);
//			cmd.addParameter("@PCOMPRESSKEYS", pcompresskeys);
//			cmd.addParameter("@POVERWRITE", poverwrite);
//			cmd.addParameter("@PCHARSET", pcharset);
//			cmd.addParameter("@PPROJECT", pproject);
//			// cmd.addParameter(DbTypes.getTableType("PLANGS", "", plangs, object.class));
//			cmd.addParameter("@PMODTYPES", pmodtypes);
//			cmd.addParameter("@PMODNAMEPATTERN", pmodnamepattern);
//				
//			cmd.execute();
//
//
//		}
		
		public static NNumber Fparseline(NString ptext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXPIMP.PARSELINE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PTEXT", ptext);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	@DbRecordType(id="LangTransfRecRow", dataSourceName="LANG_TRANSF_REC")
	public static class LangTransfRecRow
	{
		@DbRecordField(dataSourceName="FROMLANG")
		public NString Fromlang;
		@DbRecordField(dataSourceName="TOLANG")
		public NString Tolang;
		@DbRecordField(dataSourceName="MODSAVED")
		public NBool Modsaved;
	}

	
	
}
