package net.hedtech.banner.document.management.Eoqgpls;



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




public class EoqgplsServices extends AbstractLibrary{
		
	public EoqgplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
	/* package accessor */
	public EImgUtil getEImgUtil() 
	{
		return (EImgUtil)getSupportCodeManager().getPackage("E$_IMG_UTIL");
	}
	/* package accessor */
	public EImgDriver2 getEImgDriver2() 
	{
		return (EImgDriver2)getSupportCodeManager().getPackage("E$_IMG_DRIVER2");
	}
	
	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
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

	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1.  TMT 10/17/2007
    Updated for 8.0 release.

2.  ST 10/30/2007
    Product Name Change.
    Changed 'BXS' to 'BDMS' and 'XtenderSolutions' to 'Document Management Suite'
    at certain places as per the requirement. No changes were done to names
    of the constants, functions and procedures.    
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_7_0_EOQGPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_EOQGPLS IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/19/2003
   Converted to Forms9i
AUDIT TRAIL END

</multilinecomment>
BEGIN
   NULL ;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Eoqgpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Eoqgpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  XZ 08/05/2004
    Modified to support Banner 7.0 menu and toolbar    
2.  XZ 09/28/2004
    Added constant variable IMG_NOT_AX_USER_con in E$_IMG_UTIL package specification.
AUDIT TRAIL END
</multilinecomment>
BEGIN
   NULL ;
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

	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1.  XZ 08/13/2003
  Cloned from BXS 5.3 code
AUDIT TRAIL END

</multilinecomment>
BEGIN
   NULL ;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail60 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit EOQGPLS.AUDIT_TRAIL_5_0
	/*
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  DRM 08-06-2001
    Creating new object.  Source code for forms library EOQRPLS.pll
    is birthed under two separate filenames (EOQGPLS.pll and EOQEPLS.pll),
    and one of them is copied manually at each client site to filename
    EOQRPLS.pll (from which EOQRPLS.plx is compiled).  The difference between the
    two source source code objects is that the one (EOQGPLS.pll)
    is intended simply as a stub for delivery with General 5.3,
    while EOQEPLS.pll contains real code relevant to SCT
    Banner(r) XtenderSolutions(tm).  Both versions of what
    manually becomes EOQRPLS.pll contain the same exact name
    for the sole publicly visible procedure, same arguments,
    etc.  But the stub does no real work, while the real code
    (from EOQEPLS.pll) only ever exists at Banner XtenderSolutions
    sites.
2.  DRM 10-26-2001
    For Banner Contexts (locations in forms) where no BXS Context
    rules exist, a wide-open query has always been done against AX
    Application B-G-ID (no filtration in that query).  This modification
    always pads such queries with a fake parameter (WHERE ID = '[[[[[]]]]',
    which can never occur), which results in 0 records (instead of ALL
    records) being fetched.
--   
AUDIT TRAIL: 5.1.0.1
1.  DRM 05-10-2002
    Defect # 77750 (level 1).
    A NAME_IN() operation extracts data from a given form item, in order
    to formulate a parameter value to send to the OTG side for querying.
    That NAME_IN() operation was too restrictive with regard to field
    "Item Type" and "Datatype" properties.  It has been widened to allow
    for value extraction from List Item (Item Type), as well as all
    datatypes except LONG.
--
AUDIT TRAIL: 5.2
1.  XZ 06/07/2002
		Add the function to read the data source name from database other than 
		using hard-coded data source name
2.  XZ 07/10/2002
    Add the functionality for single login		
3.  DMCGARVE 07/16/2002
    Added Called-Query functionality.  This permits the optional
    passing of a query onto the Legato side of the product, either
    through URL formulation (to invoke WX) or OLE2 (to invoke AX).
AUDIT TRAIL: 5.2.0.1
1.  JMA 11/22/2002
		Modified p_aex_Initiate to get count of results from WX server if AX is not installed.    
--
AUDIT TRAIL: 5.6
1.  XZ 08/05/2003
		Added new package E$_IMG_UTIL AND E$_IMG_DRIVER2. E$_IMG_DRIVER package is now obsolete. 
2.  XZ 08/12/2003
    Removed attachment to GOQRPLS. 
    Added E$_TOOLBAR
3.  XZ 08/12/2003
    Added a new function f_is_bxs_user to E$_IMG_UTIL pacakge    
4.  XZ 08/13/2003
    Added two new functions: f_get_form_name and f_get_form_mode to E$_IMG_UTIL package    
AUDIT TRAIL END

</multilinecomment>
BEGIN
   NULL ;
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

}
