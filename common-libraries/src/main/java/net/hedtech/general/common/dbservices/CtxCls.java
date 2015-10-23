package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxCls {
		public static void clustering(NString indexName,NString docid,NString doctabName,NString clstabName,NString prefName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_CLS.CLUSTERING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@DOCID", docid);
			cmd.addParameter("@DOCTAB_NAME", doctabName);
			cmd.addParameter("@CLSTAB_NAME", clstabName);
			cmd.addParameter("@PREF_NAME", prefName);
				
			cmd.execute();


		}
		
//		public static void clustering(NString indexName,NString docid,List<DocidTabRow> dids,Ref<List<DocTabRow>> doctabName,Ref<List<ClusterTabRow>> clstabName,NString prefName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_CLS.CLUSTERING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@DOCID", docid);
//			// cmd.addParameter(DbTypes.getTableType("DIDS", "", dids, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DOCTAB_NAME", "", doctabName.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("CLSTAB_NAME", "", clstabName.val, object.class , true));
//			cmd.addParameter("@PREF_NAME", prefName);
//				
//			cmd.execute();
//			// doctabName.val = cmd.getTableParameterValue("@DOCTAB_NAME", object.class);
//			// clstabName.val = cmd.getTableParameterValue("@CLSTAB_NAME", object.class);
//
//
//		}
		
		public static void train(NString indexName,NString docid,NString cattab,NString catdocid,NString catid,NString restab,NString rescatid,NString resquery,NString resconfid,NString preference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_CLS.TRAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@DOCID", docid);
			cmd.addParameter("@CATTAB", cattab);
			cmd.addParameter("@CATDOCID", catdocid);
			cmd.addParameter("@CATID", catid);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@RESCATID", rescatid);
			cmd.addParameter("@RESQUERY", resquery);
			cmd.addParameter("@RESCONFID", resconfid);
			cmd.addParameter("@PREFERENCE", preference);
				
			cmd.execute();


		}
		
		public static void train(NString indexName,NString docid,NString cattab,NString catdocid,NString catid,NString restab,NString preference) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_CLS.TRAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@DOCID", docid);
			cmd.addParameter("@CATTAB", cattab);
			cmd.addParameter("@CATDOCID", catdocid);
			cmd.addParameter("@CATID", catid);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@PREFERENCE", preference);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ClusterRecRow", dataSourceName="CLUSTER_REC")
	public static class ClusterRecRow
	{
		@DbRecordField(dataSourceName="CLUSTERID")
		public NNumber Clusterid;
		@DbRecordField(dataSourceName="DESCRIPT")
		public NString Descript;
		@DbRecordField(dataSourceName="LABEL")
		public NString Label;
		@DbRecordField(dataSourceName="SZE")
		public NNumber Sze;
		@DbRecordField(dataSourceName="QUALITY_SCORE")
		public NNumber QualityScore;
		@DbRecordField(dataSourceName="PARENT")
		public NNumber Parent;
	}

	
	@DbRecordType(id="DocRecRow", dataSourceName="DOC_REC")
	public static class DocRecRow
	{
		@DbRecordField(dataSourceName="DOCID")
		public NNumber Docid;
		@DbRecordField(dataSourceName="CLUSTERID")
		public NNumber Clusterid;
		@DbRecordField(dataSourceName="SCORE")
		public NNumber Score;
	}

	
	
}
