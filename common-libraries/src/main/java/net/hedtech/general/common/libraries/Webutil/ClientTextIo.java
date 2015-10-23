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


public class ClientTextIo extends AbstractSupportCodeObject {
	

	public ClientTextIo(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_TEXT_IO
	/*
	PACKAGE CLIENT_TEXT_IO IS
<multilinecomment>********************************************************************************\
 * CLIENT_TEXT_IO
 *   This package duplicates the action of the TEXT_IO package, except that it 
 *   operates on the client (browser) tier rather than the Applcation server tier.  
 *   Existing TEXT_IO code can be re-directed to run on the client simply by 
 *   prefixing all the calls with "CLIENT_" 
 *   The functions in this package will work with any client type - not just 
 *   Windows clients.
 *   The oracle.forms.webutil.file.FileFunctions bean is needed in your 
 *   Form to use these functions
  *********************************************************************************
 * Version 1.0.2
 *********************************************************************************
 * Change History
 *   1.0.0  DRMILLS 21/DEC/2002 - Creation 
 *   1.0.1  DRMILLS 31/JAN/2003 - Added function to allow a File_Type to
 *                                be persisted across Forms
 *                                (fclose will still clean it up)
 *   1.0.2  DRMILLS 13/MAY/2003 - Added Call to WebUtil_Core.Init
\********************************************************************************</multilinecomment>

  <multilinecomment>* 
   * The TEXT_IO file type
   </multilinecomment>
  TYPE file_type IS RECORD (handle PLS_INTEGER);
  
  <multilinecomment>* 
   * File lifetime functions
   </multilinecomment>
  FUNCTION fopen(spec VARCHAR2, filemode VARCHAR2, charSet VARCHAR2 := null) RETURN file_type;
  
  FUNCTION is_open(file file_type) RETURN BOOLEAN;
 
  PROCEDURE fclose (file IN OUT file_type);
  
  -- ## This is not part of traditional TEXT_IO ##
  PROCEDURE persist_file_handle(file file_type);
  
  <multilinecomment>*
   * File reading functions
   </multilinecomment>
  PROCEDURE get_line (file file_type, item OUT VARCHAR2);
  
  <multilinecomment>*
   * File writing functions
   </multilinecomment>
  PROCEDURE put (file file_type, item VARCHAR2);
  PROCEDURE put (file file_type, item DATE);
  PROCEDURE put (file file_type, item NUMBER);
  
  PROCEDURE new_line (file file_type, n PLS_INTEGER := 1);

  PROCEDURE put_line (file file_type, item VARCHAR2);
  
  
  procedure putf (file   file_type, 
                  arg    VARCHAR2);
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2);
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2);
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2);
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2);
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2,
                  arg5   VARCHAR2);
   
 <multilinecomment>* 
  * Console writing functions.
  * In client server versions of Forms these only write to the debug console
  * when running in debug mode.
  * To provide parity, when running on the web these get sent to the Java Console 
  * of the Client Side JVM, which is actually more useful than the client server 
  * behaviour
  </multilinecomment>   
  PROCEDURE put (item VARCHAR2);
  PROCEDURE put (item DATE);
  PROCEDURE put (item NUMBER);
  
  PROCEDURE new_line (n PLS_INTEGER := 1);

  PROCEDURE put_line (item VARCHAR2);
  
  
  procedure putf (arg    VARCHAR2);
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2);
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2);
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2);
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2);
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2,
                  arg5   VARCHAR2);
END CLIENT_TEXT_IO;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_TEXT_IO
		/*
		PACKAGE BODY CLIENT_TEXT_IO IS
  -- PACKAGE Vars
  CONSOLE FILE_TYPE;

  <multilinecomment>* 
   * File lifetime functions
   </multilinecomment>
  FUNCTION fopen(spec VARCHAR2, filemode VARCHAR2, charSet VARCHAR2 := null) RETURN file_type is
    clientFile file_type;
    javaHandle VARCHAR2(6);
  BEGIN
    -- check the mode is valid
    if (lower(filemode) not in ('r','w','a')) then 
      raise TOOL_ERR.TOOL_ERROR;
    end if;

    -- make sure a file name has been specified      
    if (spec is null) or (spec='') then
      raise TOOL_ERR.TOOL_ERROR;
    end if;
      
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',spec, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_FILEMODE',filemode, true);        
    if (charSet is null) then
        WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_CHARSET','(null)', true);
    else
        WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_CHARSET',charSet, true);
    end if;
    javaHandle := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_OPEN');

    -- If the return is null then the file was not opened      
    if (javaHandle is null) or (javaHandle='') or (javaHandle='-1') then
      raise TOOL_ERR.TOOL_ERROR;
    end if;

    -- if we are this far convert the handle to the correct format and return it.      
    clientFile.handle := to_number(javaHandle);
    return clientFile;

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.fopen will not work');
    RAISE TOOL_ERR.TOOL_ERROR;                                 
      return null;
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE;
    when VALUE_ERROR then
      RAISE TOOL_ERR.TOOL_ERROR; 
    when TOOL_ERR.TOOL_ERROR then 
      RAISE;
  END fopen; 
  
  FUNCTION is_open(file file_type) RETURN BOOLEAN IS
  BEGIN
    IF file.handle IS NULL THEN
      RETURN(FALSE);
    ELSE
      RETURN(TRUE);
    END IF;
  END is_open;
 
  PROCEDURE fclose (file IN OUT file_type) is 
  BEGIN 
    if (file.handle IS NOT NULL) then 
      WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_CLOSE',file.handle);        
      file.handle := NULL;
    end if;
 
 EXCEPTION
  when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                            ||' bean not found. CLIENT_TEXT_IO.fclose will not work');
    RAISE TOOL_ERR.TOOL_ERROR;                                                                 
  when WebUtil_Core.PROPERTY_ERROR then 
    RAISE TOOL_ERR.TOOL_ERROR;
  END fclose;
  
  
  PROCEDURE persist_file_handle(file file_type) is
  BEGIN
    WebUtil_Core.PersistReference(WebUtil_Core.WUF_PACKAGE,file.handle);
  END persist_file_handle;  
  
  <multilinecomment>*
   * File reading functions
   </multilinecomment>
  PROCEDURE get_line (file file_type, item OUT VARCHAR2) is
    buffer VARCHAR2(4000 char);
  BEGIN 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);        
    buffer := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_GETLINE');
    -- We can't easily tell the difference between an empty line and a line beyond then 
    -- end of the file so to get around this, the exception handling code in the PJC 
    -- places a newline into the buffer when the end of file is passed.
    -- The rational being that get_line would never normally return a newline because 
    -- it normally uses that to tell it where to read up *to*.
    if buffer = chr(10) then 
      raise NO_DATA_FOUND;
    else
      item := buffer;
    end if;

  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.get_line will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END get_line;
  
  <multilinecomment>*
   * File writing functions
   </multilinecomment>
  PROCEDURE put (file file_type, item VARCHAR2) IS
  BEGIN 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUT',item);        
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.put will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END put;
  
  PROCEDURE put (file file_type, item DATE) is
  BEGIN
    -- rely in the setting of PLSQL_DATE_FORMAT to 
    -- define the output mask for the date.
    CLIENT_TEXT_IO.put(file, to_char(item));
  END put;
  
  PROCEDURE put (file file_type, item NUMBER) is
  BEGIN
    CLIENT_TEXT_IO.put(file, to_char(item));
  END put;
  
  
  PROCEDURE new_line (file file_type, n PLS_INTEGER := 1) is
  BEGIN 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_NEWLINE',n);      
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.new_line will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END new_line;
    

  PROCEDURE put_line (file file_type, item VARCHAR2) is
  BEGIN 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUT',item); 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_NEWLINE',1); 
  EXCEPTION
  when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                            ||' bean not found. CLIENT_TEXT_IO.put_line will not work');
    RAISE TOOL_ERR.TOOL_ERROR;                                                                 
  when WebUtil_Core.PROPERTY_ERROR then 
    RAISE TOOL_ERR.TOOL_ERROR;  
  END put_line;
   
  
  
  procedure putf (file   file_type, 
                  arg    VARCHAR2) is 
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',arg); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;
                  
  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg1);        
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',format); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;

  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg1);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg2);        
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',format); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;

  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg1);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg2);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg3);        
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',format); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;

  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg1);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg2);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg3);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg4);                
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',format); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;

  procedure putf (file   file_type, 
                  format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2,
                  arg5   VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_HANDLE',file.handle);              
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg1);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg2);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg3);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg4);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_ARG',arg5);                
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_TEXTIO_PUTF',format); 
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. CLIENT_TEXT_IO.putf will not work');
      RAISE TOOL_ERR.TOOL_ERROR;                                                                 
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE TOOL_ERR.TOOL_ERROR;  
  END putf;     
 
  -- Console functions - these reuse the above calls but using a "Magic" file handle
  PROCEDURE put (item VARCHAR2) is
  BEGIN
    put(CONSOLE,item);
  END put;
  
  PROCEDURE put (item DATE) is
  BEGIN
    put(CONSOLE,item);
  END put;
  
  PROCEDURE put (item NUMBER) is
  BEGIN
    put(CONSOLE,item);
  END put;
  
  PROCEDURE new_line (n PLS_INTEGER := 1) is
  BEGIN
    new_line(CONSOLE,n);
  END new_line;

  PROCEDURE put_line (item VARCHAR2) is
  BEGIN
    put_line(CONSOLE,item);
  END put_line;
  
  
  procedure putf (arg    VARCHAR2) is
  BEGIN
    putf(CONSOLE,arg);
  END putf;
  
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2) is
  BEGIN
    putf(CONSOLE,format,arg1);
  END putf;
  
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2) is
  BEGIN
    putf(CONSOLE,format,arg1,arg2);
  END putf;
  
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2) is
  BEGIN
    putf(CONSOLE,format,arg1,arg2,arg3);
  END putf;
  
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2) is
  BEGIN
    putf(CONSOLE,format,arg1,arg2,arg3,arg4);
  END putf;
  
  procedure putf (format VARCHAR2,
                  arg1   VARCHAR2,
                  arg2   VARCHAR2,
                  arg3   VARCHAR2,
                  arg4   VARCHAR2,
                  arg5   VARCHAR2) is
  BEGIN
    putf(CONSOLE,format,arg1,arg2,arg3,arg4,arg5);
  END putf;  
  
BEGIN
  -- Set up the magic file handle for writing to the Java Console      
  CONSOLE.handle := -2;      
  -- Explictly instanciate the Core
  WebUtil_Core.Init;
END CLIENT_TEXT_IO;
		*/
				//  PACKAGE Vars
		private Clienttextio.FileType console= null;
/* <p>
		* *
		* * File lifetime functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param spec
		* @param filemode
		*/
		public Clienttextio.FileType fopen(NString spec, NString filemode) {
			return fopen(spec, filemode, NString.getNull());
		}

/* <p>
		* *
		* * File lifetime functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param spec
		* @param filemode
		* @param charset
		*/
		public Clienttextio.FileType fopen(NString spec, NString filemode, NString charset)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			Clienttextio.FileType clientfile= null;
//			NString javahandle= NString.getNull();
//			try
//			{
//				//  check the mode is valid
//				if ((!in(lower(filemode), "r", "w", "a").getValue()))
//				{
//					throw new Exception();
//				}
//				//  make sure a file name has been specified      
//				if ( (spec.isNull()) || (spec.equals("")) )
//				{
//					throw new Exception();
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), spec, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_FILEMODE"), filemode, toBool(NBool.True));
//				if ((charset.isNull()))
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_CHARSET"), toBool("(null)"), toBool(NBool.True));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_CHARSET"), charset, toBool(NBool.True));
//				}
//				javahandle = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_OPEN"));
//				//  If the return is null then the file was not opened      
//				if ( (javahandle.isNull()) || (javahandle.equals("")) || (javahandle.equals("-1")) )
//				{
//					throw new Exception();
//				}
//				//  if we are this far convert the handle to the correct format and return it.      
//				clientfile.Handle = toNumber(javahandle);
//				return clientfile;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.fopen will not work"));
//				throw new Exception();
//				return null;
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
			this.getLogger().trace(this, "F2J : fopen function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		*/
		public NBool isOpen(Clienttextio.FileType file)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( file.Handle.isNull() )
//			{
//				return  toBool(((NBool.False)));
//			}
//			else {
//				return  toBool(((NBool.True)));
//			}
//
			this.getLogger().trace(this, "F2J : isOpen function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		*/
		public void fclose(Ref<Clienttextio.FileType> file)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ((!file.Handle.isNull()))
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_CLOSE"), file.Handle);
//					file.Handle = null;
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.fclose will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : fclose procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		*/
		public void persistFileHandle(Clienttextio.FileType file)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getContainer().getWebutilCore().persistreference(getWebutilcore().WUF_PACKAGE, file.Handle);
//
			this.getLogger().trace(this, "F2J : persistFileHandle procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* *
		* * File reading functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param _item
		*/
		public void getLine(Clienttextio.FileType file, Ref<NString> _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString buffer= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				buffer = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_GETLINE"));
//				//  We can't easily tell the difference between an empty line and a line beyond then 
//				//  end of the file so to get around this, the exception handling code in the PJC 
//				//  places a newline into the buffer when the end of file is passed.
//				//  The rational being that get_line would never normally return a newline because 
//				//  it normally uses that to tell it where to read up *to*.
//				if ( buffer.equals(chr(10)) )
//				{
//					throw new NoDataFoundException();
//				}
//				else {
//					_item.val = buffer;
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.get_line will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : getLine procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* *
		* * File writing functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param _item
		*/
		public void put(Clienttextio.FileType file, NString _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUT"), _item);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.put will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param _item
		*/
		public void put(Clienttextio.FileType file, NDate _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  rely in the setting of PLSQL_DATE_FORMAT to 
//			//  define the output mask for the date.
//			put(file, toChar(_item));
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param _item
		*/
		public void put(Clienttextio.FileType file, NNumber _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			put(file, toChar(_item));
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		*/
		public void newLine(Clienttextio.FileType file) {
			newLine(file, toInt(1));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param n
		*/
		public void newLine(Clienttextio.FileType file, NInteger n)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_NEWLINE"), n);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.new_line will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : newLine procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param _item
		*/
		public void putLine(Clienttextio.FileType file, NString _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUT"), _item);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_NEWLINE"), toBool(1));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.put_line will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putLine procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param arg
		*/
		public void putf(Clienttextio.FileType file, NString arg)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), arg);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param format
		* @param arg1
		*/
		public void putf(Clienttextio.FileType file, NString format, NString arg1)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg1);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), format);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param format
		* @param arg1
		* @param arg2
		*/
		public void putf(Clienttextio.FileType file, NString format, NString arg1, NString arg2)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg1);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg2);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), format);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		*/
		public void putf(Clienttextio.FileType file, NString format, NString arg1, NString arg2, NString arg3)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg1);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg2);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg3);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), format);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		* @param arg4
		*/
		public void putf(Clienttextio.FileType file, NString format, NString arg1, NString arg2, NString arg3, NString arg4)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg1);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg2);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg3);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg4);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), format);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param file
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		* @param arg4
		* @param arg5
		*/
		public void putf(Clienttextio.FileType file, NString format, NString arg1, NString arg2, NString arg3, NString arg4, NString arg5)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_HANDLE"), file.Handle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg1);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg2);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg3);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg4);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_ARG"), arg5);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_TEXTIO_PUTF"), format);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. CLIENT_TEXT_IO.putf will not work"));
//				throw new Exception();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new Exception();
//			}
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Console functions - these reuse the above calls but using a "Magic" file handle
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _item
		*/
		public void put(NString _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			put(console, _item);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _item
		*/
		public void put(NDate _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			put(console, _item);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _item
		*/
		public void put(NNumber _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			put(console, _item);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void newLine() {
			newLine(toInt(1));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param n
		*/
		public void newLine(NInteger n)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			newLine(console, n);
//
			this.getLogger().trace(this, "F2J : newLine procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _item
		*/
		public void putLine(NString _item)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putLine(console, _item);
//
			this.getLogger().trace(this, "F2J : putLine procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param arg
		*/
		public void putf(NString arg)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, arg);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param format
		* @param arg1
		*/
		public void putf(NString format, NString arg1)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, format, arg1);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param format
		* @param arg1
		* @param arg2
		*/
		public void putf(NString format, NString arg1, NString arg2)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, format, arg1, arg2);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		*/
		public void putf(NString format, NString arg1, NString arg2, NString arg3)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, format, arg1, arg2, arg3);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		* @param arg4
		*/
		public void putf(NString format, NString arg1, NString arg2, NString arg3, NString arg4)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, format, arg1, arg2, arg3, arg4);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param format
		* @param arg1
		* @param arg2
		* @param arg3
		* @param arg4
		* @param arg5
		*/
		public void putf(NString format, NString arg1, NString arg2, NString arg3, NString arg4, NString arg5)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			putf(console, format, arg1, arg2, arg3, arg4, arg5);
//
			this.getLogger().trace(this, "F2J : putf procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		public ClientTextIo() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Set up the magic file handle for writing to the Java Console      
//			console.Handle = - (2);
//			//  Explictly instanciate the Core
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : ClientTextIo Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class FileType{
	public NInteger handle;
}



	
}
