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


public class GDllHandle extends AbstractSupportCodeObject {
	

	public GDllHandle(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_DLL_HANDLE
	/*
	PACKAGE G$_DLL_HANDLE IS
--
-- Handles basic operations with dll.
--
-- Dll file has to be in one of the directoies specified in Forms45_Path or Oracle_Path
-- or the same directory as a called form.
--
-- Procedure Unload_Library(dll_name.dll) called to release dll.
--
-- Error_Handle provides easy interface to Tool_Err error messages and can be called
-- in exception to check the error.
--
-- Developed with Forms4.5.7.1.6
--
-- E.T 12/07/1997 - Genesis
-- TAM 01/08/1999 - Extracted from dll_handle in guagmnu form to support
--                  Oracle Reports execution.
--
   PROCEDURE PRELOAD(dll_name_in  VARCHAR2);
   PROCEDURE ERROR_HANDLE;
   PROCEDURE UNLOAD_LIBRARY(dll_name_in VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_DLL_HANDLE
		/*
		PACKAGE BODY G$_DLL_HANDLE IS
   dll_name     VARCHAR2(50);
   dll_handle   ORA_FFI.LIBHANDLETYPE;
   v_opsys      VARCHAR2(50) := GET_APPLICATION_PROPERTY(USER_INTERFACE); 
   v_path       VARCHAR2(250);

   PROCEDURE init;
-- ---------------------------------------
   PROCEDURE PRELOAD(dll_name_in VARCHAR2) IS
   BEGIN
-- store the last loaded dll in the dll_name global variable.
      dll_name := dll_name_in;
      IF  v_opsys = 'MSWINDOWS' 
       OR v_opsys = 'MSWINDOWS32'
       OR v_opsys = 'WEB'
      THEN
         dll_handle := ORA_FFI.FIND_LIBRARY(dll_name);
         IF ORA_FFI.IS_NULL_PTR(dll_handle) THEN
            init;
         END IF;
      ELSE
         RETURN;
      END IF;
   EXCEPTION
      WHEN ORA_FFI.FFI_ERROR THEN 
           init;
   END PRELOAD;
-- ---------------------------------------
   PROCEDURE ERROR_HANDLE IS
   BEGIN
      FOR i IN 1..TOOL_ERR.NERRORS LOOP
         MESSAGE('*Error* DLL_Handle '||TOOL_ERR.MESSAGE);
--       PAUSE;
         TOOL_ERR.POP;
      END LOOP;
   END ERROR_HANDLE;

-- ---------------------------------------
   PROCEDURE UNLOAD_LIBRARY(dll_name_in VARCHAR2) IS
   BEGIN
      dll_handle := ora_ffi.find_library(dll_name_in);
      ORA_FFI.UNLOAD_LIBRARY(dll_handle);
--   EXCEPTION 
--      WHEN ora_ffi.FFI_ERROR THEN null;
   END UNLOAD_LIBRARY;
---------------------------------------- 
   PROCEDURE init IS 
      boolfound   BOOLEAN := FALSE;
      icount      PLS_INTEGER;
   BEGIN
      BEGIN 
         dll_handle := ORA_FFI.LOAD_LIBRARY(v_path,dll_name);
         IF NOT ORA_FFI.IS_NULL_PTR(dll_handle) THEN
            boolfound := TRUE;
         END IF;
      EXCEPTION 
         WHEN ora_ffi.FFI_ERROR THEN
              boolfound := FALSE;
         WHEN OTHERS THEN
              RAISE;
      END;
-- Check to see if we have it, if not have a look down all the 
-- possible paths 
      IF NOT boolfound THEN 
         FOR icount in 1..G$_PATHFINDER.POSSIBLEPATHS LOOP
            BEGIN 
               v_path := G$_PATHFINDER.GETPATHSTRING(icount);
               dll_handle := ORA_FFI.LOAD_LIBRARY(v_path,dll_name);
               IF NOT ORA_FFI.IS_NULL_PTR(dll_handle) THEN
                  boolfound := TRUE;
                  EXIT;
               END IF;
            EXCEPTION 
               WHEN ORA_FFI.FFI_ERROR THEN
                    boolfound := FALSE;
               WHEN OTHERS THEN
                    RAISE;
            END;
         END LOOP;
      END IF;

      IF NOT boolfound THEN 
         message( G$_NLS.Get('GOQOREP-0012', 'LIB',
	'*ERROR* Cannot locate %01%', dll_name));
      END IF;
   END INIT;
END;
		*/
		private NString dllName= NString.getNull();
		private UnknownTypes.OraFfiLibhandletype dllHandle= null;
		private NString vOpsys = getUserInterface();
		private NString vPath= NString.getNull();
/* <p>
		*  ---------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dllNameIn
		*/
		public void preload(NString dllNameIn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				//  store the last loaded dll in the dll_name global variable.
//				dllName = dllNameIn;
//				if ( vOpsys.equals("MSWINDOWS") || vOpsys.equals("MSWINDOWS32") || vOpsys.equals("WEB") )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin24".
//					//					dllHandle = SupportClasses.ORA_FFI.FindLibrary(dllName);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin24'.");
//					
//					if ( SupportClasses.ORA_FFI.IsNullPtr(dllHandle).getValue() )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						init();
//					}
//				}
//				else {
//					return ;
//				}
//			}
//			catch(Exception e)
//			{
//				init();
//			}
//
			this.getLogger().trace(this, "F2J : preload procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  ---------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void errorHandle()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			for ( int i = 1; i <= SupportClasses.TOOL_ERR.Nerrors(); i++ )
//			{
//				message(toStr("*Error* DLL_Handle ").append(message()));
//				//        PAUSE;
//				// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin25".
//				//				SupportClasses.TOOL_ERR.Pop();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin25'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : errorHandle procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  ---------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dllNameIn
		*/
		public void unloadLibrary(NString dllNameIn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//			//			dllHandle = SupportClasses.ORA_FFI.FindLibrary(dllNameIn);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//			
//			ORA_FFI.UNLOAD_LIBRARY(dllHandle);
//
			this.getLogger().trace(this, "F2J : unloadLibrary procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* -------------------------------------- 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void init()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NBool boolfound = toBool(NBool.False);
//			NInteger icount= NInteger.getNull();
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "LOAD_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin26".
//				//				dllHandle = SupportClasses.ORA_FFI.LoadLibrary(vPath, dllName);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LOAD_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin26'.");
//				
//				if ( SupportClasses.ORA_FFI.IsNullPtr(dllHandle).not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					boolfound = toBool(NBool.True);
//				}
//			}
//			catch(Exception e)
//			{
//				boolfound = toBool(NBool.False);
//			}
//			catch(Exception  e)
//			{
//				throw  e;
//			}
//			//  Check to see if we have it, if not have a look down all the 
//			//  possible paths 
//			if ( boolfound.not() )
//			{
//				for ( icount = 1; icount <= getContainer().getGPathfinder().possiblepaths; icount+= 1 )
//				{
//					try
//					{
//						vPath = getContainer().getGPathfinder().getpathstring(icount);
//						// F2J_NOT_SUPPORTED : Call to built-in "LOAD_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin26".
//						//						dllHandle = SupportClasses.ORA_FFI.LoadLibrary(vPath, dllName);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LOAD_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin26'.");
//						
//						if ( SupportClasses.ORA_FFI.IsNullPtr(dllHandle).not() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							boolfound = toBool(NBool.True);
//								break;
//						}
//					}
//					catch(Exception e)
//					{
//						boolfound = toBool(NBool.False);
//					}
//					catch(Exception  e)
//					{
//						throw  e;
//					}
//				}
//			}
//			if ( boolfound.not() )
//			{
//				message(GNls.Fget(toStr("GOQOREP-0012"), toStr("LIB"), toStr("*ERROR* Cannot locate %01%"), dllName));
//			}
//
			this.getLogger().trace(this, "F2J : init procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
