package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbDisplaymaskRules {
		public static NString fParentExists(NString pObjsCode,NString pBlockName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSeqno(NString pObjsCode,NString pBlockName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pDisplayInd,NString pConcealInd,NString pAllUserInd,NString pUserId,NString pDataMask,NString pFgacUserId,NString pFbprCode,NString pMaskDirection,NNumber pMaskLength,NString pObjsCompName,NString pBlockCompName,NString pColumnCompName,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DISPLAY_IND", pDisplayInd);
			cmd.addParameter("@P_CONCEAL_IND", pConcealInd);
			cmd.addParameter("@P_ALL_USER_IND", pAllUserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_MASK", pDataMask);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_MASK_DIRECTION", pMaskDirection);
			cmd.addParameter("@P_MASK_LENGTH", pMaskLength);
			cmd.addParameter("@P_OBJS_COMP_NAME", pObjsCompName);
			cmd.addParameter("@P_BLOCK_COMP_NAME", pBlockCompName);
			cmd.addParameter("@P_COLUMN_COMP_NAME", pColumnCompName);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pDisplayInd,NString pConcealInd,NString pAllUserInd,NString pUserId,NString pDataMask,NString pFgacUserId,NString pFbprCode,NString pMaskDirection,NNumber pMaskLength,NString pObjsCompName,NString pBlockCompName,NString pColumnCompName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DISPLAY_IND", pDisplayInd);
			cmd.addParameter("@P_CONCEAL_IND", pConcealInd);
			cmd.addParameter("@P_ALL_USER_IND", pAllUserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_MASK", pDataMask);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_MASK_DIRECTION", pMaskDirection);
			cmd.addParameter("@P_MASK_LENGTH", pMaskLength);
			cmd.addParameter("@P_OBJS_COMP_NAME", pObjsCompName);
			cmd.addParameter("@P_BLOCK_COMP_NAME", pBlockCompName);
			cmd.addParameter("@P_COLUMN_COMP_NAME", pColumnCompName);
				
			cmd.execute();


		}
		
	
	
	
}
