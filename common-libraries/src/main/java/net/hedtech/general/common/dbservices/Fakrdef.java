package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fakrdef {
		public static void pEditFundCodeAr(NString reeditOrgn,NString workCoas,NString workFund,NString effdate,NString globalFundOrgSec,NString currentUser,Ref<NString> workOrgn,Ref<NString> mess,Ref<NString> ftypCode,Ref<NString> orgnCodeDef,Ref<NString> progCodeDef,Ref<NString> actvCodeDef,Ref<NString> locnCodeDef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKRDEF.P_EDIT_FUND_CODE_AR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REEDIT_ORGN", reeditOrgn);
			cmd.addParameter("@WORK_COAS", workCoas);
			cmd.addParameter("@WORK_FUND", workFund);
			cmd.addParameter("@EFFDATE", effdate);
			cmd.addParameter("@GLOBAL_FUND_ORG_SEC", globalFundOrgSec);
			cmd.addParameter("@CURRENT_USER", currentUser);
			cmd.addParameter("@WORK_ORGN", workOrgn, true);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@FTYP_CODE", ftypCode, true);
			cmd.addParameter("@ORGN_CODE_DEF", orgnCodeDef, true);
			cmd.addParameter("@PROG_CODE_DEF", progCodeDef, true);
			cmd.addParameter("@ACTV_CODE_DEF", actvCodeDef, true);
			cmd.addParameter("@LOCN_CODE_DEF", locnCodeDef, true);
				
			cmd.execute();
			workOrgn.val = cmd.getParameterValue("@WORK_ORGN", NString.class);
			mess.val = cmd.getParameterValue("@MESS", NString.class);
			ftypCode.val = cmd.getParameterValue("@FTYP_CODE", NString.class);
			orgnCodeDef.val = cmd.getParameterValue("@ORGN_CODE_DEF", NString.class);
			progCodeDef.val = cmd.getParameterValue("@PROG_CODE_DEF", NString.class);
			actvCodeDef.val = cmd.getParameterValue("@ACTV_CODE_DEF", NString.class);
			locnCodeDef.val = cmd.getParameterValue("@LOCN_CODE_DEF", NString.class);


		}
		
		public static void pEditOrgnCodeAr(NString reeditInd,NString workCoas,NString workOrgn,NString effdate,NString globalFundOrgSec,NString currentUser,Ref<NString> workFund,Ref<NString> mess,Ref<NString> fundCodeDef,Ref<NString> progCodeDef,Ref<NString> actvCodeDef,Ref<NString> locnCodeDef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKRDEF.P_EDIT_ORGN_CODE_AR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REEDIT_IND", reeditInd);
			cmd.addParameter("@WORK_COAS", workCoas);
			cmd.addParameter("@WORK_ORGN", workOrgn);
			cmd.addParameter("@EFFDATE", effdate);
			cmd.addParameter("@GLOBAL_FUND_ORG_SEC", globalFundOrgSec);
			cmd.addParameter("@CURRENT_USER", currentUser);
			cmd.addParameter("@WORK_FUND", workFund, true);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@FUND_CODE_DEF", fundCodeDef, true);
			cmd.addParameter("@PROG_CODE_DEF", progCodeDef, true);
			cmd.addParameter("@ACTV_CODE_DEF", actvCodeDef, true);
			cmd.addParameter("@LOCN_CODE_DEF", locnCodeDef, true);
				
			cmd.execute();
			workFund.val = cmd.getParameterValue("@WORK_FUND", NString.class);
			mess.val = cmd.getParameterValue("@MESS", NString.class);
			fundCodeDef.val = cmd.getParameterValue("@FUND_CODE_DEF", NString.class);
			progCodeDef.val = cmd.getParameterValue("@PROG_CODE_DEF", NString.class);
			actvCodeDef.val = cmd.getParameterValue("@ACTV_CODE_DEF", NString.class);
			locnCodeDef.val = cmd.getParameterValue("@LOCN_CODE_DEF", NString.class);


		}
		
	
	
	
}
