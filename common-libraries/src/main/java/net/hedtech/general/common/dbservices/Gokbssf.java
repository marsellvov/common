package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokbssf {
		public static NInteger fBinaryToInteger(NString binvalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_BINARY_TO_INTEGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@BINVALUE", binvalue);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fDecodeBase64(NString base64str) {
			return fDecodeBase64(base64str,NString.getNull());
		}
		
		public static NString fDecodeBase64(NString base64str,NString pad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_DECODE_BASE64", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BASE64STR", base64str);
			cmd.addParameter("@PAD", pad);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fDecodeBits(NString ch,NString pad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_DECODE_BITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CH", ch);
			cmd.addParameter("@PAD", pad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fEncode(NString str) {
			
			return fEncode(str,NString.getNull());

		}
		
		public static NString fEncode(NString str,NString pad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STR", str);
			cmd.addParameter("@PAD", pad);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncodeBits(NString binval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_ENCODE_BITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BINVAL", binval);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fHexToInteger(NString h) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_HEX_TO_INTEGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@H", h);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fIntegerToBinary(NInteger valInt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_INTEGER_TO_BINARY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VAL_INT", valInt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIntegerToHex(NInteger n,NNumber currlevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.F_INTEGER_TO_HEX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@N", n);
			cmd.addParameter("@CURRLEVEL", currlevel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEncodePos1(NString charac,Ref<NString> res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.P_ENCODE_POS1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHARAC", charac);
			cmd.addParameter("@RES", res, true);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", NString.class);


		}
		
		public static void pEncodePos2(NString c1,NString c2,Ref<NString> res) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.P_ENCODE_POS2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C1", c1);
			cmd.addParameter("@C2", c2);
			cmd.addParameter("@RES", res, true);
				
			cmd.execute();
			res.val = cmd.getParameterValue("@RES", NString.class);


		}
		
		public static void pLeftshift(byte[] rawin,NNumber shift,Ref<NString> str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.P_LEFTSHIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RAWIN", rawin);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@STR", str, true);
				
			cmd.execute();
			str.val = cmd.getParameterValue("@STR", NString.class);


		}
		
		public static void pRightshift(byte[] rawin,NNumber shift,Ref<NString> str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKBSSF.P_RIGHTSHIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RAWIN", rawin);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@STR", str, true);
				
			cmd.execute();
			str.val = cmd.getParameterValue("@STR", NString.class);


		}
		
	
	
	
}
