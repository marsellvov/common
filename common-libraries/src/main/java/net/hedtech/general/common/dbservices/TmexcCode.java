package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmexcCode {
		public static NNumber Ferf(NNumber x) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.ERF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@X", x);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Ferrorpercent(NString pModt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.ERRORPERCENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_MODT", pModt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgaussintersect(NNumber ml,NNumber sl,NNumber mr,NNumber sr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.GAUSSINTERSECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ML", ml);
			cmd.addParameter("@SL", sl);
			cmd.addParameter("@MR", mr);
			cmd.addParameter("@SR", sr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fiscode(NString pModt,NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.ISCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_MODT", pModt);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fiscodeexplain(NString pModt,NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.ISCODEEXPLAIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_MODT", pModt);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void learn(NString pModt,NString pStr,NBool pExcl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.LEARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODT", pModt);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_EXCL", pExcl);
				
			cmd.execute();


		}
		
		public static void learnfromproject(NString pProject,NString pLang,NString pModtype,NString pModule,NNumber pNstrings) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.LEARNFROMPROJECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_MODTYPE", pModtype);
			cmd.addParameter("@P_MODULE", pModule);
			cmd.addParameter("@P_NSTRINGS", pNstrings);
				
			cmd.execute();


		}
		
		public static NBool Freplacehtmltag(Ref<NString> pString,NString pBy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.REPLACEHTMLTAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_STRING", pString, true);
			cmd.addParameter("@P_BY", pBy);
				
			cmd.execute();
			pString.val = cmd.getParameterValue("@P_STRING", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber Fthreshold(NString pModt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TMEXC_CODE.THRESHOLD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_MODT", pModt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
