package net.hedtech.general.common.libraries.Webutil;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;


public class Delimstr extends AbstractSupportCodeObject {
	

	public Delimstr(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) DELIMSTR
	/*
	PACKAGE DelimStr IS
<multilinecomment>********************************************************************************\
 * DELIMSTR
 *   A series of handy functions for Parsing and handling delimited strings
 *   e.g. comma separated values 
 *   in the format <field1><delimiter><field2><delimiter> etc.
 *   The delimiter will default to a comma if not specified
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   DRMILLS 23/DEC/2002 - Creation
 *
\********************************************************************************</multilinecomment> 

  <multilinecomment>*
   * Functions are:
   *         COUNTER     -> Returns the number of "fields" in the string
   *        PUT        -> Adds (or replaces) a Number, string or date 
   *                to the string at the specified position
   *                (dates are stored with full precision)
   *        GETSTRING-> Returns the String value of the nth field
   *        GETNUMBER-> Returns the number value of the nth field
   *        GETDATE  -> Returns the Date value of the nth field
   *        LOCATE   -> Returns the Field number of a particular 
   *                String
   * All the functions are overloaded where required
  \*-----------------------------------------------------------------</multilinecomment>
 
  function  Counter(   Source_string     in varchar2,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',') return number;
  Procedure Put    (   Source_string     in out varchar2,
                       String_to_add     in varchar2,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  Procedure Put    (   Source_string     in out varchar2,
                       number_to_add     in number,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  Procedure Put    (   Source_string     in out varchar2,
                       Date_to_add     in date,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  Procedure PutString( Source_string     in out varchar2,
                       String_to_add     in varchar2,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  Procedure PutNumber( Source_string     in out varchar2,
                       number_to_add     in number,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  Procedure PutDate(   Source_string     in out varchar2,
                       Date_to_add     in date,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',');
  function  GetString( Source_string    in varchar2,
                       Field_position     in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',') return varchar2;
  function  GetNumber( Source_string    in varchar2,
                       Field_position in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',') return number;
  function  GetDate(   Source_string    in varchar2,
                       Field_position in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter     in varchar2 default ',') return date;
  function  Locate(    Source_string    in varchar2,
                       Search_String    in varchar2,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter    in varchar2 default ',') return number;
  function  Locate(    Source_string    in varchar2,
                       Search_date    in date,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter    in varchar2 default ',') return number;
  function  Locate(    Source_string    in varchar2,
                       Search_number    in number,
                       UnTerminated    in Boolean  default FALSE,
                       Delimiter    in varchar2 default ',') return number;
END DelimStr;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) DELIMSTR
		/*
		PACKAGE BODY DelimStr IS
  function  Counter(Source_string     in varchar2,
                    UnTerminated      in Boolean default FALSE,
                    Delimiter         in varchar2 default ',') return number is
    iModifier    pls_integer := 0;
    iOldSize    pls_integer := length(Source_string);
    db3    pls_integer;
    db2    NUMBER;   -- DCN change to number
    db1    varchar2(32000);
  begin
      if Unterminated then iModifier := 1; end if;
      db1 := replace(Source_string,Delimiter);
      db2 := length(db1);
      db3 := (iOldSize - db2) + iModifier;
      return db3; 
  end Counter;

  Procedure PutString   (Source_string     in out varchar2,
                         String_to_add     in varchar2,
                         Field_position    in number,
                         UnTerminated      in Boolean  default FALSE,
                         Delimiter         in varchar2 default ',') is
    iStrLen        NUMBER := length(Source_String);
    iStrFragLen    NUMBER := Length(String_to_add);
    iPtrStart    NUMBER := 0;
    iPtrEnd        NUMBER := 0;
    vcSepBuffer    varchar2(2000);
    iCounter    NUMBER;
  begin
    -- 1. is the string Zero Length?
    if iStrLen = 0 then
      if Field_Position > 1 then 
        for iCounter in 2..Field_Position loop
          vcSepBuffer := vcSepBuffer||Delimiter;
        end loop;
      end if;
      Source_string := vcSepBuffer||String_to_add;
      if Not UnTerminated then 
        Source_string := Source_String||Delimiter;
        iStrLen          := length(Source_string);
      end if;
    else            
    -- 2. Cope with unterminated strings 
      if UnTerminated then 
          Source_string := Source_string||Delimiter;
      end if;
    -- 3. Locate the nth-1 separator
      if Field_Position > 1 then 
        LOOP
          iPtrStart := (instr(Source_string||vcSepBuffer,Delimiter,1,Field_Position-1)-1) + length(Delimiter);
          EXIT when iPtrStart > 0;
          vcSepBuffer    := vcSepBuffer||Delimiter;
        END LOOP;
        if vcSepBuffer is not null then     
          iPtrEnd := iStrLen;
        else 
          iPtrEnd := instr(Source_string,Delimiter,1,Field_Position);
          if iPtrEnd = 0 then 
              iPtrEnd := iStrLen;
          end if;
        end if;
      else     iPtrStart := 0;
        iPtrEnd := instr(Source_string,Delimiter,1,Field_Position);
        if iPtrEnd = 0 then 
            iPtrEnd := iStrLen;
        end if;
      end if;
    -- 3. Rebuild the string
      Source_string := substr(Source_string,1,iPtrStart)||vcSepBuffer||
                              String_to_add||Delimiter||substr(Source_string,iPtrEnd+length(Delimiter));
    -- 4. Sort out termination
      if UnTerminated then 
          Source_string := substr(Source_String,1,(length(Source_string)-length(Delimiter)));
      end if;
    end if;
  end PutString;

  Procedure PutNumber   (Source_string     in out varchar2,
                         number_to_add     in number,
                         Field_position    in number,
                         UnTerminated      in Boolean  default FALSE,
                         Delimiter         in varchar2 default ',') is
    
  begin
    -- 1. Just do datatype conversions and call the varchar2 varsion of put..
    DelimStr.PutString(Source_string, to_char(number_to_add), Field_position, UnTerminated, Delimiter);
  end PutNumber;

  Procedure PutDate   (Source_string     in out varchar2,
                       Date_to_add       in date,
                       Field_position    in number,
                       UnTerminated      in Boolean  default FALSE,
                       Delimiter         in varchar2 default ',') is

  begin
    -- 1. Just do datatype conversions and call the varchar2 varsion of put..
    DelimStr.PutString(Source_string, to_char(date_to_add,'DD-MON-YYYY HH24:MI:SS'), Field_position, UnTerminated, Delimiter);
  end PutDate;

  -- Overloaded versions of the "Puts"
  Procedure Put   (Source_string     in out varchar2,
                   String_to_add     in varchar2,
                   Field_position    in number,
                   UnTerminated      in Boolean  default FALSE,
                   Delimiter         in varchar2 default ',') is
  begin
    -- 1. Just do datatype conversions and call the varchar2 varsion of put..
    DelimStr.PutString(Source_string, string_to_add, Field_position, UnTerminated, Delimiter);
  end Put;

  Procedure Put   (Source_string     in out varchar2,
                   number_to_add     in number,
                   Field_position    in number,
                   UnTerminated      in Boolean  default FALSE,
                   Delimiter         in varchar2 default ',') is
  begin
    -- 1. Just do datatype conversions and call the varchar2 varsion of put..
    DelimStr.PutString(Source_string, to_char(number_to_add), Field_position, UnTerminated, Delimiter);
  end Put;

  Procedure Put   (Source_string     in out varchar2,
                   Date_to_add       in date,
                   Field_position    in number,
                   UnTerminated      in Boolean  default FALSE,
                   Delimiter         in varchar2 default ',') is
  begin
    -- 1. Just do datatype conversions and call the varchar2 varsion of put..
    DelimStr.PutString(Source_string, to_char(date_to_add,'DD-MON-YYYY HH24:MI:SS'), Field_position, UnTerminated, Delimiter);
  end Put;


  function  GetString (Source_string    in varchar2,
                       Field_position   in number,
                       UnTerminated     in Boolean  default FALSE,
                       Delimiter        in varchar2 default ',') return varchar2 is
                       iPtrEnd          pls_integer     := 0;
                       iPtrStart        pls_integer     := 0;
                       vcSourceStrCopy  varchar2(32000)     := Source_string;
  begin
    if UnTerminated then 
      vcSourceStrCopy := vcSourceStrCopy||Delimiter;
    end if;

    if Field_Position > 1 then 
      iPtrStart := instr(vcSourceStrCopy,Delimiter,1,Field_Position-1)+ length(Delimiter);
    else
      iPtrStart := 1;
    end if ; 

    iPtrEnd     := instr(vcSourceStrCopy,Delimiter,1,Field_Position);
    return substr(vcSourceStrCopy,iPtrStart,(iPtrEnd-iPtrStart));
  end GetString; <multilinecomment> String Version </multilinecomment>

    
  function  GetNumber (Source_string    in varchar2,
                       Field_position   in number,
                       UnTerminated     in Boolean  default FALSE,
                       Delimiter        in varchar2 default ',') return number is
                       iRc              pls_integer;
  begin 
    Return to_number(GetString(Source_string, Field_Position, UnTerminated, Delimiter));
  end GetNumber; <multilinecomment> Number Version </multilinecomment>

  function  GetDate (Source_string    in varchar2,
                     Field_position   in number,
                     UnTerminated     in Boolean  default FALSE,
                     Delimiter        in varchar2 default ',') return date is
  begin 
    return to_date(GetString(Source_string, Field_Position, UnTerminated, Delimiter),'DD-MON-YYYY HH24:MI:SS');
  end GetDate; <multilinecomment> Date Version </multilinecomment>

  function  Locate  (Source_string    in varchar2,
                     Search_String    in varchar2,
                     UnTerminated     in Boolean  default FALSE,
                     Delimiter        in varchar2 default ',') return number is 
                     iHit             pls_integer := 0;
                     iCounter         pls_integer;
                     vcCompare        varchar2(32000);
  begin 
    for iCounter in 1..Counter(Source_String, UnTerminated, Delimiter) LOOP
      if GetString(Source_String,iCounter, UnTerminated, Delimiter) = Search_String then 
          iHit := iCounter;
          Exit;
      end if;
    end loop;
    Return iHit;
  end Locate;

  function  Locate(Source_string    in varchar2,
                   Search_date      in date,
                   UnTerminated     in Boolean  default FALSE,
                   Delimiter        in varchar2 default ',') return number is
  begin
    return Locate( Source_string, to_char(Search_date,'DD-MON-YYYY HH24:MI:SS'), UnTerminated, Delimiter);
  end Locate; <multilinecomment> Date Version </multilinecomment>

  function  Locate(Source_string    in varchar2,
                   Search_number    in number,
                   UnTerminated     in Boolean  default FALSE,
                   Delimiter        in varchar2 default ',') return number is
  begin
    return Locate( Source_string, to_char(Search_number), UnTerminated, Delimiter);
  end Locate; <multilinecomment> Number Version </multilinecomment>

END DelimStr; <multilinecomment> Body </multilinecomment>
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		*/
		public NNumber counter(NString sourceString) {
			return counter(sourceString, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param unterminated
		*/
		public NNumber counter(NString sourceString, NBool unterminated) {
			return counter(sourceString, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param unterminated
		* @param delimiter
		*/
		public NNumber counter(NString sourceString, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger imodifier = toInt(0);
//			NInteger ioldsize = length(sourceString);
//			NInteger db3= NInteger.getNull();
//			NNumber db2= NNumber.getNull();
//			//  DCN change to number
//			NString db1= NString.getNull();
//			if ( unterminated.getValue() )
//			{
//				imodifier = toInt(1);
//			}
//			db1 = replace(sourceString, delimiter);
//			db2 = toNumber(length(db1));
//			db3 = toInt((ioldsize.subtract(db2)).add(imodifier));
//			return db3;
//
			this.getLogger().trace(this, "F2J : counter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		*/
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition) {
			putstring(sourceString, stringToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition, NBool unterminated) {
			putstring(sourceString, stringToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NNumber istrlen = length(sourceString.val);
//			NNumber istrfraglen = length(stringToAdd);
//			NNumber iptrstart = toNumber(0);
//			NNumber iptrend = toNumber(0);
//			NString vcsepbuffer= NString.getNull();
//			NNumber icounter= NNumber.getNull();
//			//  1. is the string Zero Length?
//			if ( istrlen.equals(0) )
//			{
//				if ( fieldPosition.greater(1) )
//				{
//					for ( icounter = 2; icounter <= fieldPosition; icounter+= 1 )
//					{
//						vcsepbuffer = vcsepbuffer.append(delimiter);
//					}
//				}
//				sourceString.val = vcsepbuffer.append(stringToAdd);
//				if ( unterminated.not() )
//				{
//					sourceString.val = sourceString.val.append(delimiter);
//					istrlen = toNumber(length(sourceString.val));
//				}
//			}
//			else {
//				//  2. Cope with unterminated strings 
//				if ( unterminated.getValue() )
//				{
//					sourceString.val = sourceString.val.append(delimiter);
//				}
//				//  3. Locate the nth-1 separator
//				if ( fieldPosition.greater(1) )
//				{
//					while (true) {
//						iptrstart = toNumber((inStr(sourceString.val.append(vcsepbuffer), delimiter, toInt(1), toInt(fieldPosition.subtract(1))).subtract(1)).add(length(delimiter)));
//						if ( iptrstart.greater(0) ) 
//							break;
//						vcsepbuffer = vcsepbuffer.append(delimiter);
//					}
//					if ( !vcsepbuffer.isNull() )
//					{
//						iptrend = istrlen;
//					}
//					else {
//						iptrend = toNumber(inStr(sourceString.val, delimiter, toInt(1), toInt(fieldPosition)));
//						if ( iptrend.equals(0) )
//						{
//							iptrend = istrlen;
//						}
//					}
//				}
//				else {
//					iptrstart = toNumber(0);
//					iptrend = toNumber(inStr(sourceString.val, delimiter, toInt(1), toInt(fieldPosition)));
//					if ( iptrend.equals(0) )
//					{
//						iptrend = istrlen;
//					}
//				}
//				//  3. Rebuild the string
//				sourceString.val = substring(sourceString.val, toInt(1), toInt(iptrstart)).append(vcsepbuffer).append(stringToAdd).append(delimiter).append(substring(sourceString.val, toInt(iptrend.add(length(delimiter)))));
//				//  4. Sort out termination
//				if ( unterminated.getValue() )
//				{
//					sourceString.val = substring(sourceString.val, toInt(1), ((length(sourceString.val).subtract(length(delimiter)))));
//				}
//			}
//
			this.getLogger().trace(this, "F2J : putstring procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		*/
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition) {
			putnumber(sourceString, numberToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition, NBool unterminated) {
			putnumber(sourceString, numberToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  1. Just do datatype conversions and call the varchar2 varsion of put..
//			putstring(sourceString, toChar(numberToAdd), fieldPosition, unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : putnumber procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		*/
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition) {
			putdate(sourceString, dateToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition, NBool unterminated) {
			putdate(sourceString, dateToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  1. Just do datatype conversions and call the varchar2 varsion of put..
//			putstring(sourceString, toChar(dateToAdd, "DD-MON-YYYY HH24:MI:SS"), fieldPosition, unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : putdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Overloaded versions of the "Puts"
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition) {
			put(sourceString, stringToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		*  Overloaded versions of the "Puts"
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void put(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition, NBool unterminated) {
			put(sourceString, stringToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		*  Overloaded versions of the "Puts"
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void put(Ref<NString> sourceString, NString stringToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  1. Just do datatype conversions and call the varchar2 varsion of put..
//			putstring(sourceString, stringToAdd, fieldPosition, unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition) {
			put(sourceString, numberToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition, NBool unterminated) {
			put(sourceString, numberToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  1. Just do datatype conversions and call the varchar2 varsion of put..
//			putstring(sourceString, toChar(numberToAdd), fieldPosition, unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition) {
			put(sourceString, dateToAdd, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void put(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition, NBool unterminated) {
			put(sourceString, dateToAdd, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public void put(Ref<NString> sourceString, NDate dateToAdd, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  1. Just do datatype conversions and call the varchar2 varsion of put..
//			putstring(sourceString, toChar(dateToAdd, "DD-MON-YYYY HH24:MI:SS"), fieldPosition, unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : put procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		*/
		public NString getstring(NString sourceString, NNumber fieldPosition) {
			return getstring(sourceString, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		*/
		public NString getstring(NString sourceString, NNumber fieldPosition, NBool unterminated) {
			return getstring(sourceString, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public NString getstring(NString sourceString, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger iptrend = toInt(0);
//			NInteger iptrstart = toInt(0);
//			NString vcsourcestrcopy = sourceString;
//			if ( unterminated.getValue() )
//			{
//				vcsourcestrcopy = vcsourcestrcopy.append(delimiter);
//			}
//			if ( fieldPosition.greater(1) )
//			{
//				iptrstart = inStr(vcsourcestrcopy, delimiter, toInt(1), toInt(fieldPosition.subtract(1))).add(length(delimiter));
//			}
//			else {
//				iptrstart = toInt(1);
//			}
//			iptrend = inStr(vcsourcestrcopy, delimiter, toInt(1), toInt(fieldPosition));
//			return substring(vcsourcestrcopy, iptrstart, ((iptrend.subtract(iptrstart))));
//
			this.getLogger().trace(this, "F2J : getstring function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  String Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		*/
		public NNumber getnumber(NString sourceString, NNumber fieldPosition) {
			return getnumber(sourceString, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		*  String Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		*/
		public NNumber getnumber(NString sourceString, NNumber fieldPosition, NBool unterminated) {
			return getnumber(sourceString, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		*  String Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public NNumber getnumber(NString sourceString, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger irc= NInteger.getNull();
//			return toNumber(getstring(sourceString, fieldPosition, unterminated, delimiter));
//
			this.getLogger().trace(this, "F2J : getnumber function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		*/
		public NDate getdate(NString sourceString, NNumber fieldPosition) {
			return getdate(sourceString, fieldPosition, toBool(NBool.False), toStr(","));
		}

/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		*/
		public NDate getdate(NString sourceString, NNumber fieldPosition, NBool unterminated) {
			return getdate(sourceString, fieldPosition, unterminated, toStr(","));
		}

/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public NDate getdate(NString sourceString, NNumber fieldPosition, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return toDate(getstring(sourceString, fieldPosition, unterminated, delimiter), "DD-MON-YYYY HH24:MI:SS");
//
			this.getLogger().trace(this, "F2J : getdate function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NDate.getNull();
		}
/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchString
		*/
		public NNumber locate(NString sourceString, NString searchString) {
			return locate(sourceString, searchString, toBool(NBool.False), toStr(","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchString
		* @param unterminated
		*/
		public NNumber locate(NString sourceString, NString searchString, NBool unterminated) {
			return locate(sourceString, searchString, unterminated, toStr(","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchString
		* @param unterminated
		* @param delimiter
		*/
		public NNumber locate(NString sourceString, NString searchString, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger ihit = toInt(0);
//			NInteger icounter= NInteger.getNull();
//			NString vccompare= NString.getNull();
//			for ( icounter = 1; icounter <= counter(sourceString, unterminated, delimiter); icounter+= 1 )
//			{
//				if ( getstring(sourceString, toNumber(icounter), unterminated, delimiter).equals(searchString) )
//				{
//					ihit = icounter;
//						break;
//				}
//			}
//			return ihit;
//
			this.getLogger().trace(this, "F2J : locate function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		*/
		public NNumber locate(NString sourceString, NDate searchDate) {
			return locate(sourceString, searchDate, toBool(NBool.False), toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		* @param unterminated
		*/
		public NNumber locate(NString sourceString, NDate searchDate, NBool unterminated) {
			return locate(sourceString, searchDate, unterminated, toStr(","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		* @param unterminated
		* @param delimiter
		*/
		public NNumber locate(NString sourceString, NDate searchDate, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return locate(sourceString, toChar(searchDate, "DD-MON-YYYY HH24:MI:SS"), unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : locate function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber) {
			return locate(sourceString, searchNumber, toBool(NBool.False), toStr(","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		* @param unterminated
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber, NBool unterminated) {
			return locate(sourceString, searchNumber, unterminated, toStr(","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		* @param unterminated
		* @param delimiter
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return locate(sourceString, toChar(searchNumber), unterminated, delimiter);
//
			this.getLogger().trace(this, "F2J : locate function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NNumber.getNull();
		}
		
	
	
}
