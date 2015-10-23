package net.hedtech.banner.finance.common.Frigrnt.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;


import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Frigrnt.model.*;
import net.hedtech.banner.finance.common.Frigrnt.*;
import net.hedtech.banner.finance.common.Frigrnt.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrbgrntController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FrbgrntController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrigrntTask getTask() {
		return (FrigrntTask)super.getTask();
	}

	public FrigrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRBGRNT.ON_ERROR_OLD
		 
DECLARE 
  errnum NUMBER       := ERROR_CODE; 
  
BEGIN 
  IF errnum = 41009 THEN 
    Message( G$_NLS.Get('FRIGRNT-0001', 'FORM','Invalid function; press SHOW KEYS for valid functions.') );
  END IF;          
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.ON_ERROR_OLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ON_ERROR_OLD")
		public void frbgrnt_OnErrorOld()
		{
			
				{
					NNumber errnum = toNumber(errorCode());
					if ( errnum.equals(41009) )
					{
						errorMessage(GNls.Fget(toStr("FRIGRNT-0001"), toStr("FORM"), toStr("Invalid function; press SHOW KEYS for valid functions.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.PRE-QUERY
		 :query_pi_id := :pi_id;
:query_pi_last_name := :pi_last_name;
:query_pi_first_name := :pi_first_name;
:query_agency_id := :agency_id;
:query_agency_name := :agency_name;
:query_orgn_desc := :orgn_desc;
:query_status_desc := :frbgrnt_status_desc;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frbgrnt_BeforeQuery(QueryEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);


				getFormModel().getFormHeader().setQueryPiId(frbgrntElement.getPiId());
				getFormModel().getFormHeader().setQueryPiLastName(frbgrntElement.getPiLastName());
				getFormModel().getFormHeader().setQueryPiFirstName(frbgrntElement.getPiFirstName());
				getFormModel().getFormHeader().setQueryAgencyId(frbgrntElement.getAgencyId());
				getFormModel().getFormHeader().setQueryAgencyName(frbgrntElement.getAgencyName());
				getFormModel().getFormHeader().setQueryOrgnDesc(frbgrntElement.getOrgnDesc());
				getFormModel().getFormHeader().setQueryStatusDesc(frbgrntElement.getFrbgrntStatusDesc());

				//MORPHIS: rule for queries on calculated fields in AfterQuery
				boolean filterOnVirtuals =
						getFormModel().getFormHeader().getQueryPiId().isNotNull() ||
						getFormModel().getFormHeader().getQueryPiLastName().isNotNull() ||
						getFormModel().getFormHeader().getQueryPiFirstName().isNotNull() ||
						getFormModel().getFormHeader().getQueryAgencyId().isNotNull() ||
						getFormModel().getFormHeader().getQueryAgencyName().isNotNull() ||
						getFormModel().getFormHeader().getQueryOrgnDesc().isNotNull() ||
						getFormModel().getFormHeader().getQueryStatusDesc().isNotNull();
						
				if ( filterOnVirtuals )		
					this.getFormModel().getFrbgrnt().setQueryAllRecords();
				else
					this.getFormModel().getFrbgrnt().resetQueryAllRecords();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-QUERY
		 DECLARE
  CURSOR PTI_CURSOR IS
    SELECT spriden_id, spriden_last_name, spriden_first_name
    FROM   SPRIDEN
    WHERE  SPRIDEN_PIDM = :FRBGRNT_PI_PIDM
      AND  SPRIDEN_CHANGE_IND IS NULL;
 --Defect 1-1A1JGI
 CURSOR C1 IS
 SELECT ftvsdat_title
   FROM ftvsdat
  WHERE	ftvsdat_sdat_code_entity = 'FRBGRNT'
    AND ftvsdat_sdat_code_attr = 'STATUS_CODE'
    AND ftvsdat_sdat_code_opt_1 = :frbgrnt_status_code
    AND ftvsdat_eff_date <= sysdate
    AND (ftvsdat_nchg_date is null
     OR ftvsdat_nchg_date > sysdate)
    AND ftvsdat_status_ind = 'A';
  v_ftvsdat_title   ftvsdat.ftvsdat_title%TYPE;
 --       
BEGIN
  if :frbgrnt_pi_pidm is not null then 
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO :PI_ID,:pi_last_name, :pi_first_name;
    IF PTI_CURSOR%NOTFOUND THEN
      MESSAGE( G$_NLS.Get('FRIGRNT-0002', 'FORM','Principle Investigator ID is invalid.') );
    END IF;
  end if;

  if :query_pi_id is not null then 
    if :pi_id like :query_pi_id then 
    	null;
    else 
   	  raise form_trigger_failure;
    end if;
  end if;

  if :query_pi_last_name is not null then 
    if :pi_last_name like :query_pi_last_name then 
    	null;
    else 
    	raise form_trigger_failure;
    end if;
  end if;

  if :query_pi_first_name is not null then 
    if :pi_first_name like :query_pi_first_name then 
    	null;
    else 
    	raise form_trigger_failure;
    end if;
  end if;  

  if :FRBGRNT_AGENCY_PIDM is null then 
    :agency_id := '';
    :AGENCY_NAME:= '';
  else
    g$_sel_spriden_id_name(:FRBGRNT_AGENCY_PIDM, 'AGENCY_NAME', 'Y', :agency_id);
  end if;	

  if :query_agency_id is not null then 
    if :agency_id like :query_agency_id then 
      null;
    else 
  	  raise form_trigger_failure;
    end if;
  end if;

  if :query_agency_name is not null then 
    if :agency_name like :query_agency_name then 
  	  null;
    else 
  	  raise form_trigger_failure;
    end if;
  end if;  
  --1-1A1JGI
  :frbgrnt.frbgrnt_status_desc := '';
  IF :frbgrnt.frbgrnt_status_code IS NOT NULL THEN
    open c1;
    fetch c1 into v_ftvsdat_title;
    close c1;  
  END IF;
  :frbgrnt.frbgrnt_status_desc := v_ftvsdat_title || ' ' || :frbgrnt_alternate_status_desc;
  if :query_status_desc is not null then 
    if :frbgrnt_status_desc like :query_status_desc then 
    	null;
    else 
    	raise form_trigger_failure;
    end if;
  end if;
  --
  execute_trigger('get_orgn_desc');
  if :query_orgn_desc is not null then 
    if :orgn_desc like :query_orgn_desc then 
    	null;
    else 
    	raise form_trigger_failure;
    end if;
  end if;  

END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frbgrnt_AfterQuery(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();
				
                String lvTrim = "#LIKE ";

				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT spriden_id, spriden_last_name, spriden_first_name " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :FRBGRNT_PI_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_STATUS_CODE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					NString vFtvsdatTitle= NString.getNull();
					try {
						if ( !frbgrntElement.getFrbgrntPiPidm().isNull() )
						{
							//Setting query parameters
							ptiCursor.addParameter("FRBGRNT_PI_PIDM", frbgrntElement.getFrbgrntPiPidm());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								frbgrntElement.setPiId(ptiCursorResults.getStr(0));
								frbgrntElement.setPiLastName(ptiCursorResults.getStr(1));
								frbgrntElement.setPiFirstName(ptiCursorResults.getStr(2));
							}
							if ( ptiCursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("FRIGRNT-0002"), toStr("FORM"), toStr("Principle Investigator ID is invalid.")));
							}
						}
						if ( !getFormModel().getFormHeader().getQueryPiId().isNull() )
						{   
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryPiId(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}
							if ( like(frbgrntElement.getPiId(), ltrim(getFormModel().getFormHeader().getQueryPiId(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						if ( !getFormModel().getFormHeader().getQueryPiLastName().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryPiLastName(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}
							if ( like(frbgrntElement.getPiLastName(), ltrim(getFormModel().getFormHeader().getQueryPiLastName(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						if ( !getFormModel().getFormHeader().getQueryPiFirstName().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryPiFirstName(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}							
							if ( like(frbgrntElement.getPiFirstName(), ltrim(getFormModel().getFormHeader().getQueryPiFirstName(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						if ( frbgrntElement.getFrbgrntAgencyPidm().isNull() )
						{
							frbgrntElement.setAgencyId(toStr(""));
							frbgrntElement.setAgencyName(toStr(""));
						}
						else {
							Ref<NString> pId_ref = new Ref<NString>(frbgrntElement.getAgencyId());
							getTask().getGoqrpls().gSelSpridenIdName(frbgrntElement.getFrbgrntAgencyPidm(), toStr("AGENCY_NAME"), toStr("Y"), pId_ref);
							frbgrntElement.setAgencyId(pId_ref.val);
						}
						if ( !getFormModel().getFormHeader().getQueryAgencyId().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryAgencyId(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}
							if ( like(frbgrntElement.getAgencyId(), ltrim(getFormModel().getFormHeader().getQueryAgencyId(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						if ( !getFormModel().getFormHeader().getQueryAgencyName().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryAgencyName(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}							
							if ( like(frbgrntElement.getAgencyName(), ltrim(getFormModel().getFormHeader().getQueryAgencyName(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						// 1-1A1JGI
						frbgrntElement.setFrbgrntStatusDesc(toStr(""));
						if ( !frbgrntElement.getFrbgrntStatusCode().isNull() )
						{
							//Setting query parameters
							c1.addParameter("FRBGRNT_STATUS_CODE", frbgrntElement.getFrbgrntStatusCode());
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								vFtvsdatTitle = c1Results.getStr(0);
							}
							c1.close();
						}
						frbgrntElement.setFrbgrntStatusDesc(vFtvsdatTitle.append(" ").append(frbgrntElement.getFrbgrntAlternateStatusDesc()));
						if ( !getFormModel().getFormHeader().getQueryStatusDesc().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryStatusDesc(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}								
							if ( like(frbgrntElement.getFrbgrntStatusDesc(), ltrim(getFormModel().getFormHeader().getQueryStatusDesc(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						// 
						executeAction("get_orgn_desc");
						if ( !getFormModel().getFormHeader().getQueryOrgnDesc().isNull() )
						{
							lvTrim = "";
							if (substring(getFormModel().getFormHeader().getQueryOrgnDesc(),1,1).equals("#")) {
								lvTrim = "#LIKE ";
							}									
							if ( like(frbgrntElement.getOrgnDesc(), ltrim(getFormModel().getFormHeader().getQueryOrgnDesc(), lvTrim)) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
					}
					finally{
						ptiCursor.close();
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.GET_ORGN_DESC
		 declare 
 cursor get_orgn is 
   SELECT  ftvorgn_title
   FROM    ftvorgn 
   WHERE  trunc(FTVORGN_EFF_DATE) <=  sysdate
     AND  trunc(FTVORGN_NCHG_DATE) >  sysdate
     and  ftvorgn_coas_code = :frbgrnt_coas_code
     and  ftvorgn_orgn_code = :FRBGRNT_ORGN_CODE_RESP_OFFICE;
begin
   open get_orgn;
fetch get_orgn into :orgn_desc;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.GET_ORGN_DESC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_ORGN_DESC")
		public void frbgrnt_GetOrgnDesc()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement!=null){
				int rowCount = 0;
				{
					String sqlgetOrgn = "SELECT ftvorgn_title " +
	" FROM ftvorgn " +
	" WHERE trunc(FTVORGN_EFF_DATE) <= sysdate AND trunc(FTVORGN_NCHG_DATE) > sysdate AND ftvorgn_coas_code = :FRBGRNT_COAS_CODE AND ftvorgn_orgn_code = :FRBGRNT_ORGN_CODE_RESP_OFFICE ";
					DataCursor getOrgn = new DataCursor(sqlgetOrgn);
					try {
						//Setting query parameters
						getOrgn.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getOrgn.addParameter("FRBGRNT_ORGN_CODE_RESP_OFFICE", frbgrntElement.getFrbgrntOrgnCodeRespOffice());
						getOrgn.open();
						ResultSet getOrgnResults = getOrgn.fetchInto();
						if ( getOrgnResults != null ) {
							frbgrntElement.setOrgnDesc(getOrgnResults.getStr(0));
						}
					}
					finally{
						getOrgn.close();
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_STATUS_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntStatusDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_STATUS_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntStatusDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_STATUS_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntStatusDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntProjectStartDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntProjectStartDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntProjectStartDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntProjectEndDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntProjectEndDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntProjectEndDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

