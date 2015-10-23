package net.hedtech.banner.general.common.Guqseti.services;

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


import net.hedtech.banner.general.common.Guqseti.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guqseti.model.*;



public class GuqsetiServices extends AbstractSupportCodeObject{
	
	
	public GuqsetiServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuqsetiTask  getTask() {
		return (GuqsetiTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guqseti.model.GuqsetiModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_5
	
	PROCEDURE AUDIT_TRAIL_5_5 IS
<multilinecomment>
AUDIT TRAIL: 5.5
1.  JT 06/17/2002
    This form is used to prompt the user for which institution they'd like to access if they 
    are set up to have access to more than one institution.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:974
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail55()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1.  SJQ 08/11/2003
    Modify the form to add two new parameters (LAUNCH_FORM and KEEP_ALIVE) which were originally
    added to GUAINIT but need to be saved and passed back to GUAINIT when exiting this form.
    Modify the KEY-EXIT trigger to add logic to build the parameter list and add in the new
    parameters.  Changed the way the GUAINIT was being called, made it use the G$_SECURED_FORM_CALL
    routine, passing back the values of the parameters.  Change the two other places which called
    GUAINIT to execute the KEY-EXIT trigger to do the call correctly.

AUDIT TRAIL: 6.2.0.1
1.  G Shalovka  25 May 2004
    Defect 93681.
    Added Form-Level EXIT_PROCEDURE to execute from KEY-NXTKEY and
    GUISETI.VPDI_CODE.When-Mouse-DoubleClick.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:975
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
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
	//ID:976
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 02/16/2004
    Application of enhanced UI methodology.  Please refer to the "SCT Banner 7.0 User Interface
    Technical Methodology" for more details.
2.  SJQ 02/16/2004
    Modify the query block to add an ON-SELECT trigger to perform the query.  This is required
    by this version of the toolset.
3.  SJQ 09/28/2004
    Modified the WHEN-NEW-FORM-INSTANCE trigger to execute the G$_MENU_BAR.SET_FGAC_NOTICE to
    enable/disable the FGAC related icon on the toolbar.  Migrated the defect correction from 
    6.2.0.1 to this release.  Modify that correction to make the KEY-EXIT, KEY-NXTKEY and the
    WHEN-MOUSE-DOUBLECLICK trigger execute the same logic.  Moved the WHEN-MOUSE-DOUBLECLICK
    trigger to the block level so it worked in the description item in addition to the code.
    Modify the detail block to remove the insert, update and delete attributes.  This form 
    should be query only so modifications were made to GUAINIT to call it in query mode. Modify 
    the code and description items to have the autohint display automactically.  

AUDIT TRAIL: 7.3
1.  SJQ 11/17/2005
    Add support for the TIMING parameter which is passed with the URL to GUAINIT.  It is needed
    here to pass it back to GUAINIT when the user exits this form.  Fix broken references on
    several form level triggers.  Changed all places where the logic was doing an ADD_PARAMETER 
    and then a SET_PARAMETER.  These could be done in one command, ADD_PARAMETER.  Updated the 
    ADD_PARAMETER commands and removed the SET_PARAMETER commands.  Removed the VALUE parameter
    since it is not needed.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:977
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
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
	//ID:978
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/28/2007
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS  to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:979
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_4
	
	PROCEDURE AUDIT_TRAIL_8_6_4 IS
<multilinecomment>
AUDIT TRAIL: 8.6.4
1. CR-000101888 Seamless Navigation
   TGKinderman 08/27/2013
   Michael Hitrik
   a. Modify in support of GUQSETI form being called (first time in as a mulit inst user):
      Add BAN_MODE and BAN_ARGS PARAMETERS to the form.
      Add BAN_MODE and BAN_ARGS parameters in logic before GUAINIT form call in form-level trigger EXIT_PROCEDURE.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	//ID:980
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail864()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUQSETI
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Feb 06 08:29:27 2014
-- MSGSIGN : #0000000000000000
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:981
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
