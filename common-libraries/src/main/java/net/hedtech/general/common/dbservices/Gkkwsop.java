package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkwsop {
		public static void pGkrwsopInsert(NString pWsprCode,NNumber pWsopId,NString pXproCode,NNumber pExecOrder,NString pDynamicInd,NString pAutoInd,NString pRunNowInd,NString pIterativeInd,NString pIterator,NNumber pReqTimeout,NString pPreTrg,NString pPostTrg,NDate pAutoDate,NDate pRunNowDate,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWSOP.P_GKRWSOP_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WSPR_CODE", pWsprCode);
			cmd.addParameter("@P_WSOP_ID", pWsopId);
			cmd.addParameter("@P_XPRO_CODE", pXproCode);
			cmd.addParameter("@P_EXEC_ORDER", pExecOrder);
			cmd.addParameter("@P_DYNAMIC_IND", pDynamicInd);
			cmd.addParameter("@P_AUTO_IND", pAutoInd);
			cmd.addParameter("@P_RUN_NOW_IND", pRunNowInd);
			cmd.addParameter("@P_ITERATIVE_IND", pIterativeInd);
			cmd.addParameter("@P_ITERATOR", pIterator);
			cmd.addParameter("@P_REQ_TIMEOUT", pReqTimeout);
			cmd.addParameter("@P_PRE_TRG", pPreTrg);
			cmd.addParameter("@P_POST_TRG", pPostTrg);
			cmd.addParameter("@P_AUTO_DATE", pAutoDate);
			cmd.addParameter("@P_RUN_NOW_DATE", pRunNowDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pGkrwsopUpdate(NString pWsprCode,NNumber pWsopId,NString pXproCode,NNumber pExecOrder,NString pDynamicInd,NString pAutoInd,NString pRunNowInd,NString pIterativeInd,NString pIterator,NNumber pReqTimeout,NString pPreTrg,NString pPostTrg,NDate pAutoDate,NDate pRunNowDate,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWSOP.P_GKRWSOP_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WSPR_CODE", pWsprCode);
			cmd.addParameter("@P_WSOP_ID", pWsopId);
			cmd.addParameter("@P_XPRO_CODE", pXproCode);
			cmd.addParameter("@P_EXEC_ORDER", pExecOrder);
			cmd.addParameter("@P_DYNAMIC_IND", pDynamicInd);
			cmd.addParameter("@P_AUTO_IND", pAutoInd);
			cmd.addParameter("@P_RUN_NOW_IND", pRunNowInd);
			cmd.addParameter("@P_ITERATIVE_IND", pIterativeInd);
			cmd.addParameter("@P_ITERATOR", pIterator);
			cmd.addParameter("@P_REQ_TIMEOUT", pReqTimeout);
			cmd.addParameter("@P_PRE_TRG", pPreTrg);
			cmd.addParameter("@P_POST_TRG", pPostTrg);
			cmd.addParameter("@P_AUTO_DATE", pAutoDate);
			cmd.addParameter("@P_RUN_NOW_DATE", pRunNowDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
