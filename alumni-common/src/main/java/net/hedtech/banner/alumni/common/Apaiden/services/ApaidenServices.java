package net.hedtech.banner.alumni.common.Apaiden.services;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;



public class ApaidenServices extends AbstractSupportCodeObject{
	
	
	


	
	public ApaidenServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public ApaidenTask  getTask() {
		return (ApaidenTask )super.getContainer();
	}

	
	public net.hedtech.banner.alumni.common.Apaiden.model.ApaidenModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit SELECT_SPRADDR_4
	
	   FUNCTION SELECT_SPRADDR_4
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR.ROWID <> :SPRADDR.ROWID
           AND  SPRADDR.SPRADDR_PIDM = :KEY_BLOCK.PIDM
           AND  SPRADDR.SPRADDR_ATYP_CODE =
              :SPRADDR.SPRADDR_ATYP_CODE
           AND  SPRADDR.SPRADDR_STATUS_IND IS NULL
           AND  ((SPRADDR_TO_DATE IS NULL
           AND  SPRADDR_FROM_DATE IS NULL)
            OR  ((NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)))
            OR  (NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))))
            OR  ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)))
            OR  (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN
                NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)) AND
                NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))))) ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:5192
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool selectSpraddr4(SpraddrAdapter spraddrElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR.ROWID <> :SPRADDR_ROWID AND SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR ((NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))))) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("SPRADDR_ROWID", spraddrElement.getROWID());
				ptiCursor.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
				ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return ((toBool(ptiCursor.notFound())));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_APTADDR_IN_USE
	
	FUNCTION SELECT_APTADDR_IN_USE 
RETURN BOOLEAN 
IS
BEGIN
		-- PLU-LWS 7.2.1 Moved logic to database package.
   :APTADDR_HEADER.ADDR_IN_USE_PIDM := NULL;
   :APTADDR_HEADER.ADDR_IN_USE_USER := NULL;
   :APTADDR_HEADER.ADDR_IN_USE_NAME_LF30 := NULL;
   
   aokhhld.P_APTADDR_IN_USE(:KEY_BLOCK.PIDM,
                            :SPRADDR.SPRADDR_ATYP_CODE,
                            :APTADDR_HEADER.ADDR_IN_USE_PIDM,
                            :APTADDR_HEADER.ADDR_IN_USE_USER,
                            :APTADDR_HEADER.ADDR_IN_USE_NAME_LF30);
   
   RETURN (:APTADDR_HEADER.ADDR_IN_USE_PIDM IS NOT NULL);
END;
	*/
	//ID:5193
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool selectAptaddrInUse(SpraddrAdapter spraddrElement)
		{
			//  PLU-LWS 7.2.1 Moved logic to database package.
			getFormModel().getAptaddrHeader().setAddrInUsePidm(toStr(null));
			getFormModel().getAptaddrHeader().setAddrInUseUser(toStr(null));
			getFormModel().getAptaddrHeader().setAddrInUseNameLf30(toStr(null));
			Ref<NNumber> pidm_out_ref = new Ref<NNumber>(toNumber(getFormModel().getAptaddrHeader().getAddrInUsePidm()));
			Ref<NString> user_out_ref = new Ref<NString>(getFormModel().getAptaddrHeader().getAddrInUseUser());
			Ref<NString> name_out_ref = new Ref<NString>(getFormModel().getAptaddrHeader().getAddrInUseNameLf30());
			Aokhhld.pAptaddrInUse(getFormModel().getKeyBlock().getPidm(), spraddrElement.getSpraddrAtypCode(), pidm_out_ref, user_out_ref, name_out_ref);
			getFormModel().getAptaddrHeader().setAddrInUsePidm(toStr(pidm_out_ref.val));
			getFormModel().getAptaddrHeader().setAddrInUseUser(user_out_ref.val);
			getFormModel().getAptaddrHeader().setAddrInUseNameLf30(name_out_ref.val);
			return (toBool(!getFormModel().getAptaddrHeader().getAddrInUsePidm().isNull()));
		}

	
	/* Original PL/SQL code for Prog Unit REMOVE_HOUSEHOLD_TEMP_RECS
	
	PROCEDURE REMOVE_HOUSEHOLD_TEMP_RECS IS
	-- PLU-LWS 01/28/2005
	-- Household Enhancement
	--
	-- Clean-up or prepare to add new records using current session ID
	--
	-- Makes sure current session has no records in the temporary table
	-- and will also delete any records from sessions that are inactive
	-- (not in v$session).  This should maintain a very clean temporary 
	-- table.
  blk_id   Block;
  err_out  varchar2(1) := '0';
BEGIN
	blk_id := FIND_BLOCK('APTADDR');
	 
	IF NOT ID_NULL(blk_id) THEN
	 	  -- Save any indicators that haven't been saved yet.
      IF GET_BLOCK_PROPERTY(blk_id, STATUS) = 'CHANGED'  THEN
          DO_SILENT_COMMIT;
      END IF;
      SET_BLOCK_PROPERTY(blk_id, DELETE_ALLOWED, PROPERTY_TRUE);
      SET_BLOCK_PROPERTY(blk_id, INSERT_ALLOWED, PROPERTY_TRUE);
	END IF;
	-- PLU-LWS 7.2.1 Moved logic to database package.
  -- Clean-up temporary record table if there are any to clean-up
 	aokhhld.P_APTADDR_CLEAN_UP('CURRENT', err_out);
 	if err_out = '1' then
     DO_SILENT_COMMIT;
  end if;
     
  -- PLU-LWS 7.2.1 Moved logic to database package.
  -- Check to see if there are any records a week old and, if so, delete them.
  -- We want to keep this table as clean as possible
  aokhhld.P_APTADDR_CLEAN_UP('STALE', err_out);
  if err_out = '1' then
     DO_SILENT_COMMIT;
  end if;
END;
	*/
	//ID:5194
	/* <p>
/* </p>
		*/
		public void removeHouseholdTempRecs()
		{
			//  PLU-LWS 01/28/2005
			//  Household Enhancement
			// 
			//  Clean-up or prepare to add new records using current session ID
			// 
			//  Makes sure current session has no records in the temporary table
			//  and will also delete any records from sessions that are inactive
			//  (not in v$session).  This should maintain a very clean temporary 
			//  table.
			BlockDescriptor blkId= null;
			NString errOut = toStr("0");
			blkId = findBlock("APTADDR");
			if ( !(blkId == null) )
			{
				//  Save any indicators that haven't been saved yet.
				//if ( getBlockStatus(blkId).equals("CHANGED") )
				if ( getBlockStatus("APTADDR").equals("CHANGED") )
				{
					doSilentCommit();
				}
				setBlockDeleteAllowed(blkId, true);
				setBlockInsertAllowed(blkId, true);
			}
			//  PLU-LWS 7.2.1 Moved logic to database package.
			//  Clean-up temporary record table if there are any to clean-up
			Ref<NString> err_out_ref = new Ref<NString>(errOut);
			Aokhhld.pAptaddrCleanUp(toStr("CURRENT"), err_out_ref);
			errOut = err_out_ref.val;
			if ( errOut.equals("1") )
			{
				doSilentCommit();
			}
			//  PLU-LWS 7.2.1 Moved logic to database package.
			//  Check to see if there are any records a week old and, if so, delete them.
			//  We want to keep this table as clean as possible
			err_out_ref = new Ref<NString>(errOut);
			Aokhhld.pAptaddrCleanUp(toStr("STALE"), err_out_ref);
			errOut = err_out_ref.val;
			if ( errOut.equals("1") )
			{
				doSilentCommit();
			}
		}

	
	/* Original PL/SQL code for Prog Unit PROCESS_HOUSEHOLD_ADDR_RECS
	
	PROCEDURE PROCESS_HOUSEHOLD_ADDR_RECS IS
   msg_out                VARCHAR2(200);
   err_out                VARCHAR2(1);  -- '0' -- no errors; '1' - do silent commit; > '4' Raise error
BEGIN
	      -- PLU-LWS 7.2.1 Moved logic to database package.
	      aokhhld.p_process_household_addr_recs(:KEY_BLOCK.PIDM, 
	                                            :SPRADDR.SPRADDR_SEQNO, 
	                                            :SPRADDR.SPRADDR_ATYP_CODE,
	                                            msg_out, 
	                                            err_out);
	      if err_out = '1' then
	      	  DO_SILENT_COMMIT;
	      end if;
	      if msg_out is not null then
-- Begin 1-2WIF92
	      	if err_out > '4' then
      	     G$_DISPLAY_ERR_MSG(msg_out);
	        else
	        	 MESSAGE(msg_out);
  	      end if;
-- End 1-2WIF92
	      end if;
	      if err_out > '4' then
	      	  RAISE FORM_TRIGGER_FAILURE;
	      end if;
EXCEPTION
   WHEN OTHERS THEN
         MESSAGE(SUBSTR(SQLERRM,1,200));
         RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:5195
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void processHouseholdAddrRecs(SpraddrAdapter spraddrElement)
		{
			NString msgOut= NString.getNull();
			NString errOut= NString.getNull();
			try
			{
				//  PLU-LWS 7.2.1 Moved logic to database package.
				Ref<NString> msg_out_ref = new Ref<NString>(msgOut);
				Ref<NString> err_out_ref = new Ref<NString>(errOut);
				Aokhhld.pProcessHouseholdAddrRecs(getFormModel().getKeyBlock().getPidm(), spraddrElement.getSpraddrSeqno(), spraddrElement.getSpraddrAtypCode(), msg_out_ref, err_out_ref);
				msgOut = msg_out_ref.val;
				errOut = err_out_ref.val;
				if ( errOut.equals("1") )
				{
					doSilentCommit();
				}
				if ( !msgOut.isNull() )
				{
					//  Begin 1-2WIF92
					if ( errOut.greater("4") )
					{
						getTask().getGoqrpls().gDisplayErrMsg(msgOut);
					}
					else {
						errorMessage(msgOut);
					}
				}
				if ( errOut.greater("4") )
				{
					throw new ApplicationException();
				}
			}
			catch(Exception  e)
			{
				errorMessage(substring(errorMessage(), toInt(1), toInt(200)));
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_HOUSEHOLD_TEMP_RECS
	
	PROCEDURE POPULATE_HOUSEHOLD_TEMP_RECS IS

  -- Record type that we will use to store dynamic array
  TYPE household_type IS RECORD (
    household_pidm  SPRIDEN.SPRIDEN_PIDM%TYPE,
    spouse_ind      ATVXREF.ATVXREF_SPOUSE_IND%TYPE,
    xref_code       ATVXREF.ATVXREF_CODE%TYPE,
    reviewed_ind    VARCHAR2(1) default 'N'
   );

  -- Dynamic table used to store array members.
  TYPE household_pidm_tab IS TABLE OF household_type
    INDEX BY BINARY_INTEGER;

   -- This cursor is used find all pidms directly householded
   -- with passed in pidm.  We use this to work through
   -- all of the directly and indirectly householded persons.
   -- Records will be ordered in the following way:
   --     Sort by direct relationships first
   --     Then by Spouse indicator (spouses, then children)
   --     Then by descending age
   CURSOR PTI_CURSOR(pidm_in NUMBER) IS
      SELECT DISTINCT APRXREF_XREF_PIDM,
                      NVL(ATVXREF_SPOUSE_IND,'N'),
                      DECODE(ATVXREF_SPOUSE_IND,'Y','2','3'),
                      TO_NUMBER(NVL(F_CALCULATE_AGE(SYSDATE,SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE),'0'))
        FROM APRXREF,
             SPBPERS,
             ATVXREF
       WHERE APRXREF_PIDM = pidm_in
         AND APRXREF_XREF_PIDM = SPBPERS_PIDM(+)
         AND SPBPERS_DEAD_IND IS NULL
         AND SPBPERS_DEAD_DATE IS NULL
         AND ATVXREF_CODE = APRXREF_XREF_CODE
         AND APRXREF_HOUSEHOLD_IND = 'Y'
       ORDER BY DECODE(ATVXREF_SPOUSE_IND,'Y','2','3') ASC,  -- Spouses first, then kids by descending age
             TO_NUMBER(NVL(F_CALCULATE_AGE(SYSDATE,SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE),'0')) DESC;
             

   -- This cursor will be used to identify the cross reference
   -- between the "current" person and the householded person
   -- only if there is a direct relationship.
   -- Otherwise it will be null.
   CURSOR PTI_CURSOR_XREF(curr_pidm_in SPRIDEN.SPRIDEN_PIDM%TYPE, 
                          pidm_in SPRIDEN.SPRIDEN_PIDM%TYPE) IS
      SELECT APRXREF_XREF_CODE
        FROM APRXREF
       WHERE APRXREF_PIDM = curr_pidm_in
         AND APRXREF_XREF_PIDM = pidm_in
       ORDER BY DECODE(APRXREF_HOUSEHOLD_IND,'Y','1','2');
       -- These two persons may or may not have a direct relationship, but
       -- if they do, then show their household relationship first.

   -- This cursor is only used to count number of household
   -- members who are "directly" householded to the original
   -- person being reviewed.  If we have at least one, then
   -- we will continue processing.
   CURSOR PTI_CURSOR_CNT (pidm_in NUMBER) IS
      SELECT COUNT(DISTINCT APRXREF_XREF_PIDM )
        FROM APRXREF
       WHERE APRXREF_PIDM = pidm_in
         AND APRXREF_HOUSEHOLD_IND = 'Y';

  --
  household_cnt    NUMBER := 0;      -- direct household member count for test pidm
  --
  t_household      household_pidm_tab; -- the temporary array where we are storing the pidms
                                       -- this will serve as our source for populating
                                       -- APTADDR table when process is complete.
  
  o_pidm           spriden.spriden_pidm%TYPE;       -- working pidm
  t_pidm           spriden.spriden_pidm%TYPE;       -- household members of working pidm
  t_spouse_ind     atvxref.atvxref_spouse_ind%TYPE; -- working spouse ind.
  t_xref_code      atvxref.atvxref_code%TYPE;       -- working XREF code.
  t_dummy_1        VARCHAR2(1);
  t_dummy_2        NUMBER;

  rec_cntr         NUMBER := 0; -- record counter
  rev_index        NUMBER := 0; -- index of next record to review

  unreviewed_found BOOLEAN := FALSE ;
  t_already_exists BOOLEAN := FALSE ;
  current_address_text APTADDR.APTADDR_STREET_LINE1%TYPE := g$_nls.get('APAIDEN-0065','FORM','No current address');

  CURSOR PTI_CURSOR_1(pidm_in    SPRIDEN.SPRIDEN_PIDM%TYPE, 
                      sps_ind_in ATVXREF.ATVXREF_SPOUSE_IND%TYPE,
                      xref_in    ATVXREF.ATVXREF_CODE%TYPE) IS 
     SELECT DISTINCT
              pidm_in                                                                  ADDR_PIDM,
              DECODE(sps_ind_in,'Y','2','3')                                           ADDR_HEAD_IND,
              SUBSTR(F_GETSPRIDENID(pidm_in),1,9)                                      ADDR_ID,
-- Begin Defect 1-3CLOW4
--            SUBSTR(F_FORMAT_NAME(pidm_in, 'LF30'),1,29)                              ADDR_NAME_LF30,
              F_FORMAT_NAME(pidm_in, 'LFMI')                                           ADDR_NAME_LF30,
-- End Defect 1-3CLOW4     
              xref_in                                                                  ADDR_XREF_CODE,
              :SPRADDR.SPRADDR_ATYP_CODE                                               ADDR_ATYP_CODE,
              SPRADDR_HOUSE_NUMBER                                                     ADDR_HOUSE_NUMBER,
              DECODE(SPRADDR_ATYP_CODE,NULL,g$_nls.get('APAIDEN-0066','FORM','No current address'),SPRADDR_STREET_LINE1) ADDR_STREET_LINE1,
              SPRADDR_STREET_LINE2                                                     ADDR_STREET_LINE2,
              SPRADDR_STREET_LINE3                                                     ADDR_STREET_LINE3,
              SPRADDR_STREET_LINE4                                                     ADDR_STREET_LINE4,
              SPRADDR_CITY                                                             ADDR_CITY,
              SPRADDR_STAT_CODE                                                        ADDR_STAT_CODE,
-- Begin 1-37ALOS
--            SUBSTR(SPRADDR_ZIP,1,5)                                                  ADDR_ZIP,
              SPRADDR_ZIP                                                              ADDR_ZIP,
-- End 1-37ALOS              
              SPRADDR_CNTY_CODE                                                        ADDR_CNTY_CODE,
              SPRADDR_NATN_CODE                                                        ADDR_NATN_CODE,
-- Begin 1-CZXZE 
-- Begin 1-2WIF92 
--            nvl(SPRADDR_FROM_DATE,:aptaddr_header.addr_from_date)                    ADDR_FROM_DATE,
--            nvl(SPRADDR_TO_DATE,:aptaddr_header.addr_to_date)                        ADDR_TO_DATE, 
              SPRADDR_FROM_DATE                                                        ADDR_FROM_DATE,
              SPRADDR_TO_DATE                                                          ADDR_TO_DATE,
-- End 1-2WIF92
-- End 1-CZXZE 
              F_CALCULATE_AGE(SYSDATE,SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE)           ADDR_AGE,
              SUBSTR(DECODE(B.SPRTELE_CTRY_CODE_PHONE,NULL,
                 DECODE(LTRIM(RTRIM(DECODE(B.SPRTELE_INTL_ACCESS,NULL,NULL,DECODE(B.SPRTELE_INTL_ACCESS,NULL,NULL,'+'||B.SPRTELE_INTL_ACCESS))||
                      ' '||LTRIM(B.SPRTELE_PHONE_AREA||' ')||LTRIM(B.SPRTELE_PHONE_NUMBER||' ')||B.SPRTELE_PHONE_EXT)),NULL,g$_nls.get('APAIDEN-0067','FORM','No current primary phone'),
                      LTRIM(RTRIM(DECODE(B.SPRTELE_INTL_ACCESS,NULL,NULL,DECODE(B.SPRTELE_INTL_ACCESS,NULL,NULL,'+'||B.SPRTELE_INTL_ACCESS))||
                      ' '||LTRIM(B.SPRTELE_PHONE_AREA||' ')||LTRIM(B.SPRTELE_PHONE_NUMBER||' ')||B.SPRTELE_PHONE_EXT))),              
                 DECODE(LTRIM(RTRIM(DECODE(B.SPRTELE_CTRY_CODE_PHONE,NULL,NULL,DECODE(B.SPRTELE_CTRY_CODE_PHONE,NULL,NULL,'+'||B.SPRTELE_CTRY_CODE_PHONE))||
                      ' '||LTRIM(B.SPRTELE_PHONE_AREA||' ')||LTRIM(B.SPRTELE_PHONE_NUMBER||' ')||B.SPRTELE_PHONE_EXT)),NULL,g$_nls.get('APAIDEN-0068','FORM','No current primary phone'),
                      LTRIM(RTRIM(DECODE(B.SPRTELE_CTRY_CODE_PHONE,NULL,NULL,DECODE(B.SPRTELE_CTRY_CODE_PHONE,NULL,NULL,'+'||B.SPRTELE_CTRY_CODE_PHONE))||
                      ' '||LTRIM(B.SPRTELE_PHONE_AREA||' ')||LTRIM(B.SPRTELE_PHONE_NUMBER||' ')||B.SPRTELE_PHONE_EXT))))
                ,1,40) ADDR_PHONE
       FROM (SELECT Z.SPRADDR_PIDM,
                    Z.SPRADDR_ATYP_CODE,
                    Z.SPRADDR_SEQNO,
                    Z.SPRADDR_FROM_DATE,
                    Z.SPRADDR_TO_DATE,
                    Z.SPRADDR_HOUSE_NUMBER,
                    Z.SPRADDR_STREET_LINE1,
                    Z.SPRADDR_STREET_LINE2,
                    Z.SPRADDR_STREET_LINE3,
                    Z.SPRADDR_STREET_LINE4,
                    Z.SPRADDR_CITY,
                    Z.SPRADDR_STAT_CODE,
                    Z.SPRADDR_ZIP,
                    Z.SPRADDR_CNTY_CODE,
                    Z.SPRADDR_NATN_CODE,
                    Z.SPRADDR_STATUS_IND,
                    Z.SPRADDR_ACTIVITY_DATE,
                    Z.SPRADDR_USER,
                    Z.SPRADDR_ASRC_CODE,
                    Y.SPRTELE_PIDM,
                    Y.SPRTELE_SEQNO,
                    Y.SPRTELE_TELE_CODE,
                    Y.SPRTELE_ACTIVITY_DATE,
                    Y.SPRTELE_PHONE_AREA,
                    Y.SPRTELE_PHONE_NUMBER,
                    Y.SPRTELE_PHONE_EXT,
                    Y.SPRTELE_CTRY_CODE_PHONE,
                    Y.SPRTELE_STATUS_IND,
                    Y.SPRTELE_ATYP_CODE,
                    Y.SPRTELE_ADDR_SEQNO,
                    Y.SPRTELE_PRIMARY_IND,
                    Y.SPRTELE_UNLIST_IND,
                    Y.SPRTELE_COMMENT,
                    Y.SPRTELE_INTL_ACCESS,
                    Y.SPRTELE_DATA_ORIGIN,
                    Y.SPRTELE_USER_ID
               FROM SPRADDR Z,
                    (SELECT V.SPRTELE_PIDM,
                            V.SPRTELE_SEQNO,
                            V.SPRTELE_TELE_CODE,
                            V.SPRTELE_ACTIVITY_DATE,
                            V.SPRTELE_PHONE_AREA,
                            V.SPRTELE_PHONE_NUMBER,
                            V.SPRTELE_PHONE_EXT,
                            V.SPRTELE_CTRY_CODE_PHONE,
                            V.SPRTELE_STATUS_IND,
                            V.SPRTELE_ATYP_CODE,
                            V.SPRTELE_ADDR_SEQNO,
                            V.SPRTELE_PRIMARY_IND,
                            V.SPRTELE_UNLIST_IND,
                            V.SPRTELE_COMMENT,
                            V.SPRTELE_INTL_ACCESS,
                            V.SPRTELE_DATA_ORIGIN,
                            V.SPRTELE_USER_ID
                       FROM SPRTELE v
--                           , STVATYP                           
                      WHERE SPRTELE_PIDM = pidm_in
                        AND SPRTELE_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
--                        AND STVATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
--                        AND SPRTELE_ATYP_CODE = STVATYP_CODE
--                        AND SPRTELE_TELE_CODE = STVATYP_TELE_CODE
                        AND SPRTELE_STATUS_IND IS NULL
                        AND NVL(SPRTELE_PRIMARY_IND,'N') = 'Y'
                   ) Y
              WHERE SPRADDR_PIDM = pidm_in
                AND SPRADDR_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
                AND Z.SPRADDR_PIDM = Y.SPRTELE_PIDM(+)
                AND Z.SPRADDR_ATYP_CODE = Y.SPRTELE_ATYP_CODE(+)
                AND Z.SPRADDR_SEQNO = Y.SPRTELE_ADDR_SEQNO(+)
                AND SPRADDR_STATUS_IND IS NULL
                AND TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)) = (SELECT MIN(TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)))
                                                               FROM SPRADDR
                                                              WHERE SPRADDR_PIDM = Z.SPRADDR_PIDM
                                                                AND SPRADDR_ATYP_CODE = Z.SPRADDR_ATYP_CODE
                                                                AND SPRADDR_STATUS_IND IS NULL
                                                                AND TRUNC(NVL(SPRADDR_TO_DATE,SYSDATE)) >= TRUNC(SYSDATE)
                                                             )
                AND GREATEST(TRUNC(SYSDATE),TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE))) BETWEEN
                    TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)) AND
                    -- Just in case the only address available is future
                    GREATEST(TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)), TRUNC(NVL(SPRADDR_TO_DATE,SYSDATE)))
                ) B,
                SPBPERS,
                SPRIDEN
      WHERE SPRIDEN_PIDM = pidm_in
        AND SPRIDEN_PIDM = B.SPRADDR_PIDM(+)
        AND SPRIDEN_PIDM = SPBPERS_PIDM(+)
        AND SPRIDEN_CHANGE_IND IS NULL;

   CURSOR PTI_CURSOR_2 IS
-- Begin 1-CSR3R2
      SELECT *
--                  SPRTELE_PIDM,
--                  SPRTELE_SEQNO,
--                  SPRTELE_TELE_CODE,
--                  SPRTELE_ACTIVITY_DATE,
--                  SPRTELE_PHONE_AREA,
--                  SPRTELE_PHONE_NUMBER,
--                  SPRTELE_PHONE_EXT,
--                  SPRTELE_STATUS_IND,
--                  SPRTELE_ATYP_CODE,
--                  SPRTELE_ADDR_SEQNO,
--                  SPRTELE_PRIMARY_IND,
--                  SPRTELE_UNLIST_IND,
--                  SPRTELE_COMMENT,
--                  SPRTELE_INTL_ACCESS,
--                  SPRTELE_DATA_ORIGIN,
--                  SPRTELE_USER_ID,
--                  SPRTELE_CTRY_CODE_PHONE
-- End 1-CSR3R2
        FROM SPRTELE
--             , STVATYP           
       WHERE SPRTELE_PIDM = TO_NUMBER(:KEY_BLOCK.PIDM)
         AND SPRTELE_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
--         AND STVATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
         AND SPRTELE_STATUS_IND IS NULL
         AND NVL(SPRTELE_PRIMARY_IND,'N') = 'Y'
--         AND SPRTELE_ATYP_CODE = STVATYP_CODE
--         AND SPRTELE_TELE_CODE =  STVATYP_TELE_CODE
         AND SPRTELE_ADDR_SEQNO = :SPRADDR.SPRADDR_SEQNO;
         
   CURSOR PTI_CURSOR_3 (tele_in stvtele.stvtele_code%TYPE) IS
      SELECT STVTELE_CODE,
             STVTELE_DESC
        FROM STVATYP,
             STVTELE
       WHERE STVTELE_CODE = STVATYP_TELE_CODE
         AND STVATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
         AND tele_in IS NULL
       --
       UNION
       --
      SELECT STVTELE_CODE,
             STVTELE_DESC
        FROM STVTELE
       WHERE STVTELE_CODE = tele_in ;
    
   sqlrowcount          NUMBER := 0;
   
   sessionid_stamp      VARCHAR2(30) := SUBSTR(SYS_CONTEXT('USERENV','SESSIONID'),1,30);
   sysdate_stamp        DATE         := SYSDATE;
   user_stamp           VARCHAR2(30) := :CURRENT_USER;
   
   sprtele_row          SPRTELE%ROWTYPE; 
   
   def_household_update AUBINST.AUBINST_DEF_HOUSEHOLD_IND%TYPE ;
   lv_query_only        VARCHAR2(1) := 'N';
   r_APTADDR_row        APTADDR%rowtype;

      
BEGIN
	 -- Check to see if role is query only...just call one time per populate request.
	 IF G$_QUERY_ONLY_ROLE THEN
	    lv_query_only := 'Y';
	 END IF;
	 
   --
   -- First check to see if there are any household member associated
   -- with selected pidm
   open pti_cursor_cnt (TO_NUMBER(:KEY_BLOCK.PIDM)) ;
   fetch pti_cursor_cnt into household_cnt ;
   close pti_cursor_cnt ;
   
   -- Only continue if there is at least 1 household members
   if household_cnt > 0 then

       -- Pick up household update information
    	 def_household_update := SELECT_AUBINST_1 ;
       
       --
       -- Pick up International Access Code, if one exists.
       --
       OPEN PTI_CURSOR_2;
       FETCH PTI_CURSOR_2 INTO sprtele_row;
       CLOSE PTI_CURSOR_2;
    
       -- Pick up the appropriate TELE_CODE.
       -- Chose to do this as the form one can be null if person has no phone number.
       OPEN PTI_CURSOR_3 (sprtele_row.sprtele_tele_code);
       FETCH PTI_CURSOR_3 INTO :APTADDR_HEADER.ADDR_TELE_CODE,
                               :APTADDR_HEADER.ADDR_TELE_DESC;
       CLOSE PTI_CURSOR_3;
       
       IF SPRTELE_ROW.SPRTELE_CTRY_CODE_PHONE IS NOT NULL THEN
           :APTADDR_HEADER.ADDR_PHONE := '+'||LTRIM(SPRTELE_ROW.SPRTELE_CTRY_CODE_PHONE||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_AREA||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_NUMBER||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_EXT);
       ELSIF SPRTELE_ROW.SPRTELE_INTL_ACCESS IS NOT NULL THEN
           :APTADDR_HEADER.ADDR_PHONE := '+'||LTRIM(SPRTELE_ROW.SPRTELE_INTL_ACCESS||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_AREA||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_NUMBER||' ')||
                               LTRIM(SPRTELE_ROW.SPRTELE_PHONE_EXT);
       ELSE
           :APTADDR_HEADER.ADDR_PHONE := NVL(LTRIM(SPRTELE_ROW.SPRTELE_PHONE_AREA||' ')||
                              LTRIM(SPRTELE_ROW.SPRTELE_PHONE_NUMBER||' ')||
                              LTRIM(SPRTELE_ROW.SPRTELE_PHONE_EXT),
                              g$_nls.get('APAIDEN-0069','FORM','No current primary phone'));
       END IF;
       
       -- Setup header block
       :APTADDR_HEADER.ADDR_ATYP_CODE := :SPRADDR.SPRADDR_ATYP_CODE ;
-- Begin Defect 1-3CLOW4       
--     :APTADDR_HEADER.ADDR_NAME_LF30 := substr(F_FORMAT_NAME(:KEY_BLOCK.PIDM,'LF30'),1,29);
       :APTADDR_HEADER.ADDR_NAME_LF30 := F_FORMAT_NAME(:KEY_BLOCK.PIDM,'LFMI');
-- End Defect 1-3CLOW4       
       :APTADDR_HEADER.ADDR_ID := :SPRIDEN_CURRENT.SPRIDEN_ID;
       :APTADDR_HEADER.ADDR_ATYP_DESC := :SPRADDR.ATYP_DESCRIPTION;
       :APTADDR_HEADER.ADDR_ADDR_SEQNO := :SPRADDR.SPRADDR_SEQNO;
       :APTADDR_HEADER.ADDR_HOUSE_NUMBER := :SPRADDR.SPRADDR_HOUSE_NUMBER;
       :APTADDR_HEADER.ADDR_STREET_LINE1 := :SPRADDR.SPRADDR_STREET_LINE1;
       :APTADDR_HEADER.ADDR_CITY := :SPRADDR.SPRADDR_CITY;
       :APTADDR_HEADER.ADDR_STAT_CODE := :SPRADDR.SPRADDR_STAT_CODE;
-- Begin 1-37ALOS
--     :APTADDR_HEADER.ADDR_ZIP := SUBSTR(:SPRADDR.SPRADDR_ZIP,1,5);
       :APTADDR_HEADER.ADDR_ZIP := :SPRADDR.SPRADDR_ZIP;     
-- End 1-37ALOS         
       :APTADDR_HEADER.ADDR_FROM_DATE := :SPRADDR.SPRADDR_FROM_DATE;
       :APTADDR_HEADER.ADDR_TO_DATE := :SPRADDR.SPRADDR_TO_DATE;
       :APTADDR_HEADER.ADDR_STREET_LINE2 := :SPRADDR.SPRADDR_STREET_LINE2;
       :APTADDR_HEADER.ADDR_STREET_LINE3 := :SPRADDR.SPRADDR_STREET_LINE3;
       :APTADDR_HEADER.ADDR_STREET_LINE4 := :SPRADDR.SPRADDR_STREET_LINE4;
       :APTADDR_HEADER.ADDR_CNTY_CODE := :SPRADDR.SPRADDR_CNTY_CODE;
       :APTADDR_HEADER.ADDR_NATN_CODE := :SPRADDR.SPRADDR_NATN_CODE;
       IF :APTADDR_HEADER.ADDR_NATN_CODE IS NOT NULL THEN
          :APTADDR_HEADER.ADDR_NATN_DESC := gb_stvnatn.f_get_description(:APTADDR_HEADER.ADDR_NATN_CODE);
       END IF;
       IF :APTADDR_HEADER.ADDR_CNTY_CODE IS NOT NULL THEN
          :APTADDR_HEADER.ADDR_CNTY_DESC := gb_stvcnty.f_get_description(:APTADDR_HEADER.ADDR_CNTY_CODE);
       END IF;
    
       -- Done with header information now go to work figuring out all direct and indirect
       -- household connections.  Results will be stored in array.
          
       -- put original household pidm into working variable
       -- initialize counters to 1
       o_pidm := to_number(:KEY_BLOCK.PIDM) ;
       rec_cntr := 1;
       rev_index := rec_cntr ;
   
       -- put the original pidm in position 1 of the "array"
       t_household(rec_cntr).household_pidm := o_pidm ;
       t_household(rec_cntr).reviewed_ind := 'N';
   
       <<outer_table>>
       loop
          -- open cursor of all distinct pidms householded with working
          -- pidm and set current working pidm's reviewed indicator to Y
          open pti_cursor(o_pidm);
          t_household(rev_index).reviewed_ind := 'Y';
   
          <<build_table>>
          loop
   
              -- fetch next householded person for working pidm.
              fetch pti_cursor into t_pidm, t_spouse_ind, t_dummy_1, t_dummy_2 ;
              if pti_cursor%found then
                  -- if we find one, see if they are already in the list
                  t_already_exists := false;
                  for i in 1 .. rec_cntr loop
                     -- if in the list, then set flag to true and exit for..loop
                     if t_household(i).household_pidm = t_pidm then
                        t_already_exists := true;
                     end if;
                     -- can exit early if we find it.
                     exit when t_already_exists ;
                  end loop;
                  -- if pidm was already in list, then skip the next part and
                  -- fetch the next one. Otherwise, add this new one to the list
                  -- and update counter.
                  if not t_already_exists then
                     rec_cntr := rec_cntr + 1;
                     t_household(rec_cntr).household_pidm := t_pidm ;
                     t_household(rec_cntr).spouse_ind := t_spouse_ind ;
                     t_xref_code := NULL;
                     open PTI_CURSOR_XREF(t_household(1).household_pidm, t_pidm);
                     fetch PTI_CURSOR_XREF into t_xref_code;
                     close PTI_CURSOR_XREF;
                     t_household(rec_cntr).xref_code := t_xref_code;
                     t_household(rec_cntr).reviewed_ind := 'N';
                  end if;
              else
                  -- exit build table loop when there are no more
                  -- household members with working pidm.
                  exit when pti_cursor%notfound;
              end if;
          end loop build_table;
          close pti_cursor ;
   
          -- Now review our current list and find the next one
          -- that has not yet been reviewed.  If we find one,
          -- set working pidm to that person, and set index
          -- to that working pidm.  Process like we did the
          -- oriiginal one.
          unreviewed_found := false;
          for i in rev_index+1 .. rec_cntr loop
             if t_household(i).reviewed_ind = 'N' then
                o_pidm := t_household(i).household_pidm ;
                rev_index := i ;
                unreviewed_found := true;
             end if;
             exit when unreviewed_found ;
          end loop;
   
          -- If all have been reviewed e.g. unreviewed_found remains false
          -- after looping through all the records, then we are done
          -- exit the outer loop and process results.
          exit when not unreviewed_found ;
       end loop outer_table ;
   
       household_cnt := rec_cntr - 1 ;
       -- print out our results. e.g. add them to aptaddr table
       --      for i in 1 .. rec_cntr loop
       --        dbms_output.put_line(to_char(t_household(i).household_pidm,'99999990')||' '||t_household(i).reviewed_ind);
       --      end loop;
       --
       -- We have pidms stored in t_household array get address information for each one (except for first one)
       for i in 2 .. rec_cntr loop
           OPEN PTI_CURSOR_1(t_household(i).household_pidm,
                             t_household(i).spouse_ind,
                             t_household(i).xref_code);     
           FETCH PTI_CURSOR_1 INTO 
--                     :APTADDR.APTADDR_PIDM,
--                     :APTADDR.APTADDR_HEAD_IND,
--                     :APTADDR.APTADDR_ID,
--                     :APTADDR.APTADDR_NAME_LF30,
--                     :APTADDR.APTADDR_XREF_CODE,
--                     :APTADDR.APTADDR_ATYP_CODE,
--                     :APTADDR.APTADDR_STREET_LINE1,
--                     :APTADDR.APTADDR_STREET_LINE2,
--                     :APTADDR.APTADDR_STREET_LINE3,
--                     :APTADDR.APTADDR_CITY,
--                     :APTADDR.APTADDR_STAT_CODE,
--                     :APTADDR.APTADDR_ZIP,
--                     :APTADDR.APTADDR_CNTY_CODE,
--                     :APTADDR.APTADDR_NATN_CODE,
--                     :APTADDR.APTADDR_FROM_DATE,
--                     :APTADDR.APTADDR_TO_DATE,
--                     :APTADDR.APTADDR_AGE,
--                     :APTADDR.APTADDR_PHONE;
                       r_APTADDR_row.APTADDR_PIDM,
                       r_APTADDR_row.APTADDR_HEAD_IND,
                       r_APTADDR_row.APTADDR_ID,
                       r_APTADDR_row.APTADDR_NAME_LF30,
                       r_APTADDR_row.APTADDR_XREF_CODE,
                       r_APTADDR_row.APTADDR_ATYP_CODE,
                       r_APTADDR_row.APTADDR_HOUSE_NUMBER,
                       r_APTADDR_row.APTADDR_STREET_LINE1,
                       r_APTADDR_row.APTADDR_STREET_LINE2,
                       r_APTADDR_row.APTADDR_STREET_LINE3,
                       r_APTADDR_row.APTADDR_STREET_LINE4,
                       r_APTADDR_row.APTADDR_CITY,
                       r_APTADDR_row.APTADDR_STAT_CODE,
                       r_APTADDR_row.APTADDR_ZIP,
                       r_APTADDR_row.APTADDR_CNTY_CODE,
                       r_APTADDR_row.APTADDR_NATN_CODE,
                       r_APTADDR_row.APTADDR_FROM_DATE,
                       r_APTADDR_row.APTADDR_TO_DATE,
                       r_APTADDR_row.APTADDR_AGE,
                       r_APTADDR_row.APTADDR_PHONE;
           IF PTI_CURSOR_1%FOUND THEN
              SQLROWCOUNT := SQLROWCOUNT + 1;      
              r_APTADDR_row.APTADDR_SESSIONID := SESSIONID_STAMP;
              r_APTADDR_row.APTADDR_USER := :CURRENT_USER;
              r_APTADDR_row.APTADDR_ACTIVITY_DATE := SYSDATE_STAMP;
      
              -- If more than one active address, set updatable indicator to N.
              -- Also, set to 'N', if query only role.
              IF aokhhld.f_active_addresses(r_APTADDR_row.APTADDR_PIDM, r_APTADDR_row.APTADDR_ATYP_CODE) > 1 
              	 OR lv_query_only = 'Y' THEN
              	   r_APTADDR_row.APTADDR_UPDATABLE_IND := 'N';
              ELSE
              	   r_APTADDR_row.APTADDR_UPDATABLE_IND := 'Y';
              END IF;
              IF r_APTADDR_row.APTADDR_UPDATABLE_IND = 'Y' THEN
              	SET_ITEM_INSTANCE_PROPERTY('APTADDR_SLCT_IND',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
              ELSE
              	SET_ITEM_INSTANCE_PROPERTY('APTADDR_SLCT_IND',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
              END IF;
              IF NVL(r_APTADDR_row.APTADDR_STREET_LINE1,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') OR
                 (r_APTADDR_row.APTADDR_STREET_LINE1 = current_address_text AND NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') = '#') OR
                 NVL(r_APTADDR_row.APTADDR_STREET_LINE2,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE2,'#') OR
                 NVL(r_APTADDR_row.APTADDR_STREET_LINE3,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE3,'#') OR
                 NVL(r_APTADDR_row.APTADDR_STREET_LINE4,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE4,'#') OR
                 NVL(r_APTADDR_row.APTADDR_HOUSE_NUMBER,'#') <> NVL(:APTADDR_HEADER.ADDR_HOUSE_NUMBER,'#') OR
                 NVL(r_APTADDR_row.APTADDR_CITY,'#') <> NVL(:APTADDR_HEADER.ADDR_CITY,'#') OR
                 NVL(r_APTADDR_row.APTADDR_STAT_CODE,'#') <> NVL(:APTADDR_HEADER.ADDR_STAT_CODE,'#') OR
                 NVL(r_APTADDR_row.APTADDR_ZIP,'#') <> NVL(:APTADDR_HEADER.ADDR_ZIP,'#') OR
                 NVL(r_APTADDR_row.APTADDR_CNTY_CODE,'#') <> NVL(:APTADDR_HEADER.ADDR_CNTY_CODE,'#') OR
-- Begin 1-2WIF92
                 NVL(r_APTADDR_row.APTADDR_NATN_CODE,'#') <> NVL(:APTADDR_HEADER.ADDR_NATN_CODE,'#') OR
                 TRUNC(NVL(r_APTADDR_row.APTADDR_FROM_DATE,sysdate)) <> TRUNC(NVL(:APTADDR_HEADER.ADDR_FROM_DATE,sysdate)) OR
                 TRUNC(NVL(r_APTADDR_row.APTADDR_TO_DATE,sysdate)) <> TRUNC(NVL(:APTADDR_HEADER.ADDR_TO_DATE,sysdate)) 
                 THEN
-- End 1-2WIF92
                 r_APTADDR_row.APTADDR_ADDRESS_COMPARE_IND := '#';
              ELSE
                 r_APTADDR_row.APTADDR_ADDRESS_COMPARE_IND := NULL;
              END IF;
              IF r_APTADDR_row.APTADDR_PHONE <> :APTADDR_HEADER.ADDR_PHONE THEN
                 r_APTADDR_row.APTADDR_PHONE_COMPARE_IND := '#';
              ELSE
                 r_APTADDR_row.APTADDR_PHONE_COMPARE_IND := NULL;
              END IF;
              IF (r_APTADDR_row.APTADDR_ADDRESS_COMPARE_IND IS NULL AND r_APTADDR_row.APTADDR_PHONE_COMPARE_IND IS NULL) 
              	  OR DEF_HOUSEHOLD_UPDATE <> 'Y' 
              	  OR r_APTADDR_row.APTADDR_UPDATABLE_IND = 'N' THEN
                 r_APTADDR_row.APTADDR_SLCT_IND := 'N';
              ELSE
                 r_APTADDR_row.APTADDR_SLCT_IND := 'Y';
              END IF;
              AOKHHLD.P_APTADDR_INSERT(p_aptaddr_slct_ind => r_APTADDR_row.aptaddr_slct_ind,
                                       p_aptaddr_updatable_ind => r_APTADDR_row.aptaddr_updatable_ind,
                                       p_aptaddr_pidm => r_APTADDR_row.aptaddr_pidm,
                                       p_aptaddr_head_ind => r_APTADDR_row.aptaddr_head_ind,
                                       p_aptaddr_atyp_code => r_APTADDR_row.aptaddr_atyp_code,
                                       p_aptaddr_house_number => r_APTADDR_row.aptaddr_house_number,
                                       p_aptaddr_street_line1 => r_APTADDR_row.aptaddr_street_line1,
                                       p_aptaddr_street_line2 => r_APTADDR_row.aptaddr_street_line2,
                                       p_aptaddr_street_line3 => r_APTADDR_row.aptaddr_street_line3,
                                       p_aptaddr_street_line4 => r_APTADDR_row.aptaddr_street_line4,
                                       p_aptaddr_city => r_APTADDR_row.aptaddr_city,
                                       p_aptaddr_stat_code => r_APTADDR_row.aptaddr_stat_code,
                                       p_aptaddr_zip => r_APTADDR_row.aptaddr_zip,
                                       p_aptaddr_cnty_code => r_APTADDR_row.aptaddr_cnty_code,
                                       p_aptaddr_natn_code => r_APTADDR_row.aptaddr_natn_code,
                                       p_aptaddr_sessionid => r_APTADDR_row.aptaddr_sessionid,
                                       p_aptaddr_user => r_APTADDR_row.aptaddr_user,
                                       p_aptaddr_activity_date => r_APTADDR_row.aptaddr_activity_date,
                                       p_aptaddr_name_lf30 => r_APTADDR_row.aptaddr_name_lf30,
                                       p_aptaddr_id => r_APTADDR_row.aptaddr_id,
                                       p_aptaddr_xref_code => r_APTADDR_row.aptaddr_xref_code,
                                       p_aptaddr_age => r_APTADDR_row.aptaddr_age,
                                       p_aptaddr_address_compare_ind => r_APTADDR_row.aptaddr_address_compare_ind,
                                       p_aptaddr_phone_compare_ind => r_APTADDR_row.aptaddr_phone_compare_ind,
                                       p_aptaddr_phone => r_APTADDR_row.aptaddr_phone,
                                       p_aptaddr_from_date => r_APTADDR_row.aptaddr_from_date,
                                       p_aptaddr_to_date => r_APTADDR_row.aptaddr_to_date);
--              NEXT_RECORD;
           ELSE
              GOTO LOOP_DONE;
           END IF;           
           << LOOP_DONE >>
           CLOSE PTI_CURSOR_1;
       end loop;
-- Insert a header record to identify who we are working on.
--     :APTADDR.APTADDR_PIDM := :KEY_BLOCK.PIDM;
--     :APTADDR.APTADDR_HEAD_IND := '1';
--     :APTADDR.APTADDR_SLCT_IND := 'N';
--     :APTADDR.APTADDR_ATYP_CODE := :SPRADDR.SPRADDR_ATYP_CODE;
--     :APTADDR.APTADDR_SESSIONID := SESSIONID_STAMP;
--     :APTADDR.APTADDR_ADDRESS_COMPARE_IND := NULL;
--     :APTADDR.APTADDR_PHONE_COMPARE_IND := NULL;
--     :APTADDR.APTADDR_USER := :CURRENT_USER;
--     :APTADDR.APTADDR_ACTIVITY_DATETIME := SYSDATE_STAMP;
      AOKHHLD.P_APTADDR_INSERT(p_aptaddr_slct_ind => 'N',
                               p_aptaddr_updatable_ind => NULL,
                               p_aptaddr_pidm => :KEY_BLOCK.PIDM,
                               p_aptaddr_head_ind => '1',
                               p_aptaddr_atyp_code => :SPRADDR.SPRADDR_ATYP_CODE,
                               p_aptaddr_house_number => NULL,
                               p_aptaddr_street_line1 => NULL,
                               p_aptaddr_street_line2 => NULL,
                               p_aptaddr_street_line3 => NULL,
                               p_aptaddr_street_line4 => NULL,
                               p_aptaddr_city => NULL,
                               p_aptaddr_stat_code => NULL,
                               p_aptaddr_zip => NULL,
                               p_aptaddr_cnty_code => NULL,
                               p_aptaddr_natn_code => NULL,
                               p_aptaddr_sessionid => SESSIONID_STAMP,
                               p_aptaddr_user => :CURRENT_USER,
                               p_aptaddr_activity_date => SYSDATE_STAMP,
                               p_aptaddr_name_lf30 => NULL,
                               p_aptaddr_id => NULL,
                               p_aptaddr_xref_code => NULL,
                               p_aptaddr_age => NULL,
                               p_aptaddr_address_compare_ind => NULL,
                               p_aptaddr_phone_compare_ind => NULL,
                               p_aptaddr_phone => NULL,
                               p_aptaddr_from_date => NULL,
                               p_aptaddr_to_date => NULL);
--     NEXT_RECORD;     
--
     DO_SILENT_COMMIT;
     -- Do GO_BLOCK and EXECUTE_QUERY to hide the HEAD_IND='1' record.
     -- GO_BLOCK('APTADDR');
     EXECUTE_QUERY;
     --GO_ITEM('APTADDR_SLCT_IND');
   else
       	 NULL;  -- Go back do not do anything.
   end if;
--     
EXCEPTION
     WHEN OTHERS THEN 
          MESSAGE(SUBSTR(SQLERRM,1,200));
          RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:5196
	/* <p>
/* </p>
		*/
		
		public void populateHouseholdTempRecs(SpraddrAdapter spraddrElement, SpridenCurrentAdapter spridenCurrentElement)
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT DISTINCT APRXREF_XREF_PIDM, NVL(ATVXREF_SPOUSE_IND, 'N'), DECODE(ATVXREF_SPOUSE_IND, 'Y', '2', '3'), TO_NUMBER(NVL(F_CALCULATE_AGE(SYSDATE, SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE), '0')) " +
	" FROM APRXREF, SPBPERS, ATVXREF " +
	" WHERE APRXREF_PIDM = :P_PIDM_IN AND APRXREF_XREF_PIDM = SPBPERS_PIDM(+) AND SPBPERS_DEAD_IND IS NULL AND SPBPERS_DEAD_DATE IS NULL AND ATVXREF_CODE = APRXREF_XREF_CODE AND APRXREF_HOUSEHOLD_IND = 'Y' " +
	" ORDER BY DECODE(ATVXREF_SPOUSE_IND, 'Y', '2', '3') ASC, TO_NUMBER(NVL(F_CALCULATE_AGE(SYSDATE, SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE), '0')) DESC";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			String sqlptiCursorXref = "SELECT APRXREF_XREF_CODE " +
	" FROM APRXREF " +
	" WHERE APRXREF_PIDM = :P_CURR_PIDM_IN AND APRXREF_XREF_PIDM = :P_PIDM_IN " +
	" ORDER BY DECODE(APRXREF_HOUSEHOLD_IND, 'Y', '1', '2')";
			DataCursor ptiCursorXref = new DataCursor(sqlptiCursorXref);
			NString currPidmIn = NString.getNull();
			String sqlptiCursorCnt = "SELECT COUNT(DISTINCT APRXREF_XREF_PIDM) " +
	" FROM APRXREF " +
	" WHERE APRXREF_PIDM = :P_PIDM_IN AND APRXREF_HOUSEHOLD_IND = 'Y' ";
			DataCursor ptiCursorCnt = new DataCursor(sqlptiCursorCnt);
			// 
			NNumber householdCnt = toNumber(0);
			//  direct household member count for test pidm
			// 
			
			HouseholdPidmTab tHousehold= new HouseholdPidmTab();
			//  the temporary array where we are storing the pidms
			//  this will serve as our source for populating
			//  APTADDR table when process is complete.
			NNumber oPidm= NNumber.getNull();
			//  working pidm
			NNumber tPidm= NNumber.getNull();
			//  household members of working pidm
			NString tSpouseInd= NString.getNull();
			//  working spouse ind.
			NString tXrefCode= NString.getNull();
			//  working XREF code.
			NString tDummy1= NString.getNull();
			NNumber tDummy2= NNumber.getNull();
			NNumber recCntr = toNumber(0);
			//  record counter
			NNumber revIndex = toNumber(0);
			//  index of next record to review
			NBool unreviewedFound = toBool(NBool.False);
			NBool tAlreadyExists = toBool(NBool.False);
			NString currentAddressText = GNls.Fget(toStr("APAIDEN-0065"), toStr("FORM"), toStr("No current address"));
			String sqlptiCursor1 = "SELECT DISTINCT :P_PIDM_IN ADDR_PIDM, DECODE(:P_SPS_IND_IN, 'Y', '2', '3') ADDR_HEAD_IND, SUBSTR(F_GETSPRIDENID(:P_PIDM_IN), 1, 9) ADDR_ID, F_FORMAT_NAME(:P_PIDM_IN, 'LFMI') ADDR_NAME_LF30, :P_XREF_IN ADDR_XREF_CODE, :SPRADDR_SPRADDR_ATYP_CODE ADDR_ATYP_CODE, SPRADDR_HOUSE_NUMBER ADDR_HOUSE_NUMBER, DECODE(SPRADDR_ATYP_CODE, NULL, g$_nls.get('APAIDEN-0066', 'FORM', 'No current address'), SPRADDR_STREET_LINE1) ADDR_STREET_LINE1, SPRADDR_STREET_LINE2 ADDR_STREET_LINE2, SPRADDR_STREET_LINE3 ADDR_STREET_LINE3, SPRADDR_STREET_LINE4 ADDR_STREET_LINE4, SPRADDR_CITY ADDR_CITY, SPRADDR_STAT_CODE ADDR_STAT_CODE, SPRADDR_ZIP ADDR_ZIP, SPRADDR_CNTY_CODE ADDR_CNTY_CODE, SPRADDR_NATN_CODE ADDR_NATN_CODE, SPRADDR_FROM_DATE ADDR_FROM_DATE, SPRADDR_TO_DATE ADDR_TO_DATE, F_CALCULATE_AGE(SYSDATE, SPBPERS_BIRTH_DATE, SPBPERS_DEAD_DATE) ADDR_AGE, SUBSTR(DECODE(B.SPRTELE_CTRY_CODE_PHONE, NULL, DECODE(LTRIM(RTRIM(DECODE(B.SPRTELE_INTL_ACCESS, NULL, NULL, DECODE(B.SPRTELE_INTL_ACCESS, NULL, NULL, '+' || B.SPRTELE_INTL_ACCESS)) || ' ' || LTRIM(B.SPRTELE_PHONE_AREA || ' ') || LTRIM(B.SPRTELE_PHONE_NUMBER || ' ') || B.SPRTELE_PHONE_EXT)), NULL, g$_nls.get('APAIDEN-0067', 'FORM', 'No current primary phone'), LTRIM(RTRIM(DECODE(B.SPRTELE_INTL_ACCESS, NULL, NULL, DECODE(B.SPRTELE_INTL_ACCESS, NULL, NULL, '+' || B.SPRTELE_INTL_ACCESS)) || ' ' || LTRIM(B.SPRTELE_PHONE_AREA || ' ') || LTRIM(B.SPRTELE_PHONE_NUMBER || ' ') || B.SPRTELE_PHONE_EXT))), DECODE(LTRIM(RTRIM(DECODE(B.SPRTELE_CTRY_CODE_PHONE, NULL, NULL, DECODE(B.SPRTELE_CTRY_CODE_PHONE, NULL, NULL, '+' || B.SPRTELE_CTRY_CODE_PHONE)) || ' ' || LTRIM(B.SPRTELE_PHONE_AREA || ' ') || LTRIM(B.SPRTELE_PHONE_NUMBER || ' ') || B.SPRTELE_PHONE_EXT)), NULL, g$_nls.get('APAIDEN-0068', 'FORM', 'No current primary phone'), LTRIM(RTRIM(DECODE(B.SPRTELE_CTRY_CODE_PHONE, NULL, NULL, DECODE(B.SPRTELE_CTRY_CODE_PHONE, NULL, NULL, '+' || B.SPRTELE_CTRY_CODE_PHONE)) || ' ' || LTRIM(B.SPRTELE_PHONE_AREA || ' ') || LTRIM(B.SPRTELE_PHONE_NUMBER || ' ') || B.SPRTELE_PHONE_EXT)))), 1, 40) ADDR_PHONE " +
	" FROM (SELECT Z.SPRADDR_PIDM, Z.SPRADDR_ATYP_CODE, Z.SPRADDR_SEQNO, Z.SPRADDR_FROM_DATE, Z.SPRADDR_TO_DATE, Z.SPRADDR_HOUSE_NUMBER, Z.SPRADDR_STREET_LINE1, Z.SPRADDR_STREET_LINE2, Z.SPRADDR_STREET_LINE3, Z.SPRADDR_STREET_LINE4, Z.SPRADDR_CITY, Z.SPRADDR_STAT_CODE, Z.SPRADDR_ZIP, Z.SPRADDR_CNTY_CODE, Z.SPRADDR_NATN_CODE, Z.SPRADDR_STATUS_IND, Z.SPRADDR_ACTIVITY_DATE, Z.SPRADDR_USER, Z.SPRADDR_ASRC_CODE, Y.SPRTELE_PIDM, Y.SPRTELE_SEQNO, Y.SPRTELE_TELE_CODE, Y.SPRTELE_ACTIVITY_DATE, Y.SPRTELE_PHONE_AREA, Y.SPRTELE_PHONE_NUMBER, Y.SPRTELE_PHONE_EXT, Y.SPRTELE_CTRY_CODE_PHONE, Y.SPRTELE_STATUS_IND, Y.SPRTELE_ATYP_CODE, Y.SPRTELE_ADDR_SEQNO, Y.SPRTELE_PRIMARY_IND, Y.SPRTELE_UNLIST_IND, Y.SPRTELE_COMMENT, Y.SPRTELE_INTL_ACCESS, Y.SPRTELE_DATA_ORIGIN, Y.SPRTELE_USER_ID " +
	" FROM SPRADDR Z, (SELECT V.SPRTELE_PIDM, V.SPRTELE_SEQNO, V.SPRTELE_TELE_CODE, V.SPRTELE_ACTIVITY_DATE, V.SPRTELE_PHONE_AREA, V.SPRTELE_PHONE_NUMBER, V.SPRTELE_PHONE_EXT, V.SPRTELE_CTRY_CODE_PHONE, V.SPRTELE_STATUS_IND, V.SPRTELE_ATYP_CODE, V.SPRTELE_ADDR_SEQNO, V.SPRTELE_PRIMARY_IND, V.SPRTELE_UNLIST_IND, V.SPRTELE_COMMENT, V.SPRTELE_INTL_ACCESS, V.SPRTELE_DATA_ORIGIN, V.SPRTELE_USER_ID " +
	" FROM SPRTELE v " +
	" WHERE SPRTELE_PIDM = :P_PIDM_IN AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_STATUS_IND IS NULL AND NVL(SPRTELE_PRIMARY_IND, 'N') = 'Y' ) Y " +
	" WHERE SPRADDR_PIDM = :P_PIDM_IN AND SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND Z.SPRADDR_PIDM = Y.SPRTELE_PIDM(+) AND Z.SPRADDR_ATYP_CODE = Y.SPRTELE_ATYP_CODE(+) AND Z.SPRADDR_SEQNO = Y.SPRTELE_ADDR_SEQNO(+) AND SPRADDR_STATUS_IND IS NULL AND TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE)) = (SELECT MIN(TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE))) " +
		" FROM SPRADDR " +
		" WHERE SPRADDR_PIDM = Z.SPRADDR_PIDM AND SPRADDR_ATYP_CODE = Z.SPRADDR_ATYP_CODE AND SPRADDR_STATUS_IND IS NULL AND TRUNC(NVL(SPRADDR_TO_DATE, SYSDATE)) >= TRUNC(SYSDATE) ) AND GREATEST(TRUNC(SYSDATE), TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE))) BETWEEN TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE)) AND GREATEST(TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE)), TRUNC(NVL(SPRADDR_TO_DATE, SYSDATE))) ) B, SPBPERS, SPRIDEN " +
	" WHERE SPRIDEN_PIDM = :P_PIDM_IN AND SPRIDEN_PIDM = B.SPRADDR_PIDM(+) AND SPRIDEN_PIDM = SPBPERS_PIDM(+) AND SPRIDEN_CHANGE_IND IS NULL ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			NString pidmIn = NString.getNull();
			NString spsIndIn = NString.getNull();
			NString xrefIn = NString.getNull();
			String sqlptiCursor2 = "SELECT * " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_PIDM = TO_NUMBER(:KEY_BLOCK_PIDM) AND SPRTELE_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRTELE_STATUS_IND IS NULL AND NVL(SPRTELE_PRIMARY_IND, 'N') = 'Y' AND SPRTELE_ADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			String sqlptiCursor3 = "SELECT STVTELE_CODE, STVTELE_DESC " +
	" FROM STVATYP, STVTELE " +
	" WHERE STVTELE_CODE = STVATYP_TELE_CODE AND STVATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND :P_TELE_IN IS NULL " +
	"UNION SELECT STVTELE_CODE, STVTELE_DESC " +
	" FROM STVTELE " +
	" WHERE STVTELE_CODE = :P_TELE_IN ";
			DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
			NString teleIn = NString.getNull();
			NNumber sqlrowcount = toNumber(0);
			NString sessionidStamp = toStr(DbManager.getUser());//substring( sysContext("USERENV", "SESSIONID"), toInt(1), toInt(30));
			NDate sysdateStamp = NDate.getNow();
			NString userStamp = getFormModel().getFormHeader().getCurrentUser();
			TableRow sprteleRow = null;
			NString defHouseholdUpdate= NString.getNull();
			NString lvQueryOnly = toStr("N");
			AptaddrAdapter rAptaddrRow = (AptaddrAdapter)this.getFormModel().getAptaddr().getRowAdapter();
			try
			{
				//  Check to see if role is query only...just call one time per populate request.
				if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
				{
					lvQueryOnly = toStr("Y");
				}
				// 
				//  First check to see if there are any household member associated
				//  with selected pidm
				pidmIn=toStr(getFormModel().getKeyBlock().getPidm());
				//Setting query parameters
				ptiCursorCnt.addParameter("P_PIDM_IN", pidmIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursorCnt.
				ptiCursorCnt.open();
				ResultSet ptiCursorCntResults = ptiCursorCnt.fetchInto();
				if ( ptiCursorCntResults != null ) {
					householdCnt = ptiCursorCntResults.getNumber(0);
				}
				ptiCursorCnt.close();
				//  Only continue if there is at least 1 household members
				if ( householdCnt.greater(0) )
				{
					//  Pick up household update information
					defHouseholdUpdate = selectAubinst1();
					// 
					//  Pick up International Access Code, if one exists.
					// 
					//Setting query parameters
					ptiCursor2.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
					ptiCursor2.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
					ptiCursor2.addParameter("SPRADDR_SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
					ptiCursor2.open();
					sprteleRow = ptiCursor2.fetchRow();
					ptiCursor2.close();
					//  Pick up the appropriate TELE_CODE.
					//  Chose to do this as the form one can be null if person has no phone number.
					//MORPHIS TODO MP
					//teleIn=sprteleRow.SprteleTeleCode;
					teleIn = sprteleRow.getStr("SprteleTeleCode");
					//Setting query parameters
					ptiCursor3.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
					ptiCursor3.addParameter("P_TELE_IN", teleIn);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor3.
					ptiCursor3.open();
					ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
					if ( ptiCursor3Results != null ) {
						getFormModel().getAptaddrHeader().setAddrTeleCode(ptiCursor3Results.getStr(0));
						getFormModel().getAptaddrHeader().setAddrTeleDesc(ptiCursor3Results.getStr(1));
					}
					ptiCursor3.close();
					//if ( !sprteleRow.SprteleCtryCodePhone.isNull() )
					if ( !sprteleRow.getStr("SprteleCtryCodePhone").isNull() )
					{
						getFormModel().getAptaddrHeader().setAddrPhone(toStr("+").append(ltrim(sprteleRow.getStr("SprteleCtryCodePhone").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneArea").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneNumber").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneExt"))));
					}
					else if ( !sprteleRow.getStr("SprteleIntlAccess").isNull() ) {
						getFormModel().getAptaddrHeader().setAddrPhone(toStr("+").append(ltrim(sprteleRow.getStr("SprteleIntlAccess").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneArea").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneNumber").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneExt"))));
					}
					else {
						getFormModel().getAptaddrHeader().setAddrPhone(isNull(ltrim(sprteleRow.getStr("SprtelePhoneArea").append(" ")).append(ltrim(sprteleRow.getStr("SprtelePhoneNumber").append(" "))).append(ltrim(sprteleRow.getStr("SprtelePhoneExt"))), GNls.Fget(toStr("APAIDEN-0069"), toStr("FORM"), toStr("No current primary phone"))));
					}
					//  Setup header block
					getFormModel().getAptaddrHeader().setAddrAtypCode(spraddrElement.getSpraddrAtypCode());
					//  Begin Defect 1-3CLOW4       
					//      :APTADDR_HEADER.ADDR_NAME_LF30 := substr(F_FORMAT_NAME(:KEY_BLOCK.PIDM,'LF30'),1,29);
					getFormModel().getAptaddrHeader().setAddrNameLf30(StoredProcedures.fFormatName(toStr(getFormModel().getKeyBlock().getPidm()), toNumber("LFMI"),NString.getNull(),NString.getNull(),NString.getNull(),NString.getNull()));
					//  End Defect 1-3CLOW4       
					getFormModel().getAptaddrHeader().setAddrId(spridenCurrentElement.getSpridenId());
					getFormModel().getAptaddrHeader().setAddrAtypDesc(spraddrElement.getAtypDescription());
					getFormModel().getAptaddrHeader().setAddrAddrSeqno(spraddrElement.getSpraddrSeqno());
					getFormModel().getAptaddrHeader().setAddrHouseNumber(spraddrElement.getSpraddrHouseNumber());
					getFormModel().getAptaddrHeader().setAddrStreetLine1(spraddrElement.getSpraddrStreetLine1());
					getFormModel().getAptaddrHeader().setAddrCity(spraddrElement.getSpraddrCity());
					getFormModel().getAptaddrHeader().setAddrStatCode(spraddrElement.getSpraddrStatCode());
					//  Begin 1-37ALOS
					//      :APTADDR_HEADER.ADDR_ZIP := SUBSTR(:SPRADDR.SPRADDR_ZIP,1,5);
					getFormModel().getAptaddrHeader().setAddrZip(spraddrElement.getSpraddrZip());
					//  End 1-37ALOS         
					getFormModel().getAptaddrHeader().setAddrFromDate(spraddrElement.getSpraddrFromDate());
					getFormModel().getAptaddrHeader().setAddrToDate(spraddrElement.getSpraddrToDate());
					getFormModel().getAptaddrHeader().setAddrStreetLine2(spraddrElement.getSpraddrStreetLine2());
					getFormModel().getAptaddrHeader().setAddrStreetLine3(spraddrElement.getSpraddrStreetLine3());
					getFormModel().getAptaddrHeader().setAddrStreetLine4(spraddrElement.getSpraddrStreetLine4());
					getFormModel().getAptaddrHeader().setAddrCntyCode(spraddrElement.getSpraddrCntyCode());
					getFormModel().getAptaddrHeader().setAddrNatnCode(spraddrElement.getSpraddrNatnCode());
					if ( !getFormModel().getAptaddrHeader().getAddrNatnCode().isNull() )
					{
						getFormModel().getAptaddrHeader().setAddrNatnDesc(GbStvnatn.fGetDescription(getFormModel().getAptaddrHeader().getAddrNatnCode()));
					}
					if ( !getFormModel().getAptaddrHeader().getAddrCntyCode().isNull() )
					{
						getFormModel().getAptaddrHeader().setAddrCntyDesc(GbStvcnty.fGetDescription(getFormModel().getAptaddrHeader().getAddrCntyCode()));
					}
					//  Done with header information now go to work figuring out all direct and indirect
					//  household connections.  Results will be stored in array.
					//  put original household pidm into working variable
					//  initialize counters to 1
					oPidm = toNumber(getFormModel().getKeyBlock().getPidm());
					recCntr = toNumber(1);
					revIndex = recCntr;
					//  put the original pidm in position 1 of the "array"
					tHousehold.get(recCntr).householdPidm = toStr(oPidm);
					tHousehold.get(recCntr).reviewedInd = toStr("N");
					 OUTER_TABLE:;
					while (true) {
						//  open cursor of all distinct pidms householded with working
						//  pidm and set current working pidm's reviewed indicator to Y
						pidmIn=toStr(oPidm);
						//Setting query parameters
						ptiCursor.addParameter("P_PIDM_IN", pidmIn);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						tHousehold.get(revIndex).reviewedInd = toStr("Y");
						 BUILD_TABLE:;
						while (true) {
							//  fetch next householded person for working pidm.
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								tPidm = ptiCursorResults.getNumber(0);
								tSpouseInd = ptiCursorResults.getStr(1);
								tDummy1 = ptiCursorResults.getStr(2);
								tDummy2 = ptiCursorResults.getNumber(3);
							}
							if ( ptiCursor.found() )
							{
								//  if we find one, see if they are already in the list
								tAlreadyExists = toBool(NBool.False);
								for ( int i = 1; i <= recCntr.toInt32(); i++ )
								{
									//  if in the list, then set flag to true and exit for..loop
									if ( tHousehold.get(i).householdPidm.equals(tPidm) )
									{
										tAlreadyExists = toBool(NBool.True);
									}
									//  can exit early if we find it.
									//MORPHIS TODO MP nasty 
									if ( tAlreadyExists.equals("True") ) 
										break;
								}
								//  if pidm was already in list, then skip the next part and
								//  fetch the next one. Otherwise, add this new one to the list
								//  and update counter.
								if ( tAlreadyExists.not() )
								{
									recCntr = recCntr.add(1);
									tHousehold.get(recCntr).householdPidm = toStr(tPidm);
									tHousehold.get(recCntr).spouseInd = tSpouseInd;
									tXrefCode = toStr(null);
									currPidmIn=tHousehold.get(1).householdPidm;
									pidmIn=toStr(tPidm);
									//Setting query parameters
									ptiCursorXref.addParameter("P_CURR_PIDM_IN", currPidmIn);
									ptiCursorXref.addParameter("P_PIDM_IN", pidmIn);
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursorXref.
									ptiCursorXref.open();
									ResultSet ptiCursorXrefResults = ptiCursorXref.fetchInto();
									if ( ptiCursorXrefResults != null ) {
										tXrefCode = ptiCursorXrefResults.getStr(0);
									}
									ptiCursorXref.close();
									tHousehold.get(recCntr).xrefCode = tXrefCode;
									tHousehold.get(recCntr).reviewedInd = toStr("N");
								}
							}
							else {
								//  exit build table loop when there are no more
								//  household members with working pidm.
								if ( ptiCursor.notFound() ) 
									break;
							}
						}
						ptiCursor.close();
						//  Now review our current list and find the next one
						//  that has not yet been reviewed.  If we find one,
						//  set working pidm to that person, and set index
						//  to that working pidm.  Process like we did the
						//  oriiginal one.
						unreviewedFound = toBool(NBool.False);
						for ( int i = (revIndex.toInt32() + 1); i <= recCntr.toInt32(); i++ )
						{
							if ( tHousehold.get(i).reviewedInd.equals("N") )
							{
								oPidm = toNumber(tHousehold.get(i).householdPidm);
								revIndex = toNumber(i);
								unreviewedFound = toBool(NBool.True);
							}
							//MORPHIS TODO MP nasty 
							if ( unreviewedFound.equals("True") ) 
								break;
						}
						//  If all have been reviewed e.g. unreviewed_found remains false
						//  after looping through all the records, then we are done
						//  exit the outer loop and process results.
						if ( unreviewedFound.not() ) 
							break;
					}
					householdCnt = recCntr.subtract(1);
					//  print out our results. e.g. add them to aptaddr table
					//       for i in 1 .. rec_cntr loop
					//         dbms_output.put_line(to_char(t_household(i).household_pidm,'99999990')||' '||t_household(i).reviewed_ind);
					//       end loop;
					// 
					//  We have pidms stored in t_household array get address information for each one (except for first one)
					for ( int i = 2; i <= recCntr.toInt32(); i++ )
					{
						pidmIn = tHousehold.get(i).householdPidm;
						spsIndIn = tHousehold.get(i).spouseInd;
						xrefIn = tHousehold.get(i).xrefCode;
						//Setting query parameters
						ptiCursor1.addParameter("P_PIDM_IN", pidmIn);
						ptiCursor1.addParameter("P_SPS_IND_IN", spsIndIn);
						ptiCursor1.addParameter("P_XREF_IN", xrefIn);
						ptiCursor1.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor1.
						ptiCursor1.open();
						ResultSet ptiCursor1Results = ptiCursor1.fetchInto();						
						if ( ptiCursor1Results != null ) {
							rAptaddrRow.setAptaddrPidm(ptiCursor1Results.getNumber(0));
							rAptaddrRow.setAptaddrHeadInd(ptiCursor1Results.getStr(1));
							rAptaddrRow.setAptaddrId(ptiCursor1Results.getStr(2));
							rAptaddrRow.setAptaddrNameLf30(ptiCursor1Results.getStr(3));
							rAptaddrRow.setAptaddrXrefCode(ptiCursor1Results.getStr(4));
							rAptaddrRow.setAptaddrAtypCode(ptiCursor1Results.getStr(5));
							rAptaddrRow.setAptaddrHouseNumber(ptiCursor1Results.getStr(6));
							rAptaddrRow.setAptaddrStreetLine1(ptiCursor1Results.getStr(7));
							rAptaddrRow.setAptaddrStreetLine2(ptiCursor1Results.getStr(8));
							rAptaddrRow.setAptaddrStreetLine3(ptiCursor1Results.getStr(9));
							rAptaddrRow.setAptaddrStreetLine4(ptiCursor1Results.getStr(10));
							rAptaddrRow.setAptaddrCity(ptiCursor1Results.getStr(11));
							rAptaddrRow.setAptaddrStatCode(ptiCursor1Results.getStr(12));
							rAptaddrRow.setAptaddrZip(ptiCursor1Results.getStr(13));
							rAptaddrRow.setAptaddrCntyCode(ptiCursor1Results.getStr(14));
							rAptaddrRow.setAptaddrNatnCode(ptiCursor1Results.getStr(15));
							rAptaddrRow.setAptaddrFromDate(ptiCursor1Results.getDate(16));
							rAptaddrRow.setAptaddrToDate(ptiCursor1Results.getDate(17));
							rAptaddrRow.setAptaddrAge(ptiCursor1Results.getNumber(18));
							rAptaddrRow.setAptaddrPhone(ptiCursor1Results.getStr(19));
						}
						if ( ptiCursor1.found() )
						{
							sqlrowcount = sqlrowcount.add(1);
							rAptaddrRow.setAptaddrSessionid(sessionidStamp);
							rAptaddrRow.setAptaddrUser(getFormModel().getFormHeader().getCurrentUser());
							rAptaddrRow.setAptaddrActivityDatetime(toDate(sysdateStamp));
							//  If more than one active address, set updatable indicator to N.
							//  Also, set to 'N', if query only role.
							if ( Aokhhld.fActiveAddresses(rAptaddrRow.getAptaddrPidm(), rAptaddrRow.getAptaddrAtypCode()).greater(1) || lvQueryOnly.equals("Y") )
							{
								rAptaddrRow.setAptaddrUpdatableInd(toStr("N"));
							}
							else {
								rAptaddrRow.setAptaddrUpdatableInd(toStr("Y"));
							}
							if ( rAptaddrRow.getAptaddrUpdatableInd().equals("Y") )
							{
								setItemUpdateAllowed("APTADDR_SLCT_IND", ItemServices.CURRENT_RECORD, true);
							}
							else {
								setItemUpdateAllowed("APTADDR_SLCT_IND", ItemServices.CURRENT_RECORD, false);
							}
							if ( isNull(rAptaddrRow.getAptaddrStreetLine1(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrStreetLine1(), "#")) || (rAptaddrRow.getAptaddrStreetLine1().equals(currentAddressText) && isNull(getFormModel().getAptaddrHeader().getAddrStreetLine1(), "#").equals("#")) || isNull(rAptaddrRow.getAptaddrStreetLine2(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrStreetLine2(), "#")) || isNull(rAptaddrRow.getAptaddrStreetLine3(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrStreetLine3(), "#")) || isNull(rAptaddrRow.getAptaddrStreetLine4(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrStreetLine4(), "#")) || isNull(rAptaddrRow.getAptaddrHouseNumber(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrHouseNumber(), "#")) || isNull(rAptaddrRow.getAptaddrCity(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrCity(), "#")) || isNull(rAptaddrRow.getAptaddrStatCode(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrStatCode(), "#")) || isNull(rAptaddrRow.getAptaddrZip(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrZip(), "#")) || isNull(rAptaddrRow.getAptaddrCntyCode(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrCntyCode(), "#")) || isNull(rAptaddrRow.getAptaddrNatnCode(), "#").notEquals(isNull(getFormModel().getAptaddrHeader().getAddrNatnCode(), "#")) || trunc(isNull(rAptaddrRow.getAptaddrFromDate(), NDate.getNow())).notEquals(trunc(isNull(getFormModel().getAptaddrHeader().getAddrFromDate(), NDate.getNow()))) || trunc(isNull(rAptaddrRow.getAptaddrToDate(), NDate.getNow())).notEquals(trunc(isNull(getFormModel().getAptaddrHeader().getAddrToDate(), NDate.getNow()))) )
							{
								//  End 1-2WIF92
								rAptaddrRow.setAptaddrAddressCompareInd(toStr("#"));
							}
							else {
								rAptaddrRow.setAptaddrAddressCompareInd(NString.getNull());
							}
							if ( rAptaddrRow.getAptaddrPhone().notEquals(getFormModel().getAptaddrHeader().getAddrPhone()) )
							{
								rAptaddrRow.setAptaddrPhoneCompareInd(toStr("#"));
							}
							else {
								rAptaddrRow.setAptaddrPhoneCompareInd(NString.getNull());
							}
							if ( (rAptaddrRow.getAptaddrAddressCompareInd().isNull() && rAptaddrRow.getAptaddrPhoneCompareInd().isNull()) || defHouseholdUpdate.notEquals("Y") || rAptaddrRow.getAptaddrUpdatableInd().equals("N") )
							{
								rAptaddrRow.setAptaddrSlctInd(toStr("N"));
							}
							else {
								rAptaddrRow.setAptaddrSlctInd(toStr("Y")) ;
							}
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Aokhhld.pAptaddrInsert(/*pAptaddrSlctInd=>*/rAptaddrRow.getAptaddrSlctInd(), /*pAptaddrUpdatableInd=>*/rAptaddrRow.getAptaddrUpdatableInd(), /*pAptaddrPidm=>*/rAptaddrRow.getAptaddrPidm(), /*pAptaddrHeadInd=>*/rAptaddrRow.getAptaddrHeadInd(), /*pAptaddrAtypCode=>*/rAptaddrRow.getAptaddrAtypCode(), /*pAptaddrHouseNumber=>*/rAptaddrRow.getAptaddrHouseNumber(), /*pAptaddrStreetLine1=>*/rAptaddrRow.getAptaddrStreetLine1(), /*pAptaddrStreetLine2=>*/rAptaddrRow.getAptaddrStreetLine2(), /*pAptaddrStreetLine3=>*/rAptaddrRow.getAptaddrStreetLine3(), /*pAptaddrStreetLine4=>*/rAptaddrRow.getAptaddrStreetLine4(), /*pAptaddrCity=>*/rAptaddrRow.getAptaddrCity(), /*pAptaddrStatCode=>*/rAptaddrRow.getAptaddrStatCode(), /*pAptaddrZip=>*/rAptaddrRow.getAptaddrZip(), /*pAptaddrCntyCode=>*/rAptaddrRow.getAptaddrCntyCode(), /*pAptaddrNatnCode=>*/rAptaddrRow.getAptaddrNatnCode(), /*pAptaddrSessionid=>*/rAptaddrRow.getAptaddrSessionid(), /*pAptaddrUser=>*/rAptaddrRow.getAptaddrUser(), /*pAptaddrActivityDate=>*/rAptaddrRow.getAptaddrActivityDatetime(), /*pAptaddrNameLf30=>*/rAptaddrRow.getAptaddrNameLf30(), /*pAptaddrId=>*/rAptaddrRow.getAptaddrId(), /*pAptaddrXrefCode=>*/rAptaddrRow.getAptaddrXrefCode(), /*pAptaddrAge=>*/rAptaddrRow.getAptaddrAge(), /*pAptaddrAddressCompareInd=>*/rAptaddrRow.getAptaddrAddressCompareInd(), /*pAptaddrPhoneCompareInd=>*/rAptaddrRow.getAptaddrPhoneCompareInd(), /*pAptaddrPhone=>*/rAptaddrRow.getAptaddrPhone(), /*pAptaddrFromDate=>*/rAptaddrRow.getAptaddrFromDate(), /*pAptaddrToDate=>*/rAptaddrRow.getAptaddrToDate());
						}
						ptiCursor1.close();
					}
					//  Insert a header record to identify who we are working on.
					//      :APTADDR.APTADDR_PIDM := :KEY_BLOCK.PIDM;
					//      :APTADDR.APTADDR_HEAD_IND := '1';
					//      :APTADDR.APTADDR_SLCT_IND := 'N';
					//      :APTADDR.APTADDR_ATYP_CODE := :SPRADDR.SPRADDR_ATYP_CODE;
					//      :APTADDR.APTADDR_SESSIONID := SESSIONID_STAMP;
					//      :APTADDR.APTADDR_ADDRESS_COMPARE_IND := NULL;
					//      :APTADDR.APTADDR_PHONE_COMPARE_IND := NULL;
					//      :APTADDR.APTADDR_USER := :CURRENT_USER;
					//      :APTADDR.APTADDR_ACTIVITY_DATETIME := SYSDATE_STAMP;
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Aokhhld.pAptaddrInsert(/*pAptaddrSlctInd=>*/ toStr("N") , toStr(/*pAptaddrUpdatableInd=>*/null), /*pAptaddrPidm=>*/getFormModel().getKeyBlock().getPidm(), /*pAptaddrHeadInd=>*/ toStr("1"), /*pAptaddrAtypCode=>*/spraddrElement.getSpraddrAtypCode(), toStr(/*pAptaddrHouseNumber=>*/null), toStr(/*pAptaddrStreetLine1=>*/null), toStr(/*pAptaddrStreetLine2=>*/null), toStr(/*pAptaddrStreetLine3=>*/null), toStr(/*pAptaddrStreetLine4=>*/null), toStr(/*pAptaddrCity=>*/null), toStr(/*pAptaddrStatCode=>*/null), toStr(/*pAptaddrZip=>*/null), toStr(/*pAptaddrCntyCode=>*/null), toStr(/*pAptaddrNatnCode=>*/null), /*pAptaddrSessionid=>*/sessionidStamp, /*pAptaddrUser=>*/getFormModel().getFormHeader().getCurrentUser(), /*pAptaddrActivityDate=>*/sysdateStamp, toStr(/*pAptaddrNameLf30=>*/null), toStr(/*pAptaddrId=>*/null), toStr(/*pAptaddrXrefCode=>*/null), toNumber(/*pAptaddrAge=>*/null), toStr(/*pAptaddrAddressCompareInd=>*/null), toStr(/*pAptaddrPhoneCompareInd=>*/null), toStr(/*pAptaddrPhone=>*/null), toDate(/*pAptaddrFromDate=>*/null), toDate(/*pAptaddrToDate=>*/null));
					//      NEXT_RECORD;     
					// 
					doSilentCommit();
					//  Do GO_BLOCK and EXECUTE_QUERY to hide the HEAD_IND='1' record.
					//  GO_BLOCK('APTADDR');
					executeQuery();
				}
				else {
				}
			}
			catch(Exception  e)
			{
				errorMessage(substring(errorMessage(), toInt(1), toInt(200)));
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit DO_SILENT_COMMIT
	
	PROCEDURE DO_SILENT_COMMIT IS
BEGIN
	-- Set message level so that the obvious (number of records being saved to temporary table)
	-- are not returned to the user.
  :SYSTEM.MESSAGE_LEVEL := '5';
  IF G$_QUERY_ONLY_ROLE THEN
      gb_common.p_commit;
  ELSE
      COMMIT_FORM ;
  END IF;
  :SYSTEM.MESSAGE_LEVEL := '0';
END;
	*/
	//ID:5197
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void doSilentCommit()
		{
			//  Set message level so that the obvious (number of records being saved to temporary table)
			//  are not returned to the user.
			// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
			if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
			{
				GbCommon.pCommit();
			}
			else {
				commitTask();
			}
			// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
			MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
		}

	
	/* Original PL/SQL code for Prog Unit CURRENT_ADDRESS_INACTIVE
	
	FUNCTION CURRENT_ADDRESS_INACTIVE RETURN BOOLEAN IS
    PTI_INTO_TEMP        VARCHAR2(1);
      CURSOR PTI_CURSOR IS
         SELECT 'N'
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :KEY_BLOCK.PIDM
           AND  SPRADDR_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
           AND  SPRADDR_STATUS_IND IS NULL
           AND  TRUNC(SYSDATE) BETWEEN TRUNC(NVL(SPRADDR_FROM_DATE,SYSDATE)) 
                                   AND TRUNC(NVL(SPRADDR_TO_DATE,SYSDATE))
           AND  SPRADDR_SEQNO = :SPRADDR.SPRADDR_SEQNO ;
BEGIN
   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
   IF PTI_CURSOR%NOTFOUND THEN
        PTI_INTO_TEMP := 'Y' ;
   END IF ;
   CLOSE PTI_CURSOR ;
   RETURN (PTI_INTO_TEMP = 'Y') ;
END ;
	*/
	//ID:5198
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool currentAddressInactive(SpraddrAdapter spraddrElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'N' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR_STATUS_IND IS NULL AND TRUNC(SYSDATE) BETWEEN TRUNC(NVL(SPRADDR_FROM_DATE, SYSDATE)) AND TRUNC(NVL(SPRADDR_TO_DATE, SYSDATE)) AND SPRADDR_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.notFound() )
				{
					ptiIntoTemp = toStr("Y");
				}
				ptiCursor.close();
				return (toBool(ptiIntoTemp.equals("Y")));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_SPRADDR_2
	
	   FUNCTION SELECT_SPRADDR_2
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR.SPRADDR_PIDM = :KEY_BLOCK.PIDM
           AND  SPRADDR.SPRADDR_ATYP_CODE =
              :SPRADDR.SPRADDR_ATYP_CODE
           AND  SPRADDR.SPRADDR_STATUS_IND IS NULL
           AND  ((SPRADDR_TO_DATE IS NULL
           AND  SPRADDR_FROM_DATE IS NULL)
            OR  ((NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)))
            OR  (NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))))
            OR  ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
                AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)))
            OR  (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))
               BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT)) AND
                NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),
                G$_DATE.GET_NLS_DATE_FORMAT))))) ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:5199
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool selectSpraddr2(SpraddrAdapter spraddrElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR.SPRADDR_PIDM = :KEY_BLOCK_PIDM AND SPRADDR.SPRADDR_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND SPRADDR.SPRADDR_STATUS_IND IS NULL AND ((SPRADDR_TO_DATE IS NULL AND SPRADDR_FROM_DATE IS NULL) OR ((NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)))) OR ((NVL(SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) OR (NVL(SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) BETWEEN NVL(:SPRADDR_FROM_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT)) AND NVL(:SPRADDR_TO_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))))) ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
				ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
				ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
				ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.notFound()));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit CHK_ADDR_EXIST
	
	PROCEDURE CHK_ADDR_EXIST (NO_ADDR_INFO IN OUT NUMBER) IS
BEGIN
   IF (:SPRADDR_CITY IS NULL) AND
      (:SPRADDR_STAT_CODE IS NULL) AND
      (:SPRADDR_CNTY_CODE IS NULL) AND
      (:SPRADDR_NATN_CODE IS NULL) THEN
         NO_ADDR_INFO := 1;
   ELSE
      NO_ADDR_INFO := 0;
   END IF;
END;
	*/
	//ID:5200
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param noAddrInfo
		*/
		public void chkAddrExist(SpraddrAdapter spraddrElement, Ref<NNumber> noAddrInfo)
		{
			if ( (spraddrElement.getSpraddrCity().isNull()) && (spraddrElement.getSpraddrStatCode().isNull()) && (spraddrElement.getSpraddrCntyCode().isNull()) && (spraddrElement.getSpraddrNatnCode().isNull()) )
			{
				noAddrInfo.val = toNumber(1);
			}
			else {
				noAddrInfo.val = toNumber(0);
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1
1. Forms 4.0 conversion. ( Re-enginerred )    NM 08/22/94
2. Changed post_change on spraddr_to_date to allow a null from date and to date in future.
   Corrected trigger GET_FULLNAME to format correctly and moved to form level.
   Executed GET_FULLNAME at post-update of spriden_current & spbpers blocks.
   Referenced G$_CAUTION_OK_ALERT.
   Moved Global.alum_form_call... condition from 
    when-new-block-instance to when-new-form-instance.
   Created a when-new-block-instance for spraddr block and modified row
    in guroptm for address.
   Execute save_keys when Names form called (button & menu option).
   Removed trigger check_finaid. Added trig check_pref_addr.
   Added correct audit trail from original APAIDEN.
   Don't allow entry in spouse Id if null.
   Delete blocks SPAPERS, SPATELE, GUASYST & SOAAPPT.
   Delete ALL LEGAL_... Buttons.
   Comment out erronious post-insert on spriden block.
   Delete canvas _7_CANVAS.
   Changed when_val item trigs on last,first,mid names to 
    post-change so they won't fire if item is null.
   Reference in G$_DETERMINE... series and apply correctly.
   Corrected enabling & disabling of items.
   Disallow access to SPBPERS stuff if non-person.
   Disable check boxes in address window.
   Created a key-crerec in spraddr block to eliminate error on atyp btn.
   Alignment centered on screen elements.
   Added key-nxtkey & select button on spraddr block.
   Changed menu attached to Gumeval from Gumappl to provide an Action.Select menu pick.
     FHL 11/15/94 - 11/18/94
3. Added spbpers_sex item & default value of 'N' so record
   can be accessible on form apapers.
4. Added auto hint on SPBPERS items.
   Changed when-new-block-instance @ form level to query block if system.current block is SPBPERS unconditionally. (This will account for navigation to APANAME where a SPBPERS row may get created.)
   Suppress 'No record...' message in spriden_current block. 
   Add navigation logic so SPBPERS block dosn't look like a 
    different block. 
   Added key-exeqry to spriden_current block.
   Disable key-clrblk & key-crerec in SPBPERS block.
   Add post-insert to disable non-pers name item conditionally. FHL    11/21/94 - 11/22/94
5. Removed execution of check_finaid in pre-update of spriden block.
   Changed A$_SEL_ID_INFO (pl/sql unit) to SEL_ID_INFO_CUSTOM as it is not referenced. Also modified this unit to affect spouse item disabling.
   Changed error message in check_pref_addr trigger.
   Correct get_fullname trigger to format non-person name into key block.
    FHL  11/29/94
6. Comment out last-record in key-crerec of spraddr block as dosn't seem to be causing a problem anymore. Solution was to value an item in the record if rowid is null in the atyp_lbt when-button-pressed trigger.  FHL 2/8/95
7. Remove check_phones trigger from post-query of spraddr block, and add trigger to pre-insert & pre-update of spraddr block. FHL 2/9/95
8. Added capture of record number of preferred address to post-query so a when-new-record-instance (SPRADDR block) can navigate to the preferred address. This required the ALL_RECORDS parameter to the EXECUTE_QUERY of SPRADDR block. FHL 2/9/95.
9. Made address button behave like the menu option. FHL
AUDIT TRAIL: 2.1.1
1. Error message editing in SEL_ID_INFO_CUSTOM.  FHL 2/21/95
   Created trigger SET_ALUMNI_BTN_LABEL and fired in pre-block of spraddr blocks, as well as post-insert of spriden_current block. FHL 2/21/95
2. Added check of global.form_was_called to the when-new-form-instance trigger. If global.alum_called_form = 'Y' then it will go to SPRADDR block. IF global.form_was_called = 'Y' then it will just do a NEXT_BLOCK.  FHL  3/1/95
3. Boilerplate changes for VGA mode. FHL 3/6/95
4. Added Spouse donor category logic. FHL 3/13/95
5. Post 2.1 cleanup. FHL 3/23/95
6. Replaced calls to GUQSECR with G$_SECURED_FORM_CALL PL/SQL unit. FHL 3/23/95
7. Corrected post-change of spriden_current.non_pers_name. This form desperatly needs the post-change triggers on database items changed to post-query logic. When that is done, put logic of post-change on non-database items in when-validate-item triggers to conform with new technology; and get rid of the "ACE" produced logic. FHL 3/23/95
8. Value global.form_was_called in CALL to APANAME. FHL 4/17/95
9. CHAR & MAC mode mods. FHL 4/20/95
10. CHAR mode button mods. FHL 5/18/95
AUDIT TRAIL: 2.1.5
1. Security Mods. FHL 8/21/95
2. Defect # 3145. Removed KEY-CLRFRM trigger in SPRADDR block. FHL 8/31/95
3. Removed reference to sys in front of dual access. FHL 9/12/95
4. In pre-update of spriden_current block, I changed message about deleting record from previous Identification window. FHL 9/12/95
5. Added NO_ACKNOWLEDGE to message about not being a Constituent. Turned auto skip off of SPRADDR_ASRC_CODE. In when-validate-item of SPRADDR_ASRC_CODE, return if item is null. Added two cursor to the pre-update of SPRADDR block that checks if preffered address is being made Inactive. (these came from AGAGIFT) FHL 9/25/95
6. Changed $$DATE$$ to $$DBDATE$$.  SCG 10/17/95
7. Moved the logic from the WHEN-VALIDATE-ITEM trigger of
   the SPRADDR_TO_DATE item to the block level trigger
   CHECK_DATES.  This was done to prevent an error message
   appearing twice when the to date is less than the from 
   date.  SCG 10/17/95
8. Modified address, names, and source buttons to be disabled in key_block.  JB  10/19/95
9. Modified pre-insert and pre-update of spraddr block to set spraddr_status_ind = 'I' if to_date < sysdate.  JB  10/19/95
AUDIT TRAIL: 2.1.11
1. Defect #4057.  Made name prefix & suffix 20 charaters long. Made marital desc 30 (not 20) & made it a display item. Made ATYP, CNTY, NATN description items display items. Made spriden_change_ind, previous name and user name display items. Made spraddr_delivery_point queryable. FHL 1/24/96
2. Defect #3654.  Modified key-nxtkey of SPRADDR block to check block status if form was called.  If status = 'query' does exit with value, if 'new' or'changed' goes to zip code field.  JB  02/02/96
3. Added spriden_ntyp_codes to current and previous blocks for Name Type mods.  Added display item for descriptions.  Referenced GTVNTYP RG/LOV. Modified post-query triggers and added when-new-item-inst to ntyp codes to bring in desc. Modified navigation in current block to go to name type from ID.   JB  02/12/96
4. Key-nxtblk from spriden_current and key-prvblk from spraddr were executing query of spriden_previous block, in addition to the when-new-block-inst trigger of spriden_previous.  Removed exeqry from key triggers to prevent 'Query caused no records to be retrieved' from showing up in alert box.  JB  03/21/96
5. Modified spriden_current.spriden_activity_date to default $$DBDATETIME$$ instead of $$DBDATE$$ and modified pre-update for spriden_current block to time stamp spriden activity date. Created pre-update for spriden_previous block to time stamp spriden activity date. JB  03/21/96
6. Removed unneeded code from SEL_ID_INFO_CUSTOM PL/SQL unit to improve performance (as identified by VATECH). FHL 7/18/96.
7. Added local function F_SELECT_DONOR_CATG to eliminate references to view APVDPRI in SEL_ID_INFO_CUSTOM PL/SQL unit to improve performance. FHL 7/19/96.
8. Convert to Forms 4.5. SCG 09/03/96
9. Added 'Rollback' Issue logic. FHL 9/5/96
10. Changed reference of GTVNTYP_RG & LOV from GOQOLIB to AOQOLIB temporarily. FHL 9/6/96
11. Changed SEL_ID_INFO_CUSTOM (see unit). FHL 9/11/96
12. Enlarged the Previous Id window.  Correct punctuation
    in Auto Help in various locations.     SCG 09/13/96
13. Added POST-BLOCK trigger to the address block to
    disable the Spouse and Employee buttons.  Added code to
    the Pre-block trigger of the address block to enable
    the Spouse and Employee buttons if the constituent is
    not an Orgnaization.                   SCG 09/13/96
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5201
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
 1. Align boilerplate & change a cancel btn to close. FHL 10/17/96
 2. Added KEY-NXTBLK & KEY-PRVBLK to SPBPERS block. FHL 01/22/97
 3. Added E-mail address button (EMAL_BTN) to call new form. FHL 1/29/97
 4. Created function emal_exists to dynamically change button face
    to show if email addresses exist. FHL 1/29/97
 5. Changed AOAEMAL to APAEMAL. FHL 2/4/97
 6. Changed KEY-NEXT-ITEM of SPBPERS_MRTL_CODE and NON_PERS_NAME to provide
    navigation to NON_PERS_NAME when ID is GENERATED. FHL 2/12/97
 7. Changed WHEN-NEW-BLOCK-INSTANCE of SPRIDEN_PREVIOUS Block. I reduced
    the Y coordinate by one (1) for CHARMODE so the SPRIDEN_PREVIOUS_WINDOW
    would not cover the Auto Help on Character mode devices. FHL 2/13/97
 8. Changed KEY-NEXT-ITEM of SPBPERS_MRTL_CODE to provide navigation
    to NON_PERS_NAME when :SPRIDEN_CURRENT.ROWID IS NULL. This provides
    for navigation when user enters a new ID of a Company. FHL 2/14/97
 9. Added editing in validation of NON_PERS_NAME to not allow name prefix
    suffix or Marital Code with a Company name. FHL 2/14/97
10. Changed WHEN_WINDOW_ACTIVATED for defect # 5889. Also added
    ('ALL_RECORDS') to the execute query of SPRADDR block in the 
    WHEN-NEW-FORM-INSTANCE trigger to query the preferred address. FHL 2/20/97
11. Defect #6128. Updating the address source code of an inactive address produces warning
    message "WARNING" Preferred address is being inactivated - although it 
    doesn't inactivate it.  This message displays twice.
    - moved logic from the PRE-UPDATE trigger of the SPRADDR block to the 
      WHEN-VALIDATE-ITEM triggers of SPRADDR_STATUS_IND and SPRADDR_TO_DATE.
    SCG 03/07/1997
12. Removed all references to 'SYNCHRONIZE; G$_SET_INST_PROPERTY;' from all triggers that
    call other forms.   JB  04/10/97
13. Decision was made to allow duplicate Name Types for a pidm.  I commented out the test
    for duplicate name types in the WHEN-VALIDATE-ITEM triggers of the spriden_ntyp_code 
    items in the spriden_current and spriden_previous blocks.
    SCG 4/10/1997
14. Removed local function F_SELECT_DONOR_CATG and replaced it with the database version.
    SCG 4/10/1997
15. Converted to Dev2k 1.3. 5/11/97
16. Turned on Show Keys for KEY-DUPREC on ID in key block. FHL 5/14/97
17. a. Modified WHEN-WINDOW-ACTIVATED. 
    b. Made SPRADDR pre-block and post-block triggers Execution Style
       AFTER so form level pre-block would fire and refresh menu options.
    FHL 6/20/97
18. Modified SEL_ID_INFO_CUSTOM to display sps_deceased_ind if sps has no ID.  
    JB  08/19/97
AUDIT TRAIL: 3.0.1
1. Added valuing of SPRADDR_ACTIVITY_DATE to PRE-INSERT trigger on Block.
   Defect # 7998. When a Duplicate record function was performed in this
   block, the activity date was getting duplicated as well and not set to
   sysdate.
   FHL 10/10/97
2. In WHEN-NEW-FORM-INSTANCE conditionally (based on whether form called)
   enable the action.select menu pick. This menu pick was enabled which 
   caused the double-click in address date fields to navigate to the Zip
   code field instead of bringing up the Calendar. Defect # 8046
   Both of these defects (7998 & 8046) posted to ED as 3.0.0.1.
   FHL 10/17/97
3. Defect #8386. Need button to call previous names/ID window. Created button,
created wbp trigger for button, created mnu_opt_blk_previous trigger so options
can use it. Modified guroptm records to use new trigger.  JVB  12/10/97
4. Changed the Default Value of SPRADDR_ACTIVITY_DATE from
   $$DATE$$ to $$DBDATE$$.
   FHL 2/19/98
5. Modified Name/ID CHANGE_IND at SPRIDEN_PREVIOUS into
   list box enabled only for new records
   GD 05/20/98
6. Modified PREVIOUS_NAME FIELD by displaying LAST_NAME, MI, FIRST_NAME istead
   when ENTITY_IND='P' using WHEN-NEW-RECORD-INSTANCE trigger. GD 05/21/98
7. Modified KEY-CREREC adding functionality for the new record. Block:SPRIDEN_PREVIOUS
   GD 05-22-98
8. Add triggers PRE-INSERT,ON-INSERT for
   the block SPRIDEN_PREVIOUS
   GD 05-27-98
9. Modified NAME_AND_ID_CHECK trigger on the form level.
   Added RTRIM function for SPRIDEN_LAST_NAME, which TRIMS OFF invisible
   extra space.
   GD 05-28-98
10.Modified KEY-NEXTREC FOR SPRIDEN_PREVIOUS Block to make block insert enabled
   GD 05-28-98
11.Added ON-UPDATE trigger on SPRIDEN_PREVIOUS
   GD 06-09-98
12.Modified KEY-DUPREC trigger on block SPRIDEN_PREVIOUS 
   GD 06-09-98
13.Added ON-ERROR trigger for SPRIDEN_PREVIOUS
   GD 06-10-98 
14.Modified PRE-INSERT and PRE_UPDATE triggers on SPRIDEN_CURRENT block
   GD 06-15-98
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5202
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit EMAILS_EXIST
	
	FUNCTION EMAILS_EXIST
   RETURN BOOLEAN IS
      CURSOR EMAL_CURSOR IS
         SELECT 'X'
         FROM   GOREMAL
         WHERE  GOREMAL_PIDM = :PIDM ;
      EMAIL_ADDR_EXISTS VARCHAR2(1);
   BEGIN
      OPEN EMAL_CURSOR ;
      FETCH EMAL_CURSOR INTO EMAIL_ADDR_EXISTS ;
      RETURN (EMAL_CURSOR%FOUND) ;
   END ;
	*/
	//ID:5203
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool emailsExist()
		{
			int rowCount = 0;
			String sqlemalCursor = "SELECT 'X' " +
	" FROM GOREMAL " +
	" WHERE GOREMAL_PIDM = :PIDM ";
			DataCursor emalCursor = new DataCursor(sqlemalCursor);
			NString emailAddrExists= NString.getNull();
			try {
				//Setting query parameters
				emalCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable emalCursor.
				emalCursor.open();
				ResultSet emalCursorResults = emalCursor.fetchInto();
				if ( emalCursorResults != null ) {
					emailAddrExists = emalCursorResults.getStr(0);
				}
				return (toBool(emalCursor.found()));
				}finally{
					emalCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5204
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
   GD 08-20-98
2. Modified ID/Name search functionality when ID is null according 4.0
   GD 08-21-98
3. Modified KEY-NEXTKEY trigger on SPRADDR to eliminate navigation to SPRADDR_ZIP
   GD 08-21-98
4. Removed WHEN-NEW-BLOCK-INSTANCE on SPRADDR block and complete logic moved into
   WHEN_NEW_BLOCK_INSTANCE_TRG on form.
   GD 09-03-98
5. Modified WHEN-WINDOWS-ACTIVATED to keep navigational order after returning from
   called form.
   GD 09-03-98  
5. Modified WHEN-NEW-BLOCK-INSTANCE on SPRIDEN_PREVIOUS to get rid of user's response
   to the message
   GD 11-11-98
6. Modified SEL_ID_INFO_CUSTOM .
   Corrected the change of F_SELECT_DONOR_CATG invocation from local to database. 
   GD   12-04-98  
7. Modified WHEN-NEW-FORM-INSTANCE,WHEN_NEW_BLOCK_INSTANCE_TRG on Form,POST-BLOCK on KEY_BLOCK 
   trigger in order to Enable/Disable 'Person Information','Employment History','Spouse Addresses'
   options in a Navigation frame.
   TV   01-15-99
8. Commented out code in WHEN-NEW-ITEM-INSTANCE trigger TV  01-15-99.
9. Changed name of ID/Name Maintenance Information to ID/Name Source Information to be
   consistent with all other XXXIDEN forms.
   JVB  03/05/1999
10.Comment code in PRE-INSERT & PRE-UPDATE of Spriden_Previous block.
   Comment code in PRE-INSERT & PRE-UPDATE of Spriden_Current block.
   This will allow mutiple occurances of same Name Type code for a pidm.
   YGUO 4/19/99  Defect # 12174
11.   04/21/99 YGUO   defect #12271
   (1)  added following two lines in WHEN_WINDOW_ACTIVATED_TRG trigger to display the 
        proper window. 
                 AND ( :GLOBAL.ALUM_CALLED_FORM <> 'Y' OR
                 :GLOBAL.ALUM_CALLED_FORM IS NULL ) 
   (2) added logic in WHEN-NEW-FORM_INSTANCE trigger to query SPRIDEN_CURRENT and SPBPERS 
       blocks prior to navigation to the SPRADDR block.
12. 05/18/99 YGUO 
  (1)removed Navigation Frame Enable/Disable logic from WHEN-VALIDATE-ITEM 
     trigger in KEY_BLOCK.ID, commented the logic in WHEN-NEM-FORM-INSTANCE trigger.
  (2)modified a GUROPTM row, created form level trigger MNU_CALL_APAPERS to allow  
     user access to APAPERS form only if :ENTITY_IND = 'P'. 
           
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5205
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit G$_LIST_VALUES_COPY
	
	PROCEDURE G$_LIST_VALUES_COPY IS
-- used in conjunciton with G$_LIST_VALUES_CALL to return
-- a selected value from a validation form
BEGIN
  COPY(NAME_IN('GLOBAL.VALUE'),NAME_IN('SYSTEM.CURSOR_ITEM'));
END;

	*/
	//ID:5206
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gListValuesCopy()
		{
			copy(getNameIn("GLOBAL.VALUE"),getCursorItem());
		}

	
	/* Original PL/SQL code for Prog Unit HOUSEHOLD_ITEMS_ENABLE
	
	PROCEDURE HOUSEHOLD_ITEMS_ENABLE IS
BEGIN
  SET_ITEM_PROPERTY('APTADDR.APTADDR_SLCT_IND',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_SLCT_IND',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_NAME_LF30',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_NAME_LF30',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_ID',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_ID',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_XREF_CODE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_XREF_CODE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_AGE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_AGE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_STREET_LINE1',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_STREET_LINE1',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_CITY',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_CITY',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_STAT_CODE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_STAT_CODE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_ZIP',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_ZIP',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.TADDR_NATN_DESC',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.TADDR_NATN_DESC',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.TADDR_CNTY_DESC',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.TADDR_CNTY_DESC',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_PHONE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_PHONE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_FROM_DATE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_FROM_DATE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('APTADDR.APTADDR_TO_DATE',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_TO_DATE',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_YES',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_YES',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_NO',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_NO',NAVIGABLE,PROPERTY_TRUE);

  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN',ENABLED,PROPERTY_TRUE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN',NAVIGABLE,PROPERTY_TRUE);

END;
	*/
	//ID:5207
	/* <p>
/* </p>
		*/
		public void householdItemsEnable()
		{
			setItemEnabled("APTADDR.APTADDR_SLCT_IND", true);
			setItemNavigable("APTADDR.APTADDR_SLCT_IND", true);
			setItemEnabled("APTADDR.APTADDR_NAME_LF30", true);
			setItemNavigable("APTADDR.APTADDR_NAME_LF30", true);
			setItemEnabled("APTADDR.APTADDR_ID", true);
			setItemNavigable("APTADDR.APTADDR_ID", true);
			setItemEnabled("APTADDR.APTADDR_XREF_CODE", true);
			setItemNavigable("APTADDR.APTADDR_XREF_CODE", true);
			setItemEnabled("APTADDR.APTADDR_AGE", true);
			setItemNavigable("APTADDR.APTADDR_AGE", true);
			setItemEnabled("APTADDR.APTADDR_STREET_LINE1", true);
			setItemNavigable("APTADDR.APTADDR_STREET_LINE1", true);
			setItemEnabled("APTADDR.APTADDR_CITY", true);
			setItemNavigable("APTADDR.APTADDR_CITY", true);
			setItemEnabled("APTADDR.APTADDR_STAT_CODE", true);
			setItemNavigable("APTADDR.APTADDR_STAT_CODE", true);
			setItemEnabled("APTADDR.APTADDR_ZIP", true);
			setItemNavigable("APTADDR.APTADDR_ZIP", true);
			setItemEnabled("APTADDR.TADDR_NATN_DESC", true);
			setItemNavigable("APTADDR.TADDR_NATN_DESC", true);
			setItemEnabled("APTADDR.TADDR_CNTY_DESC", true);
			setItemNavigable("APTADDR.TADDR_CNTY_DESC", true);
			setItemEnabled("APTADDR.APTADDR_PHONE", true);
			setItemNavigable("APTADDR.APTADDR_PHONE", true);
			setItemEnabled("APTADDR.APTADDR_FROM_DATE", true);
			setItemNavigable("APTADDR.APTADDR_FROM_DATE", true);
			setItemEnabled("APTADDR.APTADDR_TO_DATE", true);
			setItemNavigable("APTADDR.APTADDR_TO_DATE", true);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_YES", true);
			setItemNavigable("BUTTON_CONTROL_BLOCK.APTADDR_YES", true);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_NO", true);
			setItemNavigable("BUTTON_CONTROL_BLOCK.APTADDR_NO", true);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN", true);
			setItemNavigable("BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN", true);
		}

	
	/* Original PL/SQL code for Prog Unit HOUSEHOLD_ITEMS_DISABLE
	
	PROCEDURE HOUSEHOLD_ITEMS_DISABLE IS
BEGIN
  SET_ITEM_PROPERTY('APTADDR.APTADDR_SLCT_IND',ENABLED,PROPERTY_FALSE);  
  SET_ITEM_PROPERTY('APTADDR.APTADDR_NAME_LF30',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_ID',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_XREF_CODE',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_AGE',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_STREET_LINE1',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_CITY',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_STAT_CODE',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_ZIP',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.TADDR_NATN_DESC',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.TADDR_CNTY_DESC',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_PHONE',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_FROM_DATE',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('APTADDR.APTADDR_TO_DATE',ENABLED,PROPERTY_FALSE);
  
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_YES',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_NO',ENABLED,PROPERTY_FALSE);
  SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN',ENABLED,PROPERTY_FALSE);
END;
	*/
	//ID:5208
	/* <p>
/* </p>
		*/
		public void householdItemsDisable()
		{
			setItemEnabled("APTADDR.APTADDR_SLCT_IND", false);
			setItemEnabled("APTADDR.APTADDR_NAME_LF30", false);
			setItemEnabled("APTADDR.APTADDR_ID", false);
			setItemEnabled("APTADDR.APTADDR_XREF_CODE", false);
			setItemEnabled("APTADDR.APTADDR_AGE", false);
			setItemEnabled("APTADDR.APTADDR_STREET_LINE1", false);
			setItemEnabled("APTADDR.APTADDR_CITY", false);
			setItemEnabled("APTADDR.APTADDR_STAT_CODE", false);
			setItemEnabled("APTADDR.APTADDR_ZIP", false);
			setItemEnabled("APTADDR.TADDR_NATN_DESC", false);
			setItemEnabled("APTADDR.TADDR_CNTY_DESC", false);
			setItemEnabled("APTADDR.APTADDR_PHONE", false);
			setItemEnabled("APTADDR.APTADDR_FROM_DATE", false);
			setItemEnabled("APTADDR.APTADDR_TO_DATE", false);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_YES", false);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_NO", false);
			setItemEnabled("BUTTON_CONTROL_BLOCK.APTADDR_GUASYST_BTN", false);
		}

	
	/* Original PL/SQL code for Prog Unit INACTIVATE_HOUSEHOLD_ADDRESSES
	
	PROCEDURE INACTIVATE_HOUSEHOLD_ADDRESSES IS
   msg_out                varchar2(200);
   err_out                varchar2(1); -- '0' -- no errors; '1' - do silent commit; > '4' Raise error
BEGIN
	 -- PLU-LWS 7.2.1 Moved logic to database package.
	 aokhhld.p_inactivate_household_addr(:SPRADDR.SPRADDR_ATYP_CODE, msg_out, err_out);
	 if err_out = '1' then 
	 	  DO_SILENT_COMMIT;
	 end if;
	 if msg_out is not null then
	 	  MESSAGE(msg_out);
	 end if;	      
   if err_out > '4' then
      RAISE FORM_TRIGGER_FAILURE;
   end if;
EXCEPTION
   WHEN OTHERS THEN
         MESSAGE(SUBSTR(SQLERRM,1,200));
         RAISE FORM_TRIGGER_FAILURE;
END;
	*/
	//ID:5209
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void inactivateHouseholdAddresses(SpraddrAdapter spraddrElement)
		{
			NString msgOut= NString.getNull();
			NString errOut= NString.getNull();
			try
			{
				//  PLU-LWS 7.2.1 Moved logic to database package.
				Ref<NString> msg_out_ref = new Ref<NString>(msgOut);
				Ref<NString> err_out_ref = new Ref<NString>(errOut);
				Aokhhld.pInactivateHouseholdAddr(spraddrElement.getSpraddrAtypCode(), msg_out_ref, err_out_ref);
				msgOut = msg_out_ref.val;
				errOut = err_out_ref.val;
				if ( errOut.equals("1") )
				{
					doSilentCommit();
				}
				if ( !msgOut.isNull() )
				{
					errorMessage(msgOut);
				}
				if ( errOut.greater("4") )
				{
					throw new ApplicationException();
				}
			}
			catch(Exception  e)
			{
				errorMessage(substring(errorMessage(), toInt(1), toInt(200)));
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT TRAIL: 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
AUDIT TRAIL END
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:5210
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. Defect #47043                                          CLF  12/01/00
   Problem: When going to another form with pending changes on APAIDEN and then
      trying to make changes on new form, see error 
      'FRM-40404: A calling form has unapplied changes.  Save not allowed.'
   Fix: Should not allow you to leave APAIDEN with pending changes without 
      confirmation message.
   Technical: Added code
      IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
         MESSAGE('*ERROR* Must COMMIT changes for this function.');
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
      to form level triggers MNU_CALL_APAEMAL, CALL_APACONS, CALL_AOAORGN,
      MNU_CALL_APANAME, MNU_CALL_APAEHIS, MNU_CALL_FORMS, MNU_CALL_APAPERS,
      CALL_SPATELE, CALL_SPAPERS, CALL_SOAAPPT, CALL_APAIDEN, MNU_CALL_SPOUSE.
      
AUDIT TRAIL: 5.3
1. SSN/SIN Enhancement.                                KM 01/08/02
   Added an Option 'Alternate ID Search' to search for Alternate ID (GUIALTI form) from the KEY_BLOCK.ID.
   It is added to the Navigation Frame and in the menu bar under the 'Options' via a new entry on the GUAOPTM form.
   The 'Search_alt_ID' trigger was added to ID Block level triggers.
2. Defect #72824.                                      CE 01/15/02
   Problem: When a new record is not confidential on the Student side, it displays as 
      confidential in Alumni.
   Cause:  On SPBPERS, the confidentiality values are stored as 'Y' and 'N'. The Alumni form
      checks for a 'NOT NULL' value to indicate confidentiality.
   Fix:    In Program_unit 'SEL_ID_INFO_CUSTOM', modified 'check_confid' to test for 
      SPBPERS_CONFID_IND = 'Y', instead of 'SPBPERS_CONFID_IND IS NOT NULL'. 
AUDIT TRAIL: 5.4
1. Programs with Table Owners RPE.                     CE 07/08/02      
   In Procedure SEL_ID_INFO_CUSTOM, removed table owner (SATURN) from SOBSEQN. 
2. Defect #73595 and 72055.                            CE 07/12/02
	 PROBLEM: You should not be allowed to change/update the Address Type code on 
	          a saved record. 
	 FIX: The address type should have an 'update allowed' property turned off.
	 TECHNICAL: Set the update allowed property of SPRADDR_ATYP_CODE to "No".
3. Defect #72707.                                      CE 07/12/02
   Problem: When there are two or more entries in GTVZIPC with the
      same Zip Code, entering the Zip Code does not automatically
      bring in City and State.
   Technical Fix: Modified the KEY-LISTVAL trigger for item 
      SPRADDR.SPRADDR_ZIP in the SPRADDR block to use the new 
      function G$_CITY_STATE_NATN3 instead of G$_CITY_STATE_NATN.
      The ADDR_DEFAULT_NXTFLD trigger still uses function
      G$_CITY_STATE_NATN to populate the zip, city, state, county,
      and nation.  Also added a CHECK_MULTIPLE_ZIPS procedure to
      check for Cities which have the same ZIP/Postal codes.  This
      new procedure is called from KEY-NEXT-ITEM and KEY-PREV-ITEM
      triggers of item SPRADDR_ZIP from the SPRADDR block.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
   null;  
END;
	*/
	//ID:5211
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_MULTIPLE_ZIPS
	
	-- Added the following procedure to check for Multiple cities which 
-- have the same zip code and displays a message.
PROCEDURE CHECK_MULTIPLE_ZIPS IS
  CNT  NUMBER(5);
  CURSOR PTI_CURSOR IS
         SELECT COUNT(*)
         FROM   GTVZIPC
         WHERE  GTVZIPC_CODE = :SPRADDR.SPRADDR_ZIP ;
BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO CNT ;
      CLOSE PTI_CURSOR ;
      IF cnt > 1 THEN 
         MESSAGE( G$_NLS.Get('APAIDEN-0070', 'FORM','*WARNING* Multiple Cities exist for this ZIP/Postal code; press LIST from the ZIP field to select one.') );
      ELSE
        NULL;
      END IF;
END ;

	*/
	//ID:5212
	/* <p>
		*  Added the following procedure to check for Multiple cities which 
		*  have the same zip code and displays a message.
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void checkMultipleZips(SpraddrAdapter spraddrElement)
		{
			int rowCount = 0;
			NNumber cnt= NNumber.getNull();
			String sqlptiCursor = "SELECT COUNT(*) " +
	" FROM GTVZIPC " +
	" WHERE GTVZIPC_CODE = :SPRADDR_SPRADDR_ZIP ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("SPRADDR_SPRADDR_ZIP", spraddrElement.getSpraddrZip());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					cnt = ptiCursorResults.getNumber(0);
				}
				ptiCursor.close();
				if ( cnt.greater(1) )
				{
					warningMessage(GNls.Fget(toStr("APAIDEN-0070"), toStr("FORM"), toStr("*WARNING* Multiple Cities exist for this ZIP/Postal code; press LIST from the ZIP field to select one.")));
				}
				else {
				}
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1. Defect #80495                                   Scott Geiser 09/13/2002
   Problem:  Inconsistency in button to nav. to APATELE... On APAIDEN, the 
             button to navigate to the telephone form is called "Detail". 
             On APASBIO, the button to perform the same function is the 
             flashlight and entitled "Search". The button on APAIDEN should 
             be the same one as APASBIO.
   Solution: Changed the button next to the telephone to flashlit and 
             changed the class to the flashlight class.
2. Generate ID from function modification.         Scott Geiser 01/29/2003
   Problem:  Changing the default first character for generated ID's form '@' to 'A'
             prevents manually created ID's from beginning with the same character
             as the charcter used for generated IDs.
   Solution: a. Commented out code in the SEL_ID_INFO_CUSTOM program unit to elimnate
                the check for the ID beginnning with the same character as generated IDs
             b. Replaced code in the PRE-INSERT trigger of the SPRIDEN_CURRENT block
                to select generated IDs using the new function F_GENERATE_SOBSEGN.
AUDIT TRAIL END
</multilinecomment>
BEGIN
   null;  
END;
	*/
	//ID:5213
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5214
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment> 
AUDIT TRAIL: 7.0
1. Scott Geiser  02/20/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface 
   Technical Methodology for more details. 
2. Moved logic from SPRADDR block level triggers to referrenced SPRADDR block level triggers
   a. PRE-UPDATE, added the following logic
      EXECUTE_TRIGGER( 'CHECK_PHONES' ) ;
      G$_CHECK_FAILURE ; 
   b. KEY-NXTKEY,  added the following logic
       IF :GLOBAL.ALUM_CALLED_FORM = 'Y' THEN
          if :system.block_status = 'QUERY' then
             :GLOBAL.ADDRESS_TYPE := :SPRADDR_ATYP_CODE ;
             G$_DETERMINE_ERASE_GLOBAL;
             G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
          end if ;
       END IF ;
3. Created form level trigger SHOW_PHONES to allow navigation to the sprtele block from the Option Menu.
4. Removed WHEN-WINDOW-CLOSED trigger.  Since all windows have been moved to tbas, the trigger is no 
   longer necessary.      
5. Defect 70-0143, LN 23-Jun-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for id and spouse id.  
   Technical Fix:
     - Modified trigger GET_FULLNAME to call g$_build_full_name.
     - Modified program unit SEL_ID_INFO_CUSTOM to call g$_valid_all_id, 
       g$_sel_spriden_id_name and g$_build_full_name.
6. Scott Geiser  07/20/2004
   Remove EMAIL button and trigger that calls the now obsolete APAEMAL form.
7. Lr    08/10/2004
   Added the following reference triggers and program units:
   CHECK_TO_SAVE
   KEY_NXTBLOCK_TRG
   KEY_PREVBLOCK_TRG
   F_IS_ID_CHANGE
   F_IS_PHONE_CHANGE
   Added triggers GLOBAL_ID_ERASE,MNU_OPT_BLK_CURRENT,MNU_CALL_APAEMAL
   Changed triggers WHEN-TAB-PAGE-CHANGED,SAVE_KEYS,EXIT_KEY_TRG,MNU_CALL_APAEMAL,
   MNU_OPT_BLK_PREVIOUS,MNU_CALL_APAPERS
   Rename and change trigger SHOW_PHONES to MNU_OPT_SHOW_PHONES

8. Defect 70-0044 and 70-0140, LN 08-Oct-2004
   Problem:
     1. Form should open GOAMTCH as other IDEN forms do for users that are not excluded  
        from the common matching when an ID is not found.  If the user is excluded from 
        common matching, that user should be able to create records from either GOAMTCH 
        or APAIDEN.
     2. When spriden pii is on and the user is excluded from common matching, form 
        should not allow to create a duplicate ID of an ID that is not viewable by the
        user. 
   Functional Impact:
     1. Form will open GOAMTCH as other IDEN forms for the given scenario.
     2. When spriden pii is on and the user is excluded from common matching, form 
        will not allow to create a duplicate ID of an ID that is not viewable by the
        user.
   Technical Fix:
     - Removed program unit SEL_ID_INFO_CUSTOM.
     - Modified trigger key_block.id.when-validate-item to call a$_sel_id_info.

9. Defect 70-0139   Scott Geiser 11-04-2004
   Problem: When I first entered the form, I am able to click on the details button
            next to the spouse field. When I click on it, I get a message - Attempted 
            to go to a non-enabled item KEY_BLOCK:SPS_INDO.This happened when there 
            was no global value for the ID.
   Solution: Changed the form level VALIDATE_ID trigger to call A$_SEL_ID_INFO when ID is null;
   
10. Defect 70-0114  Scott Geiser 11-10-2004
    Problem: UI: Block: KEY_BLOCK Item: DONR_CAT_LBT Tooltip is missing
    Solution: Added Tooltip - Assigned Donor Categories' 
    
11. Defect 70-0153  Scott Geiser 11-10-2004
    Problems:
    1.  Select an ID, navigate to email tab, perform rollback.  Note:  the generate ID icon is 
        not active and should be.  Should be active anytime cursor is in keyblock
    2.  The display space on ID when selecting GENERATED isn't wide enough to display the whole word.  
        Increase to display full text.
    3.  Add Common Matching Message for non-generated ID - 
         Test Case: Enter an ID that doesn't exist in Banner, GOAMTCH is called. Exit GOAMTCH. See error 
         message.  ERROR Invalid D entered.  The message that displays should be the same as what appears 
         when you enter a Generated ID and return from GOAMTCH.
         Message should be  *ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and 
         user  <user name> is set up to run Common Matching.
    4.  Performing a Rollback wipes out ID in the keyblock  
         Test case: Enter a new ID for Banner, go to the next block, enter name info (DON'T SAVE) and rollback.
         The ID details are gone but should not be.  This is also an issue when the user is navigated to 
         GOAMTCH and then chooses to exit without creating the record.  The ID detail should remain in the 
         keyblock.
    5.  Select a pre-existing Banner ID, Nav to the name detail and tab through the fields.  Then, rollback 
        and return to the first block.  Tab through the fields again and you see that you can no longer tab 
        into full legal name.
    Solutions:
    1.  Changed Execution Hierarchy from Override to Before on the ENABLE_KEYS and DISABLE_KEYS 
        triggers in the GOREMAL block in GOQCLIB.
    2.  Made ID and SPS_IDNO items 5 pixels wider to handle the full word.
    3. Changed VALIDATE_ID trigger on KEY_BLOCK to return the same message as GENERATED ID's.
    4. Changed the SAVE_KEYS trigger to stop clearing the GLOBAL.KEY_IDNO if the ID does not exist.
    5. A. Reinherit the Trigger Text of the WHEN-NEW-BLOCK-INSTANCE trigger on the SPRIDEN_CURRENT block.
       B. Added 'SPRIDEN_CURRENT.' to the field references in the ENABLE_PERS_ITEMS trigger.
       C. Added the following code the ENABLE_PER_ITEMS trigger

            IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',ENABLED) = 'FALSE' THEN
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',ENABLED,PROPERTY_ON);
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',UPDATEABLE,PROPERTY_ON);
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_PREF_FNAME',NAVIGABLE,PROPERTY_ON);
           END IF;
           IF GET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',ENABLED) = 'FALSE' THEN
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',ENABLED,PROPERTY_ON);
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',UPDATEABLE,PROPERTY_ON);
              SET_ITEM_PROPERTY('SPRIDEN_CURRENT.PERS_LEGAL_NAME',NAVIGABLE,PROPERTY_ON);
           END IF;
       D. Made two small changes to the form level WHEN_NEW_BLOCK_INSTANCE trigger.
12. Defect 70-0166                                           Scott Geiser 11/19/2004
    Problem: On Biographical tab in APAIDEN, changed marital status to Divorced (D) and saved.  
             When we hit CTRL-PGDN to navigate back to the current identification tab, the marital 
             status remained as Widowed (W).  This does not happen in reverse--if you change it on the 
             current ID tab, and save it, the change IS reflected on the biographical tab. 
    Solution: Changed the KEY_NXT_BLOCK_TRG as follows....
      Before:
        IF :SYSTEM.CURRENT_BLOCK = 'SPBPERS' THEN
	          GO_BLOCK('SPRIDEN_CURRENT');
      After:
        IF :SYSTEM.CURRENT_BLOCK = 'SPBPERS' THEN
	          GO_BLOCK('SPRIDEN_CURRENT');
            :SYSTEM.MESSAGE_LEVEL := '5';
            EXECUTE_QUERY;
            :SYSTEM.MESSAGE_LEVEL := '0';       
13. Defect 70-0183                                           Scott Geiser 11/29/2004
    Problem: Form does not auto populate the inactive indicator for any address where 
             the to date is equal to or prior to the current system date.
    Solution: Added a WHEN-VALIDATE-ITEM trigger to the :SPRADDR.SPRADDR_TO_DATE item.
14. Defect 70-0189                                           Scott Geiser 12/02/2004
    Problem:
       SOURCE: Property Class: G$_APPL_FORM_CLASS Trigger: PRE_FORM_TRG Broken Inheritance. 
    Solution:
       Trigger text re-inherited at the G$_APPL_FORM_CLASS level but kept the overridden text
       for the PRE_FORM_TRG trigger at the form level.  The changes are necessary to have the
       Address Indicators display on the Address tab.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5215
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit P_CLEAR_ID_FIELDS
	
	PROCEDURE P_CLEAR_ID_FIELDS IS
BEGIN
  -- Initialize ID and Spouse ID fields  	
	:FULL_NAME := NULL;
	:CONFID_IND := NULL;
	:DECEASED_IND := NULL;
	:DONR_CAT := NULL;
	:PREF_CLASS := NULL;
  SET_ITEM_PROPERTY('CONFID_IND',DISPLAYED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('DECEASED_IND',DISPLAYED,PROPERTY_OFF);
  --
  :SPS_IDNO := NULL;
  :SPS_PIDM := NULL;
  :SPS_NAME := NULL;
  :SPS_DECEASED_IND := NULL;
  :SPS_DONR_CAT := NULL;
  :SPS_PREF_CLASS := NULL;
  SET_ITEM_PROPERTY('SPS_DECEASED_IND',DISPLAYED,PROPERTY_OFF);
END;
	*/
	//ID:5216
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pClearIdFields()
		{
			//  Initialize ID and Spouse ID fields  	
			getFormModel().getKeyBlock().setFullName(toStr(null));
			getFormModel().getKeyBlock().setConfidInd(toStr(null));
			getFormModel().getKeyBlock().setDeceasedInd(toStr(null));
			getFormModel().getKeyBlock().setDonrCat(toStr(null));
			getFormModel().getKeyBlock().setPrefClass(toStr(null));
			setItemVisible("CONFID_IND", false);
			setItemVisible("DECEASED_IND", false);
			// 
			getFormModel().getKeyBlock().setSpsIdno(toStr(null));
			getFormModel().getKeyBlock().setSpsPidm(toStr(null));
			getFormModel().getKeyBlock().setSpsName(toStr(null));
			getFormModel().getKeyBlock().setSpsDeceasedInd(toStr(null));
			getFormModel().getKeyBlock().setSpsDonrCat(toStr(null));
			getFormModel().getKeyBlock().setSpsPrefClass(toStr(null));
			setItemVisible("SPS_DECEASED_IND", false);
		}

	
	/* Original PL/SQL code for Prog Unit P_SET_SPS_ID_ITEMS
	
	PROCEDURE P_SET_SPS_ID_ITEMS IS
BEGIN
  IF NAME_IN('SPS_IDNO') IS NULL THEN
  	-- Spouse ID is null, disable spouse ID field and button
    SET_ITEM_PROPERTY('SPS_IDNO', ENABLED, PROPERTY_OFF);
    SET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED,PROPERTY_OFF);
  ELSE
	  -- Spouse ID is not null, enable spouse ID field and button
    IF GET_ITEM_PROPERTY('SPS_IDNO', ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPS_IDNO', ENABLED, PROPERTY_ON);
      SET_ITEM_PROPERTY('SPS_IDNO', NAVIGABLE, PROPERTY_ON);
    END IF;
  
    IF GET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('SPS_IDNO_LBT', ENABLED, PROPERTY_ON);
    END IF;
  END IF;
END P_SET_SPS_ID_ITEMS;	  

	*/
	//ID:5217
	/* <p>
/* </p>
		*/
		public void pSetSpsIdItems()
		{
			if ( getNameIn("SPS_IDNO").isNull() )
			{
				//  Spouse ID is null, disable spouse ID field and button
				setItemEnabled("SPS_IDNO", false);
				setItemEnabled("SPS_IDNO_LBT", false);
			}
			else {
				//  Spouse ID is not null, enable spouse ID field and button
				if ( getItemEnabled("SPS_IDNO").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO", true);
					setItemNavigable("SPS_IDNO", true);
				}
				if ( getItemEnabled("SPS_IDNO_LBT").equals("FALSE") )
				{
					setItemEnabled("SPS_IDNO_LBT", true);
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1
	
	PROCEDURE AUDIT_TRAIL_7_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.1
1. Lennie Sutton, Pacific Lutheran Uniersity                01/26/2005
   Implementation of Householding Enhancement.  Refer to RPEs 2701, 26275.

   Added a Household Members tab to the APAIDEN form.
   
   This tab will only be available for selection when on the Address tab, as the address
   used is dependent on the address type and sequence that is currently being displayed on
   the address tab.
   
   Once the user clicks on the address tab, the Household Member tab will become active and
   will display the number of household members directly or indirectly connected to the current
   person.  A direct relationship is one in which there is a cross reference and reverse
   cross reference in APAXREF in which the household_ind is checked.  An indirect household member
   relationship is one in which one of the direct household members is householded to a third person
   but the third person is not householded to the first.  For example: A father may be householded to
   his son through APACHLD, and the same father may be householded to his spouse in APACONS, but
   the wife may perhaps not be householded to the son.  Viewing any one of these three persons
   in APAIDEN will pull up the same three members of the household.  You will be able to identify
   direct and indirect relationships by looking at the cross reference information on the Household
   Members tab. Direct relationships will be signified with a valid cross reference showing the 
   household members relationship with the "Current Person".  Indirect relationships will have a
   blank cross reference field.
   
   Navigation to the Household Member tab can be through a mouse-click from the Addres Tab, options menu 
   from the Address Tab, or through the CQH keystroke from nearly any of the fields on the Address tab.
   
   Checking is done behind the scenes to ensure than no more than one person may navigate to the 
   Household Member tab to update addresses/phone number of any other persons belonging to the same
   household for a particular address type at any one time.  Should this be attempted, the user's Oracle
   username and the name of the household member will display in the status bar of the Address tab 
   screen.
   
   Navigation from an inactive address is not allowed. A message will be diplayed in the status bar
   at the bottom of the Address tab window
   
   Any persons with more than one future active address, or with one active and one or more future 
   active addresses for a given address type will not be household updatable from Household tab.
   This takes manual intervention to determine which address to update or use.
   
   Although, other address parts are not displayed on the Household tab (STREET_LINE2, STREET_LINE3,
   CNTY_CODE, etc.), they are considered when trying to determine if the household member's address matches
   the current person's address.  A # sign will show up in front of either the Address and/or Telephone 
   number to indicate to the user that something is different with that line from the person being displayed
   in the Current Person box in the upper portion of the Household Member Tab.
   
   Use CQH to navigate to GUASYST for any of the household members.  User can use the GUASYST button or the 
   options menu to navigate to GUASYST for the "Current Person".
   
   Checking the update indicators in front of the records to be updated followed by a "Commit" action (F10 or
   Save button) will process the household members that have a different address and/or phone number.  Navigating
   to other parts of the form via Next Block or clicking on another available tab or Rollback will NOT process
   the household changes even if they are checked.
   
   When updating addresses, the process will inactivate the current address that is different and insert a new
   address based on the "Current Person" information.  If only the primary phone number is different and not the address,
   the current address of the household member is retained, the existing primary phone number (if any) is inactivated,
   and the "Current Person"'s primary phone number is added as the new primary phone for household member.  Note:
   if the household member had several active phone numbers connected with their previous address besides their 
   primary phone number, these phone numbers are retained and brought forward to the new address as active, non-primary phone
   numbers.
   
   An "Inactivate Household Addresses" button has been included in those cases where the Current Person and
   the selected household members have no known good address and you want to inactivate them.
   
The following program units were added to support this RPE:
 CURRENT_ADDRESS_INACTIVE       - Function returns boolean value indicating whether the 
                                  current address is active or not.  (Household tab is only
                                  available to active addresses.                                  
 DO_SILENT_COMMIT               - We do not want some commits to temporary tables to be displayed
                                  to user.  Turns off record save notification before committing.
                                  Applies only to Householding Enhancement.
 INACTIVATE_HOUSEHOLD_ADDRESSES - Procedure inactivates all selected household addresses
                                  and current preson address.  Used when no good address is known
                                  for household.
 POPULATE_HOUSEHOLD_TEMP_RECS   - Procedure populates the temporary table APTADDR for household
                                  address processing.  Used when navigating to the Household tab.
 PROCESS_HOUSEHOLD_ADDR_RECS    - Procedure updates the selected household members' addresses
                                  and phone numbers to match the Current Person's address and
                                  phone.
 REMOVE_HOUSEHOLD_TEMP_RECS     - Procedure is called from all Household tab exit points to make
                                  sure temporary table records for the current session get removed.
 SELECT_APRXREF_HOUSEHOLD       - Function counts the number of household members a person has.
                                  NOTE: Returns -1 if the current person is deceased.
 SELECT_APTADDR_IN_USE          - Checks the temporary table APTADDR to see if anyone else is working
                                  with a member of the same household for the selected address type.
 SAVE_TO_APTTELE                - Procedure uses the global temporary table apttele to store telephone
                                  numbers of a person before the addresses inactivated (API inactivates
                                  phone numbers belonging to addresses) so that we can bring them forward 
                                  to the new address as applicable.
 SELECT_ACTIVE_ADDRESSES        - Function retuns the number of active addresses a pidm has for a particular
                                  address type.  For householding, we do not want the user to be able to
                                  update a person who has more than one active address using the automated
                                  process.
 SELECT_APTADDR_2               - Returns the number of records the current session ID has in APTADDR.  (If there
                                  are some, then we will delete them.)  
 SELECT_APTADDR_3               - Returns the number of records that do not belong to the current session ID in 
                                  APTADDR that are more than 1 week old (7 days).  (If there are some, then
                                  we will delete these, too.)  We want to keep this table clean.
 SELECT_AUBINST_1               - Returns from AUBINST whether or not we want to automatically flag records
                                  to be updated that have different addresses and/or phones.
 SELECT_AUBINST_2               - Returns default address source to use for householded records.  If NULL,
                                  then use the Address Source from the source address.

 The new block APTADDR_HEADER was created.  Was not necessary, but it looks cleaner to put all of the non-database
 fields displayed as "Current Person" in the Householding tab together under one block instead of mixing them
 with the FORM_HEADER block.  Block as related triggers that were created to aid in navigation.
 
 The new block (and supporting table) APTADDR was added.  This is a temporary table, but
 not a "global temporary table" as we need to be able to see all records in it to see
 if someone is working with a member of the same household we are working with.
 
 The new global temporary table APTTELE was created.  This is a session specific table and is used to save phone
 numbers for a given person.  We bring a person's active, non-main-telephone type telephone records forward if
 we create a new address/phone number using the household process.
 
 Four buttons were created all prefixed by "APTADDR" and located in the BUTTON_CONTROL_BLOCK.  2 buttons are used
 for the yes and no buttons on the inactivate addresses dialog box (canvas: APTADDR_2_CANVAS).  The other two buttons
 are the GUASYST button on the Household tab and the inactivate address icon/button on the Household tab.  Buttons
 have triggers to aid in navigation.

       APTADDR_GUASYST_BTN    - Calls GUASYST for key block person
       APTADDR_INACTIVATE_BTN - to inactivate selected household records and header record
       APTADDR_YES            - to confirm above operation
       APTADDR_NO             - to cancel above operation
 
 New form level triggers:
   DISABLE_NON_HOUSEHOLD_TABS - Disables non-household tabs
   ENABLE_NON_HOUSEHOLD_TABS  - Re-enable non-household tabs
   MNU_OPT_SHOW_HOUSEHOLD     - Show household tab
   DISABLE_HOUSEHOLD_TAB      - Disable household tab.
   
 Modfied form level triggers to support Householding Enhancement:
    MNU_OPT_BLK_CURRENT   - checks to see if we are coming from the Household Tab or not.
    DISABLE_TAB_PAGES     - Added reference to DISABLE_HOUSEHOLD_TAB
    WHEN-TAB-PAGE-CHANGED - Added Household tab option and reset household_tab option.
    KEY-EXIT              - Make sure that temporary records are cleared out.
    

 Modified/or new SPRADDR block level triggers:
    WHEN-NEW-RECORD-INSTANCE - Added procedure call to CHECK_HOUSEHOLD_INFO (decided whether the tab is available or not).
    CHECK_HOUSEHOLD_INFO     - Updates the household member count on Household tab.  Called from WHEN-NEW-RECORD-INSTANCE.
    KEY-CQUERY               - Block level trigger to SHOW_HOUSEHOLD (navigate to Household tab if available).
    SHOW_HOUSEHOLD           - Calls the main trigger MNU_OPT_SHOW_HOUSEHOLD to navigate to Household tab.
    KEY_NXTBLOCK_TRG         - Same as the inherited version at the form level, but I added the call to RESET_HOUSEHOLD_TAB
                               in the uninherited block level version of this trigger.
    KEY_PRVBLOCK_TRG         - Same as the inherited version at the form level, but I added the call to RESET_HOUSEHOLD_TAB
                               in the uninherited block level version of this trigger.
 
 

    Fields in new APTADDR_HEADER block:
       ADDR_NAME_LF_30
       ADDR_ID
       ADDR_ATYP_CODE
       ADDR_ATYP_DESC
       ADDR_ADDR_SEQNO
       ADDR_STREET_LINE1
       ADDR_STREET_LINE2
       ADDR_STREET_LINE3
       ADDR_CITY
       ADDR_STAT_CODE
       ADDR_ZIP
       ADDR_FROM_DATE
       ADDR_TO_DATE
       ADDR_TELE_CODE
       ADDR_PHONE
       ADDR_CNTY_CODE
       ADDR_NATN_CODE
       ADDR_IN_USE_PIDM
       ADDR_IN_USE_USER
       ADDR_IN_USE_NAME_LF30
       ADDR_DATA_BAR_1
       HOUSEHOLD_COUNT (stores count of household members for person - not atyp_code specific)
       
2. Lennie Sutton, Pacific Lutheran University       02/04/2005
   Added support for using the Default Householding Address Source from AUBINST_DEF_ASRC_CODE field.  If no value is
   available there, then use the Address Source from the source address.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5218
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail71()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_AUBINST_1
	
	FUNCTION SELECT_AUBINST_1 RETURN VARCHAR2 IS
  CURSOR PTI_CURSOR IS
     SELECT DECODE(AUBINST_DEF_HOUSEHOLD_IND,'Y','Y','N')
       FROM AUBINST
      WHERE ROWNUM = 1 ;
  RET_VALUE AUBINST.AUBINST_DEF_HOUSEHOLD_IND%TYPE ;
BEGIN
  OPEN PTI_CURSOR ;
  FETCH PTI_CURSOR INTO RET_VALUE ;
  CLOSE PTI_CURSOR ;
  RETURN (RET_VALUE) ;
END;
	*/
	//ID:5219
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString selectAubinst1()
		{
			int rowCount = 0;
			String sqlptiCursor = "SELECT DECODE(AUBINST_DEF_HOUSEHOLD_IND, 'Y', 'Y', 'N') " +
	" FROM AUBINST " +
	" WHERE ROWNUM = 1 ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			NString retValue= NString.getNull();
			try {
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					retValue = ptiCursorResults.getStr(0);
				}
				ptiCursor.close();
				return ((retValue));
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment> 
AUDIT TRAIL: 7.2
1. Scott Geiser  06/14/2005
   Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package. 
   This is to remove all direct calls to these packages as this is a recommendation 
   from Oracle and causes problems in some environments (Defect: 102207).
    A. Removed calls from SET_CHECK_BOXES trigger on the SPRADDR block.

2. Defect #102036                                    Scott Geiser 08/25/2005
   Problem:  Selecting AOACOMP and AOAIDEN options on APAIDEN do not bring up the 
             respective forms.
             Steps to replicate : 
              --------------------
              -Access APAIDEN
              -Enter an ID in the keyblock
              -Page down into the current identification block 
              -Click on the last name or first name  search (down arrow) 
              -Pop up box shows up with the message, "*Warning* Similar name(s) exist. 
                                                         Would you like to view them? 

             There are three options to choose from, SOAIDEN, AOAIDEN and CANCEL
             Clicking on SOAIDEN brings up the SOAIDEN form.
             However clicking on AOAIDEN doesn't bring up the form. Only message received 
             at the bottom left f the screen is , 'Current first name overtype to modify'
   Solution: Added the following code the REQUEST_NAME_SEARCH trigger to process 
             the second button in the associated alert box.
               IF ALERT_BUT = ALERT_BUTTON2 THEN
                  :GLOBAL.FIRST_NAME := :SPRIDEN_CURRENT.PERS_FIRST_NAME;  
                  :GLOBAL.FORM_WAS_CALLED := 'Y';
                  :GLOBAL.CALLING_FORM := 'NAME_SEARCH';

                  IF :which_name_search = 'ORG' THEN
                     :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME;
                     ALERT_FORM := 'AOACOMP';
                  ELSE
                     :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.PERS_LAST_NAME;
                     ALERT_FORM := 'AOAIDEN';
                  END IF;

                  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
                  G$_CHECK_FAILURE;
                  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,alert_form,'');

                  :GLOBAL.FORM_WAS_CALLED := '';
                  :GLOBAL.CALLING_FORM := '';
                  :GLOBAL.FIRST_NAME := '';
                  :GLOBAL.LAST_NAME := '';
              END IF;
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5220
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
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
	//ID:5221
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> 
AUDIT TRAIL: 7.3
1. Scott Geiser  01/19/2006
   Reinherit the Biography Tab and all associated objects to include the New Race and Ethnicity.

2. Defect 1-8N2RQ                                                Scott Geiser 01/19/2006
   Problem: Poor performance with AGAGIFT due to SYNCHRONIZE statement in form code.
            Forms AGAPLDG and AGAPSOL also affected.
   Solution:
     a. Removed SYNCHRONIZE Statements.

3. Heidi Dombroski 01/25/2006
   Employment Address Enhancement

   a. Add new Employment Details checkbox to bottom of Address tab.
   
   b. Add new icon for update to the Employment Details checkbox, that will open
      APAEHIS in update mode.     
      
4. Defect 1-8N2RQ                                                Scott Geiser 02/28/2006
   Problem: Consider changing the APAIDEN form to truncate the time stamp on the from field, 
            in the part of the logic that is displaying your address indicators. Since we 
            fixed GOAMTCH, it won't be as noticeable, but it could still be an issue with 
            addresses created from other objects in Banner.
   Solution: Changed the following code in the CHECK_PREF_ADDR trigger
      Before: 
           AND  TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE, SYSDATE) 
                                   AND NVL(:SPRADDR_TO_DATE, SYSDATE) 
      After:
           AND  TRUNC(SYSDATE) BETWEEN TRUNC(NVL(:SPRADDR_FROM_DATE, SYSDATE)) 
                                   AND TRUNC(NVL(:SPRADDR_TO_DATE, SYSDATE)) 
      
5. Defect CMS-DFCT104233                                       Scott Geiser 02/28/2006
   Problem: Get the following error message:
            *ERROR* Preferred/Combined/Geor Address from Constituent Form, cannot delete.

            on the APAIDEN form when trying to delete an inactive address who has a 
            current active address of the same address type, and whose Preferred Address 
            type, Preferred Region Address type, and Combined Mailing Address type are 
            all the same as the address that is being deleted.
   Solution: Changed the following code in the CHECK_PREF_ADDR trigger
      Before: 
           AND  TRUNC(SYSDATE) BETWEEN TRUNC(NVL(:SPRADDR_FROM_DATE, SYSDATE)) 
                                   AND TRUNC(NVL(:SPRADDR_TO_DATE, SYSDATE));
      After:  
           AND  TRUNC(SYSDATE) BETWEEN TRUNC(NVL(:SPRADDR_FROM_DATE, SYSDATE)) 
                                   AND TRUNC(NVL(:SPRADDR_TO_DATE, SYSDATE)) 
           AND  :ATYP_COUNT = 1;
      
6. Defect 1-9T7OF                                        Scott Geiser 03/01/2006
   Problem:  When householding address/phone information, non-primary phone numbers 
             matching the primary phone number will be created on all household 
             members whose phone numbers already match. 
             
             This is the case when only the address is being changed.  As a result, 
             through several address changes, a household member could end up with 
             one non-primary phone number that matches the primary phone number.

             This will occur  for every address update made to household members 
             through the Household tab on APAIDEN.  

             Address and Primary phone are just fine. This affects only non-primary 
             phone numbers being carried over
   Solution: 
      1. Moved some of the form logic in program units, where possible, to the database package AOKHHLD.
   
         Deleted program units (moved to AOKHHLD):
         APTADDR_FULL_NAME
         SAVE_TO_APTTELE
         SELECT_ACTIVE_ADDRESSES
         SELECT_APRXREF_HOUSEHOLD
         SELECT_APTADDR_2
         SELECT_APTADDR_3
         SELECT_AUBINST_2
   
         Updated program units; Moved logic to package AOKHHLD:
         INACTIVATE_HOUSEHOLD_ADDRESSES
         PROCESS_HOUSEHOLD_ADDR_RECS
         REMOVE_HOUSEHOLD_TEMP_RECS
         SELECT_APTADDR_IN_USE
      
7. Defect 1-CZXZE                                        Scott Geiser 03/02/2006
   Problem:  When updating Household Member addresses on APAIDEN  the From and/or 
             To dates are getting incorrectly populated with the current system date 
             and not the actual From/To dates used on the primary member's address.  
   Solution: Changed the POPULATE_HOUSEHOLD_TEMP_RECS program unit to replace the 
             APTADDR_FROM_DATE and APTADDR_TO_DATE with the APTADDR_HEADER values if null;

8. Defect 1-FT1FL                                        Scott Geiser 04/07/2006
   Problem:  Issue with scrolling down thru addresses - lets you continue scrolling past 
             the first blank record and should not             
   Solution: Added the following code to the WHEN-NEW-RECORD-INSTANCE trigger of the 
             SPRADDR block:
             
             IF :SPRADDR.ROWID is NULL THEN
	              RETURN;
             END IF;
             
9. Defect 1-GTUC8                                        Heidi Dombroski 04/25/2006
   Problem:  Employment Details icon missing auto hint pop-up text.
   Solution: Added auto hint pop-up text "Employment Details" to the Employment Details icon
             (aprehis_update_btn).               
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5222
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_4_0_1
	
	PROCEDURE AUDIT_TRAIL_7_4_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 7.4.0.1
1. Defect 1-GWFUY                                                Heidi Dombroski 05/09/2007
   Problem: Mouse click no longer works after address update in certain scenarios. You are unable to
            navigate by clicking the mouse into an updatable field after making a change to the 
            address, use F10 to save, do a Shift F7 to rollback to keyblock, enter in the ID of 
            another constituent who is single and then try to do a next block by clicking the mouse
            into an updatable field.....it does not work. You can do a next block by selecting from
            the menu bar, the toolbar, or by hitting CTRL + Page Down keys.
   Solution: Modified form level clrfrm_trigger to execute the clear_form command prior to the call
             to set_canvas_property for the G$_iden_tab_canvas. This will allow users to save and 
             navigate using either the function keys or the mouse.
2. Heidi Dombroski         05/14/2007  
    Modified SPRADDR block level trigger SET_CHECK_BOXES to correctly compare the spraddr_from_date 
    and spraddr_to_date to the sysdate when setting the checkboxes on the address tab of APAIDEN.                  
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5223
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail7401()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS 
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Defect 1-2AUDG2                                              Heidi Dombroski 06/15/2007
   Migrating 7.4.0.1 Defect# 1-GWFUY to 8.0
2. I18N Project                                                 Scott Geiser 08/24/2007
   a. Household Members tab - Adjustments made to the display of data to allow display of 
      as much detail as possible.  Scrolling through data made possible with tabbing 
      functionality for query only where details display.  
3. Defect #1-2S10QI                                             Scott Geiser 09/14/2007
   Problem:  On Apaiden, occasionally the name displaying in the key block does not match 
             the name that is entered in the first block.  Sometimes it has the persons full 
             name - First, Middle and Last but the name in the key block will only have First, 
             Middle Initial and Last.  Then if you enter the marital status it changes in the
             key block and reverts back to the full name.  Other times the same name displays 
             correctly. 
             Example:  Mrs Mary Susan Evans  may become Mrs Mary S. Evans after adding or 
                       changing a marital status.  Going to the address tab and changing 
                       the address or doing a rollback and re-query resets the displayed the 
                       full name.    Display-only error.
   Solution:
      1. Changed Execution Hierarchy of SPRIDEN_CURRENT block GET_FULLNAME trigger to 'Before'.
      2. Changed Execution Hierarchy of form level GET_FULLNAME trigger to 'After'.
      3. Changed form level GET_FULLNAME trigger to send :SPRIDEN_CURRENT.PERS_PREFIX and
         :SPRIDEN_CURRENT.PERS_SUFFIX to g$_build_full_name instead of :SPBPERS_NAME_PREFIX and
         :SPBPERS_NAME_SUFFIX.
4. TGKinderman 10/31/2007
   Modify KEY_BLOCK.ID validation trigger (actual in form-level VALIDATE_ID) in support of SSN ID Look-up.
5. TGKinderman 10/31/2007
   Modify in support of General7.5 TabSecurity. (1-2LHZ0B)
6. TGKinderman 11/05/2007
   Modify for TabSecurity to include modifications for:
   a) WHEN-NEW-FORM-INSTANCE- go_block and exec query needs to be conditional per the Tab being availalbe to the user
   b) Fields on APTADDR block were made enabled and navigable per I18N enhancement.  These were changed to be statically
      disabled.  pl/sql Units HOUSEHOLD_ITEMS_ENABLE and HOUSEHOLD_ITEMS_DISABLE were adjust to include these fields. 
7. TGKinderman 11/06/2007
   Add Tab/block to the form for Additional Identification
   a. Reference Object Group G$_ADDITIONAL_ID_OBJ from GOQCLIB into form.  Drag to sequence GORADID block
      appropriately in form
   b. Reference Tab ADDITIONAL_ID_TAB from GOQCLIB into form.
   c. Add logic to form-level triggers WHEN-TAB-PAGE-CHANGED, DISABLE_TAB_PAGES and ENABLE_TAB_PAGES for tab
      ADDITIONAL_ID_TAB
   d. Add form-level trigger MNU_OPT_ADDITIONAL_ID for use with GUROPTM row (Options).  Used to navigate to the
      block GORADID in the Tab ADDITIONAL_ID_TAB
8. Defect #1-1KGTTU                                             Scott Geiser 12/20/2007
   Problem:  Zip code getting truncated in the 'Household Members' tab of APAIDEN.
   Solution: Removed the SUBSTR function from two lines of code that were truncating the zip code fields.
9. Defect 1-37ALRZ                                                 Scott Geiser 12/21/2007
   Migrating Defect 1-338K2W (7.5.0.2) to 8.0.
10. Defect 1-37ALQA                                                Scott Geiser 12/21/2007
   Migrating Defect 1-2WIF92 (7.5.0.2) to 8.0.
11. Defect #1-371IPP                                               Scott Geiser 12/21/2007
    Problem:  I18N changes resulted in some inherited properties being disconnected.
    Solution: Reinherited the affected items.
12. Defect 1-3CLOW4                                                Scott Geiser 02/04/2008
    Problem:  Expand the field name APTADDR_NAME_LF30 on the aptaddr table to 230
              (currently 30) to display the full name details.
    Solution: 
         1. Changed selection of names using F_FORMAT_NAME from 'LF30' to 'LFMI'.
         2. Changed APTADDR_NAME_LF30 to 230 characters and applied the G$_NAME_CLASS.
         3. Changed ADDR_NAME_LF30 to 230 characters and applied the G$_NAME_CLASS.
         4. Verified that all address fields in the APTADDR_HEADER and APTADDR blocks
            have the G$_CHAR_FIELD_CLASS assigned.
13. Defect 1-37ALEF                                                 Scott Geiser 03/07/2008
   Migrating Defect 1-J3G0H (7.5.0.3) to 8.0.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;        

	*/
	//ID:5224
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5225
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/29/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5226
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CAN_NAVIGATE_TO_BLOCK
	
	FUNCTION CAN_NAVIGATE_TO_BLOCK(p_block_name VARCHAR2) RETURN BOOLEAN IS
  lv_temp_num NUMBER(1);
BEGIN
	lv_temp_num := 0;
-- --
	CASE p_block_name
	  WHEN 'SPRIDEN_CURRENT' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('CURRENT_ID_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  WHEN 'SPBPERS' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('BIO_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  WHEN 'GORPRAC' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('BIO_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  WHEN 'SPRADDR' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('ADDRESS_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  WHEN 'SPRTELE' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('TELEPHONE_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  WHEN 'GOREMAL' THEN
	    IF G$_TAB_SECURITY.G$_AUTH_LEVEL_TAB('EMAIL_TAB') <> 'N' THEN
        lv_temp_num := 1;
	    END IF;
	  ELSE
		  NULL;
	END CASE;
-- --
-- IF there are other blocks that can be navigated to at form start-up in the WHEN-NEW-FORM-INSTANCE
-- logic then needs to be added to this CASE to make certain that a Tab (and that block) is not hidden.
--
  IF lv_temp_num = 1 THEN
    RETURN(TRUE);
  ELSE
    RETURN(FALSE);
  END IF;
END ;


	*/
	//ID:5227
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBlockName
		*/
		public NBool canNavigateToBlock(NString pBlockName)
		{
			NNumber lvTempNum= NNumber.getNull();
			lvTempNum = toNumber(0);
			//  --
			if (pBlockName.equals("SPRIDEN_CURRENT"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("CURRENT_ID_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else if (pBlockName.equals("SPBPERS"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("BIO_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else if (pBlockName.equals("GORPRAC"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("BIO_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else if (pBlockName.equals("SPRADDR"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("ADDRESS_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else if (pBlockName.equals("SPRTELE"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("TELEPHONE_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else if (pBlockName.equals("GOREMAL"))
			{
				if ( getTask().getGoqrpls().getGTabSecurity().gAuthLevelTab(toStr("EMAIL_TAB")).notEquals("N") )
				{
					lvTempNum = toNumber(1);
				}
			}
			else {
			}
			//  --
			//  IF there are other blocks that can be navigated to at form start-up in the WHEN-NEW-FORM-INSTANCE
			//  logic then needs to be added to this CASE to make certain that a Tab (and that block) is not hidden.
			// 
			if ( lvTempNum.equals(1) )
			{
				return  toBool(((NBool.True)));
			}
			else {
				return  toBool(((NBool.False)));
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_5_0_2
	
	PROCEDURE AUDIT_TRAIL_7_5_0_2 IS
<multilinecomment> 
AUDIT TRAIL: 7.5.0.2
1. Defect 1-338K2W                                                Scott Geiser 12/21/2007
   Problem:  Household Members tab on APAIDEN gets grayed out after updating an address or 
             adding a new address on someone who has existing household members.    

             Impact: Navigation to household members tab is not directly accessible after 
             doing the update.
   Solution: Changed logic in the following triggers of the spraddr block:
       1. CHECK_HOUSEHOLD_INFO
       2. POST_BLOCK   

2. Defect 1-2WIF92                                                Scott Geiser 12/21/2007
   Problem:  The FROM date is not getting updated on the householded address tab.    
   Solution: 1. Changed the following two line in the POPULATE_HOUSEHOLD_TEMP_RECS program unit to
             stop the aptaddr records being displayed from defaulting the FROM and TO dates for 
             the display:
             Before:
              nvl(SPRADDR_FROM_DATE,:aptaddr_header.addr_from_date)     ADDR_FROM_DATE,
              nvl(SPRADDR_TO_DATE,:aptaddr_header.addr_to_date)         ADDR_TO_DATE,
             After: 
              SPRADDR_FROM_DATE                                         ADDR_FROM_DATE,
              SPRADDR_TO_DATE                                           ADDR_TO_DATE,
             2. Added the following two lines to the POPULATE_HOUSEHOLD_TEMP_RECS program unit:
                 NVL(:APTADDR.APTADDR_FROM_DATE,sysdate) <> NVL(:APTADDR_HEADER.ADDR_FROM_DATE,sysdate) OR
                 NVL(:APTADDR.APTADDR_TO_DATE,sysdate) <> NVL(:APTADDR_HEADER.ADDR_TO_DATE,sysdate)
             3. Changed PROCESS_HOUSEHOLD_ADDR_RECS to use G$_DISPLAY_ERR_MSG to display error 
                messages being returned from the call to aokhhld.p_process_household_addr_recs.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5228
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail7502()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_5_0_3
	
	PROCEDURE AUDIT_TRAIL_7_5_0_3 IS
<multilinecomment> 
AUDIT TRAIL: 7.5.0.3
1. Defect 1-J3G0H                                                Scott Geiser 03/07/2008
   Problem:  Errors with the household tab when a user only has query access to APAIDEN.
   Solution: Made the following changes:
      a. Changed POPULATE_HOUSEHOLD_TEMP_RECS program unit to call aokhhld.p_aptaddr_insert
         to insert records into the aptaddr table.
      b. Changed the WHEN-NEW-ITEM-INSTANCE trigger on APTADDR_SLCT_IND item to test to see 
         if user has entered the form with query-only access.  Display appropriate error 
         message only if NOT in query-only mode.
      c. Changed the WHEN-CHECKBOX-CHANGED trigger on APTADDR_SLCT_IND item to only allow
         updates if user has not entered the form with query-only access. 
      d. Changed the WHEN-BUTTON-PRESSED trigger of the APTADDR_INACTIVATE_BTN to return an
         appropriate error message when in the form in query-only mode.
      e. Changed the KEY-COMMIT trigger of the aptaddr block to return an appropriate error 
         message if user attempts to commit changes (process actual address updates) when in 
         the form in query-only mode.
      f. Changed the DO_SILENT_COMMIT program unit to execute gb_common.p_commit when in 
         the form in query-only mode.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:5229
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail7503()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.1
1. Defect 1-407HWF                                              Scott Geiser 10/15/2008
   Problem:  It appears as though the CHEC_TO_SAVE trigger in APAIDEN needs to be re-inherited 
             from GOQCLIB.
             There are two things that will be corrected:
               1) The use of G$_NLS.Get on the literals
               2) A message will be displayed if you enter data on the Additional Identification 
                  tab and then try to leave the tab before pressing SAVE.
   Solution: Reinherited the trigger text from GOQCLIB for the CHECK_TO_SAVE trigger.

2. Defect 1-3MLXDH                                              Scott Geiser 10/24/2008
   Problem:  Please check message to verify if G$_NLS.Get can be removed or needs to be changed 
             to G$_NLS.FormatMsg following the guidelines specified in the Rekey User Manual:

             G$_NLS.FormatMsg('x','FORM',TEMP_STRING)
   Solution: Processed apaiden.fmb through the Rekey process.

3. Defect 1-3YZHFH                                              Scott Geiser 10/27/2008
   Problem:  The Household tab on APAIDEN does not always become highlighted when using the 
             Ctrl/Down key rather than the mouse to access the Address tab. 
   Solution: Modified the CHECK_HOUSEHOLD_INFO trigger on the SPRADDR block to check the 
             SYSTEM.CURRENT_BLOCK to determine if the currsor is in the SPRADDR block when 
             trying to decide whether to activate the Household tab or not.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END; 
	*/
	//ID:5230
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : APAIDEN
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Mar 22 09:44:33 2013
-- MSGSIGN : #d8d137375a57dadb
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:5231
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.2
1. Expose New Person Fields (I18N Project)            Scott Geiser 11/25/2008
   a. Added APTADDR_STREET_LINE4, APTADDR_HOUSE_NUMBER to the APTADDR block.
   b. Changed POPULATE_HOUSEHOLD_TEMP_RECS program unit process STREET_LINE4,
      HOUSE_NUMBER, and CTRY_CODE_PHONE when those fields are referenced from the 
      SPRADDR, SPRTELE, APTADDR, or APTELE tables.
   c. Added 'p_SURNAME_PREFIX  => :SPRIDEN_CURRENT.PERS_SURNAME_PREFIX)' to the 
      call to G$_BUILD_FULL_NAME call in the GET_FULLNAME trigger
2. Defect #1-1ADD0K                          Scott Geiser 03/10/2009
   Problem:  Missing g$_nls.get on use of 'Household Members'
             Missing g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members ')
             Missing g$_nls.get on use of MESSAGE( '*ERROR* Preferred/Combined/Geor Address' || ' from Constituent Form, cannot delete.' )
             Missing g$_nls.get on use of MESSAGE( -- Error msg changed 11/29/94 log # 90 of system test. FHL '*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete. ' )
             Missing g$_nls.get on use of MESSAGE( '*ERROR* Geographic region address from ' || ' Constituent Info Form (APACONS), cannot delete.' )
             Missing g$_nls.get on use of MESSAGE( '*ERROR* Preferred address from Constituent' || ' Info Form (APACONS), cannot delete.' )
             Missing g$_nls.get on use of MESSAGE( '*ERROR* Unable to delete address; no others exists for address type.' )
             Missing g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members ('|| :APTADDR_HEADER.HOUSEHOLD_COUNT ||')')
             Missing g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members')
             Missing g$_nls.get on use of G$_CHECK_VALUE (PTI_CURSOR%FOUND, '*WARNING* Preferred address is being inactivated.', FALSE)
             Missing g$_nls.get on use of SELECT DISTINCT pidm_in ADDR_PIDM, DECODE(sps_ind_in,'Y ','2','3') ADDR_HEAD_IND, SUBSTR(F_GETSPRIDENID(
             Missing g$_nls.get on use of SELECT DISTINCT pidm_in ADDR_PIDM, DECODE(sps_ind_in,'Y ','2','3') ADDR_HEAD_IND, SUBSTR(F_GETSPRIDENID(
             Missing g$_nls.get on use of APTADDR_HEADER.ADDR_PHONE := NVL(LTRIM(SPRTELE_ROW.SPRTELE_PHONE_AREA||' ')|| LTRIM(SPRTELE_ROW.SPRTELE_PHONE_NUMBER||' ')|| LTRIM(SPRTELE_ROW.SPRTELE_PHONE_EXT),
             Missing g$_nls.get on use of IF NVL(:APTADDR.APTADDR_STREET_LINE1,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') OR (:APTADDR.APTADDR_STREET_LINE1 = 'No curr ent address' AND NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') = '#') OR NVL(:APTADDR.APTA
   Solution: Added g$_nls.get on use of 'Household Members'
             Added g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members ')
             Added g$_nls.get on use of MESSAGE( '*ERROR* Preferred/Combined/Geor Address' || ' from Constituent Form, cannot delete.' )
             Added g$_nls.get on use of MESSAGE( -- Error msg changed 11/29/94 log # 90 of system test. FHL '*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete. ' )
             Added g$_nls.get on use of MESSAGE( '*ERROR* Geographic region address from ' || ' Constituent Info Form (APACONS), cannot delete.' )
             Added g$_nls.get on use of MESSAGE( '*ERROR* Preferred address from Constituent' || ' Info Form (APACONS), cannot delete.' )
             Added g$_nls.get on use of MESSAGE( '*ERROR* Unable to delete address; no others exists for address type.' )
             Added g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members ('|| :APTADDR_HEADER.HOUSEHOLD_COUNT ||')')
             Added g$_nls.get on use of SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, 'Household Members')
             Added g$_nls.get on use of G$_CHECK_VALUE (PTI_CURSOR%FOUND, '*WARNING* Preferred address is being inactivated.', FALSE)
             Added g$_nls.get on use of SELECT DISTINCT pidm_in ADDR_PIDM, DECODE(sps_ind_in,'Y ','2','3') ADDR_HEAD_IND, SUBSTR(F_GETSPRIDENID(
             Added g$_nls.get on use of SELECT DISTINCT pidm_in ADDR_PIDM, DECODE(sps_ind_in,'Y ','2','3') ADDR_HEAD_IND, SUBSTR(F_GETSPRIDENID(
             Added g$_nls.get on use of APTADDR_HEADER.ADDR_PHONE := NVL(LTRIM(SPRTELE_ROW.SPRTELE_PHONE_AREA||' ')|| LTRIM(SPRTELE_ROW.SPRTELE_PHONE_NUMBER||' ')|| LTRIM(SPRTELE_ROW.SPRTELE_PHONE_EXT),
             Added g$_nls.get on use of IF NVL(:APTADDR.APTADDR_STREET_LINE1,'#') <> NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') OR (:APTADDR.APTADDR_STREET_LINE1 = 'No curr ent address' AND NVL(:APTADDR_HEADER.ADDR_STREET_LINE1,'#') = '#') OR NVL(:APTADDR.APTA

AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END; 
	*/
	//ID:5232
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_2
	
	PROCEDURE AUDIT_TRAIL_8_3_2 IS 
<multilinecomment> 
AUDIT TRAIL: 8.3.2
1. User Alert Enhancement                        Scott Geiser 05/11/2010
   a. Add User Alert functionality.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END; 
	*/
	//ID:5233
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail832()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS 
<multilinecomment> 
AUDIT TRAIL: 8.4
1. Defect #1-BBZLJ9                        Heidi Dombroski 09/27/2010
   Problem: Option list for ID in apaiden misses g$_nls. 
            For example: Non-person Search and Organization Header.
   Solution: Updated WHEN-BUTTON-PRESSED trigger on item ID_LBT in KEY_BLOCK to use G$_NLS.   
   
2. Defect #1-8XBO6Y                        Scott Geiser 09/30/2010
   Problem:  When a name is changed in the Non-Person block of APAIDEN and Save is pressed, 
             the old name disappears from the Key Block.  If Rollback is then clicked, the 
             new name will appear.  This  does not happen on a Person name change where the 
             old name is just replaced with the new after saving. 
   Solution: Modified the form level GET_FULLNAME trigger to only format the name for 
             individuals.

3. Defect #CMS-RPE25544                        Scott Geiser 10/01/2010
   Problem:  There are key mappings for AOAIDEN, APAIDEN, SOAIDEN but none for AOACOMP. 
             When on the keyblock and you look at the hint line at the bottom of APAIDEN, 
             it reads,"ID LIST for SOAIDEN; COUNT HITS FOR SOACOMP; DUP ITEM to generate ID, DUP REC for APAIDEN"
   Solution: Replaced the Auto Hint for the KEY_BLOCK.ID item with the following:
             ID;LIST for SOAIDEN;COUNT HITS for SOACOMP;DUP ITEM to generate ID,
             DUP REC for AOAIDEN, NEXT REC for AOACOMP, PREV REC for AOAORGN, NEXT SET for APASBIO.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END; 
	*/
	//ID:5234
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_2_1
	
	PROCEDURE AUDIT_TRAIL_8_3_2_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.3.2.1
1. Defect 1-CSR3R2                        Scott Geiser 10/7/2010
   Problem:  Oracle Form failed to generate after database new conversion and will require modification.
             The following error occurs when compiling:
             
             Compiling procedure POPULATE_HOUSEHOLD_TEMP_RECS... 
             Compilation error on procedure POPULATE_HOUSEHOLD_TEMP_RECS:
             PL/SQL ERROR 394 at line 301, column 8
             wrong number of values in the INTO list of a FETCH statement
             PL/SQL ERROR 0 at line 301, column 8
             SQL Statement ignored
   Solution: Changed the select statement of PTI_CURSOR_2 to SELECT * rather than individual fields
             into the SPRTELE_ROW variable.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END; 
	*/
	//ID:5235
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8321()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_2
	
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment>
AUDIT TRAIL: 8.4.2
1. Defect #1-1R44PT                          Venkata Krishna   07/13/2011 
   Problem:  Error, "FRM-41034-Cannot set navigable attribute of non-displayed item APRCHLD.CHLD.SSN"
             received when masking SSN on APACHLD.When the visible indicator for APRCHLD.CHLD_SSN is 
             unchecked on GORDMSK, certain errors are received on APACHLD.   
             Similiar errors are also encountered on APAIDEN  when the visible indicator for SPRIDEN_CURRENT.PERS_LEGAL_NAME
             is unchecked on GORDMSK for APAIDEN. Additional issue is when SSN or PERS_LEGAL_NAME have their Visable and Conceal
             checkboxes checked, the fields are correctly masked, but you are allowed to navigate into and update these fields.
             You should not be allowed to navigate nor update masked fields. 
             Please see attachment on the Customer Support Site for additional details.
  Solution:  Added code in the ENABLE_PERS_ITEMS form level trigger, to check for visible property is true and conceal data 
             property is false then only enable all property of item PERS_LEGAL_NAME.

2. Defect #1-EGN672                          Venkata Krishna   07/27/2011 
   Problem:  Household Members tab on APAIDEN gets grayed out after updating an address or adding a new address on someone who has
             existing household members. Impact: Navigation to household members tab is not directly accessible after doing the update.
Workaround:  Leave the address tab, and then go back to the address tab, and then the Household Members tab is active and accessible. 
  Solution:  Added code in the DISABLE_HOUSEHOLD_TAB form level trigger, to check for tab_topmost = ADDREESSS_TAB and household count is > 0
             then Household Members tab is enabled.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5236
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail842()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment>
AUDIT TRAIL: 8.5
1. Defect 1-4I01RM                            Venkata Krishna   09/09/2011 
   Problem:  Masking %IDEN Prefix and Full Legal Name and getting FRM-41033 
             Cannot set ENABLED attribute of non-displayed item You have setup
             data masking on %IDEN
             %IDEN_CURRENT.PERS_LEGAL_NAME and turned of visibility on the fields and then enter %IDEN and get errors
             FRM-41033: Cannot set ENABLED attribute of non-displayed item SPRIDEN_CURRENT.PERS_LEGAL_NAME <OK>
  Solution: Issue is not only with PERS_LEGAL_NAME and PERS_PREFIX, but also with PERS_SUFFIX and PERS_PREF_FNAME.
            Added code in the ENABLE_PERS_ITEMS form level trigger, to check all above mentioned fields for visible 
            property is true and conceal data property is false then only enable all property of item PERS_LEGAL_NAME.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:5237
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6  IS
<multilinecomment> 
AUDIT TRAIL: 8.6
1. Advancement Organization Enhancement.         Venkata Krishna 07/11/2012 
   Added triggers KEY-NXTKEY to GOREMAL and SPRTELE blocks, to pass the email info 
   and telephone info as global variables.
</multilinecomment>
BEGIN
	NULL;
END;

	*/
	//ID:5238
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_1
	
	PROCEDURE AUDIT_TRAIL_8_6_1  IS
<multilinecomment> 
AUDIT TRAIL: 8.6.1
1. RPE CMS-RPE2540                                Heidi Dombroski 02/26/2013
   Description: Need to provide a method to identify a pref address for an 
                organizational constituent. 
   Solution: Made changes to APAIDEN that would mimic how a pref address is 
             handled for a person. If there is a pref address identified for an org, 
             this will be the first one to display on the address tab of APAIDEN for this org and  
             the pref address checkbox at the bottom of the tab will be checked.  Also created
             a new alert that will display if attempt to delete the preferred organizational
             address.  User will be able to delete the preferred org address, however, they 
             will be provided a warning message before the delete occurs.
</multilinecomment>
BEGIN
	NULL;
END;
	*/
	//ID:5239
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail861()
		{
		}

	
//	
//public static class HouseholdType{
//	public NNumber householdPidm;
//	public NString spouseInd;
//	public NString xrefCode;
//	public NString reviewedInd;
//}
//
//public static class HouseholdPidmTab extends Table<HouseholdType>{
//}


	
	public class HouseholdType {
	
		NString householdPidm = NString.getNull();
	    NString spouseInd = NString.getNull();
	    NString xrefCode = NString.getNull();
	    NString reviewedInd = toStr("N");
	
	    
	//	public HouseholdType(IDataRecord dataRecord) {
	//		
	//		super(dataRecord);
	//		
	//		HouseholdPidm = dataRecord.getStr("SPRIDEN_PIDM");
	//	    SpouseInd = dataRecord.getStr("ATVXREF_SPOUSE_IND");
	//	    XrefCode = dataRecord.getStr("ATVXREF_CODE");
	//	    ReviewedInd = toStr("N");
	//	}
			
	}
	
	
	public class HouseholdPidmTab extends Table<HouseholdType> {
	}


}
