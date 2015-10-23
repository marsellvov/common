package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokmisc {
		public static NString fExternalLaborOverride(NString sourceField,NString maskField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMISC.F_EXTERNAL_LABOR_OVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SOURCE_FIELD", sourceField);
			cmd.addParameter("@MASK_FIELD", maskField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNobtranStatus(NNumber parTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMISC.F_GET_NOBTRAN_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pNextApprover(NString parAcatCode,NNumber parPidm,NString parPosn,NString parSuff,NString parCoas,NString parOrgn,NNumber parApprSeqNo,NString parApprActionInd,NDate parAsOfDate,Ref<NString> parApprId,Ref<NString> parMsg,Ref<NString> parMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKMISC.P_NEXT_APPROVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ACAT_CODE", parAcatCode);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_COAS", parCoas);
			cmd.addParameter("@PAR_ORGN", parOrgn);
			cmd.addParameter("@PAR_APPR_SEQ_NO", parApprSeqNo);
			cmd.addParameter("@PAR_APPR_ACTION_IND", parApprActionInd);
			cmd.addParameter("@PAR_AS_OF_DATE", parAsOfDate);
			cmd.addParameter("@PAR_APPR_ID", NString.class);
			cmd.addParameter("@PAR_MSG", NString.class);
			cmd.addParameter("@PAR_MSG_TYPE", NString.class);
				
			cmd.execute();
			parApprId.val = cmd.getParameterValue("@PAR_APPR_ID", NString.class);
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);
			parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE", NString.class);


		}
		
	
	
	
}
