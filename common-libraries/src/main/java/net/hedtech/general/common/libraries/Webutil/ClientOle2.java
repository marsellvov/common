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


public class ClientOle2 extends AbstractSupportCodeObject {
	

	public ClientOle2(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_OLE2
	/*
	PACKAGE CLIENT_OLE2 IS
<multilinecomment>********************************************************************************\
 * CLIENT_OLE2
 *   This package duplicates the action of the OLE2 package, except that it 
 *   operates on the client (browser) tier rather than the Applcation server tier.  
 *   Existing OLE2 code can be re-directed to run on the client simply by 
 *   prefixing all the calls with "CLIENT_" 
 *   The functions in this package will work only with Windows clients.
 *   The oracle.forms.webutil.ole.OleFunctions bean is needed in your 
 *   Form to use these functions
  *********************************************************************************
 * Version 1.0.2
 *********************************************************************************
 * Change History
 *   1.0.0  KPRAKASH 21/DEC/2002 - Creation 
 *   1.0.1  DRMILLS  27/FEB/2003 - Commented
 *   1.0.2  DRMILLS  12/MAY/2003 - Added Explict call to WebUtil_Core.Init;
\********************************************************************************</multilinecomment>


  <multilinecomment>*
   * OLE Types
   </multilinecomment>
  SUBTYPE obj_type IS pls_integer;
  SUBTYPE list_type IS pls_integer;

  <multilinecomment>*
   * OLE Exceptions
   </multilinecomment>
  ole_error  EXCEPTION;
  PRAGMA exception_init(ole_error, -305500);

  ole_not_supported  EXCEPTION;
  PRAGMA exception_init(ole_not_supported, -305501);

  <multilinecomment>*
   * Argument List Functions
   </multilinecomment>
  FUNCTION create_arglist RETURN list_type;

  PROCEDURE add_arg(list IN list_type, value IN VARCHAR2);

  PROCEDURE add_arg(list IN list_type, value IN NUMBER);

  PROCEDURE add_arg(list IN list_type, value IN BOOLEAN);

  PROCEDURE add_arg_obj(list IN list_type, value IN OBJ_TYPE);

  PROCEDURE destroy_arglist(list IN list_type);
        
  <multilinecomment>*
   * Create Objects
   </multilinecomment>
  FUNCTION create_obj(object IN VARCHAR2) RETURN obj_type;

  <multilinecomment>*
   * Invoke Methods
   </multilinecomment>
  PROCEDURE invoke(object IN obj_type,
                   method IN VARCHAR2,
                   arglist IN list_type := 0);
                
  FUNCTION invoke_num (object IN obj_type, 
                       method IN VARCHAR2, 
                       arglist IN list_type := 0) return NUMBER;
               
  FUNCTION invoke_char (object IN obj_type, 
                        method IN VARCHAR2, 
                        arglist IN list_type := 0) return VARCHAR2;
        
  FUNCTION invoke_obj (object IN obj_type, 
                       method IN VARCHAR2, 
                       arglist IN list_type := 0) return obj_type;

  <multilinecomment>*
   * Set And Get OLE Properties
   </multilinecomment>
  PROCEDURE set_property (object IN obj_type, 
                          property IN VARCHAR2, 
                          value IN VARCHAR2,
                          arglist IN list_type := 0);
               
  PROCEDURE set_property (object IN obj_type, 
                          property IN VARCHAR2, 
                          value IN NUMBER,
                          arglist IN list_type := 0);
               
  PROCEDURE set_property (object IN obj_type, 
                          property IN VARCHAR2, 
                          value IN BOOLEAN,
                          arglist IN list_type := 0);

  FUNCTION get_num_property (object IN obj_type, 
                             property IN VARCHAR2, 
                             arglist IN list_type := 0) return NUMBER;
  
  FUNCTION get_char_property (object IN obj_type, 
                              property IN VARCHAR2, 
                              arglist IN list_type := 0) return VARCHAR2;
        
  FUNCTION get_obj_property (object IN obj_type, 
                             property IN VARCHAR2, 
                             arglist IN list_type := 0) return obj_type;
        
  FUNCTION get_bool_property (object IN obj_type, 
                             property IN VARCHAR2, 
                             arglist IN list_type := 0) return BOOLEAN;

  <multilinecomment>*
   * Release OLE Obj
   </multilinecomment>
  PROCEDURE release_obj (object IN obj_type);
        
  <multilinecomment>*
   * Is OLE Supported on this client?
   </multilinecomment>
  function IsSupported return boolean;


  <multilinecomment>*
   * Error handling
   </multilinecomment>
  FUNCTION last_exception return NUMBER;

  FUNCTION last_exception(message OUT VARCHAR2) return NUMBER;

  <multilinecomment>*
   * New Function For WebUtil - this persists an Object 
   * Reference so that it can be passed between Forms
   * If this is not used then the Object ref will be 
   * Cleaned up as soon as the Form is closed
   </multilinecomment>
  PROCEDURE persist_ole_handle(object OBJ_TYPE);
  

  OLE_NULL_COMPATIBILITY BOOLEAN := FALSE;

END CLIENT_OLE2;
	*/
	
			// *
		// * OLE Exceptions
		 public class OleError extends Exception{}
		 public class OleNotSupported extends Exception{}
		public NBool oleNullCompatibility = toBool(NBool.False);

			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_OLE2
		/*
		PACKAGE BODY CLIENT_OLE2 IS


  <multilinecomment> Function used to create an argument list </multilinecomment>


  FUNCTION create_arglist RETURN LIST_TYPE IS
    v_argList LIST_TYPE;
    v_javaHandle VARCHAR2(6);
  BEGIN
    v_javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_CREATE_ARGLIST');
    -- Check if the handle is valid
    if (v_javaHandle is null) or (v_javaHandle='') or (v_javaHandle='-1') then
      raise OLE_ERROR;
    end if;
    v_argList := to_number(v_javaHandle);
    return(v_arglist);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.create_arglist will not work');
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;  
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;
  END create_arglist;    


  <multilinecomment> Overloaded procedure used to add a numeric argument to an argument list </multilinecomment>
  PROCEDURE add_arg (list IN LIST_TYPE, value IN NUMBER)IS
    v_str VARCHAR2(4000 char);
  BEGIN
    -- Check if argument list is valid
    if (list is null) or (list='') or (list=0)then
      raise OLE_ERROR;
    end if;  

    if (value is null) or (value='') then
      RAISE OLE_ERROR;
    else
      -- Prefix argument with 'N' as an indicator to the OLE bean that it is a numeric argument
      v_str := 'N'||to_char(value);
    end if;    
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',list);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ADD_ARG',v_str);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.add_arg will not work');
      RAISE OLE_ERROR;
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END add_arg; 


  <multilinecomment> Overloaded procedure used to add a boolean argument to an argument list </multilinecomment>
  PROCEDURE add_arg (list IN LIST_TYPE, value IN BOOLEAN)IS
    v_str VARCHAR2(4000 char);
  BEGIN
    -- check if argument list is valid        
    if (list is null) or (list='') or (list=0) then
      raise OLE_ERROR;
    end if;  

    if (value is null) then
      raise OLE_ERROR;
    else
      -- Prefix boolean arguments with 'B' as an indicator to the OLE bean
      v_str := 'B'||Webutil_util.BoolToStr(value);
    end if;  

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',list);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ADD_ARG',v_str);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.add_arg will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END add_arg;


  <multilinecomment> Overloaded procedure used to add a string argument to an argument list </multilinecomment>
  PROCEDURE add_arg (list IN LIST_TYPE, value IN VARCHAR2)IS
    v_str varchar2(4000 char);
  BEGIN
    -- Check if argument list is valid
    if (list is null) or (list='') or (list=0)then
      raise OLE_ERROR;
    end if; 
      if (value is null) or (value ='') then
      v_str := null;
    else
      -- Prefix string arguments with 'S' as an indicator to the OLE bean
      v_str := 'S'||value;
    end if;    

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',list);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ADD_ARG',v_str);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.add_arg will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END add_arg; 


  <multilinecomment> procedure used to add an object handle to an argument list </multilinecomment>
  PROCEDURE add_arg_obj (list IN LIST_TYPE, value IN OBJ_TYPE)IS
  BEGIN
    if (list is null) or (list='') or (list=0) then
      raise OLE_ERROR;
    end if;  
    if ((value is null ) or (value = '') or (value = -1)) then
      raise OLE_ERROR;
    end if;    

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',list);
    -- Prefix OLE Object handles with "O" as an indicator to the OLE bean
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ADD_ARG','O'||value);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.add_arg_obj will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END add_arg_obj; 


  <multilinecomment> procedure used to destroy an argument list </multilinecomment>
  PROCEDURE destroy_arglist(list IN LIST_TYPE)IS
  BEGIN
    if (list is null) or (list='') or (list = -1) then
      raise OLE_ERROR;
    end if;  
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_DESTROY_ARGLIST',list);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.destroy_arglist will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END destroy_arglist;



  <multilinecomment> Function used to create a new instance of an OLE Server </multilinecomment>
  FUNCTION create_obj(object IN VARCHAR2) RETURN OBJ_TYPE is
    v_objHandle OBJ_TYPE;
    v_javaHandle varchar2(6);
  BEGIN
    -- check if OLE object name is valid
    if  ((object is null) or (object = '')) then
      raise OLE_ERROR;
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_OBJNAME',object);
    v_javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_CREATE_OBJ');
    -- check if the OLE Object handle is valid
    if (v_javaHandle is null) or (v_javaHandle='') or (v_javaHandle='-1') then
      raise OLE_ERROR;
    end if;

    v_objHandle := to_number(v_javaHandle);
    return(v_objHandle);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.create_obj will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END create_obj;


  <multilinecomment> Procedure used to invoke a method in an OLE Server </multilinecomment>
  PROCEDURE invoke(object IN obj_type, method IN VARCHAR2,arglist IN list_type := 0) IS
    v_arglist LIST_TYPE;
  BEGIN
    if ((object is null) or (object = '')) then
      raise OLE_ERROR;
    end if;
    if ((method is null) or (method = '') ) then
      raise OLE_ERROR;
    end if;

    -- If argument list is not specified, then create an empty argument list and invoke
    -- the method using the emtpy list. This is required because the OLE bean requires
    -- an argument list. If no arguments are required, we just pass an empty argument list.
    if (arglist = 0) or (arglist is null) or (arglist='') then
      v_arglist := create_arglist;
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',v_arglist);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',method);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_INVOKE','');

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.invoke will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END invoke;


  <multilinecomment> Function used to invoke a method in an OLE Server, which returns a numeric value </multilinecomment>
  FUNCTION invoke_num(object IN obj_type, method IN VARCHAR2,arglist IN list_type := 0) RETURN NUMBER IS
    v_arglist LIST_TYPE;
    v_javares varchar2(4000 char);
  BEGIN
    if ((object is null) or (object = '')) then
      raise OLE_ERROR;
    end if;
    if ((method is null) or (method = '') ) then
      raise OLE_ERROR;
    end if;
    -- If argument list is not specified, then create an empty argument list and invoke
    -- the method using the emtpy list. This is required because the OLE bean requires
    -- an argument list. If no arguments are required, we just pass an empty argument list.
    if (arglist = 0) or (arglist is null) or (arglist='') then
      v_arglist := create_arglist;
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',v_arglist);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',method);
    v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_INVOKE_STR');
    if (v_javares is null) or (v_javares ='') then
      raise OLE_ERROR;
    end if;    
    return(to_number(v_javares));

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.invoke_num will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END invoke_num;        


  <multilinecomment> Function used to invoke a method in an OLE Server, which returns a string value </multilinecomment>
  FUNCTION invoke_char(object IN obj_type, method IN VARCHAR2,arglist IN list_type := 0) RETURN VARCHAR2 IS
    v_arglist LIST_TYPE;
    v_javares varchar2(4000 char);
  BEGIN
    if ((object is null) or (object = '')) then
      raise OLE_ERROR;
    end if;
    if ((method is null) or (method = '') ) then
      raise OLE_ERROR;
    end if;

    -- If argument list is not specified, then create an empty argument list and invoke
    -- the method using the emtpy list. This is required because the OLE2 bean requires
    -- an argument list. If no arguments are required, we just pass an empty argument list.
    if (arglist = 0) or (arglist is null) or (arglist='') then
      v_arglist := create_arglist;
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',v_arglist);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',method);
    v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_INVOKE_STR');
    return(v_javares);

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.invoke_char will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END invoke_char;        


  <multilinecomment> Function used to invoke a method in an OLE Server, which returns an OLE object handle </multilinecomment>
  FUNCTION invoke_obj(object IN obj_type, method IN VARCHAR2,arglist IN list_type := 0) RETURN OBJ_TYPE IS
    v_arglist LIST_TYPE;
    v_javaHandle  varchar2(6);
    v_objHandle OBJ_TYPE;
  BEGIN
    if ((object is null) or (object = '')) then
      raise OLE_ERROR;
    end if;

    if ((method is null) or (method = '') ) then
      raise OLE_ERROR;
    end if;

    -- If argument list is not specified, then create an empty argument list and invoke
    -- the method using the emtpy list. This is required because the OLE2 bean requires
    -- an argument list. If no arguments are required, we just pass an empty argument list.
    if (arglist = 0) or (arglist is null) or (arglist='') then
      v_arglist := create_arglist;
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',v_arglist);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',method);
    v_javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_INVOKE_OBJ');
    if (v_javaHandle='') or (v_javaHandle=-1) or (v_javaHandle is null) then
      raise OLE_ERROR;
    end if;    

    v_objHandle := to_number(v_javaHandle);
    return(v_objHandle);

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.invoke_obj will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END invoke_obj;        


  <multilinecomment> Overloaded procedure used to set the property of an OLE Server to a String value </multilinecomment>
  PROCEDURE set_property (object IN obj_type,property IN VARCHAR2,value IN VARCHAR2,arglist IN list_type := 0) IS
    v_str varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;

    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    if (value is null) or (value = '') then
       if (OLE_NULL_COMPATIBILITY) then
       v_str := value;
     else
       RAISE OLE_ERROR;
     end if;    
    else
      -- Prefix string property values with 'S' as an indicator to the OLE bean
      v_str := 'S'||value;
    end if;    

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist=0) then
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY',v_str);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY_ARGS',v_str);
    end if;    

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.set_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END set_property;        


  <multilinecomment> Overloaded procedure used to set a property in an OLE Server to a numeric value </multilinecomment>
  PROCEDURE set_property (object IN obj_type,property IN VARCHAR2,value IN NUMBER,arglist IN list_type := 0) IS
    v_str varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    if (value is null) or (value='') then
      RAISE OLE_ERROR;
    else
      -- Prefix numeric property values with 'N' as an indicator to the OLE bean
      v_str := 'N'||to_char(value);
    end if;    

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist=0) then
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY',v_str);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY_ARGS',v_str);
    end if;    

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.set_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END set_property;        


  <multilinecomment> Overloaded procedure used to set the value of an OLE server to true or false </multilinecomment>
  PROCEDURE set_property (object IN obj_type,property IN VARCHAR2,value IN BOOLEAN,arglist IN list_type := 0) IS
    v_str varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;

    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;     

    if (value is null) then
      RAISE OLE_ERROR;
    else    
      -- Prefix boolean property values with 'B' as an indicator to the OLE bean
      v_str := 'B'||Webutil_util.BoolToStr(value);
    end if;    

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist=0) then
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY',v_str);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_SET_PROPERTY_ARGS',v_str);
    end if;    

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.set_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END set_property;        



  <multilinecomment> Function used to get the numeric value of a property </multilinecomment>
  FUNCTION get_num_property (object IN obj_type, property IN VARCHAR2, arglist IN list_type := 0) return NUMBER IS
    v_javares varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;
    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;     

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist = 0) then
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY');
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY_ARGS');
    end if;

    if (v_javares is null) or (v_javares ='') then
      raise OLE_ERROR;
    else     
      return(to_number(v_javares));
    end if; 

  EXCEPTION 
  when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                            ||' bean not found. CLIENT_OLE2.get_num_property will not work');
    RAISE OLE_ERROR; 
  when WebUtil_Core.PROPERTY_ERROR then 
    RAISE OLE_ERROR;
  when VALUE_ERROR then
    RAISE OLE_ERROR; 
  when OLE_ERROR then 
    RAISE FORM_TRIGGER_FAILURE;

  END get_num_property;    


  <multilinecomment> Function used to get the string value of a property </multilinecomment>
  FUNCTION get_char_property (object IN obj_type, property IN VARCHAR2, arglist IN list_type := 0) return VARCHAR2 IS
    v_javares varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;
    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;     

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist = 0) then
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY');
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY_ARGS');
    end if;

    return(v_javares);

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.get_char_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END get_char_property;        


  <multilinecomment> Function used to get the object handle value of a property </multilinecomment>
  FUNCTION get_obj_property (object IN obj_type, property IN VARCHAR2, arglist IN list_type := 0) return OBJ_TYPE IS
    v_javaHandle varchar2(6);
    v_objectHandle OBJ_TYPE;
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;

    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;     

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist = 0) then
      v_javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_OBJ_PROPERTY');
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      v_javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_OBJ_PROPERTY_ARGS');
    end if;

    if (v_javaHandle = 0) or (v_javaHandle='') or (v_javaHandle=-1) then
      raise OLE_ERROR;
    end if;    

    v_objectHandle := to_number(v_javaHandle);
    return(v_objectHandle);

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.get_obj_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END get_obj_property;        


  <multilinecomment> Function used to get the boolean value of a property </multilinecomment>
  FUNCTION get_bool_property (object IN obj_type, property IN VARCHAR2, arglist IN list_type := 0) return BOOLEAN IS
    v_javares varchar2(4000 char);
  BEGIN
    if (object is null) or (object = '') then
      raise OLE_ERROR;
    end if;

    if (property is null) or (property = '') then
      raise OLE_ERROR;
    end if;     

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',object);
    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_PROPNAME',property);
    if (arglist is null) or (arglist = '') or (arglist = 0) then
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY');
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_HANDLE',arglist);
      v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_GET_PROPERTY_ARGS');
    end if; 

    if (v_javares is null) or (v_javares = '')  then
      raise OLE_ERROR;
    end if;

    if (v_javares = 'true') or (v_javares = '-1') then
      return true;
    else
      return false;
    end if;

  EXCEPTION 
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.get_bool_property will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END get_bool_property;    


  <multilinecomment> Procedure used to destroy an OLE Object </multilinecomment>
  PROCEDURE release_obj(object IN OBJ_TYPE)IS
  BEGIN
    if (object is null) or (object='')or (object = -1) then
      raise OLE_ERROR;
    end if;  

    WebUtil_Core.setProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_RELEASE_OBJ',object);

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUO_PACKAGE)
                              ||' bean not found. CLIENT_OLE2.release_obj will not work');
      RAISE OLE_ERROR; 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE OLE_ERROR;
    when VALUE_ERROR then
      RAISE OLE_ERROR; 
    when OLE_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;

  END release_obj;


  <multilinecomment> Function which checks whether OLE is supported on the platform or not </multilinecomment>
  FUNCTION IsSupported return BOOLEAN is
    v_os_family PLS_INTEGER;
  BEGIN
    v_os_family := WebUtil_Core.GetClientOsFamily();
    if ( v_os_family = WebUtil_Core.CLIENT_PLATFORM_WIN32) then
      return true;
    else
      return false;
    end if;

  END IsSupported;


  <multilinecomment> This procedure is not available in conventional OLE2. It is used to persist the OLE Object when the
  OLE2 bean gets destroyed. This allows you to use the OLE Object across multiple forms </multilinecomment>
  PROCEDURE persist_ole_handle(object OBJ_TYPE) IS
  BEGIN
    if (object is null) or (object ='') or (object = -1) then
      raise OLE_ERROR;
    end if;        

    WebUtil_Core.PersistReference(WebUtil_Core.WUO_PACKAGE,object);
  EXCEPTION
    WHEN OLE_ERROR THEN
      raise FORM_TRIGGER_FAILURE;    

  END persist_ole_handle;    


  <multilinecomment> Function returns the OLE error number generated by the last OLE exception </multilinecomment>
  FUNCTION last_exception return NUMBER IS
    v_javares VARCHAR2(4000 char);
    v_errnum number;
  BEGIN
    v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ERROR');
    v_errnum := delimstr.getnumber(v_javares,1);
    return(v_errnum);

  END last_exception;    


  <multilinecomment> Function returns the OLE error number and error message generated by the last OLE exception </multilinecomment>
  FUNCTION last_exception(message OUT VARCHAR2) return NUMBER IS
    v_javares VARCHAR2(4000 char);
    v_errnum number;
    v_errmsg VARCHAR2(4000 char);
  BEGIN
    v_javares := WebUtil_Core.getProperty(WebUtil_Core.WUO_PACKAGE,'WUO_OLE2_ERROR');
    v_errnum := delimstr.getstring(v_javares,1);
    v_errmsg := delimstr.getstring(v_javares,2);
    message := v_errmsg;
    return(v_errnum);
  END last_exception;    


BEGIN
  -- Added DRMILLS - Force explicit instanciation of the CORE package
  WebUtil_Core.Init;     
END;     
		*/
		/* <p>
		*  Function used to create an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public UnknownTypes.ListType createArglist()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ListType vArglist= null;
//			NString vJavahandle= NString.getNull();
//			try
//			{
//				vJavahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_CREATE_ARGLIST"));
//				//  Check if the handle is valid
//				if ( (vJavahandle.isNull()) || (vJavahandle.equals("")) || (vJavahandle.equals("-1")) )
//				{
//					throw new OleError();
//				}
//				vArglist = toNumber(vJavahandle);
//				return ((vArglist));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.create_arglist will not work"));
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : createArglist function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Overloaded procedure used to add a numeric argument to an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param list
		* @param value
		*/
		public void addArg(UnknownTypes.ListType list, NNumber value)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				//  Check if argument list is valid
//				if ( (list.isNull()) || (list.equals("")) || (list.equals(0)) )
//				{
//					throw new OleError();
//				}
//				if ( (value.isNull()) || (value.equals("")) )
//				{
//					throw new OleError();
//				}
//				else {
//					//  Prefix argument with 'N' as an indicator to the OLE bean that it is a numeric argument
//					vStr = toStr("N").append(toChar(value));
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), list);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ADD_ARG"), vStr);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.add_arg will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addArg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Overloaded procedure used to add a boolean argument to an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param list
		* @param value
		*/
		public void addArg(UnknownTypes.ListType list, NBool value)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				//  check if argument list is valid        
//				if ( (list.isNull()) || (list.equals("")) || (list.equals(0)) )
//				{
//					throw new OleError();
//				}
//				if ((value.isNull()))
//				{
//					throw new OleError();
//				}
//				else {
//					//  Prefix boolean arguments with 'B' as an indicator to the OLE bean
//					vStr = toStr("B").append(getContainer().getWebutilUtil().booltostr(value));
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), list);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ADD_ARG"), vStr);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.add_arg will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addArg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Overloaded procedure used to add a string argument to an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param list
		* @param value
		*/
		public void addArg(UnknownTypes.ListType list, NString value)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				//  Check if argument list is valid
//				if ( (list.isNull()) || (list.equals("")) || (list.equals(0)) )
//				{
//					throw new OleError();
//				}
//				if ( (value.isNull()) || (value.equals("")) )
//				{
//					vStr = toStr(null);
//				}
//				else {
//					//  Prefix string arguments with 'S' as an indicator to the OLE bean
//					vStr = toStr("S").append(value);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), list);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ADD_ARG"), vStr);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.add_arg will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addArg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  procedure used to add an object handle to an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param list
		* @param value
		*/
		public void addArgObj(UnknownTypes.ListType list, UnknownTypes.ObjType value)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( (list.isNull()) || (list.equals("")) || (list.equals(0)) )
//				{
//					throw new OleError();
//				}
//				if (((value.isNull()) || (value.equals("")) || (value.equals(- (1)))))
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), list);
//				//  Prefix OLE Object handles with "O" as an indicator to the OLE bean
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ADD_ARG"), toStr("O").append(value));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.add_arg_obj will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : addArgObj procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  procedure used to destroy an argument list 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param list
		*/
		public void destroyArglist(UnknownTypes.ListType list)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( (list.isNull()) || (list.equals("")) || (list.equals(- (1))) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_DESTROY_ARGLIST"), list);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.destroy_arglist will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : destroyArglist procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Function used to create a new instance of an OLE Server 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		*/
		public UnknownTypes.ObjType createObj(NString _object)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ObjType vObjhandle= null;
//			NString vJavahandle= NString.getNull();
//			try
//			{
//				//  check if OLE object name is valid
//				if (((_object.isNull()) || (_object.equals(""))))
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_OBJNAME"), _object);
//				vJavahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_CREATE_OBJ"));
//				//  check if the OLE Object handle is valid
//				if ( (vJavahandle.isNull()) || (vJavahandle.equals("")) || (vJavahandle.equals("-1")) )
//				{
//					throw new OleError();
//				}
//				vObjhandle = toNumber(vJavahandle);
//				return ((vObjhandle));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.create_obj will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : createObj function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Procedure used to invoke a method in an OLE Server 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		*/
		public void invoke(UnknownTypes.ObjType _object, NString method) {
			invoke(_object, method, toObject(0));
		}

/* <p>
		*  Procedure used to invoke a method in an OLE Server 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		* @param arglist
		*/
		public void invoke(UnknownTypes.ObjType _object, NString method, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ListType vArglist= null;
//			try
//			{
//				if (((_object.isNull()) || (_object.equals(""))))
//				{
//					throw new OleError();
//				}
//				if (((method.isNull()) || (method.equals(""))))
//				{
//					throw new OleError();
//				}
//				//  If argument list is not specified, then create an empty argument list and invoke
//				//  the method using the emtpy list. This is required because the OLE bean requires
//				//  an argument list. If no arguments are required, we just pass an empty argument list.
//				if ( (arglist.equals(0)) || (arglist.isNull()) || (arglist.equals("")) )
//				{
//					vArglist = createArglist();
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), vArglist);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), method);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_INVOKE"), toBool(""));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.invoke will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invoke procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Function used to invoke a method in an OLE Server, which returns a numeric value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		*/
		public NNumber invokeNum(UnknownTypes.ObjType _object, NString method) {
			return invokeNum(_object, method, toObject(0));
		}

/* <p>
		*  Function used to invoke a method in an OLE Server, which returns a numeric value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		* @param arglist
		*/
		public NNumber invokeNum(UnknownTypes.ObjType _object, NString method, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ListType vArglist= null;
//			NString vJavares= NString.getNull();
//			try
//			{
//				if (((_object.isNull()) || (_object.equals(""))))
//				{
//					throw new OleError();
//				}
//				if (((method.isNull()) || (method.equals(""))))
//				{
//					throw new OleError();
//				}
//				//  If argument list is not specified, then create an empty argument list and invoke
//				//  the method using the emtpy list. This is required because the OLE bean requires
//				//  an argument list. If no arguments are required, we just pass an empty argument list.
//				if ( (arglist.equals(0)) || (arglist.isNull()) || (arglist.equals("")) )
//				{
//					vArglist = createArglist();
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), vArglist);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), method);
//				vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_INVOKE_STR"));
//				if ( (vJavares.isNull()) || (vJavares.equals("")) )
//				{
//					throw new OleError();
//				}
//				return ((toNumber(vJavares)));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.invoke_num will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invokeNum function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Function used to invoke a method in an OLE Server, which returns a string value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		*/
		public NString invokeChar(UnknownTypes.ObjType _object, NString method) {
			return invokeChar(_object, method, toObject(0));
		}

/* <p>
		*  Function used to invoke a method in an OLE Server, which returns a string value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		* @param arglist
		*/
		public NString invokeChar(UnknownTypes.ObjType _object, NString method, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ListType vArglist= null;
//			NString vJavares= NString.getNull();
//			try
//			{
//				if (((_object.isNull()) || (_object.equals(""))))
//				{
//					throw new OleError();
//				}
//				if (((method.isNull()) || (method.equals(""))))
//				{
//					throw new OleError();
//				}
//				//  If argument list is not specified, then create an empty argument list and invoke
//				//  the method using the emtpy list. This is required because the OLE2 bean requires
//				//  an argument list. If no arguments are required, we just pass an empty argument list.
//				if ( (arglist.equals(0)) || (arglist.isNull()) || (arglist.equals("")) )
//				{
//					vArglist = createArglist();
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), vArglist);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), method);
//				vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_INVOKE_STR"));
//				return ((vJavares));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.invoke_char will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invokeChar function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Function used to invoke a method in an OLE Server, which returns an OLE object handle 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		*/
		public UnknownTypes.ObjType invokeObj(UnknownTypes.ObjType _object, NString method) {
			return invokeObj(_object, method, toObject(0));
		}

/* <p>
		*  Function used to invoke a method in an OLE Server, which returns an OLE object handle 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param method
		* @param arglist
		*/
		public UnknownTypes.ObjType invokeObj(UnknownTypes.ObjType _object, NString method, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ListType vArglist= null;
//			NString vJavahandle= NString.getNull();
//			UnknownTypes.ObjType vObjhandle= null;
//			try
//			{
//				if (((_object.isNull()) || (_object.equals(""))))
//				{
//					throw new OleError();
//				}
//				if (((method.isNull()) || (method.equals(""))))
//				{
//					throw new OleError();
//				}
//				//  If argument list is not specified, then create an empty argument list and invoke
//				//  the method using the emtpy list. This is required because the OLE2 bean requires
//				//  an argument list. If no arguments are required, we just pass an empty argument list.
//				if ( (arglist.equals(0)) || (arglist.isNull()) || (arglist.equals("")) )
//				{
//					vArglist = createArglist();
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), vArglist);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), method);
//				vJavahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_INVOKE_OBJ"));
//				if ( (vJavahandle.equals("")) || (vJavahandle.equals(- (1))) || (vJavahandle.isNull()) )
//				{
//					throw new OleError();
//				}
//				vObjhandle = toNumber(vJavahandle);
//				return ((vObjhandle));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.invoke_obj will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : invokeObj function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Overloaded procedure used to set the property of an OLE Server to a String value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NString value) {
			setProperty(_object, property, value, toObject(0));
		}

/* <p>
		*  Overloaded procedure used to set the property of an OLE Server to a String value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		* @param arglist
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NString value, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				if ( (value.isNull()) || (value.equals("")) )
//				{
//					if ((oleNullCompatibility))
//					{
//						vStr = value;
//					}
//					else {
//						throw new OleError();
//					}
//				}
//				else {
//					//  Prefix string property values with 'S' as an indicator to the OLE bean
//					vStr = toStr("S").append(value);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY"), vStr);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY_ARGS"), vStr);
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.set_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : setProperty procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Overloaded procedure used to set a property in an OLE Server to a numeric value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NNumber value) {
			setProperty(_object, property, value, toObject(0));
		}

/* <p>
		*  Overloaded procedure used to set a property in an OLE Server to a numeric value 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		* @param arglist
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NNumber value, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				if ( (value.isNull()) || (value.equals("")) )
//				{
//					throw new OleError();
//				}
//				else {
//					//  Prefix numeric property values with 'N' as an indicator to the OLE bean
//					vStr = toStr("N").append(toChar(value));
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY"), vStr);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY_ARGS"), vStr);
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.set_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : setProperty procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Overloaded procedure used to set the value of an OLE server to true or false 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NBool value) {
			setProperty(_object, property, value, toObject(0));
		}

/* <p>
		*  Overloaded procedure used to set the value of an OLE server to true or false 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param value
		* @param arglist
		*/
		public void setProperty(UnknownTypes.ObjType _object, NString property, NBool value, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vStr= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ((value.isNull()))
//				{
//					throw new OleError();
//				}
//				else {
//					//  Prefix boolean property values with 'B' as an indicator to the OLE bean
//					vStr = toStr("B").append(getContainer().getWebutilUtil().booltostr(value));
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY"), vStr);
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_SET_PROPERTY_ARGS"), vStr);
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.set_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : setProperty procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Function used to get the numeric value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		*/
		public NNumber getNumProperty(UnknownTypes.ObjType _object, NString property) {
			return getNumProperty(_object, property, toObject(0));
		}

/* <p>
		*  Function used to get the numeric value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param arglist
		*/
		public NNumber getNumProperty(UnknownTypes.ObjType _object, NString property, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavares= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY"));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY_ARGS"));
//				}
//				if ( (vJavares.isNull()) || (vJavares.equals("")) )
//				{
//					throw new OleError();
//				}
//				else {
//					return ((toNumber(vJavares)));
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.get_num_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getNumProperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Function used to get the string value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		*/
		public NString getCharProperty(UnknownTypes.ObjType _object, NString property) {
			return getCharProperty(_object, property, toObject(0));
		}

/* <p>
		*  Function used to get the string value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param arglist
		*/
		public NString getCharProperty(UnknownTypes.ObjType _object, NString property, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavares= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY"));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY_ARGS"));
//				}
//				return ((vJavares));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.get_char_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getCharProperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Function used to get the object handle value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		*/
		public UnknownTypes.ObjType getObjProperty(UnknownTypes.ObjType _object, NString property) {
			return getObjProperty(_object, property, toObject(0));
		}

/* <p>
		*  Function used to get the object handle value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param arglist
		*/
		public UnknownTypes.ObjType getObjProperty(UnknownTypes.ObjType _object, NString property, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavahandle= NString.getNull();
//			UnknownTypes.ObjType vObjecthandle= null;
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					vJavahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_OBJ_PROPERTY"));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					vJavahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_OBJ_PROPERTY_ARGS"));
//				}
//				if ( (vJavahandle.equals(0)) || (vJavahandle.equals("")) || (vJavahandle.equals(- (1))) )
//				{
//					throw new OleError();
//				}
//				vObjecthandle = toNumber(vJavahandle);
//				return ((vObjecthandle));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.get_obj_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getObjProperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		*  Function used to get the boolean value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		*/
		public NBool getBoolProperty(UnknownTypes.ObjType _object, NString property) {
			return getBoolProperty(_object, property, toObject(0));
		}

/* <p>
		*  Function used to get the boolean value of a property 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param property
		* @param arglist
		*/
		public NBool getBoolProperty(UnknownTypes.ObjType _object, NString property, UnknownTypes.ListType arglist)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavares= NString.getNull();
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (property.isNull()) || (property.equals("")) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), _object);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_PROPNAME"), property);
//				if ( (arglist.isNull()) || (arglist.equals("")) || (arglist.equals(0)) )
//				{
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY"));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_HANDLE"), arglist);
//					vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_GET_PROPERTY_ARGS"));
//				}
//				if ( (vJavares.isNull()) || (vJavares.equals("")) )
//				{
//					throw new OleError();
//				}
//				if ( (vJavares.equals("true")) || (vJavares.equals("-1")) )
//				{
//					return  toBool(NBool.True);
//				}
//				else {
//					return  toBool(NBool.False);
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.get_bool_property will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getBoolProperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Procedure used to destroy an OLE Object 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		*/
		public void releaseObj(UnknownTypes.ObjType _object)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) || (_object.equals(- (1))) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_RELEASE_OBJ"), _object);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUO_PACKAGE).append(" bean not found. CLIENT_OLE2.release_obj will not work"));
//				throw new OleError();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new OleError();
//			}
//			catch(ValueErrorException e)
//			{
//				throw new OleError();
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : releaseObj procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Function which checks whether OLE is supported on the platform or not 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool issupported()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger vOsFamily= NInteger.getNull();
//			vOsFamily = getContainer().getWebutilCore().getclientosfamily();
//			if ((vOsFamily.equals(getWebutilcore().CLIENT_PLATFORM_WIN32)))
//			{
//				return  toBool(NBool.True);
//			}
//			else {
//				return  toBool(NBool.False);
//			}
//
			this.getLogger().trace(this, "F2J : issupported function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  This procedure is not available in conventional OLE2. It is used to persist the OLE Object when the
		* OLE2 bean gets destroyed. This allows you to use the OLE Object across multiple forms 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		*/
		public void persistOleHandle(UnknownTypes.ObjType _object)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( (_object.isNull()) || (_object.equals("")) || (_object.equals(- (1))) )
//				{
//					throw new OleError();
//				}
//				getContainer().getWebutilCore().persistreference(getWebutilcore().WUO_PACKAGE, _object);
//			}
//			catch(OleError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : persistOleHandle procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Function returns the OLE error number generated by the last OLE exception 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NNumber lastException()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavares= NString.getNull();
//			NNumber vErrnum= NNumber.getNull();
//			vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ERROR"));
//			vErrnum = getContainer().getDelimstr().getnumber(vJavares, toNumber(1));
//			return ((vErrnum));
//
			this.getLogger().trace(this, "F2J : lastException function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Function returns the OLE error number and error message generated by the last OLE exception 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param message
		*/
		public NNumber lastException(Ref<NString> message)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vJavares= NString.getNull();
//			NNumber vErrnum= NNumber.getNull();
//			NString vErrmsg= NString.getNull();
//			vJavares = getContainer().getWebutilCore().getproperty(getWebutilcore().WUO_PACKAGE, toStr("WUO_OLE2_ERROR"));
//			vErrnum = toNumber(getContainer().getDelimstr().getstring(vJavares, toNumber(1)));
//			vErrmsg = getContainer().getDelimstr().getstring(vJavares, toNumber(2));
//			message.val = vErrmsg;
//			return ((vErrnum));
//
			this.getLogger().trace(this, "F2J : lastException function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
		public ClientOle2() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Added DRMILLS - Force explicit instanciation of the CORE package
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : ClientOle2 Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
