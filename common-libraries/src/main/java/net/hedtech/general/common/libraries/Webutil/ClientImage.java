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


public class ClientImage extends AbstractSupportCodeObject {
	

	public ClientImage(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) CLIENT_IMAGE
	/*
	PACKAGE CLIENT_IMAGE IS
<multilinecomment>********************************************************************************\
 * CLIENT_IMAGE
 *   Client (Browser) side implementations of the standard READ_IMAGE_FILE and 
 *   WRITE_IMAGE_FILE built-ins
 *   Used to read an image file off of or on to the browser machine to or from 
 *   A Forms Image Item.
 *   Implemented using calls to WEBUTIL_FILE_TRANSFER
 *   Note that the transfer.appsrv.workAreaRoot property must be set in the 
 *   webutil.cfg file so that this routine has a server side work area available
 *   for temporary files
 *   These calls are in a package rather than in individual CLIENT_ versions 
 *   because PL/SQL only allows overloading (Item ID and Item Name versions) from 
 *   Within Packages
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 11/FEB/2003 - Creation
 *
\********************************************************************************</multilinecomment>     
  
  PROCEDURE READ_IMAGE_FILE(   file_name           in VARCHAR2,
                               file_type           in VARCHAR2 := NULL,
                               i_name              in VARCHAR2);

  PROCEDURE READ_IMAGE_FILE(   file_name           in VARCHAR2,
                               file_type           in VARCHAR2 := NULL,
                               item_id             in ITEM);
                          
  PROCEDURE  WRITE_IMAGE_FILE (file_name           in VARCHAR2, 
                               file_type           in VARCHAR2,
                               item_id             in ITEM,
                               compression_quality in NUMBER := MINIMIZE_COMPRESSION,
                               image_depth         in NUMBER := ORIGINAL_DEPTH);
                               
  PROCEDURE  WRITE_IMAGE_FILE (file_name           in VARCHAR2, 
                               file_type           in VARCHAR2,
                               item_name           in VARCHAR2,
                               compression_quality in NUMBER := MINIMIZE_COMPRESSION,
                               image_depth         in NUMBER := ORIGINAL_DEPTH);
                          

END CLIENT_IMAGE;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) CLIENT_IMAGE
		/*
		PACKAGE BODY CLIENT_IMAGE IS
  -- internal exceptions
  CLIENT_FILE_NULL   EXCEPTION;
  INVALID_CLIENT_FILE_DIR EXCEPTION;

  PROCEDURE READ_IMAGE_FILE(file_name in VARCHAR2,
                            file_type in VARCHAR2 := NULL,
                            i_name    in VARCHAR2) IS
    workArea   VARCHAR2(512 char);
    imageName  VARCHAR2(256 char);
    iLoc       PLS_INTEGER;
    cSep       CHAR(1) := WebUtil_Core.getClientFileSep;
    jFile      ORA_JAVA.JOBJECT;
  BEGIN
    -- Step 1. Extract the actual file name from the supplied name
    iLoc := instr(file_name,cSep,-1);
    if iLoc = 0 then 
      imageName := file_name;
    else
      imageName := substr(file_name,iLoc+1);
    end if;
    
    -- Step 2. Get the WorkArea on the Applcation server, creating 
    --         the directory if required
    workArea := WebUtil_File_Transfer.get_Work_Area(true);
    
    -- Step 3. Do an upload to the workaArea
    if WebUtil_File_Transfer.Client_To_AS(file_name, workArea||imageName, false, null) then 
      -- Step 4. If that worked we can do a conventional READ_IMAGE_FILE from the 
      --         workarea
      -- Note that we have to prefix the internal package that Forms has R_I_F in 
      -- because of name collisions
      -- This will break if Forms ever internally re-organises it's packages
      -- and so this should not normally be done.
      FORMS40.READ_IMAGE_FILE(workArea||imageName, file_type, i_name);
      if NOT FORM_SUCCESS then 
        RAISE FORM_TRIGGER_FAILURE;
      end if;    

      -- Step 5. If the read succeeded then erase the workarea copy
      --         (If it failed then we leave it for the Admin to 
      --          see what the problem with the file was)
      jFile := JAVA_FILE.NEW(workArea||imageName);
      if not JAVA_FILE.Delete_(jFile) then 
        -- not a really bad error just log it
        WebUtil_Core.log('CLIENT_IMAGE.READ_IMAGE_FILE: Failed to delete '||imageName||'  from workarea',true);
      end if;
    else
      RAISE FORM_TRIGGER_FAILURE;
    end if;        
  END READ_IMAGE_FILE;

  PROCEDURE READ_IMAGE_FILE(file_name in VARCHAR2,
                            file_type in VARCHAR2 := NULL,
                            item_id in ITEM) IS
  BEGIN
    --hItem := FIND_ITEM(item_name);
    if not ID_NULL(item_id) then 
      CLIENT_IMAGE.READ_IMAGE_FILE(file_name, file_type, get_item_property(item_id, BLOCK_NAME)||
                                   '.'||get_item_property (item_id, ITEM_NAME));
    end if;
  END READ_IMAGE_FILE; 
  
  PROCEDURE  WRITE_IMAGE_FILE (file_name           in VARCHAR2, 
                               file_type           in VARCHAR2,
                               item_name           in VARCHAR2,
                               compression_quality in NUMBER := MINIMIZE_COMPRESSION,
                               image_depth         in NUMBER := ORIGINAL_DEPTH) is
    workArea   VARCHAR2(512 char);
    imageName  VARCHAR2(512 char);
    iLoc       PLS_INTEGER;
    cSep       CHAR(1) := WebUtil_Core.getClientFileSep;
    jFile      ORA_JAVA.JOBJECT;
    jDir       ORA_JAVA.JOBJECT;
    tFile      TEXT_IO.file_type;
    parent_dir VARCHAR2(1000);
    dummyB     boolean;
  BEGIN
    if file_name is null then
      raise CLIENT_FILE_NULL;
    end if;
    
      -- Make sure that the given client file path is not a directory and parent directory exists
      parent_dir := substr(file_name, 1, instr(file_name, WebUtil_Core.getClientFileSep, -1));
      if WEBUTIL_FILE.file_is_directory(file_name)
           OR NOT WEBUTIL_FILE.file_is_directory (parent_dir) then
          raise INVALID_CLIENT_FILE_DIR;
      end if;

      -- Step 1. Extract the actual file name from the supplied name
      iLoc := instr(file_name,cSep,-1);
      if iLoc = 0 then 
        imageName := file_name;
      else
        imageName := substr(file_name,iLoc+1);
      end if;
    
      -- Step 2. Get the WorkArea on the Applcation server, creating 
      --         the directory if required
      workArea := WebUtil_File_Transfer.get_Work_Area(true);
      -- Workaround to make sure that we can create temp file on AS
      -- This will help in catching invalid file names or permission denied kind of errors
      begin -- subloop
        jFile := JAVA_FILE.NEW(workArea||imageName);
        if not JAVA_FILE.EXISTS_(jFile) then
          tFile := TEXT_IO.FOPEN(workArea||imageName, 'A');
          if NOT FORM_SUCCESS then
            raise INVALID_CLIENT_FILE_DIR;
          end if;
          TEXT_IO.FCLOSE(tFile);
        end if;
        -- Delete the file even if it existed before. We are anyway going to overwrite.
        -- FORMS40.WRITE_IMAGE_FILE will not create file if image item does not contain
        -- any image. But if the file already exists, we won't know whether the call
        -- created any image file or not.
        dummyB := JAVA_FILE.Delete_(jFile);
      exception
        when others then
          raise INVALID_CLIENT_FILE_DIR;
      end; -- subloop
      
      -- Step 3. Use conventional WRITE_IMAGE_FILE to dump the image to 
      --         the workarea
      -- Note that we have to prefix the internal package that Forms has W_I_F in 
      -- because of name collisions
      -- This will break if Forms ever internally re-organises it's packages
      -- and so this should not normally be done.
      FORMS40.WRITE_IMAGE_FILE(workArea||imageName, file_type, item_name, compression_quality, image_depth);
      if NOT FORM_SUCCESS then 
        RAISE FORM_TRIGGER_FAILURE;
      end if;          
    
      -- Step 4. Do an download from the workArea to the client
      if not JAVA_FILE.EXISTS_(jFile) then
        -- It could be because there is no image in the image item holder.
        -- Return quietly.
        return;
      end if;

      if WebUtil_File_Transfer.AS_To_Client(file_name, workArea||imageName) then       
        -- Step 5. If that all worked then erase the workarea copy
        if not JAVA_FILE.Delete_(jFile) then 
          -- not a really bad error just log it
          WebUtil_Core.log('CLIENT_IMAGE.WRITE_IMAGE_FILE: Failed to delete '||imageName||'  from workarea',true);
        end if;
      else
        RAISE FORM_TRIGGER_FAILURE;
      end if;
    exception
      when CLIENT_FILE_NULL then
        WebUtil_Core.Error(Webutil_Core.WUF_PACKAGE,130,'CLIENT_IMAGE.WRITE_IMAGE_FILE');
      when INVALID_CLIENT_FILE_DIR then
        WebUtil_Core.Error(Webutil_Core.WUF_PACKAGE,131,'CLIENT_IMAGE.WRITE_IMAGE_FILE', file_name);
      when others then
        raise;
  END WRITE_IMAGE_FILE;                               
                               
                               
  PROCEDURE  WRITE_IMAGE_FILE (file_name           in VARCHAR2, 
                               file_type           in VARCHAR2,
                               item_id             in ITEM,
                               compression_quality in NUMBER := MINIMIZE_COMPRESSION,
                               image_depth         in NUMBER := ORIGINAL_DEPTH) IS
    hItem  ITEM;
  BEGIN
    --hItem := FIND_ITEM(item_name);
    if not ID_NULL(hItem) then 
      CLIENT_IMAGE.WRITE_IMAGE_FILE(file_name,
                                    file_type,
                                    get_item_property(item_id, BLOCK_NAME)||'.'||get_item_property (item_id, ITEM_NAME),
                                                                  compression_quality,
                                                                  image_depth);
    end if;
  END WRITE_IMAGE_FILE;                               
 
END CLIENT_IMAGE;
		*/
				//  internal exceptions
		 public class ClientFileNull extends Exception{}
		 public class InvalidClientFileDir extends Exception{}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fileName
		* @param fileType
		* @param iName
		*/
		public void readImageFile(NString fileName, NString fileType, NString iName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString workarea= NString.getNull();
//			NString imagename= NString.getNull();
//			NInteger iloc= NInteger.getNull();
//			NString csep = getContainer().getWebutilCore().getclientfilesep();
//			UnknownTypes.OraJavaJobject jfile= null;
//			//  Step 1. Extract the actual file name from the supplied name
//			iloc = inStr(fileName, csep, - (1));
//			if ( iloc.equals(0) )
//			{
//				imagename = fileName;
//			}
//			else {
//				imagename = substring(fileName, iloc.add(1));
//			}
//			//  Step 2. Get the WorkArea on the Applcation server, creating 
//			//          the directory if required
//			workarea = getContainer().getWebutilFileTransfer().getWorkArea(toBool(NBool.True));
//			//  Step 3. Do an upload to the workaArea
//			if ( getContainer().getWebutilFileTransfer().clientToAs(fileName, workarea.append(imagename), toBool(NBool.False), toStr(null)).getValue() )
//			{
//				//  Step 4. If that worked we can do a conventional READ_IMAGE_FILE from the 
//				//          workarea
//				//  Note that we have to prefix the internal package that Forms has R_I_F in 
//				//  because of name collisions
//				//  This will break if Forms ever internally re-organises it's packages
//				//  and so this should not normally be done.
//				FORMS40.READ_IMAGE_FILE(workarea.append(imagename), fileType, iName);
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					throw new ApplicationException();
//				}
//				//  Step 5. If the read succeeded then erase the workarea copy
//				//          (If it failed then we leave it for the Admin to 
//				//           see what the problem with the file was)
//				jfile = JavaFile._new(workarea.append(imagename));
//				if ( getContainer().getJavaFile().delete_(jfile).not() )
//				{
//					//  not a really bad error just log it
//					getContainer().getWebutilCore().log(toStr("CLIENT_IMAGE.READ_IMAGE_FILE: Failed to delete ").append(imagename).append("  from workarea"), toBool(NBool.True));
//				}
//			}
//			else {
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : readImageFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemId
		*/
		public void readImageFile(NString fileName, NString fileType, ItemDescriptor itemId)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// hItem := FIND_ITEM(item_name);
//			if ( !(itemId == null) )
//			{
//				readImageFile(fileName, fileType, getItemBlock(itemId).append(".").append(getItemName(itemId)));
//			}
//
			this.getLogger().trace(this, "F2J : readImageFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemName
		*/
		public void writeImageFile(NString fileName, NString fileType, NString itemName) {
			writeImageFile(fileName, fileType, itemName, SupportClasses.Constants.MINIMIZE_COMPRESSION, SupportClasses.Constants.ORIGINAL_DEPTH);
		}

/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemName
		* @param compressionQuality
		*/
		public void writeImageFile(NString fileName, NString fileType, NString itemName, NNumber compressionQuality) {
			writeImageFile(fileName, fileType, itemName, compressionQuality, SupportClasses.Constants.ORIGINAL_DEPTH);
		}

/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemName
		* @param compressionQuality
		* @param imageDepth
		*/
		public void writeImageFile(NString fileName, NString fileType, NString itemName, NNumber compressionQuality, NNumber imageDepth)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString workarea= NString.getNull();
//			NString imagename= NString.getNull();
//			NInteger iloc= NInteger.getNull();
//			NString csep = getContainer().getWebutilCore().getclientfilesep();
//			UnknownTypes.OraJavaJobject jfile= null;
//			UnknownTypes.OraJavaJobject jdir= null;
//			ITextFile tfile= null;
//			NString parentDir= NString.getNull();
//			NBool dummyb= NBool.getNull();
//			try
//			{
//				if ( fileName.isNull() )
//				{
//					throw new ClientFileNull();
//				}
//				//  Make sure that the given client file path is not a directory and parent directory exists
//				parentDir = substring(fileName, toInt(1), inStr(fileName, getContainer().getWebutilCore().getclientfilesep(), - (1)));
//				if ( getContainer().getWebutilFile().fileIsDirectory(fileName).getValue() || getContainer().getWebutilFile().fileIsDirectory(parentDir).not().getValue() )
//				{
//					throw new InvalidClientFileDir();
//				}
//				//  Step 1. Extract the actual file name from the supplied name
//				iloc = inStr(fileName, csep, - (1));
//				if ( iloc.equals(0) )
//				{
//					imagename = fileName;
//				}
//				else {
//					imagename = substring(fileName, iloc.add(1));
//				}
//				//  Step 2. Get the WorkArea on the Applcation server, creating 
//				//          the directory if required
//				workarea = getContainer().getWebutilFileTransfer().getWorkArea(toBool(NBool.True));
//				try
//				{
//					//  subloop
//					jfile = JavaFile._new(workarea.append(imagename));
//					if ( getContainer().getJavaFile().exists_(jfile).not() )
//					{
//						// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
//						tfile = TextFileManager.open(workarea.append(imagename), "A");
;
//						if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							throw new InvalidClientFileDir();
//						}
//						tfile.close();
//					}
//					//  Delete the file even if it existed before. We are anyway going to overwrite.
//					//  FORMS40.WRITE_IMAGE_FILE will not create file if image item does not contain
//					//  any image. But if the file already exists, we won't know whether the call
//					//  created any image file or not.
//					dummyb = getContainer().getJavaFile().delete_(jfile);
//				}
//				catch(Exception  e)
//				{
//					throw new InvalidClientFileDir();
//				}
//				//  subloop
//				//  Step 3. Use conventional WRITE_IMAGE_FILE to dump the image to 
//				//          the workarea
//				//  Note that we have to prefix the internal package that Forms has W_I_F in 
//				//  because of name collisions
//				//  This will break if Forms ever internally re-organises it's packages
//				//  and so this should not normally be done.
//				FORMS40.WRITE_IMAGE_FILE(workarea.append(imagename), fileType, itemName, compressionQuality, imageDepth);
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					throw new ApplicationException();
//				}
//				//  Step 4. Do an download from the workArea to the client
//				if ( getContainer().getJavaFile().exists_(jfile).not() )
//				{
//					//  It could be because there is no image in the image item holder.
//					//  Return quietly.
//					return ;
//				}
//				if ( getContainer().getWebutilFileTransfer().asToClient(fileName, workarea.append(imagename)).getValue() )
//				{
//					//  Step 5. If that all worked then erase the workarea copy
//					if ( getContainer().getJavaFile().delete_(jfile).not() )
//					{
//						//  not a really bad error just log it
//						getContainer().getWebutilCore().log(toStr("CLIENT_IMAGE.WRITE_IMAGE_FILE: Failed to delete ").append(imagename).append("  from workarea"), toBool(NBool.True));
//					}
//				}
//				else {
//					throw new ApplicationException();
//				}
//			}
//			catch(ClientFileNull e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUF_PACKAGE, toInt(130), toStr("CLIENT_IMAGE.WRITE_IMAGE_FILE"));
//			}
//			catch(InvalidClientFileDir e)
//			{
//				getContainer().getWebutilCore().error(getWebutilcore().WUF_PACKAGE, toInt(131), toStr("CLIENT_IMAGE.WRITE_IMAGE_FILE"), fileName);
//			}
//			catch(Exception  e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : writeImageFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemId
		*/
		public void writeImageFile(NString fileName, NString fileType, ItemDescriptor itemId) {
			writeImageFile(fileName, fileType, itemId, SupportClasses.Constants.MINIMIZE_COMPRESSION, SupportClasses.Constants.ORIGINAL_DEPTH);
		}

/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemId
		* @param compressionQuality
		*/
		public void writeImageFile(NString fileName, NString fileType, ItemDescriptor itemId, NNumber compressionQuality) {
			writeImageFile(fileName, fileType, itemId, compressionQuality, SupportClasses.Constants.ORIGINAL_DEPTH);
		}

/* <p>
/* </p>
		* @param fileName
		* @param fileType
		* @param itemId
		* @param compressionQuality
		* @param imageDepth
		*/
		public void writeImageFile(NString fileName, NString fileType, ItemDescriptor itemId, NNumber compressionQuality, NNumber imageDepth)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			ItemDescriptor hitem= null;
//			// hItem := FIND_ITEM(item_name);
//			if ( !(hitem == null) )
//			{
//				writeImageFile(fileName, fileType, getItemBlock(itemId).append(".").append(getItemName(itemId)), compressionQuality, imageDepth);
//			}
//
			this.getLogger().trace(this, "F2J : writeImageFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
