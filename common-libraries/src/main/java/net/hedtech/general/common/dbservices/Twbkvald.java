package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkvald {
		public static NBool fCharinnumericfield(NString pSourceField,NBool allowOnlyInteger) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.F_CHARINNUMERICFIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SOURCE_FIELD", pSourceField);
			cmd.addParameter("@ALLOW_ONLY_INTEGER", allowOnlyInteger);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCharinyear(NString paryyyy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.F_CHARINYEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARYYYY", paryyyy);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDateseparatornotfound(NString pSourceField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.F_DATESEPARATORNOTFOUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SOURCE_FIELD", pSourceField);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fErrormonthday(NString pSourceField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.F_ERRORMONTHDAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SOURCE_FIELD", pSourceField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fJavascriptvalidate(List<Twbklibs.Varchar2TabtypeRow> fieldTab,NNumber numFields) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.F_JAVASCRIPTVALIDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("FIELD_TAB", "", fieldTab, object.class));
//			cmd.addParameter("@NUM_FIELDS", numFields);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static void pAddvalidatefield(NString fieldName,NString fieldType,NString fieldDesc,Ref<List<Twbklibs.Varchar2TabtypeRow>> valTab,Ref<NNumber> numVal,NString checkNull,NString checkFormat,NString maxLength,NString maxValue,NString minValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.P_ADDVALIDATEFIELD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@FIELD_NAME", fieldName);
//			cmd.addParameter("@FIELD_TYPE", fieldType);
//			cmd.addParameter("@FIELD_DESC", fieldDesc);
//			// cmd.addParameter(DbTypes.getTableType("VAL_TAB", "", valTab.val, object.class , true));
//			cmd.addParameter("@NUM_VAL", numVal, true);
//			cmd.addParameter("@CHECK_NULL", checkNull);
//			cmd.addParameter("@CHECK_FORMAT", checkFormat);
//			cmd.addParameter("@MAX_LENGTH", maxLength);
//			cmd.addParameter("@MAX_VALUE", maxValue);
//			cmd.addParameter("@MIN_VALUE", minValue);
//				
//			cmd.execute();
//			// valTab.val = cmd.getTableParameterValue("@VAL_TAB", object.class);
//			numVal.val = cmd.getParameterValue("@NUM_VAL", NNumber.class);
//
//
//		}
		
		public static void pValidateformopen(NString curl,NString ctarget,NString cenctype,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.P_VALIDATEFORMOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURL", curl);
			cmd.addParameter("@CTARGET", ctarget);
			cmd.addParameter("@CENCTYPE", cenctype);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pValidateresetbutton(NString buttonText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.P_VALIDATERESETBUTTON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUTTON_TEXT", buttonText);
				
			cmd.execute();


		}
		
//		public static void pValidatesubmitbutton(List<Twbklibs.Varchar2TabtypeRow> validateTab,NNumber numValidate,NString buttonText,NString cname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKVALD.P_VALIDATESUBMITBUTTON", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VALIDATE_TAB", "", validateTab, object.class));
//			cmd.addParameter("@NUM_VALIDATE", numValidate);
//			cmd.addParameter("@BUTTON_TEXT", buttonText);
//			cmd.addParameter("@CNAME", cname);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
