package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shktran {
		public static NString fFormatSsn(NString pFmask,NString pData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKTRAN.F_FORMAT_SSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FMASK", pFmask);
			cmd.addParameter("@P_DATA", pData);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTranscriptName(NNumber pPidm,NNumber pTransSeqno,NString pTransUser,NNumber pDegrSeqno,NString pEdiInd,Ref<NString> pLastName,Ref<NString> pFirstName,Ref<NString> pMi,Ref<NString> pSuffix,Ref<NString> pPrefix,Ref<NString> pSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKTRAN.F_TRANSCRIPT_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_SEQNO", pTransSeqno);
			cmd.addParameter("@P_TRANS_USER", pTransUser);
			cmd.addParameter("@P_DEGR_SEQNO", pDegrSeqno);
			cmd.addParameter("@P_EDI_IND", pEdiInd);
			cmd.addParameter("@P_LAST_NAME", pLastName, true);
			cmd.addParameter("@P_FIRST_NAME", pFirstName, true);
			cmd.addParameter("@P_MI", pMi, true);
			cmd.addParameter("@P_SUFFIX", pSuffix, true);
			cmd.addParameter("@P_PREFIX", pPrefix, true);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix, true);
				
			cmd.execute();
			pLastName.val = cmd.getParameterValue("@P_LAST_NAME", NString.class);
			pFirstName.val = cmd.getParameterValue("@P_FIRST_NAME", NString.class);
			pMi.val = cmd.getParameterValue("@P_MI", NString.class);
			pSuffix.val = cmd.getParameterValue("@P_SUFFIX", NString.class);
			pPrefix.val = cmd.getParameterValue("@P_PREFIX", NString.class);
			pSurnamePrefix.val = cmd.getParameterValue("@P_SURNAME_PREFIX", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
