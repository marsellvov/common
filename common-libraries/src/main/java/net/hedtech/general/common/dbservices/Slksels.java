package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Slksels {
		public static NString fGetBcatDesc(NString pBldgCode,NString pBcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_BCAT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCampCode(NString pBldgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_CAMP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlbbldgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_MUL_SLBBLDG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlbrdefValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_MUL_SLBRDEF_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrmasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_MUL_SLRMASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrpasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_MUL_SLRPASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMulSlrrasgValue(NNumber pPidm,NString pTermCode,NString pInd,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_MUL_SLRRASG_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSlbtermRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_SLBTERM_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetSlrcolrRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_SLRCOLR_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetSlrrmatValue(NNumber pPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_SLRRMAT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStvartpRoomReqInd(NString pArtp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_STVARTP_ROOM_REQ_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ARTP", pArtp);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStvhapsInactInd(NString pHaps) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.F_GET_STVHAPS_INACT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HAPS", pHaps);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetSlrmasgAssessData(Ref<NString> masgArIndInOut,Ref<NString> masgAssessNeededInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.P_GET_SLRMASG_ASSESS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MASG_AR_IND_IN_OUT", masgArIndInOut, true);
			cmd.addParameter("@MASG_ASSESS_NEEDED_IN_OUT", masgAssessNeededInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			masgArIndInOut.val = cmd.getParameterValue("@MASG_AR_IND_IN_OUT", NString.class);
			masgAssessNeededInOut.val = cmd.getParameterValue("@MASG_ASSESS_NEEDED_IN_OUT", NString.class);


		}
		
		public static void pGetSlrpasgAssessData(Ref<NString> pasgArIndInOut,Ref<NString> pasgAssessNeededInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.P_GET_SLRPASG_ASSESS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PASG_AR_IND_IN_OUT", pasgArIndInOut, true);
			cmd.addParameter("@PASG_ASSESS_NEEDED_IN_OUT", pasgAssessNeededInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			pasgArIndInOut.val = cmd.getParameterValue("@PASG_AR_IND_IN_OUT", NString.class);
			pasgAssessNeededInOut.val = cmd.getParameterValue("@PASG_ASSESS_NEEDED_IN_OUT", NString.class);


		}
		
		public static void pGetSlrrasgAssessData(Ref<NString> rasgArIndInOut,Ref<NString> rasgAssessNeededInOut,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKSELS.P_GET_SLRRASG_ASSESS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RASG_AR_IND_IN_OUT", rasgArIndInOut, true);
			cmd.addParameter("@RASG_ASSESS_NEEDED_IN_OUT", rasgAssessNeededInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			rasgArIndInOut.val = cmd.getParameterValue("@RASG_AR_IND_IN_OUT", NString.class);
			rasgAssessNeededInOut.val = cmd.getParameterValue("@RASG_ASSESS_NEEDED_IN_OUT", NString.class);


		}
		
	
	
	
}
