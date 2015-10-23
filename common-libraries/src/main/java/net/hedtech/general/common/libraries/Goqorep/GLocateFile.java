package net.hedtech.general.common.libraries.Goqorep;

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


public class GLocateFile extends AbstractSupportCodeObject {
	

	public GLocateFile(ISupportCodeContainer container) {
		super(container);
		//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
		//
//					try
//					{
//						// 
//						//  This is the private body code for locate_file. It executes only one
//						//  time, the first time find_file is called. After that, only the code
//						//  in find_file executes.
//						// 
//						//  Load the library ... like WinAPI LoadLibrary(). DLL_HANDLE will load
//						//  the dll if it's not currently loaded.
//						//  ============================================================================
//						ffiInd = toInt(1);
//						getContainer().getGDllHandle().preload(toStr("BANFW32.DLL"));
//						//  Find the handle to the library.
//						//  ============================================================================
//						ffiInd = toInt(2);
//						// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//						//				libHndl = SupportClasses.ORA_FFI.FindLibrary("BANFW32.DLL");
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//						
//						//  Register the target function ... like WinAPI GetProcAddress()
//						//  Note: The function name (eg. does_file_exist) IS case sensitve in Win32
//						//  ============================================================================
//						ffiInd = toInt(3);
//						// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin21".
//						//				funcHndl = SupportClasses.ORA_FFI.RegisterFunction(libHndl, "does_file_exist", OraFfi.cStd);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin21'.");
//						
//						//  Denote the parameter list
//						//  ============================================================================
//						ffiInd = toInt(4);
//						// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin22".
//						//				SupportClasses.ORA_FFI.RegisterParameter(funcHndl, OraFfi.cCharPtr);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin22'.");
//						
//						// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin22".
//						//				SupportClasses.ORA_FFI.RegisterParameter(funcHndl, OraFfi.cCharPtr);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin22'.");
//						
//						//  Denote the return value
//						//  ============================================================================
//						ffiInd = toInt(5);
//						// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin23".
//						//				SupportClasses.ORA_FFI.RegisterReturn(funcHndl, OraFfi.cInt);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin23'.");
//						
//					}
//					catch(Exception  e)
//					{
//						if ( ffiInd.equals(1) )
//						{
//							message(GNls.Fget(toStr("GOQOREP-0022"), toStr("LIB"), toStr("*ERROR* 1 In LOCATE_FILE package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(2) ) {
//							message(GNls.Fget(toStr("GOQOREP-0023"), toStr("LIB"), toStr("*ERROR* 2 In LOCATE_FILE package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(3) ) {
//							message(GNls.Fget(toStr("GOQOREP-0024"), toStr("LIB"), toStr("*ERROR* 3 In LOCATE_FILE package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(4) ) {
//							message(GNls.Fget(toStr("GOQOREP-0025"), toStr("LIB"), toStr("*ERROR* 4 In LOCATE_FILE package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(5) ) {
//							message(GNls.Fget(toStr("GOQOREP-0026"), toStr("LIB"), toStr("*ERROR* 5 In LOCATE_FILE package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else {
//							message(GNls.Fget(toStr("GOQOREP-0027"), toStr("LIB"), toStr("*ERROR* An un-forseen error has occurred in the LOCATE_FILE pkg")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//					}
		//
					this.getLogger().trace(this, "F2J : GLocateFile Constructor is not completely migrated yet. Please read the Migration Guide.");
					
					
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_LOCATE_FILE
	/*
	PACKAGE G$_LOCATE_FILE IS
  FUNCTION FIND_FILE( WHAT_FILE IN OUT VARCHAR2,
                      WHAT_PATH IN OUT VARCHAR2)
           RETURN PLS_INTEGER;  
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_LOCATE_FILE
		/*
		PACKAGE BODY G$_LOCATE_FILE IS
  lib_hndl    ORA_FFI.LIBHANDLETYPE;
  func_hndl   ORA_FFI.FUNCHANDLETYPE;
  boolfound   BOOLEAN := FALSE;
  icount      PLS_INTEGER;
  v_path      VARCHAR2(250);
  ffi_ind     PLS_INTEGER;

-- Note that we always pass a function handle in as the first parameter
-- ============================================================================

  FUNCTION i_does_file_exist( func_hndl IN     ORA_FFI.FUNCHANDLETYPE,
                              what_file IN OUT VARCHAR2,
                              what_path IN OUT VARCHAR2 )
           RETURN PLS_INTEGER;

-- This pragma is identical (except the function name)
-- for all ORA_FFI functions
-- ============================================================================

  PRAGMA INTERFACE(C,i_does_file_exist,11265);

  FUNCTION FIND_FILE( what_file IN OUT VARCHAR2,
                      what_path IN OUT VARCHAR2)
           RETURN PLS_INTEGER
  IS
    rc PLS_INTEGER;
  BEGIN

-- Make sure the library is loaded and the function registered.
-- ============================================================================
     BEGIN
        ffi_ind := 1;
        lib_hndl := ora_ffi.find_library('BANFW32.DLL');
        ffi_ind := 2;
        func_hndl := ORA_FFI.FIND_FUNCTION(lib_hndl,'does_file_exist');

     EXCEPTION
-- There's no elegant way to handle errors from ora_ffi. So just give enough
-- to point a developer to what function caused the error.
-- ============================================================================
     WHEN OTHERS THEN
        IF ffi_ind = 1 THEN
           MESSAGE( G$_NLS.Get('GOQOREP-0019', 'LIB','*ERROR* 1.1 In LOCATE_FILE package body') );
           BELL;
           RAISE FORM_TRIGGER_FAILURE;
        ELSIF ffi_ind = 2 THEN
           MESSAGE( G$_NLS.Get('GOQOREP-0020', 'LIB','*ERROR* 2.2 In LOCATE_FILE package body') );
           BELL;
           RAISE FORM_TRIGGER_FAILURE;
        ELSE
           MESSAGE( G$_NLS.Get('GOQOREP-0021', 'LIB','*ERROR* An un-forseen error has occurred in the LOCATE_FILE pkg') );
           BELL;
           RAISE FORM_TRIGGER_FAILURE;
        END IF;
     END;

-- PATHFINDER.POSSIBLEPATHS returns the individual directory components of a path.
-- The path used is hardcoded in that package. So what happens here is we call the
-- does_file_exist function in banfw32.dll to see if "what_file" is found at
-- "what_path" location.
-- ============================================================================
     boolfound := FALSE;
     FOR icount IN 1..G$_PATHFINDER.POSSIBLEPATHS LOOP
        BEGIN
           v_path := G$_PATHFINDER.GETPATHSTRING(icount);
           rc  := i_does_file_exist(func_hndl, what_file, v_path);
           IF rc = 0 THEN
              boolfound := TRUE;
              what_path := v_path;
              EXIT;
           END IF;
        END;
     END LOOP;

     IF NOT boolfound THEN
        rc := 1;
     END IF;

     RETURN (rc);

  END FIND_FILE;

BEGIN
--
-- This is the private body code for locate_file. It executes only one
-- time, the first time find_file is called. After that, only the code
-- in find_file executes.
--
-- Load the library ... like WinAPI LoadLibrary(). DLL_HANDLE will load
-- the dll if it's not currently loaded.
-- ============================================================================
  ffi_ind := 1;
  G$_DLL_HANDLE.PRELOAD('BANFW32.DLL');

-- Find the handle to the library.
-- ============================================================================
  ffi_ind := 2;
  lib_hndl := ora_ffi.find_library('BANFW32.DLL');

-- Register the target function ... like WinAPI GetProcAddress()
-- Note: The function name (eg. does_file_exist) IS case sensitve in Win32
-- ============================================================================
  ffi_ind := 3;
  func_hndl := ORA_FFI.REGISTER_FUNCTION(lib_hndl,'does_file_exist',ORA_FFI.C_STD);

-- Denote the parameter list
-- ============================================================================
  ffi_ind := 4;
  ORA_FFI.REGISTER_PARAMETER(func_hndl,ORA_FFI.C_CHAR_PTR);
  ORA_FFI.REGISTER_PARAMETER(func_hndl,ORA_FFI.C_CHAR_PTR);

-- Denote the return value
-- ============================================================================
  ffi_ind := 5;
  ORA_FFI.REGISTER_RETURN(func_hndl,ORA_FFI.C_INT);

 EXCEPTION
-- There's no elegant way to handle errors from ora_ffi. So just give enough
-- to point a developer to what function caused the error.
-- ============================================================================
   WHEN OTHERS THEN
      IF ffi_ind = 1 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0022', 'LIB','*ERROR* 1 In LOCATE_FILE package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 2 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0023', 'LIB','*ERROR* 2 In LOCATE_FILE package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 3 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0024', 'LIB','*ERROR* 3 In LOCATE_FILE package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 4 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0025', 'LIB','*ERROR* 4 In LOCATE_FILE package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 5 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0026', 'LIB','*ERROR* 5 In LOCATE_FILE package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSE
        MESSAGE( G$_NLS.Get('GOQOREP-0027', 'LIB','*ERROR* An un-forseen error has occurred in the LOCATE_FILE pkg') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
END;
		*/
				private UnknownTypes.OraFfiLibhandletype libHndl= null;
		private UnknownTypes.OraFfiFunchandletype funcHndl= null;
		private NBool boolfound = toBool(NBool.False);
		private NInteger icount= NInteger.getNull();
		private NString vPath= NString.getNull();
		private NInteger ffiInd= NInteger.getNull();
/* <p>
		*  Note that we always pass a function handle in as the first parameter
		*  ============================================================================
/* </p>
		* @param whatFile
		* @param whatPath
		*/
		public NInteger IDoesFileExist(Ref<NString> whatFile, Ref<NString> whatPath)
		{
			this.getLogger().trace(this, "F2J : IDoesFileExist function is a wrapper to an external function unknown defined in the external dll unknown. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param whatFile
		* @param whatPath
		*/
		public NInteger findFile(Ref<NString> whatFile, Ref<NString> whatPath)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger rc= NInteger.getNull();
//			try
//			{
//				ffiInd = toInt(1);
//				// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				libHndl = SupportClasses.ORA_FFI.FindLibrary("BANFW32.DLL");
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				ffiInd = toInt(2);
//				// F2J_NOT_SUPPORTED : Call to built-in "FIND_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
//				//				funcHndl = SupportClasses.ORA_FFI.FindFunction(libHndl, "does_file_exist");
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
//				
//			}
//			catch(Exception  e)
//			{
//				if ( ffiInd.equals(1) )
//				{
//					message(GNls.Fget(toStr("GOQOREP-0019"), toStr("LIB"), toStr("*ERROR* 1.1 In LOCATE_FILE package body")));
//					// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//					//					SupportClasses.SQLFORMS.Bell();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//					
//					throw new ApplicationException();
//				}
//				else if ( ffiInd.equals(2) ) {
//					message(GNls.Fget(toStr("GOQOREP-0020"), toStr("LIB"), toStr("*ERROR* 2.2 In LOCATE_FILE package body")));
//					// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//					//					SupportClasses.SQLFORMS.Bell();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//					
//					throw new ApplicationException();
//				}
//				else {
//					message(GNls.Fget(toStr("GOQOREP-0021"), toStr("LIB"), toStr("*ERROR* An un-forseen error has occurred in the LOCATE_FILE pkg")));
//					// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//					//					SupportClasses.SQLFORMS.Bell();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//					
//					throw new ApplicationException();
//				}
//			}
//			//  PATHFINDER.POSSIBLEPATHS returns the individual directory components of a path.
//			//  The path used is hardcoded in that package. So what happens here is we call the
//			//  does_file_exist function in banfw32.dll to see if "what_file" is found at
//			//  "what_path" location.
//			//  ============================================================================
//			boolfound = toBool(NBool.False);
//			for ( icount = 1; icount <= getContainer().getGPathfinder().possiblepaths; icount+= 1 )
//			{
//				vPath = getContainer().getGPathfinder().getpathstring(icount);
//				rc = iDoesFileExist(whatFile.val, whatPath_ref);
//				if ( rc.equals(0) )
//				{
//					boolfound = toBool(NBool.True);
//					whatPath.val = vPath;
//						break;
//				}
//			}
//			if ( boolfound.not() )
//			{
//				rc = toInt(1);
//			}
//			return ((rc));
//
			this.getLogger().trace(this, "F2J : findFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
		
		
	
	
}
