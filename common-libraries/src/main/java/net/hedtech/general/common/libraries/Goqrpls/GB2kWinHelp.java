package net.hedtech.general.common.libraries.Goqrpls;

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
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GB2kWinHelp extends AbstractSupportCodeObject {
	

	public GB2kWinHelp(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_B2K_WIN_HELP
	/*
	PACKAGE G$_B2K_WIN_HELP IS
--
-- New package to support the new win help files.
--
  FUNCTION HELP_EXISTS(object_in IN VARCHAR2) RETURN BOOLEAN;
  PROCEDURE DISPLAY_HELP;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_B2K_WIN_HELP
		/*
		PACKAGE BODY G$_B2K_WIN_HELP IS
--
-- Function to determine if win help exists for this object.
--
  FUNCTION HELP_EXISTS(object_in IN VARCHAR2) RETURN BOOLEAN IS  
  BEGIN
    RETURN(TRUE);
  END;
--
-- Procedure to display the new win help.
--
  PROCEDURE DISPLAY_HELP IS
    BXS_IND             VARCHAR2(1) := 'N';
    HELP_DIR            VARCHAR2(200) := G$_GET_UPRF_WEBHLP;
    OBJ_NAME            VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
    PRODUCT_LTR         VARCHAR2(1)  := LOWER(SUBSTR(NAME_IN('SYSTEM.CURRENT_FORM'),1,1));
    PRODUCT_DIR         VARCHAR2(30);    
    PRODUCTS_INSTALLED  VARCHAR2(200);
    URL                 VARCHAR2(300);
  BEGIN
    IF gokimag.f_is_bxs_installed THEN
    	BXS_IND := 'Y';
    END IF;
--
    PRODUCTS_INSTALLED := '&studentInd=' || NAME_IN('GLOBAL.STUSYS') ||
                          '&alumniInd='  || NAME_IN('GLOBAL.ALUSYS') ||
  	                      '&arsysInd='   || NAME_IN('GLOBAL.BILCSH') ||
  	                      '&financeInd=' || NAME_IN('GLOBAL.FINSYS') ||
  	                      '&finaidInd='  || NAME_IN('GLOBAL.RESSYS') ||
                          '&payrollInd=' || NAME_IN('GLOBAL.HRESYS') ||
  	                      '&bxsInd='     || BXS_IND ||
  	                      '&generalInd=' || 'Y';
--
    CASE PRODUCT_LTR
      WHEN 'g' THEN PRODUCT_DIR := 'general';
      WHEN 's' THEN PRODUCT_DIR := 'student';
      WHEN 'p' THEN PRODUCT_DIR := 'payroll';
      WHEN 'n' THEN PRODUCT_DIR := 'payroll';
  	  WHEN 'a' THEN PRODUCT_DIR := 'alumni';
  	  WHEN 't' THEN PRODUCT_DIR := 'arsys';
  	  WHEN 'r' THEN PRODUCT_DIR := 'finaid';
  	  WHEN 'k' THEN PRODUCT_DIR := 'finaid';
      WHEN 'e' THEN PRODUCT_DIR := 'extsol';
  	  WHEN 'f' THEN PRODUCT_DIR := 'finance';
      ELSE PRODUCT_DIR := 'local';
    END CASE;
--
    IF PRODUCT_DIR IS NOT NULL THEN
      URL := HELP_DIR || '?productName=' || PRODUCT_DIR || '&formName=' || LOWER(OBJ_NAME) ||
             PRODUCTS_INSTALLED;
      WEB.SHOW_DOCUMENT(URL,'SCTBANNER');
    END IF;
  END;
END;
		*/
		/* <p>
		* 
		*  Function to determine if win help exists for this object.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param objectIn
		*/
		public NBool helpExists(NString objectIn)
		{
			return  toBool(((NBool.True)));
		}
/* <p>
		* 
		*  Procedure to display the new win help.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void displayHelp()
		{
			NString bxsInd = toStr("N");
			NString helpDir = getContainer().gGetUprfWebhlp();
			NString objName = getCurrentTaskName();
			NString productLtr = lower(substring(getCurrentTaskName(), toInt(1), toInt(1)));
			NString productDir= NString.getNull();
			NString productsInstalled= NString.getNull();
			NString url= NString.getNull();
			if ( Gokimag.fIsBxsInstalled().getValue() )
			{
				bxsInd = toStr("Y");
			}
			// 
			productsInstalled = toStr("&studentInd=").append(getNameIn("GLOBAL.STUSYS")).append("&alumniInd=").append(getNameIn("GLOBAL.ALUSYS")).append("&arsysInd=").append(getNameIn("GLOBAL.BILCSH")).append("&financeInd=").append(getNameIn("GLOBAL.FINSYS")).append("&finaidInd=").append(getNameIn("GLOBAL.RESSYS")).append("&payrollInd=").append(getNameIn("GLOBAL.HRESYS")).append("&bxsInd=").append(bxsInd).append("&generalInd=").append("Y");
			//
			if (productLtr.equals("g"))
			{
				productDir = toStr("general");
			}
			else if (productLtr.equals("s"))
			{
				productDir = toStr("student");
			}
			else if (productLtr.equals("p"))
			{
				productDir = toStr("payroll");
			}
			else if (productLtr.equals("n"))
			{
				productDir = toStr("payroll");
			}
			else if (productLtr.equals("a"))
			{
				productDir = toStr("alumni");
			}
			else if (productLtr.equals("t"))
			{
				productDir = toStr("arsys");
			}
			else if (productLtr.equals("r"))
			{
				productDir = toStr("finaid");
			}
			else if (productLtr.equals("k"))
			{
				productDir = toStr("finaid");
			}
			else if (productLtr .equals("e"))
			{
				productDir = toStr("extsol");
			}
			else if (productLtr.equals("f"))
			{
				productDir = toStr("finance");
			}
			else {
				productDir = toStr("local");
			}
			// 
			if ( !productDir.isNull() )
			{
				url = helpDir.append("?productName=").append(productDir).append("&formName=").append(lower(objName)).append(productsInstalled);
				showDocument(url, "SCTBANNER");
			}
		}
		
	
	
}
