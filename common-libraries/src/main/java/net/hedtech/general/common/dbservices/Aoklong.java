package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aoklong {
//		public static NNumber fInlongAdrconf( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_ADRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAgrgaux( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AGRGAUX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAgrpaux( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AGRPAUX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAgrpcon( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AGRPCON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAmbprop( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AMBPROP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAmrconf( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AMRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAmrcont( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AMRCONT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAmrpusr( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AMRPUSR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAprchld( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_APRCHLD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAprconf( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_APRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAprehis( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_APREHIS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NNumber fInlongAubinst( rowIn,NString cmpIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_INLONG_AUBINST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//			cmd.addParameter("@CMP_IN", cmpIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
//		
//		public static NString fLongtocharAdrconf( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_ADRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAgrgaux( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AGRGAUX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAgrpaux( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AGRPAUX", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAgrpcon( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AGRPCON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAmbprop( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AMBPROP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAmrconf( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AMRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAmrcont( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AMRCONT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAmrpusr( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AMRPUSR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAprchld( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_APRCHLD", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAprconf( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_APRCONF", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAprehis( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_APREHIS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString fLongtocharAubinst( rowIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLONG.F_LONGTOCHAR_AUBINST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@ROW_IN", rowIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//	
	
	
}
