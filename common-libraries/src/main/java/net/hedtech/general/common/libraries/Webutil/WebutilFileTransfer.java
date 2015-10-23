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


public class WebutilFileTransfer extends AbstractSupportCodeObject {
	

	public WebutilFileTransfer(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_FILE_TRANSFER
	/*
	PACKAGE WEBUTIL_FILE_TRANSFER IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_FILE_TRANSFER
 *   This Package contains routines Upload and download files from/to the
 *   browser client machine
 *   The oracle.forms.webutil.fileTransfer.FileTransfer bean is needed in your 
 *   Form to use these functions
 *********************************************************************************
 * Version 1.0.1
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 03/FEB/2003 - Creation
 *   1.0.1 DRMILLS 13/MAY/2003 - Added a call to Webutil_Core.Init to enforce 
 *                               correct instanciation.
 *                               Added abstraction layer to the DB Package so that 
 *                               lack of that package does not invalidate this package 
 *                               body
 *
 *********************************************************************************
 * TODO:
 *       1) Improve handling of unexpected database error situations
 *       2) Add functionality to Upload / Download from App Server Filesystem to / 
 *          from the Database
 *       
\********************************************************************************</multilinecomment>
      
  <multilinecomment>*
   * URL_To_Client - pulls a file from the specified URL on any server and 
   * sends it via http to the specified destination on the client
   * If you specify file size we can do a comparison after download to ensure 
   * that the sizes match
   * Additionally if you specify withProgress and size you will get a progress
   * bar.
   * If you don't specify any size or if you specify default size, then webutil
   * will try to get the size of the url on its own for the purpose of showing
   * the progress bar.
   * Note that the Title, subtitle and message strings cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION URL_To_Client(    sourceURL         in VARCHAR2, 
                             clientDestination in VARCHAR2, 
                             fileSize          in PLS_INTEGER default 0) return BOOLEAN;
                           
  FUNCTION URL_To_Client_With_Progress(
                             sourceURL         in VARCHAR2, 
                             clientDestination in VARCHAR2, 
                             fileSize          in PLS_INTEGER default 0,
                             progressTitle     in VARCHAR2,
                             progressSubTitle  in VARCHAR2,
                             progressMessage   in VARCHAR2) return BOOLEAN;     


  <multilinecomment>*
   * Client_To_DB - uploads a named client side file into the specified 
   * column in the database.
   * The combination of tableName and columnName should identify a BLOB
   * Column in the database.  The whereClause should narrow the selection
   * down so that one and only one row is identified.
   * The file transfer is carried out using the normal Forms connection and 
   * will be committed by the Form in the normal way.
   *
   * The currently connected user #must# have execute priviledges on 
   * the WEBUTIL_DB package.
   *
   * The transfer can be flagged as Asynchronous.  This will not really allow
   * the end user to carry out work whilst the upload is going on but it will 
   * ensure that Forms can re-draw it's screen.
   * If you pass a user defined trigger as callbackTrigger, then the trigger
   * will be fired/executed when the upload is complete. This will become useful
   * particularly when the upload is asynchronous.
   * WebUtil_File_Transfer.Asynchronous_Upload_Success will indicate if the 
   * Upload worked or not.
   * 
   * Additionally of you specify withProgress you will get a progress
   * bar as the upload takes place
   * Note that the title and subtitle cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION Client_To_DB( clientFile       in VARCHAR2, 
                         tableName        in VARCHAR2, 
                         columnName       in VARCHAR2,
                         whereClause      in VARCHAR2,
                         asynchronous     in BOOLEAN default FALSE,
                         callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN;

  FUNCTION Client_To_DB_With_Progress
                     (   clientFile       in VARCHAR2, 
                         tableName        in VARCHAR2, 
                         columnName       in VARCHAR2,
                         whereClause      in VARCHAR2,
                         progressTitle    in VARCHAR2,
                         progressSubTitle in VARCHAR2,
                         asynchronous     in BOOLEAN default FALSE,
                         callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN;


  <multilinecomment>*
   * DB_To_Client - downloads the contents of a database BLOB into the 
   * specified client side file.
   * The combination of tableName and columnName should identify a BLOB
   * Column in the database.  The whereClause should narrow the selection
   * down so that one and only one row is identified.
   * The file transfer is carried out using the normal Forms connection.
   *
   * The currently connected user #must# have execute priviledges on 
   * the WEBUTIL_DB package.
   *
   * If you specify withProgress you will get a progress
   * bar as the download takes place
   * Note that the title and subtitle cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION DB_To_Client
                     ( clientFile       in VARCHAR2, 
                       tableName        in VARCHAR2, 
                       columnName       in VARCHAR2,
                       whereClause      in VARCHAR2) return BOOLEAN;

  FUNCTION DB_To_Client_With_Progress
                     ( clientFile       in VARCHAR2, 
                       tableName        in VARCHAR2, 
                       columnName       in VARCHAR2,
                       whereClause      in VARCHAR2,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN;
                       
                       
  <multilinecomment>*
   * Client_To_AS - uploads a named client side file into the specified 
   * file name on the application server.
   *
   * The transfer can be flagged as Asynchronous.  This will not really allow
   * the end user to carry out work whilst the upload is going on but it will 
   * ensure that Forms can re-draw it's screen.
   * If you pass a user defined trigger as callbackTrigger, then the trigger
   * will be fired/executed when the upload is complete. This will become useful
   * particularly when the upload is asynchronous.
   * WebUtil_File_Transfer.Asynchronous_Upload_Success will indicate if the 
   * Upload worked or not.
   * 
   * Additionally of you specify withProgress you will get a progress
   * bar as the upload takes place
   * Note that the title and subtitle cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION Client_To_AS( clientFile       in VARCHAR2, 
                         serverFile       in VARCHAR2, 
                         asynchronous     in BOOLEAN default FALSE,
                         callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN;

  FUNCTION Client_To_AS_With_Progress
                       ( clientFile       in VARCHAR2, 
                         serverFile       in VARCHAR2, 
                         progressTitle    in VARCHAR2,
                         progressSubTitle in VARCHAR2,
                         asynchronous     in BOOLEAN default FALSE,
                         callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN;                         
  
  <multilinecomment>*
   * AS_To_Client - downloads the contents of file on the applciation 
   * server to a specified client side file.
   *
   * If you specify withProgress you will get a progress
   * bar as the download takes place
   * Note that the title and subtitle cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION AS_To_Client
                     ( clientFile       in VARCHAR2, 
                       serverFile       in VARCHAR2) return BOOLEAN;

  FUNCTION AS_To_Client_With_Progress
                     ( clientFile       in VARCHAR2, 
                       serverFile       in VARCHAR2, 
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN;
                        

  <multilinecomment>*
   * InProgress - indicates if a file transfer using Client_To_DB 
   * or Client_To_AS is currently operating (this will be for Asynchronous calls)
   </multilinecomment>
  FUNCTION In_Progress return BOOLEAN;      

  <multilinecomment>*
   * Asynchronous_Upload_Success - indicates if an Asynchronous  
   * upload succeeded or not.
   * Should only be called from within the Asynchronous callback
   * trigger.
   </multilinecomment>
  FUNCTION Asynchronous_Upload_Success return BOOLEAN;      
  
  <multilinecomment>*
   * Get_Work_Area - The WebUtil administrator can define a 
   * directory root on the application server for use for 
   * temporary files.  This workarea returned will be based
   * on this directory root and a subdirectory name constructed 
   * from the IP address and username of the client machine
   * The autoCreate switch will ensure that the directory 
   * exists on the file system and will create it if it does 
   * not.
   </multilinecomment>
  FUNCTION Get_Work_Area(autoCreate BOOLEAN := true) return VARCHAR2;
  
  <multilinecomment>*
   * is_AS_Writable - The WebUtil administrator can define a 
   * set of directories that uploading is allowed to on the 
   * application server.  This function checks if a 
   * file specification points to a writable location
   * You should call this before attempting to upload to the 
   * application server *if* you are using Access Control 
   * If you are not using Access Control the function will
   * return TRUE. 
   </multilinecomment>
  FUNCTION is_AS_Writable(fileName in VARCHAR2) return BOOLEAN;
  
  <multilinecomment>*
   * is_AS_Readable - The WebUtil administrator can define a 
   * set of directories that downloading is allowed from
   *  on the application server.  This function checks if a 
   * file specification points to a readable location
   * You should call this before attempting to download from 
   * the application server *if* you are using Access Control 
   * If you are not using Access Control the function will
   * return TRUE. 
   </multilinecomment>
  FUNCTION is_AS_Readable(fileName in VARCHAR2) return BOOLEAN;
  
                         
  <multilinecomment>*
   * SetData - Procedure used internally during Async Upload
   * Do not call this procedure manually 
   </multilinecomment>
  PROCEDURE SetData(uploadData in VARCHAR2);
  
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_FILE_TRANSFER
		/*
		PACKAGE BODY WEBUTIL_FILE_TRANSFER IS
  -- internal exceptions
  CLIENT_FILE_EMPTY  EXCEPTION;
  CLIENT_FILE_NULL   EXCEPTION;
  AS_FILE_NULL       EXCEPTION;
  INVALID_CLIENT_FILE_DIR   EXCEPTION;
  FILE_NOT_FOUND     EXCEPTION;
  AGENT_BUSY         EXCEPTION;
  READWRITE_ERROR    EXCEPTION;
  CLIENT_ERROR       EXCEPTION;
  TRANSFER_FORBIDDEN EXCEPTION;      
  NO_JAVA            EXCEPTION;
      
  -- internal types      
  Type aclType is table of varchar2(1024 char) index by binary_integer;
      
  -- Internal Varibles
  m_chunks          PLS_INTEGER := 0;
  m_maxTransferSize PLS_INTEGER := 16384;
  m_fileSize        PLS_INTEGER := 0;
  m_uploadSucceeded BOOLEAN;
  m_toDB            BOOLEAN;
  m_workarea        VARCHAR2(512);
  m_DBEnabled       BOOLEAN := false;
  m_ASEnabled       BOOLEAN := false;  
  m_ASUseACL        BOOLEAN := false;       
  m_readACL         aclType;
  m_writeACL        aclType; 
  m_windows         BOOLEAN := false;  
  m_persistObj      ORA_JAVA.JOBJECT;
  m_workAreaCreated BOOLEAN := false;
  
  -- Internal Procs
  FUNCTION UploadInt
                     ( clientFile       in VARCHAR2, 
                       spec1            in VARCHAR2, 
                       spec2            in VARCHAR2,
                       spec3            in VARCHAR2,
                       toDB             in BOOLEAN,
                       withProgress     in BOOLEAN,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2,                       
                       asynchronous     in BOOLEAN default FALSE,
                       callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN;

  FUNCTION DownloadInt
                     ( clientFile       in VARCHAR2, 
                       spec1            in VARCHAR2, 
                       spec2            in VARCHAR2,
                       spec3            in VARCHAR2,
                       fromDB           in BOOLEAN,
                       withProgress     in BOOLEAN,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN;


  FUNCTION getMaxTransfer return PLS_INTEGER;
  
  PROCEDURE init;
  
  FUNCTION checkASACL(ASFile          in     VARCHAR2,
                      acl           in out aclType) return BOOLEAN;
                      
  -- Public Functions
  FUNCTION URL_To_Client(sourceURL         in VARCHAR2, 
                         clientDestination in VARCHAR2, 
                         fileSize          in PLS_INTEGER default 0) return BOOLEAN is
  BEGIN
      return WebUtil_Core.DownLoadFromURL(sourceURL, 
                                        clientDestination, 
                                        fileSize);
  END URL_To_Client;
                           
  FUNCTION URL_To_Client_With_Progress(sourceURL         in VARCHAR2, 
                                       clientDestination in VARCHAR2, 
                                       fileSize          in PLS_INTEGER default 0,
                                       progressTitle     in VARCHAR2,
                                       progressSubTitle  in VARCHAR2,
                                       progressMessage   in VARCHAR2) return BOOLEAN is
  BEGIN
    return WebUtil_Core.DownLoadFromURLWithProgress
                                       (sourceURL, 
                                        clientDestination, 
                                        fileSize,
                                        progressTitle,
                                        progressSubTitle,
                                        progressMessage);
  END URL_To_Client_With_Progress;       
  
  
  FUNCTION Client_To_DB( clientFile      in VARCHAR2, 
                         tableName       in VARCHAR2, 
                         columnName      in VARCHAR2,
                         whereClause     in VARCHAR2,
                         asynchronous    in BOOLEAN default FALSE,
                         callbackTrigger in VARCHAR2 default NULL) return BOOLEAN is
  BEGIN
    return UploadInt(
                       clientFile,
                       tableName,
                       columnName,
                       whereClause,
                       true,
                       false,
                       null,
                       null,
                       asynchronous,
                       callbackTrigger);
  END Client_To_DB;                                           

  FUNCTION Client_To_DB_With_Progress
                     ( clientFile       in VARCHAR2, 
                       tableName        in VARCHAR2, 
                       columnName       in VARCHAR2,
                       whereClause      in VARCHAR2,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2,
                       asynchronous     in BOOLEAN default FALSE,
                       callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN is
  BEGIN
    return UploadInt
                     ( clientFile,
                       tableName,
                       columnName,
                       whereClause,
                       true,
                       true,
                       progressTitle,
                       progressSubTitle,                       
                       asynchronous,
                       callbackTrigger);
  END Client_To_DB_With_Progress;                                           

  FUNCTION DB_To_Client
                     ( clientFile      in VARCHAR2, 
                       tableName       in VARCHAR2, 
                       columnName      in VARCHAR2,
                       whereClause     in VARCHAR2) return BOOLEAN is
  BEGIN
    return DownloadInt
                     ( clientFile,
                       tableName,
                       columnName,
                       whereClause,
                       true,
                       false,
                       null,
                       null);
  END DB_To_Client;                                           

  FUNCTION DB_To_Client_With_Progress
                     ( clientFile       in VARCHAR2, 
                       tableName        in VARCHAR2, 
                       columnName       in VARCHAR2,
                       whereClause      in VARCHAR2,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN is
  BEGIN
    return DownloadInt
                     ( clientFile,
                       tableName,
                       columnName,
                       whereClause,
                       true,
                       true,
                       progressTitle,
                       progressSubTitle);
  END DB_To_Client_With_Progress; 
  
  FUNCTION Client_To_AS( clientFile       in VARCHAR2, 
                         serverFile       in VARCHAR2, 
                         asynchronous     in BOOLEAN default FALSE,
                         callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN is
  BEGIN
    return UploadInt(
                       clientFile,
                       serverFile,
                       null,
                       null,
                       false,
                       false,
                       null,
                       null,
                       asynchronous,
                       callbackTrigger);
  END Client_To_AS;                        

  FUNCTION Client_To_AS_With_Progress
                     ( clientFile       in VARCHAR2, 
                       serverFile       in VARCHAR2, 
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2,
                       asynchronous     in BOOLEAN default FALSE,
                       callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN is
 BEGIN
    return UploadInt
                     ( clientFile,
                       serverFile,
                       null,
                       null,
                       false,
                       true,
                       progressTitle,
                       progressSubTitle,                       
                       asynchronous,
                       callbackTrigger);
  END Client_To_AS_With_Progress;                            
  
  FUNCTION AS_To_Client
                     ( clientFile       in VARCHAR2, 
                       serverFile       in VARCHAR2) return BOOLEAN is
  BEGIN
    return DownloadInt
                     ( clientFile,
                       serverFile,
                       null,
                       null,
                       false,
                       false,
                       null,
                       null);
  END AS_To_Client;                          

  FUNCTION AS_To_Client_With_Progress
                     ( clientFile       in VARCHAR2, 
                       serverFile       in VARCHAR2, 
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN is
  BEGIN
    return DownloadInt
                     ( clientFile,
                       serverFile,
                       null,
                       null,
                       false,
                       true,
                       progressTitle,
                       progressSubTitle);
  END AS_To_Client_With_Progress;                       
  
  FUNCTION In_Progress return BOOLEAN is
    status VARCHAR2(5);
  BEGIN 
    status := WebUtil_Core.getProperty(WebUtil_Core.WUT_PACKAGE,'WUT_STATUS');
    return (status='BUSY');
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUT_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE_TRANSFER.In_Progress will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END In_Progress;
   
  FUNCTION Get_Work_Area(autoCreate BOOLEAN := true) return VARCHAR2 is 
    jfile ORA_JAVA.JOBJECT;
  BEGIN
    if (autoCreate and not m_workAreaCreated) then 
      jfile := JAVA_FILE.new(m_workarea);
      if not JAVA_FILE.exists_(jfile) then 
        if not JAVA_FILE.mkdirs(jfile) then
          WebUtil_Core.error(WebUtil_Core.WUT_PACKAGE,127,'WEBUTIL_FILE_TRANSFER.GetWork_Area');
        else
          m_workAreaCreated := true;
        end if; --mkdirs
      elsif not JAVA_FILE.isDirectory(jfile) then 
        WebUtil_Core.error(Webutil_Core.WUT_PACKAGE,127,'WEBUTIL_FILE_TRANSFER.GetWork_Area');
      else
        m_workAreaCreated := true;
      end if; -- exists
    end if;    
    return m_workarea;
  EXCEPTION
    when ORA_JAVA.EXCEPTION_THROWN then
      WebUtil_Core.error(Webutil_Core.WUT_PACKAGE,128,'WEBUTIL_FILE_TRANSFER.GetWork_Area');
      return null;
  END Get_Work_Area;   
  
  FUNCTION is_AS_Writable(fileName in VARCHAR2) return BOOLEAN is
  BEGIN
    return checkASACL(fileName, m_writeACL);
  END is_AS_Writable;
  
  FUNCTION is_AS_Readable(fileName in VARCHAR2) return BOOLEAN is
  BEGIN
    return checkASACL(fileName, m_readACL);
  END is_AS_Readable;
   
  PROCEDURE SetData(uploadData in VARCHAR2) is 
    lastErrorCode    PLS_INTEGER;
    lastErrorArgs    VARCHAR2(1000);   
  BEGIN
    if uploadData is null or uploadData = '' then 
      -- error condition!
      m_uploadSucceeded := false;
    else
      -- Write to the correct place    
      if m_toDB then 
        WebUtil_DB_LOCAL.WriteData(uploadData);
      else
        if not JAVA_APPSERV_WRITER.WriteData(m_persistObj,uploadData) then
          lastErrorCode := JAVA_APPSERV_WRITER.getLastError(m_persistObj);
          lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(m_persistObj) ;
          WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                             'WEBUTIL_FILE_TRANSFER.SetData',lastErrorArgs);
          raise READWRITE_ERROR;
        end if;
      end if;
      m_chunks := m_chunks - 1;
      if m_chunks = 0 then 
        if m_toDB then 
          if WebUtil_DB_Local.CloseBlob(m_fileSize) then 
            m_uploadSucceeded := true;
          else
            WebUtil_core.Error(Webutil_Core.WUT_PACKAGE, WebUtil_DB_Local.getLastError,
                               'WEBUTIL_FILE_TRANSFER.SetData');
          end if; -- close
        else
          if JAVA_APPSERV_WRITER.CloseFile(m_persistObj,m_fileSize) then
            m_uploadSucceeded := true;
          else
            lastErrorCode := JAVA_APPSERV_WRITER.getLastError(m_persistObj);
            lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(m_persistObj) ;
            WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                               'WEBUTIL_FILE_TRANSFER.SetData',lastErrorArgs);
            ORA_JAVA.DELETE_GLOBAL_REF(m_persistObj);
            raise READWRITE_ERROR;
          end if;    
        end if; -- toDB

        if WebUtil_Core.GetCallbackTrigger(-1) is not null then
          EXECUTE_TRIGGER(WebUtil_Core.GetCallbackTrigger(-1));
        end if;
        WebUtil_Core.ClearCallbackTrigger(-1);
      end if; -- chunks
    end if;
  end SetData;   
  
  FUNCTION Asynchronous_Upload_Success return BOOLEAN is
  begin
    return m_uploadSucceeded;
  end Asynchronous_Upload_Success;   
  
  -- Internal implementations ----
  FUNCTION UploadInt ( clientFile       in VARCHAR2, 
                       spec1            in VARCHAR2, 
                       spec2            in VARCHAR2,
                       spec3            in VARCHAR2,
                       toDB             in BOOLEAN,
                       withProgress     in BOOLEAN,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2,                       
                       asynchronous     in BOOLEAN default FALSE,
                       callbackTrigger  in VARCHAR2 default NULL) return BOOLEAN is
    clientFileSize   PLS_INTEGER := 0;   
    clientFileChunks PLS_INTEGER := 0;                       
    clientFileInfo   VARCHAR2(1000 char);
    result           BOOLEAN     := FALSE;
    dataBuffer       VARCHAR2(32767);
    ignore           VARCHAR2(2);
    jobj             ORA_JAVA.JOBJECT;
    lastErrorCode    PLS_INTEGER;
    lastErrorArgs    VARCHAR2(1000);
    encodedFile      ORA_JAVA.JOBJECT;
    ftemp            TEXT_IO.FILE_TYPE;
    tempFileName     VARCHAR2(512);
    bool_ignore      boolean;
  BEGIN
    -- Client file cannot be null
    if clientFile is null then
        raise CLIENT_FILE_NULL;
    end if;

    -- AS file cannot be null. AppsServerFileWriter also handles this. Better to handle here.
    if NOT toDB AND spec1 is null then
        raise AS_FILE_NULL;
    end if;
 
          

    -- Make sure the client file to be uploaded exists and readable
    -- If we don't raise exception here, we end up creating an empty file on DB or AS
    if NOT webutil_file.file_is_readable(clientFile)
       OR webutil_file.file_is_directory (clientFile) then
      raise FILE_NOT_FOUND;
    end if;
      
    -- First check to see if a transfer is not currently happening
    if In_Progress then
        raise AGENT_BUSY;
    end if;

    -- reset the target
    m_toDB := toDB;

    -- Set up the file info
    clientFileInfo := clientFile||'|0|'||
                      WEBUTIL_UTIL.BoolToStr(asynchronous,'A|','S|')||
                      WEBUTIL_UTIL.BoolToStr(withProgress,'Y|','N|')||
                      progressTitle||'|'||
                      progressSubTitle;
    WebUtil_Core.setProperty(WebUtil_Core.WUT_PACKAGE,'WUT_FILE_INFO', clientFileInfo);
    
    -- get the size and chunk info of the client side file
    clientFileInfo   := WebUtil_Core.getProperty(WebUtil_Core.WUT_PACKAGE,'WUT_FILE_INFO');
    clientFileSize   := DelimStr.getNumber(clientFileInfo,1,true,'|');
    if clientFileSize = 0 then
      raise CLIENT_FILE_EMPTY;
      -- no need to close AS file since it is not yet opened.
    end if;
    clientFileChunks := DelimStr.getNumber(clientFileInfo,2,true,'|');
    
    -- Set up the Open command
    if toDB then 
      if not m_DBEnabled then 
        raise TRANSFER_FORBIDDEN;
      end if;
      if  not WebUtil_DB_Local.openblob(spec1, spec2, spec3,'W', m_maxTransferSize) then 
        WebUtil_core.Error(WebUtil_Core.WUT_PACKAGE,WebUtil_DB_Local.getLastError,
                           'WEBUTIL_FILE_TRANSFER.uploadInt');
        raise READWRITE_ERROR;
      end if;
    else
      if not WebUtil_Core.checkJava then 
        raise NO_JAVA;
      end if;        
      if not checkASACL(spec1,m_writeACL) then 
        raise TRANSFER_FORBIDDEN;
      end if;        
      jobj := JAVA_APPSERV_WRITER.NEW;
      if not JAVA_APPSERV_WRITER.openFile(jobj,spec1) then 
        lastErrorCode := JAVA_APPSERV_WRITER.getLastError(jobj);
        lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(jobj) ;
        WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                           'WEBUTIL_FILE_TRANSFER.uploadInt',lastErrorArgs);
        raise READWRITE_ERROR;
      end if;
    end if;
 
    -- Is this Async? if So we do nothing more here just set the callback and kick it off
    if asynchronous then 
      -- set callbackTrigger even if it is null. we will take care
      -- before calling
      WebUtil_Core.SetCallbackTrigger(-1,callbackTrigger);
      ignore   := WebUtil_Core.getProperty(WebUtil_Core.WUT_PACKAGE,'WUT_TRANSFER');
      m_chunks := clientFileChunks;
      m_fileSize := clientFileSize;        
      m_uploadSucceeded := NULL;
      if not toDB then
          m_persistObj := ORA_JAVA.NEW_GLOBAL_REF(jobj);
      end if;
      result := true;
    else
      if NOT toDB then
        encodedFile := JAVA_FILE.createTempFile('WUAS','.enc');
        tempFileName := JAVA_FILE.getPath(encodedFile);
      end if;

      -- loop through each chunk 
      for i in 1..clientFileChunks LOOP
        dataBuffer := WebUtil_Core.getProperty(WebUtil_Core.WUT_PACKAGE,'WUT_TRANSFER',false);
        if (WebUtil_Core.isError) or (dataBuffer is null) then
          raise AGENT_BUSY;
        end if;
            
        -- Write to the correct place    
        if toDB then 
          WebUtil_DB_Local.WriteData(dataBuffer);
        else
          ftemp := TEXT_IO.FOPEN(tempFileName, 'W');
          TEXT_IO.PUT(ftemp, dataBuffer);
          TEXT_IO.FCLOSE(ftemp);
          -- if not JAVA_APPSERV_WRITER.WriteData(jobj,dataBuffer) then
          if not JAVA_APPSERV_WRITER.decodeBASE64File(jobj,tempFileName) then
            lastErrorCode := JAVA_APPSERV_WRITER.getLastError(jobj);
            lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(jobj) ;
            WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                               'WEBUTIL_FILE_TRANSFER.UploadInt',lastErrorArgs);
            raise READWRITE_ERROR;
          end if;
        end if;
      end LOOP;
      if toDB then
        if WebUtil_DB_Local.CloseBlob(clientFileSize) then 
          result := true;
        else
          WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,WebUtil_DB_Local.getLastError,
                             'WEBUTIL_FILE_TRANSFER.UploadInt');
        end if;  -- close        
      else
        bool_ignore := JAVA_FILE.DELETE_(encodedFile);
        if JAVA_APPSERV_WRITER.CloseFile(jobj,clientFileSize) then
          result := true;
        else
          lastErrorCode := JAVA_APPSERV_WRITER.getLastError(jobj);
          lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(jobj) ;
          WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                            'WEBUTIL_FILE_TRANSFER.UploadInt',lastErrorArgs);
          raise READWRITE_ERROR;
        end if;
      end if;      
    end if; -- async
    return result;
  EXCEPTION
    when CLIENT_FILE_EMPTY then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,133,'WEBUTIL_FILE_TRANSFER.UploadInt', clientFile);
      return false;
    when CLIENT_FILE_NULL then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,130,'WEBUTIL_FILE_TRANSFER.UploadInt');
      return false;
    when AS_FILE_NULL then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,117,'WEBUTIL_FILE_TRANSFER.UploadInt');
      return false;
    when FILE_NOT_FOUND then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,129,'WEBUTIL_FILE_TRANSFER.UploadInt', clientFile);
      return false;
    when TRANSFER_FORBIDDEN then 
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,121,'WEBUTIL_FILE_TRANSFER.UploadInt');
      return false;                
    when AGENT_BUSY then 
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,116,'WEBUTIL_FILE_TRANSFER.UploadInt');
      return false;    
    when READWRITE_ERROR then 
      return false;          
    when NO_JAVA then 
      return false;
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUT_PACKAGE)
                             ||' bean not found. WEBUTIL_FILE_TRANSFER.UploadInt will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;  
  END UploadInt;                       

  FUNCTION DownloadInt
                     ( clientFile       in VARCHAR2, 
                       spec1            in VARCHAR2, 
                       spec2            in VARCHAR2,
                       spec3            in VARCHAR2,
                       fromDB           in BOOLEAN,
                       withProgress     in BOOLEAN,
                       progressTitle    in VARCHAR2,
                       progressSubTitle in VARCHAR2) return BOOLEAN is
    result           BOOLEAN := false;
    dummybool        BOOLEAN;                      
    fileSize         PLS_INTEGER := 0; 
    fileChunks       PLS_INTEGER := 0;     
    buffer           VARCHAR2(32767);
    subBuffer        VARCHAR2(32767);
    clientFileInfo   VARCHAR2(1000 char);
    jobj             ORA_JAVA.JOBJECT;
    lastErrorCode    PLS_INTEGER;
    lastErrorArgs    VARCHAR2(1000);    
    parent_dir       VARCHAR2(1000);
    encodedFile      ORA_JAVA.JOBJECT;
    ftemp            TEXT_IO.FILE_TYPE;
    tempFileName     VARCHAR2(512);
    
  BEGIN
    -- client file cannot be null.
    if clientFile is NULL then
        raise CLIENT_FILE_NULL;
    end if;

    -- AS file cannot be null. AppServerFileReader.java also handles this. Handling here is better.
    if NOT fromDB AND spec1 is null then
        raise AS_FILE_NULL;
    end if;

    -- Make sure that the given client file path is not a directory and parent directory exists
    parent_dir := substr(clientFile, 1, instr(clientFile, WebUtil_Core.getClientFileSep, -1));
    if WEBUTIL_FILE.file_is_directory(clientFile)
         OR NOT WEBUTIL_FILE.file_is_directory (parent_dir) then
        raise INVALID_CLIENT_FILE_DIR;
    end if;

    -- First check to see if a transfer is not currently happening
    if In_Progress then 
        raise AGENT_BUSY;
    end if;

    -- Open the correct source & get the file size
    if fromDB then
      if not m_DBEnabled then 
        raise TRANSFER_FORBIDDEN;
      end if;
      if  not WebUtil_DB_Local.openblob(spec1, spec2, spec3,'R', m_maxTransferSize) then 
        lastErrorCode := WebUtil_DB_Local.getLastError;
        WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                           'WEBUTIL_FILE_TRANSFER.DownloadInt',spec1||'.'||spec2||' - Where '||spec3);
        raise READWRITE_ERROR;
      end if;
      fileSize   := WebUtil_DB_Local.getSourceLength;
      fileChunks := WebUtil_DB_Local.getSourceChunks; 
    else
      if not WebUtil_Core.checkJava then 
        raise NO_JAVA;
      end if;        
      if not checkASACL(spec1,m_readACL) then 
        raise TRANSFER_FORBIDDEN;
      end if;    
      jobj := JAVA_APPSERV_READER.NEW;
      if not JAVA_APPSERV_READER.openFile(jobj,spec1,m_maxTransferSize) then 
        lastErrorCode := JAVA_APPSERV_READER.getLastError(jobj);
        lastErrorArgs := JAVA_APPSERV_READER.getLastErrorArgs(jobj) ;
        WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                           'WEBUTIL_FILE_TRANSFER.DownloadInt',lastErrorArgs);
        raise READWRITE_ERROR;
      end if;   
      fileSize   := JAVA_APPSERV_READER.getSourceLength(jobj);
      fileChunks := JAVA_APPSERV_READER.getSourceChunks(jobj);       
    end if; -- fromDB
      
    -- construct and send the fileinfo string to the client
    clientFileInfo := clientFile||'|'||to_char(fileSize)||'|N'||
                      WebUtil_Util.BoolToStr(withProgress,'|Y|','|N|')||
                      progressTitle||'|'||progressSubTitle;
    WebUtil_Core.setProperty(WebUtil_Core.WUT_PACKAGE,'WUT_FILE_INFO',clientFileInfo,false);
    if WebUtil_Core.IsError then
      if not fromDB then
        -- close the Application Server file.
        dummybool := JAVA_APPSERV_READER.CLOSEFILE(jobj);
      end if;
      raise CLIENT_ERROR;
    end if;
      
    encodedFile := JAVA_FILE.createTempFile('WUAS','.enc');
    tempFileName := JAVA_FILE.getPath(encodedFile);

    -- Now loop through and get each buffer full of data
    for i in 1..fileChunks LOOP
      if fromDB then 
        buffer := WebUtil_DB_Local.ReadData;
      else
        --buffer := JAVA_APPSERV_READER.ReadData(jobj);
        if not JAVA_APPSERV_READER.encodeBASE64File(jobj,tempFileName) then
          lastErrorCode := JAVA_APPSERV_WRITER.getLastError(jobj);
          lastErrorArgs := JAVA_APPSERV_WRITER.getLastErrorArgs(jobj) ;
          WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,lastErrorCode,
                             'WEBUTIL_FILE_TRANSFER.UploadInt',lastErrorArgs);
          raise READWRITE_ERROR;
        end if;
        ftemp := TEXT_IO.FOPEN(tempFileName, 'R');
        buffer := '';
        begin  -- SUB LOOP
          loop
            TEXT_IO.GET_LINE(ftemp, subBuffer);
            buffer := buffer || chr(10) || subBuffer;
          end loop;
        exception
          when NO_DATA_FOUND then
            null; -- no need to do anything
        end; -- SUB LOOP
        TEXT_IO.FCLOSE(ftemp);
      end if; -- fromDB

      -- push the data to the client
      WebUtil_Core.setProperty(WebUtil_Core.WUT_PACKAGE,'WUT_TRANSFER',buffer, false);
      if WebUtil_Core.isError then
        if not fromDB then
           -- close the Application Server file.
           dummybool := JAVA_APPSERV_READER.CLOSEFILE(jobj);
           dummyBool := JAVA_FILE.DELETE_(encodedFile);
        end if;
        raise CLIENT_ERROR;
      end if;
    end LOOP;
    result := true;
      
    if not fromDB then 
    result := JAVA_APPSERV_READER.CloseFile(jobj);
    dummyBool := JAVA_FILE.DELETE_(encodedFile);
    end if;
      
    return result;
  EXCEPTION
    when INVALID_CLIENT_FILE_DIR then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,131,'WEBUTIL_FILE_TRANSFER.DownloadInt', clientFile);
      return false;
    when CLIENT_FILE_NULL then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,130,'WEBUTIL_FILE_TRANSFER.DownloadInt');
      return false;
    when AS_FILE_NULL then
      WebUtil_Core.Error(Webutil_Core.WUT_PACKAGE,117,'WEBUTIL_FILE_TRANSFER.DownloadInt');
      return false;
    when TRANSFER_FORBIDDEN then 
      WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,121,'WEBUTIL_FILE_TRANSFER.DownloadInt');
      return false;                
    when AGENT_BUSY then 
      WebUtil_core.Error(Webutil_Core.WUT_PACKAGE,116,'WEBUTIL_FILE_TRANSFER.DownloadInt');
      return false;    
    when READWRITE_ERROR then 
      return false;          
    when CLIENT_ERROR then 
      return false;          
    when NO_JAVA then 
      return false;
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUT_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE_TRANSFER.DownloadInt will not work');
      RAISE FORM_TRIGGER_FAILURE;  
  END DownloadInt;  
  
  FUNCTION getMaxTransfer return PLS_INTEGER is 
  BEGIN 
    return to_number(WebUtil_Core.getProperty(WebUtil_Core.WUT_PACKAGE,'WUT_MAX_BYTES'));
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUT_PACKAGE)
                              ||' bean not found. WEBUTIL_FILE_TRANSFER.getMaxTransfer will not work');
      RAISE FORM_TRIGGER_FAILURE;        
  END getMaxTransfer;        
  
  PROCEDURE init is
    readCount  PLS_INTEGER := 0;
    writeCount PLS_INTEGER := 0;  
    dir        VARCHAR2(1024 char);  
    sep        VARCHAR2(1 char) := WebUtil_Core.getServerFileSep;
  BEGIN
    m_maxTransferSize := getMaxTransfer;
    m_windows         := (sep = '\');
    m_workarea        := WebUtil_Core.ReadFromPropertyBundle('transfer.appsrv.workAreaRoot');
    if m_workarea is null then
      m_workarea := JAVA_SYSTEM.getProperty('user.home') || sep || 'temp' || sep;
    elsif substr(m_workarea,-1,1) <> sep then 
      m_workarea := m_workarea||sep;
    end if; 
    m_workarea        := m_workarea||replace(WebUtil_Core.getClientIPAddress,'.','_')||sep||WebUtil_Core.getClientUserName||sep;
    m_DBEnabled       := (upper(WebUtil_Core.ReadFromPropertyBundle('transfer.database.enabled')) = 'TRUE');
    m_ASEnabled       := (upper(WebUtil_Core.ReadFromPropertyBundle('transfer.appsrv.enabled')) = 'TRUE');  
    m_ASUseACL        := (upper(WebUtil_Core.ReadFromPropertyBundle('transfer.appsrv.accessControl')) = 'TRUE'); 
    
    if m_ASEnabled and m_ASUseACL then 
      -- 1. Workarea is both read and write
      if m_workarea is not null then 
        readCount  := 1;
        writeCount := 1;
        m_readACL(1) := m_workArea;
        m_writeACL(1) := m_workArea;
      end if;
            
      -- 2. Read directories (up to 50 locations seems reasonable max)
      for i in 1..50 LOOP
        dir := WebUtil_Core.ReadFromPropertyBundle('transfer.appsrv.read.'||to_char(i));
        if dir is null then 
          EXIT;
        else
          -- Append the file separator to plug any loopholes
          -- that would result if another directory 
          -- existed with the same prefix
          if substr(dir,-1,1) <> sep then 
            dir := dir||sep;
          end if; 
          readCount := readCount + 1;
          m_readACL(readCount) := dir;
        end if;
      end LOOP;
  
      -- 3. Write directories
      for j in 1..50 LOOP
        dir := WebUtil_Core.ReadFromPropertyBundle('transfer.appsrv.write.'||to_char(j));
        if dir is null then 
          EXIT;
        else
          -- Append the file separator to plug any loopholes
          -- that would result if another directory 
          -- existed with the same prefix
          if substr(dir,-1,1) <> sep then 
            dir := dir||sep;
          end if;                 

          writeCount := writeCount + 1;
          m_writeACL(writeCount) := dir;
        end if;
      end LOOP;
    end if;
    
  END init;

  FUNCTION checkASACL(ASFile          in     VARCHAR2,
                      acl           in out aclType) return BOOLEAN is
    result        BOOLEAN := FALSE;                    
    allowedDir    VARCHAR2(1024);
    allowedDirLen PLS_INTEGER;
    fname         VARCHAR2(1024);
    sep           VARCHAR2(1);
  BEGIN
    if ASFile is null then
      -- There is no default AS file name. Null cannot be used.
      return false;
    end if;
    if m_ASEnabled then 
      if m_ASUseACL then 
        -- add a trailing separator so that c:\temp will also match
        -- with c:\temp\. Earlier trailing separator was added to acl
        -- so that c:\temp1 does not become a subdirectory of c:\temp
        -- or c:\temp1 does not match with c:\temp. Note: file need
        -- not be directory. It could be c:\temp\test.txt.
        -- There is no harm in appending a separator since we are going
        -- to substr before comparing.
        sep := WebUtil_Core.getServerFileSep;
        fname := ASFile || sep;
        for i in 1..acl.COUNT LOOP
          allowedDir    := acl(i);
          allowedDirLen := length(allowedDir);
          if m_windows then -- case insensitive
            if lower(substr(fname,1,allowedDirLen)) = lower(allowedDir) then 
              result := true;
              EXIT;
            end if;
          else
            if substr(fname,1,allowedDirLen) = allowedDir then 
              result := true;
              EXIT;
            end if;
          end if;
        end LOOP;
      else
        result := true;
      end if;      
    end if;
      
    return result;
  end checkASACL;           
      
  
BEGIN
  -- Core initialisation
  WebUtil_Core.Init;
  -- Initialisation of ACL etc for this package        
  init;
END WEBUTIL_FILE_TRANSFER;
		*/
				//  internal exceptions
		 public class ClientFileEmpty extends Exception{}
		 public class ClientFileNull extends Exception{}
		 public class AsFileNull extends Exception{}
		 public class InvalidClientFileDir extends Exception{}
		 public class FileNotFound extends Exception{}
		 public class AgentBusy extends Exception{}
		 public class ReadwriteError extends Exception{}
		 public class ClientError extends Exception{}
		 public class TransferForbidden extends Exception{}
		 public class NoJava extends Exception{}
		//  Internal Varibles
		private NInteger mChunks = toInt(0);
		private NInteger mMaxtransfersize = toInt(16384);
		private NInteger mFilesize = toInt(0);
		private NBool mUploadsucceeded= NBool.getNull();
		private NBool mTodb= NBool.getNull();
		private NString mWorkarea= NString.getNull();
		private NBool mDbenabled = toBool(NBool.False);
		private NBool mAsenabled = toBool(NBool.False);
		private NBool mAsuseacl = toBool(NBool.False);
		private Webutilfiletransfer.Acltype mReadacl= null;
		private Webutilfiletransfer.Acltype mWriteacl= null;
		private NBool mWindows = toBool(NBool.False);
		private UnknownTypes.OraJavaJobject mPersistobj= null;
		private NBool mWorkareacreated = toBool(NBool.False);
/* <p>
		*  Public Functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		*/
		public NBool urlToClient(NString sourceurl, NString clientdestination) {
			return urlToClient(sourceurl, clientdestination, toInt(0));
		}

/* <p>
		*  Public Functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param filesize
		*/
		public NBool urlToClient(NString sourceurl, NString clientdestination, NInteger filesize)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().downloadfromurl(sourceurl, clientdestination, filesize);
//
			this.getLogger().trace(this, "F2J : urlToClient function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param filesize
		* @param progresstitle
		* @param progresssubtitle
		* @param progressmessage
		*/
		public NBool urlToClientWithProgress(NString sourceurl, NString clientdestination, NInteger filesize, NString progresstitle, NString progresssubtitle, NString progressmessage)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().downloadfromurlwithprogress(sourceurl, clientdestination, filesize, progresstitle, progresssubtitle, progressmessage);
//
			this.getLogger().trace(this, "F2J : urlToClientWithProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		*/
		public NBool clientToDb(NString clientfile, NString tablename, NString columnname, NString whereclause) {
			return clientToDb(clientfile, tablename, columnname, whereclause, toBool(NBool.False), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param asynchronous
		*/
		public NBool clientToDb(NString clientfile, NString tablename, NString columnname, NString whereclause, NBool asynchronous) {
			return clientToDb(clientfile, tablename, columnname, whereclause, asynchronous, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param asynchronous
		* @param callbacktrigger
		*/
		public NBool clientToDb(NString clientfile, NString tablename, NString columnname, NString whereclause, NBool asynchronous, NString callbacktrigger)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return uploadint(clientfile, tablename, columnname, whereclause, toBool(NBool.True), toBool(NBool.False), toStr(null), toStr(null), asynchronous, callbacktrigger);
//
			this.getLogger().trace(this, "F2J : clientToDb function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool clientToDbWithProgress(NString clientfile, NString tablename, NString columnname, NString whereclause, NString progresstitle, NString progresssubtitle) {
			return clientToDbWithProgress(clientfile, tablename, columnname, whereclause, progresstitle, progresssubtitle, toBool(NBool.False), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		*/
		public NBool clientToDbWithProgress(NString clientfile, NString tablename, NString columnname, NString whereclause, NString progresstitle, NString progresssubtitle, NBool asynchronous) {
			return clientToDbWithProgress(clientfile, tablename, columnname, whereclause, progresstitle, progresssubtitle, asynchronous, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		* @param callbacktrigger
		*/
		public NBool clientToDbWithProgress(NString clientfile, NString tablename, NString columnname, NString whereclause, NString progresstitle, NString progresssubtitle, NBool asynchronous, NString callbacktrigger)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return uploadint(clientfile, tablename, columnname, whereclause, toBool(NBool.True), toBool(NBool.True), progresstitle, progresssubtitle, asynchronous, callbacktrigger);
//
			this.getLogger().trace(this, "F2J : clientToDbWithProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		*/
		public NBool dbToClient(NString clientfile, NString tablename, NString columnname, NString whereclause)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadint(clientfile, tablename, columnname, whereclause, toBool(NBool.True), toBool(NBool.False), toStr(null), toStr(null));
//
			this.getLogger().trace(this, "F2J : dbToClient function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param tablename
		* @param columnname
		* @param whereclause
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool dbToClientWithProgress(NString clientfile, NString tablename, NString columnname, NString whereclause, NString progresstitle, NString progresssubtitle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadint(clientfile, tablename, columnname, whereclause, toBool(NBool.True), toBool(NBool.True), progresstitle, progresssubtitle);
//
			this.getLogger().trace(this, "F2J : dbToClientWithProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		*/
		public NBool clientToAs(NString clientfile, NString serverfile) {
			return clientToAs(clientfile, serverfile, toBool(NBool.False), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param asynchronous
		*/
		public NBool clientToAs(NString clientfile, NString serverfile, NBool asynchronous) {
			return clientToAs(clientfile, serverfile, asynchronous, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param asynchronous
		* @param callbacktrigger
		*/
		public NBool clientToAs(NString clientfile, NString serverfile, NBool asynchronous, NString callbacktrigger)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return uploadint(clientfile, serverfile, toStr(null), toStr(null), toBool(NBool.False), toBool(NBool.False), toStr(null), toStr(null), asynchronous, callbacktrigger);
//
			this.getLogger().trace(this, "F2J : clientToAs function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool clientToAsWithProgress(NString clientfile, NString serverfile, NString progresstitle, NString progresssubtitle) {
			return clientToAsWithProgress(clientfile, serverfile, progresstitle, progresssubtitle, toBool(NBool.False), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		*/
		public NBool clientToAsWithProgress(NString clientfile, NString serverfile, NString progresstitle, NString progresssubtitle, NBool asynchronous) {
			return clientToAsWithProgress(clientfile, serverfile, progresstitle, progresssubtitle, asynchronous, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		* @param callbacktrigger
		*/
		public NBool clientToAsWithProgress(NString clientfile, NString serverfile, NString progresstitle, NString progresssubtitle, NBool asynchronous, NString callbacktrigger)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return uploadint(clientfile, serverfile, toStr(null), toStr(null), toBool(NBool.False), toBool(NBool.True), progresstitle, progresssubtitle, asynchronous, callbacktrigger);
//
			this.getLogger().trace(this, "F2J : clientToAsWithProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		*/
		public NBool asToClient(NString clientfile, NString serverfile)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadint(clientfile, serverfile, toStr(null), toStr(null), toBool(NBool.False), toBool(NBool.False), toStr(null), toStr(null));
//
			this.getLogger().trace(this, "F2J : asToClient function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param serverfile
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool asToClientWithProgress(NString clientfile, NString serverfile, NString progresstitle, NString progresssubtitle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadint(clientfile, serverfile, toStr(null), toStr(null), toBool(NBool.False), toBool(NBool.True), progresstitle, progresssubtitle);
//
			this.getLogger().trace(this, "F2J : asToClientWithProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool inProgress()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString status= NString.getNull();
//			try
//			{
//				status = getContainer().getWebutilCore().getproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_STATUS"));
//				return ((status.equals("BUSY")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUT_PACKAGE).append(" bean not found. WEBUTIL_FILE_TRANSFER.In_Progress will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : inProgress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWorkArea() {
			return getWorkArea(toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param autocreate
		*/
		public NString getWorkArea(NBool autocreate)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.OraJavaJobject jfile= null;
//			try
//			{
//				if ((autocreate.getValue() && mWorkareacreated.not().getValue()))
//				{
//					jfile = JavaFile._new(mWorkarea);
//					if ( getContainer().getJavaFile().exists_(jfile).not() )
//					{
//						if ( getContainer().getJavaFile().mkdirs(jfile).not() )
//						{
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(127), toStr("WEBUTIL_FILE_TRANSFER.GetWork_Area"));
//						}
//						else {
//							mWorkareacreated = toBool(NBool.True);
//						}
//					}
//					else if ( getContainer().getJavaFile().isdirectory(jfile).not() ) {
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(127), toStr("WEBUTIL_FILE_TRANSFER.GetWork_Area"));
//					}
//					else {
//						mWorkareacreated = toBool(NBool.True);
//					}
//				}
//				return mWorkarea;
//			}
//			catch(Exception e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(128), toStr("WEBUTIL_FILE_TRANSFER.GetWork_Area"));
//				return NString.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getWorkArea function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		*/
		public NBool isAsWritable(NString filename)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return checkasacl(filename, acl_ref);
//
			this.getLogger().trace(this, "F2J : isAsWritable function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param filename
		*/
		public NBool isAsReadable(NString filename)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return checkasacl(filename, acl_ref);
//
			this.getLogger().trace(this, "F2J : isAsReadable function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param uploaddata
		*/
		public void setdata(NString uploaddata)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger lasterrorcode= NInteger.getNull();
//			NString lasterrorargs= NString.getNull();
//			if ( uploaddata.isNull() || uploaddata.equals("") )
//			{
//				//  error condition!
//				mUploadsucceeded = toBool(NBool.False);
//			}
//			else {
//				//  Write to the correct place    
//				if ( mTodb.getValue() )
//				{
//					getContainer().getWebutilDbLocal().writedata(uploaddata);
//				}
//				else {
//					if ( getContainer().getJavaAppservWriter().writedata(mPersistobj, uploaddata).not() )
//					{
//						lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(mPersistobj));
//						lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(mPersistobj);
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.SetData"), lasterrorargs);
//						throw new ReadwriteError();
//					}
//				}
//				mChunks = mChunks.subtract(1);
//				if ( mChunks.equals(0) )
//				{
//					if ( mTodb.getValue() )
//					{
//						if ( getContainer().getWebutilDbLocal().closeblob(mFilesize).getValue() )
//						{
//							mUploadsucceeded = toBool(NBool.True);
//						}
//						else {
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, getContainer().getWebutilDbLocal().getlasterror(), toStr("WEBUTIL_FILE_TRANSFER.SetData"));
//						}
//					}
//					else {
//						if ( getContainer().getJavaAppservWriter().closefile(mPersistobj, toNumber(mFilesize)).getValue() )
//						{
//							mUploadsucceeded = toBool(NBool.True);
//						}
//						else {
//							lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(mPersistobj));
//							lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(mPersistobj);
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.SetData"), lasterrorargs);
//							// F2J_NOT_SUPPORTED : Call to built-in "DELETE_GLOBAL_REF" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//							//							SupportClasses.ORA_JAVA.DeleteGlobalRef(mPersistobj);
//							////
//							System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DELETE_GLOBAL_REF' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//							
//							throw new ReadwriteError();
//						}
//					}
//					//  toDB
//					if ( !getContainer().getWebutilCore().getcallbacktrigger(- (1)).isNull() )
//					{
//						// F2J_TO_COMPLETE : Call to built-in "EXECUTE_TRIGGER" was removed because it is not supported. See documentation for details "".
//						//						SupportClasses.SQLFORMS.ExecuteTrigger(getContainer().getWebutilCore().getcallbacktrigger(- (1)));
//						////
//						System.err.println("// F2J_TO_COMPLETE : Call to built-in 'EXECUTE_TRIGGER' was removed because it is not supported. See documentation for details ''.");
//						
//					}
//					getContainer().getWebutilCore().clearcallbacktrigger(- (1));
//				}
//			}
//
			this.getLogger().trace(this, "F2J : setdata procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool asynchronousUploadSuccess()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mUploadsucceeded;
//
			this.getLogger().trace(this, "F2J : asynchronousUploadSuccess function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		*  Internal implementations ----
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param spec1
		* @param spec2
		* @param spec3
		* @param todb
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool uploadint(NString clientfile, NString spec1, NString spec2, NString spec3, NBool todb, NBool withprogress, NString progresstitle, NString progresssubtitle) {
			return uploadint(clientfile, spec1, spec2, spec3, todb, withprogress, progresstitle, progresssubtitle, toBool(NBool.False), NString.getNull());
		}

/* <p>
		*  Internal implementations ----
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param spec1
		* @param spec2
		* @param spec3
		* @param todb
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		*/
		public NBool uploadint(NString clientfile, NString spec1, NString spec2, NString spec3, NBool todb, NBool withprogress, NString progresstitle, NString progresssubtitle, NBool asynchronous) {
			return uploadint(clientfile, spec1, spec2, spec3, todb, withprogress, progresstitle, progresssubtitle, asynchronous, NString.getNull());
		}

/* <p>
		*  Internal implementations ----
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param spec1
		* @param spec2
		* @param spec3
		* @param todb
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		* @param asynchronous
		* @param callbacktrigger
		*/
		public NBool uploadint(NString clientfile, NString spec1, NString spec2, NString spec3, NBool todb, NBool withprogress, NString progresstitle, NString progresssubtitle, NBool asynchronous, NString callbacktrigger)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger clientfilesize = toInt(0);
//			NInteger clientfilechunks = toInt(0);
//			NString clientfileinfo= NString.getNull();
//			NBool result = toBool(NBool.False);
//			NString databuffer= NString.getNull();
//			NString ignore= NString.getNull();
//			UnknownTypes.OraJavaJobject jobj= null;
//			NInteger lasterrorcode= NInteger.getNull();
//			NString lasterrorargs= NString.getNull();
//			UnknownTypes.OraJavaJobject encodedfile= null;
//			ITextFile ftemp= null;
//			NString tempfilename= NString.getNull();
//			NBool boolIgnore= NBool.getNull();
//			try
//			{
//				//  Client file cannot be null
//				if ( clientfile.isNull() )
//				{
//					throw new ClientFileNull();
//				}
//				//  AS file cannot be null. AppsServerFileWriter also handles this. Better to handle here.
//				if ( todb.not().getValue() && spec1.isNull().getValue() )
//				{
//					throw new AsFileNull();
//				}
//				//  Make sure the client file to be uploaded exists and readable
//				//  If we don't raise exception here, we end up creating an empty file on DB or AS
//				if ( getContainer().getWebutilFile().fileIsReadable(clientfile).not().getValue() || getContainer().getWebutilFile().fileIsDirectory(clientfile).getValue() )
//				{
//					throw new FileNotFound();
//				}
//				//  First check to see if a transfer is not currently happening
//				if ( inProgress().getValue() )
//				{
//					throw new AgentBusy();
//				}
//				//  reset the target
//				mTodb = todb;
//				//  Set up the file info
//				clientfileinfo = clientfile.append("|0|").append(getContainer().getWebutilUtil().booltostr(asynchronous, toStr("A|"), toStr("S|"))).append(getContainer().getWebutilUtil().booltostr(withprogress, toStr("Y|"), toStr("N|"))).append(progresstitle).append("|").append(progresssubtitle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_FILE_INFO"), clientfileinfo);
//				//  get the size and chunk info of the client side file
//				clientfileinfo = getContainer().getWebutilCore().getproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_FILE_INFO"));
//				clientfilesize = toInt(getContainer().getDelimstr().getnumber(clientfileinfo, toNumber(1), toBool(NBool.True), toStr("|")));
//				if ( clientfilesize.equals(0) )
//				{
//					throw new ClientFileEmpty();
//				}
//				clientfilechunks = toInt(getContainer().getDelimstr().getnumber(clientfileinfo, toNumber(2), toBool(NBool.True), toStr("|")));
//				//  Set up the Open command
//				if ( todb.getValue() )
//				{
//					if ( mDbenabled.not() )
//					{
//						throw new TransferForbidden();
//					}
//					if ( getContainer().getWebutilDbLocal().openblob(spec1, spec2, spec3, toStr("W"), mMaxtransfersize).not() )
//					{
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, getContainer().getWebutilDbLocal().getlasterror(), toStr("WEBUTIL_FILE_TRANSFER.uploadInt"));
//						throw new ReadwriteError();
//					}
//				}
//				else {
//					if ( getContainer().getWebutilCore().checkjava().not() )
//					{
//						throw new NoJava();
//					}
//					if ( checkasacl(spec1, acl_ref).not() )
//					{
//						throw new TransferForbidden();
//					}
//					jobj = JavaAppservWriter._new;
//					if ( getContainer().getJavaAppservWriter().openfile(jobj, spec1).not() )
//					{
//						lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(jobj));
//						lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(jobj);
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.uploadInt"), lasterrorargs);
//						throw new ReadwriteError();
//					}
//				}
//				//  Is this Async? if So we do nothing more here just set the callback and kick it off
//				if ( asynchronous.getValue() )
//				{
//					//  set callbackTrigger even if it is null. we will take care
//					//  before calling
//					getContainer().getWebutilCore().setcallbacktrigger(- (1), callbacktrigger);
//					ignore = getContainer().getWebutilCore().getproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_TRANSFER"));
//					mChunks = clientfilechunks;
//					mFilesize = clientfilesize;
//					mUploadsucceeded = toBool(null);
//					if ( todb.not() )
//					{
//						// F2J_NOT_SUPPORTED : Call to built-in "NEW_GLOBAL_REF" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//						//						mPersistobj = SupportClasses.ORA_JAVA.NewGlobalRef(jobj);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'NEW_GLOBAL_REF' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//						
//					}
//					result = toBool(NBool.True);
//				}
//				else {
//					if ( todb.not() )
//					{
//						encodedfile = getContainer().getJavaFile().createtempfile(toStr("WUAS"), toStr(".enc"));
//						tempfilename = getContainer().getJavaFile().getpath(encodedfile);
//					}
//					//  loop through each chunk 
//					for ( int i = 1; i <= clientfilechunks; i++ )
//					{
//						databuffer = getContainer().getWebutilCore().getproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_TRANSFER"), toBool(NBool.False));
//						if ( (getContainer().getWebutilCore().iserror()).getValue() || (databuffer.isNull()).getValue() )
//						{
//							throw new AgentBusy();
//						}
//						//  Write to the correct place    
//						if ( todb.getValue() )
//						{
//							getContainer().getWebutilDbLocal().writedata(databuffer);
//						}
//						else {
//							// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
//							ftemp = TextFileManager.open(tempfilename, "W");
;
//							ftemp.write(databuffer);
//							ftemp.close();
//							//  if not JAVA_APPSERV_WRITER.WriteData(jobj,dataBuffer) then
//							if ( getContainer().getJavaAppservWriter().decodebase64file(jobj, tempfilename).not() )
//							{
//								lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(jobj));
//								lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(jobj);
//								getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.UploadInt"), lasterrorargs);
//								throw new ReadwriteError();
//							}
//						}
//					}
//					if ( todb.getValue() )
//					{
//						if ( getContainer().getWebutilDbLocal().closeblob(clientfilesize).getValue() )
//						{
//							result = toBool(NBool.True);
//						}
//						else {
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, getContainer().getWebutilDbLocal().getlasterror(), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"));
//						}
//					}
//					else {
//						boolIgnore = getContainer().getJavaFile().delete_(encodedfile);
//						if ( getContainer().getJavaAppservWriter().closefile(jobj, toNumber(clientfilesize)).getValue() )
//						{
//							result = toBool(NBool.True);
//						}
//						else {
//							lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(jobj));
//							lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(jobj);
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.UploadInt"), lasterrorargs);
//							throw new ReadwriteError();
//						}
//					}
//				}
//				//  async
//				return result;
//			}
//			catch(ClientFileEmpty e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(133), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"), clientfile);
//				return  toBool(NBool.False);
//			}
//			catch(ClientFileNull e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(130), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(AsFileNull e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(117), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(FileNotFound e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(129), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"), clientfile);
//				return  toBool(NBool.False);
//			}
//			catch(TransferForbidden e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(121), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(AgentBusy e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(116), toStr("WEBUTIL_FILE_TRANSFER.UploadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(ReadwriteError e)
//			{
//				return  toBool(NBool.False);
//			}
//			catch(NoJava e)
//			{
//				return  toBool(NBool.False);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUT_PACKAGE).append(" bean not found. WEBUTIL_FILE_TRANSFER.UploadInt will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : uploadint function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientfile
		* @param spec1
		* @param spec2
		* @param spec3
		* @param fromdb
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool downloadint(NString clientfile, NString spec1, NString spec2, NString spec3, NBool fromdb, NBool withprogress, NString progresstitle, NString progresssubtitle)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NBool result = toBool(NBool.False);
//			NBool dummybool= NBool.getNull();
//			NInteger filesize = toInt(0);
//			NInteger filechunks = toInt(0);
//			NString buffer= NString.getNull();
//			NString subbuffer= NString.getNull();
//			NString clientfileinfo= NString.getNull();
//			UnknownTypes.OraJavaJobject jobj= null;
//			NInteger lasterrorcode= NInteger.getNull();
//			NString lasterrorargs= NString.getNull();
//			NString parentDir= NString.getNull();
//			UnknownTypes.OraJavaJobject encodedfile= null;
//			ITextFile ftemp= null;
//			NString tempfilename= NString.getNull();
//			try
//			{
//				//  client file cannot be null.
//				if ( clientfile.isNull() )
//				{
//					throw new ClientFileNull();
//				}
//				//  AS file cannot be null. AppServerFileReader.java also handles this. Handling here is better.
//				if ( fromdb.not().getValue() && spec1.isNull().getValue() )
//				{
//					throw new AsFileNull();
//				}
//				//  Make sure that the given client file path is not a directory and parent directory exists
//				parentDir = substring(clientfile, toInt(1), inStr(clientfile, getContainer().getWebutilCore().getclientfilesep(), - (1)));
//				if ( getContainer().getWebutilFile().fileIsDirectory(clientfile).getValue() || getContainer().getWebutilFile().fileIsDirectory(parentDir).not().getValue() )
//				{
//					throw new InvalidClientFileDir();
//				}
//				//  First check to see if a transfer is not currently happening
//				if ( inProgress().getValue() )
//				{
//					throw new AgentBusy();
//				}
//				//  Open the correct source & get the file size
//				if ( fromdb.getValue() )
//				{
//					if ( mDbenabled.not() )
//					{
//						throw new TransferForbidden();
//					}
//					if ( getContainer().getWebutilDbLocal().openblob(spec1, spec2, spec3, toStr("R"), mMaxtransfersize).not() )
//					{
//						lasterrorcode = getContainer().getWebutilDbLocal().getlasterror();
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"), spec1.append(".").append(spec2).append(" - Where ").append(spec3));
//						throw new ReadwriteError();
//					}
//					filesize = getContainer().getWebutilDbLocal().getsourcelength();
//					filechunks = getContainer().getWebutilDbLocal().getsourcechunks();
//				}
//				else {
//					if ( getContainer().getWebutilCore().checkjava().not() )
//					{
//						throw new NoJava();
//					}
//					if ( checkasacl(spec1, acl_ref).not() )
//					{
//						throw new TransferForbidden();
//					}
//					jobj = JavaAppservReader._new;
//					if ( getContainer().getJavaAppservReader().openfile(jobj, spec1, toNumber(mMaxtransfersize)).not() )
//					{
//						lasterrorcode = toInt(getContainer().getJavaAppservReader().getlasterror(jobj));
//						lasterrorargs = getContainer().getJavaAppservReader().getlasterrorargs(jobj);
//						getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"), lasterrorargs);
//						throw new ReadwriteError();
//					}
//					filesize = toInt(getContainer().getJavaAppservReader().getsourcelength(jobj));
//					filechunks = toInt(getContainer().getJavaAppservReader().getsourcechunks(jobj));
//				}
//				//  fromDB
//				//  construct and send the fileinfo string to the client
//				clientfileinfo = clientfile.append("|").append(toChar(filesize)).append("|N").append(getContainer().getWebutilUtil().booltostr(withprogress, toStr("|Y|"), toStr("|N|"))).append(progresstitle).append("|").append(progresssubtitle);
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_FILE_INFO"), clientfileinfo, toBool(NBool.False));
//				if ( getContainer().getWebutilCore().iserror().getValue() )
//				{
//					if ( fromdb.not() )
//					{
//						//  close the Application Server file.
//						dummybool = getContainer().getJavaAppservReader().closefile(jobj);
//					}
//					throw new ClientError();
//				}
//				encodedfile = getContainer().getJavaFile().createtempfile(toStr("WUAS"), toStr(".enc"));
//				tempfilename = getContainer().getJavaFile().getpath(encodedfile);
//				//  Now loop through and get each buffer full of data
//				for ( int i = 1; i <= filechunks; i++ )
//				{
//					if ( fromdb.getValue() )
//					{
//						buffer = getContainer().getWebutilDbLocal().readdata();
//					}
//					else {
//						// buffer := JAVA_APPSERV_READER.ReadData(jobj);
//						if ( getContainer().getJavaAppservReader().encodebase64file(jobj, tempfilename).not() )
//						{
//							lasterrorcode = toInt(getContainer().getJavaAppservWriter().getlasterror(jobj));
//							lasterrorargs = getContainer().getJavaAppservWriter().getlasterrorargs(jobj);
//							getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, lasterrorcode, toStr("WEBUTIL_FILE_TRANSFER.UploadInt"), lasterrorargs);
//							throw new ReadwriteError();
//						}
//						// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
//						ftemp = TextFileManager.open(tempfilename, "R");
;
//						buffer = toStr("");
//						try
//						{
//							//  SUB LOOP
//							while (true) {
//								subbuffer = ftemp.readLn();
//								buffer = buffer.append(chr(10)).append(subbuffer);
//							}
//						}
//						catch(NoDataFoundException e)
//						{
//						}
//						//  SUB LOOP
//						ftemp.close();
//					}
//					//  fromDB
//					//  push the data to the client
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_TRANSFER"), buffer, toBool(NBool.False));
//					if ( getContainer().getWebutilCore().iserror().getValue() )
//					{
//						if ( fromdb.not() )
//						{
//							//  close the Application Server file.
//							dummybool = getContainer().getJavaAppservReader().closefile(jobj);
//							dummybool = getContainer().getJavaFile().delete_(encodedfile);
//						}
//						throw new ClientError();
//					}
//				}
//				result = toBool(NBool.True);
//				if ( fromdb.not() )
//				{
//					result = getContainer().getJavaAppservReader().closefile(jobj);
//					dummybool = getContainer().getJavaFile().delete_(encodedfile);
//				}
//				return result;
//			}
//			catch(InvalidClientFileDir e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(131), toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"), clientfile);
//				return  toBool(NBool.False);
//			}
//			catch(ClientFileNull e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(130), toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(AsFileNull e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(117), toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(TransferForbidden e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(121), toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(AgentBusy e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUT_PACKAGE, toInt(116), toStr("WEBUTIL_FILE_TRANSFER.DownloadInt"));
//				return  toBool(NBool.False);
//			}
//			catch(ReadwriteError e)
//			{
//				return  toBool(NBool.False);
//			}
//			catch(ClientError e)
//			{
//				return  toBool(NBool.False);
//			}
//			catch(NoJava e)
//			{
//				return  toBool(NBool.False);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUT_PACKAGE).append(" bean not found. WEBUTIL_FILE_TRANSFER.DownloadInt will not work"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : downloadint function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getmaxtransfer()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return toNumber(getContainer().getWebutilCore().getproperty(getWebutilcore().WUT_PACKAGE, toStr("WUT_MAX_BYTES")));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUT_PACKAGE).append(" bean not found. WEBUTIL_FILE_TRANSFER.getMaxTransfer will not work"));
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getmaxtransfer function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void init()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger readcount = toInt(0);
//			NInteger writecount = toInt(0);
//			NString dir= NString.getNull();
//			NString sep = getContainer().getWebutilCore().getserverfilesep();
//			mMaxtransfersize = getmaxtransfer();
//			mWindows = toBool(((sep.equals("\\"))));
//			mWorkarea = getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.appsrv.workAreaRoot"));
//			if ( mWorkarea.isNull() )
//			{
//				mWorkarea = getContainer().getJavaSystem().getproperty(toStr("user.home")).append(sep).append("temp").append(sep);
//			}
//			else if ( substring(mWorkarea, - (1), toInt(1)).notEquals(sep) ) {
//				mWorkarea = mWorkarea.append(sep);
//			}
//			mWorkarea = mWorkarea.append(replace(getContainer().getWebutilCore().getclientipaddress(), ".", "_")).append(sep).append(getContainer().getWebutilCore().getclientusername()).append(sep);
//			mDbenabled = toBool(((upper(getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.database.enabled"))).equals("TRUE"))));
//			mAsenabled = toBool(((upper(getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.appsrv.enabled"))).equals("TRUE"))));
//			mAsuseacl = toBool(((upper(getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.appsrv.accessControl"))).equals("TRUE"))));
//			if ( mAsenabled.getValue() && mAsuseacl.getValue() )
//			{
//				//  1. Workarea is both read and write
//				if ( !mWorkarea.isNull() )
//				{
//					readcount = toInt(1);
//					writecount = toInt(1);
//														}
//				//  2. Read directories (up to 50 locations seems reasonable max)
//				for ( int i = 1; i <= 50; i++ )
//				{
//					dir = getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.appsrv.read.").append(toChar(i)));
//					if ( dir.isNull() )
//					{
//							break;
//					}
//					else {
//						//  Append the file separator to plug any loopholes
//						//  that would result if another directory 
//						//  existed with the same prefix
//						if ( substring(dir, - (1), toInt(1)).notEquals(sep) )
//						{
//							dir = dir.append(sep);
//						}
//						readcount = readcount.add(1);
//											}
//				}
//				//  3. Write directories
//				for ( int j = 1; j <= 50; j++ )
//				{
//					dir = getContainer().getWebutilCore().readfrompropertybundle(toStr("transfer.appsrv.write.").append(toChar(j)));
//					if ( dir.isNull() )
//					{
//							break;
//					}
//					else {
//						//  Append the file separator to plug any loopholes
//						//  that would result if another directory 
//						//  existed with the same prefix
//						if ( substring(dir, - (1), toInt(1)).notEquals(sep) )
//						{
//							dir = dir.append(sep);
//						}
//						writecount = writecount.add(1);
//											}
//				}
//			}
//
			this.getLogger().trace(this, "F2J : init procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param asfile
		* @param acl
		*/
		public NBool checkasacl(NString asfile, Ref<Webutilfiletransfer.Acltype> acl)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NBool result = toBool(NBool.False);
//			NString alloweddir= NString.getNull();
//			NInteger alloweddirlen= NInteger.getNull();
//			NString fname= NString.getNull();
//			NString sep= NString.getNull();
//			if ( asfile.isNull() )
//			{
//				//  There is no default AS file name. Null cannot be used.
//				return  toBool(NBool.False);
//			}
//			if ( mAsenabled.getValue() )
//			{
//				if ( mAsuseacl.getValue() )
//				{
//					//  add a trailing separator so that c:\temp will also match
//					//  with c:\temp\. Earlier trailing separator was added to acl
//					//  so that c:\temp1 does not become a subdirectory of c:\temp
//					//  or c:\temp1 does not match with c:\temp. Note: file need
//					//  not be directory. It could be c:\temp\test.txt.
//					//  There is no harm in appending a separator since we are going
//					//  to substr before comparing.
//					sep = getContainer().getWebutilCore().getserverfilesep();
//					fname = asfile.append(sep);
//					for ( int i = 1; i <= acl.Count; i++ )
//					{
//						alloweddir = acl(toObject(i)).argvalue;
//						alloweddirlen = length(alloweddir);
//						if ( mWindows.getValue() )
//						{
//							//  case insensitive
//							if ( lower(substring(fname, toInt(1), alloweddirlen)).equals(lower(alloweddir)) )
//							{
//								result = toBool(NBool.True);
//									break;
//							}
//						}
//						else {
//							if ( substring(fname, toInt(1), alloweddirlen).equals(alloweddir) )
//							{
//								result = toBool(NBool.True);
//									break;
//							}
//						}
//					}
//				}
//				else {
//					result = toBool(NBool.True);
//				}
//			}
//			return result;
//
			this.getLogger().trace(this, "F2J : checkasacl function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
		public WebutilFileTransfer() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Core initialisation
//			getContainer().getWebutilCore().init();
//			//  Initialisation of ACL etc for this package        
//			init();
//
			this.getLogger().trace(this, "F2J : WebutilFileTransfer Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class Acltype extends NStringTable{
}



	
}
