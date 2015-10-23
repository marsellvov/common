package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmObjif {
		public static NNumber Fcleanup(NNumber ts1,NNumber ts2,NNumber ts3,NNumber ts4,NNumber ts5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.CLEANUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TS1", ts1);
			cmd.addParameter("@TS2", ts2);
			cmd.addParameter("@TS3", ts3);
			cmd.addParameter("@TS4", ts4);
			cmd.addParameter("@TS5", ts5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FcopyAttributes(NString pprojectCodeOld,NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.COPY_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROJECT_CODE_OLD", pprojectCodeOld);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fessentialtext(NString pstring) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.ESSENTIALTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PSTRING", pstring);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetNumAttribute(NString pA,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.GET_NUM_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_A", pA);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetTxtAttribute(NString pA,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.GET_TXT_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_A", pA);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fgetpropstring(NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName,NNumber pobjectProp,Ref<NNumber> ptranslStat,Ref<NString> pstring,NNumber pmatch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.GETPROPSTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
			cmd.addParameter("@POBJECT_PROP", pobjectProp);
			cmd.addParameter("@PTRANSL_STAT", ptranslStat, true);
			cmd.addParameter("@PSTRING", pstring, true);
			cmd.addParameter("@PMATCH", pmatch);
				
			cmd.execute();
			ptranslStat.val = cmd.getParameterValue("@PTRANSL_STAT", NNumber.class);
			pstring.val = cmd.getParameterValue("@PSTRING", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetproptransgui(NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName,NNumber pobjectProp,Ref<NNumber> ptranslStat,Ref<NString> pstring,NNumber pverify,NNumber pwantattributes,Ref<NString> pattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.GETPROPTRANSGUI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
			cmd.addParameter("@POBJECT_PROP", pobjectProp);
			cmd.addParameter("@PTRANSL_STAT", ptranslStat, true);
			cmd.addParameter("@PSTRING", pstring, true);
			cmd.addParameter("@PVERIFY", pverify);
			cmd.addParameter("@PWANTATTRIBUTES", pwantattributes);
			cmd.addParameter("@PATTRIBUTES", pattributes, true);
				
			cmd.execute();
			ptranslStat.val = cmd.getParameterValue("@PTRANSL_STAT", NNumber.class);
			pstring.val = cmd.getParameterValue("@PSTRING", NString.class);
			pattributes.val = cmd.getParameterValue("@PATTRIBUTES", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetstrcodeInsert(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.GETSTRCODE_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fhashnumber(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.HASHNUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FlangCodeSrc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.LANG_CODE_SRC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FlangCodeTgt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.LANG_CODE_TGT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Flengthv(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.LENGTHV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Flengthvmethod(NString pNewmethod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.LENGTHVMETHOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NEWMETHOD", pNewmethod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void lrtrim(NString plang,Ref<NString> pstr,Ref<NString> pPreStr,Ref<NString> pPstStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.LRTRIM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLANG", plang);
			cmd.addParameter("@PSTR", pstr, true);
			cmd.addParameter("@P_PRE_STR", NString.class);
			cmd.addParameter("@P_PST_STR", NString.class);
				
			cmd.execute();
			pstr.val = cmd.getParameterValue("@PSTR", NString.class);
			pPreStr.val = cmd.getParameterValue("@P_PRE_STR", NString.class);
			pPstStr.val = cmd.getParameterValue("@P_PST_STR", NString.class);


		}
		
		public static NNumber Fminordiff(NString pstring1,NString pstring2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.MINORDIFF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PSTRING1", pstring1);
			cmd.addParameter("@PSTRING2", pstring2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fsearch(NString pPtopt,NString ftgLangCodeTgt,NNumber ftgParentType,NString ftgParentName,NNumber ftgObjectType,NString ftgObjectName,NNumber ftgObjectProp,NString pSrcStr,NString pMatchCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTOPT", pPtopt);
			cmd.addParameter("@FTG_LANG_CODE_TGT", ftgLangCodeTgt);
			cmd.addParameter("@FTG_PARENT_TYPE", ftgParentType);
			cmd.addParameter("@FTG_PARENT_NAME", ftgParentName);
			cmd.addParameter("@FTG_OBJECT_TYPE", ftgObjectType);
			cmd.addParameter("@FTG_OBJECT_NAME", ftgObjectName);
			cmd.addParameter("@FTG_OBJECT_PROP", ftgObjectProp);
			cmd.addParameter("@P_SRC_STR", pSrcStr);
			cmd.addParameter("@P_MATCH_CASE", pMatchCase);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void setAttribute(Ref<NString> pA,NString pName,NNumber pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_A", pA, true);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();
			pA.val = cmd.getParameterValue("@P_A", NString.class);


		}
		
		public static void setAttribute(Ref<NString> pA,NString pName,NString pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SET_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_A", pA, true);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();
			pA.val = cmd.getParameterValue("@P_A", NString.class);


		}
		
		public static void setcontext(NString pprojectCode,NString plangCodeSrc,NString plangCodeTgt,NString pmoduleType,NString pmoduleName,NNumber pnewts,NString paction,NString pactor,NString ppkmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SETCONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROJECT_CODE", pprojectCode);
			cmd.addParameter("@PLANG_CODE_SRC", plangCodeSrc);
			cmd.addParameter("@PLANG_CODE_TGT", plangCodeTgt);
			cmd.addParameter("@PMODULE_TYPE", pmoduleType);
			cmd.addParameter("@PMODULE_NAME", pmoduleName);
			cmd.addParameter("@PNEWTS", pnewts);
			cmd.addParameter("@PACTION", paction);
			cmd.addParameter("@PACTOR", pactor);
			cmd.addParameter("@PPKMODE", ppkmode);
				
			cmd.execute();


		}
		
		public static NString Fsetgetpropstring(NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName,NNumber pobjectProp,Ref<NNumber> ptranslStat,Ref<NString> ppropString,NString pcontextType,NString pcontext,NString pobjectNameOld,NString pattributes,NNumber pmaxLen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SETGETPROPSTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
			cmd.addParameter("@POBJECT_PROP", pobjectProp);
			cmd.addParameter("@PTRANSL_STAT", ptranslStat, true);
			cmd.addParameter("@PPROP_STRING", ppropString, true);
			cmd.addParameter("@PCONTEXT_TYPE", pcontextType);
			cmd.addParameter("@PCONTEXT", pcontext);
			cmd.addParameter("@POBJECT_NAME_OLD", pobjectNameOld);
			cmd.addParameter("@PATTRIBUTES", pattributes);
			cmd.addParameter("@PMAX_LEN", pmaxLen);
				
			cmd.execute();
			ptranslStat.val = cmd.getParameterValue("@PTRANSL_STAT", NNumber.class);
			ppropString.val = cmd.getParameterValue("@PPROP_STRING", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fsetpropstring(NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName,NNumber pobjectProp,Ref<NNumber> ptranslStat,NString ppropString,NString pcontextType,NString pcontext,NString pobjectNameOld,NString pattributes,NNumber pmaxLen,NNumber psourcestat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SETPROPSTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
			cmd.addParameter("@POBJECT_PROP", pobjectProp);
			cmd.addParameter("@PTRANSL_STAT", ptranslStat, true);
			cmd.addParameter("@PPROP_STRING", ppropString);
			cmd.addParameter("@PCONTEXT_TYPE", pcontextType);
			cmd.addParameter("@PCONTEXT", pcontext);
			cmd.addParameter("@POBJECT_NAME_OLD", pobjectNameOld);
			cmd.addParameter("@PATTRIBUTES", pattributes);
			cmd.addParameter("@PMAX_LEN", pmaxLen);
			cmd.addParameter("@PSOURCESTAT", psourcestat);
				
			cmd.execute();
			ptranslStat.val = cmd.getParameterValue("@PTRANSL_STAT", NNumber.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fsetpropstringx(NString plangCode,NNumber pparentType,NString pparentName,NNumber pobjectType,NString pobjectName,NNumber pobjectProp,Ref<NNumber> ptranslStat,NString ppropString,NString pcontextType,NString pcontext,NString pobjectNameOld,NString pattributes,NNumber pmaxLen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_OBJIF.SETPROPSTRINGX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PPARENT_TYPE", pparentType);
			cmd.addParameter("@PPARENT_NAME", pparentName);
			cmd.addParameter("@POBJECT_TYPE", pobjectType);
			cmd.addParameter("@POBJECT_NAME", pobjectName);
			cmd.addParameter("@POBJECT_PROP", pobjectProp);
			cmd.addParameter("@PTRANSL_STAT", ptranslStat, true);
			cmd.addParameter("@PPROP_STRING", ppropString);
			cmd.addParameter("@PCONTEXT_TYPE", pcontextType);
			cmd.addParameter("@PCONTEXT", pcontext);
			cmd.addParameter("@POBJECT_NAME_OLD", pobjectNameOld);
			cmd.addParameter("@PATTRIBUTES", pattributes);
			cmd.addParameter("@PMAX_LEN", pmaxLen);
				
			cmd.execute();
			ptranslStat.val = cmd.getParameterValue("@PTRANSL_STAT", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
