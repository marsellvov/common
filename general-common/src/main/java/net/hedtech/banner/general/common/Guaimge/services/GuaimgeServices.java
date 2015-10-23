package net.hedtech.banner.general.common.Guaimge.services;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
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
import net.hedtech.banner.general.common.Guaimge.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guaimge.model.*;



public class GuaimgeServices extends AbstractSupportCodeObject{
	
	
	public GuaimgeServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuaimgeTask  getTask() {
		return (GuaimgeTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guaimge.model.GuaimgeModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:273
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.  
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:274
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:275
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:276
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:277
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4
	
	PROCEDURE AUDIT_TRAIL_7_4 IS
<multilinecomment>
AUDIT TRAIL: 7.4
1.  TGK 10/04/2006
    Modify property of PERSON_IMAGE Sizing Style from Crop to Adjust.
2.  TGK 10/04/2006
    Modify WHEN-NEW-FORM-INSTANCE relative to 7.4 modifications to GORRPLS.G$_DISPLAY_IMAGE pl/sql unit.
    This is in support of optional environment variables BAN_GUAIMGE_ID_RANGE and BAN_GUAIMGE_EXTENSION.  These env
    vars (if present) will apply controls over the name of the image file being constructed. If these environment
    variable are not present or not valued, will function as prior to this modification and use  ID positions 3,7
    prefixed with I and extension of BMP.  
    BAN_GUAIMGE_ID_RANGE can be 3,7 or 1,9.  If specified, will search for that named-image-file first.  If not found
    will then search for the other-named-image file format. (reason: if sites are wanting to continue using the old
    named-image file format of 3,7 prefixed with I and for any new IDs use the 1,9 or full IDvalue for the name of the
    image file; they would specify BAN_GUAIMGE_ID_RANGE=1,9)
    Extension can be BMP, GIF, JPG or TIF.
3.  TGK 10/23/2006
    Add pl/sql units INIT_GLOBAL_ID_RANGE and INIT_GLOBAL_EXTENSION, calls to units in WHEN-NEW-FORM-INSTANCE and
    clearing of GLOBAL.IMAGE_NAME when exiting the form. This will provide for: 1) that the form is only to be run
    from an ID field and 2) run by selecting "Help/Display ID Image" from the form's menu.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:278
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail74()
		{
		}

	
	/* Original PL/SQL code for Prog Unit INIT_GLOBAL_ID_RANGE
	
	PROCEDURE INIT_GLOBAL_ID_RANGE IS
-- -- This logic is cloned from GOQRPLS.G$_DISPLAY_IMAGE
-- -- It is only necessary to be called in this form for odd case that a user should try to
-- -- run the GUAIMGE form directly.  This form is only properly run from a form where the
-- -- cursor is sitting in an ID field and you then select "Help/Display ID Image" from the menu
-- values for this are:
-- 3,7 and it will get I appended into name such that it works similar to way before 7.4
-- 1,9 for those that want the value in the ID field to be equivalent to file prefix
  lv_guaimge_id_range        VARCHAR2(3) := '';
-- --
BEGIN
-- -- -- ID Range
	DEFAULT_VALUE('XX','GLOBAL.BAN_GUAIMGE_ID_RANGE');
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_ID_RANGE') = 'XX' THEN
    tool_env.getvar('BAN_GUAIMGE_ID_RANGE', lv_guaimge_id_range);
    IF lv_guaimge_id_range IS NULL THEN
    	DEFAULT_VALUE('N','GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');
      lv_guaimge_id_range := '3,7';
    ELSE
  	  DEFAULT_VALUE('Y','GLOBAL.BAN_GUAIMGE_DUAL_SEARCH');
    END IF;
    IF lv_guaimge_id_range NOT IN ('3,7','1,9') THEN
      MESSAGE(G$_NLS.Get('GUAIMGE-0003','FORM','*WARNING* Configuration for ID field is invalid.  Cannot display Image.'));
      RETURN;
    END IF;
    COPY(lv_guaimge_id_range,'GLOBAL.BAN_GUAIMGE_ID_RANGE');
  END IF;  
END;
	*/
	//ID:279
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void initGlobalIdRange()
		{
			//  -- This logic is cloned from GOQRPLS.G$_DISPLAY_IMAGE
			//  -- It is only necessary to be called in this form for odd case that a user should try to
			//  -- run the GUAIMGE form directly.  This form is only properly run from a form where the
			//  -- cursor is sitting in an ID field and you then select "Help/Display ID Image" from the menu
			//  values for this are:
			//  3,7 and it will get I appended into name such that it works similar to way before 7.4
			//  1,9 for those that want the value in the ID field to be equivalent to file prefix
			NString lvGuaimgeIdRange = toStr("");
			//  -- -- ID Range
			setDefaultValue("XX", "GLOBAL.BAN_GUAIMGE_ID_RANGE");
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_ID_RANGE").equals("XX") )
			{
				
				//TODO Morphis fun��o inesperada.
				lvGuaimgeIdRange =  getEnvVar("BAN_GUAIMGE_ID_RANGE");//, lvGuaimgeIdRange);
				if ( lvGuaimgeIdRange.isNull() )
				{
					setDefaultValue("N", "GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
					lvGuaimgeIdRange = toStr("3,7");
				}
				else {
					setDefaultValue("Y", "GLOBAL.BAN_GUAIMGE_DUAL_SEARCH");
				}
				if ( !in(lvGuaimgeIdRange, "3,7", "1,9").getValue() )
				{
					warningMessage(GNls.Fget(toStr("GUAIMGE-0003"), toStr("FORM"), toStr("*WARNING* Configuration for ID field is invalid.  Cannot display Image.")));
					return ;
				}
				copy(lvGuaimgeIdRange,"GLOBAL.BAN_GUAIMGE_ID_RANGE");
			}
		}

	
	/* Original PL/SQL code for Prog Unit INIT_GLOBAL_EXTENSION
	
	PROCEDURE INIT_GLOBAL_EXTENSION IS
-- -- This logic is cloned from GOQRPLS.G$_DISPLAY_IMAGE
-- -- It is only necessary to be called in this form for odd case that a user should try to
-- -- run the GUAIMGE form directly.  This form is only properly run from a form where the
-- -- cursor is sitting in an ID field and you then select "Help/Display ID Image" from the menu
-- values for this are:
  lv_guaimge_extension       VARCHAR2(4)  := '';
-- --
BEGIN
-- -- -- Image extension
	DEFAULT_VALUE('XX','GLOBAL.BAN_GUAIMGE_EXTENSION');
  IF NAME_IN('GLOBAL.BAN_GUAIMGE_EXTENSION') = 'XX' THEN
    tool_env.getvar('BAN_GUAIMGE_EXTENSION', lv_guaimge_extension);
    IF lv_guaimge_extension IS NULL THEN
      lv_guaimge_extension := 'BMP';
    END IF;
    IF UPPER(lv_guaimge_extension) NOT IN ('BMP','GIF','JPG','TIF') THEN
      MESSAGE(G$_NLS.Get('GUAIMGE-0004','FORM','*WARNING* Configuration for File Extension is invalid.  Cannot display Image.'));
      RETURN;
    END IF;    
    COPY(UPPER(lv_guaimge_extension),'GLOBAL.BAN_GUAIMGE_EXTENSION');
  END IF;
-- --  
END;
	*/
	//ID:280
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void initGlobalExtension()
		{
			//  -- This logic is cloned from GOQRPLS.G$_DISPLAY_IMAGE
			//  -- It is only necessary to be called in this form for odd case that a user should try to
			//  -- run the GUAIMGE form directly.  This form is only properly run from a form where the
			//  -- cursor is sitting in an ID field and you then select "Help/Display ID Image" from the menu
			//  values for this are:
			NString lvGuaimgeExtension = toStr("");
			//  -- -- Image extension
			setDefaultValue("XX", "GLOBAL.BAN_GUAIMGE_EXTENSION");
			if ( getNameIn("GLOBAL.BAN_GUAIMGE_EXTENSION").equals("XX") )
			{
				lvGuaimgeExtension = getEnvVar("BAN_GUAIMGE_EXTENSION"); //, lvGuaimgeExtension);
				if ( lvGuaimgeExtension.isNull() )
				{
					lvGuaimgeExtension = toStr("BMP");
				}
				if ( !in(upper(lvGuaimgeExtension), "BMP", "GIF", "JPG", "TIF").getValue() )
				{
					warningMessage(GNls.Fget(toStr("GUAIMGE-0004"), toStr("FORM"), toStr("*WARNING* Configuration for File Extension is invalid.  Cannot display Image.")));
					return ;
				}
				copy(upper(lvGuaimgeExtension),"GLOBAL.BAN_GUAIMGE_EXTENSION");
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. RK   07 August 2006
  Migration from 7x to 8.0
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:281
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1
1. Eapen Mani   03 June 2008
   Defect:1-3MLX0Q
   Added 'FORM' to messages in INIT_GLOBAL_ID_RANGE and INIT_GLOBAL_EXTENSION procedures in program units.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:282
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAIMGE
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Jun 13 14:57:27 2008
-- MSGSIGN : #3200f5b6fbd0a089
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:283
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	public void checkImageExists(NString img)
	{
		try {
			URL url = new URL(img.getValue());
		
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.setRequestMethod("HEAD");
			int responseCode = huc.getResponseCode();
	
			if (responseCode != 200) 
				throw new ApplicationException();
			
		} catch (Exception e) {
			throw new ApplicationException(e.getMessage());
		}
	}
		

}
