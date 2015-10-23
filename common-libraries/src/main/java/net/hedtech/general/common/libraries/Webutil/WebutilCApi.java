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


public class WebutilCApi extends AbstractSupportCodeObject {
	

	public WebutilCApi(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_C_API
	/*
	PACKAGE WEBUTIL_C_API IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_C_API
 *   This Package provides a way of calling C functions in a shared library on the
 *   client PC. Currently only win32 is supported.
 *   The oracle.forms.webutil.cApi.CApiFunctions bean is needed in your Form to 
 *   use these functions
 *********************************************************************************
 * Version 1.0.5
 *********************************************************************************
 * Change History
 *   1.0.1 RVSUILIC 14/FEB/2003 - Creation 
 *   1.0.2 DRMILLS  27/FEB/2003 - Reset LONG to the same value as INT which is fine
 *                                for Windows & removed Tester proc
 *   1.0.3 DRMILLS  01/MAR/2003 - Re-worked the PL/SQL API
 *   1.0.4 DRMILLS  13/MAY/2003 - Added call to WebUtil_Core.Init
 *   1.0.5 RVSUILIC 21/MAY/2003 - Cleaned up some comments and formatting.
 *
\********************************************************************************</multilinecomment>


  <multilinecomment>*
   *  Constants to represent PL/SQL IN, OUT and INOUT parameter qualifiers
   </multilinecomment>
  PARAM_IN    CONSTANT PLS_INTEGER := 50;
  PARAM_INOUT CONSTANT PLS_INTEGER := 51;
  PARAM_OUT   CONSTANT PLS_INTEGER := 52;
  

  <multilinecomment>*
   *  Constants to represent C atomic datatypes and pointers to atomic datatypes
   *  Note that to use OUT and INOUT qualifiers the C function in the DLL *must*
   *  use a pointer type to be able to pass information back.
   *
   *  The comments on the right indicate which types can be used for parameters
   *  and which for function return types.
   *
   *  c_ptr is used as a generic pointer. The onlys supported use for this is to
   *  save the pointer value from C into a PL/SQL variable, so that it may be 
   *  passed back later to C. No operations on the pointer are supported in PL/SQL.
   </multilinecomment>
  c_void          CONSTANT PLS_INTEGER := 30;            <multilinecomment> - not used -   </multilinecomment>
  c_char          CONSTANT PLS_INTEGER := 31;            <multilinecomment> param & return </multilinecomment>
  c_short         CONSTANT PLS_INTEGER := 32;            <multilinecomment> param & return </multilinecomment>
  c_int           CONSTANT PLS_INTEGER := 33;            <multilinecomment> param & return </multilinecomment>
  c_long          CONSTANT PLS_INTEGER := 33;            <multilinecomment> param & return </multilinecomment><multilinecomment>DRM - same as INT </multilinecomment>
  c_float         CONSTANT PLS_INTEGER := 35;            <multilinecomment> param & return </multilinecomment>
  c_double        CONSTANT PLS_INTEGER := 36;            <multilinecomment> param & return </multilinecomment>

  c_ptr           CONSTANT PLS_INTEGER := 64 + c_void;   <multilinecomment> param & return </multilinecomment>
  c_char_ptr      CONSTANT PLS_INTEGER := 64 + c_char;   <multilinecomment> param          </multilinecomment>
  c_short_ptr     CONSTANT PLS_INTEGER := 64 + c_short;  <multilinecomment> param          </multilinecomment>
  c_int_ptr       CONSTANT PLS_INTEGER := 64 + c_int;    <multilinecomment> param          </multilinecomment>
  c_long_ptr      CONSTANT PLS_INTEGER := 64 + c_long;   <multilinecomment> param          </multilinecomment>
  c_float_ptr     CONSTANT PLS_INTEGER := 64 + c_float;  <multilinecomment> param          </multilinecomment>
  c_double_ptr    CONSTANT PLS_INTEGER := 64 + c_double; <multilinecomment> param          </multilinecomment>


  <multilinecomment>*
   *  Abstracted types to be used for pointers and handles. The forms programmer
   *  should not attempt any manipulation on these types, but merely obtain them as
   *  a result of functions below, and pass them back in to other functions below.
   </multilinecomment>
    SUBTYPE handleType   IS NUMBER;
    TYPE Pointer         IS RECORD (hnd handleType);   <multilinecomment> C pointer             </multilinecomment>
    TYPE FunctionHandle  IS RECORD (hnd handleType);   <multilinecomment> function handle       </multilinecomment>
    TYPE ParameterHandle IS RECORD (hnd handleType);   <multilinecomment> parameter handle      </multilinecomment>
    TYPE ParameterList   IS RECORD (hnd handleType);   <multilinecomment> parameter list handle </multilinecomment>


  <multilinecomment>*
   *  IS_SUPPORTED - Check if the client is on a supported hardware platform.
   </multilinecomment>
    FUNCTION IS_SUPPORTED RETURN BOOLEAN;

  <multilinecomment>*
   *  CREATE_PARAMETER_LIST - Create an empty Parameter list
   </multilinecomment>
    FUNCTION CREATE_PARAMETER_LIST RETURN ParameterList;

  <multilinecomment>*
   *  ADD_PARAMETER - Add parameter to a parameter list, and bind its value.
   *  Use first one if you don't want to pass any value to the OUT only param.
   *  For OUT only strings, even though we can use prototype-1, we should still
   *  prefer to use prototype-3 so as to allow the jvm to allocate memory
   *  for the string judiciously. Otherwise it will allocate max (32768).
   </multilinecomment>

  -- 1 --
  FUNCTION ADD_PARAMETER (paramList     IN ParameterList,           <multilinecomment> numeric </multilinecomment>
                          parameterType IN PLS_INTEGER, 
                          inOut         IN PLS_INTEGER := PARAM_OUT) RETURN ParameterHandle;
  -- 2 --
  FUNCTION ADD_PARAMETER (paramList     IN ParameterList,           <multilinecomment> numeric </multilinecomment>
                          parameterType IN PLS_INTEGER, 
                          inOut         IN PLS_INTEGER, 
                          num           IN NUMBER) RETURN ParameterHandle;
  -- 3 --
  FUNCTION ADD_PARAMETER (paramList     IN ParameterList,           <multilinecomment> string  </multilinecomment>
                          parameterType IN PLS_INTEGER, 
                          inOut         IN PLS_INTEGER, 
                          str           IN VARCHAR2, 
                          strmaxlen     IN PLS_INTEGER) RETURN ParameterHandle;
  -- 4 --
  FUNCTION ADD_PARAMETER (paramList     IN ParameterList,           <multilinecomment> pointer </multilinecomment>
                          parameterType IN PLS_INTEGER, 
                          inOut         IN PLS_INTEGER, 
                          ptr           IN Pointer) RETURN ParameterHandle;
                   
  <multilinecomment>*
   *  REBIND_PARAMETER - Rebind a value to an existing parameter in a parameter list.
   *  Note that the C datatype should NOT change.
   *  use prototype-1 if OUT only parameter.
   </multilinecomment>
  -- 1 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList,       <multilinecomment> numeric </multilinecomment>
                              param     IN ParameterHandle);
  -- 2 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList,       <multilinecomment> numeric </multilinecomment>
                              param     IN ParameterHandle, 
                              num       IN NUMBER);
  -- 3 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList,       <multilinecomment> string  </multilinecomment>
                              param     IN ParameterHandle, 
                              str       IN VARCHAR2, 
                              strmaxlen IN PLS_INTEGER);
  -- 4 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList,       <multilinecomment> pointer </multilinecomment>
                              param     IN ParameterHandle, 
                              ptr       IN Pointer);

  <multilinecomment>*
   *  GET_PARAMETER_<type> - Fetch the value of the parameter (after calling the 
   *  C function). VARCHAR2 parameters are restricted to 32k length.
   </multilinecomment>
  FUNCTION GET_PARAMETER_NUMBER (paramList IN ParameterList, 
                                 param     IN ParameterHandle) RETURN NUMBER;
  FUNCTION GET_PARAMETER_STRING (paramList IN ParameterList, 
                                 param     IN ParameterHandle) RETURN VARCHAR2;
  FUNCTION GET_PARAMETER_PTR    (paramList IN ParameterList, 
                                 param     IN ParameterHandle) RETURN Pointer;

  <multilinecomment>*
   *  DESTROY_PARAMETERLIST - Destroy the parameter list, including all parameters
   *  on it.
   </multilinecomment>
  PROCEDURE DESTROY_PARAMETER_LIST (paramList IN ParameterList);

  <multilinecomment>*
   *  REGISTER_FUNCTION - Register the C function and create a handle to it for future 
   *  use. If a function will be called once only, rather pass the libName and funcName
   *  through the matching INVOKE_XXX function for better performance.
   </multilinecomment>
  FUNCTION REGISTER_FUNCTION (libName  IN VARCHAR2, 
                              funcName IN VARCHAR2) RETURN FunctionHandle;

  <multilinecomment>*
   *  DEREGISTER_FUNCTION - Deregister the function.
   </multilinecomment>
  PROCEDURE DEREGISTER_FUNCTION (funcHandle IN FunctionHandle);

  <multilinecomment>*
   * INVOKE_<returntype> - Invoke the C function in the DLL
   * <returntype> matches the C return type, or is left out for
   * void functions.
   * Each function comes in two flavours:
   *  with funchandle:
   *    Uses funchandle which has previously been created by REGISTER_FUNCTION.
   *    This is good to use in an iterative situation to avoid the overhead of
   *    REGISTER/DEREGISTER each time.
   *  with libName & funcName:
   *    Good for one-off use. If will implicitly do a REGISTER/DEREGISTER of the
   *    function. It also uses less network round trips.
   </multilinecomment>
  FUNCTION INVOKE_SHORT   (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_SHORT   (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_INT     (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_INT     (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_LONG    (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_LONG    (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN PLS_INTEGER;
  FUNCTION INVOKE_CHAR    (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN CHAR;
  FUNCTION INVOKE_CHAR    (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN CHAR;
  FUNCTION INVOKE_FLOAT   (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN NUMBER;
  FUNCTION INVOKE_FLOAT   (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN NUMBER;
  FUNCTION INVOKE_DOUBLE  (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN NUMBER;
  FUNCTION INVOKE_DOUBLE  (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN NUMBER;
  FUNCTION INVOKE_STRING  (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN VARCHAR2;
  FUNCTION INVOKE_STRING  (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN VARCHAR2;
  FUNCTION INVOKE_PTR     (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList) RETURN Pointer;
  FUNCTION INVOKE_PTR     (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList) RETURN Pointer;
  PROCEDURE INVOKE        (funcHandle IN FunctionHandle, 
                           paramList  IN ParameterList);
  PROCEDURE INVOKE        (libName    IN VARCHAR2, 
                           funcName   IN VARCHAR2, 
                           paramList  IN ParameterList);

  <multilinecomment>*
   *  FUNCTION_COUNT - Indicates how many function handles are created but
   *  not yet destroyed. If this value is >0 when the form exits, it indicates
   *  that the forms programmer has not called DEREGISTER_FUNCTION for each
   *  REGISTER_FUNCTION, and is therefore causing a memory leak.
   *  Available to the forms programmer for testing/debugging.
   </multilinecomment>
  FUNCTION FUNCTION_COUNT RETURN PLS_INTEGER;

  <multilinecomment>*
   *  PARAMETER_LIST_COUNT - Indicates how many parameter lists are created but
   *  not yet destroyed. If this value is >0 when the form exits, it indicates
   *  that the forms programmer has not called DESTROY_PARAMETERLIST for each
   *  CREATE_PARAMETERLIST, and is therefore causing a memory leak.
   *  Available to the forms programmer for testing/debugging.
   </multilinecomment>
  FUNCTION PARAMETER_LIST_COUNT RETURN PLS_INTEGER;


    <multilinecomment>*
     *  ID_NULL - Check whether a supplied handle has a NULL value.
     </multilinecomment>
  FUNCTION ID_NULL(handle IN Pointer)        RETURN BOOLEAN;
  FUNCTION ID_NULL(handle IN FunctionHandle) RETURN BOOLEAN;
  FUNCTION ID_NULL(handle IN ParameterHandle)RETURN BOOLEAN;
  FUNCTION ID_NULL(handle IN ParameterList)  RETURN BOOLEAN;

END WEBUTIL_C_API;
	*/
	
			// ********************************************************************************\
		// * WEBUTIL_C_API
		// *   This Package provides a way of calling C functions in a shared library on the
		// *   client PC. Currently only win32 is supported.
		// *   The oracle.forms.webutil.cApi.CApiFunctions bean is needed in your Form to
		// *   use these functions
		// *********************************************************************************
		// * Version 1.0.5
		// *********************************************************************************
		// * Change History
		// *   1.0.1 RVSUILIC 14/FEB/2003 - Creation
		// *   1.0.2 DRMILLS  27/FEB/2003 - Reset LONG to the same value as INT which is fine
		// *                                for Windows & removed Tester proc
		// *   1.0.3 DRMILLS  01/MAR/2003 - Re-worked the PL/SQL API
		// *   1.0.4 DRMILLS  13/MAY/2003 - Added call to WebUtil_Core.Init
		// *   1.0.5 RVSUILIC 21/MAY/2003 - Cleaned up some comments and formatting.
		// *
		// \********************************************************************************
		// *
		// *  Constants to represent PL/SQL IN, OUT and INOUT parameter qualifiers
		public final NInteger PARAM_IN = toInt(50);
		public final NInteger PARAM_INOUT = toInt(51);
		public final NInteger PARAM_OUT = toInt(52);
		// *
		// *  Constants to represent C atomic datatypes and pointers to atomic datatypes
		// *  Note that to use OUT and INOUT qualifiers the C function in the DLL *must*
		// *  use a pointer type to be able to pass information back.
		// *
		// *  The comments on the right indicate which types can be used for parameters
		// *  and which for function return types.
		// *
		// *  c_ptr is used as a generic pointer. The onlys supported use for this is to
		// *  save the pointer value from C into a PL/SQL variable, so that it may be
		// *  passed back later to C. No operations on the pointer are supported in PL/SQL.
		public final NInteger C_VOID = toInt(30);
		//  - not used -   
		public final NInteger C_CHAR = toInt(31);
		//  param & return 
		public final NInteger C_SHORT = toInt(32);
		//  param & return 
		public final NInteger C_INT = toInt(33);
		//  param & return 
		public final NInteger C_LONG = toInt(33);
		//  param & return 
		// DRM - same as INT 
		public final NInteger C_FLOAT = toInt(35);
		//  param & return 
		public final NInteger C_DOUBLE = toInt(36);
		//  param & return 
		public static final NInteger C_PTR = toInt(64).add(C_VOID);
		//  param & return 
		public static final NInteger C_CHAR_PTR = toInt(64).add(C_CHAR);
		//  param          
		public static final NInteger C_SHORT_PTR = toInt(64).add(C_SHORT);
		//  param          
		public static final NInteger C_INT_PTR = toInt(64).add(C_INT);
		//  param          
		public static final NInteger C_LONG_PTR = toInt(64).add(C_LONG);
		//  param          
		public static final NInteger C_FLOAT_PTR = toInt(64).add(C_FLOAT);
		//  param          
		public static final NInteger C_DOUBLE_PTR = toInt(64).add(C_DOUBLE);

			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_C_API
		/*
		PACKAGE BODY WEBUTIL_C_API IS

  INVALID_PARAM_EXCEPTION EXCEPTION;

  m_funcHandleCount PLS_INTEGER := 0;
  m_paramListCount PLS_INTEGER := 0;

  --
  -- PRIVATE FUNCTIONS
  --


  -- Validate if the parameter type supplied is supported
  FUNCTION ValidParameterType (paramType IN PLS_INTEGER) RETURN BOOLEAN IS
  BEGIN
    IF paramType IN (c_char,
                     c_short,
                     c_int,
                     c_long,
                     c_float,
                     c_double,
                     c_ptr,
                     c_char_ptr,
                     c_short_ptr,
                     c_int_ptr,
                     c_long_ptr,
                     c_float_ptr,
                     c_double_ptr
                     ) THEN
      RETURN TRUE;
    END IF;
    
    RETURN FALSE;
  END ValidParameterType;

  -- Validate the INOUT specifier
  FUNCTION ValidInOut (inOut IN PLS_INTEGER) RETURN BOOLEAN IS
  BEGIN
    IF inOut IN (param_IN, param_INOUT, param_OUT) THEN
      RETURN TRUE;
    END IF;
    
    RETURN FALSE;
  END ValidInOut;


  -- Interface between INVOKE_XXX and the bean
  FUNCTION INVOKE_WU (funcHandle IN FunctionHandle, paramList ParameterList, retType IN PLS_INTEGER) RETURN VARCHAR2 IS
    strResult VARCHAR2(32767);
  BEGIN
    IF id_null(paramList) THEN
      WebUtil_Core.setProperty (WebUtil_Core.WUL_PACKAGE, 'WUL_INVOKE_SPEC', TO_CHAR(funcHandle.hnd) || '|' 
                                                                             || '(null)'                || '|' 
                                                                             || TO_CHAR(retType),false);
    ELSE                                                                             
      WebUtil_Core.setProperty (WebUtil_Core.WUL_PACKAGE, 'WUL_INVOKE_SPEC', TO_CHAR(funcHandle.hnd) || '|' 
                                                                             || TO_CHAR(paramList.hnd)  || '|' 
                                                                             || TO_CHAR(retType), false);
    END IF;                                                                             
      strResult := WebUtil_Core.getProperty (WebUtil_Core.WUL_PACKAGE, 'WUL_INVOKE');
      RETURN strResult;

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.INVOKE_WU will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  

  END INVOKE_WU;


  FUNCTION INVOKE_WU (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList, retType IN PLS_INTEGER) RETURN VARCHAR2 IS
    strResult VARCHAR2(32767);
  BEGIN
    IF id_null(paramList) THEN
      WebUtil_Core.setProperty (WebUtil_Core.WUL_PACKAGE, 'WUL_INVOKEONCE_SPEC', libName                || '|' 
                                                                                 || funcName               || '|' 
                                                                                 || '(null)'               || '|' 
                                                                                 || TO_CHAR(retType),false);
    ELSE                                                                                 
      WebUtil_Core.setProperty (WebUtil_Core.WUL_PACKAGE, 'WUL_INVOKEONCE_SPEC', libName                || '|' 
                                                                                 || funcName               || '|' 
                                                                                 || TO_CHAR(paramList.hnd) || '|' 
                                                                                 || TO_CHAR(retType),false);
    END IF;                                                                                 
    strResult := WebUtil_Core.getProperty(WebUtil_Core.WUL_PACKAGE,'WUL_INVOKE');
    RETURN TO_NUMBER (strResult);

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.INVOKE_WU will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END INVOKE_WU;


  -- Template functions for INVOKE_SHORT/INT/LONG
  FUNCTION INVOKE_INTEGRAL (funcHandle IN FunctionHandle, paramList ParameterList, retType IN PLS_INTEGER) RETURN PLS_INTEGER IS
  BEGIN
    RETURN TO_NUMBER (INVOKE_WU (funcHandle, paramList, retType));
  END INVOKE_INTEGRAL;


  FUNCTION INVOKE_INTEGRAL (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList, retType IN PLS_INTEGER) RETURN PLS_INTEGER IS
  BEGIN
    RETURN TO_NUMBER (INVOKE_WU (libName, funcName, paramList, retType));
  END INVOKE_INTEGRAL;


  -- Template functions for INVOKE_FLOAT/DOUBLE
  FUNCTION INVOKE_REAL (funcHandle IN FunctionHandle, paramList ParameterList, retType IN PLS_INTEGER) RETURN NUMBER IS
  BEGIN
    RETURN TO_NUMBER (INVOKE_WU (funcHandle, paramList, retType));
  END INVOKE_REAL;


  FUNCTION INVOKE_REAL (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList, retType IN PLS_INTEGER) RETURN NUMBER IS
  BEGIN
    RETURN TO_NUMBER (INVOKE_WU (libName, funcName, paramList, retType));
  END INVOKE_REAL;


  FUNCTION ADD_PARAMETER_WU (paramList IN ParameterList, parameterType IN PLS_INTEGER, 
                             inOut IN PLS_INTEGER, str IN VARCHAR2, strmaxlen IN PLS_INTEGER) RETURN ParameterHandle IS
    paramHnd ParameterHandle;
  BEGIN
    IF str IS NULL THEN
      WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES', 'B|'                   -- indicate Bind
                                                                                 || TO_CHAR(paramList.hnd) || '|'
                                                                                 || TO_CHAR(parameterType) || '|'
                                                                                 || TO_CHAR(inOut)         || '|'
                                                                                 || TO_CHAR(strmaxlen)     || '|'
                                                                                 || '(null)',false);
      ELSE                                                                               
        WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES', 'B|'                   -- indicate Bind
                                                                                   || TO_CHAR(paramList.hnd) || '|'
                                                                                   || TO_CHAR(parameterType) || '|'
                                                                                   || TO_CHAR(inOut)         || '|'
                                                                                   || TO_CHAR(strmaxlen)     || '|'
                                                                                   || str,false);
      END IF;                                                                               

      paramHnd.hnd := TO_NUMBER(WebUtil_Core.GetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_ADD_PARAMETER'));
      RETURN paramHnd;

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.ADD_PARAMETER_WU will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END ADD_PARAMETER_WU;



  --
  -- PUBLIC FUNCTIONS
  --

  FUNCTION IS_SUPPORTED RETURN BOOLEAN IS
    ClientOS PLS_INTEGER;
  BEGIN
    ClientOS := WebUtil_Core.GetClientOSFamily;
    if ClientOS = WebUtil_Core.CLIENT_PLATFORM_WIN32 then
    <multilinecomment>if ClientOS in (WebUtil_Core.CLIENT_PLATFORM_WIN32, 
                     WebUtil_Core.CLIENT_PLATFORM_SOLARIS) then </multilinecomment>
      return true;
    end if;

    return false;

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.IS_SUPPORTED will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                 
      return null;
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE;
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
    when TOOL_ERR.TOOL_ERROR then 
      RAISE;
  END IS_SUPPORTED;    


  FUNCTION CREATE_PARAMETER_LIST RETURN ParameterList IS
    paramListHandle ParameterList;
    strHnd VARCHAR2(8);
  BEGIN
    strHnd := WebUtil_Core.getProperty(WebUtil_Core.WUL_PACKAGE,'WUL_CREATE_PARAMLIST');

    if (strHnd is null) or (strHnd = '') then
      raise TOOL_ERR.TOOL_ERROR;
    end if;
    
    paramListHandle.hnd := TO_NUMBER (strHnd);
    m_paramListCount := m_paramListCount + 1;
    
    RETURN paramListHandle;

EXCEPTION  
  when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                            ||' bean not found. WEBUTIL_C_API.CREATE_PARAMETER_LIST will not work');
    RAISE FORM_TRIGGER_FAILURE;  
  when WebUtil_Core.PROPERTY_ERROR then 
    RAISE FORM_TRIGGER_FAILURE;  
  when VALUE_ERROR then
    RAISE TOOL_ERR.TOOL_ERROR; 
END CREATE_PARAMETER_LIST;


<multilinecomment>
** For Out only parameters, we don't need to pass any value. If we intend to pass
** a maximum length value for strings, we can call 3rd prototype by passing null for
** the string value and a desired length.
*</multilinecomment>

  -- 1 --
  FUNCTION ADD_PARAMETER (paramList IN ParameterList, parameterType IN PLS_INTEGER, 
                         inOut IN PLS_INTEGER := PARAM_OUT) RETURN ParameterHandle IS
    paramHnd ParameterHandle;
  BEGIN
    if inOut = PARAM_OUT then
      WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES',
                               'B|'                   -- indicate Bind
                                || TO_CHAR(paramList.hnd) || '|'
                                || TO_CHAR(parameterType) || '|'
                                || TO_CHAR(inOut),
                               false);
      paramHnd.hnd := TO_NUMBER(WebUtil_Core.GetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_ADD_PARAMETER'));
      RETURN paramHnd;
    else
      raise INVALID_PARAM_EXCEPTION;
    end if;
  exception
    when INVALID_PARAM_EXCEPTION then
      WebUtil_Core.Error(Webutil_Core.WUL_PACKAGE,923, 'WEBUTIL_C_API.ADD_PARAMETER');
    RAISE FORM_TRIGGER_FAILURE;  
  END ADD_PARAMETER;

  -- 2 --
  FUNCTION ADD_PARAMETER (paramList IN ParameterList, parameterType IN PLS_INTEGER, 
                          inOut IN PLS_INTEGER, num IN NUMBER) RETURN ParameterHandle IS
  BEGIN
    if NOT inOut = PARAM_OUT AND num is null then
      raise INVALID_PARAM_EXCEPTION;
    elsif inOut = PARAM_OUT then
      return ADD_PARAMETER(paramList, parameterType); -- call prototype-1
    end if;

    RETURN ADD_PARAMETER_WU (paramList, parameterType, inOut, TO_CHAR (num), 0);
  exception
    when INVALID_PARAM_EXCEPTION then
      WebUtil_Core.Error(Webutil_Core.WUL_PACKAGE,923, 'WEBUTIL_C_API.ADD_PARAMETER');
      RAISE FORM_TRIGGER_FAILURE;  
  END ADD_PARAMETER;


  -- 3 --
  FUNCTION ADD_PARAMETER (paramList IN ParameterList, parameterType IN PLS_INTEGER, 
                          inOut IN PLS_INTEGER,
                          str IN VARCHAR2, -- can be null even for IN or INOUT 
                          strmaxlen IN PLS_INTEGER) RETURN ParameterHandle IS
  BEGIN
    if inOut = PARAM_OUT AND strmaxlen is null then
      return ADD_PARAMETER(paramList, parameterType); -- call prototype-1
    elsif strmaxlen is null then
       raise INVALID_PARAM_EXCEPTION;
    end if;

    IF strmaxlen < 1 OR strmaxlen > 32768 THEN
      RAISE TOOL_ERR.TOOL_ERROR;
    END IF;

    RETURN ADD_PARAMETER_WU (paramList, parameterType, inOut, str, strmaxlen);

  exception
    when INVALID_PARAM_EXCEPTION then
      WebUtil_Core.Error(Webutil_Core.WUL_PACKAGE,919, 'WEBUTIL_C_API.ADD_PARAMETER');
    RAISE FORM_TRIGGER_FAILURE;  
  END ADD_PARAMETER;

  -- 4 --
  FUNCTION ADD_PARAMETER (paramList IN ParameterList, parameterType IN PLS_INTEGER, 
                          inOut IN PLS_INTEGER, ptr IN Pointer) RETURN ParameterHandle IS
  BEGIN
    if NOT inOut = PARAM_OUT AND ID_NULL(ptr) then
        raise INVALID_PARAM_EXCEPTION;
    elsif inOut = PARAM_OUT then
        return ADD_PARAMETER(paramList, parameterType); -- call prototype-1
    end if;

    RETURN ADD_PARAMETER_WU (paramList, parameterType, inOut, TO_CHAR (ptr.hnd), 0);
  exception
    when INVALID_PARAM_EXCEPTION then
      WebUtil_Core.Error(Webutil_Core.WUL_PACKAGE,923, 'WEBUTIL_C_API.ADD_PARAMETER');
      RAISE FORM_TRIGGER_FAILURE;  
  END ADD_PARAMETER;


  -- 1 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList, param IN ParameterHandle) IS
  BEGIN
      WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES',
                               'R|'                   -- indicate Rebind
                                || TO_CHAR(paramList.hnd) || '|'
                                || TO_CHAR(param.hnd),
                               false);
    -- No need to WebUtil_Core.GetProperty anything to do the actual rebind; it is implicitly done
    -- by WebUtil_Core.SetProperty of WUL_PARAM_PROPERTIES to 'R|....' to save a network trip
    -- If parameter is not OUT only, then client java will raise error for not passing value
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END REBIND_PARAMETER;

  -- 2 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList, param IN ParameterHandle, 
                              num IN NUMBER) IS
  BEGIN
    WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES', 'R|'                   -- indicate Rebind
                                                                           || TO_CHAR(paramList.hnd) || '|'
                                                                           || TO_CHAR(param.hnd)     || '|'
                                                                           || '0'                    || '|'
                                                                           || TO_CHAR(num), false);
    -- No need to WebUtil_Core.GetProperty anything to do the actual rebind; it is implicitly done
    -- by WebUtil_Core.SetProperty of WUL_PARAM_PROPERTIES to 'R|....' to save a network trip

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END REBIND_PARAMETER;

  -- 3 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList, param IN ParameterHandle, 
                              str IN VARCHAR2, strmaxlen IN PLS_INTEGER) IS
  BEGIN
    IF strmaxlen < 1 OR LENGTH (str) > strmaxlen THEN
        RAISE TOOL_ERR.TOOL_ERROR;
    END IF;
    WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES', 'R|'                   -- indicate Rebind
                                                                              || TO_CHAR(paramList.hnd) || '|'
                                                                              || TO_CHAR(param.hnd)     || '|'
                                                                              || TO_CHAR(strmaxlen)     || '|'
                                                                              || str, false);
    -- No need to WebUtil_Core.GetProperty anything to do the actual rebind; it is implicitly done
    -- by WebUtil_Core.SetProperty of WUL_PARAM_PROPERTIES to 'R|....' to save a network trip

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END REBIND_PARAMETER;

  -- 4 --
  PROCEDURE REBIND_PARAMETER (paramList IN ParameterList, param IN ParameterHandle, 
                              ptr IN Pointer) IS
  BEGIN
    REBIND_PARAMETER(paramList, param, ptr.hnd);
  END REBIND_PARAMETER;


  FUNCTION GET_PARAMETER_STRING (paramList IN ParameterList, param IN ParameterHandle) RETURN VARCHAR2 IS
    paramVal VARCHAR2(32767);
  BEGIN
    -- Note: It is up to the Java interface to guarantee sending back a string that is shorter than strmaxlen
    WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_PROPERTIES', 'F|'                   -- indicate Fetch
                                                                              || TO_CHAR(paramList.hnd) || '|'
                                                                              || TO_CHAR(param.hnd),false);
    paramVal := WebUtil_Core.GetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_PARAM_VALUE');
    
    RETURN paramVal;

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END GET_PARAMETER_STRING;


  FUNCTION GET_PARAMETER_NUMBER (paramList IN ParameterList, param IN ParameterHandle) RETURN NUMBER IS
  BEGIN
    RETURN TO_NUMBER (GET_PARAMETER_STRING (paramList, param));

  EXCEPTION
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
  END GET_PARAMETER_NUMBER;


  FUNCTION GET_PARAMETER_PTR (paramList IN ParameterList, param IN ParameterHandle) RETURN Pointer IS
    ptr Pointer;
  BEGIN
    ptr.hnd := TO_NUMBER (GET_PARAMETER_STRING (paramList, param));

    RETURN ptr;

  EXCEPTION
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
  END GET_PARAMETER_PTR;


  PROCEDURE DESTROY_PARAMETER_LIST (paramList IN ParameterList) IS
  BEGIN
    WebUtil_Core.SetProperty(WebUtil_Core.WUL_PACKAGE,'WUL_DESTROY_PARAMLIST', TO_CHAR(paramList.hnd),false);
    m_paramListCount := m_paramListCount - 1;

  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.DESTROY_PARAMETER_LIST will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END DESTROY_PARAMETER_LIST;


  FUNCTION REGISTER_FUNCTION (libName IN VARCHAR2, funcName IN VARCHAR2) 
                              RETURN FunctionHandle IS
    strHnd  VARCHAR2(8);                            
    funcHnd FunctionHandle;
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUL_PACKAGE,'WUL_FUNCTION_SPEC', libName || '|' || funcName);
    strHnd := WebUtil_Core.getProperty(WebUtil_Core.WUL_PACKAGE,'WUL_REGISTER_FUNCTION');
    funcHnd.hnd := TO_NUMBER (strHnd);
    if NOT ID_NULL(funcHnd) then
      m_funcHandleCount := m_funcHandleCount + 1;
    end if;

    RETURN funcHnd;
    
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REGISTER_FUNCTION will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
    when VALUE_ERROR then
        RAISE TOOL_ERR.TOOL_ERROR; 
  END REGISTER_FUNCTION;


  PROCEDURE DEREGISTER_FUNCTION (funcHandle IN FunctionHandle) IS
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUL_PACKAGE,'WUL_DEREGISTER_FUNCTION', TO_CHAR(funcHandle.hnd),false);
    m_funcHandleCount := m_funcHandleCount - 1;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.DEREGISTER_FUNCTION will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END DEREGISTER_FUNCTION;


  FUNCTION INVOKE_SHORT (funcHandle IN FunctionHandle, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (funcHandle, paramList, c_short);
  END INVOKE_SHORT;


  FUNCTION INVOKE_SHORT (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (libName, funcName, paramList, c_short);
  END INVOKE_SHORT;


  FUNCTION INVOKE_INT (funcHandle IN FunctionHandle, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (funcHandle, paramList, c_int);
  END INVOKE_INT;


  FUNCTION INVOKE_INT (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (libName, funcName, paramList, c_int);
  END INVOKE_INT;


  FUNCTION INVOKE_LONG (funcHandle IN FunctionHandle, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (funcHandle, paramList, c_long);
  END INVOKE_LONG;


  FUNCTION INVOKE_LONG (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN PLS_INTEGER IS
  BEGIN
    RETURN INVOKE_INTEGRAL (libName, funcName, paramList, c_long);
  END INVOKE_LONG;


  FUNCTION INVOKE_FLOAT (funcHandle IN FunctionHandle, paramList ParameterList) RETURN NUMBER IS
  BEGIN
    RETURN INVOKE_REAL (funcHandle, paramList, c_float);
  END INVOKE_FLOAT;


  FUNCTION INVOKE_FLOAT (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN NUMBER IS
  BEGIN
    RETURN INVOKE_REAL (libName, funcName, paramList, c_float);
  END INVOKE_FLOAT;


  FUNCTION INVOKE_DOUBLE (funcHandle IN FunctionHandle, paramList ParameterList) RETURN NUMBER IS
  BEGIN
    RETURN INVOKE_REAL (funcHandle, paramList, c_double);
  END INVOKE_DOUBLE;


  FUNCTION INVOKE_DOUBLE (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN NUMBER IS
  BEGIN
    RETURN INVOKE_REAL (libName, funcName, paramList, c_double);
  END INVOKE_DOUBLE;


  FUNCTION INVOKE_CHAR (funcHandle IN FunctionHandle, paramList ParameterList) RETURN CHAR IS
    charResult CHAR;
  BEGIN
    charResult := INVOKE_WU (funcHandle, paramList, c_char);
    RETURN charResult;
  END INVOKE_CHAR;


  FUNCTION INVOKE_CHAR (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN CHAR IS
    charResult  CHAR;
  BEGIN
    charResult := INVOKE_WU (libName, funcName, paramList, c_char);

    RETURN charResult;
  END INVOKE_CHAR;


  FUNCTION INVOKE_STRING (funcHandle IN FunctionHandle, paramList ParameterList) RETURN VARCHAR2 IS
    strResult  VARCHAR2(32767);
  BEGIN
    strResult := INVOKE_WU (funcHandle, paramList, c_char_ptr); 

    return strResult;
  END INVOKE_STRING;


  FUNCTION INVOKE_STRING (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN VARCHAR2 IS
    strResult  VARCHAR2(32767);
  BEGIN
    strResult := INVOKE_WU (libName, funcName, paramList, c_char_ptr);

    RETURN strResult;
  END INVOKE_STRING;


  FUNCTION INVOKE_PTR (funcHandle IN FunctionHandle, paramList ParameterList) RETURN Pointer IS
    strResult VARCHAR2(40);
    ptrResult Pointer;
  BEGIN
    strResult := INVOKE_WU (funcHandle, paramList, c_ptr);
    ptrResult.hnd := TO_NUMBER (strResult);

    RETURN ptrResult;

  EXCEPTION
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
  END INVOKE_PTR;


  FUNCTION INVOKE_PTR (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) RETURN Pointer IS
    strResult VARCHAR2(40);
    ptrResult Pointer;
  BEGIN
    strResult := INVOKE_WU (libName, funcName, paramList, c_ptr);
    ptrResult.hnd := TO_NUMBER (strResult);

    RETURN ptrResult;

  EXCEPTION
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
  END INVOKE_PTR;


  PROCEDURE INVOKE (funcHandle IN FunctionHandle, paramList ParameterList) IS
    dummy VARCHAR2(20);
  BEGIN
    dummy := INVOKE_WU (funcHandle, paramList, c_void);
  END INVOKE;


  PROCEDURE INVOKE (libName IN VARCHAR2, funcName IN VARCHAR2, paramList ParameterList) IS
    dummy VARCHAR2(20);
  BEGIN
    dummy := INVOKE_WU (libName, funcName, paramList, c_void);
  END INVOKE;


  FUNCTION FUNCTION_COUNT RETURN PLS_INTEGER IS
  BEGIN
    RETURN m_funcHandleCount;
  END FUNCTION_COUNT;


  FUNCTION PARAMETER_LIST_COUNT RETURN PLS_INTEGER IS
  BEGIN
    RETURN m_paramListCount;
  END PARAMETER_LIST_COUNT;


  FUNCTION ID_NULL(handle IN Pointer)        RETURN BOOLEAN is
  BEGIN
    if handle.hnd is null then 
      return TRUE;
    else
      return FALSE;
    end if;
  END ID_NULL;


  FUNCTION ID_NULL(handle IN FunctionHandle) RETURN BOOLEAN is
  BEGIN
    if handle.hnd is null then 
      return TRUE;
    else
      return FALSE;
    end if;
  END ID_NULL;


  FUNCTION ID_NULL(handle IN ParameterHandle) RETURN BOOLEAN is
  BEGIN
    if handle.hnd is null then 
      return TRUE;
    else
      return FALSE;
    end if;
  END ID_NULL;


  FUNCTION ID_NULL(handle IN ParameterList) RETURN BOOLEAN is
  BEGIN
    if handle.hnd is null then 
      return TRUE;
    else
      return FALSE;
    end if;
  END ID_NULL;


<multilinecomment>
 * PACKAGE INITIALISATION
 </multilinecomment>
BEGIN 
  -- Ensure all is initialised
  WebUtil_Core.Init;
END WEBUTIL_C_API;
		*/
				 public class InvalidParamException extends Exception{}
		private NInteger mFunchandlecount = toInt(0);
		private NInteger mParamlistcount = toInt(0);
/* <p>
		* 
		*  PRIVATE FUNCTIONS
		* 
		*  Validate if the parameter type supplied is supported
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramtype
		*/
		public NBool validparametertype(NInteger paramtype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( in(paramtype, C_CHAR, C_SHORT, C_INT, C_LONG, C_FLOAT, C_DOUBLE, C_PTR, C_CHAR_PTR, C_SHORT_PTR, C_INT_PTR, C_LONG_PTR, C_FLOAT_PTR, C_DOUBLE_PTR).getValue() )
//			{
//				return  toBool(NBool.True);
//			}
//			return  toBool(NBool.False);
//
			this.getLogger().trace(this, "F2J : validparametertype function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Validate the INOUT specifier
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param inout
		*/
		public NBool validinout(NInteger inout)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( in(inout, PARAM_IN, PARAM_INOUT, PARAM_OUT).getValue() )
//			{
//				return  toBool(NBool.True);
//			}
//			return  toBool(NBool.False);
//
			this.getLogger().trace(this, "F2J : validinout function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Interface between INVOKE_XXX and the bean
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		* @param rettype
		*/
		public NString invokeWu(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			try
//			{
//				if ( (paramlist == null) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKE_SPEC"), toChar(funchandle.Hnd).append("|").append("(null)").append("|").append(toChar(rettype)), toBool(NBool.False));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKE_SPEC"), toChar(funchandle.Hnd).append("|").append(toChar(paramlist.Hnd)).append("|").append(toChar(rettype)), toBool(NBool.False));
//				}
//				strresult = getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKE"));
//				return strresult;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.INVOKE_WU will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invokeWu function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		* @param rettype
		*/
		public NString invokeWu(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			try
//			{
//				if ( (paramlist == null) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKEONCE_SPEC"), libname.append("|").append(funcname).append("|").append("(null)").append("|").append(toChar(rettype)), toBool(NBool.False));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKEONCE_SPEC"), libname.append("|").append(funcname).append("|").append(toChar(paramlist.Hnd)).append("|").append(toChar(rettype)), toBool(NBool.False));
//				}
//				strresult = getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_INVOKE"));
//				return toNumber(strresult);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.INVOKE_WU will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invokeWu function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Template functions for INVOKE_SHORT/INT/LONG
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		* @param rettype
		*/
		public NInteger invokeIntegral(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toNumber(invokeWu(funchandle, paramlist, rettype));
//
			this.getLogger().trace(this, "F2J : invokeIntegral function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		* @param rettype
		*/
		public NInteger invokeIntegral(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toNumber(invokeWu(libname, funcname, paramlist, rettype));
//
			this.getLogger().trace(this, "F2J : invokeIntegral function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		*  Template functions for INVOKE_FLOAT/DOUBLE
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		* @param rettype
		*/
		public NNumber invokeReal(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toNumber(invokeWu(funchandle, paramlist, rettype));
//
			this.getLogger().trace(this, "F2J : invokeReal function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		* @param rettype
		*/
		public NNumber invokeReal(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist, NInteger rettype)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toNumber(invokeWu(libname, funcname, paramlist, rettype));
//
			this.getLogger().trace(this, "F2J : invokeReal function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		* @param inout
		* @param str
		* @param strmaxlen
		*/
		public Webutilcapi.Parameterhandle addParameterWu(Webutilcapi.Parameterlist paramlist, NInteger parametertype, NInteger inout, NString str, NInteger strmaxlen)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Webutilcapi.Parameterhandle paramhnd= null;
//			try
//			{
//				if ( str.isNull() )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("B|").append(toChar(paramlist.Hnd)).append("|").append(toChar(parametertype)).append("|").append(toChar(inout)).append("|").append(toChar(strmaxlen)).append("|").append("(null)"), toBool(NBool.False));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("B|").append(toChar(paramlist.Hnd)).append("|").append(toChar(parametertype)).append("|").append(toChar(inout)).append("|").append(toChar(strmaxlen)).append("|").append(str), toBool(NBool.False));
//				}
//				paramhnd.Hnd = toNumber(getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_ADD_PARAMETER")));
//				return paramhnd;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.ADD_PARAMETER_WU will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addParameterWu function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* 
		*  PUBLIC FUNCTIONS
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isSupported()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger clientos= NInteger.getNull();
//			try
//			{
//				clientos = getContainer().getWebutilCore().getclientosfamily();
//				if ( clientos.equals(getWebutilcore().CLIENT_PLATFORM_WIN32) )
//				{
//					// if ClientOS in (WebUtil_Core.CLIENT_PLATFORM_WIN32,
//					// WebUtil_Core.CLIENT_PLATFORM_SOLARIS) then 
//					return  toBool(NBool.True);
//				}
//				return  toBool(NBool.False);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.IS_SUPPORTED will not work"));
//				throw new Exception();
//				return NBool.getNull();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw  e;
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//			catch(Exception e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : isSupported function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public Webutilcapi.Parameterlist createParameterList()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Webutilcapi.Parameterlist paramlisthandle= null;
//			NString strhnd= NString.getNull();
//			try
//			{
//				strhnd = getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_CREATE_PARAMLIST"));
//				if ( (strhnd.isNull()) || (strhnd.equals("")) )
//				{
//					throw new Exception();
//				}
//				paramlisthandle.Hnd = toNumber(strhnd);
//				mParamlistcount = mParamlistcount.add(1);
//				return paramlisthandle;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.CREATE_PARAMETER_LIST will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : createParameterList function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* ** For Out only parameters, we don't need to pass any value. If we intend to pass
		* ** a maximum length value for strings, we can call 3rd prototype by passing null for
		* ** the string value and a desired length.
		* *
		*  1 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		*/
		public Webutilcapi.Parameterhandle addParameter(Webutilcapi.Parameterlist paramlist, NInteger parametertype) {
			return addParameter(paramlist, parametertype, PARAM_OUT);
		}

/* <p>
		* ** For Out only parameters, we don't need to pass any value. If we intend to pass
		* ** a maximum length value for strings, we can call 3rd prototype by passing null for
		* ** the string value and a desired length.
		* *
		*  1 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		* @param inout
		*/
		public Webutilcapi.Parameterhandle addParameter(Webutilcapi.Parameterlist paramlist, NInteger parametertype, NInteger inout)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Webutilcapi.Parameterhandle paramhnd= null;
//			try
//			{
//				if ( inout.equals(PARAM_OUT) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("B|").append(toChar(paramlist.Hnd)).append("|").append(toChar(parametertype)).append("|").append(toChar(inout)), toBool(NBool.False));
//					paramhnd.Hnd = toNumber(getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_ADD_PARAMETER")));
//					return paramhnd;
//				}
//				else {
//					throw new InvalidParamException();
//				}
//			}
//			catch(InvalidParamException e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUL_PACKAGE, toInt(923), toStr("WEBUTIL_C_API.ADD_PARAMETER"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addParameter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  2 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		* @param inout
		* @param num
		*/
		public Webutilcapi.Parameterhandle addParameter(Webutilcapi.Parameterlist paramlist, NInteger parametertype, NInteger inout, NNumber num)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( ! (inout.equals(PARAM_OUT)) && num.isNull() )
//				{
//					throw new InvalidParamException();
//				}
//				else if ( inout.equals(PARAM_OUT) ) {
//					return addParameter(paramlist, parametertype);
//				}
//				return addParameterWu(paramlist, parametertype, inout, toChar(num), toInt(0));
//			}
//			catch(InvalidParamException e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUL_PACKAGE, toInt(923), toStr("WEBUTIL_C_API.ADD_PARAMETER"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addParameter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  3 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		* @param inout
		* @param str
		* @param strmaxlen
		*/
		public Webutilcapi.Parameterhandle addParameter(Webutilcapi.Parameterlist paramlist, NInteger parametertype, NInteger inout, NString str, NInteger strmaxlen)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( inout.equals(PARAM_OUT) && strmaxlen.isNull() )
//				{
//					return addParameter(paramlist, parametertype);
//				}
//				else if ( strmaxlen.isNull() ) {
//					throw new InvalidParamException();
//				}
//				if ( strmaxlen.lesser(1) || strmaxlen.greater(32768) )
//				{
//					throw new Exception();
//				}
//				return addParameterWu(paramlist, parametertype, inout, str, strmaxlen);
//			}
//			catch(InvalidParamException e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUL_PACKAGE, toInt(919), toStr("WEBUTIL_C_API.ADD_PARAMETER"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addParameter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  4 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param parametertype
		* @param inout
		* @param ptr
		*/
		public Webutilcapi.Parameterhandle addParameter(Webutilcapi.Parameterlist paramlist, NInteger parametertype, NInteger inout, Webutilcapi.Pointer ptr)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( ! (inout.equals(PARAM_OUT)) && (ptr == null) )
//				{
//					throw new InvalidParamException();
//				}
//				else if ( inout.equals(PARAM_OUT) ) {
//					return addParameter(paramlist, parametertype);
//				}
//				return addParameterWu(paramlist, parametertype, inout, toChar(ptr.Hnd), toInt(0));
//			}
//			catch(InvalidParamException e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUL_PACKAGE, toInt(923), toStr("WEBUTIL_C_API.ADD_PARAMETER"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addParameter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  1 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		*/
		public void rebindParameter(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("R|").append(toChar(paramlist.Hnd)).append("|").append(toChar(param.Hnd)), toBool(NBool.False));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : rebindParameter procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  2 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		* @param num
		*/
		public void rebindParameter(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param, NNumber num)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("R|").append(toChar(paramlist.Hnd)).append("|").append(toChar(param.Hnd)).append("|").append("0").append("|").append(toChar(num)), toBool(NBool.False));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : rebindParameter procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  3 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		* @param str
		* @param strmaxlen
		*/
		public void rebindParameter(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param, NString str, NInteger strmaxlen)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( strmaxlen.lesser(1) || length(str).greater(strmaxlen) )
//				{
//					throw new Exception();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("R|").append(toChar(paramlist.Hnd)).append("|").append(toChar(param.Hnd)).append("|").append(toChar(strmaxlen)).append("|").append(str), toBool(NBool.False));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : rebindParameter procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  4 --
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		* @param ptr
		*/
		public void rebindParameter(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param, Webutilcapi.Pointer ptr)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			rebindParameter(paramlist, param, ptr.Hnd);
//
			this.getLogger().trace(this, "F2J : rebindParameter procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		*/
		public NString getParameterString(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString paramval= NString.getNull();
//			try
//			{
//				//  Note: It is up to the Java interface to guarantee sending back a string that is shorter than strmaxlen
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_PROPERTIES"), toStr("F|").append(toChar(paramlist.Hnd)).append("|").append(toChar(param.Hnd)), toBool(NBool.False));
//				paramval = getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_PARAM_VALUE"));
//				return paramval;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getParameterString function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		*/
		public NNumber getParameterNumber(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return toNumber(getParameterString(paramlist, param));
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : getParameterNumber function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		* @param param
		*/
		public Webutilcapi.Pointer getParameterPtr(Webutilcapi.Parameterlist paramlist, Webutilcapi.Parameterhandle param)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Webutilcapi.Pointer ptr= null;
//			try
//			{
//				ptr.Hnd = toNumber(getParameterString(paramlist, param));
//				return ptr;
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : getParameterPtr function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param paramlist
		*/
		public void destroyParameterList(Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_DESTROY_PARAMLIST"), toChar(paramlist.Hnd), toBool(NBool.False));
//				mParamlistcount = mParamlistcount.subtract(1);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.DESTROY_PARAMETER_LIST will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : destroyParameterList procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		*/
		public Webutilcapi.Functionhandle registerFunction(NString libname, NString funcname)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strhnd= NString.getNull();
//			Webutilcapi.Functionhandle funchnd= null;
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_FUNCTION_SPEC"), libname.append("|").append(funcname));
//				strhnd = getContainer().getWebutilCore().getproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_REGISTER_FUNCTION"));
//				funchnd.Hnd = toNumber(strhnd);
//				if ( !(funchnd == null) )
//				{
//					mFunchandlecount = mFunchandlecount.add(1);
//				}
//				return funchnd;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REGISTER_FUNCTION will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : registerFunction function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		*/
		public void deregisterFunction(Webutilcapi.Functionhandle funchandle)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUL_PACKAGE, toStr("WUL_DEREGISTER_FUNCTION"), toChar(funchandle.Hnd), toBool(NBool.False));
//				mFunchandlecount = mFunchandlecount.subtract(1);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.DEREGISTER_FUNCTION will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : deregisterFunction procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NInteger invokeShort(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(funchandle, paramlist, C_SHORT);
//
			this.getLogger().trace(this, "F2J : invokeShort function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NInteger invokeShort(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(libname, funcname, paramlist, C_SHORT);
//
			this.getLogger().trace(this, "F2J : invokeShort function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NInteger invokeInt(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(funchandle, paramlist, C_INT);
//
			this.getLogger().trace(this, "F2J : invokeInt function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NInteger invokeInt(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(libname, funcname, paramlist, C_INT);
//
			this.getLogger().trace(this, "F2J : invokeInt function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NInteger invokeLong(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(funchandle, paramlist, C_LONG);
//
			this.getLogger().trace(this, "F2J : invokeLong function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NInteger invokeLong(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeIntegral(libname, funcname, paramlist, C_LONG);
//
			this.getLogger().trace(this, "F2J : invokeLong function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NNumber invokeFloat(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeReal(funchandle, paramlist, C_FLOAT);
//
			this.getLogger().trace(this, "F2J : invokeFloat function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NNumber invokeFloat(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeReal(libname, funcname, paramlist, C_FLOAT);
//
			this.getLogger().trace(this, "F2J : invokeFloat function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NNumber invokeDouble(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeReal(funchandle, paramlist, C_DOUBLE);
//
			this.getLogger().trace(this, "F2J : invokeDouble function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NNumber invokeDouble(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return invokeReal(libname, funcname, paramlist, C_DOUBLE);
//
			this.getLogger().trace(this, "F2J : invokeDouble function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NString invokeChar(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString charresult= NString.getNull();
//			charresult = invokeWu(funchandle, paramlist, C_CHAR);
//			return charresult;
//
			this.getLogger().trace(this, "F2J : invokeChar function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NString invokeChar(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString charresult= NString.getNull();
//			charresult = invokeWu(libname, funcname, paramlist, C_CHAR);
//			return charresult;
//
			this.getLogger().trace(this, "F2J : invokeChar function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public NString invokeString(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			strresult = invokeWu(funchandle, paramlist, C_CHAR_PTR);
//			return strresult;
//
			this.getLogger().trace(this, "F2J : invokeString function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public NString invokeString(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			strresult = invokeWu(libname, funcname, paramlist, C_CHAR_PTR);
//			return strresult;
//
			this.getLogger().trace(this, "F2J : invokeString function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public Webutilcapi.Pointer invokePtr(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			Webutilcapi.Pointer ptrresult= null;
//			try
//			{
//				strresult = invokeWu(funchandle, paramlist, C_PTR);
//				ptrresult.Hnd = toNumber(strresult);
//				return ptrresult;
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : invokePtr function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public Webutilcapi.Pointer invokePtr(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString strresult= NString.getNull();
//			Webutilcapi.Pointer ptrresult= null;
//			try
//			{
//				strresult = invokeWu(libname, funcname, paramlist, C_PTR);
//				ptrresult.Hnd = toNumber(strresult);
//				return ptrresult;
//			}
//			catch(ValueErrorException e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : invokePtr function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param funchandle
		* @param paramlist
		*/
		public void invoke(Webutilcapi.Functionhandle funchandle, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString dummy= NString.getNull();
//			dummy = invokeWu(funchandle, paramlist, C_VOID);
//
			this.getLogger().trace(this, "F2J : invoke procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param libname
		* @param funcname
		* @param paramlist
		*/
		public void invoke(NString libname, NString funcname, Webutilcapi.Parameterlist paramlist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString dummy= NString.getNull();
//			dummy = invokeWu(libname, funcname, paramlist, C_VOID);
//
			this.getLogger().trace(this, "F2J : invoke procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger functionCount()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mFunchandlecount;
//
			this.getLogger().trace(this, "F2J : functionCount function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger parameterListCount()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mParamlistcount;
//
			this.getLogger().trace(this, "F2J : parameterListCount function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param handle
		*/
		public NBool idNull(Webutilcapi.Pointer handle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( handle.Hnd.isNull() )
//			{
//				return  toBool(NBool.True);
//			}
//			else {
//				return  toBool(NBool.False);
//			}
//
			this.getLogger().trace(this, "F2J : idNull function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param handle
		*/
		public NBool idNull(Webutilcapi.Functionhandle handle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( handle.Hnd.isNull() )
//			{
//				return  toBool(NBool.True);
//			}
//			else {
//				return  toBool(NBool.False);
//			}
//
			this.getLogger().trace(this, "F2J : idNull function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param handle
		*/
		public NBool idNull(Webutilcapi.Parameterhandle handle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( handle.Hnd.isNull() )
//			{
//				return  toBool(NBool.True);
//			}
//			else {
//				return  toBool(NBool.False);
//			}
//
			this.getLogger().trace(this, "F2J : idNull function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param handle
		*/
		public NBool idNull(Webutilcapi.Parameterlist handle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( handle.Hnd.isNull() )
//			{
//				return  toBool(NBool.True);
//			}
//			else {
//				return  toBool(NBool.False);
//			}
//
			this.getLogger().trace(this, "F2J : idNull function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
		public WebutilCApi() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Ensure all is initialised
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilCApi Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class Pointer{
	public UnknownTypes.Handletype hnd;
}

public static class Functionhandle{
	public UnknownTypes.Handletype hnd;
}

public static class Parameterhandle{
	public UnknownTypes.Handletype hnd;
}

public static class Parameterlist{
	public UnknownTypes.Handletype hnd;
}



	
}
