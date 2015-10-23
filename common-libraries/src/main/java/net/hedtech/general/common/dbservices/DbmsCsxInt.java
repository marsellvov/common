package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsCsxInt {
		public static void createtokentables(byte[] guid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.CREATETOKENTABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GUID", guid);
				
			cmd.execute();


		}
		
//		public static  Fgetcompiledschema(NString schemaurl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETCOMPILEDSCHEMA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SCHEMAURL", schemaurl);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetcompiledschemabyid(byte[] schemaoid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETCOMPILEDSCHEMABYID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SCHEMAOID", schemaoid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetcsxschema( schemadoc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETCSXSCHEMA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@SCHEMADOC", schemadoc);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetvocabulary(NInteger vocabid,NInteger vocabtype,byte[] rguid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETVOCABULARY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@VOCABID", vocabid);
//			cmd.addParameter("@VOCABTYPE", vocabtype);
//			cmd.addParameter("@RGUID", rguid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetvocabularyfromtoken(NString token,NInteger isattr,NInteger nmspcid,NInteger tokentype,byte[] rguid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETVOCABULARYFROMTOKEN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@TOKEN", token);
//			cmd.addParameter("@ISATTR", isattr);
//			cmd.addParameter("@NMSPCID", nmspcid);
//			cmd.addParameter("@TOKENTYPE", tokentype);
//			cmd.addParameter("@RGUID", rguid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetvocabularyfromtokennotxn(Ref<NInteger> isgen,NString token,NInteger isattr,NInteger nmspcid,NInteger tokentype,byte[] rguid,NInteger tocreate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETVOCABULARYFROMTOKENNOTXN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@ISGEN", NInteger.class);
//			cmd.addParameter("@TOKEN", token);
//			cmd.addParameter("@ISATTR", isattr);
//			cmd.addParameter("@NMSPCID", nmspcid);
//			cmd.addParameter("@TOKENTYPE", tokentype);
//			cmd.addParameter("@RGUID", rguid);
//			cmd.addParameter("@TOCREATE", tocreate);
//				
//			cmd.execute();
//			isgen.val = cmd.getParameterValue("@ISGEN", NInteger.class);
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetvocabularynotxn(NInteger vocabid,NInteger vocabtype,byte[] rguid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.GETVOCABULARYNOTXN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@VOCABID", vocabid);
//			cmd.addParameter("@VOCABTYPE", vocabtype);
//			cmd.addParameter("@RGUID", rguid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void locktokenmanager(byte[] rguid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.LOCKTOKENMANAGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RGUID", rguid);
				
			cmd.execute();


		}
		
		public static void populatekdsofromguid(byte[] guid,NString toksuf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.POPULATEKDSOFROMGUID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GUID", guid);
			cmd.addParameter("@TOKSUF", toksuf);
				
			cmd.execute();


		}
		
//		public static void populatetokentableset( data,byte[] rguid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.POPULATETOKENTABLESET", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@RGUID", rguid);
//				
//			cmd.execute();
//
//
//		}
		
		public static void registertoken(NString tab,NNumber nmspcid,NString local,NNumber flags,NNumber id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.REGISTERTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@NMSPCID", nmspcid);
			cmd.addParameter("@LOCAL", local);
			cmd.addParameter("@FLAGS", flags);
			cmd.addParameter("@ID", id);
				
			cmd.execute();


		}
		
		public static void registertoken(NString tab,NString nmspcuri,NNumber id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.REGISTERTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB", tab);
			cmd.addParameter("@NMSPCURI", nmspcuri);
			cmd.addParameter("@ID", id);
				
			cmd.execute();


		}
		
//		public static NString Ftestdecodejc(BLOB blobdoc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.TESTDECODEJC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@BLOBDOC", blobdoc);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static BLOB Ftestencodejc(NString clobdoc,NString schemaurl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.TESTENCODEJC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(BLOB.class);
//			cmd.addParameter("@CLOBDOC", clobdoc);
//			cmd.addParameter("@SCHEMAURL", schemaurl);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(BLOB.class);
//
//		}
//		
		public static NInteger Ftovalidate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.TOVALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void updatemastertable(NString _name,NString schema,NNumber level,byte[] guid,NString toksuf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_CSX_INT.UPDATEMASTERTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@SCHEMA", schema);
			cmd.addParameter("@LEVEL", level);
			cmd.addParameter("@GUID", guid);
			cmd.addParameter("@TOKSUF", toksuf);
				
			cmd.execute();


		}
		
	
	
	
}
