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


public class GReportVpdi extends AbstractSupportCodeObject {
	

	public GReportVpdi(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_REPORT_VPDI
	/*
	PACKAGE G$_REPORT_VPDI IS
  FUNCTION IS_MIF_ENABLED RETURN BOOLEAN;
  FUNCTION GET_VPDI_HOME_CODE RETURN VARCHAR2;
  FUNCTION GET_VPDI_PROCESS_CODE RETURN VARCHAR2;
  PROCEDURE SET_VPDI( VPDI_HOME_CODE VARCHAR2, VPDI_PROCESS_CODE VARCHAR2);
  --
  MIF_ERROR EXCEPTION;
END;
	*/
	
			// 
		 public class MifError extends Exception{}

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_REPORT_VPDI
		/*
		PACKAGE BODY G$_REPORT_VPDI IS
--
  FUNCTION IS_MIF_ENABLED RETURN BOOLEAN IS
   BEGIN
   	RETURN G$_VPDI_SECURITY.G$_IS_MIF_ENABLED;
  END IS_MIF_ENABLED ;
--
--   
  FUNCTION GET_VPDI_HOME_CODE RETURN VARCHAR2 IS
    BEGIN
    	RETURN G$_VPDI_SECURITY.G$_VPDI_GET_INST_CODE_FNC;
    END GET_VPDI_HOME_CODE;
--
--
  FUNCTION GET_VPDI_PROCESS_CODE RETURN VARCHAR2 IS
   BEGIN
   	  RETURN G$_VPDI_SECURITY.G$_VPDI_GET_PROC_CONTEXT_FNC;	
   END GET_VPDI_PROCESS_CODE;
--   
--   
  PROCEDURE SET_VPDI( VPDI_HOME_CODE VARCHAR2, VPDI_PROCESS_CODE VARCHAR2) IS
    BEGIN
--   	
    	IF G$_VPDI_SECURITY.G$_IS_MIF_ENABLED THEN
--    	
       	    -- When home_code and process_code are passed and not null the reset all context
      	IF (VPDI_HOME_CODE IS NOT NULL) AND (VPDI_PROCESS_CODE IS NOT NULL) THEN
      		
      		IF (NOT GOKVPDA.F_IS_VPDI_CODE_VALID( USER, VPDI_HOME_CODE ) OR 
      			  NOT GOKVPDA.F_IS_VPDI_CODE_VALID_ALL( VPDI_PROCESS_CODE )) THEN
      			  RAISE MIF_ERROR;
      		END IF;
      			 
        	 GOKVPDA.P_SET_VPDI_RESET_ALL_CONTEXT( VPDI_HOME_CODE, VPDI_PROCESS_CODE );
      	ELSE
    	     --  Set home_code to the value set in ON-LOGON Trigger ( Default ) and a Process_Code = REPORT
    		  GOKVPDA.P_SET_VPDI_FOR_UPDATE( GET_VPDI_HOME_CODE() );
      	END IF;
--      	
     END IF;
--    		  
    END SET_VPDI;
--
END G$_REPORT_VPDI;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isMifEnabled()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return GVpdiSecurity.gIsMifEnabled();
//
			this.getLogger().trace(this, "F2J : isMifEnabled function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* 
		*    
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getVpdiHomeCode()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return GVpdiSecurity.gVpdiGetInstCodeFnc();
//
			this.getLogger().trace(this, "F2J : getVpdiHomeCode function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getVpdiProcessCode()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return GVpdiSecurity.gVpdiGetProcContextFnc();
//
			this.getLogger().trace(this, "F2J : getVpdiProcessCode function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*    
		*    
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param vpdiHomeCode
		* @param vpdiProcessCode
		*/
		public void setVpdi(NString vpdiHomeCode, NString vpdiProcessCode)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//    	
//			if ( GVpdiSecurity.gIsMifEnabled().getValue() )
//			{
//				//     	
//				//  When home_code and process_code are passed and not null the reset all context
//				if ( (!vpdiHomeCode.isNull()) && (!vpdiProcessCode.isNull()) )
//				{
//					if ((Gokvpda.fIsVpdiCodeValid(getUser(), vpdiHomeCode).not().getValue() || Gokvpda.fIsVpdiCodeValidAll(vpdiProcessCode).not().getValue()))
//					{
//						throw new MifError();
//					}
//					Gokvpda.pSetVpdiResetAllContext(vpdiHomeCode, vpdiProcessCode);
//				}
//				else {
//					//   Set home_code to the value set in ON-LOGON Trigger ( Default ) and a Process_Code = REPORT
//					Gokvpda.pSetVpdiForUpdate(getVpdiHomeCode());
//				}
//			}
//
			this.getLogger().trace(this, "F2J : setVpdi procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
