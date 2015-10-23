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


public class WebutilFile extends AbstractSupportCodeObject {
	

	public WebutilFile(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_FILE
	/*
	PACKAGE WEBUTIL_FILE IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_FILE
 *   This Package contains routines to do basic File handling on the client
 *   machine - this includes reading and writing, deleting etc.
 *   This Package also provides the implementation for the Client Version of 
 *   GET_FILE_NAME for File selection dialogs
 *   The functions in this package will work with any client type - not just 
 *   Windows clients.
 *   The oracle.forms.webutil.file.FileFunctions bean is needed in your 
 *   Form to use these functions
 *********************************************************************************
 * Version 1.0.3
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 23/DEC/2002 - Creation
 *   1.0.1 DRMILLS 20/JAN/2003 - Added Copy File functionality 
 *   1.0.2 DRMILLS 12/MAR/2003 - Fix for 2846355 - Value error after cancelling
 *                               FILE_MULTI_SELECTION_DIALOG()
 *   1.0.3 DRMILLS 13/MAY/2003 - Added call for WebUtil_Core.Init;
 *   1.0.3 OSINGH  06/NOV/2003 - Corrected the spelling of SEPARATOR and WRITABLE
 *
\********************************************************************************</multilinecomment>
  <multilinecomment>* 
   * A Type to hold the Array of file names returned by FILE_MULTI_SELECTION_DIALOG
   * and directory listing functions 
   </multilinecomment>
  TYPE FILE_LIST is TABLE of VARCHAR2(1000) index by BINARY_INTEGER;


  <multilinecomment>* 
   * Basic Implementation of a file / directory selection dialog
   * Maps onto the GET_FILE_NAME built-in usage
   </multilinecomment>
  FUNCTION FILE_SELECTION_DIALOG(       directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL,
                                        dialog_type    Number   := OPEN_FILE,
                                        select_file    Boolean  := TRUE) return Varchar2;
                                        
  <multilinecomment>* 
   * File / Directory selection dialog which allows the selection
   * of multiple files. 
   * The selection is returned in a PL/SQL table of type FILE_LIST
   </multilinecomment>
  FUNCTION FILE_MULTI_SELECTION_DIALOG( directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL,
                                        dialog_type    Number   := OPEN_FILE,
                                        select_file    Boolean  := TRUE) return WEBUTIL_FILE.FILE_LIST;                                          
                                        
  <multilinecomment>* 
   * Convenience Function for Creating a File Open dialog
   </multilinecomment>  
  FUNCTION FILE_OPEN_DIALOG(            directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2;
                                        
  <multilinecomment>* 
   * Convenience Function for Creating a File Save dialog
   </multilinecomment>  
  FUNCTION FILE_SAVE_DIALOG(            directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2;
                                        
  <multilinecomment>* 
   * Convenience Function for Creating a Directory Selection dialog
   </multilinecomment>    
  FUNCTION DIRECTORY_SELECTION_DIALOG(  directory_name Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2;
                                        
  <multilinecomment>* 
   * Function to check if a File was actually Selected by one of the dialog
   * functions or if the user actually pressed cancel
   </multilinecomment>  
  FUNCTION FILE_DIALOG_SELECTION_MADE return BOOLEAN;                                       
                                        
  <multilinecomment>* 
   * Function to check if a client side file or directory exists or not
   </multilinecomment>  
  FUNCTION FILE_EXISTS(                 file_name      Varchar2) return BOOLEAN;

  <multilinecomment>* 
   * Function to check if a client side file is readable
   </multilinecomment>  
  FUNCTION FILE_IS_READABLE(            file_name      Varchar2) return BOOLEAN;  

  <multilinecomment>* 
   * Function to check if a client side file is writable
   </multilinecomment>  
  FUNCTION FILE_IS_WRITABLE(           file_name      Varchar2) return BOOLEAN;  

  <multilinecomment>* 
   * Function to check if a client side file is actually a directory
   </multilinecomment>  
  FUNCTION FILE_IS_DIRECTORY(           file_name      Varchar2) return BOOLEAN;  

  <multilinecomment>* 
   * Function to check if a client side file is hidden
   </multilinecomment>  
  FUNCTION FILE_IS_HIDDEN(              file_name      Varchar2) return BOOLEAN;  

  <multilinecomment>* 
   * Function to get the size of the specified file in bytes
   </multilinecomment>  
  FUNCTION FILE_SIZE(                   file_name      Varchar2) return NUMBER;  

  -- Create, rename and Delete functions
  <multilinecomment>* 
   * Function to create a directory on the client
   * The directory name should be the full path to
   * the directory to be created. 
   * WebUtil will create any intermediate directories 
   * as well as the final one if required
   * Returns TRUE if the create was successful
   * If the directory already exists the call will fail.
   * You can use the FILE_IS_DIRECTORY function to check 
   * to see if the directory already exists before creating
   * it.
   </multilinecomment>  
  FUNCTION CREATE_DIRECTORY(            directory_name      Varchar2) return BOOLEAN;  
  
  <multilinecomment>*
   * Function to return a list of all the files in a directory
   * The Return_Files_Only argument indicates if the list returned 
   * should not include the names of any subdirectories.
   </multilinecomment>
  FUNCTION DIRECTORY_LIST(             directory_name      Varchar2,
                                       return_files_only   Boolean := FALSE) return WEBUTIL_FILE.FILE_LIST;
  <multilinecomment>*
   * Function to return a list of all the files in a directory
   * The Return_Files_Only argument indicates if the list returned 
   * should not include the names of any subdirectories   
   * This version allows you to specify a specific filter to restrict
   * the list of files that is returned.  If Return_Files_Only is set to 
   * false, then directory names will be returned even though they do not
   * match the filter.
   * The filter format is simply the acceptable extension e.g. "t*.fmb"
   * case is ignored.
   </multilinecomment>
  FUNCTION DIRECTORY_FILTERED_LIST(    directory_name      Varchar2,
                                       file_filter         Varchar2,
                                       return_files_only   Boolean := FALSE) return WEBUTIL_FILE.FILE_LIST; 

  <multilinecomment>*
   * Function to return a list of all the directory Roots
   * on the client.
   * On Unix Clients this will only ever return "/" but 
   * on Windows Platforms it will return a list of Drives
   </multilinecomment>
  FUNCTION DIRECTORY_ROOT_LIST return WEBUTIL_FILE.FILE_LIST; 

  <multilinecomment>* 
   * Function to rename a file or directory
   * Returns TRUE if the rename was successful
   </multilinecomment>  
  FUNCTION RENAME_FILE(                 file_name      Varchar2,
                                        new_name       Varchar2) return BOOLEAN;   
  <multilinecomment>* 
   * Function to copy a file (not a directory)
   * Returns TRUE if the copy was successful
   </multilinecomment>  
  FUNCTION COPY_FILE(                   file_name      Varchar2,
                                        new_name       Varchar2) return BOOLEAN;                                           

  <multilinecomment>* 
   * Function to delete a specified client side file or empty Directory
   * Returns TRUE if the delete was successful
   </multilinecomment>  
  FUNCTION DELETE_FILE(                 file_name      Varchar2) return BOOLEAN;  
   
  
  -- Various Information Functions - simply overloaded from WebUtil_Core.
  -- and duplicated in WebUtil_ClientInfo
  <multilinecomment>*
   * GET_PATH_SEPARATOR - returns the path separator used by the client OS
   * e.g. ";" on a Windows Client, ":" on Unix/Linux
   </multilinecomment> 
  FUNCTION GET_PATH_SEPARATOR return VARCHAR2;
  
  <multilinecomment>*
   * GET_FILE_SEPARATOR - returns the file separator used by the client OS
   * e.g. "\" on a Windows Client, "/" on Unix/Linux   
   </multilinecomment> 
  FUNCTION GET_FILE_SEPARATOR return VARCHAR2;
   
END WEBUTIL_FILE;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_FILE
		/*
		PACKAGE BODY WEBUTIL_FILE IS
  INVALID_CLIENT_FILE_DIR  EXCEPTION;
  NULL_CLIENT_DIRECTORY    EXCEPTION;
  -- Private Variables
  ATTR_EXISTS       CONSTANT PLS_INTEGER := 1;
  ATTR_READABLE     CONSTANT PLS_INTEGER := 2;
  ATTR_WRITABLE     CONSTANT PLS_INTEGER := 3;
  ATTR_IS_DIRECTORY CONSTANT PLS_INTEGER := 4;
  ATTR_IS_HIDDEN    CONSTANT PLS_INTEGER := 5;
  ATTR_SIZE         CONSTANT PLS_INTEGER := 6;  
    
  
  
  
  -- Private method declarations --------------------------------------
  FUNCTION FILE_SELECTION_DIALOG_INT(   directory_name Varchar2,
                                        file_name      Varchar2,
                                        file_filter    Varchar2,
                                        title          Varchar2,
                                        dialog_type    Number,
                                        select_file    Boolean,
                                        multiselect    Boolean) return Varchar2;
                                        
  FUNCTION GET_ATTRIBUTE_INT(           file_name      Varchar2,
                                        attributeID    Pls_Integer) return Varchar2;    


  
  -- Private method implementations -----------------------------------
  FUNCTION FILE_SELECTION_DIALOG_INT(   directory_name Varchar2,
                                        file_name      Varchar2,
                                        file_filter    Varchar2,
                                        title          Varchar2,
                                        dialog_type    Number,
                                        select_file    Boolean,
                                        multiselect    Boolean) return Varchar2 is
    result varchar2(4000);     
  BEGIN  
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_DIRNAME', directory_name);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',file_name, true);     
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILTER',  file_filter); 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_MESSAGE', title); 
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_MULTISELECT', multiselect,true);     
  
    if (dialog_type = SAVE_FILE) then 
        result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_SAVEFILE');
    elsif (not select_file) then
        result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_OPENDIR');
    else
        result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_OPENFILE');
    end if;
  
    -- handle the situation which we can get with JFileChooser with escaped "\"
    result := replace(result,'\\','\');
    return result;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.FILE_SELECTION_DIALOG_INT will not work');
      RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END FILE_SELECTION_DIALOG_INT;                                         

  FUNCTION GET_ATTRIBUTE_INT(           file_name      Varchar2,
                                        attributeID    Pls_Integer) return Varchar2 is
    result Varchar2(50);   
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',file_name, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILE_ATTRIBUTE',to_char(attributeID), true);
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILE_ATTRIBUTE');
    
    RETURN result;                      
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.GET_ATTRIBUTE_INT will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END GET_ATTRIBUTE_INT;                                         
                                        
  -- Public method implementations ------------------------------------
  FUNCTION FILE_SELECTION_DIALOG(       directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL,
                                        dialog_type    Number   := OPEN_FILE,
                                        select_file    Boolean  := TRUE) return Varchar2 is
  BEGIN
    RETURN FILE_SELECTION_DIALOG_INT(   directory_name,
                                        file_name,
                                        file_filter,
                                        title,
                                        dialog_type,
                                        select_file,
                                        FALSE); 
  END FILE_SELECTION_DIALOG;                                       
                                        
  FUNCTION FILE_MULTI_SELECTION_DIALOG( directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL,
                                        dialog_type    Number   := OPEN_FILE,
                                        select_file    Boolean  := TRUE) return WEBUTIL_FILE.FILE_LIST is
    buffer         varchar2(32000);
    dirName        varchar2(1000);
    selectionCount PLS_INTEGER;
    fileList       WEBUTIL_FILE.FILE_LIST;
  BEGIN
    buffer :=  FILE_SELECTION_DIALOG_INT(   directory_name,
                                            file_name,
                                            file_filter,
                                            title,
                                            dialog_type,
                                            select_file,
                                            TRUE); 
    -- Bug 2846355                                            
    if buffer is not null then                                             
      -- Multi-select returns a String delimited with newlines
      -- with the first element being the directory
      -- This is an efficient way of doing it as we only 
      -- need one routrip to get the full selection
      -- but we could hit a problem if the total length of
      -- the directory & filenames exceeds the buffer size                                         
      selectionCount := DelimStr.Counter(buffer,false,chr(10));
      dirName := DelimStr.GetString(buffer,1,false,chr(10));
      for i in 2..selectionCount LOOP
        fileList(i-1) := dirName||DelimStr.GetString(buffer,i,false,chr(10));       
      end LOOP;                                               
    end if;
    RETURN fileList;                                            
  END FILE_MULTI_SELECTION_DIALOG;                                       
                                                                              
  FUNCTION FILE_OPEN_DIALOG(            directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2 is
  BEGIN
    RETURN FILE_SELECTION_DIALOG_INT(   directory_name,
                                        file_name,
                                        file_filter,
                                        title,
                                        OPEN_FILE,
                                        TRUE,
                                        FALSE); 
  END FILE_OPEN_DIALOG;                                                                               
                                        
  FUNCTION FILE_SAVE_DIALOG(            directory_name Varchar2 := NULL,
                                        file_name      Varchar2 := NULL,
                                        file_filter    Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2 is
  BEGIN
    RETURN FILE_SELECTION_DIALOG_INT(   directory_name,
                                        file_name,
                                        file_filter,
                                        title,
                                        SAVE_FILE,
                                        TRUE,
                                        FALSE); 
  END FILE_SAVE_DIALOG;                                                                 
                                        
  FUNCTION DIRECTORY_SELECTION_DIALOG(  directory_name Varchar2 := NULL,
                                        title          Varchar2 := NULL) return Varchar2 is
  BEGIN
    RETURN FILE_SELECTION_DIALOG_INT(   directory_name,
                                        NULL,
                                        NULL,
                                        title,
                                        OPEN_FILE,
                                        FALSE,
                                        FALSE); 
  END DIRECTORY_SELECTION_DIALOG;  
  
  FUNCTION FILE_DIALOG_SELECTION_MADE return BOOLEAN is
    result varchar2(6);
  BEGIN
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_GFN_SELECTION_MADE');
    RETURN (result='TRUE');                       
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.FILE_DIALOG_SELECTION_MADE will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE; 
  END FILE_DIALOG_SELECTION_MADE;
                                        
  FUNCTION FILE_EXISTS(                 file_name      Varchar2) return BOOLEAN is
  BEGIN
    return (GET_ATTRIBUTE_INT(file_name,ATTR_EXISTS)='TRUE');
  END FILE_EXISTS; 
  
  FUNCTION FILE_IS_READABLE(            file_name      Varchar2) return BOOLEAN is
  BEGIN
    return (GET_ATTRIBUTE_INT(file_name,ATTR_READABLE)='TRUE');
  END FILE_IS_READABLE; 

  FUNCTION FILE_IS_WRITABLE(           file_name      Varchar2) return BOOLEAN is
  BEGIN
    return (GET_ATTRIBUTE_INT(file_name,ATTR_WRITABLE)='TRUE');
  END FILE_IS_WRITABLE; 
  
  FUNCTION FILE_IS_DIRECTORY(           file_name      Varchar2) return BOOLEAN is
  BEGIN
    return (GET_ATTRIBUTE_INT(file_name,ATTR_IS_DIRECTORY)='TRUE');
  END FILE_IS_DIRECTORY; 
  
  FUNCTION FILE_IS_HIDDEN(              file_name      Varchar2) return BOOLEAN is
  BEGIN
    return (GET_ATTRIBUTE_INT(file_name,ATTR_IS_HIDDEN)='TRUE');
  END FILE_IS_HIDDEN;  
  
  FUNCTION FILE_SIZE(                   file_name      Varchar2) return NUMBER is
  BEGIN
    return to_number(GET_ATTRIBUTE_INT(file_name,ATTR_SIZE)); 
  END FILE_SIZE;  
    
  
  FUNCTION CREATE_DIRECTORY(            directory_name Varchar2) return BOOLEAN is
    result Varchar2(6);   
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',directory_name, true);
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_CREATE_DIRECTORY');   
    RETURN (result='TRUE');                       
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.CREATE_DIRECTORY will not work');
      RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END CREATE_DIRECTORY; 
  
  FUNCTION DIRECTORY_LIST(             directory_name      Varchar2,
                                       return_files_only   Boolean := FALSE) return WEBUTIL_FILE.FILE_LIST is
  BEGIN
    return DIRECTORY_FILTERED_LIST(directory_name, null, return_files_only);                                 
  END DIRECTORY_LIST;      
  
  FUNCTION DIRECTORY_FILTERED_LIST(    directory_name      Varchar2,
                                       file_filter         Varchar2,
                                       return_files_only   Boolean := FALSE) return WEBUTIL_FILE.FILE_LIST is
    buffer         varchar2(32000);
    dirInd         varchar2(1) := 'Y';
    selectionCount PLS_INTEGER;
    fileList       WEBUTIL_FILE.FILE_LIST;                                   
  BEGIN
    if directory_name is null then
      raise NULL_CLIENT_DIRECTORY;
    elsif directory_name is not null and NOT WEBUTIL_FILE.FILE_IS_DIRECTORY(directory_name) then
      raise INVALID_CLIENT_FILE_DIR;
    end if;
      
    if return_files_only then 
      dirInd := 'N';
    end if;
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',directory_name, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILTER',file_filter, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_NO_DIRECTORIES',dirInd, true);    
    buffer := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_DIRECTORY_LIST');  
    if buffer is not null then 
      selectionCount := DelimStr.Counter(buffer,false,chr(10));
      for i in 1..selectionCount LOOP
        fileList(i) := DelimStr.GetString(buffer,i,false,chr(10));       
      end LOOP;    
    end if;
    return fileList;
  EXCEPTION  
    when INVALID_CLIENT_FILE_DIR then
      WebUtil_Core.Error(Webutil_Core.WUF_PACKAGE,210, 'WEBUTIL_FILE.DIRECTORY_FILTERED_LIST',directory_name);
      raise FORM_TRIGGER_FAILURE;
    when NULL_CLIENT_DIRECTORY then
      WebUtil_Core.Error(Webutil_Core.WUF_PACKAGE,212, 'WEBUTIL_FILE.DIRECTORY_FILTERED_LIST');
      raise FORM_TRIGGER_FAILURE;
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.DIRECTORY_FILTERED_LIST will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;    
  END DIRECTORY_FILTERED_LIST;
  
  FUNCTION DIRECTORY_ROOT_LIST return WEBUTIL_FILE.FILE_LIST is
    buffer         varchar2(1024);
    selectionCount PLS_INTEGER;
    fileList       WEBUTIL_FILE.FILE_LIST;                                   
  BEGIN
    buffer := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_DIRECTORY_ROOT_LIST'); 
    if buffer is not null then 
      selectionCount := DelimStr.Counter(buffer,false,chr(10));
      for i in 1..selectionCount LOOP
          fileList(i) := DelimStr.GetString(buffer,i,false,chr(10));       
      end LOOP;    
    end if;
    return fileList;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.DIRECTORY_ROOT_LIST will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;    
  END DIRECTORY_ROOT_LIST;

  FUNCTION RENAME_FILE(                 file_name      Varchar2,
                                        new_name       Varchar2) return BOOLEAN is
    result Varchar2(6);   
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',file_name, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_RENAME_FILE',new_name, true);    
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_RENAME_FILE');   
    RETURN (result='TRUE');                       
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.RENAME_FILE will not work');
      RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END RENAME_FILE;
  
  FUNCTION COPY_FILE(                   file_name      Varchar2,
                                        new_name       Varchar2) return BOOLEAN is
    result Varchar2(6);   
  BEGIN
    if file_name = new_name then
      WebUtil_Core.Error(Webutil_Core.WUF_PACKAGE,211, 'WEBUTIL_FILE.COPY_FILE',file_name);
      return false;
    end if;
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',file_name, true);
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_COPY_FILE',new_name, true);    
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_COPY_FILE');   
    RETURN (result='TRUE');                       
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.COPY_FILE will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END COPY_FILE;                                        
  
  
  FUNCTION DELETE_FILE(                 file_name      Varchar2) return BOOLEAN is
    result Varchar2(6);   
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUF_PACKAGE,'WUF_FILENAME',file_name, true); 
    result := WebUtil_Core.getProperty(WebUtil_Core.WUF_PACKAGE,'WUF_DELETE_FILE');   
    RETURN (result='TRUE');                       
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUF_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE.DELETE_FILE will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END DELETE_FILE;  

  FUNCTION GET_PATH_SEPARATOR return VARCHAR2 is
  begin
    return WebUtil_Core.getClientPathSep;
  end GET_PATH_SEPARATOR;
  
  FUNCTION GET_FILE_SEPARATOR return VARCHAR2 is
  begin
    return WebUtil_Core.getClientFileSep;
  end GET_FILE_SEPARATOR;
    
BEGIN 
    -- Ensure Core is instanciated
    WebUtil_Core.Init; 
END WEBUTIL_FILE;
		*/
				 public class InvalidClientFileDir extends Exception{}
		 public class NullClientDirectory extends Exception{}
		//  Private Variables
		public final NInteger ATTR_EXISTS = toInt(1);
		public final NInteger ATTR_READABLE = toInt(2);
		public final NInteger ATTR_WRITABLE = toInt(3);
		public final NInteger ATTR_IS_DIRECTORY = toInt(4);
		public final NInteger ATTR_IS_HIDDEN = toInt(5);
		public final NInteger ATTR_SIZE = toInt(6);
/* <p>
		*  Private method implementations -----------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		* @param dialogType
		* @param selectFile
		* @param multiselect
		*/
		public NString fileSelectionDialogInt(NString directoryName, NString fileName, NString fileFilter, NString title, NNumber dialogType, NBool selectFile, NBool multiselect)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_DIRNAME"), directoryName);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), fileName, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILTER"), fileFilter);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_MESSAGE"), title);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_MULTISELECT"), multiselect, toBool(NBool.True));
//				if ((dialogType.equals(SupportClasses.Constants.SAVE_FILE)))
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_SAVEFILE"));
//				}
//				else if ((selectFile.not())) {
//					result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_OPENDIR"));
//				}
//				else {
//					result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_OPENFILE"));
//				}
//				//  handle the situation which we can get with JFileChooser with escaped "\"
//				result = replace(result, "\\\\", "\\");
//				return result;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.FILE_SELECTION_DIALOG_INT will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : fileSelectionDialogInt function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		* @param attributeid
		*/
		public NString getAttributeInt(NString fileName, NInteger attributeid)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), fileName, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILE_ATTRIBUTE"), toChar(attributeid), toBool(NBool.True));
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILE_ATTRIBUTE"));
//				return result;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.GET_ATTRIBUTE_INT will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getAttributeInt function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fileSelectionDialog() {
			return fileSelectionDialog(NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NString fileSelectionDialog(NString directoryName) {
			return fileSelectionDialog(directoryName, NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		*/
		public NString fileSelectionDialog(NString directoryName, NString fileName) {
			return fileSelectionDialog(directoryName, fileName, NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		*/
		public NString fileSelectionDialog(NString directoryName, NString fileName, NString fileFilter) {
			return fileSelectionDialog(directoryName, fileName, fileFilter, NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		*/
		public NString fileSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title) {
			return fileSelectionDialog(directoryName, fileName, fileFilter, title, SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		* @param dialogType
		*/
		public NString fileSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title, NNumber dialogType) {
			return fileSelectionDialog(directoryName, fileName, fileFilter, title, dialogType, toBool(NBool.True));
		}

/* <p>
		*  Public method implementations ------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		* @param dialogType
		* @param selectFile
		*/
		public NString fileSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title, NNumber dialogType, NBool selectFile)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return fileSelectionDialogInt(directoryName, fileName, fileFilter, title, dialogType, selectFile, toBool(NBool.False));
//
			this.getLogger().trace(this, "F2J : fileSelectionDialog function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public Webutilfile.FileList fileMultiSelectionDialog() {
			return fileMultiSelectionDialog(NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName) {
			return fileMultiSelectionDialog(directoryName, NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName, NString fileName) {
			return fileMultiSelectionDialog(directoryName, fileName, NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName, NString fileName, NString fileFilter) {
			return fileMultiSelectionDialog(directoryName, fileName, fileFilter, NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title) {
			return fileMultiSelectionDialog(directoryName, fileName, fileFilter, title, SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		* @param dialogType
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title, NNumber dialogType) {
			return fileMultiSelectionDialog(directoryName, fileName, fileFilter, title, dialogType, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		* @param dialogType
		* @param selectFile
		*/
		public Webutilfile.FileList fileMultiSelectionDialog(NString directoryName, NString fileName, NString fileFilter, NString title, NNumber dialogType, NBool selectFile)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString buffer= NString.getNull();
//			NString dirname= NString.getNull();
//			NInteger selectioncount= NInteger.getNull();
//			Webutilfile.FileList filelist= null;
//			buffer = fileSelectionDialogInt(directoryName, fileName, fileFilter, title, dialogType, selectFile, toBool(NBool.True));
//			//  Bug 2846355                                            
//			if ( !buffer.isNull() )
//			{
//				//  Multi-select returns a String delimited with newlines
//				//  with the first element being the directory
//				//  This is an efficient way of doing it as we only 
//				//  need one routrip to get the full selection
//				//  but we could hit a problem if the total length of
//				//  the directory & filenames exceeds the buffer size                                         
//				selectioncount = toInt(getContainer().getDelimstr().counter(buffer, toBool(NBool.False), chr(10)));
//				dirname = getContainer().getDelimstr().getstring(buffer, toNumber(1), toBool(NBool.False), chr(10));
//				for ( int i = 2; i <= selectioncount; i++ )
//				{
//					filelist(toObject(i.subtract(1))) = dirname.append(getContainer().getDelimstr().getstring(buffer, toNumber(i), toBool(NBool.False), chr(10)));
//				}
//			}
//			return filelist;
//
			this.getLogger().trace(this, "F2J : fileMultiSelectionDialog function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fileOpenDialog() {
			return fileOpenDialog(NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NString fileOpenDialog(NString directoryName) {
			return fileOpenDialog(directoryName, NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		*/
		public NString fileOpenDialog(NString directoryName, NString fileName) {
			return fileOpenDialog(directoryName, fileName, NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		*/
		public NString fileOpenDialog(NString directoryName, NString fileName, NString fileFilter) {
			return fileOpenDialog(directoryName, fileName, fileFilter, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		*/
		public NString fileOpenDialog(NString directoryName, NString fileName, NString fileFilter, NString title)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return fileSelectionDialogInt(directoryName, fileName, fileFilter, title, SupportClasses.Constants.OPEN_FILE, toBool(NBool.True), toBool(NBool.False));
//
			this.getLogger().trace(this, "F2J : fileOpenDialog function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fileSaveDialog() {
			return fileSaveDialog(NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NString fileSaveDialog(NString directoryName) {
			return fileSaveDialog(directoryName, NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		*/
		public NString fileSaveDialog(NString directoryName, NString fileName) {
			return fileSaveDialog(directoryName, fileName, NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		*/
		public NString fileSaveDialog(NString directoryName, NString fileName, NString fileFilter) {
			return fileSaveDialog(directoryName, fileName, fileFilter, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param title
		*/
		public NString fileSaveDialog(NString directoryName, NString fileName, NString fileFilter, NString title)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return fileSelectionDialogInt(directoryName, fileName, fileFilter, title, SupportClasses.Constants.SAVE_FILE, toBool(NBool.True), toBool(NBool.False));
//
			this.getLogger().trace(this, "F2J : fileSaveDialog function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString directorySelectionDialog() {
			return directorySelectionDialog(NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NString directorySelectionDialog(NString directoryName) {
			return directorySelectionDialog(directoryName, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param title
		*/
		public NString directorySelectionDialog(NString directoryName, NString title)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return fileSelectionDialogInt(directoryName, toStr(null), toStr(null), title, SupportClasses.Constants.OPEN_FILE, toBool(NBool.False), toBool(NBool.False));
//
			this.getLogger().trace(this, "F2J : directorySelectionDialog function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fileDialogSelectionMade()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_GFN_SELECTION_MADE"));
//				return ((result.equals("TRUE")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.FILE_DIALOG_SELECTION_MADE will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : fileDialogSelectionMade function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool fileExists(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((getAttributeInt(fileName, ATTR_EXISTS).equals("TRUE")));
//
			this.getLogger().trace(this, "F2J : fileExists function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool fileIsReadable(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((getAttributeInt(fileName, ATTR_READABLE).equals("TRUE")));
//
			this.getLogger().trace(this, "F2J : fileIsReadable function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool fileIsWritable(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((getAttributeInt(fileName, ATTR_WRITABLE).equals("TRUE")));
//
			this.getLogger().trace(this, "F2J : fileIsWritable function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool fileIsDirectory(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((getAttributeInt(fileName, ATTR_IS_DIRECTORY).equals("TRUE")));
//
			this.getLogger().trace(this, "F2J : fileIsDirectory function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool fileIsHidden(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((getAttributeInt(fileName, ATTR_IS_HIDDEN).equals("TRUE")));
//
			this.getLogger().trace(this, "F2J : fileIsHidden function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NNumber fileSize(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toNumber(getAttributeInt(fileName, ATTR_SIZE));
//
			this.getLogger().trace(this, "F2J : fileSize function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NBool createDirectory(NString directoryName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), directoryName, toBool(NBool.True));
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_CREATE_DIRECTORY"));
//				return ((result.equals("TRUE")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.CREATE_DIRECTORY will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : createDirectory function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public Webutilfile.FileList directoryList(NString directoryName) {
			return directoryList(directoryName, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param returnFilesOnly
		*/
		public Webutilfile.FileList directoryList(NString directoryName, NBool returnFilesOnly)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return directoryFilteredList(directoryName, toStr(null), returnFilesOnly);
//
			this.getLogger().trace(this, "F2J : directoryList function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileFilter
		*/
		public Webutilfile.FileList directoryFilteredList(NString directoryName, NString fileFilter) {
			return directoryFilteredList(directoryName, fileFilter, toBool(NBool.False));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileFilter
		* @param returnFilesOnly
		*/
		public Webutilfile.FileList directoryFilteredList(NString directoryName, NString fileFilter, NBool returnFilesOnly)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString buffer= NString.getNull();
//			NString dirind = toStr("Y");
//			NInteger selectioncount= NInteger.getNull();
//			Webutilfile.FileList filelist= null;
//			try
//			{
//				if ( directoryName.isNull() )
//				{
//					throw new NullClientDirectory();
//				}
//				else if ( !directoryName.isNull() && fileIsDirectory(directoryName).not() ) {
//					throw new InvalidClientFileDir();
//				}
//				if ( returnFilesOnly.getValue() )
//				{
//					dirind = toStr("N");
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), directoryName, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILTER"), fileFilter, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_NO_DIRECTORIES"), dirind, toBool(NBool.True));
//				buffer = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_DIRECTORY_LIST"));
//				if ( !buffer.isNull() )
//				{
//					selectioncount = toInt(getContainer().getDelimstr().counter(buffer, toBool(NBool.False), chr(10)));
//					for ( int i = 1; i <= selectioncount; i++ )
//					{
//						filelist(toObject(i)) = getContainer().getDelimstr().getstring(buffer, toNumber(i), toBool(NBool.False), chr(10));
//					}
//				}
//				return filelist;
//			}
//			catch(InvalidClientFileDir e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUF_PACKAGE, toInt(210), toStr("WEBUTIL_FILE.DIRECTORY_FILTERED_LIST"), directoryName);
//				throw new ApplicationException();
//			}
//			catch(NullClientDirectory e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUF_PACKAGE, toInt(212), toStr("WEBUTIL_FILE.DIRECTORY_FILTERED_LIST"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.DIRECTORY_FILTERED_LIST will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : directoryFilteredList function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public Webutilfile.FileList directoryRootList()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString buffer= NString.getNull();
//			NInteger selectioncount= NInteger.getNull();
//			Webutilfile.FileList filelist= null;
//			try
//			{
//				buffer = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_DIRECTORY_ROOT_LIST"));
//				if ( !buffer.isNull() )
//				{
//					selectioncount = toInt(getContainer().getDelimstr().counter(buffer, toBool(NBool.False), chr(10)));
//					for ( int i = 1; i <= selectioncount; i++ )
//					{
//						filelist(toObject(i)) = getContainer().getDelimstr().getstring(buffer, toNumber(i), toBool(NBool.False), chr(10));
//					}
//				}
//				return filelist;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.DIRECTORY_ROOT_LIST will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : directoryRootList function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return null;
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		* @param newName
		*/
		public NBool renameFile(NString fileName, NString newName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), fileName, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_RENAME_FILE"), newName, toBool(NBool.True));
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_RENAME_FILE"));
//				return ((result.equals("TRUE")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.RENAME_FILE will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : renameFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		* @param newName
		*/
		public NBool copyFile(NString fileName, NString newName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				if ( fileName.equals(newName) )
//				{
//					getContainer().getWebutilCore().error(getWebutilcore().WUF_PACKAGE, toInt(211), toStr("WEBUTIL_FILE.COPY_FILE"), fileName);
//					return  toBool(NBool.False);
//				}
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), fileName, toBool(NBool.True));
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_COPY_FILE"), newName, toBool(NBool.True));
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_COPY_FILE"));
//				return ((result.equals("TRUE")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.COPY_FILE will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : copyFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		*/
		public NBool deleteFile(NString fileName)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_FILENAME"), fileName, toBool(NBool.True));
//				result = getContainer().getWebutilCore().getproperty(getWebutilcore().WUF_PACKAGE, toStr("WUF_DELETE_FILE"));
//				return ((result.equals("TRUE")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUF_PACKAGE).append(" bean not found. WEBUTIL_FILE.DELETE_FILE will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : deleteFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getPathSeparator()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientpathsep();
//
			this.getLogger().trace(this, "F2J : getPathSeparator function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getFileSeparator()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientfilesep();
//
			this.getLogger().trace(this, "F2J : getFileSeparator function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		public WebutilFile() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Ensure Core is instanciated
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilFile Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class FileList extends NStringTable{
}



	
}
