package net.hedtech.general.common.libraries.Webutil;

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


public class WebutilUtil extends AbstractSupportCodeObject {
	

	public WebutilUtil(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_UTIL
	/*
	PACKAGE WEBUTIL_UTIL IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_UTIL
 *   Utility Functions
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 03/JAN/2003 - Creation
 *
\********************************************************************************</multilinecomment> 

  <multilinecomment>* 
   * Converts a boolean value to a string 
   * Null values are treated as false
   </multilinecomment>
  FUNCTION BoolToStr (boolValue  in BOOLEAN, 
                      trueValue  in VARCHAR2 default 'true', 
                      falseValue in VARCHAR2 default 'false') return VARCHAR2;
  
END WEBUTIL_UTIL;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_UTIL
		/*
		PACKAGE BODY WEBUTIL_UTIL IS

  FUNCTION BoolToStr (boolValue  in BOOLEAN, 
                      trueValue  in VARCHAR2 default 'true', 
                      falseValue in VARCHAR2 default 'false') return VARCHAR2 is
  BEGIN
    if boolValue is null or not boolValue then 
        return falseValue;
    else
        return trueValue;
    end if;
  END BoolToStr;     
  
END WEBUTIL_UTIL;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param boolvalue
		*/
		public NString booltostr(NBool boolvalue) {
			return booltostr(boolvalue, toStr("true"), toStr("false"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param boolvalue
		* @param truevalue
		*/
		public NString booltostr(NBool boolvalue, NString truevalue) {
			return booltostr(boolvalue, truevalue, toStr("false"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param boolvalue
		* @param truevalue
		* @param falsevalue
		*/
		public NString booltostr(NBool boolvalue, NString truevalue, NString falsevalue)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( boolvalue.isNull() || boolvalue.not() )
//			{
//				return falsevalue;
//			}
//			else {
//				return truevalue;
//			}
//
			this.getLogger().trace(this, "F2J : booltostr function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		
	
	
}
