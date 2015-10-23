package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfcxchn {
		public static NString fAlertXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.F_ALERT_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFinanceGraphEditXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.F_FINANCE_GRAPH_EDIT_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFinanceGraphXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.F_FINANCE_GRAPH_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetError(NString pErrorname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGrantsXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.F_GRANTS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGraphLineLabels(NNumber maxValueIn,NString formatRoundMaskIn,NString formatDecMaskIn,Ref<NNumber> topLineNumOut,Ref<NString> topLineCharOut,Ref<NString> line2Out,Ref<NString> line3Out,Ref<NString> line4Out,Ref<NString> roundValuesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.P_GRAPH_LINE_LABELS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAX_VALUE_IN", maxValueIn);
			cmd.addParameter("@FORMAT_ROUND_MASK_IN", formatRoundMaskIn);
			cmd.addParameter("@FORMAT_DEC_MASK_IN", formatDecMaskIn);
			cmd.addParameter("@TOP_LINE_NUM_OUT", NNumber.class);
			cmd.addParameter("@TOP_LINE_CHAR_OUT", NString.class);
			cmd.addParameter("@LINE_2_OUT", NString.class);
			cmd.addParameter("@LINE_3_OUT", NString.class);
			cmd.addParameter("@LINE_4_OUT", NString.class);
			cmd.addParameter("@ROUND_VALUES_OUT", NString.class);
				
			cmd.execute();
			topLineNumOut.val = cmd.getParameterValue("@TOP_LINE_NUM_OUT", NNumber.class);
			topLineCharOut.val = cmd.getParameterValue("@TOP_LINE_CHAR_OUT", NString.class);
			line2Out.val = cmd.getParameterValue("@LINE_2_OUT", NString.class);
			line3Out.val = cmd.getParameterValue("@LINE_3_OUT", NString.class);
			line4Out.val = cmd.getParameterValue("@LINE_4_OUT", NString.class);
			roundValuesOut.val = cmd.getParameterValue("@ROUND_VALUES_OUT", NString.class);


		}
		
		public static void pInitError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCXCHN.P_INIT_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
