package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsExpfil {
		public static void addElementaryAttribute(NString attrSet,NString attrName,NString attrType,NString attrDefvl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATTR_SET", attrSet);
			cmd.addParameter("@ATTR_NAME", attrName);
			cmd.addParameter("@ATTR_TYPE", attrType);
			cmd.addParameter("@ATTR_DEFVL", attrDefvl);
				
			cmd.execute();


		}
		
//		public static void addElementaryAttribute(NString attrSet,NString attrName, tabAlias) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATTR_SET", attrSet);
//			cmd.addParameter("@ATTR_NAME", attrName);
//			cmd.addParameter("@TAB_ALIAS", tabAlias);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void addElementaryAttribute(NString attrSet,NString attrName,NString attrType, textPref) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.ADD_ELEMENTARY_ATTRIBUTE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATTR_SET", attrSet);
//			cmd.addParameter("@ATTR_NAME", attrName);
//			cmd.addParameter("@ATTR_TYPE", attrType);
//			cmd.addParameter("@TEXT_PREF", textPref);
//				
//			cmd.execute();
//
//
//		}
	
		public static void addFunctions(NString attrSet,NString funcsName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.ADD_FUNCTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATTR_SET", attrSet);
			cmd.addParameter("@FUNCS_NAME", funcsName);
				
			cmd.execute();


		}
		
		public static void assignAttributeSet(NString attrSet,NString exprTab,NString exprCol,NString force) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.ASSIGN_ATTRIBUTE_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATTR_SET", attrSet);
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
			cmd.addParameter("@FORCE", force);
				
			cmd.execute();


		}
		
		public static void buildExceptionsTable(NString exceptionTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.BUILD_EXCEPTIONS_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXCEPTION_TAB", exceptionTab);
				
			cmd.execute();


		}
		
		public static void clearExprsetStats(NString exprTab,NString exprCol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.CLEAR_EXPRSET_STATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
				
			cmd.execute();


		}
		
		public static void copyAttributeSet(NString fromSet,NString toSet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.COPY_ATTRIBUTE_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FROM_SET", fromSet);
			cmd.addParameter("@TO_SET", toSet);
				
			cmd.execute();


		}
		
		public static void createAttributeSet(NString attrSet,NString fromType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.CREATE_ATTRIBUTE_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATTR_SET", attrSet);
			cmd.addParameter("@FROM_TYPE", fromType);
				
			cmd.execute();


		}
		
//		public static void defaultIndexParameters(NString attrSet,List<ExfAttributeListRow> attrList,NString operation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.DEFAULT_INDEX_PARAMETERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATTR_SET", attrSet);
//			// cmd.addParameter(DbTypes.getCollectionType("ATTR_LIST", "", attrList, object.class));
//			cmd.addParameter("@OPERATION", operation);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void defaultXpindexParameters(NString attrSet,NString xmltAttr,List<ExfXpathTagsRow> xptagList,NString operation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.DEFAULT_XPINDEX_PARAMETERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATTR_SET", attrSet);
//			cmd.addParameter("@XMLT_ATTR", xmltAttr);
//			// cmd.addParameter(DbTypes.getCollectionType("XPTAG_LIST", "", xptagList, object.class));
//			cmd.addParameter("@OPERATION", operation);
//				
//			cmd.execute();
//
//
//		}
		
		public static void defragIndex(NString idxName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.DEFRAG_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_NAME", idxName);
				
			cmd.execute();


		}
		
		public static void dropAttributeSet(NString attrSet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.DROP_ATTRIBUTE_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATTR_SET", attrSet);
				
			cmd.execute();


		}
		
		public static void getExprsetStats(NString exprTab,NString exprCol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.GET_EXPRSET_STATS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
				
			cmd.execute();


		}
		
		public static void grantPrivilege(NString exprTab,NString exprCol,NString privType,NString toUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.GRANT_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
			cmd.addParameter("@PRIV_TYPE", privType);
			cmd.addParameter("@TO_USER", toUser);
				
			cmd.execute();


		}
		
//		public static void indexParameters(NString exprTab,NString exprCol,List<ExfAttributeListRow> attrList,NString operation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.INDEX_PARAMETERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXPR_TAB", exprTab);
//			cmd.addParameter("@EXPR_COL", exprCol);
//			// cmd.addParameter(DbTypes.getCollectionType("ATTR_LIST", "", attrList, object.class));
//			cmd.addParameter("@OPERATION", operation);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void modifyOperatorList(NString attrSet,NString attrName,List<ExfIndexoperRow> attrOper) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.MODIFY_OPERATOR_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ATTR_SET", attrSet);
//			cmd.addParameter("@ATTR_NAME", attrName);
//			// cmd.addParameter(DbTypes.getCollectionType("ATTR_OPER", "", attrOper, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void revokePrivilege(NString exprTab,NString exprCol,NString privType,NString fromUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.REVOKE_PRIVILEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
			cmd.addParameter("@PRIV_TYPE", privType);
			cmd.addParameter("@FROM_USER", fromUser);
				
			cmd.execute();


		}
		
		public static void syncTextIndexes(NString exprTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.SYNC_TEXT_INDEXES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
				
			cmd.execute();


		}
		
		public static void unassignAttributeSet(NString exprTab,NString exprCol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.UNASSIGN_ATTRIBUTE_SET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
				
			cmd.execute();


		}
		
		public static void validateExpressions(NString exprTab,NString exprCol,NString exceptionTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.VALIDATE_EXPRESSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXPR_TAB", exprTab);
			cmd.addParameter("@EXPR_COL", exprCol);
			cmd.addParameter("@EXCEPTION_TAB", exceptionTab);
				
			cmd.execute();


		}
		
//		public static void xpindexParameters(NString exprTab,NString exprCol,NString xmltAttr,List<ExfXpathTagsRow> xptagList,NString operation) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_EXPFIL.XPINDEX_PARAMETERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXPR_TAB", exprTab);
//			cmd.addParameter("@EXPR_COL", exprCol);
//			cmd.addParameter("@XMLT_ATTR", xmltAttr);
//			// cmd.addParameter(DbTypes.getCollectionType("XPTAG_LIST", "", xptagList, object.class));
//			cmd.addParameter("@OPERATION", operation);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
