package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkpurr {
		public static void pPurchaseorder(NString poCode,NString amtorpct,NString amt1,NString amt2,NString amt3,NString amt4,NString amt5,NString asofday,NString asofmonth,NString asofyear,NString poday,NString pomonth,NString poyear,NString delday,NString delmonth,NString delyear,NString coas,NString index1,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NString coas2,NString index2,NString fund2,NString orgn2,NString acct2,NString prog2,NString actv2,NString locn2,NString coas3,NString index3,NString fund3,NString orgn3,NString acct3,NString prog3,NString actv3,NString locn3,NString coas4,NString index4,NString fund4,NString orgn4,NString acct4,NString prog4,NString actv4,NString locn4,NString coas5,NString index5,NString fund5,NString orgn5,NString acct5,NString prog5,NString actv5,NString locn5,NString vendid,NString skeleton,NString proto,NString systemwide,NString complete,NString complete2,NString buyer,NString vendaddrcode,NString vendaddrseq,NString shipcode,NString taxgroup,NString commcode,NString qty,NString unitprice,NString addamt,NString commcode2,NString qty2,NString unitprice2,NString addamt2,NString commcode3,NString qty3,NString unitprice3,NString addamt3,NString commcode4,NString qty4,NString unitprice4,NString addamt4,NString commcode5,NString qty5,NString unitprice5,NString addamt5,NString pattern,NString pattern2,NString lookupCode,NString lookupCoas,NString commdesc,NString commdesc2,NString commdesc3,NString commdesc4,NString commdesc5,NNumber maxrows,NString currcode,NString disccode,NString requestor,NString homecoas,NString homeorgn,NString vendorContact,NString vendorEmailAddr,NString attentionTo,NString commentext,NString emailaddr,NString phonectry,NString phonearea,NString phoneno,NString phonext,NString faxctry,NString faxarea,NString faxno,NString faxext,NNumber doclink,NString uoms1,NString uoms2,NString uoms3,NString uoms4,NString uoms5,NString taxgroup1,NString taxgroup2,NString taxgroup3,NString taxgroup4,NString taxgroup5,NString discamnt1,NString discamnt2,NString discamnt3,NString discamnt4,NString discamnt5,NString calledFrom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPURR.P_PURCHASEORDER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PO_CODE", poCode);
			cmd.addParameter("@AMTORPCT", amtorpct);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@AMT5", amt5);
			cmd.addParameter("@ASOFDAY", asofday);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@PODAY", poday);
			cmd.addParameter("@POMONTH", pomonth);
			cmd.addParameter("@POYEAR", poyear);
			cmd.addParameter("@DELDAY", delday);
			cmd.addParameter("@DELMONTH", delmonth);
			cmd.addParameter("@DELYEAR", delyear);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@COAS2", coas2);
			cmd.addParameter("@INDEX2", index2);
			cmd.addParameter("@FUND2", fund2);
			cmd.addParameter("@ORGN2", orgn2);
			cmd.addParameter("@ACCT2", acct2);
			cmd.addParameter("@PROG2", prog2);
			cmd.addParameter("@ACTV2", actv2);
			cmd.addParameter("@LOCN2", locn2);
			cmd.addParameter("@COAS3", coas3);
			cmd.addParameter("@INDEX3", index3);
			cmd.addParameter("@FUND3", fund3);
			cmd.addParameter("@ORGN3", orgn3);
			cmd.addParameter("@ACCT3", acct3);
			cmd.addParameter("@PROG3", prog3);
			cmd.addParameter("@ACTV3", actv3);
			cmd.addParameter("@LOCN3", locn3);
			cmd.addParameter("@COAS4", coas4);
			cmd.addParameter("@INDEX4", index4);
			cmd.addParameter("@FUND4", fund4);
			cmd.addParameter("@ORGN4", orgn4);
			cmd.addParameter("@ACCT4", acct4);
			cmd.addParameter("@PROG4", prog4);
			cmd.addParameter("@ACTV4", actv4);
			cmd.addParameter("@LOCN4", locn4);
			cmd.addParameter("@COAS5", coas5);
			cmd.addParameter("@INDEX5", index5);
			cmd.addParameter("@FUND5", fund5);
			cmd.addParameter("@ORGN5", orgn5);
			cmd.addParameter("@ACCT5", acct5);
			cmd.addParameter("@PROG5", prog5);
			cmd.addParameter("@ACTV5", actv5);
			cmd.addParameter("@LOCN5", locn5);
			cmd.addParameter("@VENDID", vendid);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@BUYER", buyer);
			cmd.addParameter("@VENDADDRCODE", vendaddrcode);
			cmd.addParameter("@VENDADDRSEQ", vendaddrseq);
			cmd.addParameter("@SHIPCODE", shipcode);
			cmd.addParameter("@TAXGROUP", taxgroup);
			cmd.addParameter("@COMMCODE", commcode);
			cmd.addParameter("@QTY", qty);
			cmd.addParameter("@UNITPRICE", unitprice);
			cmd.addParameter("@ADDAMT", addamt);
			cmd.addParameter("@COMMCODE2", commcode2);
			cmd.addParameter("@QTY2", qty2);
			cmd.addParameter("@UNITPRICE2", unitprice2);
			cmd.addParameter("@ADDAMT2", addamt2);
			cmd.addParameter("@COMMCODE3", commcode3);
			cmd.addParameter("@QTY3", qty3);
			cmd.addParameter("@UNITPRICE3", unitprice3);
			cmd.addParameter("@ADDAMT3", addamt3);
			cmd.addParameter("@COMMCODE4", commcode4);
			cmd.addParameter("@QTY4", qty4);
			cmd.addParameter("@UNITPRICE4", unitprice4);
			cmd.addParameter("@ADDAMT4", addamt4);
			cmd.addParameter("@COMMCODE5", commcode5);
			cmd.addParameter("@QTY5", qty5);
			cmd.addParameter("@UNITPRICE5", unitprice5);
			cmd.addParameter("@ADDAMT5", addamt5);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_COAS", lookupCoas);
			cmd.addParameter("@COMMDESC", commdesc);
			cmd.addParameter("@COMMDESC2", commdesc2);
			cmd.addParameter("@COMMDESC3", commdesc3);
			cmd.addParameter("@COMMDESC4", commdesc4);
			cmd.addParameter("@COMMDESC5", commdesc5);
			cmd.addParameter("@MAXROWS", maxrows);
			cmd.addParameter("@CURRCODE", currcode);
			cmd.addParameter("@DISCCODE", disccode);
			cmd.addParameter("@REQUESTOR", requestor);
			cmd.addParameter("@HOMECOAS", homecoas);
			cmd.addParameter("@HOMEORGN", homeorgn);
			cmd.addParameter("@VENDOR_CONTACT", vendorContact);
			cmd.addParameter("@VENDOR_EMAIL_ADDR", vendorEmailAddr);
			cmd.addParameter("@ATTENTION_TO", attentionTo);
			cmd.addParameter("@COMMENTEXT", commentext);
			cmd.addParameter("@EMAILADDR", emailaddr);
			cmd.addParameter("@PHONECTRY", phonectry);
			cmd.addParameter("@PHONEAREA", phonearea);
			cmd.addParameter("@PHONENO", phoneno);
			cmd.addParameter("@PHONEXT", phonext);
			cmd.addParameter("@FAXCTRY", faxctry);
			cmd.addParameter("@FAXAREA", faxarea);
			cmd.addParameter("@FAXNO", faxno);
			cmd.addParameter("@FAXEXT", faxext);
			cmd.addParameter("@DOCLINK", doclink);
			cmd.addParameter("@UOMS1", uoms1);
			cmd.addParameter("@UOMS2", uoms2);
			cmd.addParameter("@UOMS3", uoms3);
			cmd.addParameter("@UOMS4", uoms4);
			cmd.addParameter("@UOMS5", uoms5);
			cmd.addParameter("@TAXGROUP1", taxgroup1);
			cmd.addParameter("@TAXGROUP2", taxgroup2);
			cmd.addParameter("@TAXGROUP3", taxgroup3);
			cmd.addParameter("@TAXGROUP4", taxgroup4);
			cmd.addParameter("@TAXGROUP5", taxgroup5);
			cmd.addParameter("@DISCAMNT1", discamnt1);
			cmd.addParameter("@DISCAMNT2", discamnt2);
			cmd.addParameter("@DISCAMNT3", discamnt3);
			cmd.addParameter("@DISCAMNT4", discamnt4);
			cmd.addParameter("@DISCAMNT5", discamnt5);
			cmd.addParameter("@CALLED_FROM", calledFrom);
				
			cmd.execute();


		}
		
	
	
	
}
