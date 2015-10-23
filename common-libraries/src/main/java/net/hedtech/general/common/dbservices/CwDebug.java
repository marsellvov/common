package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwDebug {
		public static NInteger F_continue(NInteger iNbreakflags) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.CONTINUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_NBREAKFLAGS", iNbreakflags);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fdeletebreakpoint(NInteger iNbreakpointid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.DELETEBREAKPOINT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_NBREAKPOINTID", iNbreakpointid);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fenablebreakpoint(NInteger iNbreakpointid,NInteger iNenable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.ENABLEBREAKPOINT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_NBREAKPOINTID", iNbreakpointid);
			cmd.addParameter("@I_NENABLE", iNenable);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetnextsourceline(Ref<NString> oStrline) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETNEXTSOURCELINE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@O_STRLINE", NString.class);
				
			cmd.execute();
			oStrline.val = cmd.getParameterValue("@O_STRLINE", NString.class);

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetnextstackframe(Ref<NInteger> oNstackframe,Ref<NString> oStrtype,Ref<NString> oStrowner,Ref<NString> oStrname,Ref<NString> oStrdblink,Ref<NInteger> oNline,Ref<NString> oStrentrypoint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETNEXTSTACKFRAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@O_NSTACKFRAME", NInteger.class);
			cmd.addParameter("@O_STRTYPE", NString.class);
			cmd.addParameter("@O_STROWNER", NString.class);
			cmd.addParameter("@O_STRNAME", NString.class);
			cmd.addParameter("@O_STRDBLINK", NString.class);
			cmd.addParameter("@O_NLINE", NInteger.class);
			cmd.addParameter("@O_STRENTRYPOINT", NString.class);
				
			cmd.execute();
			oNstackframe.val = cmd.getParameterValue("@O_NSTACKFRAME", NInteger.class);
			oStrtype.val = cmd.getParameterValue("@O_STRTYPE", NString.class);
			oStrowner.val = cmd.getParameterValue("@O_STROWNER", NString.class);
			oStrname.val = cmd.getParameterValue("@O_STRNAME", NString.class);
			oStrdblink.val = cmd.getParameterValue("@O_STRDBLINK", NString.class);
			oNline.val = cmd.getParameterValue("@O_NLINE", NInteger.class);
			oStrentrypoint.val = cmd.getParameterValue("@O_STRENTRYPOINT", NString.class);

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void getruntimeinfo(Ref<NInteger> oNterminated,Ref<NInteger> oNbreakpoint,Ref<NInteger> oNstackdepth,Ref<NInteger> oNinterpreterdepth,Ref<NInteger> oNreason,Ref<NString> oStrtype,Ref<NString> oStrowner,Ref<NString> oStrname,Ref<NString> oStrdblink,Ref<NInteger> oNline,Ref<NString> oStrentrypoint) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETRUNTIMEINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@O_NTERMINATED", NInteger.class);
			cmd.addParameter("@O_NBREAKPOINT", NInteger.class);
			cmd.addParameter("@O_NSTACKDEPTH", NInteger.class);
			cmd.addParameter("@O_NINTERPRETERDEPTH", NInteger.class);
			cmd.addParameter("@O_NREASON", NInteger.class);
			cmd.addParameter("@O_STRTYPE", NString.class);
			cmd.addParameter("@O_STROWNER", NString.class);
			cmd.addParameter("@O_STRNAME", NString.class);
			cmd.addParameter("@O_STRDBLINK", NString.class);
			cmd.addParameter("@O_NLINE", NInteger.class);
			cmd.addParameter("@O_STRENTRYPOINT", NString.class);
				
			cmd.execute();
			oNterminated.val = cmd.getParameterValue("@O_NTERMINATED", NInteger.class);
			oNbreakpoint.val = cmd.getParameterValue("@O_NBREAKPOINT", NInteger.class);
			oNstackdepth.val = cmd.getParameterValue("@O_NSTACKDEPTH", NInteger.class);
			oNinterpreterdepth.val = cmd.getParameterValue("@O_NINTERPRETERDEPTH", NInteger.class);
			oNreason.val = cmd.getParameterValue("@O_NREASON", NInteger.class);
			oStrtype.val = cmd.getParameterValue("@O_STRTYPE", NString.class);
			oStrowner.val = cmd.getParameterValue("@O_STROWNER", NString.class);
			oStrname.val = cmd.getParameterValue("@O_STRNAME", NString.class);
			oStrdblink.val = cmd.getParameterValue("@O_STRDBLINK", NString.class);
			oNline.val = cmd.getParameterValue("@O_NLINE", NInteger.class);
			oStrentrypoint.val = cmd.getParameterValue("@O_STRENTRYPOINT", NString.class);


		}
		
		public static NInteger Fgetsource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETSOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetstackframes() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETSTACKFRAMES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void getversion(Ref<NString> oStrmodel,Ref<NString> oStrheader,Ref<NString> oStrrevision) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.GETVERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@O_STRMODEL", NString.class);
			cmd.addParameter("@O_STRHEADER", NString.class);
			cmd.addParameter("@O_STRREVISION", NString.class);
				
			cmd.execute();
			oStrmodel.val = cmd.getParameterValue("@O_STRMODEL", NString.class);
			oStrheader.val = cmd.getParameterValue("@O_STRHEADER", NString.class);
			oStrrevision.val = cmd.getParameterValue("@O_STRREVISION", NString.class);


		}
		
		public static NInteger Fisprobepresent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.ISPROBEPRESENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void putLine(NString iStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.PUT_LINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@I_STR", iStr);
				
			cmd.execute();


		}
		
		public static NInteger Fsetbreakpoint(NString iStrtype,NString iStrowner,NString iStrname,NString iStrdblink,NInteger iNline,Ref<NInteger> oNbreakpointid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.SETBREAKPOINT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@I_STRTYPE", iStrtype);
			cmd.addParameter("@I_STROWNER", iStrowner);
			cmd.addParameter("@I_STRNAME", iStrname);
			cmd.addParameter("@I_STRDBLINK", iStrdblink);
			cmd.addParameter("@I_NLINE", iNline);
			cmd.addParameter("@O_NBREAKPOINTID", NInteger.class);
				
			cmd.execute();
			oNbreakpointid.val = cmd.getParameterValue("@O_NBREAKPOINTID", NInteger.class);

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fsynchronize() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_DEBUG.SYNCHRONIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
	
	
	
}
