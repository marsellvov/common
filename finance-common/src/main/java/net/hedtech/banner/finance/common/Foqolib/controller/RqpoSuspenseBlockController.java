package net.hedtech.banner.finance.common.Foqolib.controller;
 
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqolib.model.*;
import net.hedtech.banner.finance.common.Foqolib.*;
import net.hedtech.banner.finance.common.Foqolib.services.*;

		
public class RqpoSuspenseBlockController extends AbstractSupportCodeObject {


	
	public RqpoSuspenseBlockController(ISupportCodeContainer parentController) 
	{
		super(parentController);
	}
		
		
		
	@Override
	public FoqolibTaskPart getContainer() {
		return (FoqolibTaskPart)super.getContainer();
	}

	public FoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER RQPO_SUSPENSE_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 CLEAR_BLOCK ;
--
:single_acctg_ind := :global.single_acctg_ind ; 
--
DECLARE  
 COUNT_RECORD   INTEGER:= 0 ;
 CURSOR GET_PO_SUSP_ITEMS IS 
SELECT fprpodt_item, 'Y', to_number(''), 'N', 'X'
  FROM fprpodt
 WHERE fprpodt_pohd_code = :global.doc_no 
   AND nvl(fprpodt_change_seq_num, -999) = nvl(:global.chge_seq_no, -999)  
   AND fprpodt_susp_ind = 'Y' 
 UNION 
SELECT decode(:single_acctg_ind,'Y',to_number(''), fprpoda_item), 
   'N', fprpoda_seq_num, nvl(fprpoda_NSF_susp_ind,'N'), nvl(fprpoda_susp_ind,'N')      
  FROM fprpoda
 WHERE fprpoda_pohd_code = :global.doc_no 
   AND nvl(fprpoda_change_seq_num, -999) = nvl(:global.chge_seq_no, -999)        
   AND (fprpoda_susp_ind = 'Y' OR fprpoda_NSF_susp_ind = 'Y') 
   ORDER BY 1,2 desc,3 ;

  CURSOR GET_RQ_SUSP_ITEMS IS 
SELECT fprreqd_item, 'Y', to_number(''), 'N', 'X'
  FROM fprreqd
 WHERE fprreqd_reqh_code = :global.doc_no 
   AND fprreqd_susp_ind = 'Y' 
 UNION 
SELECT decode(:single_acctg_ind,'Y',to_number(''), fprreqa_item), 
   'N', fprreqa_seq_num, nvl(fprreqa_NSF_susp_ind,'N'), nvl(fprreqa_susp_ind,'N')      
  FROM fprreqa
 WHERE fprreqa_reqh_code = :global.doc_no          
   AND (fprreqa_susp_ind = 'Y' OR fprreqa_NSF_susp_ind = 'Y') 
   ORDER BY 1,2 desc,3 ;

BEGIN
 IF :SYSTEM.CURRENT_FORM IN ('FPIPURR', 'FPAPURR', 'FPACHAR') THEN
  OPEN GET_PO_SUSP_ITEMS ;
  FETCH GET_PO_SUSP_ITEMS INTO :item_no, :comm_susp_ind, 
       :acctg_seq_no, :acctg_NSF_susp_ind, :acctg_susp_ind ;
  WHILE GET_PO_SUSP_ITEMS%FOUND LOOP  
      NEXT_RECORD ; 
      COUNT_RECORD := COUNT_RECORD + 1 ;
      FETCH GET_PO_SUSP_ITEMS INTO  :item_no, :comm_susp_ind, 
            :acctg_seq_no, :acctg_NSF_susp_ind, :acctg_susp_ind ;                         
  END LOOP ;   
ELSIF :SYSTEM.CURRENT_FORM IN ('FPAREQN', 'FPIREQN') THEN
   OPEN GET_RQ_SUSP_ITEMS ;
  FETCH GET_RQ_SUSP_ITEMS INTO :item_no, :comm_susp_ind, 
       :acctg_seq_no, :acctg_NSF_susp_ind, :acctg_susp_ind ;
  WHILE GET_RQ_SUSP_ITEMS%FOUND LOOP  
      NEXT_RECORD ; 
      COUNT_RECORD := COUNT_RECORD + 1 ;
      FETCH GET_RQ_SUSP_ITEMS INTO  :item_no, :comm_susp_ind, 
            :acctg_seq_no, :acctg_NSF_susp_ind, :acctg_susp_ind ;                         
  END LOOP ; 
END IF ;  

  GO_RECORD (1) ;
  :RECORD_COUNT := COUNT_RECORD ;  
  SET_WINDOW_PROPERTY('RQPO_SUSPENSE_WINDOW',TITLE,
               G$_NLS.Get('FOQOLIB-0000', 'FORM',
	'Document Items In Suspense: Total: %01%' 
	, to_char(:RECORD_COUNT))) ;  
  G$_SET_WIN_PROPERTY ;
  G$_SET_INST_PROPERTY ;  
END ;                     

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RQPO_SUSPENSE_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void rqpoSuspenseBlock_blockChange()
		{
			

				RqpoSuspenseBlockAdapter rqpoSuspenseBlockElement = (RqpoSuspenseBlockAdapter)this.getFormModel().getRqpoSuspenseBlock().getRowAdapter(true);

				if(rqpoSuspenseBlockElement!=null){
				int rowCount = 0;
				clearBlock();
				// 
				rqpoSuspenseBlockElement.setSingleAcctgInd(getGlobal("SINGLE_ACCTG_IND"));
				{
					NInteger countRecord = toInt(0);
					String sqlgetPoSuspItems = "SELECT fprpodt_item, 'Y', to_number(''), 'N', 'X' " +
	" FROM fprpodt " +
	" WHERE fprpodt_pohd_code = :GLOBAL_DOC_NO AND nvl(fprpodt_change_seq_num, - 999) = nvl(:GLOBAL_CHGE_SEQ_NO, - 999) AND fprpodt_susp_ind = 'Y' " +
	"UNION SELECT decode(:SINGLE_ACCTG_IND, 'Y', to_number(''), fprpoda_item), 'N', fprpoda_seq_num, nvl(fprpoda_NSF_susp_ind, 'N'), nvl(fprpoda_susp_ind, 'N') " +
	" FROM fprpoda " +
	" WHERE fprpoda_pohd_code = :GLOBAL_DOC_NO AND nvl(fprpoda_change_seq_num, - 999) = nvl(:GLOBAL_CHGE_SEQ_NO, - 999) AND (fprpoda_susp_ind = 'Y' OR fprpoda_NSF_susp_ind = 'Y') " +
	" ORDER BY 1, 2 DESC, 3";
					DataCursor getPoSuspItems = new DataCursor(sqlgetPoSuspItems);
					String sqlgetRqSuspItems = "SELECT fprreqd_item, 'Y', to_number(''), 'N', 'X' " +
	" FROM fprreqd " +
	" WHERE fprreqd_reqh_code = :GLOBAL_DOC_NO AND fprreqd_susp_ind = 'Y' " +
	"UNION SELECT decode(:SINGLE_ACCTG_IND, 'Y', to_number(''), fprreqa_item), 'N', fprreqa_seq_num, nvl(fprreqa_NSF_susp_ind, 'N'), nvl(fprreqa_susp_ind, 'N') " +
	" FROM fprreqa " +
	" WHERE fprreqa_reqh_code = :GLOBAL_DOC_NO AND (fprreqa_susp_ind = 'Y' OR fprreqa_NSF_susp_ind = 'Y') " +
	" ORDER BY 1, 2 DESC, 3";
					DataCursor getRqSuspItems = new DataCursor(sqlgetRqSuspItems);
					try {
						if ( in(getCurrentTaskName(), "FPIPURR", "FPAPURR", "FPACHAR").getValue() )
						{
							//Setting query parameters
							getPoSuspItems.addParameter("GLOBAL_DOC_NO", getGlobal("DOC_NO"));
							getPoSuspItems.addParameter("GLOBAL_CHGE_SEQ_NO", getGlobal("CHGE_SEQ_NO"));
							getPoSuspItems.addParameter("SINGLE_ACCTG_IND", rqpoSuspenseBlockElement.getSingleAcctgInd());
							getPoSuspItems.open();
							ResultSet getPoSuspItemsResults = getPoSuspItems.fetchInto();
							if ( getPoSuspItemsResults != null ) {
								rqpoSuspenseBlockElement.setItemNo(getPoSuspItemsResults.getNumber(0));
								rqpoSuspenseBlockElement.setCommSuspInd(getPoSuspItemsResults.getStr(1));
								rqpoSuspenseBlockElement.setAcctgSeqNo(getPoSuspItemsResults.getNumber(2));
								rqpoSuspenseBlockElement.setAcctgNsfSuspInd(getPoSuspItemsResults.getStr(3));
								rqpoSuspenseBlockElement.setAcctgSuspInd(getPoSuspItemsResults.getStr(4));
							}
							while ( getPoSuspItems.found() ) {
								nextRecord();
								countRecord = countRecord.add(1);
//								ResultSet getPoSuspItemsResults = getPoSuspItems.fetchInto();
								if ( getPoSuspItemsResults != null ) {
									rqpoSuspenseBlockElement.setItemNo(getPoSuspItemsResults.getNumber(0));
									rqpoSuspenseBlockElement.setCommSuspInd(getPoSuspItemsResults.getStr(1));
									rqpoSuspenseBlockElement.setAcctgSeqNo(getPoSuspItemsResults.getNumber(2));
									rqpoSuspenseBlockElement.setAcctgNsfSuspInd(getPoSuspItemsResults.getStr(3));
									rqpoSuspenseBlockElement.setAcctgSuspInd(getPoSuspItemsResults.getStr(4));
								}
							}
						}
						else if ( in(getCurrentTaskName(), "FPAREQN", "FPIREQN").getValue() ) {
							//Setting query parameters
							getRqSuspItems.addParameter("GLOBAL_DOC_NO", getGlobal("DOC_NO"));
							getRqSuspItems.addParameter("SINGLE_ACCTG_IND", rqpoSuspenseBlockElement.getSingleAcctgInd());
							getRqSuspItems.open();
							ResultSet getRqSuspItemsResults = getRqSuspItems.fetchInto();
							if ( getRqSuspItemsResults != null ) {
								rqpoSuspenseBlockElement.setItemNo(getRqSuspItemsResults.getNumber(0));
								rqpoSuspenseBlockElement.setCommSuspInd(getRqSuspItemsResults.getStr(1));
								rqpoSuspenseBlockElement.setAcctgSeqNo(getRqSuspItemsResults.getNumber(2));
								rqpoSuspenseBlockElement.setAcctgNsfSuspInd(getRqSuspItemsResults.getStr(3));
								rqpoSuspenseBlockElement.setAcctgSuspInd(getRqSuspItemsResults.getStr(4));
							}
							while ( getRqSuspItems.found() ) {
								nextRecord();
								countRecord = countRecord.add(1);
//								ResultSet getRqSuspItemsResults = getRqSuspItems.fetchInto();
								if ( getRqSuspItemsResults != null ) {
									rqpoSuspenseBlockElement.setItemNo(getRqSuspItemsResults.getNumber(0));
									rqpoSuspenseBlockElement.setCommSuspInd(getRqSuspItemsResults.getStr(1));
									rqpoSuspenseBlockElement.setAcctgSeqNo(getRqSuspItemsResults.getNumber(2));
									rqpoSuspenseBlockElement.setAcctgNsfSuspInd(getRqSuspItemsResults.getStr(3));
									rqpoSuspenseBlockElement.setAcctgSuspInd(getRqSuspItemsResults.getStr(4));
								}
							}
						}
						setCurrentRecord(1);
						rqpoSuspenseBlockElement.setRecordCount(countRecord);
						setWindowTitle("RQPO_SUSPENSE_WINDOW", GNls.Fget(toStr("FOQOLIB-0000"), toStr("FORM"), toStr("Document Items In Suspense: Total: %01%"), toChar(rqpoSuspenseBlockElement.getRecordCount())));
						getContainer().getGoqrpls().gSetWinProperty();
						getContainer().getGoqrpls().gSetInstProperty();
					}
					finally{
						getPoSuspItems.close();
						getRqSuspItems.close();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RQPO_SUSPENSE_BLOCK.WHEN-NEW-RECORD-INSTANCE
		 :single_acctg_ind := :global.single_acctg_ind ; 
--
BEGIN
 IF :SYSTEM.RECORD_STATUS = 'NEW' THEN        
    IF :SYSTEM.CURSOR_RECORD <> '1' THEN
       PREVIOUS_RECORD; 
    END IF;  
 END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RQPO_SUSPENSE_BLOCK.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void rqpoSuspenseBlock_recordChange()
		{
			

				RqpoSuspenseBlockAdapter rqpoSuspenseBlockElement = (RqpoSuspenseBlockAdapter)this.getFormModel().getRqpoSuspenseBlock().getRowAdapter(true);

				if(rqpoSuspenseBlockElement!=null){
				rqpoSuspenseBlockElement.setSingleAcctgInd(getGlobal("SINGLE_ACCTG_IND"));
				if ( getRecordStatus().equals("NEW") )
				{
					if ( getCursorRecord().notEquals("1") )
					{
						previousRecord();
					}
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RQPO_SUSPENSE_BLOCK.KEY-NXTREC
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
   MESSAGE( G$_NLS.Get('FOQOLIB-0001', 'FORM','At last record.') ,NO_ACKNOWLEDGE);     
   RAISE FORM_TRIGGER_FAILURE ;
ELSE
   NEXT_RECORD ;
END IF ;
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RQPO_SUSPENSE_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void rqpoSuspenseBlock_NextRecord()
		{
			
				if ( isInLastRecord() )
				{
					errorMessage(GNls.Fget(toStr("FOQOLIB-0001"), toStr("FORM"), toStr("*ERROR* At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					throw new ApplicationException();
				}
				else {
					nextRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RQPO_SUSPENSE_BLOCK.KEY-PRVREC
		 PREVIOUS_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RQPO_SUSPENSE_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void rqpoSuspenseBlock_PreviousRecord()
		{
			
				previousRecord();
			}

		
	
	
}

