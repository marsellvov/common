package net.hedtech.general.common.libraries.Eoqrpls;



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




public class EoqrplsServices extends AbstractLibrary{
		
	public EoqrplsServices (LibraryConfiguration configuration,
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
	/* package accessor */
	public EImgDriver getEImgDriver() 
	{
		return (EImgDriver)getSupportCodeManager().getPackage("E$_IMG_DRIVER");
	}
	

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
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
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1.TMT 10-17-2007 
	Changes for release 8.0.
	
2.  ST 10/30/2007
    Product Name Change.
    Changed 'BXS' to 'BDMS' and 'XtenderSolutions' to 'Document Management Suite'
    at certain places as per the requirement. No changes were done to names
    of the constants, functions, procedures.  	
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_7_2
	/*
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment>
AUDIT TRAIL: 7.2
1.SA 02-06-2007 
	Changes needed to comply with branding objectives/guidelines.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_7_1
	/*
	PROCEDURE Audit_Trail_7_1 IS
<multilinecomment>
AUDIT TRAIL: 7.1
1.SA 17-10-2006 
	modified references to EOKIMAG.p_get_bax_enabled_ind with references to EFKIMAG.p_get_bax_enabled_ind
2.SA 17-10-2006 
  modified references to EOKIMAG.p_insert_exrrslt with EOKRSLT.p_insert_exrrslt
3.SA 17-10-2006 
  modified references to EOKIMAG.p_is_user_ax_user with EFKIMAG.p_is_user_ax_user
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
		public void auditTrail71()
		{
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  XZ 08-05-2004
    Copied from BXS 6.2	  
    Modified to support Banner 7.0 menu and toolbar
2.  XZ 08-12-2004
    Added password synchronization logic    
3.  XZ 10-02-2004
    Modified to use BASE64 encoding for credential strings    
4.  XZ 10-28-2004
    Fixed BXS internal defect 70-0021
AUDIT TRAIL: 7.0.1
1. DRM 09-09-2005
   Modified E$_IMG_UTIL to retrieve SSO password from the system settings table.
   Modified E$_IMG_UTIL to call a new Java-based stored procedure to generate 
   the credentials string. 
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
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  XZ 08-15-2003
    Cloned from BXS 5.3 code

AUDIT TRAIL: 6.1
1.  XZ 02-02-2004
    Fixed defect 90621
    
AUDIT TRAIL: 6.2
1.  XZ 04-28-2004
    In CM 5.10 release, the ProgID of WxCrypto has been changed. 
    Modified function f_get_credentials_url_win to use this new ProgID.
2.  XZ 05-11-2004
    Added QUERYTYPE parameter to the initial URL when invoking CAQ    
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
		}

	//Original PL/SQL code for Prog Unit EOQRPLS.AUDIT_TRAIL_5_0
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
    while EOQEPLS.pll contains real code relevant to
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
AUDIT TRAIL: 5.3
1.  XZ 07/30/2003
    Multiple modifications to support BXS new functionality
2.  XZ 08/08/2003
    Add DocId parameters in the URL used for WX push    
    Remove GOQRPLS from attached library    
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
		}

}
