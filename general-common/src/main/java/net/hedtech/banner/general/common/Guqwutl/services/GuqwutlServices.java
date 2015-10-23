package net.hedtech.banner.general.common.Guqwutl.services;

import java.util.*;

import net.sf.jasperreports.engine.export.GridRow;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.util.io.ITextFile;
import morphis.foundations.core.appsupportlib.util.io.TextFileManager;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.banner.general.common.Guqwutl.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
//import net.hedtech.general.common.libraries.Webutil.*;
import net.hedtech.banner.general.common.Guqwutl.model.*;



public class GuqwutlServices extends AbstractSupportCodeObject{
	
	
	public GuqwutlServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuqwutlTask  getTask() {
		return (GuqwutlTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guqwutl.model.GuqwutlModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS 
<multilinecomment> 
AUDIT TRAIL: 7.3
1. TGKinderman 03/02/2006 
   New form used in association with Banner implementation of Oracle's WebUtil for moving data from
   guroupt table to a local folder.  This form called from GOQRPLS.G$_DATA_EXTRACT, FGAGASB.PRINT_TO_WEB
   and GJIREVO.SAVE_AND_PRINT.
2. TGKinderman 04/18/2006
   Workaround for large file problem using CLIENT_TEXT_IO.  Add synchronize after several thousands records
   have been written. (Oracle bug #4726166)

AUDIT TRAIL: 7.4   
1.  TGKinderman 08/22/2006
    Modify the INB Data Extract to no longer write to the GUBOUTP/GUROUTP tables.  GUBOUTD/GUROUTD have been
    created to support the intermidiate collection of the INB Data Extract data.  This form is modified to
    look in GUBOUTD/GUROUTD for the Data Extract and GUBOUTP/GUROUTP for the Finance GASB (FGAGASB) Extract data.
    GUBOUTP/GUROUTP will continue to feed information when being called from GJIREVO form.
    Modify WHEN-BUTTON_PRESSED on EXTRACT_BTN to call PULL_FOR_DATA_EXTRACT if the form is GJIREVO or FGAGASB;
    otherwise, call PULL_FOR_DATA_EXTRACT_OUTD because this is coming from Data Extract and the new GUBOUTD/GUROUTD
    table
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:567
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit PULL_FOR_DATA_EXTRACT
	
	procedure PULL_FOR_DATA_EXTRACT (p_one_up NUMBER,
                                 p_file_number NUMBER,
                                 p_tmp_frm VARCHAR2,
                                 p_tmp_blk VARCHAR2,
                                 p_in_filename VARCHAR2,
                                 p_out_filename OUT VARCHAR2) is
  GUROUTPC_REC          GUROUTP%ROWTYPE;
  OUT_FILE              CLIENT_TEXT_IO.FILE_TYPE;
  OUT_FILE_NAME         VARCHAR2(260);
  PRNT_DESC             VARCHAR2(30);
  USERS_FILE_LOCATION   VARCHAR2(200)  := NULL;
  lv_synch_count        NUMBER(12)     := 0;
--
  CURSOR GUROUTPC IS
    SELECT * FROM GUROUTP
     WHERE GUROUTP_USER_NUM    = :GLOBAL.NUMERIC_USER_ID
       AND GUROUTP_FILE_NUMBER = p_file_number
       AND GUROUTP_ONE_UP_NO   = p_one_up
     ORDER BY GUROUTP_SEQ_NO;
BEGIN
  IF p_in_filename IS NULL THEN
    USERS_FILE_LOCATION := G$_GET_UPRF_DATAEXTRACT;
    OUT_FILE_NAME := p_tmp_frm || '_' || p_tmp_blk || '_' || 
                      to_char(sysdate,'YYYYMMDDHH24MISS') || '.csv';
    IF USERS_FILE_LOCATION IS NULL 
    OR USERS_FILE_LOCATION = 'UNKNOWN' THEN
      MESSAGE( G$_NLS.Get('GUQWUTL-0007', 'FORM','*ERROR* You must first establish a location to Save output.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    OUT_FILE_NAME := USERS_FILE_LOCATION||OUT_FILE_NAME;
  ELSE
    OUT_FILE_NAME := p_in_filename;
  END IF;	
-- --
  OPEN GUROUTPC;
  FETCH GUROUTPC INTO GUROUTPC_REC;
  IF GUROUTPC%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('GUQWUTL-0008', 'FORM','*ERROR* No output found in database for Process Name/Number') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  OUT_FILE := CLIENT_TEXT_IO.FOPEN(OUT_FILE_NAME, 'w');
  CLIENT_TEXT_IO.PUT(OUT_FILE, GUROUTPC_REC.GUROUTP_LINE);
--
-- Now loop thru each row and write it to the output file.
--
  LOOP
    FETCH GUROUTPC INTO GUROUTPC_REC;
    EXIT WHEN GUROUTPC%NOTFOUND;
    CLIENT_TEXT_IO.NEW_LINE(OUT_FILE,1);
    CLIENT_TEXT_IO.PUT(OUT_FILE, GUROUTPC_REC.GUROUTP_LINE);
-- --
-- -- workaround for large file problem is to perform synchronize
-- -- after several thousand rows have been written. (Oracle bug #4726166)
    lv_synch_count := lv_synch_count + 1;
    IF lv_synch_count > 4999 THEN
      SYNCHRONIZE;
      lv_synch_count := 0;
    END IF;
-- --
  END LOOP;
--
  CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
  CLOSE GUROUTPC;
--
  p_out_filename := OUT_FILE_NAME;
EXCEPTION
  WHEN OTHERS THEN
    IF CLIENT_TEXT_IO.IS_OPEN(OUT_FILE) THEN
      CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
    END IF;
    IF SQLCODE = -302000 THEN 
    MESSAGE( G$_NLS.Get('GUQWUTL-0009','FORM','*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.') );
    ELSE
    MESSAGE( G$_NLS.Get('GUQWUTL-0010', 'FORM','*ERROR* An unhandled exception has occurred.') );
    END IF;    
     RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:568
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pOneUp
		* @param pFileNumber
		* @param pTmpFrm
		* @param pTmpBlk
		* @param pInFilename
		* @param pOutFilename
		*/
		public  void pullForDataExtract(NNumber pOneUp, NNumber pFileNumber, NString pTmpFrm, NString pTmpBlk, NString pInFilename, Ref<NString> pOutFilename)
		{
			int rowCount = 0;
			TableRow guroutpcRec= null;
			ITextFile outFile= null;
			NString outFileName= NString.getNull();
			NString prntDesc= NString.getNull();
			NString usersFileLocation = NString.getNull();
			NNumber lvSynchCount = toNumber(0);
			String sqlguroutpc = "SELECT * " +
	" FROM GUROUTP " +
	" WHERE GUROUTP_USER_NUM = :GLOBAL_NUMERIC_USER_ID AND GUROUTP_FILE_NUMBER = :P_P_FILE_NUMBER AND GUROUTP_ONE_UP_NO = :P_P_ONE_UP " +
	" ORDER BY GUROUTP_SEQ_NO";
			DataCursor guroutpc = new DataCursor(sqlguroutpc);
			try {
				try
				{
					if ( pInFilename.isNull() )
					{
						usersFileLocation = getTask().getGoqrpls().gGetUprfDataextract();
						outFileName = pTmpFrm.append("_").append(pTmpBlk).append("_").append(toChar(NDate.getNow(), "YYYYMMDDHH24MISS")).append(".csv");
						if ( usersFileLocation.isNull() || usersFileLocation.equals("UNKNOWN") )
						{
							errorMessage(GNls.Fget(toStr("GUQWUTL-0007"), toStr("FORM"), toStr("*ERROR* You must first establish a location to Save output.")));
							throw new ApplicationException();
						}
						outFileName = usersFileLocation.append(outFileName);
					}
					else {
						outFileName = pInFilename;
					}
					//  --
					//Setting query parameters
					guroutpc.addParameter("GLOBAL_NUMERIC_USER_ID", getGlobal("NUMERIC_USER_ID"));
					guroutpc.addParameter("P_P_FILE_NUMBER", pFileNumber);
					guroutpc.addParameter("P_P_ONE_UP", pOneUp);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable guroutpc.
					guroutpc.open();
					guroutpcRec = guroutpc.fetchRow();
					if ( guroutpc.notFound() )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0008"), toStr("FORM"), toStr("*ERROR* No output found in database for Process Name/Number")));
						throw new ApplicationException();
					}
					// 
					// F2J_TO_COMPLETE Check that the a call to the method TextFileUtils.addDownloadTextFileCommand is properly added after the file is sucessfully written.
					outFile = TextFileManager.openClientFile(outFileName, toStr("w"));
                     
					//outFile.write(guroutpcRec.GuroutpLine);
					outFile.write(guroutpcRec);
					// 
					//  Now loop thru each row and write it to the output file.
					// 
					while (true) {
						guroutpcRec =guroutpc.fetchRow();
						if ( guroutpc.notFound() ) 
							break;
						outFile.writeLn();
						outFile.write(guroutpcRec);
						//  --
						//  -- workaround for large file problem is to perform synchronize
						//  -- after several thousand rows have been written. (Oracle bug #4726166)
						lvSynchCount = lvSynchCount.add(1);
						if ( lvSynchCount.greater(4999) )
						{
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize".
							//							SupportClasses.SQLFORMS.Synchronize();
							this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize'.");
							
							
							lvSynchCount = toNumber(0);
						}
					}
					// 
					outFile.close();
					guroutpc.close();
					// 
					pOutFilename.val = outFileName;
				}
				catch(Exception  e)
				{
					if ( outFile.isOpen() )
					{
						outFile.close();
					}
					if ( errorCode().equals(- (302000)) )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0009"), toStr("FORM"), toStr("*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.")));
					}
					else {
						errorMessage(GNls.Fget(toStr("GUQWUTL-0010"), toStr("FORM"), toStr("*ERROR* An unhandled exception has occurred.")));
					}
					throw new ApplicationException();
				}
				}finally{
					guroutpc.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit PULL_FOR_DATA_EXTRACT_OUTD
	
	procedure PULL_FOR_DATA_EXTRACT_OUTD (p_one_up NUMBER,
                                      p_file_number NUMBER,
                                      p_tmp_frm VARCHAR2,
                                      p_tmp_blk VARCHAR2,
                                      p_in_filename VARCHAR2,
                                      p_out_filename OUT VARCHAR2) is
  GUROUTDC_REC          GUROUTD%ROWTYPE;
  OUT_FILE              CLIENT_TEXT_IO.FILE_TYPE;
  OUT_FILE_NAME         VARCHAR2(260);
  PRNT_DESC             VARCHAR2(30);
  USERS_FILE_LOCATION   VARCHAR2(200)  := NULL;
  lv_synch_count        NUMBER(12)     := 0;
--
  CURSOR GUROUTDC IS
    SELECT * FROM GUROUTD
     WHERE GUROUTD_USER_NUM     = :GLOBAL.NUMERIC_USER_ID
       AND GUROUTD_FILE_NUMBER = p_file_number
       AND GUROUTD_ONE_UP_NO   = p_one_up
     ORDER BY GUROUTD_SEQ_NO;
BEGIN
  IF p_in_filename IS NULL THEN
    USERS_FILE_LOCATION := G$_GET_UPRF_DATAEXTRACT;
    OUT_FILE_NAME := p_tmp_frm || '_' || p_tmp_blk || '_' || 
                      to_char(sysdate,'YYYYMMDDHH24MISS') || '.csv';
    IF USERS_FILE_LOCATION IS NULL 
    OR USERS_FILE_LOCATION = 'UNKNOWN' THEN
      MESSAGE( G$_NLS.Get('GUQWUTL-0011', 'FORM','*ERROR* You must first establish a location to Save output.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    OUT_FILE_NAME := USERS_FILE_LOCATION||OUT_FILE_NAME;
  ELSE
    OUT_FILE_NAME := p_in_filename;
  END IF;	
-- --
  OPEN GUROUTDC;
  FETCH GUROUTDC INTO GUROUTDC_REC;
  IF GUROUTDC%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('GUQWUTL-0012', 'FORM','*ERROR* No output found in database for Process Name/Number') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  OUT_FILE := CLIENT_TEXT_IO.FOPEN(OUT_FILE_NAME, 'w');
  CLIENT_TEXT_IO.PUT(OUT_FILE, GUROUTDC_REC.GUROUTD_LINE);
--
-- Now loop thru each row and write it to the output file.
--
  LOOP
    FETCH GUROUTDC INTO GUROUTDC_REC;
    EXIT WHEN GUROUTDC%NOTFOUND;
    CLIENT_TEXT_IO.NEW_LINE(OUT_FILE,1);
    CLIENT_TEXT_IO.PUT(OUT_FILE, GUROUTDC_REC.GUROUTD_LINE);
-- --
-- -- workaround for large file problem is to perform synchronize
-- -- after several thousand rows have been written. (Oracle bug #4726166)
    lv_synch_count := lv_synch_count + 1;
    IF lv_synch_count > 4999 THEN
      SYNCHRONIZE;
      lv_synch_count := 0;
    END IF;
-- --
  END LOOP;
--
  CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
  CLOSE GUROUTDC;
--
  p_out_filename := OUT_FILE_NAME;
EXCEPTION
  WHEN OTHERS THEN
    IF CLIENT_TEXT_IO.IS_OPEN(OUT_FILE) THEN
      CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
    END IF;
    IF SQLCODE = -302000 THEN 
    MESSAGE( G$_NLS.Get('GUQWUTL-0013','FORM','*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.') );
    ELSE
    MESSAGE( G$_NLS.Get('GUQWUTL-0014', 'FORM','*ERROR* An unhandled exception has occurred.') );
    END IF; 
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:569
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pOneUp
		* @param pFileNumber
		* @param pTmpFrm
		* @param pTmpBlk
		* @param pInFilename
		* @param pOutFilename
		*/
		public void pullForDataExtractOutd(NNumber pOneUp, NNumber pFileNumber, NString pTmpFrm, NString pTmpBlk, NString pInFilename, Ref<NString> pOutFilename)
		{
			int rowCount = 0;
			TableRow guroutdcRec= null;
			ITextFile outFile= null;
			NString outFileName= NString.getNull();
			NString prntDesc= NString.getNull();
			NString usersFileLocation = NString.getNull();
			NNumber lvSynchCount = toNumber(0);
			String sqlguroutdc = "SELECT * " +
	" FROM GUROUTD " +
	" WHERE GUROUTD_USER_NUM = :GLOBAL_NUMERIC_USER_ID AND GUROUTD_FILE_NUMBER = :P_P_FILE_NUMBER AND GUROUTD_ONE_UP_NO = :P_P_ONE_UP " +
	" ORDER BY GUROUTD_SEQ_NO";
			DataCursor guroutdc = new DataCursor(sqlguroutdc);
			try {
				try
				{
					if ( pInFilename.isNull() )
					{
						usersFileLocation = getTask().getGoqrpls().gGetUprfDataextract();
						outFileName = pTmpFrm.append("_").append(pTmpBlk).append("_").append(toChar(NDate.getNow(), "YYYYMMDDHH24MISS")).append(".csv");
						if ( usersFileLocation.isNull() || usersFileLocation.equals("UNKNOWN") )
						{
							errorMessage(GNls.Fget(toStr("GUQWUTL-0011"), toStr("FORM"), toStr("*ERROR* You must first establish a location to Save output.")));
							throw new ApplicationException();
						}
						outFileName = usersFileLocation.append(outFileName);
					}
					else {
						outFileName = pInFilename;
					}
					//  --
					//Setting query parameters
					guroutdc.addParameter("GLOBAL_NUMERIC_USER_ID", getGlobal("NUMERIC_USER_ID"));
					guroutdc.addParameter("P_P_FILE_NUMBER", pFileNumber);
					guroutdc.addParameter("P_P_ONE_UP", pOneUp);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable guroutdc.
					guroutdc.open();
					guroutdcRec = guroutdc.fetchRow();
					if ( guroutdc.notFound() )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0012"), toStr("FORM"), toStr("*ERROR* No output found in database for Process Name/Number")));
						throw new ApplicationException();
					}
					// 
					// F2J_TO_COMPLETE Check that the a call to the method TextFileUtils.addDownloadTextFileCommand is properly added after the file is sucessfully written.
					outFile = TextFileManager.openClientFile(outFileName, toStr("w"));
;
					outFile.write(guroutdcRec);
					// 
					//  Now loop thru each row and write it to the output file.
					// 
					while (true) {
						guroutdcRec = guroutdc.fetchRow();
						if ( guroutdc.notFound() ) 
							break;
						outFile.writeLn();
						outFile.write(guroutdcRec);
						//  --
						//  -- workaround for large file problem is to perform synchronize
						//  -- after several thousand rows have been written. (Oracle bug #4726166)
						lvSynchCount = lvSynchCount.add(1);
						if ( lvSynchCount.greater(4999) )
						{
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize".
							//							SupportClasses.SQLFORMS.Synchronize();
							this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize'.");
							
							
							lvSynchCount = toNumber(0);
						}
					}
					// 
					outFile.close();
					guroutdc.close();
					// 
					pOutFilename.val = outFileName;
				}
				catch(Exception  e)
				{
					if ( outFile.isOpen() )
					{
						outFile.close();
					}
					if ( errorCode().equals(- (302000)) )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0013"), toStr("FORM"), toStr("*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.")));
					}
					else {
						errorMessage(GNls.Fget(toStr("GUQWUTL-0014"), toStr("FORM"), toStr("*ERROR* An unhandled exception has occurred.")));
					}
					throw new ApplicationException();
				}
				}finally{
					guroutdc.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit PULL_FOR_DATA_EXTRACT_STRIP
	
	procedure PULL_FOR_DATA_EXTRACT_STRIP (p_one_up NUMBER,
                                       p_file_number NUMBER,
                                       p_tmp_frm VARCHAR2,
                                       p_tmp_blk VARCHAR2,
                                       p_in_filename VARCHAR2,
                                       p_out_filename OUT VARCHAR2) is
-- --
-- -- This procedure is a near-clone of PULL_FOR_DATA_EXTRACT except this procedure will strip (using
-- -- substr) the last character of each guroutp row.  This last character is a print-file special
-- -- character like a linefeed or a formfeed.  This will be similar to uprf setting TEXT and then
-- -- saving from the browser to your local.
-- --
-- --  GUROUTPC_REC          GUROUTP%ROWTYPE;
  OUT_LINE_LESS_ONE     VARCHAR2(2000);
  OUT_FILE              CLIENT_TEXT_IO.FILE_TYPE;
  OUT_FILE_NAME         VARCHAR2(260);
  PRNT_DESC             VARCHAR2(30);
  USERS_FILE_LOCATION   VARCHAR2(200)  := NULL;
  lv_synch_count        NUMBER(12)     := 0;
--
  CURSOR GUROUTPC IS
-- --    SELECT * FROM GUROUTP
    SELECT SUBSTR(GUROUTP_LINE,1,LENGTH(GUROUTP_LINE) - 1)
      FROM GUROUTP
     WHERE GUROUTP_USER_NUM    = :GLOBAL.NUMERIC_USER_ID
       AND GUROUTP_FILE_NUMBER = p_file_number
       AND GUROUTP_ONE_UP_NO   = p_one_up
     ORDER BY GUROUTP_SEQ_NO;
BEGIN
  IF p_in_filename IS NULL THEN
    USERS_FILE_LOCATION := G$_GET_UPRF_DATAEXTRACT;
    OUT_FILE_NAME := p_tmp_frm || '_' || p_tmp_blk || '_' || 
                      to_char(sysdate,'YYYYMMDDHH24MISS') || '.csv';
    IF USERS_FILE_LOCATION IS NULL 
    OR USERS_FILE_LOCATION = 'UNKNOWN' THEN
      MESSAGE( G$_NLS.Get('GUQWUTL-0015', 'FORM','*ERROR* You must first establish a location to Save output.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    OUT_FILE_NAME := USERS_FILE_LOCATION||OUT_FILE_NAME;
  ELSE
    OUT_FILE_NAME := p_in_filename;
  END IF;	
-- --
  OPEN GUROUTPC;
  FETCH GUROUTPC INTO OUT_LINE_LESS_ONE;
  IF GUROUTPC%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('GUQWUTL-0016', 'FORM','*ERROR* No output found in database for Process Name/Number') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  OUT_FILE := CLIENT_TEXT_IO.FOPEN(OUT_FILE_NAME, 'w');
  CLIENT_TEXT_IO.PUT(OUT_FILE, OUT_LINE_LESS_ONE);
  CLIENT_TEXT_IO.NEW_LINE(OUT_FILE,1);
--
-- Now loop thru each row and write it to the output file.
--
  LOOP
    FETCH GUROUTPC INTO OUT_LINE_LESS_ONE;
    EXIT WHEN GUROUTPC%NOTFOUND;
    CLIENT_TEXT_IO.PUT(OUT_FILE, OUT_LINE_LESS_ONE);
    CLIENT_TEXT_IO.NEW_LINE(OUT_FILE,1);
-- --
-- -- workaround for large file problem is to perform synchronize
-- -- after several thousand rows have been written. (Oracle bug #4726166)
    lv_synch_count := lv_synch_count + 1;
    IF lv_synch_count > 4999 THEN
      SYNCHRONIZE;
      lv_synch_count := 0;
    END IF;
-- --
  END LOOP;
--
  CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
  CLOSE GUROUTPC;
--
  p_out_filename := OUT_FILE_NAME;
EXCEPTION
  WHEN OTHERS THEN
    IF CLIENT_TEXT_IO.IS_OPEN(OUT_FILE) THEN
      CLIENT_TEXT_IO.FCLOSE(OUT_FILE);
    END IF;
    IF SQLCODE = -302000 THEN 
    MESSAGE( G$_NLS.Get('GUQWUTL-0017','FORM','*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.') );
    ELSE
    MESSAGE( G$_NLS.Get('GUQWUTL-0018', 'FORM','*ERROR* An unhandled exception has occurred.') );
    END IF; 
    RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:570
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pOneUp
		* @param pFileNumber
		* @param pTmpFrm
		* @param pTmpBlk
		* @param pInFilename
		* @param pOutFilename
		*/
		public void pullForDataExtractStrip(NNumber pOneUp, NNumber pFileNumber, NString pTmpFrm, NString pTmpBlk, NString pInFilename, Ref<NString> pOutFilename)
		{
			int rowCount = 0;
			//  --
			//  -- This procedure is a near-clone of PULL_FOR_DATA_EXTRACT except this procedure will strip (using
			//  -- substr) the last character of each guroutp row.  This last character is a print-file special
			//  -- character like a linefeed or a formfeed.  This will be similar to uprf setting TEXT and then
			//  -- saving from the browser to your local.
			//  --
			//  --  GUROUTPC_REC          GUROUTP%ROWTYPE;
			NString outLineLessOne= NString.getNull();
			ITextFile outFile= null;
			NString outFileName= NString.getNull();
			NString prntDesc= NString.getNull();
			NString usersFileLocation = NString.getNull();
			NNumber lvSynchCount = toNumber(0);
			String sqlguroutpc = "SELECT SUBSTR(GUROUTP_LINE, 1, LENGTH(GUROUTP_LINE) - 1) " +
	" FROM GUROUTP " +
	" WHERE GUROUTP_USER_NUM = :GLOBAL_NUMERIC_USER_ID AND GUROUTP_FILE_NUMBER = :P_P_FILE_NUMBER AND GUROUTP_ONE_UP_NO = :P_P_ONE_UP " +
	" ORDER BY GUROUTP_SEQ_NO";
			DataCursor guroutpc = new DataCursor(sqlguroutpc);
			try {
				try
				{
					if ( pInFilename.isNull() )
					{
						usersFileLocation = getTask().getGoqrpls().gGetUprfDataextract();
						outFileName = pTmpFrm.append("_").append(pTmpBlk).append("_").append(toChar(NDate.getNow(), "YYYYMMDDHH24MISS")).append(".csv");
						if ( usersFileLocation.isNull() || usersFileLocation.equals("UNKNOWN") )
						{
							errorMessage(GNls.Fget(toStr("GUQWUTL-0015"), toStr("FORM"), toStr("*ERROR* You must first establish a location to Save output.")));
							throw new ApplicationException();
						}
						outFileName = usersFileLocation.append(outFileName);
					}
					else {
						outFileName = pInFilename;
					}
					//  --
					//Setting query parameters
					guroutpc.addParameter("GLOBAL_NUMERIC_USER_ID", getGlobal("NUMERIC_USER_ID"));
					guroutpc.addParameter("P_P_FILE_NUMBER", pFileNumber);
					guroutpc.addParameter("P_P_ONE_UP", pOneUp);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable guroutpc.
					guroutpc.open();
					ResultSet guroutpcResults = guroutpc.fetchInto();
					if ( guroutpcResults != null ) {
						outLineLessOne = guroutpcResults.getStr(0);
					}
					if ( guroutpc.notFound() )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0016"), toStr("FORM"), toStr("*ERROR* No output found in database for Process Name/Number")));
						throw new ApplicationException();
					}
					// 
					// F2J_TO_COMPLETE Check that the a call to the method TextFileUtils.addDownloadTextFileCommand is properly added after the file is sucessfully written.
					outFile = TextFileManager.openClientFile(outFileName, toStr("w"));
;
					outFile.write(outLineLessOne);
					outFile.writeLn();
					// 
					//  Now loop thru each row and write it to the output file.
					// 
					while (true) {
//						ResultSet guroutpcResults = guroutpc.fetchInto();
						if ( guroutpcResults != null ) {
							outLineLessOne = guroutpcResults.getStr(0);
						}
						if ( guroutpc.notFound() ) 
							break;
						outFile.write(outLineLessOne);
						outFile.writeLn();
						//  --
						//  -- workaround for large file problem is to perform synchronize
						//  -- after several thousand rows have been written. (Oracle bug #4726166)
						lvSynchCount = lvSynchCount.add(1);
						if ( lvSynchCount.greater(4999) )
						{
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize".
							//							SupportClasses.SQLFORMS.Synchronize();
							this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUQWUTLF2NMigrationGuide.xml#ExcludeSynchronize'.");
							
							
							lvSynchCount = toNumber(0);
						}
					}
					// 
					outFile.close();
					guroutpc.close();
					// 
					pOutFilename.val = outFileName;
				}
				catch(Exception  e)
				{
					if ( outFile.isOpen() )
					{
						outFile.close();
					}
					if ( errorCode().equals(- (302000)) )
					{
						errorMessage(GNls.Fget(toStr("GUQWUTL-0017"), toStr("FORM"), toStr("*ERROR* The local directory for saving output specified on GUAUPRF is invalid. Please specify a valid directory.")));
					}
					else {
						errorMessage(GNls.Fget(toStr("GUQWUTL-0018"), toStr("FORM"), toStr("*ERROR* An unhandled exception has occurred.")));
					}
					throw new ApplicationException();
				}
				}finally{
					guroutpc.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS 
<multilinecomment> 

AUDIT TRAIL: 8.0    
1.  TGKinderman 01/18/2007 
    Apply the following 7.4.0.1 modifications to 8.0
*************
START 7.4.0.1
1.  TGKinderman 12/19/2006
    Modify exit_btn label from Cancel to Close.  (1-16WKRD)
2.  TGKinderman 12/19/2006
    Modify EXTRACT.WHEN-BUTTON-PRESSED to call pl/sql unit PULL_FOR_DATA_EXTRACT_STRIP if the calling form is GJIREVO. 
    This pl/sql unit will strip the last character from the outp row and then force a carriage return.  This logic
    simulates the prior behavior of TEXT and then saving to the local from the browser display.  (1-1A5EHC)
END 7.4.0.1
***********
2. ShylajaS 10/16/2007
   Added G$_NLS.Get to support
   Internationalization Requirement.
   Defect 1-1ADJKV

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:571
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_0_1
	
	PROCEDURE AUDIT_TRAIL_8_0_0_1 IS 
<multilinecomment> 

AUDIT TRAIL: 8.0.0.1    
1. Eapen Mani 10 June 2008
   Defect: 1-3F9L53 
	 ISC Defect Corrections. 
	 
2. Eapen Mani 25 June 2008
   Defect:1-3F9LHP
   ISC Defect: Removed the G$_NLS.Get from w-n-f-i trigger.
  
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:572
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8001()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUQWUTL
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Aug 28 07:13:55 2012
-- MSGSIGN : #eeba234d29e02788
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:573
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment> 

AUDIT TRAIL: 8.3
1. Swati Aggarwal  07 July 2009
   Defect: 1-3Y804A
	 Added code in PULL_FOR_DATA_EXTRACT,PULL_FOR_DATA_EXTRACT_OUTD,PULL_FOR_DATA_EXTRACT_STRIP
	 procedures for handling a exception code -302000 Which comes when local directory value 
	 is invaild in a GUAUPRF form.
	 	 
AUDIT TRAIL END 
</multilinecomment>  
BEGIN
 NULL;
END;
	*/
	//ID:574
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_2
	
	PROCEDURE AUDIT_TRAIL_8_3_0_2 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.2
1. EM  02/04/2010 
   Defect # : 1-8BE53Z 
   Solution : Replaced the hardcoded 'DD-MON-YYYY HH24:MI:SS' with G$_DATE.GET_NLS_DATE_FORMAT||' HH24:MI:SS'
              in package DelimStr.
AUDIT TRAIL END
</multilinecomment>
BEGIN
 	NULL;
END;
	*/
	//ID:575
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8302()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_2
	
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment>
AUDIT TRAIL: 8.4.2
1. Defect 1-CSSTSL  
   TGKinderman  05/04/2011
   Problem: Database Extension Utility is to assure tables have certain columns (with appropriate data type/length).
   One of those columns is _USER_ID VARCHAR2(30).  Tables GUBOUTP and GUROUTP, created some time ago, were created
   with columns _USER_ID NUMBER. This column name collides with the intent of the Database Extension Utility.  
   Solution: Existing columns (_USER_ID NUMBER) are being renamed to GUBOUTP_USER_NUM and GUROUTP_USER_NUM, both of
   type NUMBER. Database Extension Utility can subsequently add column _USER_ID VARCHAR2(30) to both tables.
   
AUDIT TRAIL END 
</multilinecomment>

BEGIN
	NULL;
  
END;
	*/
	//ID:576
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail842()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_1_4
	
	PROCEDURE AUDIT_TRAIL_8_5_1_4 IS
<multilinecomment>
AUDIT TRAIL: 8.5.1.4
1. Defect 1-12TFA6X  
   TGKinderman  07/25/2012
   Problem: 
   When using WebUtil with Forms11gR2 (Forms11.1.2.0.0) form GUQWUTL encounters error FRM-40735: WHEN-CUSTOM-ITEM-EVENT
   trigger raised unhandled exception ORA-06502: PL/SQL numeric or value error.  
   Solution: 
   The original BANNER Baseline implementation of WebUtil (done with Banner General 7.3 in 2006) was done by placing
   Webutil.pll pl/sql units into the BASELINE form guqwutl.fmb. This approach simplified the migration and form
   generation segments of the release in that guqwutl.fmb was the only object requiring the WebUtil functionality.
   Oracle has since modified Webutil (in association with Forms11.1.2) in the areas of CLIENT_TEXT_IO such that this
   approach is no longer viable.
   Modifications:
   Remove webutil related pl/sql units from this form. Attach library webutil.pll to this form. Be sure to use the version
   of webutil.pll that is associated with the version of Forms being used (found at ORACLE_HOME\forms folder). The webutil.pll
   library file should be placed into the FORMS_PATH such that it is seen at generate time. The generated executable, webutil.plx,
   should also be placed into the FORMS_PATH such that it is seen at runtime.
   
AUDIT TRAIL END 
</multilinecomment>

BEGIN
	NULL;
  
END;
	*/
	//ID:577
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8514()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>

Copyright 2006-2012 Ellucian Company L.P. and its affiliates.

</multilinecomment>
BEGIN
  NULL;  
END;
	*/
	//ID:578
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	

}
