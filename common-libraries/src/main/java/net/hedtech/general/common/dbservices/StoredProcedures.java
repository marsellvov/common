package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.IDataRecord;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;

public class StoredProcedures {

	public static void pEditEclsVsEskl(NString parLocationInd,
			NString parEmprInd, NString parFullPartInd,
			NString parEsklCode, Ref<NString> msg,
			Ref<NString> msgType) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"P_EDIT_ECLS_VS_ESKL", DbManager.getDataBaseFactory());

		cmd.addParameter("@PAR_LOCATION_IND", parLocationInd);
		cmd.addParameter("@PAR_EMPR_IND", parEmprInd);
		cmd.addParameter("@PAR_FULL_PART_IND", parFullPartInd);
		cmd.addParameter("@PAR_ESKL_CODE", parEsklCode);
		cmd.addParameter("@MSG", NString.class);
		cmd.addParameter("@MSG_TYPE", NString.class);

		cmd.execute();
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);

	}
	
    public static NString fGetSpecialDesc(NString code, NDate profileDate) {
        
        IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_SPECIAL_DESC", DbManager.getDataBaseFactory());
        
        cmd.addReturnParameter(NString.class);
        cmd.addParameter("@CODE", code);
        cmd.addParameter("@PROFILE_DATE", profileDate);
            
        cmd.execute();

        return cmd.getReturnValue(NString.class);
    }	
    
    //MORPHIS TODO GEN- ADDED STORE PROCEDURE
    public static NString fGstMixedTgrps (NString pDocCode, NString pCommTable, NString pDocHeaderTable, NDate pDate) {
    	
    	IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
    				"F_GST_MIXED_TGRPS", DbManager.getDataBaseFactory());
    				
    	cmd.addParameter("@P_DOC_CODE", pDocCode);
    	cmd.addParameter("@P_COMM_TABLE", pCommTable);
    	cmd.addParameter("@P_DOC_HEADER_TABLE", pDocHeaderTable);
    	cmd.addParameter("@P_DATE", pDate);
    	
    	cmd.execute();
    	
    	return cmd.getReturnValue(NString.class);
    }
	
    public static NString fCodeExists(NString pTableIn,NString codeIn) {

    	IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_CODE_EXISTS", DbManager.getDataBaseFactory());

    	cmd.addReturnParameter(NString.class);
    	cmd.addParameter("@P_TABLE_IN", pTableIn);
    	cmd.addParameter("@CODE_IN", codeIn);
    	cmd.execute();

    	return cmd.getReturnValue(NString.class);
    }
    
    //Added to work with FVACHAR
    public static NBool fGstRateOfMultplReb(NString pTgrpCode,NDate pDate) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GST_RATE_OF_MULTPL_REB", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
		cmd.addParameter("@P_DATE", pDate);
			
		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}
    
	public static NNumber fConvertLeaveValue(NString convTypeIn,NNumber inputValueIn,NNumber stdHrsDayIn) {
        
        IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_CONVERT_LEAVE_VALUE", DbManager.getDataBaseFactory());
        
        cmd.addReturnParameter(NNumber.class);
        cmd.addParameter("@CONV_TYPE_IN", convTypeIn);
        cmd.addParameter("@INPUT_VALUE_IN", inputValueIn);
        cmd.addParameter("@STD_HRS_DAY_IN", stdHrsDayIn);
            
        cmd.execute();

        return cmd.getReturnValue(NNumber.class);

    }
//    
//    
//    public static NNumber fConvertLeaveValue(NString convTypeIn, NNumber inputValueIn, NNumber stdHrsDayIn) {
//    	
//
//    	
//        
//        IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_SPECIAL_DESC", DbManager.getDataBaseFactory());
//        
//        cmd.addReturnParameter(NString.class);
//        cmd.addParameter("@CONV_TYPE_IN", convTypeIn);
//        cmd.addParameter("@INPUT_VALUE_IN", inputValueIn);
//        cmd.addParameter("@STD_HRS_DAY_IN", stdHrsDayIn);   
//        cmd.execute();
//
//        return cmd.getReturnValue(NNumber.class);
//    }	
//    
	//MORPHIS TODO MP variavel pidm duplicada substituida por pidm2
	
	public static NString fGetspridenid(NNumber pPidm,NNumber pidm,NNumber pidm2) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GETSPRIDENID", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@PIDM", pidm);
		cmd.addParameter("@PIDM", pidm2);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
    
	public static NString fFormatName(NString firstNameIn,NNumber pidm,NString lastNameIn,NString nameType,NString middleIn,NString formatTypeIn) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_FORMAT_NAME", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
		cmd.addParameter("@PIDM", pidm);
		cmd.addParameter("@LAST_NAME_IN", lastNameIn);
		cmd.addParameter("@NAME_TYPE", nameType);
		cmd.addParameter("@MIDDLE_IN", middleIn);
		cmd.addParameter("@FORMAT_TYPE_IN", formatTypeIn);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
    
	public static NString getUserEnvSessionId(){
		String sqlCmd = "SELECT USERENV('SESSIONID') FROM DUAL";
		IDataCommand getSessionIdCmd = DbManager.getDataAccessFactory().createDataCommand(sqlCmd,  DbManager.getDataBaseFactory());
		
		IDataRecord result = getSessionIdCmd.executeQuery();
		if (result.hasData())
			return result.getStr(0);
		else
			return NString.getNull();
	}
	
	public static NString fTimeConversion(NString timeIn,NString formatIn,NString formatOut) {
		 	return fTimeConversion(timeIn,formatIn,formatOut,new NString("N"));
	}
	
	public static NString fTimeConversion(NString timeIn,NString formatIn,NString formatOut,NString overrideNlsLang) {
		 
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_TIME_CONVERSION", DbManager.getDataBaseFactory());
		 
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@TIME_IN", timeIn);
		cmd.addParameter("@FORMAT_IN", formatIn);
		cmd.addParameter("@FORMAT_OUT", formatOut);
		cmd.addParameter("@OVERRIDE_NLS_LANG", overrideNlsLang);
		 
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static NString fIspidmintable(NString tabNameIn,NString colNameIn,NNumber pidmIn) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_ISPIDMINTABLE", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@TAB_NAME_IN", tabNameIn);
		cmd.addParameter("@COL_NAME_IN", colNameIn);
		cmd.addParameter("@PIDM_IN", pidmIn);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static void pEditLcatEclsCode(NString par_lcat_code, NString par_ecls_code, Ref<NString> par_desc, NString exe_source, Ref<NString> msg, Ref<NString> msgType) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("P_EDIT_LCAT_ECLS_CODE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@PAR_LCAT_CODE", par_lcat_code);
		cmd.addParameter("@PAR_ECLS_CODE", par_ecls_code);
		cmd.addParameter("@PAR_DESC", par_desc, true);
		cmd.addParameter("@EXE_SOURCE", exe_source);
		cmd.addParameter("@MSG", NString.class, null, true);
		cmd.addParameter("@MSGTYPE", NString.class, null, true);
		
		cmd.execute();
		
		msg.val = cmd.getParameterValue("@MSG", NString.class);
		msgType.val = cmd.getParameterValue("@MSGTYPE", NString.class);
	}
	
	public static NString fGetSurveyStatus(NString PvresvyName) {

    	IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_SURVEY_STATUS", DbManager.getDataBaseFactory());

    	cmd.addReturnParameter(NString.class);
    	cmd.addParameter("@P_SURVEY_NAME", PvresvyName);
    	cmd.execute();

    	return cmd.getReturnValue(NString.class);
    }

	//MORPHIS TODO - SOLUTION CENTER STORED PROCEDURES
	
	public static void pCalcDednAmount(NString txcdCode, NString bdcaCode, NNumber pidm, NDate pvrtd1aEffectiveDate, Ref<NNumber> p_amount_ref, Ref<NString> p_is_error_ref, Ref<NString> p_error_ref) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("P_CALC_DEDN_AMOUNT", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_TAX_CODE",txcdCode);
		cmd.addParameter("@P_BDCA_CODE",bdcaCode);
		cmd.addParameter("@P_PIDM",pidm);
		cmd.addParameter("@P_EFFECTIVE_DATE",pvrtd1aEffectiveDate);
		cmd.addParameter("@P_AMOUNT",NNumber.class,p_amount_ref.val,true);

		
//		cmd.addParameter(DbTypes.createStructType("P_AMOUNT",p_amount_ref.val,NNumber.class,true));
		cmd.addParameter("@P_IS_ERROR",NString.class,null,true);
//		cmd.addParameter(DbTypes.createStructType("P_IS_ERROR", null, NString.class, true));		
		cmd.addParameter("@P_ERROR",NString.class,null,true);
//		cmd.addParameter(DbTypes.createStructType("P_ERROR", null, NString.class, true));
		
		cmd.execute();
		
		p_amount_ref.val = cmd.getParameterValue("@P_AMOUNT", NNumber.class);
		p_is_error_ref.val = cmd.getParameterValue("@P_IS_ERROR", NString.class);
		p_error_ref.val = cmd.getParameterValue("@P_ERROR", NString.class);
		
	}

	public static void pDeleteWorksheet(NNumber pidm, NString groupCode, NString txcdCode, NString pvrtcrdTcrdCode,	NDate pvrtd1aEffectiveDate, Ref<NNumber> p_error_num_ref, Ref<NString> p_error_msg_ref) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("P_DELETE_WORKSHEET", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_PIDM",pidm);
		cmd.addParameter("@P_TGRP_CODE",groupCode);
		cmd.addParameter("@P_TXCD_CODE",txcdCode);
		cmd.addParameter("@P_TCRD_CODE",pvrtcrdTcrdCode);
		cmd.addParameter("@P_EFF_DATE",pvrtd1aEffectiveDate);
		cmd.addParameter("@P_ERROR_NUM",NNumber.class,null,true);
		cmd.addParameter("@P_ERROR_MSG",NString.class,null,true);
		
		cmd.execute();
		
		p_error_num_ref.val = cmd.getParameterValue("@P_ERROR_NUM", NNumber.class);
		p_error_msg_ref.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);
		
	}
	
	public static void pGlobalGrntAssgn(NString coasCode,NString grntCode,NString grntBegPrd,NString grntEndPrd,NString grntBegYr,NString grntEndYr,NString atypCode,NString acctCode,NNumber atypLevel12Ind,NString fundCode,NString orgnCode,NString progCode,NString actvCode,NString locnCode,NString revAcctInd,NString trailInPrdInd) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("P_GLOBAL_GRNT_ASSGN", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@COAS_CODE", coasCode);
		cmd.addParameter("@GRNT_CODE", grntCode);
		cmd.addParameter("@GRNT_BEG_PRD", grntBegPrd);
		cmd.addParameter("@GRNT_END_PRD", grntEndPrd);
		cmd.addParameter("@GRNT_BEG_YR", grntBegYr);
		cmd.addParameter("@GRNT_END_YR", grntEndYr);
		cmd.addParameter("@ATYP_CODE", atypCode);
		cmd.addParameter("@ACCT_CODE", acctCode);
		cmd.addParameter("@ATYP_LEVEL_1_2_IND", atypLevel12Ind);
		cmd.addParameter("@FUND_CODE", fundCode);
		cmd.addParameter("@ORGN_CODE", orgnCode);
		cmd.addParameter("@PROG_CODE", progCode);
		cmd.addParameter("@ACTV_CODE", actvCode);
		cmd.addParameter("@LOCN_CODE", locnCode);
		cmd.addParameter("@REV_ACCT_IND", revAcctInd);
		cmd.addParameter("@TRAIL_IN_PRD_IND", trailInPrdInd);
			
		cmd.execute();


	}
	
	public static NString fGetSponsorAcct(NString codeInd,NString code,NString coasCode,NString acctCode,NString atypCode) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_SPONSOR_ACCT", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@CODE_IND", codeInd);
		cmd.addParameter("@CODE", code);
		cmd.addParameter("@COAS_CODE", coasCode);
		cmd.addParameter("@ACCT_CODE", acctCode);
		cmd.addParameter("@ATYP_CODE", atypCode);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	
	public static NString fTrnGrntYrPrd(NString grntCode,NString dateIn,NString trnInd) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_TRN_GRNT_YR_PRD", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@GRNT_CODE", grntCode);
		cmd.addParameter("@DATE_IN", dateIn);
		cmd.addParameter("@TRN_IND", trnInd);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	
	public static NNumber fGetMaxAdjSeqNum(NString coasCode,NString grntCode,NString fundCode,NNumber billInvSeqNo,NNumber billInvAdjNo,NString defaultParm) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_MAX_ADJ_SEQ_NUM", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NNumber.class);
		cmd.addParameter("@COAS_CODE", coasCode);
		cmd.addParameter("@GRNT_CODE", grntCode);
		cmd.addParameter("@FUND_CODE", fundCode);
		cmd.addParameter("@BILL_INV_SEQ_NO", billInvSeqNo);
		cmd.addParameter("@BILL_INV_ADJ_NO", billInvAdjNo);
		cmd.addParameter("@DEFAULT_PARM", defaultParm);
			
		cmd.execute();

		return cmd.getReturnValue(NNumber.class);

	}
	
	
	
	//morphis TODO MP- adicionado metodo 
	public static NString fGetInternalAtyp(NString CoasCode,NString AcctCode,NDate UseDate){

		 IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_INTERNAL_ATYP", DbManager.getDataBaseFactory());
		        
				cmd.addReturnParameter(NString.class);
		        cmd.addParameter("@F_COAS_CODE_DEF",CoasCode);
				cmd.addParameter("@F__ACCT_CODE_DEF",AcctCode);
				cmd.addParameter("@F_use_date",UseDate);
				
				cmd.execute();

				return cmd.getReturnValue(NString.class);

		}

	//morphis TODO MP- adicionado metodo 
	public static NString fGetFtvsdat(NString entety,NString attr,NString CodeOpt1,NString CodeOpt2,NString coas){

		 IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_FTVSDAT", DbManager.getDataBaseFactory());
		        
				cmd.addReturnParameter(NString.class);
		        cmd.addParameter("@F_ENTITY",entety);
				cmd.addParameter("@F_ATTR",attr);
				cmd.addParameter("@F_CODE_OPT_1",CodeOpt1);
				cmd.addParameter("@F_CODE_OPT_2",CodeOpt2);
				cmd.addParameter("@F_COAS",coas);
				
				cmd.execute();

				return cmd.getReturnValue(NString.class);

		}
	
	//morphis TODO JF- method added 
	public static NString fofycnv(NString yearToConvert){

		 IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOFYCNV", DbManager.getDataBaseFactory());
		        
				cmd.addReturnParameter(NString.class);
		        cmd.addParameter("@YEAR_TO_CONVERT", yearToConvert);
				
				cmd.execute();

				return cmd.getReturnValue(NString.class);

		}
	
	//morphis TODO JF- method added 
	public static NString fPoHasIncompleteDocs(NString poReqCode){

		 IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("f_PO_has_incomplete_docs", DbManager.getDataBaseFactory());
		        
				cmd.addReturnParameter(NString.class);
		        cmd.addParameter("@po_req_code", poReqCode);
				
				cmd.execute();

				return cmd.getReturnValue(NString.class);

		}
	//morphis TODO JV - method added 

	public static void pFapftyp(NString coasCodeV, NString fundTypeV,
			NString effDateV, Ref<NString> editDeferIndV) {
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("p_fapftyp", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@COAS_CODE", coasCodeV);
		cmd.addParameter("@FUNDTYPE_CODE", fundTypeV);
		cmd.addParameter("@EFF_DATE", effDateV);
		cmd.addParameter("@OVERRIDE_IND", editDeferIndV.val);
			
		cmd.execute();

		
	}
	
	//Add to use on FRAAREV
	public static NString fGetDetcActiveInd(NString keyblckDetailCode) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GET_DETC_ACTIVE_IND", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@DETAIL_CODE", keyblckDetailCode);
		
		cmd.execute();
		
		return cmd.getReturnValue(NString.class);
	}
	
	//Add to use on FVACHAR
	public static NBool fFpreocdAlreadyExist(NString poReqCode) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_FPREOCD_ALREADY_EXIST", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NBool.class);
		cmd.addParameter("@PO_REQ_CODE", poReqCode);
			
		cmd.execute();

		return cmd.getReturnValue(NBool.class);

	}
	
	//Added to be used in FVAINVE
	 public static NBool fGstNonTaxableTgrp(NString pTgrp,NDate pDate) {
		   
		   IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("F_GST_NON_TAXABLE_TGRP", DbManager.getDataBaseFactory());
		   
		   cmd.addReturnParameter(NBool.class);
		   cmd.addParameter("@P_TGRP", pTgrp);
		   cmd.addParameter("@P_DATE", pDate);
		    
		   cmd.execute();

		   return cmd.getReturnValue(NBool.class);

		  }
	
	
}