package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokdtop {
		public static NString fGetGotdparWhere(NString stepnameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.F_GET_GOTDPAR_WHERE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STEPNAME_IN", stepnameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPackageInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.F_PACKAGE_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteGotdmsg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_DELETE_GOTDMSG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteGotdpar(NString stepNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_DELETE_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME_IN", stepNameIn);
				
			cmd.execute();


		}
		
		public static void pDeleteGotdwks() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_DELETE_GOTDWKS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGrantedLookups(NString userIn,Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_GRANTED_LOOKUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pGrantedWizards(NString userIn,Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_GRANTED_WIZARDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pInsertGotdmsg(NString workbook,NString worksheet,NNumber rowNumber,NString errorType,NString errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_INSERT_GOTDMSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMBER", rowNumber);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERROR_MSG", errorMsg);
				
			cmd.execute();


		}
		
		public static void pInsertGotdpar(NString stepNameIn,NString gotdpar1,NString gotdpar2,NString gotdpar3,NString gotdpar4,NString gotdpar5,NString gotdpar6,NString gotdpar7,NString gotdpar8,NString gotdpar9,NString gotdpar10,NString gotdpar11,NString gotdpar12,NString gotdpar13,NString gotdpar14,NString gotdpar15,NString gotdpar16,NString gotdpar17,NString gotdpar18,NString gotdpar19,NString gotdpar20,NString gotdpar21,NString gotdpar22,NString gotdpar23,NString gotdpar24,NString gotdpar25,NString gotdpar26,NString gotdpar27,NString gotdpar28,NString gotdpar29,NString gotdpar30,NString gotdpar31,NString gotdpar32,NString gotdpar33,NString gotdpar34,NString gotdpar35,NString gotdpar36,NString gotdpar37,NString gotdpar38,NString gotdpar39,NString gotdpar40,NString gotdpar41,NString gotdpar42,NString gotdpar43,NString gotdpar44,NString gotdpar45,NString gotdpar46,NString gotdpar47,NString gotdpar48,NString gotdpar49,NString gotdpar50,NString gotdpar51,NString gotdpar52,NString gotdpar53,NString gotdpar54,NString gotdpar55,NString gotdpar56,NString gotdpar57,NString gotdpar58,NString gotdpar59,NString gotdpar60,NString gotdpar61,NString gotdpar62,NString gotdpar63,NString gotdpar64,NString gotdpar65,NString gotdpar66,NString gotdpar67,NString gotdpar68,NString gotdpar69,NString gotdpar70,NString gotdpar71,NString gotdpar72,NString gotdpar73,NString gotdpar74,NString gotdpar75,NString gotdpar76,NString gotdpar77,NString gotdpar78,NString gotdpar79,NString gotdpar80,NString gotdpar81,NString gotdpar82,NString gotdpar83,NString gotdpar84,NString gotdpar85,NString gotdpar86,NString gotdpar87,NString gotdpar88,NString gotdpar89,NString gotdpar90,NString gotdpar91,NString gotdpar92,NString gotdpar93,NString gotdpar94,NString gotdpar95,NString gotdpar96,NString gotdpar97,NString gotdpar98,NString gotdpar99,NString gotdpar100) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_INSERT_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME_IN", stepNameIn);
			cmd.addParameter("@GOTDPAR_1", gotdpar1);
			cmd.addParameter("@GOTDPAR_2", gotdpar2);
			cmd.addParameter("@GOTDPAR_3", gotdpar3);
			cmd.addParameter("@GOTDPAR_4", gotdpar4);
			cmd.addParameter("@GOTDPAR_5", gotdpar5);
			cmd.addParameter("@GOTDPAR_6", gotdpar6);
			cmd.addParameter("@GOTDPAR_7", gotdpar7);
			cmd.addParameter("@GOTDPAR_8", gotdpar8);
			cmd.addParameter("@GOTDPAR_9", gotdpar9);
			cmd.addParameter("@GOTDPAR_10", gotdpar10);
			cmd.addParameter("@GOTDPAR_11", gotdpar11);
			cmd.addParameter("@GOTDPAR_12", gotdpar12);
			cmd.addParameter("@GOTDPAR_13", gotdpar13);
			cmd.addParameter("@GOTDPAR_14", gotdpar14);
			cmd.addParameter("@GOTDPAR_15", gotdpar15);
			cmd.addParameter("@GOTDPAR_16", gotdpar16);
			cmd.addParameter("@GOTDPAR_17", gotdpar17);
			cmd.addParameter("@GOTDPAR_18", gotdpar18);
			cmd.addParameter("@GOTDPAR_19", gotdpar19);
			cmd.addParameter("@GOTDPAR_20", gotdpar20);
			cmd.addParameter("@GOTDPAR_21", gotdpar21);
			cmd.addParameter("@GOTDPAR_22", gotdpar22);
			cmd.addParameter("@GOTDPAR_23", gotdpar23);
			cmd.addParameter("@GOTDPAR_24", gotdpar24);
			cmd.addParameter("@GOTDPAR_25", gotdpar25);
			cmd.addParameter("@GOTDPAR_26", gotdpar26);
			cmd.addParameter("@GOTDPAR_27", gotdpar27);
			cmd.addParameter("@GOTDPAR_28", gotdpar28);
			cmd.addParameter("@GOTDPAR_29", gotdpar29);
			cmd.addParameter("@GOTDPAR_30", gotdpar30);
			cmd.addParameter("@GOTDPAR_31", gotdpar31);
			cmd.addParameter("@GOTDPAR_32", gotdpar32);
			cmd.addParameter("@GOTDPAR_33", gotdpar33);
			cmd.addParameter("@GOTDPAR_34", gotdpar34);
			cmd.addParameter("@GOTDPAR_35", gotdpar35);
			cmd.addParameter("@GOTDPAR_36", gotdpar36);
			cmd.addParameter("@GOTDPAR_37", gotdpar37);
			cmd.addParameter("@GOTDPAR_38", gotdpar38);
			cmd.addParameter("@GOTDPAR_39", gotdpar39);
			cmd.addParameter("@GOTDPAR_40", gotdpar40);
			cmd.addParameter("@GOTDPAR_41", gotdpar41);
			cmd.addParameter("@GOTDPAR_42", gotdpar42);
			cmd.addParameter("@GOTDPAR_43", gotdpar43);
			cmd.addParameter("@GOTDPAR_44", gotdpar44);
			cmd.addParameter("@GOTDPAR_45", gotdpar45);
			cmd.addParameter("@GOTDPAR_46", gotdpar46);
			cmd.addParameter("@GOTDPAR_47", gotdpar47);
			cmd.addParameter("@GOTDPAR_48", gotdpar48);
			cmd.addParameter("@GOTDPAR_49", gotdpar49);
			cmd.addParameter("@GOTDPAR_50", gotdpar50);
			cmd.addParameter("@GOTDPAR_51", gotdpar51);
			cmd.addParameter("@GOTDPAR_52", gotdpar52);
			cmd.addParameter("@GOTDPAR_53", gotdpar53);
			cmd.addParameter("@GOTDPAR_54", gotdpar54);
			cmd.addParameter("@GOTDPAR_55", gotdpar55);
			cmd.addParameter("@GOTDPAR_56", gotdpar56);
			cmd.addParameter("@GOTDPAR_57", gotdpar57);
			cmd.addParameter("@GOTDPAR_58", gotdpar58);
			cmd.addParameter("@GOTDPAR_59", gotdpar59);
			cmd.addParameter("@GOTDPAR_60", gotdpar60);
			cmd.addParameter("@GOTDPAR_61", gotdpar61);
			cmd.addParameter("@GOTDPAR_62", gotdpar62);
			cmd.addParameter("@GOTDPAR_63", gotdpar63);
			cmd.addParameter("@GOTDPAR_64", gotdpar64);
			cmd.addParameter("@GOTDPAR_65", gotdpar65);
			cmd.addParameter("@GOTDPAR_66", gotdpar66);
			cmd.addParameter("@GOTDPAR_67", gotdpar67);
			cmd.addParameter("@GOTDPAR_68", gotdpar68);
			cmd.addParameter("@GOTDPAR_69", gotdpar69);
			cmd.addParameter("@GOTDPAR_70", gotdpar70);
			cmd.addParameter("@GOTDPAR_71", gotdpar71);
			cmd.addParameter("@GOTDPAR_72", gotdpar72);
			cmd.addParameter("@GOTDPAR_73", gotdpar73);
			cmd.addParameter("@GOTDPAR_74", gotdpar74);
			cmd.addParameter("@GOTDPAR_75", gotdpar75);
			cmd.addParameter("@GOTDPAR_76", gotdpar76);
			cmd.addParameter("@GOTDPAR_77", gotdpar77);
			cmd.addParameter("@GOTDPAR_78", gotdpar78);
			cmd.addParameter("@GOTDPAR_79", gotdpar79);
			cmd.addParameter("@GOTDPAR_80", gotdpar80);
			cmd.addParameter("@GOTDPAR_81", gotdpar81);
			cmd.addParameter("@GOTDPAR_82", gotdpar82);
			cmd.addParameter("@GOTDPAR_83", gotdpar83);
			cmd.addParameter("@GOTDPAR_84", gotdpar84);
			cmd.addParameter("@GOTDPAR_85", gotdpar85);
			cmd.addParameter("@GOTDPAR_86", gotdpar86);
			cmd.addParameter("@GOTDPAR_87", gotdpar87);
			cmd.addParameter("@GOTDPAR_88", gotdpar88);
			cmd.addParameter("@GOTDPAR_89", gotdpar89);
			cmd.addParameter("@GOTDPAR_90", gotdpar90);
			cmd.addParameter("@GOTDPAR_91", gotdpar91);
			cmd.addParameter("@GOTDPAR_92", gotdpar92);
			cmd.addParameter("@GOTDPAR_93", gotdpar93);
			cmd.addParameter("@GOTDPAR_94", gotdpar94);
			cmd.addParameter("@GOTDPAR_95", gotdpar95);
			cmd.addParameter("@GOTDPAR_96", gotdpar96);
			cmd.addParameter("@GOTDPAR_97", gotdpar97);
			cmd.addParameter("@GOTDPAR_98", gotdpar98);
			cmd.addParameter("@GOTDPAR_99", gotdpar99);
			cmd.addParameter("@GOTDPAR_100", gotdpar100);
				
			cmd.execute();


		}
		
		public static void pLookupProperties(NString addinIn,NString lookupIn,Ref<NString> lookupDescOut,Ref<NString> loadFunctionOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_LOOKUP_PROPERTIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDIN_IN", addinIn);
			cmd.addParameter("@LOOKUP_IN", lookupIn);
			cmd.addParameter("@LOOKUP_DESC_OUT", NString.class);
			cmd.addParameter("@LOAD_FUNCTION_OUT", NString.class);
				
			cmd.execute();
			lookupDescOut.val = cmd.getParameterValue("@LOOKUP_DESC_OUT", NString.class);
			loadFunctionOut.val = cmd.getParameterValue("@LOAD_FUNCTION_OUT", NString.class);


		}
		
		public static void pStepProperties(NString addin,NString wizard,NString stepName,Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_STEP_PROPERTIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDIN", addin);
			cmd.addParameter("@WIZARD", wizard);
			cmd.addParameter("@STEP_NAME", stepName);
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pStepType(NString addinIn,NString wizardIn,NString stepNameIn,Ref<NString> stepTypeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_STEP_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDIN_IN", addinIn);
			cmd.addParameter("@WIZARD_IN", wizardIn);
			cmd.addParameter("@STEP_NAME_IN", stepNameIn);
			cmd.addParameter("@STEP_TYPE_OUT", NString.class);
				
			cmd.execute();
			stepTypeOut.val = cmd.getParameterValue("@STEP_TYPE_OUT", NString.class);


		}
		
		public static void pUserSecurityWizard(NString userIn,NString addinIn,NString wizardIn,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_USER_SECURITY_WIZARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@ADDIN_IN", addinIn);
			cmd.addParameter("@WIZARD_IN", wizardIn);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pWizardProperties(NString addinIn,NString wizardIn,Ref<NString> addinDescOut,Ref<NString> wizardDescOut,Ref<NString> nextFunctionOut,Ref<NString> finishFunctionOut,Ref<NString> unloadFunctionOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDTOP.P_WIZARD_PROPERTIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDIN_IN", addinIn);
			cmd.addParameter("@WIZARD_IN", wizardIn);
			cmd.addParameter("@ADDIN_DESC_OUT", NString.class);
			cmd.addParameter("@WIZARD_DESC_OUT", NString.class);
			cmd.addParameter("@NEXT_FUNCTION_OUT", NString.class);
			cmd.addParameter("@FINISH_FUNCTION_OUT", NString.class);
			cmd.addParameter("@UNLOAD_FUNCTION_OUT", NString.class);
				
			cmd.execute();
			addinDescOut.val = cmd.getParameterValue("@ADDIN_DESC_OUT", NString.class);
			wizardDescOut.val = cmd.getParameterValue("@WIZARD_DESC_OUT", NString.class);
			nextFunctionOut.val = cmd.getParameterValue("@NEXT_FUNCTION_OUT", NString.class);
			finishFunctionOut.val = cmd.getParameterValue("@FINISH_FUNCTION_OUT", NString.class);
			unloadFunctionOut.val = cmd.getParameterValue("@UNLOAD_FUNCTION_OUT", NString.class);


		}
		
	
	
	
}
