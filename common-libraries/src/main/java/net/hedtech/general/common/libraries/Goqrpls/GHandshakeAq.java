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

public class GHandshakeAq extends AbstractSupportCodeObject {
	

	public GHandshakeAq(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_HANDSHAKE_AQ
	/*
	PACKAGE G$_HANDSHAKE_AQ IS
-- --
-- --
  PROCEDURE P_HANDSHAKE_MSG_FRAGMENTS_ENQ(p_queue_name       IN VARCHAR2,
                                          p_return_status    OUT VARCHAR2,
                                          p_mf_misc_01       IN VARCHAR2,
                                          p_mf_01            IN SYS.ANYDATA,
                                          p_mf_02            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_03            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_04            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_05            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_06            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_07            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_08            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_09            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_10            IN SYS.ANYDATA DEFAULT NULL);
                                          
  PROCEDURE P_HANDSHAKE_MSG_FRAGMENTS_DEQ1(p_queue_name       IN VARCHAR2,
                                           p_condit           IN VARCHAR2,
                                           p_max_wait         IN NUMBER,
                                           p_wait_factor      IN NUMBER,
                                           p_return_status    OUT VARCHAR2,
                                           p_response         OUT VARCHAR2);
-- --
-- --
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_HANDSHAKE_AQ
		/*
		PACKAGE BODY G$_HANDSHAKE_AQ IS
-- --
-- --  
  PROCEDURE P_HANDSHAKE_MSG_FRAGMENTS_ENQ(p_queue_name       IN VARCHAR2,
                                          p_return_status    OUT VARCHAR2,
                                          p_mf_misc_01       IN VARCHAR2,
                                          p_mf_01            IN SYS.ANYDATA,
                                          p_mf_02            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_03            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_04            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_05            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_06            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_07            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_08            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_09            IN SYS.ANYDATA DEFAULT NULL,
                                          p_mf_10            IN SYS.ANYDATA DEFAULT NULL)
  IS
  BEGIN
  	p_return_status := '1';
    GB_ADVQ_UTIL.P_HANDSHAKE_MSG_FRAGMENTS_ENQ(p_queue_name,
                                               p_return_status,
                                               p_mf_misc_01,
                                               p_mf_01,
                                               p_mf_02,
                                               p_mf_03,
                                               p_mf_04,
                                               p_mf_05,
                                               p_mf_06,
                                               p_mf_07,
                                               p_mf_08,
                                               p_mf_09,
                                               p_mf_10);

  EXCEPTION
    WHEN OTHERS THEN
       MESSAGE(G$_NLS.Get('GOQRPLS-0050','LIB','*ERROR* G$_HANDSHAKE_AQ.FRAGMENTS_ENQ %01%',SUBSTR(SQLERRM,1,255)));
  END P_HANDSHAKE_MSG_FRAGMENTS_ENQ;
-- --
-- --                                          
  PROCEDURE P_HANDSHAKE_MSG_FRAGMENTS_DEQ1(p_queue_name       IN VARCHAR2,
                                           p_condit           IN VARCHAR2,
                                           p_max_wait         IN NUMBER,
                                           p_wait_factor      IN NUMBER,
                                           p_return_status    OUT VARCHAR2,
                                           p_response         OUT VARCHAR2)
  IS
  BEGIN
  	p_return_status := '1';
    GB_ADVQ_UTIL.P_HANDSHAKE_MSG_FRAGMENTS_DEQ1(p_queue_name,
                                                p_condit,
                                                p_max_wait,
                                                p_wait_factor,
                                                p_return_status,
                                                p_response);

  EXCEPTION
    WHEN OTHERS THEN
       MESSAGE(G$_NLS.Get('GOQRPLS-0051','LIB','*ERROR* G$_HANDSHAKE_AQ.FRAGMENTS_DEQ1 %01%',SUBSTR(SQLERRM,1,255)));
  END P_HANDSHAKE_MSG_FRAGMENTS_DEQ1;
-- --
-- --
BEGIN
  NULL;
END;
		*/
		/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, UnknownTypes.SysAnydata pMf01) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, null, null, null, null, null, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, UnknownTypes.SysAnydata pMf01, UnknownTypes.SysAnydata pMf02) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, null, null, null, null, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, null, null, null, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, null, null, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, null, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		* @param pMf06
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, pMf06, null, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		* @param pMf06
		* @param pMf07
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06, Object pMf07) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, pMf06, pMf07, null, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		* @param pMf06
		* @param pMf07
		* @param pMf08
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06, Object pMf07, Object pMf08) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, pMf06, pMf07, pMf08, null, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		* @param pMf06
		* @param pMf07
		* @param pMf08
		* @param pMf09
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06, Object pMf07, Object pMf08, Object pMf09) {
			pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, pMf06, pMf07, pMf08, pMf09, null);
		}

/* <p>
		*  --
		*  --  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pReturnStatus
		* @param pMfMisc01
		* @param pMf01
		* @param pMf02
		* @param pMf03
		* @param pMf04
		* @param pMf05
		* @param pMf06
		* @param pMf07
		* @param pMf08
		* @param pMf09
		* @param pMf10
		*/
		public void pHandshakeMsgFragmentsEnq(NString pQueueName, Ref<NString> pReturnStatus, NString pMfMisc01, Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06, Object pMf07, Object pMf08, Object pMf09, Object pMf10)
		{
			try
			{
				pReturnStatus.val = toStr("1");
				GbAdvqUtil.pHandshakeMsgFragmentsEnq(pQueueName, pReturnStatus, pMfMisc01, pMf01, pMf02, pMf03, pMf04, pMf05, pMf06, pMf07, pMf08, pMf09, pMf10);
			}
			catch(Exception  e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0050"), toStr("LIB"), toStr("*ERROR* G$_HANDSHAKE_AQ.FRAGMENTS_ENQ %01%"), substring(errorMessage(), toInt(1), toInt(255))));
			}
		}
/* <p>
		*  --
		*  --                                          
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pQueueName
		* @param pCondit
		* @param pMaxWait
		* @param pWaitFactor
		* @param pReturnStatus
		* @param pResponse
		*/
		public void pHandshakeMsgFragmentsDeq1(NString pQueueName, NString pCondit, NNumber pMaxWait, NNumber pWaitFactor, Ref<NString> pReturnStatus, Ref<NString> pResponse)
		{
			try
			{
				pReturnStatus.val = toStr("1");
				GbAdvqUtil.pHandshakeMsgFragmentsDeq1(pQueueName, pCondit, pMaxWait, pWaitFactor, pReturnStatus, pResponse);
			}
			catch(Exception  e)
			{
				errorMessage(GNls.Fget(toStr("GOQRPLS-0051"), toStr("LIB"), toStr("*ERROR* G$_HANDSHAKE_AQ.FRAGMENTS_DEQ1 %01%"), substring(errorMessage(), toInt(1), toInt(255))));
			}
		}
	
	
}
