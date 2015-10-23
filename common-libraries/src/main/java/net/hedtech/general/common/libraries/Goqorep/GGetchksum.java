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


public class GGetchksum extends AbstractSupportCodeObject {
	

	public GGetchksum(ISupportCodeContainer container) {
		super(container);
		
		//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
		//
//					try
//					{
//						// 
//						//  This is the private body code for GETCHKSUM. It executes only one
//						//  time, the first time getrepchksum is called. After that, only the code
//						//  in getrepchksum executes.
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
//						//  Note: The function name (eg. gen_checksum) IS case sensitve in Win32
//						//  ============================================================================
//						ffiInd = toInt(3);
//						// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin21".
//						//				funcHndl = SupportClasses.ORA_FFI.RegisterFunction(libHndl, "gen_checksum", OraFfi.cStd);
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
//							message(GNls.Fget(toStr("GOQOREP-0013"), toStr("LIB"), toStr("*ERROR* 1 In GETCHKSUM package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(2) ) {
//							message(GNls.Fget(toStr("GOQOREP-0014"), toStr("LIB"), toStr("*ERROR* 2 In GETCHKSUM package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(3) ) {
//							message(GNls.Fget(toStr("GOQOREP-0015"), toStr("LIB"), toStr("*ERROR* 3 In GETCHKSUM package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(4) ) {
//							message(GNls.Fget(toStr("GOQOREP-0016"), toStr("LIB"), toStr("*ERROR* 4 In GETCHKSUM package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else if ( ffiInd.equals(5) ) {
//							message(GNls.Fget(toStr("GOQOREP-0017"), toStr("LIB"), toStr("*ERROR* 5 In GETCHKSUM package body")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//						else {
//							message(GNls.Fget(toStr("GOQOREP-0018"), toStr("LIB"), toStr("*ERROR* An un-forseen error has occurred in the GETCHKSUM pkg")));
//							// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//							//					SupportClasses.SQLFORMS.Bell();
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//							
//							throw new ApplicationException();
//						}
//					}
		//
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GETCHKSUM
	/*
	PACKAGE G$_GETCHKSUM IS
      FUNCTION GETREPCHKSUM( rep_name  IN OUT VARCHAR2,
                             check_sum IN OUT VARCHAR2 )
               RETURN PLS_INTEGER;  
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GETCHKSUM
		/*
		PACKAGE BODY G$_GETCHKSUM IS
  lib_hndl  ORA_FFI.LIBHANDLETYPE;
  func_hndl ORA_FFI.FUNCHANDLETYPE;
  ffi_ind   PLS_INTEGER;

-- Note that we always pass a function handle in as the first parameter
-- ============================================================================

  FUNCTION i_getrepchksum( func_hndl IN     ORA_FFI.FUNCHANDLETYPE,
                           rep_name  IN OUT VARCHAR2,
                           check_sum IN OUT VARCHAR2 )
           RETURN PLS_INTEGER;

-- This pragma is identical (except the function name)
-- for all ORA_FFI functions
-- ============================================================================

  PRAGMA INTERFACE(C,i_getrepchksum,11265);

  FUNCTION getrepchksum( rep_name  IN OUT VARCHAR2,
                         check_sum IN OUT VARCHAR2 )
           RETURN PLS_INTEGER
  IS
    rc       PLS_INTEGER;
  BEGIN
    rc  := i_getrepchksum(func_hndl, rep_name, check_sum);
    RETURN (rc);
  END ;

BEGIN
--
-- This is the private body code for GETCHKSUM. It executes only one
-- time, the first time getrepchksum is called. After that, only the code
-- in getrepchksum executes.
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
-- Note: The function name (eg. gen_checksum) IS case sensitve in Win32
-- ============================================================================
  ffi_ind := 3;
  func_hndl := ORA_FFI.REGISTER_FUNCTION(lib_hndl,'gen_checksum',ORA_FFI.C_STD);

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
        MESSAGE( G$_NLS.Get('GOQOREP-0013', 'LIB','*ERROR* 1 In GETCHKSUM package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 2 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0014', 'LIB','*ERROR* 2 In GETCHKSUM package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 3 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0015', 'LIB','*ERROR* 3 In GETCHKSUM package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 4 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0016', 'LIB','*ERROR* 4 In GETCHKSUM package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSIF ffi_ind = 5 THEN
        MESSAGE( G$_NLS.Get('GOQOREP-0017', 'LIB','*ERROR* 5 In GETCHKSUM package body') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      ELSE
        MESSAGE( G$_NLS.Get('GOQOREP-0018', 'LIB','*ERROR* An un-forseen error has occurred in the GETCHKSUM pkg') );
        BELL;
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
END;
		*/
				private UnknownTypes.OraFfiLibhandletype libHndl= null;
		private UnknownTypes.OraFfiFunchandletype funcHndl= null;
		private NInteger ffiInd= NInteger.getNull();
/* <p>
		*  Note that we always pass a function handle in as the first parameter
		*  ============================================================================
/* </p>
		* @param repName
		* @param checkSum
		*/
		public NInteger IGetrepchksum(Ref<NString> repName, Ref<NString> checkSum)
		{
			this.getLogger().trace(this, "F2J : IGetrepchksum function is a wrapper to an external function unknown defined in the external dll unknown. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param repName
		* @param checkSum
		*/
		public NInteger getrepchksum(Ref<NString> repName, Ref<NString> checkSum)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger rc= NInteger.getNull();
//			rc = iGetrepchksum(repName.val, checkSum.val);
//			return ((rc));
//
			this.getLogger().trace(this, "F2J : getrepchksum function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
		
		
	
	
}
