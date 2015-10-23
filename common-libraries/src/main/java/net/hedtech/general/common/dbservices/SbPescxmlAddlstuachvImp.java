package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAddlstuachvImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ADDLSTUACHV_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecAddlstuacheivElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pReqRapcodeIn,NString pReqRapnameIn,NString pReqRapsubnameIn,NString pReqConditionsmetcodeIn,NString pReqConditionsmetdateIn,NString pReqNotemessageIn,NString pAttrRapcodeIn,NString pAttrRapnameIn,NString pAttrRapsubnameIn,NString pAttrConditionsmetcodeIn,NString pAttrConditionsmetdateIn,NString pAttrNotemessageIn,NString pProfRapcodeIn,NString pProfRapnameIn,NString pProfRapsubnameIn,NString pProfConditionsmetcodeIn,NString pProfConditionsmetdateIn,NString pProfNotemessageIn,NString pLanguagecodeIn,NString pInstructionusageIn,NString pLangNotemessageIn,NString pLicensurenameIn,NString pLicensurepassagedateIn,NString pLiscNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ADDLSTUACHV_IMP.P_ACREC_ADDLSTUACHEIV_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_REQ_RAPCODE_IN", pReqRapcodeIn);
			cmd.addParameter("@P_REQ_RAPNAME_IN", pReqRapnameIn);
			cmd.addParameter("@P_REQ_RAPSUBNAME_IN", pReqRapsubnameIn);
			cmd.addParameter("@P_REQ_CONDITIONSMETCODE_IN", pReqConditionsmetcodeIn);
			cmd.addParameter("@P_REQ_CONDITIONSMETDATE_IN", pReqConditionsmetdateIn);
			cmd.addParameter("@P_REQ_NOTEMESSAGE_IN", pReqNotemessageIn);
			cmd.addParameter("@P_ATTR_RAPCODE_IN", pAttrRapcodeIn);
			cmd.addParameter("@P_ATTR_RAPNAME_IN", pAttrRapnameIn);
			cmd.addParameter("@P_ATTR_RAPSUBNAME_IN", pAttrRapsubnameIn);
			cmd.addParameter("@P_ATTR_CONDITIONSMETCODE_IN", pAttrConditionsmetcodeIn);
			cmd.addParameter("@P_ATTR_CONDITIONSMETDATE_IN", pAttrConditionsmetdateIn);
			cmd.addParameter("@P_ATTR_NOTEMESSAGE_IN", pAttrNotemessageIn);
			cmd.addParameter("@P_PROF_RAPCODE_IN", pProfRapcodeIn);
			cmd.addParameter("@P_PROF_RAPNAME_IN", pProfRapnameIn);
			cmd.addParameter("@P_PROF_RAPSUBNAME_IN", pProfRapsubnameIn);
			cmd.addParameter("@P_PROF_CONDITIONSMETCODE_IN", pProfConditionsmetcodeIn);
			cmd.addParameter("@P_PROF_CONDITIONSMETDATE_IN", pProfConditionsmetdateIn);
			cmd.addParameter("@P_PROF_NOTEMESSAGE_IN", pProfNotemessageIn);
			cmd.addParameter("@P_LANGUAGECODE_IN", pLanguagecodeIn);
			cmd.addParameter("@P_INSTRUCTIONUSAGE_IN", pInstructionusageIn);
			cmd.addParameter("@P_LANG_NOTEMESSAGE_IN", pLangNotemessageIn);
			cmd.addParameter("@P_LICENSURENAME_IN", pLicensurenameIn);
			cmd.addParameter("@P_LICENSUREPASSAGEDATE_IN", pLicensurepassagedateIn);
			cmd.addParameter("@P_LISC_NOTEMESSAGE_IN", pLiscNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
