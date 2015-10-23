package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkitre {
		public static void pFindEquivalents(NString pSbgi,NString pLevl,NString pTerm,NString pSubjTrns,NString pCrseNumbTrns,NString pSubjInst,NString pCrseNumbInst,NString pGroup,NString pProgram,NNumber pSeqno,Ref<NNumber> pBeginSeqno,Ref<NNumber> pEndSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_FIND_EQUIVALENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI", pSbgi);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SUBJ_TRNS", pSubjTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_SUBJ_INST", pSubjInst);
			cmd.addParameter("@P_CRSE_NUMB_INST", pCrseNumbInst);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_BEGIN_SEQNO", NNumber.class);
			cmd.addParameter("@P_END_SEQNO", NNumber.class);
				
			cmd.execute();
			pBeginSeqno.val = cmd.getParameterValue("@P_BEGIN_SEQNO", NNumber.class);
			pEndSeqno.val = cmd.getParameterValue("@P_END_SEQNO", NNumber.class);


		}
		
		public static void pInsertTramDrtm(NNumber pidm,NString dcmtSeqno,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRAM_DRTM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
		public static void pInsertTramDrtmRetained(NNumber pidm,NString dcmtSeqno,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRAM_DRTM_RETAINED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
		public static void pInsertTramTerm(NNumber pidm,NString dcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRAM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
				
			cmd.execute();


		}
		
		public static void pInsertTramTermRetained(NNumber pidm,NString dcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRAM_TERM_RETAINED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
				
			cmd.execute();


		}
		
		public static void pInsertTrtkDrtm(NNumber pidm,NString dcmtSeqno,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRTK_DRTM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
		public static void pInsertTrtkDrtmRetained(NNumber pidm,NString dcmtSeqno,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRTK_DRTM_RETAINED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
		public static void pInsertTrtkTerm(NNumber pidm,NString dcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRTK_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
				
			cmd.execute();


		}
		
		public static void pInsertTrtkTermRetained(NNumber pidm,NString dcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_INSERT_TRTK_TERM_RETAINED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
				
			cmd.execute();


		}
		
		public static void pLoad1ap(NNumber pidm,NString dcmtSeqno,NString sbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKITRE.P_LOAD_1AP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCMT_SEQNO", dcmtSeqno);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
				
			cmd.execute();


		}
		
	
	
	
}
