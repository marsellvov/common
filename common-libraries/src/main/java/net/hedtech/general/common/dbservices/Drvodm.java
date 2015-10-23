package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Drvodm {
	
//		public static List<FeaturesRow> featureExplain(NString restab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FEATURE_EXPLAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FeaturesRow>.class);
//			cmd.addParameter("@RESTAB", restab);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FeaturesRow>.class);
//
//		}
		
//		public static List<TrainsampsRow> featurePrep(NString indexName,NString docid,NString cattab,NString catdocid,NString catid,NString restab,NString preference) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FEATURE_PREP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<TrainsampsRow>.class);
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@DOCID", docid);
//			cmd.addParameter("@CATTAB", cattab);
//			cmd.addParameter("@CATDOCID", catdocid);
//			cmd.addParameter("@CATID", catid);
//			cmd.addParameter("@RESTAB", restab);
//			cmd.addParameter("@PREFERENCE", preference);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<TrainsampsRow>.class);
//
//		}
		
//		public static List<TrainsampsRow> featurePrep(NString indexName,NString docid,NString restab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FEATURE_PREP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<TrainsampsRow>.class);
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@DOCID", docid);
//			cmd.addParameter("@RESTAB", restab);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<TrainsampsRow>.class);
//
//		}
		
//		public static List<TrainsampsRow> featurePrepNc(NString idxOwner,NString idxName,NString doctab,NString docid,NString cattab,NString catdocid,NString catid,NString restab,NNumber prefid,NString tempTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FEATURE_PREP_NC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<TrainsampsRow>.class);
//			cmd.addParameter("@IDX_OWNER", idxOwner);
//			cmd.addParameter("@IDX_NAME", idxName);
//			cmd.addParameter("@DOCTAB", doctab);
//			cmd.addParameter("@DOCID", docid);
//			cmd.addParameter("@CATTAB", cattab);
//			cmd.addParameter("@CATDOCID", catdocid);
//			cmd.addParameter("@CATID", catid);
//			cmd.addParameter("@RESTAB", restab);
//			cmd.addParameter("@PREFID", prefid);
//			cmd.addParameter("@TEMP_TABLE", tempTable);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<TrainsampsRow>.class);
//
//		}
		
		public static void fi2ttab(Ref<NString> fi2ttab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FI2TTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FI2TTAB", NString.class);
				
			cmd.execute();
			fi2ttab.val = cmd.getParameterValue("@FI2TTAB", NString.class);


		}
		
		public static void fvstab(Ref<NString> fvstab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.FVSTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FVSTAB", NString.class);
				
			cmd.execute();
			fvstab.val = cmd.getParameterValue("@FVSTAB", NString.class);


		}
		
//		public static List<TrainsampsRow> FgetFeatures() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.GET_FEATURES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<TrainsampsRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<TrainsampsRow>.class);
//
//		}
		
//		public static List<SuggestionsRow> FgetSuggestions(NString modelName,NNumber dur) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.GET_SUGGESTIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SuggestionsRow>.class);
//			cmd.addParameter("@MODEL_NAME", modelName);
//			cmd.addParameter("@DUR", dur);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SuggestionsRow>.class);
//
//		}
		
		public static void odmDrpmodel(NString pModname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.ODM_DRPMODEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODNAME", pModname);
				
			cmd.execute();


		}
		
		public static void odmGenmodel(NString pFvstab,NString pSrtab,NNumber pClusterNum,Ref<NString> oModname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.ODM_GENMODEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FVSTAB", pFvstab);
			cmd.addParameter("@P_SRTAB", pSrtab);
			cmd.addParameter("@P_CLUSTER_NUM", pClusterNum);
			cmd.addParameter("@O_MODNAME", NString.class);
				
			cmd.execute();
			oModname.val = cmd.getParameterValue("@O_MODNAME", NString.class);


		}
		
//		public static List<KmeanmodelRow> FodmReadkmeanmodel(NString pModname) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.ODM_READKMEANMODEL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<KmeanmodelRow>.class);
//			cmd.addParameter("@P_MODNAME", pModname);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<KmeanmodelRow>.class);
//
//		}
		
//		public static List<SettingTRow> Fodmktrainset(NString pSrt,NNumber pClusterNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.ODMKTRAINSET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SettingTRow>.class);
//			cmd.addParameter("@P_SRT", pSrt);
//			cmd.addParameter("@P_CLUSTER_NUM", pClusterNum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SettingTRow>.class);
//
//		}
		
//		public static List<SettingTRow> Fodmtrainset() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.ODMTRAINSET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SettingTRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SettingTRow>.class);
//
//		}
		
		public static void svmTrain(NString idxOwner,NString idxName,NString doctab,NString docid,NString cattab,NString catdocid,NString catid,NString restab,NNumber prefid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DRVODM.SVM_TRAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IDX_OWNER", idxOwner);
			cmd.addParameter("@IDX_NAME", idxName);
			cmd.addParameter("@DOCTAB", doctab);
			cmd.addParameter("@DOCID", docid);
			cmd.addParameter("@CATTAB", cattab);
			cmd.addParameter("@CATDOCID", catdocid);
			cmd.addParameter("@CATID", catid);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@PREFID", prefid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FeatureRow", dataSourceName="FEATURE")
	public static class FeatureRow
	{
		@DbRecordField(dataSourceName="TEXT")
		public NString Text;
		@DbRecordField(dataSourceName="TYPE")
		public NNumber Type;
		@DbRecordField(dataSourceName="ID")
		public NNumber Id;
		@DbRecordField(dataSourceName="SCORE")
		public NNumber Score;
	}

	
	@DbRecordType(id="KmeanmodelRecRow", dataSourceName="KMEANMODEL_REC")
	public static class KmeanmodelRecRow
	{
		@DbRecordField(dataSourceName="ID")
		public NNumber Id;
		@DbRecordField(dataSourceName="PARENT")
		public NNumber Parent;
		@DbRecordField(dataSourceName="DISPERSION")
		public NNumber Dispersion;
		@DbRecordField(dataSourceName="ATTRIBUTE_NAME")
		public NString AttributeName;
	}

	
	@DbRecordType(id="SettingdbrecTRow", dataSourceName="SETTINGDBREC_T")
	public static class SettingdbrecTRow
	{
		@DbRecordField(dataSourceName="ID")
		public NNumber Id;
		@DbRecordField(dataSourceName="VALUE")
		public NString Value;
	}

	
	@DbRecordType(id="SuggestionRow", dataSourceName="SUGGESTION")
	public static class SuggestionRow
	{
		@DbRecordField(dataSourceName="DOCID")
		public NNumber Docid;
		@DbRecordField(dataSourceName="CATID")
		public NNumber Catid;
		@DbRecordField(dataSourceName="SCR")
		public NNumber Scr;
	}

	
	@DbRecordType(id="TrainsampRow", dataSourceName="TRAINSAMP")
	public static class TrainsampRow
	{
		@DbRecordField(dataSourceName="SEQUENCE_ID")
		public NNumber SequenceId;
		@DbRecordField(dataSourceName="ATTRIBUTE_ID")
		public NNumber AttributeId;
		@DbRecordField(dataSourceName="VALUE")
		public NNumber Value;
	}

	
	
}
