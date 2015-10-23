package net.hedtech.general.common.libraries.Webutil;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;


public class JavaAppservWriter extends AbstractSupportCodeObject {
	

	public JavaAppservWriter(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) JAVA_APPSERV_WRITER
	/*
	PACKAGE JAVA_APPSERV_WRITER <multilinecomment> oracle.forms.webutil.fileTransfer.AppServerFileWriter </multilinecomment> IS

  -- 
  -- DO NOT EDIT THIS FILE - it is machine generated!
  -- 


  -- Constructor for signature ()V
  FUNCTION new RETURN ORA_JAVA.JOBJECT;

  -- Method: openFile (Ljava/lang/String;)Z
  FUNCTION openFile(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN;

  -- Method: WriteData (Ljava/lang/String;)Z
  FUNCTION WriteData(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN;

  -- Method: closeFile (I)Z
  FUNCTION closeFile(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER) RETURN BOOLEAN;

  -- Method: getLastError ()I
  FUNCTION getLastError(
    obj   ORA_JAVA.JOBJECT) RETURN NUMBER;

  -- Method: getLastErrorArgs ()Ljava/lang/String;
  FUNCTION getLastErrorArgs(
    obj   ORA_JAVA.JOBJECT) RETURN VARCHAR2;

  -- Method: decodeBASE64File (Ljava/lang/String;)Z
  FUNCTION decodeBASE64File(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN;

  -- Method: hashCode ()I
  FUNCTION hashCode(
    obj   ORA_JAVA.JOBJECT) RETURN NUMBER;

  -- Method: getClass ()Ljava/lang/Class;
  FUNCTION getClass(
    obj   ORA_JAVA.JOBJECT) RETURN ORA_JAVA.JOBJECT;

  -- Method: wait (JI)V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER,
    a1    NUMBER);

  -- Method: wait ()V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT);

  -- Method: wait (J)V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER);

  -- Method: equals (Ljava/lang/Object;)Z
  FUNCTION equals(
    obj   ORA_JAVA.JOBJECT,
    a0    ORA_JAVA.JOBJECT) RETURN BOOLEAN;

  -- Method: notify ()V
  PROCEDURE notify(
    obj   ORA_JAVA.JOBJECT);

  -- Method: notifyAll ()V
  PROCEDURE notifyAll(
    obj   ORA_JAVA.JOBJECT);

  -- Method: toString ()Ljava/lang/String;
  FUNCTION toString(
    obj   ORA_JAVA.JOBJECT) RETURN VARCHAR2;

END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) JAVA_APPSERV_WRITER
		/*
		PACKAGE BODY JAVA_APPSERV_WRITER IS

  -- 
  -- DO NOT EDIT THIS FILE - it is machine generated!
  -- 

  args   JNI.ARGLIST;

  -- Constructor for signature ()V
  FUNCTION new RETURN ORA_JAVA.JOBJECT IS
  BEGIN
    args := NULL;
    RETURN (JNI.NEW_OBJECT('oracle/forms/webutil/fileTransfer/AppServerFileWriter', '()V', args));
  END;

  -- Method: openFile (Ljava/lang/String;)Z
  FUNCTION openFile(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_STRING_ARG(args, a0);
    RETURN JNI.CALL_BOOLEAN_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'openFile', '(Ljava/lang/String;)Z', args); 
  END;

  -- Method: WriteData (Ljava/lang/String;)Z
  FUNCTION WriteData(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_STRING_ARG(args, a0);
    RETURN JNI.CALL_BOOLEAN_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'WriteData', '(Ljava/lang/String;)Z', args); 
  END;

  -- Method: closeFile (I)Z
  FUNCTION closeFile(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER) RETURN BOOLEAN IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_INT_ARG(args, a0);
    RETURN JNI.CALL_BOOLEAN_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'closeFile', '(I)Z', args); 
  END;

  -- Method: getLastError ()I
  FUNCTION getLastError(
    obj   ORA_JAVA.JOBJECT) RETURN NUMBER IS
  BEGIN
    args := NULL;
    RETURN JNI.CALL_INT_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'getLastError', '()I', args); 
  END;

  -- Method: getLastErrorArgs ()Ljava/lang/String;
  FUNCTION getLastErrorArgs(
    obj   ORA_JAVA.JOBJECT) RETURN VARCHAR2 IS
  BEGIN
    args := NULL;
    RETURN JNI.CALL_STRING_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'getLastErrorArgs', '()Ljava/lang/String;', args); 
  END;

  -- Method: decodeBASE64File (Ljava/lang/String;)Z
  FUNCTION decodeBASE64File(
    obj   ORA_JAVA.JOBJECT,
    a0    VARCHAR2) RETURN BOOLEAN IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_STRING_ARG(args, a0);
    RETURN JNI.CALL_BOOLEAN_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'decodeBASE64File', '(Ljava/lang/String;)Z', args); 
  END;

  -- Method: hashCode ()I
  FUNCTION hashCode(
    obj   ORA_JAVA.JOBJECT) RETURN NUMBER IS
  BEGIN
    args := NULL;
    RETURN JNI.CALL_INT_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'hashCode', '()I', args); 
  END;

  -- Method: getClass ()Ljava/lang/Class;
  FUNCTION getClass(
    obj   ORA_JAVA.JOBJECT) RETURN ORA_JAVA.JOBJECT IS
  BEGIN
    args := NULL;
    RETURN JNI.CALL_OBJECT_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'getClass', '()Ljava/lang/Class;', args); 
  END;

  -- Method: wait (JI)V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER,
    a1    NUMBER) IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(2);
    JNI.ADD_LONG_ARG(args, a0);
    JNI.ADD_INT_ARG(args, a1);
    JNI.CALL_VOID_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'wait', '(JI)V', args); 
  END;

  -- Method: wait ()V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT) IS
  BEGIN
    args := NULL;
    JNI.CALL_VOID_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'wait', '()V', args); 
  END;

  -- Method: wait (J)V
  PROCEDURE wait(
    obj   ORA_JAVA.JOBJECT,
    a0    NUMBER) IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_LONG_ARG(args, a0);
    JNI.CALL_VOID_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'wait', '(J)V', args); 
  END;

  -- Method: equals (Ljava/lang/Object;)Z
  FUNCTION equals(
    obj   ORA_JAVA.JOBJECT,
    a0    ORA_JAVA.JOBJECT) RETURN BOOLEAN IS
  BEGIN
    args := JNI.CREATE_ARG_LIST(1);
    JNI.ADD_OBJECT_ARG(args, a0, 'java/lang/Object');
    RETURN JNI.CALL_BOOLEAN_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'equals', '(Ljava/lang/Object;)Z', args); 
  END;

  -- Method: notify ()V
  PROCEDURE notify(
    obj   ORA_JAVA.JOBJECT) IS
  BEGIN
    args := NULL;
    JNI.CALL_VOID_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'notify', '()V', args); 
  END;

  -- Method: notifyAll ()V
  PROCEDURE notifyAll(
    obj   ORA_JAVA.JOBJECT) IS
  BEGIN
    args := NULL;
    JNI.CALL_VOID_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'notifyAll', '()V', args); 
  END;

  -- Method: toString ()Ljava/lang/String;
  FUNCTION toString(
    obj   ORA_JAVA.JOBJECT) RETURN VARCHAR2 IS
  BEGIN
    args := NULL;
    RETURN JNI.CALL_STRING_METHOD(FALSE, obj, 'oracle/forms/webutil/fileTransfer/AppServerFileWriter', 'toString', '()Ljava/lang/String;', args); 
  END;


BEGIN
  NULL;
END;
		*/
				//  
		//  DO NOT EDIT THIS FILE - it is machine generated!
		//  
		private UnknownTypes.JniArglist args= null;
/* <p>
		*  Constructor for signature ()V
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public UnknownTypes.OraJavaJobject _new()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return ((SupportClasses.JNI.NewObject("oracle/forms/webutil/fileTransfer/AppServerFileWriter", "()V", args)));
//
			this.getLogger().trace(this, "F2J : _new function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Method: openFile (Ljava/lang/String;)Z
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public NBool openfile(UnknownTypes.OraJavaJobject obj, NString a0)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_STRING_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10".
//			//			SupportClasses.JNI.AddStringArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_STRING_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10'.");
//			
//			return SupportClasses.JNI.CallBooleanMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "openFile", "(Ljava/lang/String;)Z", args);
//
			this.getLogger().trace(this, "F2J : openfile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Method: WriteData (Ljava/lang/String;)Z
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public NBool writedata(UnknownTypes.OraJavaJobject obj, NString a0)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_STRING_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10".
//			//			SupportClasses.JNI.AddStringArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_STRING_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10'.");
//			
//			return SupportClasses.JNI.CallBooleanMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "WriteData", "(Ljava/lang/String;)Z", args);
//
			this.getLogger().trace(this, "F2J : writedata function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Method: closeFile (I)Z
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public NBool closefile(UnknownTypes.OraJavaJobject obj, NNumber a0)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_INT_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
//			//			SupportClasses.JNI.AddIntArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_INT_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
//			
//			return SupportClasses.JNI.CallBooleanMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "closeFile", "(I)Z", args);
//
			this.getLogger().trace(this, "F2J : closefile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Method: getLastError ()I
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public NNumber getlasterror(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return SupportClasses.JNI.CallIntMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "getLastError", "()I", args);
//
			this.getLogger().trace(this, "F2J : getlasterror function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Method: getLastErrorArgs ()Ljava/lang/String;
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public NString getlasterrorargs(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return SupportClasses.JNI.CallStringMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "getLastErrorArgs", "()Ljava/lang/String;", args);
//
			this.getLogger().trace(this, "F2J : getlasterrorargs function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Method: decodeBASE64File (Ljava/lang/String;)Z
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public NBool decodebase64file(UnknownTypes.OraJavaJobject obj, NString a0)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_STRING_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10".
//			//			SupportClasses.JNI.AddStringArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_STRING_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin10'.");
//			
//			return SupportClasses.JNI.CallBooleanMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "decodeBASE64File", "(Ljava/lang/String;)Z", args);
//
			this.getLogger().trace(this, "F2J : decodebase64file function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Method: hashCode ()I
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public NNumber hashcode(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return SupportClasses.JNI.CallIntMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "hashCode", "()I", args);
//
			this.getLogger().trace(this, "F2J : hashcode function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Method: getClass ()Ljava/lang/Class;
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public UnknownTypes.OraJavaJobject getclass(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return SupportClasses.JNI.CallObjectMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "getClass", "()Ljava/lang/Class;", args);
//
			this.getLogger().trace(this, "F2J : getclass function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Method: wait (JI)V
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		* @param a1
		*/
		public void wait(UnknownTypes.OraJavaJobject obj, NNumber a0, NNumber a1)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(2);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_LONG_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin11".
//			//			SupportClasses.JNI.AddLongArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_LONG_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin11'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_INT_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
//			//			SupportClasses.JNI.AddIntArg(args, a1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_INT_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "CALL_VOID_METHOD" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.JNI.CallVoidMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "wait", "(JI)V", args);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CALL_VOID_METHOD' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//
			this.getLogger().trace(this, "F2J : wait procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Method: wait ()V
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public void wait(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			// F2J_NOT_SUPPORTED : Call to built-in "CALL_VOID_METHOD" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.JNI.CallVoidMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "wait", "()V", args);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CALL_VOID_METHOD' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//
			this.getLogger().trace(this, "F2J : wait procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Method: wait (J)V
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public void wait(UnknownTypes.OraJavaJobject obj, NNumber a0)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_LONG_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin11".
//			//			SupportClasses.JNI.AddLongArg(args, a0);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_LONG_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin11'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "CALL_VOID_METHOD" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.JNI.CallVoidMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "wait", "(J)V", args);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CALL_VOID_METHOD' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//
			this.getLogger().trace(this, "F2J : wait procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Method: equals (Ljava/lang/Object;)Z
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		* @param a0
		*/
		public NBool equals(UnknownTypes.OraJavaJobject obj, UnknownTypes.OraJavaJobject a0)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "CREATE_ARG_LIST" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			args = SupportClasses.JNI.CreateArgList(1);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_ARG_LIST' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "ADD_OBJECT_ARG" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
//			//			SupportClasses.JNI.AddObjectArg(args, a0, "java/lang/Object");
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'ADD_OBJECT_ARG' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
//			
//			return SupportClasses.JNI.CallBooleanMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "equals", "(Ljava/lang/Object;)Z", args);
//
			this.getLogger().trace(this, "F2J : equals function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Method: notify ()V
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public void notify(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			// F2J_NOT_SUPPORTED : Call to built-in "CALL_VOID_METHOD" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.JNI.CallVoidMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "notify", "()V", args);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CALL_VOID_METHOD' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//
			this.getLogger().trace(this, "F2J : notify procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Method: notifyAll ()V
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public void notifyall(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			// F2J_NOT_SUPPORTED : Call to built-in "CALL_VOID_METHOD" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.JNI.CallVoidMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "notifyAll", "()V", args);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CALL_VOID_METHOD' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//
			this.getLogger().trace(this, "F2J : notifyall procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Method: toString ()Ljava/lang/String;
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param obj
		*/
		public NString tostring(UnknownTypes.OraJavaJobject obj)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			args = null;
//			return SupportClasses.JNI.CallStringMethod(NBool.False, obj, "oracle/forms/webutil/fileTransfer/AppServerFileWriter", "toString", "()Ljava/lang/String;", args);
//
			this.getLogger().trace(this, "F2J : tostring function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		public JavaAppservWriter() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : JavaAppservWriter Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
