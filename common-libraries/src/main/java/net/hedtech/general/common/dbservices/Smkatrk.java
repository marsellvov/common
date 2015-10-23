package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkatrk {
		public static void pAreatracking(NString trackValue,NNumber pidm,NString user,NString term,NString sagnInd,NString bsaruInd,NString rsaruInd,NString sacmInd,NString sagdInd,NString sagmInd,NString bsagrInd,NString rsagrInd,NString salvInd,NString sarsInd,NString sarcInd,NString sargInd,NString sagcInd,NString sacaInd,NString saceInd,NString saclInd,NString sactInd,NString sareInd,NString sardInd,NString sarlInd,NString sartInd,NString sapvInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKATRK.P_AREATRACKING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACK_VALUE", trackValue);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SAGN_IND", sagnInd);
			cmd.addParameter("@BSARU_IND", bsaruInd);
			cmd.addParameter("@RSARU_IND", rsaruInd);
			cmd.addParameter("@SACM_IND", sacmInd);
			cmd.addParameter("@SAGD_IND", sagdInd);
			cmd.addParameter("@SAGM_IND", sagmInd);
			cmd.addParameter("@BSAGR_IND", bsagrInd);
			cmd.addParameter("@RSAGR_IND", rsagrInd);
			cmd.addParameter("@SALV_IND", salvInd);
			cmd.addParameter("@SARS_IND", sarsInd);
			cmd.addParameter("@SARC_IND", sarcInd);
			cmd.addParameter("@SARG_IND", sargInd);
			cmd.addParameter("@SAGC_IND", sagcInd);
			cmd.addParameter("@SACA_IND", sacaInd);
			cmd.addParameter("@SACE_IND", saceInd);
			cmd.addParameter("@SACL_IND", saclInd);
			cmd.addParameter("@SACT_IND", sactInd);
			cmd.addParameter("@SARE_IND", sareInd);
			cmd.addParameter("@SARD_IND", sardInd);
			cmd.addParameter("@SARL_IND", sarlInd);
			cmd.addParameter("@SART_IND", sartInd);
			cmd.addParameter("@SAPV_IND", sapvInd);
				
			cmd.execute();


		}
		
	
	
	
}
