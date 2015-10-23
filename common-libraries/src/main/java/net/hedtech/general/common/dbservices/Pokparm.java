package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokparm {
		public static NDate fGetAsofDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_ASOF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetBargUnit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_BARG_UNIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBureCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_BURE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCoasCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnCodeHigh() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_ORGN_CODE_HIGH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnCodeLow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_ORGN_CODE_LOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPosn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_POSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProbationUnitInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.F_GET_PROBATION_UNIT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteParms() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.P_DELETE_PARMS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGlobalEmployeeBargUnit(NString bargUnit,NString bureCode,NString posn,NDate asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.P_GLOBAL_EMPLOYEE_BARG_UNIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BARG_UNIT", bargUnit);
			cmd.addParameter("@BURE_CODE", bureCode);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();


		}
		
		public static void pGlobalProbationInfo(NString coasCode,NString orgnCodeLow,NString orgnCodeHigh,NString probationUnitInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.P_GLOBAL_PROBATION_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ORGN_CODE_LOW", orgnCodeLow);
			cmd.addParameter("@ORGN_CODE_HIGH", orgnCodeHigh);
			cmd.addParameter("@PROBATION_UNIT_IND", probationUnitInd);
				
			cmd.execute();


		}
		
		public static void pInsertParms(ParmRectypeRow parmRecIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.P_INSERT_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("PARM_REC_IN", parmRecIn, ParmRectypeRow.class ));
				
			cmd.execute();


		}
		
		public static void pInsertParms(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString coasCodeIn,NString orgnCodeIn,NString teStatusIn,NString teActionIn,NString teMethodIn,NNumber pidmIn,NDate leaveBalanceDateIn,NString leaveSeqMethodIn,NString leaveDisplayTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPARM.P_INSERT_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@TE_STATUS_IN", teStatusIn);
			cmd.addParameter("@TE_ACTION_IN", teActionIn);
			cmd.addParameter("@TE_METHOD_IN", teMethodIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEAVE_BALANCE_DATE_IN", leaveBalanceDateIn);
			cmd.addParameter("@LEAVE_SEQ_METHOD_IN", leaveSeqMethodIn);
			cmd.addParameter("@LEAVE_DISPLAY_TYPE_IN", leaveDisplayTypeIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ParmRectypeRow", dataSourceName="POKPARM.PARM_RECTYPE")
	public static class ParmRectypeRow
	{
		@DbRecordField(dataSourceName="YEAR")
		public NString Year;
		@DbRecordField(dataSourceName="PICT_CODE")
		public NString PictCode;
		@DbRecordField(dataSourceName="PAYNO")
		public NNumber Payno;
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="COAS_CODE_TS")
		public NString CoasCodeTs;
		@DbRecordField(dataSourceName="ORGN_CODE_TS")
		public NString OrgnCodeTs;
		@DbRecordField(dataSourceName="ORGN_HIER_IND")
		public NString OrgnHierInd;
		@DbRecordField(dataSourceName="PCLS_CODE")
		public NString PclsCode;
		@DbRecordField(dataSourceName="AS_OF_DATE")
		public NDate AsOfDate;
		@DbRecordField(dataSourceName="TE_STATUS")
		public NString TeStatus;
		@DbRecordField(dataSourceName="TE_ACTION")
		public NString TeAction;
		@DbRecordField(dataSourceName="TE_METHOD")
		public NString TeMethod;
		@DbRecordField(dataSourceName="LEAVE_BALANCE_DATE")
		public NDate LeaveBalanceDate;
		@DbRecordField(dataSourceName="LEAVE_SEQ_METHOD")
		public NString LeaveSeqMethod;
		@DbRecordField(dataSourceName="LEAVE_DISPLAY_TYPE")
		public NString LeaveDisplayType;
	}

	
	
}
