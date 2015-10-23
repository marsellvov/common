package net.hedtech.general.common.libraries.Foqrpls;

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


public class FSearchWhere extends AbstractSupportCodeObject {
	

	public FSearchWhere(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public FoqrplsServices getContainer() {
		return (FoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) F$_SEARCH_WHERE
	/*
	PACKAGE F$_SEARCH_WHERE IS
-- --
-- --
   FUNCTION F_FTVATYP_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVATYP_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVCRSN_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVCRSN_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVEELC_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVEELC_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVEELI_KEY(COAS_CODE VARCHAR2, EENT_CODE VARCHAR2, EELC_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVEELI_ENTRY(COAS_CODE VARCHAR2, EENT_CODE VARCHAR2, EELC_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVEENT_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVEENT_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVFTYP_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVFTYP_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVRUCL_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVRUCL_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVTGRP_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVTGRP_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVTRAT_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVTRAT_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
   FUNCTION F_FTVUOMS_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
   FUNCTION F_FTVUOMS_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2;
-- --
-- --
END F$_SEARCH_WHERE;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) F$_SEARCH_WHERE
		/*
		PACKAGE BODY F$_SEARCH_WHERE IS
-- --
-- --
   FUNCTION F_FTVATYP_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVATYP_COAS_CODE) = '||COAS_CODE||
                ' AND FTVATYP_EFF_DATE <= '||DATE_CODE||
                ' AND FTVATYP_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVATYP_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVATYP_COAS_CODE) = '||COAS_CODE||
                ' AND FTVATYP_EFF_DATE <= '||DATE_CODE||
                ' AND FTVATYP_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVATYP_TERM_DATE IS NULL'||
                ' OR FTVATYP_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVCRSN_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVCRSN_START_DATE <= '||DATE_CODE);
      END;
--
   FUNCTION F_FTVCRSN_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVCRSN_START_DATE <= '||DATE_CODE||
                ' AND (FTVCRSN_TERM_DATE IS NULL'||
                ' OR FTVCRSN_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVEELC_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVEELC_COAS_CODE) = '||COAS_CODE||
                ' AND FTVEELC_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVEELC_NCHG_DATE IS NULL'||
                ' OR FTVEELC_NCHG_DATE > '||DATE_CODE||')');
      END;
--
   FUNCTION F_FTVEELC_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVEELC_COAS_CODE = '||COAS_CODE||
                ' AND FTVEELC_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVEELC_NCHG_DATE IS NULL'||
                ' OR FTVEELC_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVEELC_TERM_DATE >= '||DATE_CODE||
                ' OR FTVEELC_TERM_DATE IS NULL))');
      END;
-- --
-- --
   FUNCTION F_FTVEELI_KEY(COAS_CODE VARCHAR2, EENT_CODE VARCHAR2, EELC_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVEELI_COAS_CODE) = '||COAS_CODE||
                ' AND  FTVEELI_EENT_CODE = '||EENT_CODE||
                ' AND  FTVEELI_EELC_CODE = '||EELC_CODE||
                ' AND  FTVEELI_EFF_DATE <= '||DATE_CODE||
                ' AND  (FTVEELI_NCHG_DATE IS NULL'||
                ' OR  FTVEELI_NCHG_DATE > '||DATE_CODE||')');
      END;
--
   FUNCTION F_FTVEELI_ENTRY(COAS_CODE VARCHAR2, EENT_CODE VARCHAR2, EELC_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVEELI_COAS_CODE) = '||COAS_CODE||
                ' AND FTVEELI_EENT_CODE = '||EENT_CODE||
                ' AND FTVEELI_EELC_CODE = '||EELC_CODE||
                ' AND FTVEELI_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVEELI_NCHG_DATE IS NULL'||
                ' OR  FTVEELI_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVEELI_TERM_DATE IS NULL'||
                ' OR FTVEELI_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVEENT_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVEENT_COAS_CODE) = '||COAS_CODE||
                ' AND FTVEENT_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVEENT_NCHG_DATE IS NULL'||
                ' OR FTVEENT_NCHG_DATE > '||DATE_CODE||')');
      END;
--
   FUNCTION F_FTVEENT_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVEENT_COAS_CODE) = '||COAS_CODE||
                ' AND FTVEENT_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVEENT_NCHG_DATE IS NULL'||
                ' OR FTVEENT_NCHG_DATE > '||DATE_CODE||')'||
                ' AND (FTVEENT_TERM_DATE >= '||DATE_CODE||
                ' OR FTVEENT_TERM_DATE IS NULL)');
      END;
-- --
-- --
   FUNCTION F_FTVFTYP_KEY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVFTYP_COAS_CODE) = '||COAS_CODE||
                ' AND FTVFTYP_EFF_DATE <= '||DATE_CODE||
                ' AND FTVFTYP_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVFTYP_ENTRY(COAS_CODE VARCHAR2, DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE UPPER(FTVFTYP_COAS_CODE) = '||COAS_CODE||
                ' AND FTVFTYP_EFF_DATE <= '||DATE_CODE||
                ' AND FTVFTYP_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVFTYP_TERM_DATE >= '||DATE_CODE||
                ' OR FTVFTYP_TERM_DATE IS NULL)');
      END;
-- --
-- --
   FUNCTION F_FTVRUCL_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVRUCL_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVRUCL_NCHG_DATE IS NULL'||
                ' OR FTVRUCL_NCHG_DATE > '||DATE_CODE||')');
      END;
-- 
   FUNCTION F_FTVRUCL_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVRUCL_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVRUCL_NCHG_DATE IS NULL'||
                ' OR FTVRUCL_NCHG_DATE > '||DATE_CODE||')'||
                ' AND (FTVRUCL_TERM_DATE IS NULL'||
                ' OR FTVRUCL_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVTGRP_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVTGRP_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVTGRP_NCHG_DATE IS NULL'||
                ' OR FTVTGRP_NCHG_DATE > '||DATE_CODE||')');
      END;
--
   FUNCTION F_FTVTGRP_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVTGRP_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVTGRP_NCHG_DATE IS NULL'||
                ' OR FTVTGRP_NCHG_DATE > '||DATE_CODE||')'||
                ' AND (FTVTGRP_TERM_DATE IS NULL'||
                ' OR FTVTGRP_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVTRAT_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVTRAT_EFF_DATE <= '||DATE_CODE||
                ' AND FTVTRAT_NCHG_DATE > '||DATE_CODE);
      END;
--
   FUNCTION F_FTVTRAT_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVTRAT_EFF_DATE <= '||DATE_CODE||
                ' AND FTVTRAT_NCHG_DATE > '||DATE_CODE||
                ' AND (FTVTRAT_TERM_DATE IS NULL'||
                ' OR FTVTRAT_TERM_DATE > '||DATE_CODE||')');
      END;
-- --
-- --
   FUNCTION F_FTVUOMS_KEY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVUOMS_EFF_DATE <= '||DATE_CODE);
      END;
--
   FUNCTION F_FTVUOMS_ENTRY(DATE_CODE VARCHAR2) RETURN VARCHAR2 IS
      BEGIN
         RETURN('WHERE FTVUOMS_EFF_DATE <= '||DATE_CODE||
                ' AND (FTVUOMS_TERM_DATE > '||DATE_CODE||
                ' OR FTVUOMS_TERM_DATE IS NULL)');
      END;
-- --
-- --

END F$_SEARCH_WHERE;
		*/
		/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvatypKey(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVATYP_COAS_CODE) = ").append(coasCode).append(" AND FTVATYP_EFF_DATE <= ").append(dateCode).append(" AND FTVATYP_NCHG_DATE > ").append(dateCode)));
//
			this.getLogger().trace(this, "F2J : fFtvatypKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvatypEntry(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
			return ((toStr("WHERE UPPER(FTVATYP_COAS_CODE) = ").append(coasCode).append(" AND FTVATYP_EFF_DATE <= ").append(dateCode).append(" AND FTVATYP_NCHG_DATE > ").append(dateCode).append(" AND (FTVATYP_TERM_DATE IS NULL").append(" OR FTVATYP_TERM_DATE > ").append(dateCode).append(")")));
//
			//this.getLogger().trace(this, "F2J : fFtvatypEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
//return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvcrsnKey(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVCRSN_START_DATE <= ").append(dateCode)));
//
			this.getLogger().trace(this, "F2J : fFtvcrsnKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvcrsnEntry(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVCRSN_START_DATE <= ").append(dateCode).append(" AND (FTVCRSN_TERM_DATE IS NULL").append(" OR FTVCRSN_TERM_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvcrsnEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtveelcKey(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVEELC_COAS_CODE) = ").append(coasCode).append(" AND FTVEELC_EFF_DATE <= ").append(dateCode).append(" AND (FTVEELC_NCHG_DATE IS NULL").append(" OR FTVEELC_NCHG_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtveelcKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtveelcEntry(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVEELC_COAS_CODE = ").append(coasCode).append(" AND FTVEELC_EFF_DATE <= ").append(dateCode).append(" AND (FTVEELC_NCHG_DATE IS NULL").append(" OR FTVEELC_NCHG_DATE > ").append(dateCode).append(" AND (FTVEELC_TERM_DATE >= ").append(dateCode).append(" OR FTVEELC_TERM_DATE IS NULL))")));
//
			this.getLogger().trace(this, "F2J : fFtveelcEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param eentCode
		* @param eelcCode
		* @param dateCode
		*/
		public NString fFtveeliKey(NString coasCode, NString eentCode, NString eelcCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVEELI_COAS_CODE) = ").append(coasCode).append(" AND  FTVEELI_EENT_CODE = ").append(eentCode).append(" AND  FTVEELI_EELC_CODE = ").append(eelcCode).append(" AND  FTVEELI_EFF_DATE <= ").append(dateCode).append(" AND  (FTVEELI_NCHG_DATE IS NULL").append(" OR  FTVEELI_NCHG_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtveeliKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param eentCode
		* @param eelcCode
		* @param dateCode
		*/
		public NString fFtveeliEntry(NString coasCode, NString eentCode, NString eelcCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVEELI_COAS_CODE) = ").append(coasCode).append(" AND FTVEELI_EENT_CODE = ").append(eentCode).append(" AND FTVEELI_EELC_CODE = ").append(eelcCode).append(" AND FTVEELI_EFF_DATE <= ").append(dateCode).append(" AND (FTVEELI_NCHG_DATE IS NULL").append(" OR  FTVEELI_NCHG_DATE > ").append(dateCode).append(" AND (FTVEELI_TERM_DATE IS NULL").append(" OR FTVEELI_TERM_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtveeliEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtveentKey(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVEENT_COAS_CODE) = ").append(coasCode).append(" AND FTVEENT_EFF_DATE <= ").append(dateCode).append(" AND (FTVEENT_NCHG_DATE IS NULL").append(" OR FTVEENT_NCHG_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtveentKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtveentEntry(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVEENT_COAS_CODE) = ").append(coasCode).append(" AND FTVEENT_EFF_DATE <= ").append(dateCode).append(" AND (FTVEENT_NCHG_DATE IS NULL").append(" OR FTVEENT_NCHG_DATE > ").append(dateCode).append(")").append(" AND (FTVEENT_TERM_DATE >= ").append(dateCode).append(" OR FTVEENT_TERM_DATE IS NULL)")));
//
			this.getLogger().trace(this, "F2J : fFtveentEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvftypKey(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVFTYP_COAS_CODE) = ").append(coasCode).append(" AND FTVFTYP_EFF_DATE <= ").append(dateCode).append(" AND FTVFTYP_NCHG_DATE > ").append(dateCode)));
//
			this.getLogger().trace(this, "F2J : fFtvftypKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param coasCode
		* @param dateCode
		*/
		public NString fFtvftypEntry(NString coasCode, NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE UPPER(FTVFTYP_COAS_CODE) = ").append(coasCode).append(" AND FTVFTYP_EFF_DATE <= ").append(dateCode).append(" AND FTVFTYP_NCHG_DATE > ").append(dateCode).append(" AND (FTVFTYP_TERM_DATE >= ").append(dateCode).append(" OR FTVFTYP_TERM_DATE IS NULL)")));
//
			this.getLogger().trace(this, "F2J : fFtvftypEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvruclKey(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVRUCL_EFF_DATE <= ").append(dateCode).append(" AND (FTVRUCL_NCHG_DATE IS NULL").append(" OR FTVRUCL_NCHG_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvruclKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvruclEntry(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVRUCL_EFF_DATE <= ").append(dateCode).append(" AND (FTVRUCL_NCHG_DATE IS NULL").append(" OR FTVRUCL_NCHG_DATE > ").append(dateCode).append(")").append(" AND (FTVRUCL_TERM_DATE IS NULL").append(" OR FTVRUCL_TERM_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvruclEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvtgrpKey(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVTGRP_EFF_DATE <= ").append(dateCode).append(" AND (FTVTGRP_NCHG_DATE IS NULL").append(" OR FTVTGRP_NCHG_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvtgrpKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvtgrpEntry(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVTGRP_EFF_DATE <= ").append(dateCode).append(" AND (FTVTGRP_NCHG_DATE IS NULL").append(" OR FTVTGRP_NCHG_DATE > ").append(dateCode).append(")").append(" AND (FTVTGRP_TERM_DATE IS NULL").append(" OR FTVTGRP_TERM_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvtgrpEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvtratKey(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVTRAT_EFF_DATE <= ").append(dateCode).append(" AND FTVTRAT_NCHG_DATE > ").append(dateCode)));
//
			this.getLogger().trace(this, "F2J : fFtvtratKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvtratEntry(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVTRAT_EFF_DATE <= ").append(dateCode).append(" AND FTVTRAT_NCHG_DATE > ").append(dateCode).append(" AND (FTVTRAT_TERM_DATE IS NULL").append(" OR FTVTRAT_TERM_DATE > ").append(dateCode).append(")")));
//
			this.getLogger().trace(this, "F2J : fFtvtratEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvuomsKey(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVUOMS_EFF_DATE <= ").append(dateCode)));
//
			this.getLogger().trace(this, "F2J : fFtvuomsKey function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param dateCode
		*/
		public NString fFtvuomsEntry(NString dateCode)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return ((toStr("WHERE FTVUOMS_EFF_DATE <= ").append(dateCode).append(" AND (FTVUOMS_TERM_DATE > ").append(dateCode).append(" OR FTVUOMS_TERM_DATE IS NULL)")));
//
			this.getLogger().trace(this, "F2J : fFtvuomsEntry function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		
	
	
}
