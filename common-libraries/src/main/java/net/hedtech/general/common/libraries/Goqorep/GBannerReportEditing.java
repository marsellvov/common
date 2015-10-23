package net.hedtech.general.common.libraries.Goqorep;

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


public class GBannerReportEditing extends AbstractSupportCodeObject {
	

	public GBannerReportEditing(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_BANNER_REPORT_EDITING
	/*
	PACKAGE G$_BANNER_REPORT_EDITING IS
-- TGKinderman 10/05/2004
-- A stub routine has been established for each entry item in the report value window.
-- This has been done in the event it is needed.  Edit modifications can then be added via a pll change.
-- EDIT_OREP_ROW can be observed for syntax to follow when necessary to implement an item level edit.
--
	PROCEDURE EDIT_DESFORMAT(p_desformat       VARCHAR2,
	                         p_destype         VARCHAR2,
	                         p_desname         VARCHAR2,
	                         p_execution_mode  VARCHAR2,
	                         p_comm_mode       VARCHAR2,
	                         p_paramform_desig VARCHAR2 ,
	                         p_message  IN OUT VARCHAR2);
	PROCEDURE EDIT_DESTYPE(p_desformat       VARCHAR2,
	                       p_destype         VARCHAR2,
	                       p_desname         VARCHAR2,
	                       p_execution_mode  VARCHAR2,
	                       p_comm_mode       VARCHAR2,
	                       p_paramform_desig VARCHAR2 ,
	                       p_message  IN OUT VARCHAR2);
	PROCEDURE EDIT_DESNAME(p_desformat       VARCHAR2,
	                       p_destype         VARCHAR2,
	                       p_desname         VARCHAR2,
	                       p_execution_mode  VARCHAR2,
	                       p_comm_mode       VARCHAR2,
	                       p_paramform_desig VARCHAR2 ,
	                       p_message  IN OUT VARCHAR2);
	PROCEDURE EDIT_EXECUTION_MODE(p_desformat       VARCHAR2,
	                              p_destype         VARCHAR2,
	                              p_desname         VARCHAR2,
	                              p_execution_mode  VARCHAR2,
	                              p_comm_mode       VARCHAR2,
	                              p_paramform_desig VARCHAR2 ,
	                              p_message  IN OUT VARCHAR2);
	PROCEDURE EDIT_COMM_MODE(p_desformat       VARCHAR2,
	                         p_destype         VARCHAR2,
	                         p_desname         VARCHAR2,
	                         p_execution_mode  VARCHAR2,
	                         p_comm_mode       VARCHAR2,
	                         p_paramform_desig VARCHAR2 ,
	                         p_message  IN OUT VARCHAR2);
	PROCEDURE EDIT_PARAMFORM_DESIG(p_desformat       VARCHAR2,
	                               p_destype         VARCHAR2,
	                               p_desname         VARCHAR2,
	                               p_execution_mode  VARCHAR2,
	                               p_comm_mode       VARCHAR2,
	                               p_paramform_desig VARCHAR2 ,
	                               p_message  IN OUT VARCHAR2);
  PROCEDURE EDIT_OREP_ROW(p_desformat       VARCHAR2,
	                        p_destype         VARCHAR2,
	                        p_desname         VARCHAR2,
	                        p_execution_mode  VARCHAR2,
	                        p_comm_mode       VARCHAR2,
	                        p_paramform_desig VARCHAR2 ,
	                        p_message  IN OUT VARCHAR2);
-- --
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_BANNER_REPORT_EDITING
		/*
		PACKAGE BODY G$_BANNER_REPORT_EDITING IS
-- --
-- --
--
--
	PROCEDURE EDIT_DESFORMAT(p_desformat       VARCHAR2,
	                         p_destype         VARCHAR2,
	                         p_desname         VARCHAR2,
	                         p_execution_mode  VARCHAR2,
	                         p_comm_mode       VARCHAR2,
	                         p_paramform_desig VARCHAR2 ,
	                         p_message  IN OUT VARCHAR2) IS 
  BEGIN
  	IF p_desformat IN ('POSTSCRIPT','PRINTER DEFINITION') THEN
  			p_message := G$_NLS.GET('GOQOREP-0000','LIB','*ERROR* Destination Format of %01% is not currently supported.',p_desformat);
  	END IF;
  END EDIT_DESFORMAT;
--
--
	PROCEDURE EDIT_DESTYPE(p_desformat       VARCHAR2,
	                       p_destype         VARCHAR2,
	                       p_desname         VARCHAR2,
	                       p_execution_mode  VARCHAR2,
	                       p_comm_mode       VARCHAR2,
	                       p_paramform_desig VARCHAR2 ,
	                       p_message  IN OUT VARCHAR2) IS 
  BEGIN
     null;
  END EDIT_DESTYPE;
--
--
	PROCEDURE EDIT_DESNAME(p_desformat       VARCHAR2,
	                       p_destype         VARCHAR2,
	                       p_desname         VARCHAR2,
	                       p_execution_mode  VARCHAR2,
	                       p_comm_mode       VARCHAR2,
	                       p_paramform_desig VARCHAR2 ,
	                       p_message  IN OUT VARCHAR2) IS 
  BEGIN
    null;
  END EDIT_DESNAME;
--
--
	PROCEDURE EDIT_EXECUTION_MODE(p_desformat       VARCHAR2,
	                              p_destype         VARCHAR2,
	                              p_desname         VARCHAR2,
	                              p_execution_mode  VARCHAR2,
	                              p_comm_mode       VARCHAR2,
	                              p_paramform_desig VARCHAR2 ,
	                              p_message  IN OUT VARCHAR2) IS 
  BEGIN
  	null;
  END EDIT_EXECUTION_MODE;
--
--
	PROCEDURE EDIT_COMM_MODE(p_desformat       VARCHAR2,
	                         p_destype         VARCHAR2,
	                         p_desname         VARCHAR2,
	                         p_execution_mode  VARCHAR2,
	                         p_comm_mode       VARCHAR2,
	                         p_paramform_desig VARCHAR2 ,
	                         p_message  IN OUT VARCHAR2) IS 
  BEGIN
  	null;
  END EDIT_COMM_MODE;
--
--
	PROCEDURE EDIT_PARAMFORM_DESIG(p_desformat       VARCHAR2,
	                               p_destype         VARCHAR2,
	                               p_desname         VARCHAR2,
	                               p_execution_mode  VARCHAR2,
	                               p_comm_mode       VARCHAR2,
	                               p_paramform_desig VARCHAR2 ,
	                               p_message  IN OUT VARCHAR2) IS 
  BEGIN
  	null;
  END EDIT_PARAMFORM_DESIG;
-- 
--
	PROCEDURE EDIT_OREP_ROW(p_desformat       VARCHAR2,
	                        p_destype         VARCHAR2,
	                        p_desname         VARCHAR2,
	                        p_execution_mode  VARCHAR2,
	                        p_comm_mode       VARCHAR2,
	                        p_paramform_desig VARCHAR2 ,
	                        p_message  IN OUT VARCHAR2) IS 
  lv_uprf_orep_root_dir   VARCHAR2(500);
  BEGIN
  	IF p_destype IN ('FILE','MAIL') THEN
  		IF p_desname IS NULL THEN
  			p_message := G$_NLS.GET('GOQOREP-0001','LIB','*ERROR* Destination Name must have a value when Destination Type is %01%',p_destype);
  		END IF;
  	END IF;
-- --  	
    IF p_destype = 'FILE' THEN
      lv_uprf_orep_root_dir := G$_OREP_GET_UPRF_ROOT_FILE('BASELINE');
	    IF UPPER(lv_uprf_orep_root_dir) <> 'DEFAULT_BEHAVIOR' THEN
	      IF INSTR(p_desname,':') > 0 THEN
  			  p_message := G$_NLS.GET('GOQOREP-0002','LIB','*ERROR* Destination Name should not indicate a drive when Destination Type is %01%',p_destype);
	      END IF;
      END IF;
    END IF;
-- --
  	IF p_desformat IN ('POSTSCRIPT','PRINTER DEFINITION') THEN
  			p_message := G$_NLS.GET('GOQOREP-0003','LIB','*ERROR* Destination Format of %01% is not currently supported.',p_desformat);
  	END IF;
--
  IF p_destype = 'CACHE' THEN
-- -- must be synchronous
    IF p_comm_mode = 'ASYNC' THEN
      p_message := G$_NLS.GET('GOQOREP-0004','LIB','*ERROR* Communication Mode must be Synchronous when Destination Type is %01%',p_destype);
    END IF;
-- -- -- -- --
-- -- -- -- --
    IF p_desname IS NOT NULL THEN
      p_message := G$_NLS.GET('GOQOREP-0005','LIB','*ERROR* Destination Name is not to be entered when Destination Type is %01%',p_destype);     
    END IF;
-- -- -- -- --
-- -- -- -- --
  ELSE
-- -- must be async
-- -- must be parmform no
    IF p_comm_mode = 'SYNC' THEN
      p_message := G$_NLS.GET('GOQOREP-0006','LIB','*ERROR* Communication Mode must be Asynchronous when Destination Type is File, Mail or Printer');
    END IF;
    IF p_paramform_desig = 'YES' THEN
      p_message := G$_NLS.GET('GOQOREP-0007','LIB','*ERROR* Cannot have Parameter Form = Yes when Destination Type is File, Mail or Printer');
    END IF;
  END IF;   
  IF p_comm_mode = 'ASYNC' THEN
-- -- must be parmform no
    IF p_paramform_desig = 'YES' THEN
      p_message := G$_NLS.GET('GOQOREP-0008','LIB','*ERROR* Cannot have Parameter Form = YES when running Asynchronously');
    END IF;
  END IF;
--
--
  END EDIT_OREP_ROW;
--
--  
BEGIN
   null;
END;
		*/
		/* <p>
		*  --
		*  --
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editDesformat(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( in(pDesformat, "POSTSCRIPT", "PRINTER DEFINITION").getValue() )
//			{
//				pMessage.val = GNls.Fget(toStr("GOQOREP-0000"), toStr("LIB"), toStr("*ERROR* Destination Format of %01% is not currently supported."), pDesformat);
//			}
//
			this.getLogger().trace(this, "F2J : editDesformat procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editDestype(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : editDestype procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editDesname(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : editDesname procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editExecutionMode(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : editExecutionMode procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editCommMode(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : editCommMode procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editParamformDesig(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : editParamformDesig procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesformat
		* @param pDestype
		* @param pDesname
		* @param pExecutionMode
		* @param pCommMode
		* @param pParamformDesig
		* @param pMessage
		*/
		public void editOrepRow(NString pDesformat, NString pDestype, NString pDesname, NString pExecutionMode, NString pCommMode, NString pParamformDesig, Ref<NString> pMessage)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString lvUprfOrepRootDir= NString.getNull();
			if ( in(pDestype, "FILE", "MAIL").getValue() )
			{
				if ( pDesname.isNull() )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0001"), toStr("LIB"), toStr("*ERROR* Destination Name must have a value when Destination Type is %01%"), pDestype);
				}
			}
			//  --  	
			if ( pDestype.equals("FILE") )
			{
				lvUprfOrepRootDir = getContainer().gOrepGetUprfRootFile(toStr("BASELINE"));
				if ( upper(lvUprfOrepRootDir).notEquals("DEFAULT_BEHAVIOR") )
				{
					if ( inStr(pDesname, toStr(":")).greater(0) )
					{
						pMessage.val = GNls.Fget(toStr("GOQOREP-0002"), toStr("LIB"), toStr("*ERROR* Destination Name should not indicate a drive when Destination Type is %01%"), pDestype);
					}
				}
			}
			//  --
			if ( in(pDesformat, "POSTSCRIPT", "PRINTER DEFINITION").getValue() )
			{
				pMessage.val = GNls.Fget(toStr("GOQOREP-0003"), toStr("LIB"), toStr("*ERROR* Destination Format of %01% is not currently supported."), pDesformat);
			}
			// 
			if ( pDestype.equals("CACHE") )
			{
				//  -- must be synchronous
				if ( pCommMode.equals("ASYNC") )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0004"), toStr("LIB"), toStr("*ERROR* Communication Mode must be Synchronous when Destination Type is %01%"), pDestype);
				}
				//  -- -- -- --
				//  -- -- -- --
				if ( !pDesname.isNull() )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0005"), toStr("LIB"), toStr("*ERROR* Destination Name is not to be entered when Destination Type is %01%"), pDestype);
				}
			}
			else {
				//  -- must be async
				//  -- must be parmform no
				if ( pCommMode.equals("SYNC") )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0006"), toStr("LIB"), toStr("*ERROR* Communication Mode must be Asynchronous when Destination Type is File, Mail or Printer"));
				}
				if ( pParamformDesig.equals("YES") )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0007"), toStr("LIB"), toStr("*ERROR* Cannot have Parameter Form = Yes when Destination Type is File, Mail or Printer"));
				}
			}
			if ( pCommMode.equals("ASYNC") )
			{
				//  -- must be parmform no
				if ( pParamformDesig.equals("YES") )
				{
					pMessage.val = GNls.Fget(toStr("GOQOREP-0008"), toStr("LIB"), toStr("*ERROR* Cannot have Parameter Form = YES when running Asynchronously"));
				}
			}
//
//			System.err.println("F2J : editOrepRow procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
		
	
	
}
