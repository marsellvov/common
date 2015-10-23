package net.hedtech.general.common.libraries.Goqgmnu;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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




public class GoqgmnuServices extends AbstractLibrary{
		
	public GoqgmnuServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
	/* package accessor */
	public GMultiRecSelection getGMultiRecSelection() 
	{
		return (GMultiRecSelection)getSupportCodeManager().getPackage("G$_MULTI_REC_SELECTION");
	}
	
	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
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
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailNlsDateSupport procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_8_0_GOQGMNU
	/*
	PROCEDURE AUDIT_TRAIL_8_0_GOQGMNU IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. TGKinderman 10/22/2007
   Creation of 8.0 entry  

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Goqgmnu()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80Goqgmnu procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_7_0_GOQGMNU
	/*
	PROCEDURE AUDIT_TRAIL_7_0_GOQGMNU IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/19/2003
   Converted to Forms9i
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Goqgmnu()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Goqgmnu procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 02/09/2004
    Application of enhanced UI methodology.  Please refer to the "SCT Banner 7.0 User Interface
    Technical Methodology" for more details. 
2.  SJQ 02/09/2004
    Remove all of the routines which refer to client/server specific functionality or mouse 
    movement functionality.  Removed duplicated or obsolete routines.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_5_0
	/*
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  TGKinderman 06/13/2000
    Dev6.0 Upgrade.
2.  SJQ 08/25/2000
    Removed all of the WIN_API packages since these were duplicates of the ones
    in the GOQRPLS library.
3.  SJQ 09/07/2000
    Removed local copy of CURSORSET routine.  Not used anymore.
    
AUDIT TRAIL: 5.4
1.  SJQ 10/17/2001
    Modified the G$_HINT_TEXT_ITEM package to remove references to the SHWHNT32.DLL.
    The package is being left in for compatibility reasons and will be removed with
    the next major release.
2.  SJQ 01/05/2002
    Modify the G$_MULTI_REC_SELECTION routine to change the visual attribute for both
    the GUBOBJS_NAME and GUBOBJS_DESC fields.  It was only setting it for the description
    field.  This is for the menu enhancement which would display the object name if the
    user requests it.
3.  SJQ 01/10/2002
    Modify the G$_MULTI_DRAG to increase the offset position for the menu name button.
4.  SJQ 01/15/2002
    Renamed some of the routines which do not appear to be used anywhere so that in a future
    release these routines can be removed.  They all end in "1".
5.  SJQ 02/11/2002
    Modify the G$_SET_SCROLL_VIEW routine to change a local variable so that it is no longer
    a reserved word.  Also add logic so that when resizing the item to match the width of the
    canvas that if the name of the item is the menu description to not reset the item's
    width since a horizontal scroll bar was added to that canvas.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQGMNU.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.  JC 04/14/98
    New library file for menu style forms.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
