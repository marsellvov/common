package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkolrl {
		public static NNumber fCalculateDurationComplete(NDate startDateIn,NDate regstatusDateIn,NString duntIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.F_CALCULATE_DURATION_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@REGSTATUS_DATE_IN", regstatusDateIn);
			cmd.addParameter("@DUNT_IN", duntIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalculatePctComplete(NDate startDateIn,NDate endDateIn,NDate regstatusDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.F_CALCULATE_PCT_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@REGSTATUS_DATE_IN", regstatusDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fCutoffReached(NDate startDateIn,NDate endDateIn,NDate regstatusDateIn,NString duntIn,NNumber cutoffPctFromIn,NNumber cutoffPctToIn,NNumber cutoffDurFromIn,NNumber cutoffDurToIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.F_CUTOFF_REACHED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@REGSTATUS_DATE_IN", regstatusDateIn);
			cmd.addParameter("@DUNT_IN", duntIn);
			cmd.addParameter("@CUTOFF_PCT_FROM_IN", cutoffPctFromIn);
			cmd.addParameter("@CUTOFF_PCT_TO_IN", cutoffPctToIn);
			cmd.addParameter("@CUTOFF_DUR_FROM_IN", cutoffDurFromIn);
			cmd.addParameter("@CUTOFF_DUR_TO_IN", cutoffDurToIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fOpenLearningCourse(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.F_OPEN_LEARNING_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void fVrGetSsrrstsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.F_VR_GET_SSRRSTS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDetermineRefund(NString termIn,NString crnIn,NDate startDateIn,NDate endDateIn,NString rstsIn,NDate regstatusDateIn,NString duntIn,Ref<NNumber> pctCompleteOut,Ref<NNumber> durationCompleteOut,Ref<NNumber> tuitionRefundOut,Ref<NNumber> feeRefundOut,Ref<NNumber> extensionRefundOut,Ref<NString> returnType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKOLRL.P_DETERMINE_REFUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@REGSTATUS_DATE_IN", regstatusDateIn);
			cmd.addParameter("@DUNT_IN", duntIn);
			cmd.addParameter("@PCT_COMPLETE_OUT", NNumber.class);
			cmd.addParameter("@DURATION_COMPLETE_OUT", NNumber.class);
			cmd.addParameter("@TUITION_REFUND_OUT", NNumber.class);
			cmd.addParameter("@FEE_REFUND_OUT", NNumber.class);
			cmd.addParameter("@EXTENSION_REFUND_OUT", NNumber.class);
			cmd.addParameter("@RETURN_TYPE", NString.class);
				
			cmd.execute();
			pctCompleteOut.val = cmd.getParameterValue("@PCT_COMPLETE_OUT", NNumber.class);
			durationCompleteOut.val = cmd.getParameterValue("@DURATION_COMPLETE_OUT", NNumber.class);
			tuitionRefundOut.val = cmd.getParameterValue("@TUITION_REFUND_OUT", NNumber.class);
			feeRefundOut.val = cmd.getParameterValue("@FEE_REFUND_OUT", NNumber.class);
			extensionRefundOut.val = cmd.getParameterValue("@EXTENSION_REFUND_OUT", NNumber.class);
			returnType.val = cmd.getParameterValue("@RETURN_TYPE", NString.class);


		}
		
	
	
	
}
