package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkpxim {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static DataCursor fCodeCv(NString pTableNameIn,NString pColumnListIn,NString pCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_CODE_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE_NAME_IN", pTableNameIn);
			cmd.addParameter("@P_COLUMN_LIST_IN", pColumnListIn);
			cmd.addParameter("@P_CODE_IN", pCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fCodeDesc(NString pTableNameIn,NString pCodeIn,NString pAltColumnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME_IN", pTableNameIn);
			cmd.addParameter("@P_CODE_IN", pCodeIn);
			cmd.addParameter("@P_ALT_COLUMN_IN", pAltColumnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCodeExistsInd(NString pTableNameIn,NString pCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME_IN", pTableNameIn);
			cmd.addParameter("@P_CODE_IN", pCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDatImp(NString pName,NString pXml,NString pXmlFormat,NString pBanFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_DAT_IMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_XML_FORMAT", pXmlFormat);
			cmd.addParameter("@P_BAN_FORMAT", pBanFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fNextDcmtSeqno() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_NEXT_DCMT_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fNextRecvDocumentId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_NEXT_RECV_DOCUMENT_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fNumImp(NString pName,NString pXml,NString pXmlFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_NUM_IMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_XML_FORMAT", pXmlFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fStrImp(NString pName,NNumber pLen,NString pStr,NString pTruncate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_STR_IMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LEN", pLen);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_TRUNCATE", pTruncate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fXrfImp(NString pName,NString pXref,NString pXml,NString pQlfr,NString pNullableXref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.F_XRF_IMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_XREF", pXref);
			cmd.addParameter("@P_XML", pXml);
			cmd.addParameter("@P_QLFR", pQlfr);
			cmd.addParameter("@P_NULLABLE_XREF", pNullableXref);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildError(NString pErrorname,NString pTran,NString pXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.P_BUILD_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_TRAN", pTran);
			cmd.addParameter("@P_XML", pXml);
				
			cmd.execute();


		}
		
		public static void pSetErrorContext(NString pPackageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.P_SET_ERROR_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
				
			cmd.execute();


		}
		
		public static void pUpdateDocumentImage(NNumber pDcmtSeqnoIn,NString pDcmtImageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.P_UPDATE_DOCUMENT_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_DCMT_IMAGE_IN", pDcmtImageIn);
				
			cmd.execute();


		}
		
		public static void pUpdateImportStatus(NString pDocumentidIn,NString pSourceOrgIdValueIn,NString pSourceOrgIdTypeIn,NString pDocStatus,NString pDocErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXIM.P_UPDATE_IMPORT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOCUMENTID_IN", pDocumentidIn);
			cmd.addParameter("@P_SOURCE_ORG_ID_VALUE_IN", pSourceOrgIdValueIn);
			cmd.addParameter("@P_SOURCE_ORG_ID_TYPE_IN", pSourceOrgIdTypeIn);
			cmd.addParameter("@P_DOC_STATUS", pDocStatus);
			cmd.addParameter("@P_DOC_ERROR_MESSAGE", pDocErrorMessage);
				
			cmd.execute();


		}
		
	
	
	
}
