package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pltest {
		public static void plFindEquivalents(NString pSbgi,NString pLevl,NString pTerm,NString pSubjTrns,NString pCrseNumbTrns,NString pSubjInst,NString pCrseNumbInst,NString pGroup,NString pProgram,Ref<NNumber> pBeginSeqno,Ref<NNumber> pEndSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PLTEST.PL_FIND_EQUIVALENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI", pSbgi);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SUBJ_TRNS", pSubjTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_SUBJ_INST", pSubjInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_BEGIN_SEQNO", NNumber.class);
			cmd.addParameter("@P_END_SEQNO", NNumber.class);
				
			cmd.execute();
			pBeginSeqno.val = cmd.getParameterValue("@P_BEGIN_SEQNO", NNumber.class);
			pEndSeqno.val = cmd.getParameterValue("@P_END_SEQNO", NNumber.class);


		}
		
	
	
	
}
