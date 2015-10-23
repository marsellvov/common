package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskalog {
		public static NNumber fChecksecurity(NNumber appno,NString inComplete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_CHECKSECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@IN_COMPLETE", inComplete);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCntsarwapp(NNumber aidm,NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_CNTSARWAPP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fFmtdate(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_FMTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetaidmstu(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETAIDMSTU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetnextrqstseqno(NNumber aidm,NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETNEXTRQSTSEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetphone(NString area,NString pnum,NString ext,NString accs,NString pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETPHONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@PCTC", pctc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetrule(NString funct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETRULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNCT", funct);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetsarwapphead(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETSARWAPPHEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsarwappseqno(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_GETSARWAPPSEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fIsnumeric(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_ISNUMERIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPreferenceDefined(NString pWappCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_PREFERENCE_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_WAPP_CODE", pWappCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSarheadPreferenceDefined(NNumber pAidm,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_SARHEAD_PREFERENCE_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_AIDM", pAidm);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fTopPrioritySarefos(NNumber pAidm,NNumber pAppno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_TOP_PRIORITY_SAREFOS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDM", pAidm);
			cmd.addParameter("@P_APPNO", pAppno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidateappno(NNumber aidm,NNumber appno,NString inComplete) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_VALIDATEAPPNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@IN_COMPLETE", inComplete);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidatedate(NString datestr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_VALIDATEDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@DATESTR", datestr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidatedatewithcentury(NString datestr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_VALIDATEDATEWITHCENTURY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@DATESTR", datestr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidatexref(NString inLabel,NString inValue,NString qlfr,NString includeQlfr,NNumber aidm,NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_VALIDATEXREF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_LABEL", inLabel);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@QLFR", qlfr);
			cmd.addParameter("@INCLUDE_QLFR", includeQlfr);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidusernon(Ref<NNumber> aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.F_VALIDUSERNON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM", aidm, true);
				
			cmd.execute();
			aidm.val = cmd.getParameterValue("@AIDM", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pBookmarksection(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_BOOKMARKSECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pCloseappsection(NNumber appno,NString releaseNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_CLOSEAPPSECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@RELEASE_NO", releaseNo);
				
			cmd.execute();


		}
		
		public static void pDispadmsmnunon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPADMSMNUNON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispchoices(NString inSecured) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPCHOICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_SECURED", inSecured);
				
			cmd.execute();


		}
		
		public static void pDispchoicesstu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPCHOICESSTU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispindex(NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPINDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();


		}
		
		public static void pDisploginnew(NString inId,NString cpbl,NString newid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPLOGINNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@CPBL", cpbl);
			cmd.addParameter("@NEWID", newid);
				
			cmd.execute();


		}
		
		public static void pDisploginnon(NString inId,NString cpbl,NString newid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPLOGINNON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@CPBL", cpbl);
			cmd.addParameter("@NEWID", newid);
				
			cmd.execute();


		}
		
		public static void pDisplogoutnon() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPLOGOUTNON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispnewapp(NString wapp,NString noapps,NString fname,NString mname,NString lname,NString term,NString lpname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPNEWAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP", wapp);
			cmd.addParameter("@NOAPPS", noapps);
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@MNAME", mname);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@LPNAME", lpname);
				
			cmd.execute();


		}
		
		public static void pDisppinlocked() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPPINLOCKED", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisppinverifyexist(NNumber aidm,NString appid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPPINVERIFYEXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPID", appid);
				
			cmd.execute();


		}
		
		public static void pDisppinverifynew(NNumber aidm,NString appid,NString newpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPPINVERIFYNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPID", appid);
			cmd.addParameter("@NEWPIN", newpin);
				
			cmd.execute();


		}
		
		public static void pDispsigpage(NString wapp,NString term,NNumber appno,NString letrIn,NString autoTranIn,NString matchCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPSIGPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP", wapp);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@LETR_IN", letrIn);
			cmd.addParameter("@AUTO_TRAN_IN", autoTranIn);
			cmd.addParameter("@MATCH_CODE_IN", matchCodeIn);
				
			cmd.execute();


		}
		
		public static void pDispsigpageCc(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_DISPSIGPAGE_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pExtractcurr(NNumber pLfosRule,Ref<NString> pProgramDesc,Ref<NNumber> pCurrRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_EXTRACTCURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_PROGRAM_DESC", NString.class);
			cmd.addParameter("@P_CURR_RULE", NNumber.class);
				
			cmd.execute();
			pProgramDesc.val = cmd.getParameterValue("@P_PROGRAM_DESC", NString.class);
			pCurrRule.val = cmd.getParameterValue("@P_CURR_RULE", NNumber.class);


		}
		
		public static void pFailurePage(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_FAILURE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pFormselectrow(NString cname,NString cnameReq,NString cvalue,NString clabelDesc,NString cdeflabel,NString creqdInd,NString cmsgFlag,NString validationTable,NString nullTextIn,NString includeQlfr,NString ccolspan,NString cattributes,NNumber caidm,NNumber cappno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_FORMSELECTROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CNAME_REQ", cnameReq);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CLABEL_DESC", clabelDesc);
			cmd.addParameter("@CDEFLABEL", cdeflabel);
			cmd.addParameter("@CREQD_IND", creqdInd);
			cmd.addParameter("@CMSG_FLAG", cmsgFlag);
			cmd.addParameter("@VALIDATION_TABLE", validationTable);
			cmd.addParameter("@NULL_TEXT_IN", nullTextIn);
			cmd.addParameter("@INCLUDE_QLFR", includeQlfr);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CAIDM", caidm);
			cmd.addParameter("@CAPPNO", cappno);
				
			cmd.execute();


		}
		
//		public static void pGenoptionsxref(NString inLabel,List<Varchar2TabtypeRow> dflt,NString includeQlfr,NNumber aidm,NNumber appno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_GENOPTIONSXREF", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IN_LABEL", inLabel);
//			// cmd.addParameter(DbTypes.getTableType("DFLT", "", dflt, object.class));
//			cmd.addParameter("@INCLUDE_QLFR", includeQlfr);
//			cmd.addParameter("@AIDM", aidm);
//			cmd.addParameter("@APPNO", appno);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGenoptionsxref(NString inLabel,NString dflt,NString includeQlfr,NNumber aidm,NNumber appno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_GENOPTIONSXREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_LABEL", inLabel);
			cmd.addParameter("@DFLT", dflt);
			cmd.addParameter("@INCLUDE_QLFR", includeQlfr);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
				
			cmd.execute();


		}
		
//		public static void pInitquestions(NNumber caidm,NNumber cappno,NString wsct,Ref<List<Varchar2TabanswerRow>> udAnswers,Ref<List<Varchar2TabqstnRow>> udQuestions,Ref<List<Varchar2TabqstnRow>> udQuestionTypes,Ref<List<Varchar2TabtypeRow>> udSeqno,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_INITQUESTIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@CAIDM", caidm);
//			cmd.addParameter("@CAPPNO", cappno);
//			cmd.addParameter("@WSCT", wsct);
//			// cmd.addParameter(DbTypes.getTableType("UD_ANSWERS", "", udAnswers.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_QUESTIONS", "", udQuestions.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_QUESTION_TYPES", "", udQuestionTypes.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_SEQNO", "", udSeqno.val, object.class , true));
//			cmd.addParameter("@UD1", ud1);
//			cmd.addParameter("@UD2", ud2);
//			cmd.addParameter("@UD3", ud3);
//			cmd.addParameter("@UD4", ud4);
//			cmd.addParameter("@UD5", ud5);
//			cmd.addParameter("@UD6", ud6);
//			cmd.addParameter("@UD7", ud7);
//			cmd.addParameter("@UD8", ud8);
//			cmd.addParameter("@UD9", ud9);
//			cmd.addParameter("@UD10", ud10);
//				
//			cmd.execute();
//			// udAnswers.val = cmd.getTableParameterValue("@UD_ANSWERS", object.class);
//			// udQuestions.val = cmd.getTableParameterValue("@UD_QUESTIONS", object.class);
//			// udQuestionTypes.val = cmd.getTableParameterValue("@UD_QUESTION_TYPES", object.class);
//			// udSeqno.val = cmd.getTableParameterValue("@UD_SEQNO", object.class);
//
//
//		}
		
		public static void pInterpretzip(NString zip,Ref<NString> city,Ref<NString> stat,Ref<NString> message,NString errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_INTERPRETZIP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CITY", city, true);
			cmd.addParameter("@STAT", stat, true);
			cmd.addParameter("@MESSAGE", message, true);
			cmd.addParameter("@ERROR_MESSAGE", errorMessage);
				
			cmd.execute();
			city.val = cmd.getParameterValue("@CITY", NString.class);
			stat.val = cmd.getParameterValue("@STAT", NString.class);
			message.val = cmd.getParameterValue("@MESSAGE", NString.class);


		}
		
		public static void pLookupSbgiCode(NString calledByProcIn,NString callsProcIn,NString instTypeIn,NString lTypeIndIn,NNumber appnoIn,NString wsctIn,NNumber recnoIn,NString statIn,NString natnIn,NString cityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_LOOKUP_SBGI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALLED_BY_PROC_IN", calledByProcIn);
			cmd.addParameter("@CALLS_PROC_IN", callsProcIn);
			cmd.addParameter("@INST_TYPE_IN", instTypeIn);
			cmd.addParameter("@L_TYPE_IND_IN", lTypeIndIn);
			cmd.addParameter("@APPNO_IN", appnoIn);
			cmd.addParameter("@WSCT_IN", wsctIn);
			cmd.addParameter("@RECNO_IN", recnoIn);
			cmd.addParameter("@STAT_IN", statIn);
			cmd.addParameter("@NATN_IN", natnIn);
			cmd.addParameter("@CITY_IN", cityIn);
				
			cmd.execute();


		}
		
		public static void pParsephone(NString phone,Ref<NString> area,Ref<NString> pnum,Ref<NString> ext,Ref<NString> accs,Ref<NString> pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PARSEPHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHONE", phone);
			cmd.addParameter("@AREA", area, true);
			cmd.addParameter("@PNUM", pnum, true);
			cmd.addParameter("@EXT", ext, true);
			cmd.addParameter("@ACCS", accs, true);
			cmd.addParameter("@PCTC", pctc, true);
				
			cmd.execute();
			area.val = cmd.getParameterValue("@AREA", NString.class);
			pnum.val = cmd.getParameterValue("@PNUM", NString.class);
			ext.val = cmd.getParameterValue("@EXT", NString.class);
			accs.val = cmd.getParameterValue("@ACCS", NString.class);
			pctc.val = cmd.getParameterValue("@PCTC", NString.class);


		}
		
		public static void pParsexref(NString val,Ref<NString> qlf,Ref<NString> cde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PARSEXREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL", val);
			cmd.addParameter("@QLF", qlf, true);
			cmd.addParameter("@CDE", cde, true);
				
			cmd.execute();
			qlf.val = cmd.getParameterValue("@QLF", NString.class);
			cde.val = cmd.getParameterValue("@CDE", NString.class);


		}
		
		public static void pPrintchecklistcount(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PRINTCHECKLISTCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pPrintmsg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PRINTMSG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintsectionbuttons(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PRINTSECTIONBUTTONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pPrintsectionhdr(NString wsct,NNumber aidm,NNumber appno,NString pOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PRINTSECTIONHDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@P_ORIGIN", pOrigin);
				
			cmd.execute();


		}
		
		public static void pProcSbgiCode(NString calledByProc,NString callsProc,NString instType,NString lTypeInd,NNumber appno,NString wsct,NNumber recno,NString stat,NString natn,NString city,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROC_SBGI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALLED_BY_PROC", calledByProc);
			cmd.addParameter("@CALLS_PROC", callsProc);
			cmd.addParameter("@INST_TYPE", instType);
			cmd.addParameter("@L_TYPE_IND", lTypeInd);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@RECNO", recno);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
		public static void pProcesssectionbuttons(NNumber aidm,NNumber appno,NString wsct,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCESSSECTIONBUTTONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pProcindex(NNumber appno,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCINDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pProcindex2() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCINDEX2", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pProcloginnon(NString inId,NString newid,NString pin,NString newpin,NString verifypin,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCLOGINNON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ID", inId);
			cmd.addParameter("@NEWID", newid);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@NEWPIN", newpin);
			cmd.addParameter("@VERIFYPIN", verifypin);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pProcnewapp(NString wapp,NString noapps,NString term,NString fname,NString mname,NString lname,NString lpname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCNEWAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP", wapp);
			cmd.addParameter("@NOAPPS", noapps);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@MNAME", mname);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@LPNAME", lpname);
				
			cmd.execute();


		}
		
		public static void pProcpinverifyexist(NNumber aidm,Ref<NString> appid,NString vpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCPINVERIFYEXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPID", appid, true);
			cmd.addParameter("@VPIN", vpin);
				
			cmd.execute();
			appid.val = cmd.getParameterValue("@APPID", NString.class);


		}
		
		public static void pProcpinverifynew(NNumber aidm,NString appid,NString vpin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_PROCPINVERIFYNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPID", appid);
			cmd.addParameter("@VPIN", vpin);
				
			cmd.execute();


		}
		
		public static void pQuestion(NNumber caidm,NNumber cappno,NString cquestion,NString cquestionType,Ref<NNumber> cquestionIndex,NString canswer,NString crequiredInd,NString cseqno,NString cmsgFlag,NString ccolspan) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_QUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAIDM", caidm);
			cmd.addParameter("@CAPPNO", cappno);
			cmd.addParameter("@CQUESTION", cquestion);
			cmd.addParameter("@CQUESTION_TYPE", cquestionType);
			cmd.addParameter("@CQUESTION_INDEX", cquestionIndex, true);
			cmd.addParameter("@CANSWER", canswer);
			cmd.addParameter("@CREQUIRED_IND", crequiredInd);
			cmd.addParameter("@CSEQNO", cseqno);
			cmd.addParameter("@CMSG_FLAG", cmsgFlag);
			cmd.addParameter("@CCOLSPAN", ccolspan);
				
			cmd.execute();
			cquestionIndex.val = cmd.getParameterValue("@CQUESTION_INDEX", NNumber.class);


		}
		
		public static void pRegisternow(NNumber appno,NString matchCodeIn,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_REGISTERNOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@MATCH_CODE_IN", matchCodeIn);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pRequiredmsgchk(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_REQUIREDMSGCHK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pSavesection(NNumber aidm,NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_SAVESECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pSelnewapp(NString wapp,NString noapps,NString inSecured) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_SELNEWAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP", wapp);
			cmd.addParameter("@NOAPPS", noapps);
			cmd.addParameter("@IN_SECURED", inSecured);
				
			cmd.execute();


		}
		
		public static void pTrimanswers(NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,Ref<NString> trimUd1,Ref<NString> trimUd2,Ref<NString> trimUd3,Ref<NString> trimUd4,Ref<NString> trimUd5,Ref<NString> trimUd6,Ref<NString> trimUd7,Ref<NString> trimUd8,Ref<NString> trimUd9,Ref<NString> trimUd10,Ref<NString> text) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_TRIMANSWERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UD1", ud1);
			cmd.addParameter("@UD2", ud2);
			cmd.addParameter("@UD3", ud3);
			cmd.addParameter("@UD4", ud4);
			cmd.addParameter("@UD5", ud5);
			cmd.addParameter("@UD6", ud6);
			cmd.addParameter("@UD7", ud7);
			cmd.addParameter("@UD8", ud8);
			cmd.addParameter("@UD9", ud9);
			cmd.addParameter("@UD10", ud10);
			cmd.addParameter("@TRIM_UD1", NString.class);
			cmd.addParameter("@TRIM_UD2", NString.class);
			cmd.addParameter("@TRIM_UD3", NString.class);
			cmd.addParameter("@TRIM_UD4", NString.class);
			cmd.addParameter("@TRIM_UD5", NString.class);
			cmd.addParameter("@TRIM_UD6", NString.class);
			cmd.addParameter("@TRIM_UD7", NString.class);
			cmd.addParameter("@TRIM_UD8", NString.class);
			cmd.addParameter("@TRIM_UD9", NString.class);
			cmd.addParameter("@TRIM_UD10", NString.class);
			cmd.addParameter("@TEXT", text, true);
				
			cmd.execute();
			trimUd1.val = cmd.getParameterValue("@TRIM_UD1", NString.class);
			trimUd2.val = cmd.getParameterValue("@TRIM_UD2", NString.class);
			trimUd3.val = cmd.getParameterValue("@TRIM_UD3", NString.class);
			trimUd4.val = cmd.getParameterValue("@TRIM_UD4", NString.class);
			trimUd5.val = cmd.getParameterValue("@TRIM_UD5", NString.class);
			trimUd6.val = cmd.getParameterValue("@TRIM_UD6", NString.class);
			trimUd7.val = cmd.getParameterValue("@TRIM_UD7", NString.class);
			trimUd8.val = cmd.getParameterValue("@TRIM_UD8", NString.class);
			trimUd9.val = cmd.getParameterValue("@TRIM_UD9", NString.class);
			trimUd10.val = cmd.getParameterValue("@TRIM_UD10", NString.class);
			text.val = cmd.getParameterValue("@TEXT", NString.class);


		}
		
		public static void pUpdategobtpac(NNumber aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_UPDATEGOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();


		}
		
		public static void pUpdateuseranswer(NNumber aidm,NNumber appno,NString ud,NString udSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKALOG.P_UPDATEUSERANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@UD", ud);
			cmd.addParameter("@UD_SEQNO", udSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
