package net.hedtech.banner.general.common.Guasyst.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guasyst.model.*;
import net.hedtech.banner.general.common.Guasyst.*;
import net.hedtech.banner.general.common.Guasyst.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuasystTask getTask() {
		return (GuasystTask)super.getTask();
	}

	public GuasystModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getGKeyBlockClass().postBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
				getGKeyBlockClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_MoveUp()
		{
			
				getGKeyBlockClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_MoveDown()
		{
			
				getGKeyBlockClass().moveDown();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
				getGKeyBlockClass().createRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
				getGKeyBlockClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
				getGKeyBlockClass().executeQuery();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
				getGKeyBlockClass().nextRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
				getGKeyBlockClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous

		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
				getGKeyBlockClass().previousBlock();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
				getGKeyBlockClass().previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.DISPLAY_DATA
		 BEGIN
  IF :GLOBAL.ALUSYS = 'Y' THEN
    :ALU_CONST := F_IsPidmInTable('APBCONS', 'APBCONS_PIDM', :KEY_BLOCK.PIDM);
    :ADV_INDIV_DONR_CATG := '';
    :ADV_INDIV_PREF_CLAS := '';
    IF :ALU_CONST = 'Y' THEN
      GET_DONOR_CATEGORY(:KEY_BLOCK.PIDM, :ADV_INDIV_DONR_CATG);
      GET_PREF_CLAS(:KEY_BLOCK.PIDM, :ADV_INDIV_PREF_CLAS);
    END IF;
    :ALU_ORGN  := F_IsPidmInTable('AOBORGN', 'AOBORGN_PIDM', :KEY_BLOCK.PIDM);
    :ADV_ORGN_DONR_CATG := '';
    IF :ALU_ORGN = 'Y' THEN
      GET_DONOR_CATEGORY(:KEY_BLOCK.PIDM, :ADV_ORGN_DONR_CATG);
    END IF;
  END IF;
--
  IF :GLOBAL.FINSYS = 'Y' THEN
    :FIN_AGENCY := F_IsPidmInTable('FTVAGCY','FTVAGCY_AGCY_CODE_PIDM', :KEY_BLOCK.PIDM);
    :FIN_BANK   := F_IsPidmInTable('GXVBANK','GXVBANK_BANK_CODE_PIDM', :KEY_BLOCK.PIDM);
    :FIN_CUST   := F_IsPidmInTable('FTVCUST','FTVCUST_PIDM', :KEY_BLOCK.PIDM);
    :FIN_EMPL   := F_IsPidmInTable('FCBEMPL','FCBEMPL_PIDM', :KEY_BLOCK.PIDM);
    :FIN_MAGR   := F_IsPidmInTable('FTVFMGR','FTVFMGR_FMGR_CODE_PIDM', :KEY_BLOCK.PIDM);
    :FIN_VEND   := F_IsPidmInTable('FTVVEND','FTVVEND_PIDM', :KEY_BLOCK.PIDM);
  END IF;
--
  IF :GLOBAL.HRESYS = 'Y' THEN
    :HR_APPL  := F_IsPidmInTable('PABAPPL','PABAPPL_PIDM', :KEY_BLOCK.PIDM);
    :HR_EMPL  := F_IsPidmInTable('PEBEMPL','PEBEMPL_PIDM', :KEY_BLOCK.PIDM);
    :HR_COBRA := F_IsPidmInTable('PCBPERS','PCBPERS_PIDM', :KEY_BLOCK.PIDM);
    :HR_BENE  := F_IsPidmInTable('PDRBENE','PDRBENE_BENE_PIDM', :KEY_BLOCK.PIDM);
  END IF;
--
  IF :GLOBAL.STUSYS = 'Y' THEN
    :STD_GENR := F_IsPidmInTable('SGBSTDN','SGBSTDN_PIDM', :KEY_BLOCK.PIDM);
    :STD_RECR := F_IsPidmInTable('SRBRECR','SRBRECR_PIDM', :KEY_BLOCK.PIDM);
    :STD_ADM  := F_IsPidmInTable('SARADAP','SARADAP_PIDM', :KEY_BLOCK.PIDM);
    :STD_REGR := F_IsPidmInTable('SFBETRM','SFBETRM_PIDM', :KEY_BLOCK.PIDM);
    :STD_HOUS := F_IsPidmInTable('SLBRMAP','SLBRMAP_PIDM', :KEY_BLOCK.PIDM);
    :STD_FACU := F_IsPidmInTable('SIBINST','SIBINST_PIDM', :KEY_BLOCK.PIDM);
    :STD_TRAN := F_IsPidmInTable('SHRTRAM','SHRTRAM_PIDM', :KEY_BLOCK.PIDM);
  END IF;
--
  IF :GLOBAL.BILCSH = 'Y' THEN
--
-- With this one, we check 4 tables, any one of them is good enough.
--
    :AR := F_IsPidmInTable('TBRACCD','TBRACCD_PIDM', :KEY_BLOCK.PIDM);
    IF :AR = 'N' THEN 
      :AR := F_IsPidmInTable('TBRDEPO','TBRDEPO_PIDM', :KEY_BLOCK.PIDM);
      IF :AR = 'N' THEN
        :AR := F_IsPidmInTable('TBRMEMO','TBRMEMO_PIDM', :KEY_BLOCK.PIDM);
        IF :AR = 'N' THEN
          :AR := F_IsPidmInTable('TBBCPRF','TBBCPRF_PIDM', :KEY_BLOCK.PIDM);
        END IF;
      END IF;
    END IF;
  END IF;
--
  IF :GLOBAL.RESSYS = 'Y' THEN
    :FIN_AID_APPL := F_IsPidmInTable('RORSTAT','RORSTAT_PIDM', :KEY_BLOCK.PIDM);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.DISPLAY_DATA
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISPLAY_DATA")
		public void keyBlock_DisplayData()
		{
			
				if ( getGlobal("ALUSYS").equals("Y") )
				{
					getFormModel().getKeyBlock().setAluConst(StoredProcedures.fIspidmintable(toStr("APBCONS"), toStr("APBCONS_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setAdvIndivDonrCatg(toStr(""));
					getFormModel().getKeyBlock().setAdvIndivPrefClas(toStr(""));
					if ( getFormModel().getKeyBlock().getAluConst().equals("Y") )
					{
						Ref<NString> donrCatgOut_ref = new Ref<NString>(getFormModel().getKeyBlock().getAdvIndivDonrCatg());
						this.getTask().getServices().getDonorCategory(getFormModel().getKeyBlock().getPidm(), donrCatgOut_ref);
						getFormModel().getKeyBlock().setAdvIndivDonrCatg(donrCatgOut_ref.val);
						Ref<NString> prefClasOut_ref = new Ref<NString>(getFormModel().getKeyBlock().getAdvIndivPrefClas());
						this.getTask().getServices().getPrefClas(getFormModel().getKeyBlock().getPidm(), prefClasOut_ref);
						getFormModel().getKeyBlock().setAdvIndivPrefClas(prefClasOut_ref.val);
					}
					getFormModel().getKeyBlock().setAluOrgn(StoredProcedures.fIspidmintable(toStr("AOBORGN"), toStr("AOBORGN_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setAdvOrgnDonrCatg(toStr(""));
					if ( getFormModel().getKeyBlock().getAluOrgn().equals("Y") )
					{
						Ref<NString>  donrCatgOut_ref = new Ref<NString>(getFormModel().getKeyBlock().getAdvOrgnDonrCatg());
						this.getTask().getServices().getDonorCategory(getFormModel().getKeyBlock().getPidm(), donrCatgOut_ref);
						getFormModel().getKeyBlock().setAdvOrgnDonrCatg(donrCatgOut_ref.val);
					}
				}
				if ( getGlobal("FINSYS").equals("Y") )
				{
					getFormModel().getKeyBlock().setFinAgency(StoredProcedures.fIspidmintable(toStr("FTVAGCY"), toStr("FTVAGCY_AGCY_CODE_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setFinBank(StoredProcedures.fIspidmintable(toStr("GXVBANK"), toStr("GXVBANK_BANK_CODE_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setFinCust(StoredProcedures.fIspidmintable(toStr("FTVCUST"), toStr("FTVCUST_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setFinEmpl(StoredProcedures.fIspidmintable(toStr("FCBEMPL"), toStr("FCBEMPL_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setFinMagr(StoredProcedures.fIspidmintable(toStr("FTVFMGR"), toStr("FTVFMGR_FMGR_CODE_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setFinVend(StoredProcedures.fIspidmintable(toStr("FTVVEND"), toStr("FTVVEND_PIDM"), getFormModel().getKeyBlock().getPidm()));
				}
				if ( getGlobal("HRESYS").equals("Y") )
				{
					getFormModel().getKeyBlock().setHrAppl(StoredProcedures.fIspidmintable(toStr("PABAPPL"), toStr("PABAPPL_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setHrEmpl(StoredProcedures.fIspidmintable(toStr("PEBEMPL"), toStr("PEBEMPL_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setHrCobra(StoredProcedures.fIspidmintable(toStr("PCBPERS"), toStr("PCBPERS_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setHrBene(StoredProcedures.fIspidmintable(toStr("PDRBENE"), toStr("PDRBENE_BENE_PIDM"), getFormModel().getKeyBlock().getPidm()));
				}
				if ( getGlobal("STUSYS").equals("Y") )
				{
					getFormModel().getKeyBlock().setStdGenr(StoredProcedures.fIspidmintable(toStr("SGBSTDN"), toStr("SGBSTDN_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdRecr(StoredProcedures.fIspidmintable(toStr("SRBRECR"), toStr("SRBRECR_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdAdm(StoredProcedures.fIspidmintable(toStr("SARADAP"), toStr("SARADAP_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdRegr(StoredProcedures.fIspidmintable(toStr("SFBETRM"), toStr("SFBETRM_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdHous(StoredProcedures.fIspidmintable(toStr("SLBRMAP"), toStr("SLBRMAP_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdFacu(StoredProcedures.fIspidmintable(toStr("SIBINST"), toStr("SIBINST_PIDM"), getFormModel().getKeyBlock().getPidm()));
					getFormModel().getKeyBlock().setStdTran(StoredProcedures.fIspidmintable(toStr("SHRTRAM"), toStr("SHRTRAM_PIDM"), getFormModel().getKeyBlock().getPidm()));
				}
				if ( getGlobal("BILCSH").equals("Y") )
				{
					getFormModel().getKeyBlock().setAr(StoredProcedures.fIspidmintable(toStr("TBRACCD"), toStr("TBRACCD_PIDM"), getFormModel().getKeyBlock().getPidm()));
					if ( getFormModel().getKeyBlock().getAr().equals("N") )
					{
						getFormModel().getKeyBlock().setAr(StoredProcedures.fIspidmintable(toStr("TBRDEPO"), toStr("TBRDEPO_PIDM"), getFormModel().getKeyBlock().getPidm()));
						if ( getFormModel().getKeyBlock().getAr().equals("N") )
						{
							getFormModel().getKeyBlock().setAr(StoredProcedures.fIspidmintable(toStr("TBRMEMO"), toStr("TBRMEMO_PIDM"), getFormModel().getKeyBlock().getPidm()));
							if ( getFormModel().getKeyBlock().getAr().equals("N") )
							{
								getFormModel().getKeyBlock().setAr(StoredProcedures.fIspidmintable(toStr("TBBCPRF"), toStr("TBBCPRF_PIDM"), getFormModel().getKeyBlock().getPidm()));
							}
						}
					}
				}
				if ( getGlobal("RESSYS").equals("Y") )
				{
					getFormModel().getKeyBlock().setFinAidAppl(StoredProcedures.fIspidmintable(toStr("RORSTAT"), toStr("RORSTAT_PIDM"), getFormModel().getKeyBlock().getPidm()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CLRBLK
		    CLEAR_BLOCK ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void keyBlock_keyClearBlock()
		{
			
				clearBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CQUERY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void keyBlock_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-DUPREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void keyBlock_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-ENTQRY
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="ID", function=KeyFunction.ITEM_IN)
		public void id_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ID", function=KeyFunction.NEXT_ITEM)
		public void id_keyNexItem()
		{
			
				getGIdClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 BEGIN
  G$_COPY_FLD_ATTR;
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'SOAIDEN','');
  G$_RESET_GLOBAL;
--
  IF :GLOBAL.VALUE IS NOT NULL THEN
    EXECUTE_TRIGGER( 'LIST_VALUES_COPY' );
    G$_CHECK_FAILURE;
    NEXT_FIELD;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ID", function=KeyFunction.LIST_VALUES)
		public void id_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOAIDEN"), toStr(""));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
				
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 BEGIN
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'SOACOMP','');
  G$_CHECK_FAILURE;
--
  IF :GLOBAL.VALUE IS NOT NULL THEN
    EXECUTE_TRIGGER( 'LIST_VALUES_COPY' );
    G$_CHECK_FAILURE;
    NEXT_FIELD;
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOACOMP"), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 BEGIN
  BEGIN
  IF :ID IS NULL THEN
    :NAME := '';
    RETURN;
  END IF;
--
  :CONFID_MSG := '';
  :DCSD_MSG := '';
  :NAME := '';
  G$_VALID_ALL_ID(:ID,:PIDM,:NAME,:CONFID_MSG,:DCSD_MSG);
  EXECUTE_TRIGGER('DISPLAY_DATA'); 
  EXECUTE_TRIGGER('DISPLAY_HEADINGS');
END;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ID")
		public void id_validate()
		{
			
			this.id_PostChange();

				if ( getFormModel().getKeyBlock().getId().isNull() )
				{
					getFormModel().getKeyBlock().setNname(toStr(""));
					return ;
				}
				getFormModel().getKeyBlock().setConfidMsg(toStr(""));
				getFormModel().getKeyBlock().setDcsdMsg(toStr(""));
				getFormModel().getKeyBlock().setNname(toStr(""));
				Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
				Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
				Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getNname());
				Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfidMsg());
				Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDcsdMsg());
				getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
				getFormModel().getKeyBlock().setId(pId_ref.val);
				getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
				getFormModel().getKeyBlock().setNname(pFullName_ref.val);
				getFormModel().getKeyBlock().setConfidMsg(pConfidInd_ref.val);
				getFormModel().getKeyBlock().setDcsdMsg(pDcsdInd_ref.val);
				executeAction("DISPLAY_DATA");
				executeAction("DISPLAY_HEADINGS");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ID")
		public void id_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 -- 54-1  add trigger code to perform call 
--       to new GUIALTI form thru Option List Window
BEGIN
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(USER,'GUIALTI','');
  G$_CHECK_FAILURE;
--
  IF :GLOBAL.VALUE IS NOT NULL THEN
    EXECUTE_TRIGGER( 'LIST_VALUES_COPY' );
    G$_CHECK_FAILURE;
    NEXT_FIELD;
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_ITEM)
		public void id_KeyDupItem()
		{
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUIALTI"), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NAME", function=KeyFunction.NEXT_ITEM)
		public void name_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
	
	
}

