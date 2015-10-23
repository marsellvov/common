package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkptrk {
		public static void pProgramtracking(NString trackValue,NNumber pidm,NString user,NString term,NString spgnInd,NString spapInd,NString spatInd,NString spcmInd,NString spncInd,NString sprcInd,NString splvInd,NString sprsInd,NString sprgInd,NString spgcInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKPTRK.P_PROGRAMTRACKING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRACK_VALUE", trackValue);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SPGN_IND", spgnInd);
			cmd.addParameter("@SPAP_IND", spapInd);
			cmd.addParameter("@SPAT_IND", spatInd);
			cmd.addParameter("@SPCM_IND", spcmInd);
			cmd.addParameter("@SPNC_IND", spncInd);
			cmd.addParameter("@SPRC_IND", sprcInd);
			cmd.addParameter("@SPLV_IND", splvInd);
			cmd.addParameter("@SPRS_IND", sprsInd);
			cmd.addParameter("@SPRG_IND", sprgInd);
			cmd.addParameter("@SPGC_IND", spgcInd);
				
			cmd.execute();


		}
		
	
	
	
}
