package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkxtax {
		public static void pCertification(NString pDcde,NString pEfdt,NString pDelc,NString pStat,NString pAmt1,NString pAmt2,NString pAmt3,NString pAmt4,NString pOpt1,NString pOpt2,NString pOpt3,NString pOpt4,NString pOpt5,NString pNameDiffInd,NNumber pAttemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTAX.P_CERTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCDE", pDcde);
			cmd.addParameter("@P_EFDT", pEfdt);
			cmd.addParameter("@P_DELC", pDelc);
			cmd.addParameter("@P_STAT", pStat);
			cmd.addParameter("@P_AMT1", pAmt1);
			cmd.addParameter("@P_AMT2", pAmt2);
			cmd.addParameter("@P_AMT3", pAmt3);
			cmd.addParameter("@P_AMT4", pAmt4);
			cmd.addParameter("@P_OPT1", pOpt1);
			cmd.addParameter("@P_OPT2", pOpt2);
			cmd.addParameter("@P_OPT3", pOpt3);
			cmd.addParameter("@P_OPT4", pOpt4);
			cmd.addParameter("@P_OPT5", pOpt5);
			cmd.addParameter("@P_NAME_DIFF_IND", pNameDiffInd);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
				
			cmd.execute();


		}
		
		public static void pCertificationdriver(NString pDcde,NString pEfdt,NString pDelc,NString pStat,NString pAmt1,NString pAmt2,NString pAmt3,NString pAmt4,NString pOpt1,NString pOpt2,NString pOpt3,NString pOpt4,NString pOpt5,NString pNameDiffInd,NNumber pAttemptno,NString pUserid,NString pPinno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTAX.P_CERTIFICATIONDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCDE", pDcde);
			cmd.addParameter("@P_EFDT", pEfdt);
			cmd.addParameter("@P_DELC", pDelc);
			cmd.addParameter("@P_STAT", pStat);
			cmd.addParameter("@P_AMT1", pAmt1);
			cmd.addParameter("@P_AMT2", pAmt2);
			cmd.addParameter("@P_AMT3", pAmt3);
			cmd.addParameter("@P_AMT4", pAmt4);
			cmd.addParameter("@P_OPT1", pOpt1);
			cmd.addParameter("@P_OPT2", pOpt2);
			cmd.addParameter("@P_OPT3", pOpt3);
			cmd.addParameter("@P_OPT4", pOpt4);
			cmd.addParameter("@P_OPT5", pOpt5);
			cmd.addParameter("@P_NAME_DIFF_IND", pNameDiffInd);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PINNO", pPinno);
				
			cmd.execute();


		}
		
		public static void pCertifyw4(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NDate displayDate,NString nameDiffInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTAX.P_CERTIFYW4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@DISPLAY_DATE", displayDate);
			cmd.addParameter("@NAME_DIFF_IND", nameDiffInd);
				
			cmd.execute();


		}
		
	
	
	
}
