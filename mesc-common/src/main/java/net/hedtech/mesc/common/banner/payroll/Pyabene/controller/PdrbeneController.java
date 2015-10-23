package net.hedtech.mesc.common.banner.payroll.Pyabene.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Noqjpls.*;
import net.hedtech.general.common.libraries.Poqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.model.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class PdrbeneController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public PdrbeneController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public PyabeneTask getTask() {
		return (PyabeneTask)super.getTask();
	}

	public PyabeneModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER PDRBENE.POST-QUERY
		 DECLARE
	CURSOR C1 IS 
		SELECT 
        spriden_last_name,
        spriden_first_name,
        ptrbrel_desc,
        spbpers_sex,
        FLOOR(MONTHS_BETWEEN (NVL(spbpers_dead_date, SYSDATE),spbpers_birth_date)/12),
        spbpers_mrtl_code
        FROM spriden,spbpers,ptrbrel
        WHERE spriden_pidm=:PDRBENE_BENE_PIDM
        AND spriden_change_ind IS NULL
        AND spbpers_pidm=spriden_pidm
        AND ptrbrel_code=:PDRBENE_BREL_CODE;
        
  CURSOR natn_codes IS
  	SELECT gobintl_natn_code_birth, gobintl_natn_code_legal
  	FROM gobintl 
  	WHERE gobintl_pidm=:PDRBENE_BENE_PIDM;
        		
	CURSOR C2 IS
		SELECT pdrbene_bene_last_name,
		pdrbene_bene_first_name,
		ptrbrel_desc,
		pdrbene_sex_ind,
		FLOOR(MONTHS_BETWEEN (SYSDATE,pdrbene_birth_date)/12)
		FROM pdrbene,ptrbrel 
		WHERE pdrbene_pidm=:PDRBENE_PIDM
		AND pdrbene_seq_no=:PDRBENE_SEQ_NO
		AND ptrbrel_code=:PDRBENE_BREL_CODE ;
		
		CURSOR MARTL_DESC IS
			SELECT   stvmrtl_desc
	    FROM stvmrtl,pdrbene
	    WHERE stvmrtl_code=pdrbene_martl_code
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;
	  
	  CURSOR NATN_DESC1 IS
			SELECT   stvnatn_nation
	    FROM stvnatn,pdrbene
	    WHERE stvnatn_code=pdrbene_natn_code
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;
	    
	  CURSOR NATN_DESC2 IS
			SELECT   stvnatn_nation
	    FROM stvnatn,pdrbene
	    WHERE stvnatn_code=pdrbene_home_natn
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;
	  
	  CURSOR NATN_DESC3 IS
			SELECT   stvnatn_nation
	    FROM stvnatn,pdrbene
	    WHERE stvnatn_code=pdrbene_birth_natn
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;
	  
	  CURSOR ELGBTY_REASON_DESC IS
		  SELECT   gyvcode_desc
	    FROM gyvcode,gyvtype,pdrbene
	    WHERE pdrbene_elgbty_reason=gyvcode_code
	    AND gyvcode_type_code=gyvtype_type_code
	    AND gyvcode_type_code='TYPE3'
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;	
	    
	  CURSOR HOME_AIRPORT_DESC IS 
	    SELECT   gyvcode_desc
	    FROM gyvcode,gyvtype,pdrbene
	    WHERE pdrbene_home_airport=gyvcode_code
	    AND gyvcode_type_code=gyvtype_type_code	    
	    AND gyvcode_type_code='TYPE1'
	    AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;
    
    CURSOR AIRFARE_DESC IS
	  	SELECT   gyvcode_desc
	    FROM gyvcode,gyvtype,pdrbene
	    WHERE pdrbene_airfare_code=gyvcode_code
	    AND gyvcode_type_code=gyvtype_type_code
	    AND gyvcode_type_code='TYPE7'
	   	AND pdrbene_seq_no=:PDRBENE_SEQ_NO
	    AND pdrbene_pidm=:PDRBENE_PIDM;  
		
		
BEGIN
	IF :PDRBENE_BENE_PIDM IS NOT NULL THEN
		IF C1%ISOPEN THEN
			CLOSE C1;
		END IF;		
		OPEN C1;
		FETCH C1 INTO :PDRBENE_BENE_LAST_NAME,:PDRBENE_BENE_FIRST_NAME,:PDRBENE_BREL_DESC,:PDRBENE_SEX_IND,:PDRBENE_AGE,:MARTL_CODE;
		CLOSE C1;
		
		IF natn_codes%ISOPEN THEN
			CLOSE natn_codes;
		END IF;		
		OPEN natn_codes;
		FETCH natn_codes INTO :BIRTH_NATN,:NATN_CODE;
		CLOSE natn_codes;
	ELSE
		IF C2%ISOPEN THEN
			CLOSE C2;
		END IF;		
		OPEN C2;
		FETCH C2 INTO :PDRBENE_BENE_LAST_NAME,:PDRBENE_BENE_FIRST_NAME,:PDRBENE_BREL_DESC,:PDRBENE_SEX_IND,:PDRBENE_AGE;
		CLOSE C2;	
	END IF;
		
	IF MARTL_DESC%ISOPEN THEN
		CLOSE MARTL_DESC;
	END IF;
	OPEN MARTL_DESC;
	FETCH MARTL_DESC INTO :PDRBENE_MARTL_DESC;
	CLOSE MARTL_DESC;
	
	IF NATN_DESC1%ISOPEN THEN
		CLOSE NATN_DESC1;
	END IF;
	OPEN NATN_DESC1;
	FETCH NATN_DESC1 INTO :PDRBENE_NATN_DESC;
	CLOSE NATN_DESC1;
	
	IF NATN_DESC2%ISOPEN THEN
		CLOSE NATN_DESC2;
	END IF;
	OPEN NATN_DESC2;
	FETCH NATN_DESC2 INTO :PDRBENE_HOME_NATN_DESC;
	CLOSE NATN_DESC2;
	
	IF NATN_DESC3%ISOPEN THEN
		CLOSE NATN_DESC3;
	END IF;
	OPEN NATN_DESC3;
	FETCH NATN_DESC3 INTO :PDRBENE_BIRTH_NATN_DESC;
	CLOSE NATN_DESC3;
	
	IF AIRFARE_DESC%ISOPEN THEN
		CLOSE AIRFARE_DESC;
	END IF;
	OPEN AIRFARE_DESC;
	FETCH AIRFARE_DESC INTO :PDRBENE_AIRFARE_DESC;
	CLOSE AIRFARE_DESC;    
    
  IF ELGBTY_REASON_DESC%ISOPEN THEN
		CLOSE ELGBTY_REASON_DESC;
	END IF;
	OPEN ELGBTY_REASON_DESC;
	FETCH ELGBTY_REASON_DESC INTO :PDRBENE_ELGBTY_REASON_DESC;
	CLOSE ELGBTY_REASON_DESC;  
  
    
  IF HOME_AIRPORT_DESC%ISOPEN THEN
		CLOSE HOME_AIRPORT_DESC;
	END IF;
	OPEN HOME_AIRPORT_DESC;
	FETCH HOME_AIRPORT_DESC INTO :PDRBENE_HOME_AIRPORT_DESC;
	CLOSE HOME_AIRPORT_DESC;
IF :PDRBENE.PDRBENE_BREL_CODE='S' THEN	
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
  --SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_OFF);	
ELSE
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_MARTL_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_NATN_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_BIRTH_NATN',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
  --SET_ITEM_PROPERTY('PDRBENE_MARTL_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;	

IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN	
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
ELSE
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
	SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
END IF;	

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void pdrbene_AfterQuery(RowAdapterEvent args)
		{
			
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)args.getRow();


				int rowCount = 0;
				
				{
					String sqlptrbrelC = "SELECT ptrbrel_type " +
							" FROM ptrbrel " +
							" WHERE ptrbrel_code = :PDRBENE_BREL_CODE ";
											DataCursor ptrbrelC = new DataCursor(sqlptrbrelC);
					
					String sqlc1 = "SELECT spriden_last_name, spriden_first_name, ptrbrel_desc, ptrbrel_type, spbpers_sex, FLOOR(MONTHS_BETWEEN(NVL(spbpers_dead_date, SYSDATE), spbpers_birth_date) / 12), spbpers_mrtl_code " +
	" FROM spriden, spbpers, ptrbrel " +
	" WHERE spriden_pidm = :PDRBENE_BENE_PIDM AND spriden_change_ind IS NULL AND spbpers_pidm = spriden_pidm AND ptrbrel_code = :PDRBENE_BREL_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					String sqlnatnCodes = "SELECT gobintl_natn_code_birth, gobintl_natn_code_legal " +
	" FROM gobintl " +
	" WHERE gobintl_pidm = :PDRBENE_BENE_PIDM ";
					DataCursor natnCodes = new DataCursor(sqlnatnCodes);
					String sqlc2 = "SELECT pdrbene_bene_last_name, pdrbene_bene_first_name, ptrbrel_desc, pdrbene_sex_ind, FLOOR(MONTHS_BETWEEN(SYSDATE, pdrbene_birth_date) / 12) " +
	" FROM pdrbene, ptrbrel " +
	" WHERE pdrbene_pidm = :PDRBENE_PIDM AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND ptrbrel_code = :PDRBENE_BREL_CODE ";
					DataCursor c2 = new DataCursor(sqlc2);
					String sqlmartlDesc = "SELECT stvmrtl_desc " +
	" FROM stvmrtl, pdrbene " +
	" WHERE stvmrtl_code = pdrbene_martl_code AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor martlDesc = new DataCursor(sqlmartlDesc);
					String sqlnatnDesc1 = "SELECT stvnatn_nation " +
	" FROM stvnatn, pdrbene " +
	" WHERE stvnatn_code = pdrbene_natn_code AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor natnDesc1 = new DataCursor(sqlnatnDesc1);
					String sqlnatnDesc2 = "SELECT stvnatn_nation " +
	" FROM stvnatn, pdrbene " +
	" WHERE stvnatn_code = pdrbene_home_natn AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor natnDesc2 = new DataCursor(sqlnatnDesc2);
					String sqlnatnDesc3 = "SELECT stvnatn_nation " +
	" FROM stvnatn, pdrbene " +
	" WHERE stvnatn_code = pdrbene_birth_natn AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor natnDesc3 = new DataCursor(sqlnatnDesc3);
					String sqlelgbtyReasonDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype, pdrbene " +
	" WHERE pdrbene_elgbty_reason = gyvcode_code AND gyvcode_type_code = gyvtype_type_code AND gyvcode_type_code = 'TYPE3' AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor elgbtyReasonDesc = new DataCursor(sqlelgbtyReasonDesc);
					String sqlhomeAirportDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype, pdrbene " +
	" WHERE pdrbene_home_airport = gyvcode_code AND gyvcode_type_code = gyvtype_type_code AND gyvcode_type_code = 'TYPE1' AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor homeAirportDesc = new DataCursor(sqlhomeAirportDesc);
					String sqlairfareDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype, pdrbene " +
	" WHERE pdrbene_airfare_code = gyvcode_code AND gyvcode_type_code = gyvtype_type_code AND gyvcode_type_code = 'TYPE7' AND pdrbene_seq_no = :PDRBENE_SEQ_NO AND pdrbene_pidm = :PDRBENE_PIDM ";
					DataCursor airfareDesc = new DataCursor(sqlairfareDesc);
					try {
						if ( ptrbrelC.isOpen() )
						{
							ptrbrelC.close();
						}
						//Setting query parameters
						ptrbrelC.addParameter("PDRBENE_BREL_CODE", pdrbeneElement.getPdrbeneBrelCode());
						
						ptrbrelC.open();
						ResultSet ptrbrelCResults = ptrbrelC.fetchInto();
						if ( ptrbrelCResults != null ) {
							pdrbeneElement.setPdrbeneBrelType(ptrbrelCResults.getStr(0));
						}
						ptrbrelC.close();
						
						if ( !pdrbeneElement.getPdrbeneBenePidm().isNull() )
						{
							if ( c1.isOpen() )
							{
								c1.close();
							}
							
							c1.addParameter("PDRBENE_BENE_PIDM", pdrbeneElement.getPdrbeneBenePidm());
							c1.addParameter("PDRBENE_BREL_CODE", pdrbeneElement.getPdrbeneBrelCode());
							
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								pdrbeneElement.setPdrbeneBeneLastName(c1Results.getStr(0));
								pdrbeneElement.setPdrbeneBeneFirstName(c1Results.getStr(1));
								pdrbeneElement.setPdrbeneBrelDesc(c1Results.getStr(2));
								pdrbeneElement.setPdrbeneBrelType(c1Results.getStr(3));
								pdrbeneElement.setPdrbeneSexInd(c1Results.getStr(4));
								pdrbeneElement.setPdrbeneAge(c1Results.getNumber(5));
								pdrbeneElement.setMartlCode(c1Results.getStr(6));
							}
							c1.close();
							if ( natnCodes.isOpen() )
							{
								natnCodes.close();
							}
							
							natnCodes.addParameter("PDRBENE_BENE_PIDM", pdrbeneElement.getPdrbeneBenePidm());
							
							natnCodes.open();
							ResultSet natnCodesResults = natnCodes.fetchInto();
							if ( natnCodesResults != null ) {
								pdrbeneElement.setBirthNatn(natnCodesResults.getStr(0));
								pdrbeneElement.setNatnCode(natnCodesResults.getStr(1));
							}
							natnCodes.close();
						}
						else {
							if ( c2.isOpen() )
							{
								c2.close();
							}
							
							c2.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
							c2.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
							c2.addParameter("PDRBENE_BREL_CODE", pdrbeneElement.getPdrbeneBrelCode());
							
							c2.open();
							ResultSet c2Results = c2.fetchInto();
							if ( c2Results != null ) {
								pdrbeneElement.setPdrbeneBeneLastName(c2Results.getStr(0));
								pdrbeneElement.setPdrbeneBeneFirstName(c2Results.getStr(1));
								pdrbeneElement.setPdrbeneBrelDesc(c2Results.getStr(2));
								pdrbeneElement.setPdrbeneSexInd(c2Results.getStr(3));
								pdrbeneElement.setPdrbeneAge(c2Results.getNumber(4));
								
								
							}
							c2.close();
						}
						if ( martlDesc.isOpen() )
						{
							martlDesc.close();
						}
						
						martlDesc.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						martlDesc.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						martlDesc.open();
						ResultSet martlDescResults = martlDesc.fetchInto();
						if ( martlDescResults != null ) {
							pdrbeneElement.setPdrbeneMartlDesc(martlDescResults.getStr(0));
						}
						martlDesc.close();
						if ( natnDesc1.isOpen() )
						{
							natnDesc1.close();
						}
						
						natnDesc1.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						natnDesc1.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						natnDesc1.open();
						ResultSet natnDesc1Results = natnDesc1.fetchInto();
						if ( natnDesc1Results != null ) {
							pdrbeneElement.setPdrbeneNatnDesc(natnDesc1Results.getStr(0));
						}
						natnDesc1.close();
						if ( natnDesc2.isOpen() )
						{
							natnDesc2.close();
						}
						
						natnDesc2.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						natnDesc2.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						natnDesc2.open();
						ResultSet natnDesc2Results = natnDesc2.fetchInto();
						if ( natnDesc2Results != null ) {
							pdrbeneElement.setPdrbeneHomeNatnDesc(natnDesc2Results.getStr(0));
						}
						natnDesc2.close();
						if ( natnDesc3.isOpen() )
						{
							natnDesc3.close();
						}
						
						natnDesc3.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						natnDesc3.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						natnDesc3.open();
						ResultSet natnDesc3Results = natnDesc3.fetchInto();
						if ( natnDesc3Results != null ) {
							pdrbeneElement.setPdrbeneBirthNatnDesc(natnDesc3Results.getStr(0));
						}
						natnDesc3.close();
						if ( airfareDesc.isOpen() )
						{
							airfareDesc.close();
						}
						
						airfareDesc.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						airfareDesc.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						airfareDesc.open();
						ResultSet airfareDescResults = airfareDesc.fetchInto();
						if ( airfareDescResults != null ) {
							pdrbeneElement.setPdrbeneAirfareDesc(airfareDescResults.getStr(0));
						}
						airfareDesc.close();
						if ( elgbtyReasonDesc.isOpen() )
						{
							elgbtyReasonDesc.close();
						}
						
						elgbtyReasonDesc.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						elgbtyReasonDesc.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						elgbtyReasonDesc.open();
						ResultSet elgbtyReasonDescResults = elgbtyReasonDesc.fetchInto();
						if ( elgbtyReasonDescResults != null ) {
							pdrbeneElement.setPdrbeneElgbtyReasonDesc(elgbtyReasonDescResults.getStr(0));
						}
						elgbtyReasonDesc.close();
						if ( homeAirportDesc.isOpen() )
						{
							homeAirportDesc.close();
						}
						
						homeAirportDesc.addParameter("PDRBENE_SEQ_NO", pdrbeneElement.getPdrbeneSeqNo());
						homeAirportDesc.addParameter("PDRBENE_PIDM", pdrbeneElement.getPdrbenePidm());
						
						homeAirportDesc.open();
						ResultSet homeAirportDescResults = homeAirportDesc.fetchInto();
						if ( homeAirportDescResults != null ) {
							pdrbeneElement.setPdrbeneHomeAirportDesc(homeAirportDescResults.getStr(0));
						}
						homeAirportDesc.close();
						
						if ( pdrbeneElement.getPdrbeneBrelType().equals("E") )
						{
							setItemInsertAllowed("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, false);
							setItemInsertAllowed("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, false);
							setItemInsertAllowed("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, false);
						}
						else {
							setItemInsertAllowed("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_MARTL_CODE", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_NATN_CODE", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_BIRTH_NATN", ItemServices.CURRENT_RECORD, true);
						}
						if ( pdrbeneElement.getPdrbeneBrelType().notEquals("C") )
						{
							setItemInsertAllowed("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
							setItemInsertAllowed("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, false);
						}
						else {
							setItemInsertAllowed("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_EDUFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_SPLFEE_ELGBTY", ItemServices.CURRENT_RECORD, true);
						}
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") )
						{
							setItemInsertAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemInsertAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
						}
						else {
							setItemInsertAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
						}
					}
					finally{
						ptrbrelC.close();
						c1.close();
						natnCodes.close();
						c2.close();
						martlDesc.close();
						natnDesc1.close();
						natnDesc2.close();
						natnDesc3.close();
						airfareDesc.close();
						elgbtyReasonDesc.close();
						homeAirportDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.PRE-BLOCK
		 DEBUG.SUSPEND;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void pdrbene_blockIn()
		{
			
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void pdrbene_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void pdrbene_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.WHEN-NEW-ITEM-INSTANCE
		 IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),ENABLED) = 'FALSE' THEN
   NEXT_ITEM ;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbene_itemChange()
		{
			
				if ( getItemEnabled(getCursorItem()).equals("FALSE") )
				{
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.KEY-DELREC
		 MESSAGE(  G$_NLS.Get('PYABENE-0033', 'FORM','*ERROR* Employee/beneficiary record can not be deleted. Use Beneficiary form (PDABENE) for deletion.')  ) ;
   RETURN ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void pdrbene_DeleteRecord()
		{
			
			errorMessage(GNls.Fget(toStr("PYABENE-0033"), toStr("FORM"), toStr("*ERROR* Employee/beneficiary record cannot be deleted. Use Beneficiary form (PDABENE) for deletion.")));
				return ;
			}

		
		@BeforeQuery
		public void pdrbene_BeforeQuery(QueryEvent args)
		{
			
              
				setBlockWhereClause("PDRBENE", toStr("(PDRBENE_PIDM=:PIDM)"));

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));             

         }
		
		
		/* Original PL/SQL code code for TRIGGER PDRBENE.PRE-UPDATE
		 DECLARE
	CURSOR elgbty_chk_c IS
		SELECT pyrperf_emp_elig,pyrperf_fam_elig
		FROM pyrperf
		WHERE rowid=pykatkt.f_pyrperf_rowid(:PIDM);
	m_emp_elig		VARCHAR2(1);
	m_fam_elig		VARCHAR2(1);
BEGIN
	IF elgbty_chk_c%ISOPEN THEN
		CLOSE elgbty_chk_c;
	END IF;
	OPEN elgbty_chk_c;
	FETCH elgbty_chk_c INTO m_emp_elig,m_fam_elig;
	CLOSE elgbty_chk_c;
	
	:PDRBENE_ACTIVITY_DATE := sysdate;

	IF m_emp_elig='N' AND :PDRBENE.PDRBENE_BREL_CODE='S'AND :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0034', 'FORM','*WARNING* Employee is not eligible for ticket request.')) ;	
	ELSIF m_fam_elig='N' AND :PDRBENE.PDRBENE_BREL_CODE<>'S'AND :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0035', 'FORM','*WARNING* Dependents are not eligible for ticket request.')) ;
	END IF;
	
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_HOME_AIRPORT IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0036', 'FORM','*ERROR* Home airport must be entered.')) ;
--		GO_ITEM('PDRBENE_HOME_AIRPORT');
		RAISE FORM_TRIGGER_FAILURE ;
	END IF;
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_AIRFARE_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0037', 'FORM','*ERROR* Airfare must be entered.')) ;
--		GO_ITEM('PDRBENE_AIRFARE_CODE');
    RAISE FORM_TRIGGER_FAILURE ;
	END IF;
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_BREL_CODE<>'S' AND :PDRBENE.PDRBENE_MARTL_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0038', 'FORM','*ERROR* Marital status must be entered for beneficiary.'));
--		GO_ITEM('PDRBENE_MARTL_CODE');
    RAISE FORM_TRIGGER_FAILURE ;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		
		@BeforeRowUpdate
		public void pdrbene_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlcMeata = "SELECT 'X' " +
							" FROM pkrvers " +
							" WHERE pkrvers_prod_code = 'MEATA' ";
											DataCursor cMeata = new DataCursor(sqlcMeata);
											NString mEmpElig = toStr("N");
											NString mFamElig = toStr("N");
											NString mMeata= NString.getNull();
				/*	*/
					try {
			
							cMeata.open();
							ResultSet cMeataResults = cMeata.fetchInto();
							if ( cMeataResults != null ) {
								mMeata = cMeataResults.getStr(0);
							}
							cMeata.close();
							String sqlelgbtyChkC = "SELECT pyrperf_emp_elig, pyrperf_fam_elig " +
									" FROM pyrperf " +
									" WHERE rowid = pykatkt.f_pyrperf_rowid(:PIDM) ";
													DataCursor elgbtyChkC = new DataCursor(sqlelgbtyChkC);
							elgbtyChkC.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());		
							elgbtyChkC.open();
							ResultSet elgbtyChkCResults = elgbtyChkC.fetchInto();
							if ( mMeata.equals("X") )
							{
								
								if ( elgbtyChkCResults != null ) {
									mEmpElig = elgbtyChkCResults.getStr(0);
									mFamElig = elgbtyChkCResults.getStr(1);
								}
								
							}

						
						
							elgbtyChkC.close();
						pdrbeneElement.setPdrbeneActivityDate(NDate.getNow());
						if ( mEmpElig.equals("N") && /*pdrbeneElement.getPdrbeneBrelCode().equals("S")*/ pdrbeneElement.getPdrbeneBrelType().equals("E") && pdrbeneElement.getPdrbeneTktElgbty().equals("Y") )
						{
							warningMessage(GNls.Fget(toStr("PYABENE-0034"), toStr("FORM"), toStr("*WARNING* Employee is not eligible for ticket request.")));
						}
						else if ( mFamElig.equals("N") && /*pdrbeneElement.getPdrbeneBrelCode().notEquals("S")*/ pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneTktElgbty().equals("Y") ) {
							warningMessage(GNls.Fget(toStr("PYABENE-0035"), toStr("FORM"), toStr("*WARNING* Dependents are not eligible for ticket request.")));
						}
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneHomeAirport().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0036"), toStr("FORM"), toStr("*ERROR* Home airport must be entered.")));
							// 		GO_ITEM('PDRBENE_HOME_AIRPORT');
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneAirfareCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0037"), toStr("FORM"), toStr("*ERROR* Airfare must be entered.")));
							// 		GO_ITEM('PDRBENE_AIRFARE_CODE');
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && /*pdrbeneElement.getPdrbeneBrelCode().notEquals("S")*/ pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneMartlCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0038"), toStr("FORM"), toStr("*ERROR* Marital status must be entered for beneficiary.")));
							// 		GO_ITEM('PDRBENE_MARTL_CODE');
							
							throw new ApplicationException();
						}
						
						if ( !pdrbeneElement.getMartlCode().isNull() )
						{
							pdrbeneElement.setPdrbeneMartlCode(pdrbeneElement.getMartlCode());
						}
						if ( !pdrbeneElement.getBirthNatn().isNull() )
						{
							pdrbeneElement.setPdrbeneBirthNatn(pdrbeneElement.getBirthNatn());
						}
						if ( !pdrbeneElement.getMartlCode().isNull() )
						{
							pdrbeneElement.setPdrbeneNatnCode(pdrbeneElement.getNatnCode());
						}
						if ( !pdrbeneElement.getPdrbeneElgbtyReason().isNull() && pdrbeneElement.getPdrbeneReasonDate().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0039"), toStr("FORM"), toStr("*ERROR* Ticket cancellation reason date must be entered.")));
							throw new ApplicationException();
						}
						else if ( !pdrbeneElement.getPdrbeneReasonDate().isNull() && pdrbeneElement.getPdrbeneElgbtyReason().isNull() ) {
							errorMessage(GNls.Fget(toStr("PYABENE-0040"), toStr("FORM"), toStr("*ERROR* Ticket cancellation reason must be entered.")));
							throw new ApplicationException();
						}
						else if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneHomeAirport().isNull() ) {
							errorMessage(GNls.Fget(toStr("PYABENE-0041"), toStr("FORM"), toStr("*ERROR* Home Airport must be entered.")));
							throw new ApplicationException();
						}
						else if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneMartlCode().isNull() ) {
							errorMessage(GNls.Fget(toStr("PYABENE-0042"), toStr("FORM"), toStr("*ERROR* Marital status must be entered for beneficiary.")));
							throw new ApplicationException();
						}
					}
					finally{
						cMeata.close();
						//elgbtyChkC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE.KEY-COMMIT
		 IF :MARTL_CODE IS NOT NULL THEN
	:PDRBENE_MARTL_CODE:=:MARTL_CODE;
END IF;
IF :BIRTH_NATN IS NOT NULL THEN
	:PDRBENE_BIRTH_NATN:=:BIRTH_NATN;
END IF;
IF :MARTL_CODE IS NOT NULL THEN
	:PDRBENE_NATN_CODE:=:NATN_CODE;
END IF;
IF :PDRBENE.PDRBENE_ELGBTY_REASON IS NOT NULL AND :PDRBENE.PDRBENE_REASON_DATE IS NULL THEN	
		MESSAGE(  G$_NLS.Get('PYABENE-0039', 'FORM','*ERROR* Ticket cancellation reason date must be entered.')) ;
		GO_ITEM('PDRBENE_REASON_DATE');
    RAISE FORM_TRIGGER_FAILURE ;       
ELSIF :PDRBENE.PDRBENE_REASON_DATE IS NOT NULL AND :PDRBENE.PDRBENE_ELGBTY_REASON IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0040', 'FORM','*ERROR* Ticket cancellation reason must be entered.')) ;
		GO_ITEM('PDRBENE_ELGBTY_REASON');
    RAISE FORM_TRIGGER_FAILURE ;	
ELSIF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_HOME_AIRPORT IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0041', 'FORM','*ERROR* Home Airport must be entered.')) ;
		GO_ITEM('PDRBENE_HOME_AIRPORT');
    RAISE FORM_TRIGGER_FAILURE ; 
ELSIF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_BREL_CODE<>'S' AND :PDRBENE.PDRBENE_MARTL_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0042', 'FORM','*ERROR* Marital status must be entered for beneficiary.')) ;
		GO_ITEM('PDRBENE_MARTL_CODE');
    RAISE FORM_TRIGGER_FAILURE ;
ELSE
		COMMIT;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void pdrbene_Save()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				if ( !pdrbeneElement.getMartlCode().isNull() )
				{
					pdrbeneElement.setPdrbeneMartlCode(pdrbeneElement.getMartlCode());
				}
				if ( !pdrbeneElement.getBirthNatn().isNull() )
				{
					pdrbeneElement.setPdrbeneBirthNatn(pdrbeneElement.getBirthNatn());
				}
				if ( !pdrbeneElement.getMartlCode().isNull() )
				{
					pdrbeneElement.setPdrbeneNatnCode(pdrbeneElement.getNatnCode());
				}
				if ( !pdrbeneElement.getPdrbeneElgbtyReason().isNull() && pdrbeneElement.getPdrbeneReasonDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0039"), toStr("FORM"), toStr("*ERROR* Ticket cancellation reason date must be entered.")));
					goItem(toStr("PDRBENE_REASON_DATE"));
					throw new ApplicationException();
				}
				else if ( !pdrbeneElement.getPdrbeneReasonDate().isNull() && pdrbeneElement.getPdrbeneElgbtyReason().isNull() ) {
					errorMessage(GNls.Fget(toStr("PYABENE-0040"), toStr("FORM"), toStr("*ERROR* Ticket cancellation reason must be entered.")));
					goItem(toStr("PDRBENE_ELGBTY_REASON"));
					throw new ApplicationException();
				}
				else if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneHomeAirport().isNull() ) {
					errorMessage(GNls.Fget(toStr("PYABENE-0041"), toStr("FORM"), toStr("*ERROR* Home Airport must be entered.")));
					goItem(toStr("PDRBENE_HOME_AIRPORT"));
					throw new ApplicationException();
				}
				else if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelCode().notEquals("S") && pdrbeneElement.getPdrbeneMartlCode().isNull() ) {
					errorMessage(GNls.Fget(toStr("PYABENE-0042"), toStr("FORM"), toStr("*ERROR* Marital status must be entered for beneficiary.")));
					goItem(toStr("PDRBENE_MARTL_CODE"));
					throw new ApplicationException();
				}
				else {
					commitTask();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_AGE.KEY-NEXT-ITEM
		 BEGIN
  G$_DATE_NEXT_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AGE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_AGE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneAge_keyNexItem()
		{
			
				getTask().getGoqrpls().gDateNextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_AGE.WHEN-NEW-ITEM-INSTANCE
		    IF GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),ENABLED) = 'FALSE' THEN
      NEXT_ITEM ;
   ELSE
      G$_DATE_WHEN_NEW_ITEM ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AGE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_AGE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneAge_itemChange()
		{
			
				if ( getItemEnabled(getCursorItem()).equals("FALSE") )
				{
					nextItem();
				}
				else {
					getTask().getGoqrpls().gDateWhenNewItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_MARTL_CODE")
		public void pdrbeneMartlCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_MARTL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneMartlCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_MARTL_CODE")
		public void pdrbeneMartlCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_MARTL_CODE")
		public void pdrbeneMartlCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_MARTL_CODE", function=KeyFunction.ITEM_OUT)
		public void pdrbeneMartlCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_MARTL_CODE.KEY-LISTVAL
		 BEGIN
 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_MARTL_CODE','STVMRTL_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_MARTL_CODE');
		IF :PDRBENE.PDRBENE_BREL_CODE='S' THEN
			NEXT_ITEM;
			RETURN;
		ELSE
			:PDRBENE.PDRBENE_MARTL_CODE := :GLOBAL.VALUE;
		END IF;
		
		GO_ITEM('PDRBENE.PDRBENE_MARTL_CODE');
		NEXT_ITEM;
		END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_MARTL_CODE", function=KeyFunction.LIST_VALUES)
		public void pdrbeneMartlCode_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_MARTL_CODE"), toStr("STVMRTL_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_MARTL_CODE"));
					//if ( pdrbeneElement.getPdrbeneBrelCode().equals("S") )
					if ( pdrbeneElement.getPdrbeneBrelType().equals("E") )
					{
						nextItem();
						return ;
					}
					else {
						pdrbeneElement.setPdrbeneMartlCode(getGlobal("VALUE"));
					}
					goItem(toStr("PDRBENE.PDRBENE_MARTL_CODE"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_MARTL_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR MARTL_DESC IS
		SELECT   stvmrtl_desc
    FROM stvmrtl
    WHERE stvmrtl_code=:PDRBENE_MARTL_CODE;
    
  CURSOR MARTL_CODE_CHK IS
		SELECT   'X'
    FROM stvmrtl
    WHERE stvmrtl_code=:PDRBENE_MARTL_CODE;
		
BEGIN
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_BREL_CODE<>'S' AND :PDRBENE.PDRBENE_MARTL_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0043', 'FORM','*ERROR* Marital status must be entered for beneficiary.'));
    RAISE FORM_TRIGGER_FAILURE ;
	END IF;
	IF MARTL_CODE_CHK%ISOPEN THEN
		CLOSE MARTL_CODE_CHK;
	END IF;
	OPEN MARTL_CODE_CHK;
	FETCH MARTL_CODE_CHK INTO M_CHECK;
	CLOSE MARTL_CODE_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_MARTL_CODE IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0044', 'FORM','*ERROR* Marital status; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_MARTL_CODE IS NULL THEN
		:PDRBENE.PDRBENE_MARTL_DESC:=NULL;
	ELSE
		IF MARTL_DESC%ISOPEN THEN
			CLOSE MARTL_DESC;
		END IF;
		OPEN MARTL_DESC;
		FETCH MARTL_DESC INTO :PDRBENE.PDRBENE_MARTL_DESC;
		CLOSE MARTL_DESC;	
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_MARTL_CODE")
		public void pdrbeneMartlCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlmartlDesc = "SELECT stvmrtl_desc " +
	" FROM stvmrtl " +
	" WHERE stvmrtl_code = :PDRBENE_MARTL_CODE ";
					DataCursor martlDesc = new DataCursor(sqlmartlDesc);
					String sqlmartlCodeChk = "SELECT 'X' " +
	" FROM stvmrtl " +
	" WHERE stvmrtl_code = :PDRBENE_MARTL_CODE ";
					DataCursor martlCodeChk = new DataCursor(sqlmartlCodeChk);
					try {
						//if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelCode().notEquals("S") && pdrbeneElement.getPdrbeneMartlCode().isNull() )
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneMartlCode().isNull() )
						
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0043"), toStr("FORM"), toStr("*ERROR* Marital status must be entered for beneficiary.")));
							throw new ApplicationException();
						}
						if ( martlCodeChk.isOpen() )
						{
							martlCodeChk.close();
						}
						//Setting query parameters
						martlCodeChk.addParameter("PDRBENE_MARTL_CODE", pdrbeneElement.getPdrbeneMartlCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable martlCodeChk.
						martlCodeChk.open();
						ResultSet martlCodeChkResults = martlCodeChk.fetchInto();
						if ( martlCodeChkResults != null ) {
							mCheck = martlCodeChkResults.getStr(0);
						}
						martlCodeChk.close();
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneMartlCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0044"), toStr("FORM"), toStr("*ERROR* Marital status; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneMartlCode().isNull() )
						{
							pdrbeneElement.setPdrbeneMartlDesc(toStr(null));
						}
						else {
							if ( martlDesc.isOpen() )
							{
								martlDesc.close();
							}
							//Setting query parameters
							martlDesc.addParameter("PDRBENE_MARTL_CODE", pdrbeneElement.getPdrbeneMartlCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable martlDesc.
							martlDesc.open();
							ResultSet martlDescResults = martlDesc.fetchInto();
							if ( martlDescResults != null ) {
								pdrbeneElement.setPdrbeneMartlDesc(martlDescResults.getStr(0));
							}
							martlDesc.close();
						}
					}
					finally{
						martlCodeChk.close();
						martlDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_MARTL_CODE.KEY-NEXT-ITEM
		 IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_BREL_CODE<>'S' AND :PDRBENE.PDRBENE_MARTL_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0045', 'FORM','*ERROR* Marital status must be entered for beneficiary.'));
    RAISE FORM_TRIGGER_FAILURE ;
END IF;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_MARTL_CODE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneMartlCode_keyNexItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				//if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelCode().notEquals("S") && pdrbeneElement.getPdrbeneMartlCode().isNull() )
				if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneMartlCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0045"), toStr("FORM"), toStr("*ERROR* Marital status must be entered for beneficiary.")));
					throw new ApplicationException();
				}
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_MARTL_CODE_LBT.WHEN-MOUSE-CLICK
		 BEGIN
	NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_MARTL_CODE_LBT")
		@Before
		public void pdrbeneMartlCodeLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_MARTL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_MARTL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneMartlDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_NATN_CODE")
		public void pdrbeneNatnCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneNatnCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_NATN_CODE")
		public void pdrbeneNatnCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_NATN_CODE")
		public void pdrbeneNatnCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_NATN_CODE.KEY-NEXT-ITEM
		 BEGIN
  --G$_SEARCH.CODE_KEY_NEXT_ITEM;
  --G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneNatnCode_keyNexItem()
		{
			
				// G$_SEARCH.CODE_KEY_NEXT_ITEM;
				// G$_CHECK_FAILURE;
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void pdrbeneNatnCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_NATN_CODE.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_NATN_CODE','STVNATN_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_NATN_CODE');
		IF :PDRBENE.PDRBENE_BREL_CODE='S' THEN
			NEXT_ITEM;
			RETURN;
		ELSE
			:PDRBENE.PDRBENE_NATN_CODE := :GLOBAL.VALUE;
		END IF;
		
		GO_ITEM('PDRBENE.PDRBENE_NATN_CODE');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_NATN_CODE", function=KeyFunction.LIST_VALUES)
		public void pdrbeneNatnCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_NATN_CODE"), toStr("STVNATN_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_NATN_CODE"));
					//if ( pdrbeneElement.getPdrbeneBrelCode().equals("S") )
					if ( pdrbeneElement.getPdrbeneBrelType().equals("E") )
					{
						nextItem();
						return ;
					}
					else {
						pdrbeneElement.setPdrbeneNatnCode(getGlobal("VALUE"));
					}
					goItem(toStr("PDRBENE.PDRBENE_NATN_CODE"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_NATN_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR NATN_DESC IS
		SELECT   stvnatn_nation
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_NATN_CODE;
    
  CURSOR NATN_CODE_CHK IS
		SELECT   'X'
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_NATN_CODE;
		
BEGIN
	IF NATN_CODE_CHK%ISOPEN THEN
		CLOSE NATN_CODE_CHK;
	END IF;
	OPEN NATN_CODE_CHK;
	FETCH NATN_CODE_CHK INTO M_CHECK;
	CLOSE NATN_CODE_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_NATN_CODE IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0046', 'FORM','*ERROR* Country; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_NATN_CODE IS NULL THEN
		:PDRBENE_NATN_DESC:=NULL;
	ELSE
		IF NATN_DESC%ISOPEN THEN
			CLOSE NATN_DESC;
		END IF;
		OPEN NATN_DESC;
		FETCH NATN_DESC INTO :PDRBENE_NATN_DESC;
		CLOSE NATN_DESC;
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_NATN_CODE")
		public void pdrbeneNatnCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlnatnDesc = "SELECT stvnatn_nation " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_NATN_CODE ";
					DataCursor natnDesc = new DataCursor(sqlnatnDesc);
					String sqlnatnCodeChk = "SELECT 'X' " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_NATN_CODE ";
					DataCursor natnCodeChk = new DataCursor(sqlnatnCodeChk);
					try {
						if ( natnCodeChk.isOpen() )
						{
							natnCodeChk.close();
						}
						//Setting query parameters
						natnCodeChk.addParameter("PDRBENE_NATN_CODE", pdrbeneElement.getPdrbeneNatnCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable natnCodeChk.
						natnCodeChk.open();
						ResultSet natnCodeChkResults = natnCodeChk.fetchInto();
						if ( natnCodeChkResults != null ) {
							mCheck = natnCodeChkResults.getStr(0);
						}
						natnCodeChk.close();
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneNatnCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0046"), toStr("FORM"), toStr("*ERROR* Country; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneNatnCode().isNull() )
						{
							pdrbeneElement.setPdrbeneNatnDesc(toStr(null));
						}
						else {
							if ( natnDesc.isOpen() )
							{
								natnDesc.close();
							}
							//Setting query parameters
							natnDesc.addParameter("PDRBENE_NATN_CODE", pdrbeneElement.getPdrbeneNatnCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable natnDesc.
							natnDesc.open();
							ResultSet natnDescResults = natnDesc.fetchInto();
							if ( natnDescResults != null ) {
								pdrbeneElement.setPdrbeneNatnDesc(natnDescResults.getStr(0));
							}
							natnDesc.close();
						}
					}
					finally{
						natnCodeChk.close();
						natnDesc.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneNatnDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_BIRTH_NATN")
		public void pdrbeneBirthNatn_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_BIRTH_NATN", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneBirthNatn_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_BIRTH_NATN")
		public void pdrbeneBirthNatn_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_BIRTH_NATN")
		public void pdrbeneBirthNatn_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_BIRTH_NATN.KEY-NEXT-ITEM
		 BEGIN
  --G$_SEARCH.CODE_KEY_NEXT_ITEM;
  --G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_BIRTH_NATN", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneBirthNatn_keyNexItem()
		{
			
				// G$_SEARCH.CODE_KEY_NEXT_ITEM;
				// G$_CHECK_FAILURE;
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_BIRTH_NATN", function=KeyFunction.ITEM_OUT)
		public void pdrbeneBirthNatn_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_BIRTH_NATN.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_BIRTH_NATN','STVNATN_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_BIRTH_NATN');
		IF :PDRBENE.PDRBENE_BREL_CODE='S' THEN
			NEXT_ITEM;
			RETURN;
		ELSE
			:PDRBENE.PDRBENE_BIRTH_NATN := :GLOBAL.VALUE;
		END IF;
		
		GO_ITEM('PDRBENE.PDRBENE_BIRTH_NATN');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_BIRTH_NATN", function=KeyFunction.LIST_VALUES)
		public void pdrbeneBirthNatn_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_BIRTH_NATN"), toStr("STVNATN_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_BIRTH_NATN"));
					//if ( pdrbeneElement.getPdrbeneBrelCode().equals("S") )
					if ( pdrbeneElement.getPdrbeneBrelType().equals("E") )
					{
						nextItem();
						return ;
					}
					else {
						pdrbeneElement.setPdrbeneBirthNatn(getGlobal("VALUE"));
					}
					goItem(toStr("PDRBENE.PDRBENE_BIRTH_NATN"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_BIRTH_NATN.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR NATN_DESC IS
		SELECT   stvnatn_nation
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_BIRTH_NATN;
    
  CURSOR NATN_CODE_CHK IS
		SELECT   'X'
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_BIRTH_NATN;
		
BEGIN
	IF NATN_CODE_CHK%ISOPEN THEN
		CLOSE NATN_CODE_CHK;
	END IF;
	OPEN NATN_CODE_CHK;
	FETCH NATN_CODE_CHK INTO M_CHECK;
	CLOSE NATN_CODE_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_BIRTH_NATN IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0047', 'FORM','*ERROR* Country; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_BIRTH_NATN IS NULL THEN
		:PDRBENE_BIRTH_NATN_DESC:=NULL;
	ELSE
		IF NATN_DESC%ISOPEN THEN
			CLOSE NATN_DESC;
		END IF;
		OPEN NATN_DESC;
		FETCH NATN_DESC INTO :PDRBENE_BIRTH_NATN_DESC;
		CLOSE NATN_DESC;
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_BIRTH_NATN")
		public void pdrbeneBirthNatn_validate()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);


				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlnatnDesc = "SELECT stvnatn_nation " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_BIRTH_NATN ";
					DataCursor natnDesc = new DataCursor(sqlnatnDesc);
					String sqlnatnCodeChk = "SELECT 'X' " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_BIRTH_NATN ";
					DataCursor natnCodeChk = new DataCursor(sqlnatnCodeChk);
					try {
						if ( natnCodeChk.isOpen() )
						{
							natnCodeChk.close();
						}
						
						natnCodeChk.addParameter("PDRBENE_BIRTH_NATN", pdrbeneElement.getPdrbeneBirthNatn());
						
						natnCodeChk.open();
						ResultSet natnCodeChkResults = natnCodeChk.fetchInto();
						if ( natnCodeChkResults != null ) {
							mCheck = natnCodeChkResults.getStr(0);
						}
						natnCodeChk.close();
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneBirthNatn().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0047"), toStr("FORM"), toStr("*ERROR* Country; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneBirthNatn().isNull() )
						{
							pdrbeneElement.setPdrbeneBirthNatnDesc(toStr(null));
						}
						else {
							if ( natnDesc.isOpen() )
							{
								natnDesc.close();
							}
							
							natnDesc.addParameter("PDRBENE_BIRTH_NATN", pdrbeneElement.getPdrbeneBirthNatn());
							
							natnDesc.open();
							ResultSet natnDescResults = natnDesc.fetchInto();
							if ( natnDescResults != null ) {
								pdrbeneElement.setPdrbeneBirthNatnDesc(natnDescResults.getStr(0));
							}
							
						}
					}
					finally{
						natnCodeChk.close();
						natnDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_BIRTH_NATN_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_BIRTH_NATN_LBT")
		@Before
		public void pdrbeneBirthNatnLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_BIRTH_NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_BIRTH_NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneBirthNatnDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_TKT_ELGBTY.WHEN-CHECKBOX-CHANGED
		 DECLARE
		CURSOR elgbty_chk_c IS
		SELECT pyrperf_emp_elig,pyrperf_fam_elig
		FROM pyrperf
		WHERE rowid=pykatkt.f_pyrperf_rowid(:PIDM);
	m_emp_elig		VARCHAR2(1);
	m_fam_elig		VARCHAR2(1);
BEGIN	
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN	
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
	ELSE
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_ELGBTY_REASON',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
		SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
	  SET_ITEM_INSTANCE_PROPERTY('PDRBENE_REASON_DATE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
	END IF;	

	IF elgbty_chk_c%ISOPEN THEN
		CLOSE elgbty_chk_c;
	END IF;
	OPEN elgbty_chk_c;
	FETCH elgbty_chk_c INTO m_emp_elig,m_fam_elig;
	CLOSE elgbty_chk_c;

	IF m_emp_elig='N' AND :PDRBENE.PDRBENE_BREL_CODE='S'AND :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0054', 'FORM','*WARNING* Employee is not eligible for ticket request.')) ;
	ELSIF m_fam_elig='N' AND :PDRBENE.PDRBENE_BREL_CODE<>'S'AND :PDRBENE.PDRBENE_TKT_ELGBTY='Y' THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0055', 'FORM','*WARNING* Dependents are not eligible for ticket request.')) ;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_TKT_ELGBTY.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="PDRBENE_TKT_ELGBTY")
		public void pdrbeneTktElgbty_checkBoxChange()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				

				int rowCount = 0;
				{
					String sqlelgbtyChkC = "SELECT pyrperf_emp_elig, pyrperf_fam_elig " +
	" FROM pyrperf " +
	" WHERE rowid = pykatkt.f_pyrperf_rowid(:PIDM) ";
					DataCursor elgbtyChkC = new DataCursor(sqlelgbtyChkC);
					NString mEmpElig= toStr("N");
					NString mFamElig= toStr("N");
					
					String sqlcMeata = "SELECT 'X' " +
							" FROM pkrvers " +
							" WHERE pkrvers_prod_code = 'MEATA' ";
											DataCursor cMeata = new DataCursor(sqlcMeata);
											NString mMeata= NString.getNull();
					try {
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") )
						{
							setItemInsertAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, false);
							setItemInsertAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
							setItemUpdateAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
							setItemEnabled("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, false);
						}
						else {
							setItemInsertAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_ELGBTY_REASON", ItemServices.CURRENT_RECORD, true);
							setItemInsertAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
							setItemUpdateAllowed("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
							setItemEnabled("PDRBENE_REASON_DATE", ItemServices.CURRENT_RECORD, true);
						}
						cMeata.open();
						
						ResultSet cMeataResults = cMeata.fetchInto();
						if ( cMeataResults != null ) {
							mMeata = cMeataResults.getStr(0);
						}
						cMeata.close();
						if ( mMeata.equals("X") )
						{
							//formsDDL(toStr("SELECT pyrperf_emp_elig,pyrperf_fam_elig INTO ").append(mEmpElig).append(",").append(mFamElig).append(" FROM pyrperf WHERE rowid=pykatkt.f_pyrperf_rowid").append("(").append(getFormModel().getKeyBlock().getPidm()).append(")"));
							
							//Setting query parameters
							elgbtyChkC.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
							ResultSet elgbtyChkCResults = elgbtyChkC.fetchInto();
							if ( elgbtyChkCResults != null ) {
								mEmpElig = elgbtyChkCResults.getStr(0);
								mFamElig = elgbtyChkCResults.getStr(1);
							}
							
						}
						
						if ( mEmpElig.equals("N") && pdrbeneElement.getPdrbeneBrelType().equals("E") && pdrbeneElement.getPdrbeneTktElgbty().equals("Y") )
						{
							warningMessage(GNls.Fget(toStr("PYABENE-0048"), toStr("FORM"), toStr("*WARNING* Employee is not eligible for ticket request.")));
						}
						else if ( mFamElig.equals("N") && pdrbeneElement.getPdrbeneBrelType().notEquals("E") && pdrbeneElement.getPdrbeneTktElgbty().equals("Y") ) {
							warningMessage(GNls.Fget(toStr("PYABENE-0049"), toStr("FORM"), toStr("*WARNING* Dependents are not eligible for ticket request.")));
						}
					}
					finally{
						cMeata.close();
						elgbtyChkC.close();
					}
					
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_AIRFARE_CODE.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_AIRFARE_CODE','GYVTYP2_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_AIRFARE_CODE');
		
		:PDRBENE.PDRBENE_AIRFARE_CODE := :GLOBAL.VALUE;
		
		GO_ITEM('PDRBENE.PDRBENE_AIRFARE_CODE');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AIRFARE_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_AIRFARE_CODE", function=KeyFunction.LIST_VALUES)
		public void pdrbeneAirfareCode_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_AIRFARE_CODE"), toStr("GYVTYP2_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_AIRFARE_CODE"));
					pdrbeneElement.setPdrbeneAirfareCode(getGlobal("VALUE"));
					goItem(toStr("PDRBENE.PDRBENE_AIRFARE_CODE"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_AIRFARE_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR AIRFARE_DESC IS
		SELECT   gyvcode_desc
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_AIRFARE_CODE
    AND gyvcode_type_code='TYPE7'
    AND gyvcode_ind='A';
    
  CURSOR AIRFARE_CODE_CHK IS
		SELECT   'X'
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_AIRFARE_CODE
    AND gyvcode_type_code='TYPE7'
    AND gyvcode_ind='A';
		
BEGIN
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_AIRFARE_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0048', 'FORM','*ERROR* Airfare must be entered.')) ;
    RAISE FORM_TRIGGER_FAILURE ;
	END IF;
	IF AIRFARE_CODE_CHK%ISOPEN THEN
		CLOSE AIRFARE_CODE_CHK;
	END IF;
	OPEN AIRFARE_CODE_CHK;
	FETCH AIRFARE_CODE_CHK INTO M_CHECK;
	CLOSE AIRFARE_CODE_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_AIRFARE_CODE IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0049', 'FORM','*ERROR* Airfare type; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_AIRFARE_CODE IS NULL THEN
		:PDRBENE_AIRFARE_DESC:=NULL;
	ELSE
		IF AIRFARE_DESC%ISOPEN THEN
			CLOSE AIRFARE_DESC;
		END IF;
		OPEN AIRFARE_DESC;
		FETCH AIRFARE_DESC INTO :PDRBENE_AIRFARE_DESC;
		CLOSE AIRFARE_DESC;
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AIRFARE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_AIRFARE_CODE")
		public void pdrbeneAirfareCode_validate()
		{
			

				//
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlairfareDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_AIRFARE_CODE AND gyvcode_type_code = 'TYPE7' AND gyvcode_ind = 'A' ";
					DataCursor airfareDesc = new DataCursor(sqlairfareDesc);
					String sqlairfareCodeChk = "SELECT 'X' " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_AIRFARE_CODE AND gyvcode_type_code = 'TYPE7' AND gyvcode_ind = 'A' ";
					DataCursor airfareCodeChk = new DataCursor(sqlairfareCodeChk);
					try {
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneAirfareCode().isNull() )
						{
							
							errorMessage(GNls.Fget(toStr("PYABENE-0050"), toStr("FORM"), toStr("*ERROR* Airfare must be entered.")));
							throw new ApplicationException();
						}
						if ( airfareCodeChk.isOpen() )
						{
							airfareCodeChk.close();
						}
						//
						airfareCodeChk.addParameter("PDRBENE_AIRFARE_CODE", pdrbeneElement.getPdrbeneAirfareCode());
						
						airfareCodeChk.open();
						ResultSet airfareCodeChkResults = airfareCodeChk.fetchInto();
						if ( airfareCodeChkResults != null ) {
							mCheck = airfareCodeChkResults.getStr(0);
						}
						airfareCodeChk.close();
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneAirfareCode().isNull() )
						{
							
							errorMessage(GNls.Fget(toStr("PYABENE-0051"), toStr("FORM"), toStr("*ERROR* Airfare type; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneAirfareCode().isNull() )
						{
							pdrbeneElement.setPdrbeneAirfareDesc(toStr(null));
						}
						else {
							if ( airfareDesc.isOpen() )
							{
								airfareDesc.close();
							}
							
							airfareDesc.addParameter("PDRBENE_AIRFARE_CODE", pdrbeneElement.getPdrbeneAirfareCode());
							
							airfareDesc.open();
							ResultSet airfareDescResults = airfareDesc.fetchInto();
							if ( airfareDescResults != null ) {
								pdrbeneElement.setPdrbeneAirfareDesc(airfareDescResults.getStr(0));
							}
							
						}
					}
					finally{
						airfareCodeChk.close();
						airfareDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_AIRFARE_CODE.KEY-NEXT-ITEM
		 IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_AIRFARE_CODE IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0050', 'FORM','*ERROR* Airfare must be entered.')) ;
    RAISE FORM_TRIGGER_FAILURE ;
END IF;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AIRFARE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_AIRFARE_CODE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneAirfareCode_keyNexItem()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneAirfareCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0050"), toStr("FORM"), toStr("*ERROR* Airfare must be entered.")));
					throw new ApplicationException();
				}
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_AIRFARE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_AIRFARE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneAirfareDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_HOME_AIRPORT")
		public void pdrbeneHomeAirport_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_HOME_AIRPORT", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneHomeAirport_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_HOME_AIRPORT")
		public void pdrbeneHomeAirport_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_HOME_AIRPORT")
		public void pdrbeneHomeAirport_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_HOME_AIRPORT", function=KeyFunction.ITEM_OUT)
		public void pdrbeneHomeAirport_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_AIRPORT.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_HOME_AIRPORT','GYVTYP1_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_HOME_AIRPORT');
		
		:PDRBENE.PDRBENE_HOME_AIRPORT := :GLOBAL.VALUE;
		
		GO_ITEM('PDRBENE.PDRBENE_HOME_AIRPORT');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_HOME_AIRPORT", function=KeyFunction.LIST_VALUES)
		public void pdrbeneHomeAirport_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_HOME_AIRPORT"), toStr("GYVTYP1_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_HOME_AIRPORT"));
					pdrbeneElement.setPdrbeneHomeAirport(getGlobal("VALUE"));
					goItem(toStr("PDRBENE.PDRBENE_HOME_AIRPORT"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_AIRPORT.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR HOME_AIRPORT_DESC IS
		SELECT   gyvcode_desc
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_HOME_AIRPORT
    AND gyvcode_type_code='TYPE1'
    AND gyvcode_ind='A';
    
  CURSOR HOME_AIRPORT_CHK IS
		SELECT   'X'
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_HOME_AIRPORT
    AND gyvcode_type_code='TYPE1'
    AND gyvcode_ind='A';
		
BEGIN
	IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_HOME_AIRPORT IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0051', 'FORM','*ERROR* Home airport must be entered.')) ;
    RAISE FORM_TRIGGER_FAILURE ;
	END IF;
	IF HOME_AIRPORT_CHK%ISOPEN THEN
		CLOSE HOME_AIRPORT_CHK;
	END IF;
	OPEN HOME_AIRPORT_CHK;
	FETCH HOME_AIRPORT_CHK INTO M_CHECK;
	CLOSE HOME_AIRPORT_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_HOME_AIRPORT IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0052', 'FORM','*ERROR* Airport code; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_HOME_AIRPORT IS NULL THEN
		:PDRBENE_HOME_AIRPORT_DESC:=NULL;
	ELSE
		IF HOME_AIRPORT_DESC%ISOPEN THEN
			CLOSE HOME_AIRPORT_DESC;
		END IF;
		OPEN HOME_AIRPORT_DESC;
		FETCH HOME_AIRPORT_DESC INTO :PDRBENE_HOME_AIRPORT_DESC;
		CLOSE HOME_AIRPORT_DESC;
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_HOME_AIRPORT")
		public void pdrbeneHomeAirport_validate()
		{
			

			
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if (pdrbeneElement == null)
					return;

				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlhomeAirportDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_HOME_AIRPORT AND gyvcode_type_code = 'TYPE1' AND gyvcode_ind = 'A' ";
					DataCursor homeAirportDesc = new DataCursor(sqlhomeAirportDesc);
					String sqlhomeAirportChk = "SELECT 'X' " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_HOME_AIRPORT AND gyvcode_type_code = 'TYPE1' AND gyvcode_ind = 'A' ";
					DataCursor homeAirportChk = new DataCursor(sqlhomeAirportChk);
					try {
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneHomeAirport().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0053"), toStr("FORM"), toStr("*ERROR* Home airport must be entered.")));
							throw new ApplicationException();
						}
						if ( homeAirportChk.isOpen() )
						{
							homeAirportChk.close();
						}
					
						homeAirportChk.addParameter("PDRBENE_HOME_AIRPORT", pdrbeneElement.getPdrbeneHomeAirport());
					
						homeAirportChk.open();
						ResultSet homeAirportChkResults = homeAirportChk.fetchInto();
						if ( homeAirportChkResults != null ) {
							mCheck = homeAirportChkResults.getStr(0);
						}
						homeAirportChk.close();
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneHomeAirport().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0054"), toStr("FORM"), toStr("*ERROR* Airport code; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneHomeAirport().isNull() )
						{
							pdrbeneElement.setPdrbeneHomeAirportDesc(toStr(null));
						}
						else {
							if ( homeAirportDesc.isOpen() )
							{
								homeAirportDesc.close();
							}
							
							homeAirportDesc.addParameter("PDRBENE_HOME_AIRPORT", pdrbeneElement.getPdrbeneHomeAirport());
							
							homeAirportDesc.open();
							ResultSet homeAirportDescResults = homeAirportDesc.fetchInto();
							if ( homeAirportDescResults != null ) {
								pdrbeneElement.setPdrbeneHomeAirportDesc(homeAirportDescResults.getStr(0));
							}
							
						}
					}
					finally{
						homeAirportChk.close();
						homeAirportDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_AIRPORT.KEY-NEXT-ITEM
		 IF :PDRBENE.PDRBENE_TKT_ELGBTY='Y' AND :PDRBENE.PDRBENE_HOME_AIRPORT IS NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0053', 'FORM','*ERROR* Home airport must be entered.')) ;
    RAISE FORM_TRIGGER_FAILURE ;
END IF;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_HOME_AIRPORT", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneHomeAirport_keyNexItem()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				if ( pdrbeneElement.getPdrbeneTktElgbty().equals("Y") && pdrbeneElement.getPdrbeneHomeAirport().isNull() )
				{
					errorMessage(GNls.Fget(toStr("PYABENE-0055"), toStr("FORM"), toStr("*ERROR* Home airport must be entered.")));
					throw new ApplicationException();
				}
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_AIRPORT_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_HOME_AIRPORT_LBT")
		@Before
		public void pdrbeneHomeAirportLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_AIRPORT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_HOME_AIRPORT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneHomeAirportDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_HOME_NATN")
		public void pdrbeneHomeNatn_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_HOME_NATN", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneHomeNatn_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_HOME_NATN")
		public void pdrbeneHomeNatn_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_HOME_NATN")
		public void pdrbeneHomeNatn_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_NATN.KEY-NEXT-ITEM
		 BEGIN
  --G$_SEARCH.CODE_KEY_NEXT_ITEM;
  --G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_HOME_NATN", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneHomeNatn_keyNexItem()
		{
			
				// G$_SEARCH.CODE_KEY_NEXT_ITEM;
				// G$_CHECK_FAILURE;
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_HOME_NATN", function=KeyFunction.ITEM_OUT)
		public void pdrbeneHomeNatn_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_NATN.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_HOME_NATN','STVNATN_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_HOME_NATN');
		
		:PDRBENE.PDRBENE_HOME_NATN := :GLOBAL.VALUE;
		
		GO_ITEM('PDRBENE.PDRBENE_HOME_NATN');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_HOME_NATN", function=KeyFunction.LIST_VALUES)
		public void pdrbeneHomeNatn_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_HOME_NATN"), toStr("STVNATN_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_HOME_NATN"));
					pdrbeneElement.setPdrbeneHomeNatn(getGlobal("VALUE"));
					goItem(toStr("PDRBENE.PDRBENE_HOME_NATN"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_NATN.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR NATN_DESC IS
		SELECT   stvnatn_nation
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_HOME_NATN;
    
  CURSOR NATN_CODE_CHK IS
		SELECT   'X'
    FROM stvnatn
    WHERE stvnatn_code=:PDRBENE_HOME_NATN;
		
BEGIN
	IF NATN_CODE_CHK%ISOPEN THEN
		CLOSE NATN_CODE_CHK;
	END IF;
	OPEN NATN_CODE_CHK;
	FETCH NATN_CODE_CHK INTO M_CHECK;
	CLOSE NATN_CODE_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_HOME_NATN IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0056', 'FORM','*ERROR* Country; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;
	
	IF :PDRBENE_HOME_NATN IS NULL THEN
		:PDRBENE_HOME_NATN_DESC:=NULL;
	ELSE
		IF NATN_DESC%ISOPEN THEN
			CLOSE NATN_DESC;
		END IF;
		OPEN NATN_DESC;
		FETCH NATN_DESC INTO :PDRBENE_HOME_NATN_DESC;
		CLOSE NATN_DESC;
	END IF;	
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_HOME_NATN")
		public void pdrbeneHomeNatn_validate()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlnatnDesc = "SELECT stvnatn_nation " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_HOME_NATN ";
					DataCursor natnDesc = new DataCursor(sqlnatnDesc);
					String sqlnatnCodeChk = "SELECT 'X' " +
	" FROM stvnatn " +
	" WHERE stvnatn_code = :PDRBENE_HOME_NATN ";
					DataCursor natnCodeChk = new DataCursor(sqlnatnCodeChk);
					try {
						if ( natnCodeChk.isOpen() )
						{
							natnCodeChk.close();
						}
						
						natnCodeChk.addParameter("PDRBENE_HOME_NATN", pdrbeneElement.getPdrbeneHomeNatn());
						
						natnCodeChk.open();
						ResultSet natnCodeChkResults = natnCodeChk.fetchInto();
						if ( natnCodeChkResults != null ) {
							mCheck = natnCodeChkResults.getStr(0);
						}
						
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneHomeNatn().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0056"), toStr("FORM"), toStr("*ERROR* Country; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneHomeNatn().isNull() )
						{
							pdrbeneElement.setPdrbeneHomeNatnDesc(toStr(null));
						}
						else {
							if ( natnDesc.isOpen() )
							{
								natnDesc.close();
							}
							
							natnDesc.addParameter("PDRBENE_HOME_NATN", pdrbeneElement.getPdrbeneHomeNatn());
							
							natnDesc.open();
							ResultSet natnDescResults = natnDesc.fetchInto();
							if ( natnDescResults != null ) {
								pdrbeneElement.setPdrbeneHomeNatnDesc(natnDescResults.getStr(0));
							}
							
						}
					}
					finally{
						natnCodeChk.close();
						natnDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_HOME_NATN_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_HOME_NATN_LBT")
		@Before
		public void pdrbeneHomeNatnLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_HOME_NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_HOME_NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneHomeNatnDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PDRBENE_ELGBTY_REASON")
		public void pdrbeneElgbtyReason_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_ELGBTY_REASON", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneElgbtyReason_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PDRBENE_ELGBTY_REASON")
		public void pdrbeneElgbtyReason_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PDRBENE_ELGBTY_REASON")
		public void pdrbeneElgbtyReason_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_ELGBTY_REASON.KEY-NEXT-ITEM
		 BEGIN
 -- G$_SEARCH.CODE_KEY_NEXT_ITEM;
 -- G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_ELGBTY_REASON", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneElgbtyReason_keyNexItem()
		{
			
				//  G$_SEARCH.CODE_KEY_NEXT_ITEM;
				//  G$_CHECK_FAILURE;
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_ELGBTY_REASON", function=KeyFunction.ITEM_OUT)
		public void pdrbeneElgbtyReason_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_ELGBTY_REASON.KEY-LISTVAL
		 		:GLOBAL.VALUE := NULL;
		G$_DISPLAY_LOV('PDRBENE.PDRBENE_ELGBTY_REASON','GYVTYP3_LOV','N');
	
		G$_CHECK_FAILURE;
		IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
		
		GO_ITEM('PDRBENE.PDRBENE_ELGBTY_REASON');
		
		IF :PDRBENE.PDRBENE_TKT_ELGBTY='N' THEN	
			:PDRBENE.PDRBENE_ELGBTY_REASON := :GLOBAL.VALUE;
		ELSE
			NEXT_ITEM;
			RETURN;
		END IF;	
		
		:PDRBENE.PDRBENE_ELGBTY_REASON := :GLOBAL.VALUE;
		
		GO_ITEM('PDRBENE.PDRBENE_ELGBTY_REASON');
		NEXT_ITEM;
		END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="PDRBENE_ELGBTY_REASON", function=KeyFunction.LIST_VALUES)
		public void pdrbeneElgbtyReason_ListValues()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				setGlobal("VALUE", toStr(null));
				getTask().getGoqrpls().gDisplayLov(toStr("PDRBENE.PDRBENE_ELGBTY_REASON"), toStr("GYVTYP3_LOV"), toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
				if ((!getGlobal("VALUE").isNull()))
				{
					goItem(toStr("PDRBENE.PDRBENE_ELGBTY_REASON"));
					if ( pdrbeneElement.getPdrbeneTktElgbty().equals("N") )
					{
						pdrbeneElement.setPdrbeneElgbtyReason(getGlobal("VALUE"));
					}
					else {
						nextItem();
						return ;
					}
					pdrbeneElement.setPdrbeneElgbtyReason(getGlobal("VALUE"));
					goItem(toStr("PDRBENE.PDRBENE_ELGBTY_REASON"));
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_ELGBTY_REASON.WHEN-VALIDATE-ITEM
		 DECLARE
M_CHECK		VARCHAR2(1);
	CURSOR ELGBTY_REASON_CHK IS
		SELECT   'X'
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_ELGBTY_REASON
    AND gyvcode_type_code='TYPE3'
    AND gyvcode_ind='A';
	CURSOR ELGBTY_REASON_DESC IS
		SELECT   gyvcode_desc
    FROM gyvcode,gyvtype
    WHERE gyvcode_type_code=gyvtype_type_code
    AND gyvcode_code=:PDRBENE_ELGBTY_REASON
    AND gyvcode_type_code='TYPE3'
    AND gyvcode_ind='A';		
BEGIN
	IF ELGBTY_REASON_CHK%ISOPEN THEN
		CLOSE ELGBTY_REASON_CHK;
	END IF;
	OPEN ELGBTY_REASON_CHK;
	FETCH ELGBTY_REASON_CHK INTO M_CHECK;
	CLOSE ELGBTY_REASON_CHK;	
	
	IF M_CHECK IS NULL AND :PDRBENE_ELGBTY_REASON IS NOT NULL THEN
		MESSAGE(  G$_NLS.Get('PYABENE-0057', 'FORM','*ERROR* Ticket cancellation reason code; Invalid Value.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
  END IF;	
	
	IF :PDRBENE_ELGBTY_REASON IS NULL THEN
		:PDRBENE_ELGBTY_REASON_DESC:=NULL;
	ELSE
		IF ELGBTY_REASON_DESC%ISOPEN THEN
			CLOSE ELGBTY_REASON_DESC;
		END IF;
		OPEN ELGBTY_REASON_DESC;
		FETCH ELGBTY_REASON_DESC INTO :PDRBENE_ELGBTY_REASON_DESC;
		CLOSE ELGBTY_REASON_DESC;	
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PDRBENE_ELGBTY_REASON")
		public void pdrbeneElgbtyReason_validate()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				int rowCount = 0;
				{
					NString mCheck= NString.getNull();
					String sqlelgbtyReasonChk = "SELECT 'X' " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_ELGBTY_REASON AND gyvcode_type_code = 'TYPE3' AND gyvcode_ind = 'A' ";
					DataCursor elgbtyReasonChk = new DataCursor(sqlelgbtyReasonChk);
					String sqlelgbtyReasonDesc = "SELECT gyvcode_desc " +
	" FROM gyvcode, gyvtype " +
	" WHERE gyvcode_type_code = gyvtype_type_code AND gyvcode_code = :PDRBENE_ELGBTY_REASON AND gyvcode_type_code = 'TYPE3' AND gyvcode_ind = 'A' ";
					DataCursor elgbtyReasonDesc = new DataCursor(sqlelgbtyReasonDesc);
					try {
						if ( elgbtyReasonChk.isOpen() )
						{
							elgbtyReasonChk.close();
						}
						
						elgbtyReasonChk.addParameter("PDRBENE_ELGBTY_REASON", pdrbeneElement.getPdrbeneElgbtyReason());
						
						elgbtyReasonChk.open();
						ResultSet elgbtyReasonChkResults = elgbtyReasonChk.fetchInto();
						if ( elgbtyReasonChkResults != null ) {
							mCheck = elgbtyReasonChkResults.getStr(0);
						}
						
						if ( mCheck.isNull() && !pdrbeneElement.getPdrbeneElgbtyReason().isNull() )
						{
							errorMessage(GNls.Fget(toStr("PYABENE-0057"), toStr("FORM"), toStr("*ERROR* Ticket cancellation reason code; Invalid Value.")));
							throw new ApplicationException();
						}
						if ( pdrbeneElement.getPdrbeneElgbtyReason().isNull() )
						{
							pdrbeneElement.setPdrbeneElgbtyReasonDesc(toStr(null));
						}
						else {
							if ( elgbtyReasonDesc.isOpen() )
							{
								elgbtyReasonDesc.close();
							}
							
							elgbtyReasonDesc.addParameter("PDRBENE_ELGBTY_REASON", pdrbeneElement.getPdrbeneElgbtyReason());
							
							elgbtyReasonDesc.open();
							ResultSet elgbtyReasonDescResults = elgbtyReasonDesc.fetchInto();
							if ( elgbtyReasonDescResults != null ) {
								pdrbeneElement.setPdrbeneElgbtyReasonDesc(elgbtyReasonDescResults.getStr(0));
							}
							
						}
					}
					finally{
						elgbtyReasonChk.close();
						elgbtyReasonDesc.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_ELGBTY_REASON_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_ELGBTY_REASON_LBT")
		@Before
		public void pdrbeneElgbtyReasonLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ELGBTY_REASON_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_ELGBTY_REASON_DESC", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneElgbtyReasonDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_REASON_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_REASON_DATE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneReasonDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_REASON_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_REASON_DATE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneReasonDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_REASON_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_REASON_DATE", function=KeyFunction.ITEM_OUT)
		public void pdrbeneReasonDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_REASON_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PDRBENE_REASON_DATE_DBT")
		@Before
		public void pdrbeneReasonDateDbt_click()
		{
			
			getGCalendarBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER PDRBENE_REASON_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('PYABENE-0058','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
IF :PDRBENE.PDRBENE_TKT_ELGBTY='N' THEN	
		IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF; 
ELSE
		NEXT_ITEM;
		RETURN;
		
END IF;	
  <multilinecomment>  IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  </multilinecomment>
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('PYABENE-0059','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_REASON_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PDRBENE_REASON_DATE_DBT")
		public void pdrbeneReasonDateDbt_buttonClick()
		{
			

				
				PdrbeneAdapter pdrbeneElement = (PdrbeneAdapter)this.getFormModel().getPdrbene().getRowAdapter(true);
				if(pdrbeneElement == null)
					return;

				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("PYABENE-0058"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));

					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (getItemUpdateNull(currentBlockFld).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
						
					{
						
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
						copy(getCursorValue(),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( pdrbeneElement.getPdrbeneTktElgbty().equals("N") )
						{
							if ( !getNameIn("GLOBAL.VALUE").isNull() )
							{
								copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
								copy("","GLOBAL.VALUE");
								executeAction(KeyFunction.NEXT_ITEM);
							}
						}
						else {
							nextItem();
							return ;
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("PYABENE-0059"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PDRBENE_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void pdrbeneActivityDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PDRBENE_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void pdrbeneActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PDRBENE_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PDRBENE_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void pdrbeneActivityDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
	
	
}

