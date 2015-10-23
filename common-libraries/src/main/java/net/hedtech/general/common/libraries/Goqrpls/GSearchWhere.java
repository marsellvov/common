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

public class GSearchWhere extends AbstractSupportCodeObject {
	

	public GSearchWhere(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_SEARCH_WHERE
	/*
	PACKAGE G$_SEARCH_WHERE IS
--
  FUNCTION F_FTVACCI_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVACCI_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- 
  FUNCTION F_FTVACCT_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2)RETURN VARCHAR2;
  FUNCTION F_FTVACCT_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVACTV_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVACTV_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVCOAS_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVCOAS_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVFUND_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVFUND_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVLOCN_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVLOCN_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVORGN_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVORGN_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVPROG_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVPROG_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_FTVPROJ_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_FTVPROJ_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_GXVBANK_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_GXVBANK_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
  FUNCTION F_GTVCURR_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
  FUNCTION F_GTVCURR_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
--
END G$_SEARCH_WHERE;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_SEARCH_WHERE
		/*
		PACKAGE BODY G$_SEARCH_WHERE IS
-- 
-- Package Author: Robert D. Rullo
-- Date: 10/22/98
--
-- Since a majority of our forms use more than just a code field as the primary key 
-- for our tables a where clause must be applied to the Code/Description fields in  
-- G$_SEARCH_PARAMETERS.  With this methodology we could have simply stated: "cut and 
-- paste the core where clause from the POST-CHANGE and WHEN-VALIDATE-ITEM into the 
-- 3rd parameter of the G$_SEARCH_PARAMETERS procedure."  This would have created a 
-- lot of redundant logic.  For this reason, G$_SEARCH_WHERE was created to add some 
-- objectivity in the passing of the where parameter.
-- 
   FUNCTION F_FTVACCI_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVACCI_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACCI_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACCI_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVACCI_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVACCI_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACCI_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACCI_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVACCI_TERM_DATE IS NULL'||
                ' OR FTVACCI_TERM_DATE > '||DATE_CODE||')');
      END;
--
--
   FUNCTION F_FTVACCT_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN 
         RETURN('WHERE UPPER(FTVACCT_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACCT_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACCT_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVACCT_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVACCT_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACCT_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACCT_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVACCT_TERM_DATE > '||DATE_CODE||
                ' OR FTVACCT_TERM_DATE IS NULL)');
      END;
--
--
   FUNCTION F_FTVACTV_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVACTV_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACTV_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACTV_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVACTV_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVACTV_COAS_CODE) = '||COAS_CODE||
                ' AND FTVACTV_EFF_DATE <= '||DATE_CODE||
                ' AND FTVACTV_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVACTV_TERM_DATE > '||DATE_CODE||
                ' OR FTVACTV_TERM_DATE IS NULL)');
      END;
--
--
   FUNCTION F_FTVCOAS_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVCOAS_EFF_DATE <= '||DATE_CODE||
                ' AND FTVCOAS_NCHG_DATE > '||DATE_CODE); 
      END;
--
   FUNCTION F_FTVCOAS_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVCOAS_EFF_DATE <= '||DATE_CODE||
                ' AND FTVCOAS_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVCOAS_TERM_DATE > '||DATE_CODE||
                ' OR FTVCOAS_TERM_DATE IS NULL)');
      END;
--
--
   FUNCTION F_FTVFUND_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVFUND_COAS_CODE) = '||COAS_CODE||
                ' AND FTVFUND_EFF_DATE <= '||DATE_CODE||
                ' AND FTVFUND_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVFUND_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVFUND_COAS_CODE) = '||COAS_CODE||
                ' AND FTVFUND_EFF_DATE <= '||DATE_CODE||
                ' AND FTVFUND_NCHG_DATE > '||DATE_CODE||
                ' AND ((FTVFUND_TERM_DATE IS NULL'||
                ' OR FTVFUND_TERM_DATE >= '||DATE_CODE||')'||
                ' OR (FTVFUND_TERM_DATE < '||DATE_CODE||
                ' AND FTVFUND_EXPEND_END_DATE >= '||DATE_CODE||
                ' AND FTVFUND_EXPEND_END_DATE IS NOT NULL'||
                ' AND :GLOBAL.EXP_END_POST_AUTH_IND = ''Y''))');
      END;
--
--
   FUNCTION F_FTVLOCN_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVLOCN_COAS_CODE) = '||COAS_CODE||
                ' AND FTVLOCN_EFF_DATE <= '||DATE_CODE||
                ' AND FTVLOCN_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVLOCN_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVLOCN_EFF_DATE <= '||DATE_CODE||
                ' AND FTVLOCN_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVLOCN_TERM_DATE > '||DATE_CODE||
                ' OR FTVLOCN_TERM_DATE IS NULL)'||
                ' AND UPPER(FTVLOCN_COAS_CODE) = '||COAS_CODE);
      END;
--
--
   FUNCTION F_FTVORGN_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVORGN_COAS_CODE) = '||COAS_CODE||
                ' AND FTVORGN_EFF_DATE <= '||DATE_CODE||
                ' AND FTVORGN_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVORGN_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVORGN_EFF_DATE <= '||DATE_CODE||
                ' AND FTVORGN_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVORGN_TERM_DATE > '||DATE_CODE||
                ' OR FTVORGN_TERM_DATE IS NULL)'||
                ' AND UPPER(FTVORGN_COAS_CODE) = '||COAS_CODE);
      END;
--
--
   FUNCTION F_FTVPROG_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE UPPER(FTVPROG_COAS_CODE) = '||COAS_CODE||
                ' AND FTVPROG_EFF_DATE <= '||DATE_CODE||
                ' AND FTVPROG_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVPROG_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVPROG_COAS_CODE) = '||COAS_CODE||
                ' AND FTVPROG_EFF_DATE <= '||DATE_CODE||
                ' AND FTVPROG_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVPROG_TERM_DATE > '||DATE_CODE||
                ' OR FTVPROG_TERM_DATE IS NULL)');
      END;
--
--
   FUNCTION F_FTVPROJ_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVPROJ_COAS_CODE) = '||COAS_CODE||
                ' AND FTVPROJ_EFF_DATE <= '||DATE_CODE);
      END;
--
   FUNCTION F_FTVPROJ_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVPROJ_COAS_CODE) = '||COAS_CODE||
                ' AND FTVPROJ_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVPROJ_TERM_DATE > '||DATE_CODE||
                ' OR FTVPROJ_TERM_DATE IS NULL)');
      END;
--
--
   FUNCTION F_GXVBANK_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE GXVBANK_EFF_DATE <= '||DATE_CODE||
                ' AND (GXVBANK_NCHG_DATE IS NULL'||
                ' OR GXVBANK_NCHG_DATE > '||DATE_CODE||')');
      END;
--
   FUNCTION F_GXVBANK_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE GXVBANK_EFF_DATE <= '||DATE_CODE||
                ' AND (GXVBANK_NCHG_DATE IS NULL'||
                ' OR GXVBANK_NCHG_DATE > '||DATE_CODE||')'||
                ' AND (GXVBANK_TERM_DATE IS NULL'||
                ' OR GXVBANK_TERM_DATE > '||DATE_CODE||')');
      END;
--
--
   FUNCTION F_GTVCURR_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE GTVCURR_RATE_EFF_DATE <= '||DATE_CODE||
                ' AND (GTVCURR_RATE_NCHG_DATE > '||DATE_CODE||
                ' OR  GTVCURR_RATE_NCHG_DATE IS NULL)'||
                ' AND  UPPER(GTVCURR_STATUS_IND) = ''A''');
      END;
--
   FUNCTION F_GTVCURR_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN   
         RETURN('WHERE GTVCURR_RATE_EFF_DATE <= '||DATE_CODE||
                ' AND (GTVCURR_RATE_TERM_DATE > '||DATE_CODE||
                ' OR  GTVCURR_RATE_TERM_DATE IS NULL)'||
                ' AND (GTVCURR_RATE_NCHG_DATE > '||DATE_CODE||
                ' OR  GTVCURR_RATE_NCHG_DATE IS NULL)'||
                ' AND  UPPER(GTVCURR_STATUS_IND) = ''A''');
      END;
--
END G$_SEARCH_WHERE;
		*/
		/* <p>
		*  
		*  Package Author: Robert D. Rullo
		*  Date: 10/22/98
		* 
		*  Since a majority of our forms use more than just a code field as the primary key 
		*  for our tables a where clause must be applied to the Code/Description fields in  
		*  G$_SEARCH_PARAMETERS.  With this methodology we could have simply stated: "cut and 
		*  paste the core where clause from the POST-CHANGE and WHEN-VALIDATE-ITEM into the 
		*  3rd parameter of the G$_SEARCH_PARAMETERS procedure."  This would have created a 
		*  lot of redundant logic.  For this reason, G$_SEARCH_WHERE was created to add some 
		*  objectivity in the passing of the where parameter.
		*  
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvacciKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACCI_COAS_CODE) = ").append(coasCode).append(" AND FTVACCI_EFF_DATE <= ").append(dateCode).append(" AND FTVACCI_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvacciEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACCI_COAS_CODE) = ").append(coasCode).append(" AND FTVACCI_EFF_DATE <= ").append(dateCode).append(" AND FTVACCI_NCHG_DATE > ").append(dateCode).append(" AND (FTVACCI_TERM_DATE IS NULL").append(" OR FTVACCI_TERM_DATE > ").append(dateCode).append(")")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvacctKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACCT_COAS_CODE) = ").append(coasCode).append(" AND FTVACCT_EFF_DATE <= ").append(dateCode).append(" AND FTVACCT_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvacctEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACCT_COAS_CODE) = ").append(coasCode).append(" AND FTVACCT_EFF_DATE <= ").append(dateCode).append(" AND FTVACCT_NCHG_DATE > ").append(dateCode).append(" AND (FTVACCT_TERM_DATE > ").append(dateCode).append(" OR FTVACCT_TERM_DATE IS NULL)")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvactvKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACTV_COAS_CODE) = ").append(coasCode).append(" AND FTVACTV_EFF_DATE <= ").append(dateCode).append(" AND FTVACTV_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvactvEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVACTV_COAS_CODE) = ").append(coasCode).append(" AND FTVACTV_EFF_DATE <= ").append(dateCode).append(" AND FTVACTV_NCHG_DATE > ").append(dateCode).append(" AND (FTVACTV_TERM_DATE > ").append(dateCode).append(" OR FTVACTV_TERM_DATE IS NULL)")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvcoasKey(NString dateCode)
		{
			return ((toStr("WHERE FTVCOAS_EFF_DATE <= ").append(dateCode).append(" AND FTVCOAS_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvcoasEntry(NString dateCode)
		{
			return ((toStr("WHERE FTVCOAS_EFF_DATE <= ").append(dateCode).append(" AND FTVCOAS_NCHG_DATE > ").append(dateCode).append(" AND (FTVCOAS_TERM_DATE > ").append(dateCode).append(" OR FTVCOAS_TERM_DATE IS NULL)")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvfundKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVFUND_COAS_CODE) = ").append(coasCode).append(" AND FTVFUND_EFF_DATE <= ").append(dateCode).append(" AND FTVFUND_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvfundEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVFUND_COAS_CODE) = ").append(coasCode).append(" AND FTVFUND_EFF_DATE <= ").append(dateCode).append(" AND FTVFUND_NCHG_DATE > ").append(dateCode).append(" AND ((FTVFUND_TERM_DATE IS NULL").append(" OR FTVFUND_TERM_DATE >= ").append(dateCode).append(")").append(" OR (FTVFUND_TERM_DATE < ").append(dateCode).append(" AND FTVFUND_EXPEND_END_DATE >= ").append(dateCode).append(" AND FTVFUND_EXPEND_END_DATE IS NOT NULL").append(" AND :GLOBAL.EXP_END_POST_AUTH_IND = 'Y'))")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvlocnKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVLOCN_COAS_CODE) = ").append(coasCode).append(" AND FTVLOCN_EFF_DATE <= ").append(dateCode).append(" AND FTVLOCN_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvlocnEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE FTVLOCN_EFF_DATE <= ").append(dateCode).append(" AND FTVLOCN_NCHG_DATE > ").append(dateCode).append(" AND (FTVLOCN_TERM_DATE > ").append(dateCode).append(" OR FTVLOCN_TERM_DATE IS NULL)").append(" AND UPPER(FTVLOCN_COAS_CODE) = ").append(coasCode)));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvorgnKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVORGN_COAS_CODE) = ").append(coasCode).append(" AND FTVORGN_EFF_DATE <= ").append(dateCode).append(" AND FTVORGN_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvorgnEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE FTVORGN_EFF_DATE <= ").append(dateCode).append(" AND FTVORGN_NCHG_DATE > ").append(dateCode).append(" AND (FTVORGN_TERM_DATE > ").append(dateCode).append(" OR FTVORGN_TERM_DATE IS NULL)").append(" AND UPPER(FTVORGN_COAS_CODE) = ").append(coasCode)));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvprogKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVPROG_COAS_CODE) = ").append(coasCode).append(" AND FTVPROG_EFF_DATE <= ").append(dateCode).append(" AND FTVPROG_NCHG_DATE > ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvprogEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVPROG_COAS_CODE) = ").append(coasCode).append(" AND FTVPROG_EFF_DATE <= ").append(dateCode).append(" AND FTVPROG_NCHG_DATE > ").append(dateCode).append(" AND (FTVPROG_TERM_DATE > ").append(dateCode).append(" OR FTVPROG_TERM_DATE IS NULL)")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvprojKey(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVPROJ_COAS_CODE) = ").append(coasCode).append(" AND FTVPROJ_EFF_DATE <= ").append(dateCode)));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvprojEntry(NString coasCode, NString dateCode)
		{
			return ((toStr("WHERE UPPER(FTVPROJ_COAS_CODE) = ").append(coasCode).append(" AND FTVPROJ_EFF_DATE <= ").append(dateCode).append(" AND (FTVPROJ_TERM_DATE > ").append(dateCode).append(" OR FTVPROJ_TERM_DATE IS NULL)")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fGxvbankKey(NString dateCode)
		{
			return ((toStr("WHERE GXVBANK_EFF_DATE <= ").append(dateCode).append(" AND (GXVBANK_NCHG_DATE IS NULL").append(" OR GXVBANK_NCHG_DATE > ").append(dateCode).append(")")));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fGxvbankEntry(NString dateCode)
		{
			return ((toStr("WHERE GXVBANK_EFF_DATE <= ").append(dateCode).append(" AND (GXVBANK_NCHG_DATE IS NULL").append(" OR GXVBANK_NCHG_DATE > ").append(dateCode).append(")").append(" AND (GXVBANK_TERM_DATE IS NULL").append(" OR GXVBANK_TERM_DATE > ").append(dateCode).append(")")));
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fGtvcurrKey(NString dateCode)
		{
			return ((toStr("WHERE GTVCURR_RATE_EFF_DATE <= ").append(dateCode).append(" AND (GTVCURR_RATE_NCHG_DATE > ").append(dateCode).append(" OR  GTVCURR_RATE_NCHG_DATE IS NULL)").append(" AND  UPPER(GTVCURR_STATUS_IND) = 'A'")));
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fGtvcurrEntry(NString dateCode)
		{
			return ((toStr("WHERE GTVCURR_RATE_EFF_DATE <= ").append(dateCode).append(" AND (GTVCURR_RATE_TERM_DATE > ").append(dateCode).append(" OR  GTVCURR_RATE_TERM_DATE IS NULL)").append(" AND (GTVCURR_RATE_NCHG_DATE > ").append(dateCode).append(" OR  GTVCURR_RATE_NCHG_DATE IS NULL)").append(" AND  UPPER(GTVCURR_STATUS_IND) = 'A'")));
		}
		
	
	
}
