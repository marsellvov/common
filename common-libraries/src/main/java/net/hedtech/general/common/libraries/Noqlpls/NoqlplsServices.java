package net.hedtech.general.common.libraries.Noqlpls;



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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Noqlpls.UnknownTypes.Formmodule;


public class NoqlplsServices extends AbstractLibrary{
		
	public NoqlplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
	
	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_SPRTELE_RG
	/*
	PROCEDURE POPULATE_SPRTELE_RG (p_pidm number, p_tele_code varchar2, p_override_ind varchar2) IS
  RG_LOGIC VARCHAR2(5000) := 'select sprtele_tele_code, '||
                         ' stvtele_desc, '||
                         ' sprtele_phone_area ||'' ''||sprtele_phone_number||'' ''||sprtele_phone_ext, '||
                         ' SPRTELE_INTL_ACCESS, SPRTELE_PRIMARY_IND, SPRTELE_STATUS_IND, '||
                         ' SPRTELE_UNLIST_IND, SPRTELE_ATYP_CODE, SPRTELE_SEQNO, SPRTELE_ACTIVITY_DATE  '||
                         ' from sprtele, stvtele where sprtele_tele_code = stvtele_code '||
                         ' and sprtele_pidm = '||p_pidm ;
  ERROR_NUMBER NUMBER;
BEGIN
  RG_LOGIC := 'select sprtele_tele_code, '||
             ' stvtele_desc, '||
             ' sprtele_phone_area ||'' ''||sprtele_phone_number||'' ''||sprtele_phone_ext, '||
             ' SPRTELE_INTL_ACCESS, SPRTELE_PRIMARY_IND, SPRTELE_STATUS_IND, '||
             ' SPRTELE_UNLIST_IND, SPRTELE_ATYP_CODE, SPRTELE_SEQNO, SPRTELE_ACTIVITY_DATE  '||
             ' from sprtele, stvtele where sprtele_tele_code = stvtele_code '||
             ' and sprtele_pidm = '||p_pidm ;

   IF p_tele_code IS NOT NULL and p_override_ind <> 'Y' THEN
   	  RG_LOGIC := RG_LOGIC ||' and sprtele_tele_code = '''|| p_tele_code||'''';
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('SPRTELE_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0100', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pTeleCode
		* @param pOverrideInd
		*/
		public void populateSprteleRg(NNumber pPidm, NString pTeleCode, NString pOverrideInd)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select sprtele_tele_code, ").append(" stvtele_desc, ").append(" sprtele_phone_area ||' '||sprtele_phone_number||' '||sprtele_phone_ext, ").append(" SPRTELE_INTL_ACCESS, SPRTELE_PRIMARY_IND, SPRTELE_STATUS_IND, ").append(" SPRTELE_UNLIST_IND, SPRTELE_ATYP_CODE, SPRTELE_SEQNO, SPRTELE_ACTIVITY_DATE  ").append(" from sprtele, stvtele where sprtele_tele_code = stvtele_code ").append(" and sprtele_pidm = ").append(pPidm);
			NNumber errorNumber= NNumber.getNull();
			rgLogic = toStr("select sprtele_tele_code, ").append(" stvtele_desc, ").append(" sprtele_phone_area ||' '||sprtele_phone_number||' '||sprtele_phone_ext, ").append(" SPRTELE_INTL_ACCESS, SPRTELE_PRIMARY_IND, SPRTELE_STATUS_IND, ").append(" SPRTELE_UNLIST_IND, SPRTELE_ATYP_CODE, SPRTELE_SEQNO, SPRTELE_ACTIVITY_DATE  ").append(" from sprtele, stvtele where sprtele_tele_code = stvtele_code ").append(" and sprtele_pidm = ").append(pPidm);
			if ( !pTeleCode.isNull() && pOverrideInd.notEquals("Y") )
			{
				rgLogic = rgLogic.append(" and sprtele_tele_code = '").append(pTeleCode).append("'");
			}
			errorNumber = populateGroupWithQuery("SPRTELE_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0100"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populateSprteleRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVWKCP_RG
	/*
	PROCEDURE POPULATE_PTVWKCP_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvwkcp_code, ptvwkcp_desc, to_char(ptvwkcp_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvwkcp order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0098', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVWKCP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0099', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/

		public void populatePtvwkcpRg(){
			populatePtvwkcpRg("act_date");
		}
		
        public void populatePtvwkcpRg(String actDate)
        {
            //F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

            NString rgLogic = toStr("select ptvwkcp_code, ptvwkcp_desc, to_char(ptvwkcp_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(actDate).append(" from ptvwkcp order by 1 ");
            
            NNumber errorNumber= NNumber.getNull();
            if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
            {
                warningMessage(GNls.Fget(toStr("NOQLPLS-0098"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
                return ;
            }
            // 
            errorNumber = populateGroupWithQuery("PTVWKCP_RG", rgLogic);
            if ( errorNumber.notEquals(0) )
            {
            	warningMessage(GNls.Fget(toStr("NOQLPLS-0099"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();        
			}
        }

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVSTGR_RG
	/*
	PROCEDURE POPULATE_PTVSTGR_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvstgr_code, ptvstgr_desc, to_char(ptvstgr_activity_date, '''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvstgr order by 1';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0096', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVSTGR_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0097', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvstgrRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvstgr_code, ptvstgr_desc, to_char(ptvstgr_activity_date, '").append(GDate.getNlsDateFormat()).append("') act_date from ptvstgr order by 1");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0096"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVSTGR_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0097"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvstgrRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVPCAT_RG
	/*
	PROCEDURE POPULATE_PTVPCAT_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvpcat_code, ptvpcat_desc, to_char(ptvpcat_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvpcat order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0094', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVPCAT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0095', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvpcatRg()
		{
			populatePtvpcatRg("act_date");
		}
		
		public void populatePtvpcatRg(String actDate)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvpcat_code, ptvpcat_desc, to_char(ptvpcat_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(actDate).append(" from ptvpcat order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0094"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVPCAT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0095"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			//System.err.println("F2J : populatePtvpcatRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVORGN_RG
	/*
	PROCEDURE POPULATE_PTVORGN_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvorgn_code, ptvorgn_desc, to_char(ptvorgn_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvorgn order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0092', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVORGN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0093', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvorgnRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString rgLogic = toStr("select ptvorgn_code, ptvorgn_desc, to_char(ptvorgn_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptvorgn order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0092"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVORGN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0093"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				//return ;
		}
//
			//System.err.println("F2J : populatePtvorgnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVNRSI_RG
	/*
	PROCEDURE POPULATE_PTVNRSI_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvnrsi_code, ptvnrsi_desc, to_char(ptvnrsi_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvnrsi order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0090', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVNRSI_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0091', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvnrsiRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvnrsi_code, ptvnrsi_desc, to_char(ptvnrsi_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptvnrsi order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0090"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVNRSI_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0091"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvnrsiRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVLGCD_RG
	/*
	PROCEDURE POPULATE_PTVLGCD_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvlgcd_code, ptvlgcd_desc, to_char(ptvlgcd_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvlgcd order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0088', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVLGCD_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0089', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		
		public void populatePtvlgcdRg(){
			populatePtvlgcdRg("act_date");
		}
		
		
		public void populatePtvlgcdRg(String act_dateAlias)
		{
//			F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvlgcd_code, ptvlgcd_desc, to_char(ptvlgcd_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(act_dateAlias).append(" from ptvlgcd order by 1 ");
			
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0088"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVLGCD_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0089"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvlgcdRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVLCAT_RG
	/*
	PROCEDURE POPULATE_PTVLCAT_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvlcat_code, ptvlcat_desc, to_char(ptvlcat_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvlcat order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0086', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVLCAT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0087', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvlcatRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvlcat_code, ptvlcat_desc, to_char(ptvlcat_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptvlcat order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0086"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVLCAT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0087"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvlcatRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVJCRE_RG
	/*
	PROCEDURE POPULATE_PTVJCRE_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrjcre_code ptvjcre_code, ptrjcre_desc ptvjcre_desc, to_char(ptrjcre_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrjcre order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0084', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVJCRE_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0085', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvjcreRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrjcre_code ptvjcre_code, ptrjcre_desc ptvjcre_desc, to_char(ptrjcre_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrjcre order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0084"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVJCRE_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0085"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			//System.err.println("F2J : populatePtvjcreRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVESKL_RG
	/*
	PROCEDURE POPULATE_PTVESKL_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptveskl_code, ptveskl_desc, to_char(ptveskl_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date, ptveskl_empr_ind from ptveskl, gubinst where ptveskl_empr_ind = gubinst_highed_govt_ind
order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0082', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVESKL_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0083', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		public void populatePtvesklRg(){
			populatePtvesklRg("act_date","ptveskl_empr_ind");
		}
		public void populatePtvesklRg( String act_dateAlias ,String empr_codeAlias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString rgLogic = toStr("select ptveskl_code, ptveskl_desc, to_char(ptveskl_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(act_dateAlias).append(", ptveskl_empr_ind AS ").append(empr_codeAlias).append(" from ptveskl, gubinst where ptveskl_empr_ind = gubinst_highed_govt_ind\norder by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0082"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
//			// 
			errorNumber = populateGroupWithQuery("PTVESKL_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0083"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
//
			//System.err.println("F2J : populatePtvesklRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVEGRP_RG
	/*
	PROCEDURE POPULATE_PTVEGRP_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvegrp_code, ptvegrp_desc, to_char(ptvegrp_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvegrp order by ptvegrp_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0080', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVEGRP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0081', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvegrpRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvegrp_code, ptvegrp_desc, to_char(ptvegrp_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptvegrp order by ptvegrp_code");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0080"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVEGRP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0081"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvegrpRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVEFUN_RG
	/*
	PROCEDURE POPULATE_PTVEFUN_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvefun_code, ptvefun_desc, to_char(ptvefun_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvefun order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0078', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVEFUN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0079', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvefunRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvefun_code, ptvefun_desc, to_char(ptvefun_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptvefun order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0078"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVEFUN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0079"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtvefunRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVECIP_RG
	/*
	PROCEDURE POPULATE_PTVECIP_RG IS
  rg_logic     VARCHAR2(500) := 'select ptvecip_code, ptvecip_desc, to_char(ptvecip_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptvecip_activity_date from ptvecip order by 1 ';
  error_number NUMBER;
BEGIN
  IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('NOQLPLS-0076', 'LIB','*WARNING* BANNER HR is not installed.'));
    RETURN;
  END IF;
  --
  error_number := POPULATE_GROUP_WITH_QUERY('PTVECIP_RG',rg_logic);
  IF error_number <> 0 THEN
    MESSAGE(G$_NLS.Get('NOQLPLS-0077', 'LIB','*WARNING* No records found.') );
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtvecipRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptvecip_code, ptvecip_desc, to_char(ptvecip_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptvecip_activity_date from ptvecip order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0076"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTVECIP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0077"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVBARG_RG
	/*
	PROCEDURE POPULATE_PTVBARG_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptvbarg_code, ptvbarg_desc, to_char(ptvbarg_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptvbarg order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0074', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVBARG_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0075', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		
		public void populatePtvbargRg()
		{
			populatePtvbargRg("act_date");
		}
		
		
		

		public void populatePtvbargRg(String activityDateAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString rgLogic = toStr("select ptvbarg_code, ptvbarg_desc, to_char(ptvbarg_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(activityDateAllias).append(" from ptvbarg order by 1 ");

			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0074"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
//			// 
			errorNumber = populateGroupWithQuery("PTVBARG_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0075"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
//
			this.getLogger().trace(this, "F2J : populatePtvbargRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTVASSN_RG
	/*
	PROCEDURE POPULATE_PTVASSN_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptvassn_code, ptvassn_desc, to_char(ptvassn_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptvassn_activity_date 
       from ptvassn ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptvassn_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0072', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   RG_LOGIC := RG_LOGIC|| ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTVASSN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0073', 'LIB','*Error* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtvassnRg(NString fieldName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptvassn_code, ptvassn_desc, to_char(ptvassn_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptvassn_activity_date \n       from ptvassn ");
			NString orderBy = toStr("ORDER BY ptvassn_code");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0072"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			rgLogic = rgLogic.append(orderBy);
			errorNumber = populateGroupWithQuery("PTVASSN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0073"), toStr("LIB"), toStr("*ERROR* No records found. ")));
				throw new ApplicationException();
				
			}

			this.getLogger().trace(this, "F2J : populatePtvassnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTV87TR_RG
	/*
	PROCEDURE POPULATE_PTV87TR_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptv87tr_code, ptv87tr_desc, to_char(ptv87tr_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date  
       from ptv87tr ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptv87tr_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0070', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   RG_LOGIC := RG_LOGIC|| ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTV87TR_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0071', 'LIB','*Error* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtv87trRg(NString fieldName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptv87tr_code, ptv87tr_desc, to_char(ptv87tr_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date  \n       from ptv87tr ");
			NString orderBy = toStr("ORDER BY ptv87tr_code");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0070"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			rgLogic = rgLogic.append(orderBy);
			errorNumber = populateGroupWithQuery("PTV87TR_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0071"), toStr("LIB"), toStr("*ERROR* No records found. ")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtv87trRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTRESOC_RG
	/*
	PROCEDURE POPULATE_PTRESOC_RG IS
  rg_logic     VARCHAR2(500) := 'select ptresoc_code, ptresoc_desc, ptresoc_category, to_char(ptresoc_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptresoc_activity_date from ptresoc order by 1,2 ';
  error_number NUMBER;
BEGIN
  IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
    MESSAGE(G$_NLS.Get('NOQLPLS-0068', 'LIB','*WARNING* BANNER HR is not installed.'));
    RETURN;
  END IF;
  --
  error_number := POPULATE_GROUP_WITH_QUERY('PTRESOC_RG',rg_logic);
  IF error_number <> 0 THEN
    MESSAGE(G$_NLS.Get('NOQLPLS-0069', 'LIB','*WARNING* No records found.') );
    RAISE FORM_TRIGGER_FAILURE;
    RETURN;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtresocRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptresoc_code, ptresoc_desc, ptresoc_category, to_char(ptresoc_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptresoc_activity_date from ptresoc order by 1,2 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0068"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTRESOC_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0069"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQWKPR_RG
	/*
	PROCEDURE POPULATE_PTQWKPR_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrwkpr_code, ptrwkpr_desc, ptrwkpr_number_of_days, ptrwkpr_period_max_non_ot_hrs, ptrwkpr_daily_max_non_ot_hrs, to_char(ptrwkpr_activity_date ,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrwkpr order by ptrwkpr_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0066', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQWKPR_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0067', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqwkprRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrwkpr_code, ptrwkpr_desc, ptrwkpr_number_of_days, ptrwkpr_period_max_non_ot_hrs, ptrwkpr_daily_max_non_ot_hrs, to_char(ptrwkpr_activity_date ,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrwkpr order by ptrwkpr_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0066"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQWKPR_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0067"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				
			}

			this.getLogger().trace(this, "F2J : populatePtqwkprRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQSCHL_RG
	/*
	PROCEDURE POPULATE_PTQSCHL_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrschl_code, ptrschl_desc, ptrschl_empr_code, ptrempr_desc, to_char(ptrschl_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrschl, ptrempr where ptrempr_code = ptrschl_empr_code order by ptrschl_empr_code, ptrschl_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0064', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQSCHL_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0065', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqschlRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrschl_code, ptrschl_desc, ptrschl_empr_code, ptrempr_desc, to_char(ptrschl_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrschl, ptrempr where ptrempr_code = ptrschl_empr_code order by ptrschl_empr_code, ptrschl_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0064"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQSCHL_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0065"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			
			}

			this.getLogger().trace(this, "F2J : populatePtqschlRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQLOCN_RG
	/*
	PROCEDURE POPULATE_PTQLOCN_RG IS
   RG_LOGIC VARCHAR2(500) :='select ptrlocn_code, ptrlocn_desc, ptrlocn_empr_code, ptrempr_desc, ptrlocn_headquarters_ind, to_char(ptrlocn_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrlocn,ptrempr where ptrempr_code=ptrlocn_empr_code order by ptrlocn_empr_code,ptrlocn_headquarters_ind desc,ptrlocn_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0062', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQLOCN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0063', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqlocnRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrlocn_code, ptrlocn_desc, ptrlocn_empr_code, ptrempr_desc, ptrlocn_headquarters_ind, to_char(ptrlocn_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrlocn,ptrempr where ptrempr_code=ptrlocn_empr_code order by ptrlocn_empr_code,ptrlocn_headquarters_ind desc,ptrlocn_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0062"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQLOCN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0063"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtqlocnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQJBLN_RG
	/*
	PROCEDURE POPULATE_PTQJBLN_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrjbln_code, ptrjbln_desc, ptrjbln_dicd_code, to_char(ptrjbln_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrjbln order by ptrjbln_code ';   

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0060', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQJBLN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0061', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		public void populatePtqjblnRg(){
			populatePtqjblnRg("act_date");
		}
		
		public void populatePtqjblnRg(String actDate)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrjbln_code, ptrjbln_desc, ptrjbln_dicd_code, to_char(ptrjbln_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(actDate).append(" from ptrjbln order by ptrjbln_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0060"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQJBLN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0061"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
//
//			System.err.println("F2J : populatePtqjblnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQEMPR_RG
	/*
	PROCEDURE POPULATE_PTQEMPR_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrempr_code, ptrempr_desc, ptrempr_fed_ein, to_char(ptrempr_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrempr order by ptrempr_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0058', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQEMPR_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0059', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/

		public void populatePtqemprRg()
		{
			this.populatePtqemprRg(" PTREMPR_ACTIVITY_DATE ");
		}
		public void populatePtqemprRg(String ptrempractivitydateAlias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrempr_code, ptrempr_desc, ptrempr_fed_ein, to_char(ptrempr_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(ptrempractivitydateAlias).append(" from ptrempr order by ptrempr_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0058"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQEMPR_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0059"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				
			}

			//System.err.println("F2J : populatePtqemprRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQECLC_RG
	/*
	PROCEDURE POPULATE_PTQECLC_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptreclc_lcat_code, ptvlcat_desc,
       to_char(ptreclc_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptreclc_activity_date  
       from ptreclc, ptvlcat ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptreclc_lcat_code = ptvlcat_code 
       and ptreclc_code =  ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptreclc_lcat_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQECLC_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0057', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqeclcRg(NString fieldName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptreclc_lcat_code, ptvlcat_desc,\n       to_char(ptreclc_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptreclc_activity_date  \n       from ptreclc, ptvlcat ");
			NString whereStmt = toStr("WHERE ptreclc_lcat_code = ptvlcat_code \n       and ptreclc_code =  ");
			NString orderBy = toStr("ORDER BY ptreclc_lcat_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQECLC_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0057"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}

			this.getLogger().trace(this, "F2J : populatePtqeclcRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQEARN_RG
	/*
	PROCEDURE POPULATE_PTQEARN_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrearn_code, ptrearn_long_desc, ptrearn_rate_ind, ptrearn_rate, ptrearn_mult_factor, ptrearn_type_ind, ptrearn_leav_code_taken, ptrearn_ecld_ind, ptrearn_base_sal_ind, ptrearn_exception_ind, to_char(ptrearn_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') from ptrearn order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0055', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQEARN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0056', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqearnRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrearn_code, ptrearn_long_desc, ptrearn_rate_ind, ptrearn_rate, ptrearn_mult_factor, ptrearn_type_ind, ptrearn_leav_code_taken, ptrearn_ecld_ind, ptrearn_base_sal_ind, ptrearn_exception_ind, to_char(ptrearn_activity_date,'").append(GDate.getNlsDateFormat()).append("') from ptrearn order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0055"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQEARN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0056"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtqearnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQDFPR_RG
	/*
	PROCEDURE POPULATE_PTQDFPR_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrdfpr_code, ptrdfpr_desc, ptrdfpr_pict_code, 
       ptrdfpr_begin_payno, ptrdfpr_end_payno,  to_char(ptrdfpr_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date 
       from ptrdfpr ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptrdfpr_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0053', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   RG_LOGIC := RG_LOGIC||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQDFPR_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0054', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		public void populatePtqdfprRg()
		{
			populatePtqdfprRg("act_date");
		}
		
		
		public void populatePtqdfprRg(String activityDateAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrdfpr_code, ptrdfpr_desc, ptrdfpr_pict_code, ptrdfpr_begin_payno, ptrdfpr_end_payno,  to_char(ptrdfpr_activity_date, '").append(GDate.getNlsDateFormat()).append("') ").append(activityDateAllias).append(" from ptrdfpr ");
		
			NString orderBy = toStr("ORDER BY ptrdfpr_code");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0053"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			rgLogic = rgLogic.append(orderBy);
			errorNumber = populateGroupWithQuery("PTQDFPR_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0054"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				
			}

			this.getLogger().trace(this, "F2J : populatePtqdfprRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQDCHN_RG
	/*
	PROCEDURE POPULATE_PTQDCHN_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrbdca_code, ptrbdca_long_desc, ptrbdca_priority, ptrbdca_calc_rule, to_char(ptrbdca_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrbdca where ptrbdca_code not in (select ptrdchn_dedn_code_chain from ptrdchn) order by ptrbdca_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0051', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQDCHN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0052', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqdchnRg(){
			populatePtqdchnRg("ptrbdca_activity_date");
		}
		public void populatePtqdchnRg(String act_date)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			//NString rgLogic = toStr("select ptrbdca_code, ptrbdca_long_desc, ptrbdca_priority, ptrbdca_calc_rule, to_char(ptrbdca_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrbdca where ptrbdca_code not in (select ptrdchn_dedn_code_chain from ptrdchn) order by ptrbdca_code ");
			// MORPHIS - Migration team - 20141103 - Correct NOQLIBR allias  
			NString rgLogic = toStr("select ptrbdca_code, ptrbdca_long_desc, ptrbdca_priority, ptrbdca_calc_rule, to_char(ptrbdca_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(act_date).append(" from ptrbdca where ptrbdca_code not in (select ptrdchn_dedn_code_chain from ptrdchn) order by ptrbdca_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0051"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQDCHN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0052"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				//return ;
			}
//
			//System.err.println("F2J : populatePtqdchnRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQBDPL_RG
	/*
	PROCEDURE POPULATE_PTQBDPL_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptrbdpl_code, ptrbdpl_desc, to_char(ptrbdpl_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptrbdpl_activity_date from ptrbdpl ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrbdpl_bdca_code = ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptrbdpl_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0049', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''|| ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQBDPL_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0050', 'LIB','*Error* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqbdplRg(NString fieldName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptrbdpl_code, ptrbdpl_desc, to_char(ptrbdpl_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptrbdpl_activity_date from ptrbdpl ");
			NString whereStmt = toStr("WHERE ptrbdpl_bdca_code = ");
			NString orderBy = toStr("ORDER BY ptrbdpl_code");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0049"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQBDPL_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0050"), toStr("LIB"), toStr("*ERROR* No records found. ")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtqbdplRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQBDCA_RG
	/*
	PROCEDURE POPULATE_PTQBDCA_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrbdca_code, ptrbdca_long_desc, ptrbdca_priority, ptrbdca_calc_rule, to_char(ptrbdca_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptrbdca_activity_date from ptrbdca order by ptrbdca_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0047', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQBDCA_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0048', 'LIB','*WARNING* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqbdcaRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrbdca_code, ptrbdca_long_desc, ptrbdca_priority, ptrbdca_calc_rule, to_char(ptrbdca_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptrbdca_activity_date from ptrbdca order by ptrbdca_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0047"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQBDCA_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0048"), toStr("LIB"), toStr("*WARNING* No records found. ")));
				throw new ApplicationException();
				//return ;
			}

			//System.err.println("F2J : populatePtqbdcaRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_PTQBCAT_RG
	/*
	PROCEDURE POPULATE_PTQBCAT_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ptrbcat_code, ptrbcat_desc, to_char(ptrbcat_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ptrbcat order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0045', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQBCAT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0046', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtqbcatRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ptrbcat_code, ptrbcat_desc, to_char(ptrbcat_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ptrbcat order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0045"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("PTQBCAT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0046"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populatePtqbcatRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTVJOBP_RG
	/*
	PROCEDURE POPULATE_NTVJOBP_RG (FIELD_NAME IN VARCHAR2)IS

   VALUE_OF_FIELD 		VARCHAR2(5)			:= NAME_IN(FIELD_NAME);
   RG_LOGIC 					VARCHAR2(500) 	:= 'select ntvjobp_code, ntvjobp_desc, to_char(ntvjobp_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ntvjobp where ntvjobp_code in (select ntrjobp_jobp_code from ntrjobp ';
   WHERE_STMT 				VARCHAR2(200)		:= 'where ntrjobp_pcls_code = ';
   ORDER_BY 					VARCHAR2(200) 	:= 'order by ntvjobp_code ';
   ERROR_NUMBER 			NUMBER;

 BEGIN
 	RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||')'||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTVJOBP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0044', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;

END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populateNtvjobpRg(NString fieldName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ntvjobp_code, ntvjobp_desc, to_char(ntvjobp_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ntvjobp where ntvjobp_code in (select ntrjobp_jobp_code from ntrjobp ");
			NString whereStmt = toStr("where ntrjobp_pcls_code = ");
			NString orderBy = toStr("order by ntvjobp_code ");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(")").append(orderBy);
			errorNumber = populateGroupWithQuery("NTVJOBP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0044"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTVAGRP_RG
	/*
	PROCEDURE POPULATE_NTVAGRP_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ntvagrp_code, ntvagrp_desc, to_char(ntvagrp_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ntvagrp order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTVAGRP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0043', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtvagrpRg()
		{
			populateNtvagrpRg("act_date");
		}
		public void populateNtvagrpRg(String activityDateAllias)
		{

			//NString rgLogic = toStr("select ntvagrp_code, ntvagrp_desc, to_char(ntvagrp_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ntvagrp order by 1 ");
			NString rgLogic = toStr("select ntvagrp_code, ntvagrp_desc, to_char(ntvagrp_activity_date,'").append(GDate.getNlsDateFormat()).append("')").append(activityDateAllias).append(" from ntvagrp order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			// 
			errorNumber = populateGroupWithQuery("NTVAGRP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0043"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTVACAT_RG
	/*
	PROCEDURE POPULATE_NTVACAT_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ntvacat_code, ntvacat_desc, to_char(ntvacat_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ntvacat order by 1 ';

   ERROR_NUMBER NUMBER;

 BEGIN
<multilinecomment>   IF :GLOBAL.HRESYS <> 'Y' THEN
      MESSAGE('*WARNING* BANNER HR is not installed.');
      RETURN;
   END IF; </multilinecomment>
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTVACAT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0042', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtvacatRg()
		{
			populateNtvacatRg("act_date");
		}
		public void populateNtvacatRg(String act_date)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

//			NString rgLogic = toStr("select ntvacat_code, ntvacat_desc, to_char(ntvacat_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ntvacat order by 1 ");
// MORPHIS - Migration team - 20141017 - Correct NOQLIBR allias  
			NString rgLogic = toStr("select ntvacat_code, ntvacat_desc, to_char(ntvacat_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(act_date).append(" from ntvacat order by 1 ");
			NNumber errorNumber= NNumber.getNull();
			//    IF :GLOBAL.HRESYS <> 'Y' THEN
			// MESSAGE('*WARNING* BANNER HR is not installed.');
			// RETURN;
			// END IF; 
			// 
			errorNumber = populateGroupWithQuery("NTVACAT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0042"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQSALA_RG
	/*
	PROCEDURE POPULATE_NTQSALA_RG IS
   v_hourly VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0038', 'LIB', 'Hourly');
   v_salary VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0039', 'LIB', 'Salary');
   RG_LOGIC VARCHAR2(500) := 'select ntrsalb_sgrp_code, ntrsalb_table, ntrsalb_grade, ntrsala_step, DECODE(ntrsalb_ind,''H'','''||v_hourly||''',''S'','''||v_salary||'''), ntrsala_amount
from ntrsala, ntrsalb 
where ntrsalb_sgrp_code = ntrsala_sgrp_code (+)
and ntrsalb_table = ntrsala_table (+)
and ntrsalb_grade = ntrsala_grade (+)
order by ntrsalb_sgrp_code desc, ntrsalb_table, ntrsalb_grade, ntrsala_step';

   ERROR_NUMBER NUMBER;

 BEGIN
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQSALA_RG',RG_LOGIC);
   message (G$_NLS.Get('NOQLPLS-0040', 'LIB','Error Number: %01%',to_char(error_number)));
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0041', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtqsalaRg()
		{
			NString vHourly = GNls.Fget(toStr("NOQLPLS-0038"), toStr("LIB"), toStr("Hourly"));
			NString vSalary = GNls.Fget(toStr("NOQLPLS-0039"), toStr("LIB"), toStr("Salary"));
			NString rgLogic = toStr("select ntrsalb_sgrp_code, ntrsalb_table, ntrsalb_grade, ntrsala_step, DECODE(ntrsalb_ind,'H','").append(vHourly).append("','S','").append(vSalary).append("'), ntrsala_amount\nfrom ntrsala, ntrsalb \nwhere ntrsalb_sgrp_code = ntrsala_sgrp_code (+)\nand ntrsalb_table = ntrsala_table (+)\nand ntrsalb_grade = ntrsala_grade (+)\norder by ntrsalb_sgrp_code desc, ntrsalb_table, ntrsalb_grade, ntrsala_step");
			NNumber errorNumber= NNumber.getNull();
			// 
			errorNumber = populateGroupWithQuery("NTQSALA_RG", rgLogic);
			//message(GNls.Fget(toStr("NOQLPLS-0040"), toStr("LIB"), toStr("Error Number: %01%"), toChar(errorNumber)));
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0041"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQROUT_RG
	/*
	PROCEDURE POPULATE_NTQROUT_RG (user_id in VARCHAR2, acat_code in VARCHAR2) IS 
   v_fyi VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0034', 'LIB', 'FYI');
   v_approval VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0035', 'LIB', 'Approval');
   v_apply VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0036', 'LIB', 'Apply');
   RG_LOGIC VARCHAR2(600) :=
'select ntrrout_recipient_user_id, f_format_name(spriden_pidm,''FL'') username_desc, ntralvl_level, ntrrout_alvl_code,
ntralvl_desc, decode(ntrrout_action_ind, ''F'','''||v_fyi||''',''A'','''||v_approval||''','''||v_apply||''')
from ntralvl, ntrrout, spriden, gobeacc
where ntrrout_originator_user_id = '''||USER_ID||
''' and ntrrout_acat_code = ''' ||ACAT_CODE||
''' and ntrrout_alvl_code = ntralvl_code
and gobeacc_username(+) = ntrrout_recipient_user_id
and gobeacc_pidm = spriden_pidm
and spriden_change_ind is null
order by ntralvl_level, ntrrout_recipient_user_id';

   ERROR_NUMBER NUMBER;

 BEGIN
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQROUT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0037', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param userId
		* @param acatCode
		*/
		public void populateNtqroutRg(NString userId, NString acatCode)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString vFyi = GNls.Fget(toStr("NOQLPLS-0034"), toStr("LIB"), toStr("FYI"));
			NString vApproval = GNls.Fget(toStr("NOQLPLS-0035"), toStr("LIB"), toStr("Approval"));
			NString vApply = GNls.Fget(toStr("NOQLPLS-0036"), toStr("LIB"), toStr("Apply"));
			NString rgLogic = toStr("select ntrrout_recipient_user_id, f_format_name(spriden_pidm,'FL') username_desc, ntralvl_level, ntrrout_alvl_code,\nntralvl_desc, decode(ntrrout_action_ind, 'F','").append(vFyi).append("','A','").append(vApproval).append("','").append(vApply).append("')\nfrom ntralvl, ntrrout, spriden, gobeacc\nwhere ntrrout_originator_user_id = '").append(userId).append("' and ntrrout_acat_code = '").append(acatCode).append("' and ntrrout_alvl_code = ntralvl_code\nand gobeacc_username(+) = ntrrout_recipient_user_id\nand gobeacc_pidm = spriden_pidm\nand spriden_change_ind is null\norder by ntralvl_level, ntrrout_recipient_user_id");
			NNumber errorNumber= NNumber.getNull();
			errorNumber = populateGroupWithQuery("NTQROUT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0037"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			this.getLogger().trace(this, "F2J : populateNtqroutRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQLVID_RG
	/*
	PROCEDURE POPULATE_NTQLVID_RG IS
   RG_LOGIC VARCHAR2(500) :=  'select gobeacc_username, '||
'f_format_name(spriden_pidm,''FL'') username_desc '||
'from spriden, gobeacc a
where gobeacc_username = (
   select ntrlvid_user_id
   from   ntrlvid
   where  ntrlvid_alvl_code = ' ||   
         ':GLOBAL.ALVL_CODE' ||
'     and    ntrlvid_inactive_ind = ''N''
     and    ntrlvid_user_id = a.gobeacc_username)
and gobeacc_pidm = spriden_pidm
and spriden_change_ind is null
order by gobeacc_username';

   ERROR_NUMBER NUMBER;

 BEGIN
<multilinecomment>   IF :GLOBAL.HRESYS <> 'Y' THEN
      MESSAGE('*WARNING* BANNER HR is not installed.');
      RETURN;
   END IF; </multilinecomment>
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQLVID_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0033', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtqlvidRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString rgLogic = toStr("select gobeacc_username, ").append("f_format_name(spriden_pidm,'FL') username_desc ").append("from spriden, gobeacc a\nwhere gobeacc_username = (\n   select ntrlvid_user_id\n   from   ntrlvid\n   where  ntrlvid_alvl_code = ").append("'"+getGlobal("ALVL_CODE")+"'").append("     and    ntrlvid_inactive_ind = 'N'\n     and    ntrlvid_user_id = a.gobeacc_username)\nand gobeacc_pidm = spriden_pidm\nand spriden_change_ind is null\norder by gobeacc_username");
			NNumber errorNumber= NNumber.getNull();
			//    IF :GLOBAL.HRESYS <> 'Y' THEN
			// MESSAGE('*WARNING* BANNER HR is not installed.');
			// RETURN;
			// END IF; 
			// 
			errorNumber = populateGroupWithQuery("NTQLVID_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0033"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}
//
			this.getLogger().trace(this, "F2J : populateNtqlvidRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQAPTY_RG
	/*
	PROCEDURE POPULATE_NTQAPTY_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ntracat_apty_code, ntvapty_desc, ntracat_apty_entry_seq_no
from ntracat, ntvapty
where ntracat_acat_code = ' ||
':GLOBAL.ACAT_CODE' ||
' and ntracat_apty_code = ntvapty_code
  order by ntracat_apty_entry_seq_no';

   ERROR_NUMBER NUMBER;

 BEGIN
<multilinecomment>   IF :GLOBAL.HRESYS <> 'Y' THEN
      MESSAGE('*WARNING* BANNER HR is not installed.');
      RETURN;
   END IF; </multilinecomment>
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQAPTY_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0032', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtqaptyRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ntracat_apty_code, ntvapty_desc, ntracat_apty_entry_seq_no from ntracat, ntvapty where ntracat_acat_code = '").append(getGlobal("ACAT_CODE")).append("' and ntracat_apty_code = ntvapty_code  order by ntracat_apty_entry_seq_no");
			NNumber errorNumber= NNumber.getNull();
			//    IF :GLOBAL.HRESYS <> 'Y' THEN
			// MESSAGE('*WARNING* BANNER HR is not installed.');
			// RETURN;
			// END IF; 
			// 
			errorNumber = populateGroupWithQuery("NTQAPTY_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0032"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

//			System.err.println("F2J : populateNtqaptyRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQAGRP_RG
	/*
	PROCEDURE POPULATE_NTQAGRP_RG IS
   RG_LOGIC VARCHAR2(800) := 'select distinct ntragrp_agrp_code, ntvagrp_desc 
																from ntragrp, ntvagrp, ntragid
														   where ntragrp_agrp_code = ntvagrp_code
														     and ntragrp_agrp_code = ntragid_agrp_code 
															 order by ntragrp_agrp_code';

   ERROR_NUMBER NUMBER;

 BEGIN
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQAGRP_RG',RG_LOGIC);
   message (G$_NLS.Get('NOQLPLS-0030', 'LIB','Error Number: %01%',to_char(error_number)));
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0031', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtqagrpRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString rgLogic = toStr("select distinct ntragrp_agrp_code, ntvagrp_desc \n																from ntragrp, ntvagrp, ntragid\n														   where ntragrp_agrp_code = ntvagrp_code\n														     and ntragrp_agrp_code = ntragid_agrp_code \n															 order by ntragrp_agrp_code");
			NNumber errorNumber= NNumber.getNull();
//			// 
			errorNumber = populateGroupWithQuery("NTQAGRP_RG", rgLogic);
			//message(GNls.Fget(toStr("NOQLPLS-0030"), toStr("LIB"), toStr("Error Number: %01%"), toChar(errorNumber)));
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0031"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
//				return ;
			}
//
			this.getLogger().trace(this, "F2J : populateNtqagrpRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQAGID_RG
	/*
	PROCEDURE POPULATE_NTQAGID_RG IS
   RG_LOGIC VARCHAR2(800) := 'select distinct ntragid_originator_user_id, spriden_first_name, f_format_name(spriden_pidm,''FL'') spriden_last_name
     														from ntragid, spriden, gobeacc
    													 where ntragid_originator_user_id = gobeacc_username
      													 and gobeacc_pidm = spriden_pidm
      													 and spriden_change_ind is null
   													  order by ntragid_originator_user_id';

   ERROR_NUMBER NUMBER;

 BEGIN
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQAGID_RG',RG_LOGIC);
   message (G$_NLS.Get('NOQLPLS-0028', 'LIB','Error Number: %01%',to_char(error_number)));
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0029', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;  
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNtqagidRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select distinct ntragid_originator_user_id, spriden_first_name, f_format_name(spriden_pidm,'FL') spriden_last_name\n from ntragid, spriden, gobeacc\n where ntragid_originator_user_id = gobeacc_username\n and gobeacc_pidm = spriden_pidm\n and spriden_change_ind is null\n order by ntragid_originator_user_id");
			NNumber errorNumber= NNumber.getNull();
			// 
			errorNumber = populateGroupWithQuery("NTQAGID_RG", rgLogic);
			//message(GNls.Fget(toStr("NOQLPLS-0028"), toStr("LIB"), toStr("Error Number: %01%"), toChar(errorNumber)));
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0029"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

			//System.err.println("F2J : populateNtqagidRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NTQACLV_RG
	/*
	PROCEDURE POPULATE_NTQACLV_RG (acat_code in VARCHAR2) IS 
  v_fyi VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0024', 'LIB', 'FYI');
  v_approval VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0025', 'LIB', 'Approval');
  v_apply VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0026', 'LIB', 'Apply');
  RG_LOGIC VARCHAR2(500) :=
  'select ntralvl_level, ntraclv_alvl_code, ntralvl_desc,
decode(ntraclv_action_ind, ''F'','''||v_fyi||''',''A'','''||v_approval||''','''||v_apply||''')
   from ntralvl, ntraclv
  where ntraclv_acat_code = '''|| acat_code ||
''' and ntraclv_alvl_code = ntralvl_code
   order by ntralvl_level, ntraclv_alvl_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTQACLV_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0027', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param acatCode
		*/
		public void populateNtqaclvRg(NString acatCode)
		{
			populateNtqaclvRg(acatCode,"");
		}
		public void populateNtqaclvRg(NString acatCode,String decodeAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString vFyi = GNls.Fget(toStr("NOQLPLS-0024"), toStr("LIB"), toStr("FYI"));
			NString vApproval = GNls.Fget(toStr("NOQLPLS-0025"), toStr("LIB"), toStr("Approval"));
			NString vApply = GNls.Fget(toStr("NOQLPLS-0026"), toStr("LIB"), toStr("Apply"));
			NString rgLogic = toStr("select to_char(ntralvl_level) ntralvl_level, ntraclv_alvl_code, ntralvl_desc,\ndecode(ntraclv_action_ind, 'F','").append(vFyi).append("','A','").append(vApproval).append("','").append(vApply).append("')").append(decodeAllias).append("\n   from ntralvl, ntraclv\n  where ntraclv_acat_code = '").append(acatCode).append("' and ntraclv_alvl_code = ntralvl_code\n   order by ntralvl_level, ntraclv_alvl_code");
			NNumber errorNumber= NNumber.getNull();
			errorNumber = populateGroupWithQuery("NTQACLV_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0027"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
			}

		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_NBAJOBS_RG
	/*
	PROCEDURE POPULATE_NBAJOBS_RG IS
 
   RG_LOGIC VARCHAR2(1000) := 'select distinct nbrjobs_coas_code_ts, nbrjobs_orgn_code_ts, ftvorgn_title 
                              from nbrjobs, ftvorgn a 
                              where (nbrjobs_coas_code_ts = ftvorgn_coas_code 
                              or nbrjobs_coas_code_ts is null) 
                              and nbrjobs_orgn_code_ts = ftvorgn_orgn_code 
                              and ftvorgn_eff_date = (select max(ftvorgn_eff_date) 
                              from ftvorgn b 
                              where a.ftvorgn_coas_code = b.ftvorgn_coas_code 
                              and a.ftvorgn_orgn_code = b.ftvorgn_orgn_code) 
                              order by nbrjobs_coas_code_ts, nbrjobs_orgn_code_ts'; 
    
   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0022', 'LIB','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;
--
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NBAJOBS_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0023', 'LIB','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateNbajobsRg()
		{
			populateNbajobsRg(toStr("FTVORGN_TITLE"));
		}
		
		public void populateNbajobsRg(NString desc)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select distinct nbrjobs_coas_code_ts, nbrjobs_orgn_code_ts, ftvorgn_title AS ").append(desc).append("\n                              from nbrjobs, ftvorgn a \n                              where (nbrjobs_coas_code_ts = ftvorgn_coas_code \n                              or nbrjobs_coas_code_ts is null) \n                              and nbrjobs_orgn_code_ts = ftvorgn_orgn_code \n                              and ftvorgn_eff_date = (select max(ftvorgn_eff_date) \n                              from ftvorgn b \n                              where a.ftvorgn_coas_code = b.ftvorgn_coas_code \n                              and a.ftvorgn_orgn_code = b.ftvorgn_orgn_code) \n                              order by nbrjobs_coas_code_ts, nbrjobs_orgn_code_ts");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0022"), toStr("LIB"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			// 
			errorNumber = populateGroupWithQuery("NBAJOBS_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0023"), toStr("LIB"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				//return ;
			}

			//System.err.println("F2J : populateNbajobsRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_JOBS_EFF_DATE_RG
	/*
	PROCEDURE POPULATE_JOBS_EFF_DATE_RG (par_pidm IN NUMBER,
                                     par_posn IN VARCHAR2,
                                     par_suff IN VARCHAR2) IS
  RG_LOGIC VARCHAR2(2000) := 'select to_char(nbrjobs_effective_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||'''), 
                              to_char(nbrjobs_reg_rate,''99990.999999'') nbrjobs_reg_rate, 
                              to_char(nbrjobs_ann_salary,''999999990.99'') nbrjobs_ann_salary,
                              nbrjobs_jcre_code||''  ''||ptrjcre_desc ,
                              nbrjobs_ecls_code,
                              nbrjobs_pict_code 
                              from ptrjcre, nbrjobs 
                              where nbrjobs_pidm = '||par_pidm||' 
                              and nbrjobs_posn = '''||par_posn||''' 
                              and nbrjobs_suff = '''||par_suff||'''
                              and nbrjobs_jcre_code = ptrjcre_code (+) 
                              order by nbrjobs_effective_date desc';  
    
   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.HRESYS') = 'Y' THEN
--
     ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('JOBS_EFF_DATES_RG',RG_LOGIC);
     IF ERROR_NUMBER <> 0 THEN
        MESSAGE ( G$_NLS.Get('NOQLPLS-0021', 'LIB','*WARNING* No records found.') );
        RAISE FORM_TRIGGER_FAILURE;
        RETURN;
     END IF;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parPidm
		* @param parPosn
		* @param parSuff
		*/
		public void populateJobsEffDateRg(NNumber parPidm, NString parPosn, NString parSuff)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
			//MORPHIS: added the table name to the order clause
			NString rgLogic = toStr("select to_char(nbrjobs_effective_date,'").append(GDate.getNlsDateFormat())
					.append("') nbrjobs_effective_date, \n                              to_char(nbrjobs_reg_rate,'99990.999999') nbrjobs_reg_rate, \n                              to_char(nbrjobs_ann_salary,'999999990.99') nbrjobs_ann_salary,\n                              nbrjobs_jcre_code||'  '||ptrjcre_desc nbrjobs_jcre_code ,\n                              nbrjobs_ecls_code,\n                              nbrjobs_pict_code \n                              from ptrjcre, nbrjobs \n                              where nbrjobs_pidm = ")
					.append(parPidm).append(" \n                              and nbrjobs_posn = '").append(parPosn)
					.append("' \n                              and nbrjobs_suff = '").append(parSuff)
					.append("'\n                              and nbrjobs_jcre_code = ptrjcre_code (+) \n                              order by nbrjobs.nbrjobs_effective_date desc");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").equals("Y") )
			{
				// 
				errorNumber = populateGroupWithQuery("JOBS_EFF_DATES_RG", rgLogic);
				if ( errorNumber.notEquals(0) )
				{
					warningMessage(GNls.Fget(toStr("NOQLPLS-0021"), toStr("LIB"), toStr("*WARNING* No records found.")));
					throw new ApplicationException();
//					return ;
				}
			}

//			System.err.println("F2J : populateJobsEffDateRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_FTVPROJ_RG
	/*
	PROCEDURE POPULATE_FTVPROJ_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ftvproj_code, ftvproj_long_desc, to_char(ftvproj_eff_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') eff_date, to_char(ftvproj_term_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') term_date from ftvproj order by ftvproj_code '; 

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0019', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('FTVPROJ_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0020', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		
		public void populateFtvprojRg()
		{
			populateFtvprojRg("","");
		}
		
		
		
		public void populateFtvprojRg(String codeAllias, String longDescAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ftvproj_code ").append(codeAllias).append(", ftvproj_long_desc ").append(longDescAllias).append(", to_char(ftvproj_eff_date,'").append(GDate.getNlsDateFormat()).append("') eff_date, to_char(ftvproj_term_date,'").append(GDate.getNlsDateFormat()).append("') term_date from ftvproj order by ftvproj_code ");
		
//			errCode = populateGroupWithQuery(rgName, toStr("SELECT FTVACCI_COAS_CODE ").append(coasCodeAllias).append(", ").append(" FTVACCI_ACCI_CODE ").append(acciAlias).append(" ,").append(" FTVACCI_TITLE ").append(titleAllias).append(" ,").append(" FTVACCI_STATUS_IND ").append(statusAllias).append(" , ").append("TO_CHAR(FTVACCI_EFF_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(effDateAllias).append(", ").append("TO_CHAR(FTVACCI_TERM_DATE,").append("'").append(GDate.getNlsDateFormat()).append("'").append(") ").append(termAllias).append(" FROM FTVACCI ORDER BY DECODE(FTVACCI_COAS_CODE, '").append(getGlobal("COAS_CODE")).append("', ").append("'").append(" ").append("'").append(", FTVACCI_COAS_CODE), ").append("FTVACCI_ACCI_CODE, FTVACCI_EFF_DATE"));

			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0019"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("FTVPROJ_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0020"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}

			this.getLogger().trace(this, "F2J : populateFtvprojRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_FTVOBUD_RG
	/*
	PROCEDURE POPULATE_FTVOBUD_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ftvobud_coas_code, ftvobud_obud_code, ftvobud_budg_title, ftvobud_yrs_budgeted, ftvobud_budg_prd_type from ftvobud order by ftvobud_coas_code, ftvobud_obud_code '; 

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0017', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('FTVOBUD_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0018', 'LIB','*WARNING* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateFtvobudRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ftvobud_coas_code, ftvobud_obud_code, ftvobud_budg_title, ftvobud_yrs_budgeted, ftvobud_budg_prd_type from ftvobud order by ftvobud_coas_code, ftvobud_obud_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0017"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("FTVOBUD_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0018"), toStr("LIB"), toStr("*WARNING* No records found. ")));
				throw new ApplicationException();
//				return ;
			}
//
			this.getLogger().trace(this, "F2J : populateFtvobudRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_FTVOBPH_RG
	/*
	PROCEDURE POPULATE_FTVOBPH_RG IS
   v_open VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0012', 'LIB', 'Open');
   v_closed VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0013', 'LIB', 'Closed');
   v_active VARCHAR2(100) := G$_NLS.Get('NOQLPLS-0014', 'LIB', 'Active');
   RG_LOGIC VARCHAR2(500) := 'select ftvobph_coas_code, ftvobph_obud_code, ftvobph_obph_code, ftvobph_budg_phase_short_title, ftvobph_budg_phase_status, decode(ftvobph_budg_phase_status, ''O'', '''||v_open||''', ''C'', '''||v_closed||''', ''A'', '''||v_active||'''), to_char(ftvobph_budg_activation_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date, ftvobph_budg_meas_type, ftvobph_obud_code_base, ftvobph_obph_code_base  '; 
   RG_LOGIC2 VARCHAR2(500) := ' from ftvobph order by ftvobph_coas_code, ftvobph_obud_code, ftvobph_seq_display_num '; 

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0015', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   RG_LOGIC := RG_LOGIC||RG_LOGIC2;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('FTVOBPH_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0016', 'LIB','*WARNING* No records found. ') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		public void populateFtvobphRg()
		{
			populateFtvobphRg("","act_date");
		}
		
		
		
		public void populateFtvobphRg(String decodeAllias, String activityDateAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString vOpen = GNls.Fget(toStr("NOQLPLS-0012"), toStr("LIB"), toStr("Open"));
			NString vClosed = GNls.Fget(toStr("NOQLPLS-0013"), toStr("LIB"), toStr("Closed"));
			NString vActive = GNls.Fget(toStr("NOQLPLS-0014"), toStr("LIB"), toStr("Active"));
			NString rgLogic = toStr("select ftvobph_coas_code, ftvobph_obud_code, ftvobph_obph_code, ftvobph_budg_phase_short_title, ftvobph_budg_phase_status, decode(ftvobph_budg_phase_status, 'O', '").append(vOpen).append("', 'C', '").append(vClosed).append("', 'A', '").append(vActive).append("')").append(decodeAllias).append(", to_char(ftvobph_budg_activation_date,'").append(GDate.getNlsDateFormat()).append("')").append(activityDateAllias).append(", ftvobph_budg_meas_type, ftvobph_obud_code_base, ftvobph_obph_code_base  ");
			NString rgLogic2 = toStr(" from ftvobph order by ftvobph_coas_code, ftvobph_obud_code, ftvobph_seq_display_num ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0015"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			rgLogic = rgLogic.append(rgLogic2);
			errorNumber = populateGroupWithQuery("FTVOBPH_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0016"), toStr("LIB"), toStr("*WARNING* No records found. ")));
				throw new ApplicationException();
//				return ;
			}
//
			this.getLogger().trace(this, "F2J : populateFtvobphRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_FTVECLS_RG
	/*
	PROCEDURE POPULATE_FTVECLS_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ftvecls_ecls_code, ftvecls_desc, to_char(ftvecls_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from ftvecls order by ftvecls_ecls_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0010', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('FTVECLS_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0011', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateFtveclsRg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ftvecls_ecls_code, ftvecls_desc, to_char(ftvecls_activity_date,'").append(GDate.getNlsDateFormat()).append("') act_date from ftvecls order by ftvecls_ecls_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0010"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("FTVECLS_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0011"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}

			//System.err.println("F2J : populateFtveclsRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.POPULATE_FTVCTYP_RG
	/*
	PROCEDURE POPULATE_FTVCTYP_RG IS
   RG_LOGIC VARCHAR2(500) := 'select ftvctyp_code, ftvctyp_short_desc, ftvctyp_long_desc from ftvctyp order by ftvctyp_code '; 

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0008', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('FTVCTYP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0009', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		
		public void populateFtvctypRg()
		{
			populateFtvctypRg("","","");
		}
		
		
		public void populateFtvctypRg(String codeAllias, String shortDescAllias, String longDescAllias)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgLogic = toStr("select ftvctyp_code ").append(codeAllias).append(", ftvctyp_short_desc ").append(shortDescAllias).append(", ftvctyp_long_desc ").append(longDescAllias).append(" from ftvctyp order by ftvctyp_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("NOQLPLS-0008"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("FTVCTYP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0009"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}

			this.getLogger().trace(this, "F2J : populateFtvctypRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_VERIFY_PASSWORD
	/*
	PROCEDURE N$_VERIFY_PASSWORD IS

USER_NAME VARCHAR2(80);

BEGIN
   COPY(USER,'GLOBAL.ALT_USER_ID');
   USER_NAME := USER;
   COPY('','GLOBAL.ALT_PASSWORD');

   COPY(GET_WINDOW_PROPERTY('MAIN_WINDOW',TITLE),'GLOBAL.WIN_TITLE');
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'GUAUIPW','NO_HIDE');
   G$_CHECK_VALUE (NOT FORM_SUCCESS, G$_NLS.Get('NOQLPLS-0005', 'LIB','*ERROR* Occurred during call to
GUAUIPW.') , TRUE);

   IF UPPER(NAME_IN('GLOBAL.ALT_USER_ID')) <> UPPER(USER_NAME) THEN
      MESSAGE ( G$_NLS.Get('NOQLPLS-0006', 'LIB','*ERROR* Cannot modify user id, access denied.') );
      COPY('','GLOBAL.ALT_PASSWORD');
      RETURN;
   END IF;

   IF NAME_IN('GLOBAL.ALT_PASSWORD') IS NULL OR NAME_IN('GLOBAL.ALT_USER_ID') IS NULL THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0007', 'LIB','*ERROR* Valid alternate user id/password not entered, access
denied')  );
      COPY('','GLOBAL.ALT_PASSWORD');
   END IF ;
END ;
	*/
	/* <p>
/* </p>
		*/
		public void nVerifyPassword()
		{
			NString userName= NString.getNull();
			copy(getUser(),"GLOBAL.ALT_USER_ID");
			userName = getUser();
			copy("","GLOBAL.ALT_PASSWORD");
			copy(getWindowTitle("MAIN_WINDOW"),"GLOBAL.WIN_TITLE");
			executeAction("G$_REVOKE_ACCESS");
			getGoqrpls().gCheckFailure();
			getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), toStr("GUAUIPW"), toStr("NO_HIDE"));
			if ( upper(getNameIn("GLOBAL.ALT_USER_ID")).notEquals(upper(userName)) )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0006"), toStr("LIB"), toStr("*ERROR* Cannot modify user id, access denied.")));
				copy("","GLOBAL.ALT_PASSWORD");
				return ;
			}
			if ( getNameIn("GLOBAL.ALT_PASSWORD").isNull() || getNameIn("GLOBAL.ALT_USER_ID").isNull() )
			{
				errorMessage(GNls.Fget(toStr("NOQLPLS-0007"), toStr("LIB"), toStr("*ERROR* Valid alternate user id/password not entered, access\ndenied")));
				copy("","GLOBAL.ALT_PASSWORD");
			}
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_SELECT_TERN_TLBD_RECORDS
	/*
	FUNCTION  N$_EA_SELECT_TERN_TLBD_RECORDS(TRANS3_# IN NUMBER)
  RETURN BOOLEAN IS

-- Purpose of this function to find any records in
-- NORTLBD,NORTERN for given transaction and is called
-- from N$_EA_BACK_NOBTRAN_SUSPEND procedure.

  PTI_INTO_TEMP  VARCHAR2(1);
  CURSOR PTI_CURSOR IS  SELECT 'X' FROM NORTLBD  WHERE
                       NORTLBD_TRANSACTION_NO=TRANS3_#
             OR EXISTS (SELECT 'X' FROM NORTERN  WHERE
                       NORTERN_TRANSACTION_NO=TRANS3_#);

 BEGIN
   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    IF PTI_CURSOR%FOUND  THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
 RETURN NULL; END;    
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trans3#
		*/
		public NBool nEaSelectTernTlbdRecords(NNumber trans3___)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Purpose of this function to find any records in
//			//  NORTLBD,NORTERN for given transaction and is called
//			//  from N$_EA_BACK_NOBTRAN_SUSPEND procedure.
//			NString ptiIntoTemp= NString.getNull();
//			String sqlptiCursor = "SELECT 'X' " +
//	" FROM NORTLBD " +
//	" WHERE NORTLBD_TRANSACTION_NO = :P_TRANS3___ OR  EXISTS(SELECT 'X' " +
//		" FROM NORTERN " +
//		" WHERE NORTERN_TRANSACTION_NO = :P_TRANS3___ ) ";
//			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//			try {
//				//Setting query parameters
//				ptiCursor.addParameter("P_TRANS3___", trans3___);
//				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//				ptiCursor.open();
//				ResultSet ptiCursorResults = ptiCursor.fetchInto();
//				if ( ptiCursorResults != null ) {
//					ptiIntoTemp = ptiCursorResults.getStr(0);
//				}
//				if ( ptiCursor.found() )
//				{
//					return  toBool(NBool.True);
//				}
//				else {
//					return  toBool(NBool.False);
//				}
//				return NBool.getNull();
//				}finally{
//					ptiCursor.close();
//				}
//
			this.getLogger().trace(this, "F2J : nEaSelectTernTlbdRecords function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_SELECT_PEBEMPL_BLOCK
	/*
	FUNCTION  N$_EA_SELECT_PEBEMPL_BLOCK (TRANS3_# IN NUMBER)
  RETURN BOOLEAN IS

-- Purpose of this function to find any records for PEBEMPL block
-- and is called from N$_EA_EDIT_APPROVALS_APPLY procedure.

  PTI_INTO_TEMP  VARCHAR2(1);
  CURSOR PTI_CURSOR IS  SELECT 'X' FROM NORTRAN  WHERE
                     NORTRAN_TRANSACTION_NO=TRANS3_# AND
                     NORTRAN_AUBK_CODE='PEBEMPL';

 BEGIN
   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    IF PTI_CURSOR%FOUND  THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
 RETURN NULL; END;                 
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trans3#
		*/
		
		//TODO Morphis- Uncommented for NOAAPSM by jpb
		public NBool nEaSelectPebemplBlock(NNumber trans3___)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			//  Purpose of this function to find any records for PEBEMPL block
			//  and is called from N$_EA_EDIT_APPROVALS_APPLY procedure.
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM NORTRAN " +
	" WHERE NORTRAN_TRANSACTION_NO = :P_TRANS3___ AND NORTRAN_AUBK_CODE = 'PEBEMPL' ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_TRANS3___", trans3___);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.found() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
//				return NBool.getNull();
				}finally{
					
					ptiCursor.close();
				}

//			System.err.println("F2J : nEaSelectPebemplBlock function is not completely migrated yet. Please read the Migration Guide.");
//			return NBool.getNull();
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_EDIT_APPROVALS_APPLY
	/*
	PROCEDURE N$_EA_EDIT_APPROVALS_APPLY     (  PAR_USER_ID IN VARCHAR2,
                                          PAR_TRANS_NO IN NUMBER,
                                          PAR_TRANS_STAT IN VARCHAR2,
                                          PAR_QUEUE_STAT IN VARCHAR2,
                                          PAR_ACTION_IND IN VARCHAR2, 
                                          PAR_APPLY_IND IN OUT VARCHAR2 )
                                                                    IS 
          <multilinecomment> PURPOSE: This procedure edits that transaction status is
             'A'pproved or Par'T'ially completed and that the Person
             logged in or the Proxy for user Id is a superuser 
             (N$_SUPUSER_WITHOUT_TRANS_NO function) or the action indicator is
             Apply on the NORROUT record. If there are NORTRAN,NORTLBD,
             &NTRTERN records for both effective dated and non-effective
             dated block then procedure saves cursor field in a GLOBAL.FIELD and
             goes to the N$_APPLY_DATE field.
   PARAMETER DEFINITION:
      PAR_USER_ID      - Person logged in.
      PAR_TRANS_NO     - Transaction being processed.
      PAR_TRANS_STAT   - Transaction Status being processed.
      PAR_ACTION_IND   - Action indicator being processed.
      PAR_APPLY_IND    - Apply indicator to be changed.
   WHERE EXECUTED FROM:
          1.In the 'CHECKBOX_CHANGED' trigger.
          </multilinecomment>

BEGIN
 IF  PAR_TRANS_STAT IN ('A','T','L')  THEN
    IF (PAR_ACTION_IND='L' OR 
       (nokepaf.f_ea_edit_superuser(PAR_USER_ID)='Y' AND PAR_QUEUE_STAT='X')) THEN
        IF  PAR_APPLY_IND='N' THEN
            SET_ITEM_PROPERTY('APPLY_BTN',ENABLED,PROPERTY_OFF);
        ELSIF PAR_APPLY_IND='Y' THEN 
            SET_ITEM_PROPERTY('APPLY_BTN',ENABLED,PROPERTY_ON);
           IF  N$_EA_SELECT_PEBEMPL_BLOCK(PAR_TRANS_NO) THEN
              COPY(NAME_IN('SYSTEM.CURSOR_ITEM'),'GLOBAL.FIELD');
               GO_ITEM('N$_APPLY_DATE');
           END IF;
        END IF;    
    ELSE
         PAR_APPLY_IND:='N';
         MESSAGE( G$_NLS.Get('NOQLPLS-0003', 'LIB','*ERROR* The Apply action is not valid. Required action ind must be ''Apply'' ') 
        );   
    END IF;
 ELSE
        PAR_APPLY_IND:='N';
      MESSAGE( G$_NLS.Get('NOQLPLS-0004', 'LIB','*ERROR* Apply is invalid. Status must be ''Approved''or''Partially Completed.''') );
  END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parUserId
		* @param parTransNo
		* @param parTransStat
		* @param parQueueStat
		* @param parActionInd
		* @param parApplyInd
		*/
		//TODO Morphis- Uncommented for NOAAPSM by jpb

		public void nEaEditApprovalsApply(NString parUserId, NNumber parTransNo, NString parTransStat, NString parQueueStat, NString parActionInd, Ref<NString> parApplyInd)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			if ( in(parTransStat, "A", "T", "L").getValue() )
			{
				if ((parActionInd.equals("L") || (Nokepaf.fEaEditSuperuser(parUserId).equals("Y") && parQueueStat.equals("X"))))
				{
					if ( parApplyInd.val.equals("N") )
					{
						setItemEnabled("APPLY_BTN", false);
					}
					else if ( parApplyInd.val.equals("Y") ) {
						setItemEnabled("APPLY_BTN", true);
						if ( nEaSelectPebemplBlock(parTransNo).getValue() )
						{
							copy(getCursorItem(),"GLOBAL.FIELD");
							goItem(toStr("N$_APPLY_DATE"));
							TaskServices.getCurrentTask().getNavigationModel().doNavigation();
						}
					}
				}
				else {
					parApplyInd.val = toStr("N");
					errorMessage(GNls.Fget(toStr("NOQLPLS-0003"), toStr("LIB"), toStr("*ERROR* The Apply action is not valid. Required action ind must be 'Apply' ")));
				}
			}
			else {
				parApplyInd.val = toStr("N");
				errorMessage(GNls.Fget(toStr("NOQLPLS-0004"), toStr("LIB"), toStr("*ERROR* Apply is invalid. Status must be 'Approved'or'Partially Completed.'")));
			}

//			System.err.println("F2J : nEaEditApprovalsApply procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_DISTINCT_BLOCK
	/*
	FUNCTION  N$_EA_DISTINCT_BLOCK (TRANS2_# IN NUMBER)

-- Function returns true if more then one block exists in
-- in NORTRAN or block name not equal PEBEMPL and is called
-- from N$_EA_BACK_NOBTRAN_SUSPEND procedure.
 
  RETURN BOOLEAN IS
  PTI_INTO_TEMP  VARCHAR2(30);
  CURSOR PTI_CURSOR IS  SELECT DISTINCT NORTRAN_AUBK_CODE FROM NORTRAN WHERE
                        NORTRAN_TRANSACTION_NO=TRANS2_#;

 BEGIN
   OPEN PTI_CURSOR ;
  LOOP
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    EXIT WHEN PTI_CURSOR%NOTFOUND;
  END LOOP; 
    IF ((PTI_CURSOR%ROWCOUNT > 1) OR (PTI_CURSOR%ROWCOUNT=1 AND
        PTI_INTO_TEMP <> 'PEBEMPL')) THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
 RETURN NULL; END;        
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param trans2#
		*/
		
		//TODO Morphis- Uncommented for NOAAPSM by jpb

		public NBool nEaDistinctBlock(NNumber trans2___)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT DISTINCT NORTRAN_AUBK_CODE " +
	" FROM NORTRAN " +
	" WHERE NORTRAN_TRANSACTION_NO = :P_TRANS2___ ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_TRANS2___", trans2___);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				while (true) {
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						ptiIntoTemp = ptiCursorResults.getStr(0);
					}
					if ( ptiCursor.notFound() ) 
						break;
				}
				if (((ptiCursor.getRowCount()>1) || (ptiCursor.getRowCount()==1 && ptiIntoTemp.notEquals("PEBEMPL"))))
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
//				return NBool.getNull();
				}finally{
					ptiCursor.close();
				}
//
//			System.err.println("F2J : nEaDistinctBlock function is not completely migrated yet. Please read the Migration Guide.");
			
//			return NBool.getNull();
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_CHECK_PROXY
	/*
	FUNCTION N$_EA_CHECK_PROXY (PAR_USER_ID IN VARCHAR2)
    RETURN BOOLEAN  IS
VAR_USER_ID  VARCHAR2(30);
BEGIN
VAR_USER_ID:=PAR_USER_ID;
         <multilinecomment> PURPOSE: This function returns the ID of PROXY. If Proxy
            was defined more then once on GURIDEN then trigger
            POST-CHANGED raises FORM_TRIGGER_FAILURE.
         PARAMETER DEFINITION:
            PAR_USER_ID  - Person logged in.
         WHERE EXECUTED FROM:
            1. In the 'POST-CHANGED' trigger on PROXY_FOR item.
         </multilinecomment>
  DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   GURIDEN
         WHERE  GURIDEN_USER_ID = VAR_USER_ID;
   BEGIN
      OPEN PTI_CURSOR ;
    LOOP
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      EXIT WHEN PTI_CURSOR%NOTFOUND;
    END LOOP;
      IF PTI_CURSOR%ROWCOUNT > 1 THEN
         RETURN  TRUE;
      ELSE
         RETURN FALSE; 
      END IF ;
   END ;
RETURN NULL; END N$_EA_CHECK_PROXY;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parUserId
		*/
		
		//TODO Morphis- Uncommented for NOAAPSM by jpb

		
		public NBool nEaCheckProxy(NString parUserId)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			NString varUserId= NString.getNull();
			varUserId = parUserId;
			{
				NString ptiIntoTemp= NString.getNull();
				String sqlptiCursor = "SELECT 'X' " +
	" FROM GURIDEN " +
	" WHERE GURIDEN_USER_ID = :P_VAR_USER_ID ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					//Setting query parameters
					ptiCursor.addParameter("P_VAR_USER_ID", varUserId);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					while (true) {
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() ) 
							break;
					}
					if ( ptiCursor.getRowCount()>1 )
					{
						return  toBool(NBool.True);
					}
					else {
						return  toBool(NBool.False);
					}
				}
				finally{
					ptiCursor.close();
				}
			}
//			return NBool.getNull();
////
//			System.err.println("F2J : nEaCheckProxy function is not completely migrated yet. Please read the Migration Guide.");
//			
//			return NBool.getNull();
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_BACK_NOBTRAN_SUSPEND
	/*
	PROCEDURE N$_EA_BACK_NOBTRAN_SUSPEND (PAR_TRANS_NO IN NUMBER,PAR_APPLY_IND  IN OUT VARCHAR2) IS

-- This procedure sets checkbox to N if any records in NORTERN and NORTLBD
-- do not exist and block name not equal PEBEMPL.

BEGIN
 IF (NOT N$_EA_DISTINCT_BLOCK(PAR_TRANS_NO) AND
     NOT N$_EA_SELECT_TERN_TLBD_RECORDS(PAR_TRANS_NO)) THEN
     PAR_APPLY_IND :='N';
     GO_ITEM(NAME_IN('GLOBAL.FIELD'));
 ELSE
       GO_ITEM(NAME_IN('GLOBAL.FIELD'));
 END IF;
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parTransNo
		* @param parApplyInd
		*/
		
		//TODO Morphis- Uncommented for NOAAPSM by jpb
		public void nEaBackNobtranSuspend(NNumber parTransNo, Ref<NString> parApplyInd)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			//if ((nEaDistinctBlock(parTransNo).not().getValue() && nEaSelectTernTlbdRecords(parTransNo).not().getValue()))
			if ((nEaDistinctBlock(parTransNo).not() && nEaSelectTernTlbdRecords(parTransNo).not()))

			{
				parApplyInd.val = toStr("N");
				hideWindow(getCurrentWindow());
				goItem(getNameIn("GLOBAL.FIELD"));
			}
			else {
				hideWindow(getCurrentWindow());
				goItem(getNameIn("GLOBAL.FIELD"));
			}

//			System.err.println("F2J : nEaBackNobtranSuspend procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_BACK_NOBTRAN_CANCEL
	/*
	PROCEDURE N$_EA_BACK_NOBTRAN_CANCEL  (PAR_APPLY_IND IN OUT VARCHAR2)  IS

-- This procedure sets checkbox to N if user does Cancel action in
-- N$_APLLY_DATE window.

BEGIN
     PAR_APPLY_IND :='N';
     GO_ITEM(NAME_IN('GLOBAL.FIELD'));
END;
	*/
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parApplyInd
		*/
		
		//TODO Morphis- Uncommented for NOAAPSM by jpb

		public void nEaBackNobtranCancel(Ref<NString> parApplyInd)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			parApplyInd.val = toStr("N");
			
			hideWindow(getCurrentWindow());
			
			goItem(getNameIn("GLOBAL.FIELD"));

//			System.err.println("F2J : nEaBackNobtranCancel procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_EA_APPROVALS_FORM_TO_UPDATE
	/*
	PROCEDURE N$_EA_APPROVALS_FORM_TO_UPDATE (PAR_ACAT_CODE IN VARCHAR2 )  
                                                               IS

VAR_FORM_NAME   VARCHAR2(7);
BEGIN
   
    <multilinecomment> PURPOSE: This procedure returns the first form to call when applying
                transaction.
            
   PARAMETER DEFINITION:
           PAR_ACAT_CODE - Approval Category being processed.
   WHERE EXECUTED FROM:
            1. In the 'WHEN-BUTTON-PRESSED' trigger of APPLY button.
            </multilinecomment>
DECLARE

 CURSOR PTI_CURSOR IS 
     SELECT NTRAPFB_AUFM_CODE FROM NTRAPFB A
        WHERE NTRAPFB_APPLY_SEQ_NO= 
       (SELECT MIN(NTRAPFB_APPLY_SEQ_NO)
        FROM NTRAPFB B WHERE
        A.NTRAPFB_APTY_CODE=B.NTRAPFB_APTY_CODE
        AND B.NTRAPFB_APTY_CODE =
             ( SELECT NTRACAT_APTY_CODE
              FROM   NTRACAT A  WHERE                 
              A.NTRACAT_ACAT_CODE = PAR_ACAT_CODE AND
              A.NTRACAT_APTY_ENTRY_SEQ_NO=
                          (SELECT  MIN(NTRACAT_APTY_ENTRY_SEQ_NO)
                           FROM NTRACAT C WHERE
                           C.NTRACAT_ACAT_CODE=A.NTRACAT_ACAT_CODE AND
                           C.NTRACAT_ACAT_CODE=PAR_ACAT_CODE)));
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO VAR_FORM_NAME;   
  IF PTI_CURSOR%NOTFOUND THEN
     MESSAGE( G$_NLS.Get('NOQLPLS-0002', 'LIB','*ERROR* Cannot call Form;Check set up of roles on NTRACAT or NTRAPTY for Approval Category ') 
             );
  ELSE
     COPY('Y','GLOBAL.APPLY');
     EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
     G$_CHECK_FAILURE;
     G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),VAR_FORM_NAME,'');
  END IF;                             
END;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parAcatCode
		*/
		public void nEaApprovalsFormToUpdate(NString parAcatCode)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString varFormName= NString.getNull();
			{
				String sqlptiCursor = "SELECT NTRAPFB_AUFM_CODE " +
	" FROM NTRAPFB A " +
	" WHERE NTRAPFB_APPLY_SEQ_NO = (SELECT MIN(NTRAPFB_APPLY_SEQ_NO) " +
		" FROM NTRAPFB B " +
		" WHERE A.NTRAPFB_APTY_CODE = B.NTRAPFB_APTY_CODE AND B.NTRAPFB_APTY_CODE = (SELECT NTRACAT_APTY_CODE " +
			" FROM NTRACAT A " +
			" WHERE A.NTRACAT_ACAT_CODE = :P_PAR_ACAT_CODE AND A.NTRACAT_APTY_ENTRY_SEQ_NO = (SELECT MIN(NTRACAT_APTY_ENTRY_SEQ_NO) " +
				" FROM NTRACAT C " +
				" WHERE C.NTRACAT_ACAT_CODE = A.NTRACAT_ACAT_CODE AND C.NTRACAT_ACAT_CODE = :P_PAR_ACAT_CODE ) ) ) ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					//Setting query parameters
					ptiCursor.addParameter("P_PAR_ACAT_CODE", parAcatCode);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						varFormName = ptiCursorResults.getStr(0);
					}
					if ( ptiCursor.notFound() )
					{
						errorMessage(GNls.Fget(toStr("NOQLPLS-0002"), toStr("LIB"), toStr("*ERROR* Cannot call Form;Check set up of roles on NTRACAT or NTRAPTY for Approval Category ")));
					}
					else {
						copy("Y","GLOBAL.APPLY");
						executeAction("G$_REVOKE_ACCESS");
						getGoqrpls().gCheckFailure();
						getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), varFormName, toStr(""));
					}
				}
				finally{
					ptiCursor.close();
				}
			}

			this.getLogger().trace(this, "F2J : nEaApprovalsFormToUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.N$_CALLED_FORM_NAVIGATE
	/*
	PROCEDURE N$_CALLED_FORM_NAVIGATE IS

<multilinecomment> Call this procedure from the WHEN-NEW-FORM-INSTANCE trigger of a form that is called
   from other forms.

   In the calling form, set globals in the following manner:

       global.form_was_called = 'Y'
       global.go_to_block     = form_name.block_name   (eg. NBAJOBS.NBREARN)
       global.go_to_item      = form_name.item_name    (eg. NBAJOBS.NBREARN_EARN_CODE)

   If the go_to_block is null, then just a next block will be performed.  If the 
   go_to_item is null, then the user will just be navigated to the go_to_block.        </multilinecomment>


BEGIN
  IF NVL(NAME_IN('GLOBAL.FORM_WAS_CALLED'),'N') = 'Y' THEN
         IF NVL(SUBSTR(NAME_IN('GLOBAL.GO_TO_BLOCK'),1,7),'XXX') = NAME_IN('SYSTEM.CURRENT_FORM') THEN
             GO_BLOCK(SUBSTR(NAME_IN('GLOBAL.GO_TO_BLOCK'),9));
             G$_CHECK_FAILURE;
             IF NVL(SUBSTR(NAME_IN('GLOBAL.GO_TO_ITEM'),1,7),'XXX') = NAME_IN('SYSTEM.CURRENT_FORM') THEN
                 GO_ITEM(SUBSTR(NAME_IN('GLOBAL.GO_TO_ITEM'),9));
                 G$_CHECK_FAILURE;
             END IF;
         ELSE
             DO_KEY('NEXT_BLOCK');
             G$_CHECK_FAILURE;
         END IF;
  END IF;

  COPY('N','GLOBAL.FORM_WAS_CALLED');  
  COPY('','GLOBAL.GO_TO_BLOCK');
  COPY('','GLOBAL.GO_TO_ITEM');

END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void nCalledFormNavigate()
		{

			if ( isNull(getNameIn("GLOBAL.FORM_WAS_CALLED"), "N").equals("Y") )
			{
				if ( isNull(substring(getNameIn("GLOBAL.GO_TO_BLOCK"), toInt(1), toInt(7)), "XXX").equals(getCurrentTaskName()) )
				{
					goBlock(substring(getNameIn("GLOBAL.GO_TO_BLOCK"), toInt(9)));
					getGoqrpls().gCheckFailure();
					if ( isNull(substring(getNameIn("GLOBAL.GO_TO_ITEM"), toInt(1), toInt(7)), "XXX").equals(getCurrentTaskName()) )
					{
						goItem(substring(getNameIn("GLOBAL.GO_TO_ITEM"), toInt(9)));
						getGoqrpls().gCheckFailure();
					}
				}
				else {
					executeAction("NEXT_BLOCK");
					getGoqrpls().gCheckFailure();
				}
			}
			copy("N","GLOBAL.FORM_WAS_CALLED");
			copy("","GLOBAL.GO_TO_BLOCK");
			copy("","GLOBAL.GO_TO_ITEM");

		}

	//Original PL/SQL code for Prog Unit NOQLPLS.G$_SECURED_FORM_CALL_PL
	/*
	PROCEDURE G$_SECURED_FORM_CALL_PL
                ( USER_IN        IN VARCHAR2,
                  FORM_NAME_IN   IN VARCHAR2,
                  PARM_LIST_IN   IN PARAMLIST,
                  MODE_IN        IN VARCHAR2 := NULL) IS

--  Code modified by the Forms Migration Assistant
--  02-Feb-2004 11:13 AM

<multilinecomment> 
This Procedure will replace Form GUQSECR which had been called to do secured 
form calls.  Invoke this procedure with <user> or global.current_user and <form> 
or global.secrfrm.  Optionally enter a parameter list name as the third 
arguement and <mode> or NULL as the fourth argument.  If you do not want a
parameter list, use NULL as the third parameter.  The mode is to control
how the form is called.  The default mode (null) is NO_QUERY and NO_HIDE.  
Valid modes are NEW, NEW_QUERY, QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE, and NOHIDE.
IE:
   G$_SECURED_FORM_CALL_PL('CIMSUSR','CBAACCD',NULL);
     OR  
   G$_SECURED_FORM_CALL_PL(global.current_user,global.secrfrm,'');
     OR
   G$_SECURED_FORM_CALL_PL(GET_APPLICATION_PROPERTY(USERNAME), :FN, :PL, 'HIDE');


AUDIT TRAIL: 2.1.5
1. Modified to include new security logic.  This included adding an
   optional fourth parameter which would control how the form is being
   called.  This parameter is defaulted to null so existing calls would
   continue to work without modification.

AUDIT TRAIL: 4.0
1. SJQ 03/18/98
   Modified to include all of the updates to the G$_SECURED_FORM_CALL and to
   not use the parameter list ID but rather just the value passed in.  This 
   routine is now called by the G$_SECURED_FORM_CALL routine using a NULL 
   parameter list.
AUDIT TRAIL END
</multilinecomment>
--
  CUR_OPEN_FORMS VARCHAR2(200);
  HOLD_MODE      VARCHAR2(30);
  HOLD_OBJECT    VARCHAR2(30) := FORM_NAME_IN;
  HOLD_ROLE      VARCHAR2(30);
  HOLD_USER      VARCHAR2(30) := USER_IN;
  INIT_FORM      VARCHAR2(30);
  INIT_GLOBAL    VARCHAR2(30);
  INIT_VALUE     VARCHAR2(30);
--
  MAX_FORMS      INTEGER;
  CUR_FORMS      INTEGER;
--
  FORM_ID        FORMMODULE;
--
BEGIN
  G$_TRACE_PKG.TRACE_RTN('G$_SECURED_FORM_CALL_PL BEGIN');
--
-- Check whether or not a maximum number of open forms has
-- been set and if so, has the user reached the limit.
--
  MAX_FORMS := TO_NUMBER(NVL(NAME_IN('GLOBAL.MAX_NO_FORMS'),0));
  CUR_FORMS := TO_NUMBER(NVL(NAME_IN('GLOBAL.CURR_NO_FORMS'),0));
  CUR_OPEN_FORMS := NAME_IN('GLOBAL.CURR_OPEN_FORMS');
--
  IF MAX_FORMS > 0 THEN
    IF CUR_FORMS + 1 > MAX_FORMS THEN
      MESSAGE( G$_NLS.Get('NOQLPLS-0000', 'LIB',
	'Organization''s maximum number (%01%) of current open forms has been reached.'   
              
               
	,  TO_CHAR(CUR_FORMS) ));
      MESSAGE( G$_NLS.Get('NOQLPLS-0001', 'LIB',
	'Current open forms: %01%'  
	,  CUR_OPEN_FORMS),ACKNOWLEDGE);
      EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
      G$_CHECK_FAILURE;
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  FORM_ID := FIND_FORM(NAME_IN('SYSTEM.CURRENT_FORM'));
  COPY('Y','GLOBAL.CALLED_FORM_' || TO_CHAR(FORM_ID.ID));
--
-- Check whether or not the initialization form for the requested
-- form has been run.  If not, build name and issue call before 
-- any other processing.
--
  IF NVL(LENGTH(FORM_NAME_IN), 0) = 7 THEN
    IF SUBSTR(FORM_NAME_IN,1,1) = 'V' THEN
      INIT_VALUE  := SUBSTR(FORM_NAME_IN,2,1);
    ELSE
      INIT_VALUE  := SUBSTR(FORM_NAME_IN,1,1);
    END IF;
  ELSE
    IF SUBSTR(FORM_NAME_IN,1,1) = 'V' THEN
      INIT_VALUE  := SUBSTR(FORM_NAME_IN,2,2);
    ELSE
      INIT_VALUE  := SUBSTR(FORM_NAME_IN,1,2);
    END IF;
  END IF;
--
  INIT_GLOBAL := 'GLOBAL.INIT' || INIT_VALUE;
  INIT_FORM   := INIT_VALUE || 'OQMENU';
  DEFAULT_VALUE('N','GLOBAL.INIT' || INIT_VALUE);
--
  IF NVL(NAME_IN(INIT_GLOBAL),'N') <> 'Y' THEN
    IF INSTR(FORM_NAME_IN,'OQMENU') = 0 THEN
      COPY('Y', INIT_GLOBAL);
      CALL_FORM(INIT_FORM,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN); 
      COPY('Y', INIT_GLOBAL);
--
      COPY('','GLOBAL.WIN_TITLE');
      COPY('','GLOBAL.WIN_X_POS');
      COPY('','GLOBAL.WIN_Y_POX');
    END IF;
  END IF;
--
-- New stuff to support call query mode.
--
  HOLD_MODE := MODE_IN;
  IF G$_SECURITY.G$_GET_PROFILE_INFO_FNC('CALL_QUERY') = 'Y' THEN
    IF HOLD_MODE IS NULL OR SUBSTR(HOLD_MODE,1,5) <> 'QUERY' THEN
      HOLD_ROLE := G$_SECURITY.G$_GET_ROLE_FOR_OBJECT_FNC(HOLD_OBJECT,HOLD_USER);
      IF HOLD_ROLE IS NOT NULL AND SUBSTR(HOLD_ROLE,-2,2) = '_Q' THEN
        IF MODE_IN IS NOT NULL THEN
          HOLD_MODE := 'QUERY_' || MODE_IN;
        ELSE
          HOLD_MODE := 'QUERY';
        END IF;
      END IF;
    END IF;
  END IF;
--
-- Call form in the requested or supported manor.
--
-- NEWFORM logic.
--
  IF UPPER(MODE_IN) = 'NEW_QUERY' THEN
    NEW_FORM(FORM_NAME_IN,NO_ROLLBACK,QUERY_ONLY,PARM_LIST_IN); 
  ELSIF UPPER(MODE_IN) = 'NEW' THEN
    NEW_FORM(FORM_NAME_IN,NO_ROLLBACK,NO_QUERY_ONLY,PARM_LIST_IN); 
--
-- CALLFORM query mode.
--
  ELSIF UPPER(HOLD_MODE) = 'QUERY' THEN
    CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
  ELSIF UPPER(HOLD_MODE) = 'QUERY_NOHIDE' THEN
    CALL_FORM(FORM_NAME_IN,NO_HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
  ELSIF UPPER(HOLD_MODE) = 'QUERY_HIDE' THEN
    CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,QUERY_ONLY,PARM_LIST_IN); 
--
-- CALLFORM maintenance mode.
--
  ELSIF UPPER(HOLD_MODE) = 'HIDE' THEN
    CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN);
  ELSIF UPPER(HOLD_MODE) = 'NOHIDE' THEN
    CALL_FORM(FORM_NAME_IN,NO_HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN); 
  ELSE
--
-- Added this logic to fix problem with hide/nohide from the menu since
-- the size of the menu form is different than the other forms.
--
    IF NAME_IN('SYSTEM.CURRENT_FORM') IN ('GUAGMNU','GUIOBJS','GUAPARM') THEN
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN);
    ELSE
      CALL_FORM(FORM_NAME_IN,HIDE,NO_REPLACE,NO_QUERY_ONLY,PARM_LIST_IN);
    END IF;
--
  END IF;
--
-- Test status of call, reset form count and listing and re-establish
-- the previous role.
--
  IF NOT FORM_SUCCESS THEN
    COPY('Y','GLOBAL.SKIP_DECR_CNT');
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
    COPY('N','GLOBAL.SKIP_DECR_CNT');
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
    COPY('Y','GLOBAL.SKIP_DECR_CNT');
    EXECUTE_TRIGGER('G$_VERIFY_ACCESS');
    G$_CHECK_FAILURE;
    COPY('N','GLOBAL.SKIP_DECR_CNT');
    G$_LAST_TEN.LAST_10_UPDATE(FORM_NAME_IN);
  END IF;
--
  G$_TRACE_PKG.TRACE_RTN('G$_SECURED_FORM_CALL_PL END');
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param userIn
		* @param formNameIn
		* @param parmListIn
		*/
		public void gSecuredFormCallPl(NString userIn, NString formNameIn, Hashtable parmListIn) {
			gSecuredFormCallPl(userIn, formNameIn, parmListIn, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param userIn
		* @param formNameIn
		* @param parmListIn
		* @param modeIn
		*/
		public void gSecuredFormCallPl(NString userIn, NString formNameIn, Hashtable parmListIn, NString modeIn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//   Code modified by the Forms Migration Assistant
//			//   02-Feb-2004 11:13 AM
//			// This Procedure will replace Form GUQSECR which had been called to do secured
//			// form calls.  Invoke this procedure with <user> or global.current_user and <form>
//			// or global.secrfrm.  Optionally enter a parameter list name as the third
//			// arguement and <mode> or NULL as the fourth argument.  If you do not want a
//			// parameter list, use NULL as the third parameter.  The mode is to control
//			// how the form is called.  The default mode (null) is NO_QUERY and NO_HIDE.
//			// Valid modes are NEW, NEW_QUERY, QUERY, QUERY_NOHIDE, QUERY_HIDE, HIDE, and NOHIDE.
//			// IE:
//			// G$_SECURED_FORM_CALL_PL('CIMSUSR','CBAACCD',NULL);
//			// OR
//			// G$_SECURED_FORM_CALL_PL(global.current_user,global.secrfrm,'');
//			// OR
//			// G$_SECURED_FORM_CALL_PL(GET_APPLICATION_PROPERTY(USERNAME), :FN, :PL, 'HIDE');
//			// AUDIT TRAIL: 2.1.5
//			// 1. Modified to include new security logic.  This included adding an
//			// optional fourth parameter which would control how the form is being
//			// called.  This parameter is defaulted to null so existing calls would
//			// continue to work without modification.
//			// AUDIT TRAIL: 4.0
//			// 1. SJQ 03/18/98
//			// Modified to include all of the updates to the G$_SECURED_FORM_CALL and to
//			// not use the parameter list ID but rather just the value passed in.  This
//			// routine is now called by the G$_SECURED_FORM_CALL routine using a NULL
//			// parameter list.
//			// AUDIT TRAIL END
//			// 
			NString curOpenForms= NString.getNull();
			NString holdMode= NString.getNull();
			NString holdObject = formNameIn;
			NString holdRole= NString.getNull();
			NString holdUser = userIn;
			NString initForm= NString.getNull();
			NString initGlobal= NString.getNull();
			NString initValue= NString.getNull();
			// 
			NInteger maxForms= NInteger.getNull();
			NInteger curForms= NInteger.getNull();
			// 
			ITask formId= null;
			getGoqrpls().getGTracePkg().traceRtn(toStr("G$_SECURED_FORM_CALL_PL BEGIN"));
			// 
			//  Check whether or not a maximum number of open forms has
			//  been set and if so, has the user reached the limit.
			// 
			maxForms = (toNumber(isNull(getNameIn("GLOBAL.MAX_NO_FORMS"), 0))).toInteger();
			curForms = (toNumber(isNull(getNameIn("GLOBAL.CURR_NO_FORMS"), 0))).toInteger();
			curOpenForms = getNameIn("GLOBAL.CURR_OPEN_FORMS");
			// 
			if ( maxForms.greater(0) )
			{
				if ( curForms.add(1).greater(maxForms) )
				{
					warningMessage(GNls.Fget(toStr("NOQLPLS-0000"), toStr("LIB"), toStr("Organization's maximum number (%01%) of current open forms has been reached."), toChar(curForms)));
					warningMessage(GNls.Fget(toStr("NOQLPLS-0001"), toStr("LIB"), toStr("Current open forms: %01%"), curOpenForms), OutputMessageUserResponse.ACKNOWLEDGE);//SupportClasses.Constants.ACKNOWLEDGE);
					executeAction("G$_VERIFY_ACCESS");
					getGoqrpls().gCheckFailure();
					throw new ApplicationException();
				}
			}
			// 
			formId = findTask(getCurrentTaskName());
			copy("Y",toStr("GLOBAL.CALLED_FORM_").append(toStr(formId.getName())));
			// 
			//  Check whether or not the initialization form for the requested
			//  form has been run.  If not, build name and issue call before 
			//  any other processing.
			// 
			if ( isNull(length(formNameIn), 0).equals(7) )
			{
				if ( substring(formNameIn, toInt(1), toInt(1)).equals("V") )
				{
					initValue = substring(formNameIn, toInt(2), toInt(1));
				}
				else {
					initValue = substring(formNameIn, toInt(1), toInt(1));
				}
			}
			else {
				if ( substring(formNameIn, toInt(1), toInt(1)).equals("V") )
				{
					initValue = substring(formNameIn, toInt(2), toInt(2));
				}
				else {
					initValue = substring(formNameIn, toInt(1), toInt(2));
				}
			}
			// 
			initGlobal = toStr("GLOBAL.INIT").append(initValue);
			initForm = initValue.append("OQMENU");
			setDefaultValue("N", toStr("GLOBAL.INIT").append(initValue));
			// 
			if ( isNull(getNameIn(initGlobal), "N").notEquals("Y") )
			{
				if ( inStr(formNameIn, toStr("OQMENU")).equals(0) )
				{
					copy("Y",initGlobal);
					callTask(initForm, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
					copy("Y",initGlobal);
					// 
					copy("","GLOBAL.WIN_TITLE");
					copy("","GLOBAL.WIN_X_POS");
					copy("","GLOBAL.WIN_Y_POX");
				}
			}
			// 
			//  New stuff to support call query mode.
			// 
			holdMode = modeIn;
			if ( GSecurity.FgGetProfileInfoFnc(toStr("CALL_QUERY")).equals("Y") )
			{
				if ( holdMode.isNull() || substring(holdMode, toInt(1), toInt(5)).notEquals("QUERY") )
				{
					holdRole = GSecurity.FgGetRoleForObjectFnc(holdObject, holdUser);
					if ( !holdRole.isNull() && substring(holdRole, - (2), toInt(2)).equals("_Q") )
					{
						if ( !modeIn.isNull() )
						{
							holdMode = toStr("QUERY_").append(modeIn);
						}
						else {
							holdMode = toStr("QUERY");
						}
					}
				}
			}
			// 
			//  Call form in the requested or supported manor.
			// 
			//  NEWFORM logic.
			// 
			if ( upper(modeIn).equals("NEW_QUERY") )
			{
				newTask(formNameIn, TaskServices.NO_ROLLBACK, TaskServices.QUERY_ONLY, parmListIn);
			}
			else if ( upper(modeIn).equals("NEW") ) {
				newTask(formNameIn, TaskServices.NO_ROLLBACK, TaskServices.NO_QUERY_ONLY, parmListIn);
			}
			else if ( upper(holdMode).equals("QUERY") ) {
				callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
			}
			else if ( upper(holdMode).equals("QUERY_NOHIDE") ) {
				callTask(formNameIn, TaskServices.NO_HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
			}
			else if ( upper(holdMode).equals("QUERY_HIDE") ) {
				callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.QUERY_ONLY, parmListIn);
			}
			else if ( upper(holdMode).equals("HIDE") ) {
				callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
			}
			else if ( upper(holdMode).equals("NOHIDE") ) {
				callTask(formNameIn, TaskServices.NO_HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
			}
			else {
				// 
				//  Added this logic to fix problem with hide/nohide from the menu since
				//  the size of the menu form is different than the other forms.
				// 
				if ( in(getCurrentTaskName(), "GUAGMNU", "GUIOBJS", "GUAPARM").getValue() )
				{
					callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
				}
				else {
					callTask(formNameIn, TaskServices.HIDE, TaskServices.NO_REPLACE, TaskServices.NO_QUERY_ONLY, parmListIn);
				}
			}
			// 
			//  Test status of call, reset form count and listing and re-establish
			//  the previous role.
			//
			//MORPHIS TODO TPaixao Below code not supported
//			if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				copy("Y","GLOBAL.SKIP_DECR_CNT");
//				executeAction("G$_VERIFY_ACCESS");
//				getGoqrpls().gCheckFailure();
//				copy("N","GLOBAL.SKIP_DECR_CNT");
//				throw new ApplicationException();
//			}
//			else {
				copy("Y","GLOBAL.SKIP_DECR_CNT");
				executeAction("G$_VERIFY_ACCESS");
				getGoqrpls().gCheckFailure();
				copy("N","GLOBAL.SKIP_DECR_CNT");
				getGoqrpls().getGLastTen().last10Update(formNameIn);
//			}
			// 
			getGoqrpls().getGTracePkg().traceRtn(toStr("G$_SECURED_FORM_CALL_PL END"));
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
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

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : NOQLPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Mar 07 12:51:34 2012
-- MSGSIGN : #aa288c26f61b522a
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailMsgkeyUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_8_7_1
	/*
	PROCEDURE AUDIT_TRAIL_8_7_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.7.1                                 
1. RPE # 1-1396BS5                        LN 03/05/2012
   IPEDS 2012-2013 Enhancements.
   Added two program units POPULATE_PTRESOC_RG and POPULATE_PTVECIP_RG.
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
		public void auditTrail871()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail871 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_8_3
	/*
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment> AUDIT TRAIL: 8.3                                 
 1. Defect # 1-66V647                                     BG  27/07/2009
    Problem: Missing G$_NLS.Get function call for the messages. 
    Functional Impact: The error messages are now translated to meet the 
      internationalization standards.
    Technical Fix: Added G$_NLS.Get function call for the messages in 
      the Procudures POPULATE_NTQAGID_RG, POPULATE_NTQAGRP_RG, POPULATE_NTQSALA_RG,
      POPULATE_FTVOBPH_RG, POPULATE_NTQACLV_RG, POPULATE_NTQROUT_RG.

AUDIT TRAIL END </multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail83 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_8_2
	/*
	PROCEDURE audit_trail_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. RPE# 1-4ANW7Z - Expose I8N Fields.                     LN 04/16/2009
   POPULATE_NTQROUT_RG and POPULATE_NTQAGID_RG are updated to call f_format_name.
   POPULATE_NTQROUT_RG is called by noapeaf's field User ID in Routing tabpage.
   POPULATE_NTQAGID_RG is called by noaogrp's field Copy from User Name.
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
		public void auditTrail82()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail82 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_8_1
	/*
	PROCEDURE audit_trail_8_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.1
1. ISC Defect# 1-3MLX83                              LN 07-25-2008
   Changed the second parameter of message 'NOAEPAF-1398', 'FORM',
   '*WARNING* No records found.'Ã¢â‚¬Â� from FORM to LIB.
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
		public void auditTrail81()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail81 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0

1. MS  10/01/2007
   Release number updated per minimal inclusion in release.
   
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
		public void auditTrail80()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_7_3
	/*
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment>
AUDIT TRAIL: 7.3
1. RPE #1-52TAG                                       SL 07-MAR-2006
   Problem: Address/telephone set up through epaf processing requires to
     set up GTVSDAX which may not represent users' actual needs.  Also, address 
     sqno and telephone seqno are needed to be determined by users which makes 
     processing compilicated.
   Functional Impact:  Users will have options to choose their processing needs
     on address and telephone information upon creating of epafs.
   Techinical Fix:  Added SPRTELE_LOV, SPRTELE_RG into noqlibr, and 
     POPULATE_STRTELE_RG routine into noqlpls library to provide telephone Lov.
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
		public void auditTrail73()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail73 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_7_2
	/*
	PROCEDURE AUDIT_TRAIL_7_2 IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail72 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_7_0_NOQLPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_NOQLPLS IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/20/2003
   Converted to Forms9i
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
		public void auditTrail70Noqlpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Noqlpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL 7.0

1. Changes Migrated to Release 7.0			LR 01/26/2004
    Defect 62951 Release 6.1
    RPE 34834 Release 6.0.0.1
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

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_6_1
	/*
	PROCEDURE AUDIT_TRAIL_6_1 IS
<multilinecomment>
AUDIT TRAIL: 6.1
1. Defect 62951                     LR 09/05/2003
Add new procedure POPULATE_JOBS_EFF_DATE_RG.  
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
		public void auditTrail61()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail61 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_6_0_0_1
	/*
	PROCEDURE AUDIT_TRAIL_6_0_0_1 IS
<multilinecomment>
AUDIT TRAIL: 6.0.0.1

1. CA MIS Regulatory Updates- RPE 34834              MT 10/09/03

   Problem : Add a new column ptrjbln_dicd_code to the populate record group routine.
   Functional Impact : DICD Code can be seen in the LOV
   Technical Fix : The routine populate_ptqjbln_rg has been modified to include the he 
   column PTRJBLN_DICD_CODE.
   
AUDIT TRAIL END.   
</multilinecomment>


BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail6001()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail6001 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. RPE #1341                      LR 26-SEP-2002
   Created new procedures POPULATE_PTQECLC_RG 
2. RPE # 246											DS 19-NOV-2002
   Created new procedure POPULATE_NTVJOBP_RG.

3. Defect 79222, LN 31-Dec-2002
   Problem:
     When a PAF transaction is voided, the Routing Queue status is updated 
     but the Activity Date is not updated.   
   Functional Impact:
     When updating the routing records (NORROUT), the Activity Date will be
     updated to the current date.   
   Technical Fix:
     Modified procedure N$_EA_APPROVAL_ACTION:
     - For all UPDATE NORROUT statements, set the Activity Date to SYSDATE.
     
4. One-Time Payments Enhancement.                  LR 04-FEB-2003
   Changed POPULATE_PTVJCRE_RG program unit.
   Now information selected from PTRJCRE table instead of PTVJCRE.
   
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
		public void auditTrail60()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail60 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_5_3_1
	/*
	PROCEDURE AUDIT_TRAIL_5_3_1 IS
<multilinecomment>
AUDIT TRAIL: 5.3.1
1. Defect #73477                       MK  28-MAY-2002
   Created new procedures POPULATE_PTVNRSI_RG, 
   POPULATE_PTQBCAT_RG, POPULATE_PTVLCAT_RG,
   POPULATE_PTQWKPR_RG, POPULATE_PTVEGRP_RG,
   and POPULATE_PTVSTGR_RG
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
		public void auditTrail531()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail531 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_5_3
	/*
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>
AUDIT TRAIL: 5.3
1. New Enhancement for Probation and Labor Contract by Job.    			MS 08/15/2001
   Created a new procedure POPULATE_PTVBARG_RG.
2. Defect #72003			                                      VR    07-JAN_2002
   Created a new procedure POPULATE_NBAJOBS_RG. 
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
		public void auditTrail53()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail53 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_5_0_NOQLPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_NOQLPLS IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. 08/30/2000 TGKinderman
   Oracle*Developer6.x conversion.
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
		public void auditTrail50Noqlpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50Noqlpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_5_0
	/*
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. Removed N$_EA_APPROVALS_MSG and N$_EA_APPROVALS_MSG_HR procedures
   from this library and moved locally into poqmenu and noqmenu form.
   
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

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_4_2_1
	/*
	PROCEDURE AUDIT_TRAIL_4_2_1 IS
<multilinecomment>
AUDIT TRAIL: 4.2.1
1. RPE#5728			          JZ 07-JUL-2000
   Add one new function N$EA_ALT_LOGON_WIN_IND for EA
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
		public void auditTrail421()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail421 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_4_2
	/*
	PROCEDURE AUDIT_TRAIL_4_2 IS
<multilinecomment>
AUDIT TRAIL: 4.2
1. Web Time Entry Enhancement.          AP 19-JAN-2000
   Functional Impact - The messaging for the electronic approvals will
                       indicate if the user has time sheets to approve.
   Technical Modification - Modified the  N$_EA_APPROVALS_MSG procedure.
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
		public void auditTrail42()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail42 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_4_1
	/*
	PROCEDURE AUDIT_TRAIL_4_1 IS
<multilinecomment>
AUDIT TRAIL: 4.1
1. GOAEACC vs. GUAIDEN                                    SL  08/26/99
   Problem - GUAIDEN form will not be used.  Instead GOAEACC form will be used.
   Functional Impact - Now user gets user id from GOAEACC form or gobeacc table.
   Technical Fix - Modified populate_ntqlvid_rg and populate_ntqlvid_rg.

2. Workflow modification                                  VR 10/07/99
   Problem - Forms with out key_block are not passing the context parameters.
   Functional Impact - Now the user will be able to pass the context parameters.
   Technical fix -- Modified the  N$_EA_APPROVALS_MSG added this three lines before 
                    the execution of alert messages
                    IF G$_WF_CONDITIONS.IS_WF_PASSTHROUGH_FORM THEN
                    G$_WF_SET_FOCUS.SET_FOCUS;
                    END IF;
                    Also attached the GOQWFLW library.
                    
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
		public void auditTrail41()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail41 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.Defect # 10472          LR 19-OCT-1998
  Problem - N$_EA_APPROVAL_ACTION is too large for 16-bit vertion of 
            oracle forms.
  Funaction Impact - Now user can compile library on 16-bit versions of oracle forms.
  Technical Fix - Convert pll to pld and pld to pll.
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
		public void auditTrail40()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL_3_1
	/*
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>
AUDIT TRAIL: 3.1
1. Year 2000 compliance                     SL   27-FEB-1998
     N$_EA_APPROVAL_ACTION routine modified.  '||G$_DATE.GET_NLS_DATE_FORMAT||' date
     format into '||G$_DATE.GET_NLS_DATE_FORMAT||'.
2. Year 2000 compliance                     SL   28-APR-1998
     All of date column selected has been formatted to 
     '||G$_DATE.GET_NLS_DATE_FORMAT||'.
3. Contact# 2192779                         SL   15-MAY-1998
   Problem: I completed the key information on this form 
     and then clicked into the data entry area to complete 
     the paf.  I am taken completely out of the form to the 
     menu and then the GUAUIPW - Alternate Password form is 
     presented to me.  I should not leave the paf form.-LS
  Tech.Fix: General changed its library procedure parameter 
     which caused the alternate logon screen to come up 
     differently.  Our library noqlpls.pll routine, 
     N$_verify_password, modified to reflect the general 
     change.  G$_SECURED_FORM_CALL procedure parameter HIDE
     is changed to NO_HIDE.
4. Populate statement added                 SL    15-MAY-1998
   Populate_PTQEARN_RG is added from NTRAPTY.
5. Contact #2201165                         SL    10-JUL-1998
   Problem: Users cannot read complete error message in auto
     help line.
   Tech. Fix: N$_EA_APPROVALS_APPLY program unit modified to
     reword the error message to fit into the help line.

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
		public void auditTrail31()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail31 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQLPLS.AUDIT_TRAIL
	/*
	PROCEDURE AUDIT_TRAIL IS
BEGIN
<multilinecomment>
AUDIT TRAIL: 2.1.11
1. Created for Forms 4.5 version.           JW  09-23-96
2. Problem - The Alternate login permits user to continue when       MW  09-24-96
     '*ERROR* Cannot modify user id, access denied.'  The procedure
     was not setting the GLOBAL.ALT_PASSWORD to NULL when an error
     is encountered.
   Technical Fix - Modified the N$_VERIFY_PASSWORD procedure to set
     the GLOBAL.ALT_PASSWORD to NULL after encountering the following
     two errors, '*ERROR* Cannot modify user id, access denied.' and
     '*ERROR* Valid alternate user id/password not entered, access denied.'
     Removed the NAME_IN and the open and close parenthesis around
     'GLOBAL.ALT_PASSWORD' in each of the COPY commands.
3. Problem - The Alternate login was defaulting 'USER' instead of    MW  09-24-96
     the oracle user id for the Alternate User Id item.
   Technical Fix - Modified the N$_VERIFY_PASSWORD procedure by
     removing the single quotes around 'USER' in the COPY command that
     copies the oracle user id into GLOBAL.ALT_USER_ID.
4. Problem - The N$_EA_EDIT_APPROVALS_APPLY program unit was had a   JW  10-09-96
     COPY function that needed a NAME_IN function.
   Solution - The NAME_IN function was added to the 
     N$_EA_EDIT _APPROVALS_APPLY program unit.
5. Created package NOKBDPL for creating dynamic record group         AS  11-20-96
6.  Removed package NOKBDPL                                         AS 03-10-97
AUDIT TRAIL END
</multilinecomment>
null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// AUDIT TRAIL: 2.1.11
//			// 1. Created for Forms 4.5 version.           JW  09-23-96
//			// 2. Problem - The Alternate login permits user to continue when       MW  09-24-96
//			// '*ERROR* Cannot modify user id, access denied.'  The procedure
//			// was not setting the GLOBAL.ALT_PASSWORD to NULL when an error
//			// is encountered.
//			// Technical Fix - Modified the N$_VERIFY_PASSWORD procedure to set
//			// the GLOBAL.ALT_PASSWORD to NULL after encountering the following
//			// two errors, '*ERROR* Cannot modify user id, access denied.' and
//			// '*ERROR* Valid alternate user id/password not entered, access denied.'
//			// Removed the NAME_IN and the open and close parenthesis around
//			// 'GLOBAL.ALT_PASSWORD' in each of the COPY commands.
//			// 3. Problem - The Alternate login was defaulting 'USER' instead of    MW  09-24-96
//			// the oracle user id for the Alternate User Id item.
//			// Technical Fix - Modified the N$_VERIFY_PASSWORD procedure by
//			// removing the single quotes around 'USER' in the COPY command that
//			// copies the oracle user id into GLOBAL.ALT_USER_ID.
//			// 4. Problem - The N$_EA_EDIT_APPROVALS_APPLY program unit was had a   JW  10-09-96
//			// COPY function that needed a NAME_IN function.
//			// Solution - The NAME_IN function was added to the
//			// N$_EA_EDIT _APPROVALS_APPLY program unit.
//			// 5. Created package NOKBDPL for creating dynamic record group         AS  11-20-96
//			// 6.  Removed package NOKBDPL                                         AS 03-10-97
//			// AUDIT TRAIL END
//
			this.getLogger().trace(this, "F2J : auditTrail procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
