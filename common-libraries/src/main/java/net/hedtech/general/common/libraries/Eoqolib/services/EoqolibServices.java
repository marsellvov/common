package net.hedtech.general.common.libraries.Eoqolib.services;

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


import net.hedtech.general.common.libraries.Eoqolib.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Eoqolib.model.*;



public class EoqolibServices extends AbstractSupportCodeObject{
	
	
	public EoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public EoqolibTaskPart  getTask() {
		return (EoqolibTaskPart )super.getContainer();
	}

	
	public net.hedtech.general.common.libraries.Eoqolib.model.EoqolibModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
BEGIN
  <multilinecomment>
   AUDIT TRAIL: 4.0 
1. Created a new form     TI 02/15/01
AUDIT TRAIL END;
</multilinecomment>
NULL;
END;
	*/
	//ID:23
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
			// AUDIT TRAIL: 4.0
			// 1. Created a new form     TI 02/15/01
			// AUDIT TRAIL END;
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  DRM    09/12/2001
    Cloned from 4.0 version of this form.
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
END;

	*/
	//ID:24
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  XZ    07/31/2003
    Cloned from 5.3 version of this form. 
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
END;
	*/
	//ID:25
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_EOQOLIB
	
	PROCEDURE AUDIT_TRAIL_7_0_EOQOLIB IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/21/2003
   Converted to Forms9i
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
END;

	*/
	//ID:26
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Eoqolib()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0.1
1.  DRM   09/13/2005
    Corrected width of descriptor field for
    record group ETVAXAP_RG from 8 to 64.
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
END;
	*/
	//ID:27
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
	//ID:28
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. TMT 10/15/2007
   Release Number updated to 8.0.
2. TMT 10/23/2007
   The product name for BXS is being changed from "BXS" and "Banner XtenderSolutions" to
   "BDMS" and "Banner Document Management Suite" respectively.                          
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	//ID:29
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
BEGIN
  <multilinecomment>
AUDIT TRAIL: 8.5
1. MVC 16/10/2012
   Added for rekey for I18N standards.       
AUDIT TRAIL END
</multilinecomment>
NULL;
END;
	*/
	//ID:30
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail85()
		{
			// AUDIT TRAIL: 8.5
			// 1. MVC 16/10/2012
			// Added for rekey for I18N standards.
			// AUDIT TRAIL END
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
    <multilinecomment> 
    Copyright 2012 Ellucian. 
    </multilinecomment> 
    BEGIN
      NULL;
    END;

	*/
	//ID:31
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : EOQOLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Nov 02 04:48:59 2012
-- MSGSIGN : #0000000000000000
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:32
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	

}
