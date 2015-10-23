package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkgtrk {
		public static void pGrouptracking(NString trackValue,NNumber pidm,NString user,NString term,NString sggnInd,NString sgcmInd,NString sglvInd,NString sgrsInd,NString sgrcInd,NString sgrgInd,NString sggcInd,NString sgavInd,NString sgcaInd,NString sgceInd,NString sgclInd,NString sgctInd,NString sgreInd,NString sgrdInd,NString sgrlInd,NString sgrtInd,NString bsgruInd,NString rsgruInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKGTRK.P_GROUPTRACKING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACK_VALUE", trackValue);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SGGN_IND", sggnInd);
			cmd.addParameter("@SGCM_IND", sgcmInd);
			cmd.addParameter("@SGLV_IND", sglvInd);
			cmd.addParameter("@SGRS_IND", sgrsInd);
			cmd.addParameter("@SGRC_IND", sgrcInd);
			cmd.addParameter("@SGRG_IND", sgrgInd);
			cmd.addParameter("@SGGC_IND", sggcInd);
			cmd.addParameter("@SGAV_IND", sgavInd);
			cmd.addParameter("@SGCA_IND", sgcaInd);
			cmd.addParameter("@SGCE_IND", sgceInd);
			cmd.addParameter("@SGCL_IND", sgclInd);
			cmd.addParameter("@SGCT_IND", sgctInd);
			cmd.addParameter("@SGRE_IND", sgreInd);
			cmd.addParameter("@SGRD_IND", sgrdInd);
			cmd.addParameter("@SGRL_IND", sgrlInd);
			cmd.addParameter("@SGRT_IND", sgrtInd);
			cmd.addParameter("@BSGRU_IND", bsgruInd);
			cmd.addParameter("@RSGRU_IND", rsgruInd);
				
			cmd.execute();


		}
		
	
	
	
}
