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


public class WebutilDbLocal extends AbstractSupportCodeObject {
	

	public WebutilDbLocal(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_DB_LOCAL
	/*
	PACKAGE WEBUTIL_DB_LOCAL IS

<multilinecomment>********************************************************************************\
 * WebUtil_DB_Local - Acts as a wrapper / Abstraction for the Database functions
 *  used by the WebUtil_File_Transfer Package.  
 *  The functions should not be called externally from WebUtil
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   DRMILLS 13/MAY/2003 - Creation
 *
\********************************************************************************</multilinecomment>

  FUNCTION  OpenBlob(blobTable  in VARCHAR2,
                     blobColumn in VARCHAR2,
                     blobWhere  in VARCHAR2,
                     openMode   in VARCHAR2,
                     chunkSize  in PLS_INTEGER default null) return BOOLEAN;

  FUNCTION  CloseBlob(checksum in PLS_INTEGER) return BOOLEAN;

  PROCEDURE WriteData(data in VARCHAR2);

  FUNCTION ReadData return VARCHAR;

  FUNCTION GetLastError return PLS_INTEGER;

  FUNCTION GetSourceLength  return PLS_INTEGER;

  FUNCTION GetSourceChunks  return PLS_INTEGER;

END WEBUTIL_DB_LOCAL;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_DB_LOCAL
		/*
		PACKAGE BODY WEBUTIL_DB_LOCAL IS

  FUNCTION  OpenBlob(blobTable  in VARCHAR2,
                     blobColumn in VARCHAR2,
                     blobWhere  in VARCHAR2,
                     openMode   in VARCHAR2,
                     chunkSize  in PLS_INTEGER default null) return BOOLEAN is
  BEGIN
    return WebUtil_DB.OpenBlob(blobTable,
                             blobColumn,
                             blobWhere,
                             openMode,
                             chunkSize);
  END OpenBlob;                     

  FUNCTION  CloseBlob(checksum in PLS_INTEGER) return BOOLEAN is
  BEGIN
    return WebUtil_DB.CloseBlob(checksum);
  END CloseBlob;                     
  

  PROCEDURE WriteData(data in VARCHAR2) is
  BEGIN
    WebUtil_DB.WriteData(data);
  END WriteData;                     
  
  FUNCTION ReadData return VARCHAR is
  BEGIN
    return WebUtil_DB.ReadData;
  END ReadData;                     
  

  FUNCTION GetLastError return PLS_INTEGER is
  BEGIN
    return WebUtil_DB.GetLastError;
  END GetLastError;                     
      
  FUNCTION GetSourceLength  return PLS_INTEGER is 
  BEGIN
    return WebUtil_DB.GetSourceLength;
  END GetSourceLength;                     

  FUNCTION GetSourceChunks  return PLS_INTEGER is
  BEGIN
    return WebUtil_DB.GetSourceChunks;
  END GetSourceChunks;                     
  
END WEBUTIL_DB_LOCAL;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blobtable
		* @param blobcolumn
		* @param blobwhere
		* @param openmode
		*/
		public NBool openblob(NString blobtable, NString blobcolumn, NString blobwhere, NString openmode) {
			return openblob(blobtable, blobcolumn, blobwhere, openmode, NInteger.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blobtable
		* @param blobcolumn
		* @param blobwhere
		* @param openmode
		* @param chunksize
		*/
		public NBool openblob(NString blobtable, NString blobcolumn, NString blobwhere, NString openmode, NInteger chunksize)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.openblob(blobtable, blobcolumn, blobwhere, openmode, toStr(chunksize));
//
			this.getLogger().trace(this, "F2J : openblob function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param checksum
		*/
		public NBool closeblob(NInteger checksum)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.closeblob(checksum);
//
			this.getLogger().trace(this, "F2J : closeblob function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param data
		*/
		public void writedata(NString data)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			WebutilDb.writedata(data);
//
			this.getLogger().trace(this, "F2J : writedata procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString readdata()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.readdata();
//
			this.getLogger().trace(this, "F2J : readdata function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getlasterror()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.getlasterror();
//
			this.getLogger().trace(this, "F2J : getlasterror function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getsourcelength()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.getsourcelength();
//
			this.getLogger().trace(this, "F2J : getsourcelength function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getsourcechunks()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WebutilDb.getsourcechunks();
//
			this.getLogger().trace(this, "F2J : getsourcechunks function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
		
	
	
}
