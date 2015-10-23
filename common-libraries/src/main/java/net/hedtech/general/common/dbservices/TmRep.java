package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmRep {
		public static NBool FdbModuleExists(NString pmoduleName,NString powner,NString pmodtype,NDate ptime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.DB_MODULE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PMODTYPE", pmodtype);
			cmd.addParameter("@PTIME", ptime);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber Fdelmod(NString powner,NString pmodname,NString pmodtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.DELMOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PMODNAME", pmodname);
			cmd.addParameter("@PMODTYPE", pmodtype);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fnum2str(NNumber num,NNumber nb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.NUM2STR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NUM", num);
			cmd.addParameter("@NB", nb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void stripReport(NString pprojCode,NString plangSrc,NString plangTgt,NString pmoduleName,NString pmoduleOwner,NBool preverse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.STRIP_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROJ_CODE", pprojCode);
			cmd.addParameter("@PLANG_SRC", plangSrc);
			cmd.addParameter("@PLANG_TGT", plangTgt);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@PMODULE_OWNER", pmoduleOwner);
			cmd.addParameter("@PREVERSE", preverse);
				
			cmd.execute();


		}
		
		public static void stripReportOld(NString pprojCode,NString plangSrc,NString plangTgt,NString pmoduleName,NString pmoduleOwner,NBool preplaceFtg,NBool preverse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.STRIP_REPORT_OLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROJ_CODE", pprojCode);
			cmd.addParameter("@PLANG_SRC", plangSrc);
			cmd.addParameter("@PLANG_TGT", plangTgt);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@PMODULE_OWNER", pmoduleOwner);
			cmd.addParameter("@PREPLACE_FTG", preplaceFtg);
			cmd.addParameter("@PREVERSE", preverse);
				
			cmd.execute();


		}
		
		public static void translateReport(NString pprojCode,NString plangSrc,NString plangTgt,NString pmoduleName,NString pmoduleOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.TRANSLATE_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROJ_CODE", pprojCode);
			cmd.addParameter("@PLANG_SRC", plangSrc);
			cmd.addParameter("@PLANG_TGT", plangTgt);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@PMODULE_OWNER", pmoduleOwner);
				
			cmd.execute();


		}
		
		public static void translateReportOld(NString pprojCode,NString plangSrc,NString plangTgt,NString pmoduleName,NString pmoduleOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_REP.TRANSLATE_REPORT_OLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROJ_CODE", pprojCode);
			cmd.addParameter("@PLANG_SRC", plangSrc);
			cmd.addParameter("@PLANG_TGT", plangTgt);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@PMODULE_OWNER", pmoduleOwner);
				
			cmd.execute();


		}
		
	
	
	
}
