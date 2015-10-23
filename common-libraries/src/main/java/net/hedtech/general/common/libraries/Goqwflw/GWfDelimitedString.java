package net.hedtech.general.common.libraries.Goqwflw;

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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;

public class GWfDelimitedString extends AbstractSupportCodeObject {
	

	public GWfDelimitedString(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_DELIMITED_STRING
	/*
	PACKAGE G$_WF_DELIMITED_STRING IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_DELIMITED_STRING contains functions and
  procedures for the parsing and handling of delimited strings,
  i.e.., strings whose values are separated in the following type
  of format:

  <field_1><delimiter><field_2><delimiter>...

  For each of the functions and procedures this package contains,
  the delimiter will default to double quotes followed by a comma
  (",) unless otherwise specified as a parameter.

  All functions are overloaded where required.
\*--------------------------------------------------------------</multilinecomment>
 
--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The function Counter returns the number of fields in a given
  delimited string given the delimiter used in the string
  and whether the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  Counter(      SourceString    IN VARCHAR2,
			        UnTerminated    IN BOOLEAN DEFAULT FALSE,
			        Delimiter       IN VARCHAR2 DEFAULT '",') RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The procedure PutString returns as an output parameter an
  updated delimited string given that string, a character field
  to add to the string, a field position at which the field
  should be added, the delimiter used in the string and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE PutString(	Source_string 	IN OUT VARCHAR2,
			 	String_to_add 	IN VARCHAR2,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  The procedure PutNumber returns as an output parameter an
  updated delimited string given that string, a number field
  to add to the string, a field position at which the field
  should be added, the delimiter used in the string and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE PutNumber(	Source_string 	IN OUT VARCHAR2,
			 	Number_to_add 	IN NUMBER,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  The procedure PutDate returns as an output parameter an
  updated delimited string given that string, a date field
  to add to the string, a field position at which the field
  should be added, the delimiter used in the string and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE PutDate(	Source_string 	IN OUT VARCHAR2,
			 	Date_to_add 	IN DATE,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the procedure Put performs the same
  operation as the PutString procedure.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE Put	 (	Source_string 	IN OUT VARCHAR2,
			 	String_to_add 	IN VARCHAR2,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the procedure Put performs the same
  operation as the PutNumber procedure.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE Put	 (	Source_string 	IN OUT VARCHAR2,
			 	Number_to_add 	IN NUMBER,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the procedure Put performs the same
  operation as the PutDate procedure.
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE Put	 (	Source_string 	IN OUT VARCHAR2,
			 	Date_to_add 	IN DATE,
			 	Field_position 	IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",');

<multilinecomment>--------------------------------------------------------------*\
  The function GetString returns the value of a character field
  within a delimited string given the position of that field
  within the string, the delimiter used in the string, and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

        FUNCTION  GetString(    SourceString    IN VARCHAR2,
                                FieldPosition   IN PLS_INTEGER,
                                UnTerminated    IN BOOLEAN DEFAULT FALSE,
                                Delimiter       IN VARCHAR2 DEFAULT '",') RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\
  The function GetNumber returns the value of a number field
  within a delimited string given the position of that field
  within the string, the delimiter used in the string, and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  GetNumber(	Source_string	IN VARCHAR2,
			 	Field_position  IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",') RETURN NUMBER;

<multilinecomment>--------------------------------------------------------------*\
  The function GetDate returns the value of a date field
  within a delimited string given the position of that field
  within the string, the delimiter used in the string, and whether
  the string is terminated with that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  GetDate(	Source_string	IN VARCHAR2,
			 	Field_position  IN PLS_INTEGER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter 	IN VARCHAR2 DEFAULT '",') RETURN DATE;

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the function Locate returns the
  number of the first position at which a given character field
  is found within a given delimited string given the delimiter
  used in the string and whether the string is terminated by
  that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  Locate(	Source_string	IN VARCHAR2,
			 	Search_String	IN VARCHAR2,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter	IN VARCHAR2 DEFAULT '",') RETURN NUMBER;

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the function Locate returns the
  number of the first position at which a given number field
  is found within a given delimited string given the delimiter
  used in the string and whether the string is terminated by
  that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  Locate(	Source_string	IN VARCHAR2,
			 	Search_Number	IN NUMBER,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter	IN VARCHAR2 DEFAULT '",') RETURN NUMBER;

<multilinecomment>--------------------------------------------------------------*\
  This overloaded version of the function Locate returns the
  number of the first position at which a given date field
  is found within a given delimited string given the delimiter
  used in the string and whether the string is terminated by
  that delimiter.
\*--------------------------------------------------------------</multilinecomment>

	FUNCTION  Locate(	Source_string	IN VARCHAR2,
			 	Search_date	IN DATE,
			 	UnTerminated	IN BOOLEAN  DEFAULT FALSE,
			 	Delimiter	IN VARCHAR2 DEFAULT '",') RETURN NUMBER;

<multilinecomment>--------------------------------------------------------------*\
  The function BuildString returns the result of the concatenation
  of a given field onto the end of a given delimited string 
  given the position that field will hold in the string, the
  total number of fields the string will ultimately contain once
  the construction of the string is complete, the delimiter to
  be used in the string, and whether the string will be terminated
  with that delimiter.

  If the total number of fields that the string will ultimately
  contain is not known, specifying the same number for the field
  position and for the total number of fields will have the effect
  of placing a delimiter on the end of the string if you specify
  that the string should be terminated with a delimiter.
\*--------------------------------------------------------------</multilinecomment>

        FUNCTION BuildString(   SubString       IN VARCHAR2,
                                SourceString    IN VARCHAR2,
                                FieldPosition   IN PLS_INTEGER,
                                SubstringTotal  IN PLS_INTEGER,
                                UnTerminated    IN BOOLEAN DEFAULT FALSE,
                                Delimiter       IN VARCHAR2 DEFAULT '",') RETURN VARCHAR2;

END G$_WF_DELIMITED_STRING;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_DELIMITED_STRING
		/*
		PACKAGE BODY G$_WF_DELIMITED_STRING IS

--*
--* Declare private variables
--*

 vcCurrProgUnit  CONSTANT  VARCHAR2(30) := 'G$_WF_DELIMITED_STRING';

--*
--* Define public subprogram bodies
--*

 FUNCTION Counter(SourceString  IN VARCHAR2,
                  UnTerminated  IN BOOLEAN  DEFAULT FALSE,
                  Delimiter     IN VARCHAR2 DEFAULT '",') RETURN PLS_INTEGER IS
  vcCurrSubprog     CONSTANT  VARCHAR2(30)   := 'COUNTER';
  iOrigLength                 PLS_INTEGER    := 0;
  iModifier                   PLS_INTEGER    := 0;
  vcUndelimString             VARCHAR2(2000);
  iNewLength                  PLS_INTEGER    := 0;
  iDelimiterLength            PLS_INTEGER    := 0;
  iSubstringTotal             PLS_INTEGER    := 0;

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0179','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF SourceString IS NOT NULL THEN
    iOrigLength      := NVL(LENGTH(SourceString), 0);
    iDelimiterLength := NVL(LENGTH(Delimiter), 0);

    IF Unterminated THEN
      iModifier := 1;
    END IF;

    vcUndelimString  := REPLACE(SourceString,Delimiter);
    iNewLength       := NVL(LENGTH(vcUndelimString), 0);

    iSubstringTotal  := ( (iOrigLength - iNewLength) / iDelimiterLength ) + iModifier;
  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0180','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN iSubstringTotal;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
 END Counter;

 Procedure PutString	(Source_string 	in out varchar2,
 		 String_to_add 	in varchar2,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
	vcCurrSubprog	CONSTANT   VARCHAR2(30) := 'PUTSTRING';
 	iStrLen		NUMBER                  := NVL(length(Source_String), 0);
 	iStrFragLen	NUMBER                  := NVL(Length(String_to_add), 0);
 	iPtrStart	NUMBER                  := 0;
 	iPtrEnd		NUMBER                  := 0;
  	vcSepBuffer	varchar2(2000);
 	iCounter	NUMBER;
 begin
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0181','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

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
 		iStrLen	      := NVL(length(Source_string), 0);
 	end if;
 	else			
 -- 2. Cope with unterminated strings 
 		if UnTerminated then 
 			Source_string := Source_string||Delimiter;
 		end if;

 -- 3. Locate the nth-1 separator
 		if Field_Position > 1 then 
 			LOOP
 				iPtrStart := (instr(Source_string||vcSepBuffer,Delimiter,1,Field_Position-1)-1) + NVL(length(Delimiter), 0);
 				EXIT when iPtrStart > 0;
 				vcSepBuffer	:= vcSepBuffer||Delimiter;
 			END LOOP;
 			if vcSepBuffer is not null then 	
 				iPtrEnd := iStrLen;
 			else 
 				iPtrEnd := instr(Source_string,Delimiter,1,Field_Position);
 				if iPtrEnd = 0 then 
 					iPtrEnd := iStrLen;
 				end if;
 			end if;
 		else 	iPtrStart := 0;
 			iPtrEnd := instr(Source_string,Delimiter,1,Field_Position);
 			if iPtrEnd = 0 then 
 				iPtrEnd := iStrLen;
 			end if;
 		end if;
 		-- 3. Rebuild the string
 		Source_string := substr(Source_string,1,iPtrStart)||vcSepBuffer||
 				 String_to_add||Delimiter||substr(Source_string,iPtrEnd+NVL(length(Delimiter), 0));
 -- 4. Sort out termination
 		if UnTerminated then 
 			Source_string := substr(Source_String,1,(NVL(length(Source_string), 0)-NVL(length(Delimiter), 0)));
 		end if;
 	end if;
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0182','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END PutString;

 Procedure PutNumber	(Source_string 	in out varchar2,
 		 number_to_add 	in number,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
 
 begin
 -- 1. Just do datatype conversions and call the varchar2 varsion of put..
 	G$_WF_DELIMITED_STRING.PutString(Source_string, to_char(number_to_add), Field_position, UnTerminated, Delimiter);
 end PutNumber;

 Procedure PutDate	(Source_string 	in out varchar2,
 		 Date_to_add 	in date,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
 	
 begin
 -- 1. Just do datatype conversions and call the varchar2 varsion of put..
  G$_WF_DELIMITED_STRING.PutString(Source_string, TO_CHAR(date_to_add,'' || 
    NAME_IN('GLOBAL.NLS_DATE_FORMAT') || ' HH24:MI:SS'), Field_position, UnTerminated, Delimiter);
 end PutDate;

       -- Overloaded versions of the "Puts"
 Procedure Put	(Source_string 	in out varchar2,
 		 String_to_add 	in varchar2,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
 
 begin
 -- 1. Just do datatype conversions and call the varchar2 varsion of put..
 	G$_WF_DELIMITED_STRING.PutString(Source_string, string_to_add, Field_position, UnTerminated, Delimiter);
 end Put;

 Procedure Put	(Source_string 	in out varchar2,
 		 number_to_add 	in number,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
 
 begin
 -- 1. Just do datatype conversions and call the varchar2 varsion of put..
 	G$_WF_DELIMITED_STRING.PutString(Source_string, to_char(number_to_add), Field_position, UnTerminated, Delimiter);
 end Put;

 Procedure Put	(Source_string 	in out varchar2,
 		 Date_to_add 	in date,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') is
 	
 begin
 -- 1. Just do datatype conversions and call the varchar2 varsion of put..
  G$_WF_DELIMITED_STRING.PutString(Source_string, TO_CHAR(date_to_add,'' ||
    NAME_IN('GLOBAL.NLS_DATE_FORMAT') || ' HH24:MI:SS'), Field_position, UnTerminated, Delimiter);
 end Put;


 FUNCTION GetString(SourceString   IN VARCHAR2,
                    FieldPosition  IN PLS_INTEGER,
                    UnTerminated   IN BOOLEAN DEFAULT FALSE,
                    Delimiter      IN VARCHAR2 DEFAULT '",') RETURN VARCHAR2 IS
  vcCurrSubprog        CONSTANT  VARCHAR2(30)   := 'GETSTRING';
  vcSourceStrCopy                VARCHAR2(2000);
  iDelimiterLength               PLS_INTEGER    := 0;
  iSubstringStartPosn            PLS_INTEGER    := 0;
  iSubstringEndPosn              PLS_INTEGER    := 0;
  vcSubstring                    VARCHAR2(2000);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0183','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF SourceString IS NOT NULL THEN
    iDelimiterLength := NVL(LENGTH(Delimiter), 0);

    IF UnTerminated THEN
      vcSourceStrCopy := SourceString || Delimiter;
    ELSE
      vcSourceStrCopy := SourceString;
    END IF;

    IF FieldPosition > 1 THEN
      iSubstringStartPosn := INSTR(vcSourceStrCopy,Delimiter,1,(FieldPosition - 1)) + iDelimiterLength;
    ELSE
      iSubstringStartPosn := 1;
    END IF;

    iSubstringEndPosn := INSTR(vcSourceStrCopy,Delimiter,1,FieldPosition);

    vcSubstring       := SUBSTR(vcSourceStrCopy,iSubstringStartPosn,(iSubstringEndPosn - iSubstringStartPosn));
  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0184','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN vcSubstring;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
 END GetString;

 function  GetNumber(Source_string	in varchar2,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') return number is
 	iRc	pls_integer;
 begin 
 	Return to_number(GetString(Source_string, Field_Position, UnTerminated, Delimiter));
 end GetNumber; <multilinecomment> Number Version </multilinecomment>

 function  GetDate(Source_string	in varchar2,
 		 Field_position in pls_integer,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter 	in varchar2 default '",') return date is
 begin 
  return TO_DATE(GetString(Source_string, Field_Position, UnTerminated, Delimiter),'' ||
    NAME_IN('GLOBAL.NLS_DATE_FORMAT')||' HH24:MI:SS');
 end GetDate; <multilinecomment> Date Version </multilinecomment>

 function  Locate(Source_string	in varchar2,
 		 Search_String	in varchar2,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter	in varchar2 default '",') return number is 
 	iHit	  pls_integer := 0;
 	iCounter  pls_integer;
 	vcCompare varchar2(2000);
 begin 
 	for iCounter in 1..Counter(Source_String, UnTerminated, Delimiter) LOOP
 		if GetString(Source_String,iCounter, UnTerminated, Delimiter) = Search_String then 
 			iHit := iCounter;
 			Exit;
 		end if;
 	end loop;
 	Return iHit;
 end Locate;

 function  Locate(Source_string	in varchar2,
 		 Search_number	in number,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter	in varchar2 default '",') return number is
 begin
 	return Locate( Source_string, to_char(Search_number), UnTerminated, Delimiter);
 end Locate; <multilinecomment> Number Version </multilinecomment>

 function  Locate(Source_string	in varchar2,
 		 Search_date	in date,
 		 UnTerminated	in Boolean  default FALSE,
 		 Delimiter	in varchar2 default '",') return number is
 begin
  return Locate( Source_string, TO_CHAR(Search_date,'' ||
    NAME_IN('GLOBAL.NLS_DATE_FORMAT') ||' HH24:MI:SS'), UnTerminated, Delimiter);
 end Locate; <multilinecomment> Date Version </multilinecomment>

 FUNCTION BuildString(SubString       IN VARCHAR2,
                      SourceString    IN VARCHAR2,
                      FieldPosition   IN PLS_INTEGER,
                      SubstringTotal  IN PLS_INTEGER,
                      UnTerminated    IN BOOLEAN DEFAULT FALSE,
                      Delimiter       IN VARCHAR2 DEFAULT '",') RETURN VARCHAR2 IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30)   := 'BUILDSTRING';
  vcNewstring              VARCHAR2(2000);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0185','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF SourceString IS NOT NULL THEN

    IF NOT UnTerminated AND FieldPosition = SubstringTotal THEN
      vcNewstring := SourceString || Delimiter || Substring || Delimiter;
    ELSE
      vcNewstring := SourceString || Delimiter || Substring;
    END IF;

  ELSE

    IF NOT UnTerminated AND FieldPosition = SubstringTotal THEN
      vcNewstring := Substring || Delimiter;
    ELSE
      vcNewstring := Substring;
    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0186','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN vcNewstring;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
 END BuildString;

END G$_WF_DELIMITED_STRING;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_DELIMITED_STRING");
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		*/
		public NInteger counter(NString sourcestring) {
			return counter(sourcestring, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		* @param unterminated
		*/
		public NInteger counter(NString sourcestring, NBool unterminated) {
			return counter(sourcestring, unterminated, toStr("\","));
		}

/* <p>
		* *
		* * Define public subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		* @param unterminated
		* @param delimiter
		*/
		public NInteger counter(NString sourcestring, NBool unterminated, NString delimiter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			final NString VCCURRSUBPROG = toStr("COUNTER");
			NInteger ioriglength = toInt(0);
			NInteger imodifier = toInt(0);
			NString vcundelimstring= NString.getNull();
			NInteger inewlength = toInt(0);
			NInteger idelimiterlength = toInt(0);
			NInteger isubstringtotal = toInt(0);
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0179"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( !sourcestring.isNull() )
				{
					ioriglength = isNull(length(sourcestring), 0);
					idelimiterlength = isNull(length(delimiter), 0);
					if ( unterminated.getValue() )
					{
						imodifier = toInt(1);
					}
					vcundelimstring = replace(sourcestring, delimiter);
					inewlength = isNull(length(vcundelimstring), 0);
					isubstringtotal = (ioriglength.subtract(inewlength).divide(idelimiterlength)).add(imodifier).toInteger();
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0180"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return isubstringtotal;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NInteger.getNull();
			}

		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		*/
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition) {
			putstring(sourceString, stringToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition, NBool unterminated) {
			putstring(sourceString, stringToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void putstring(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{

			final NString VCCURRSUBPROG = toStr("PUTSTRING");
			NInteger istrlen = isNull(length(sourceString.val), 0);
			NInteger istrfraglen = isNull(length(stringToAdd), 0);
			NNumber iptrstart = toNumber(0);
			NInteger iptrend = toInt(0);
			NString vcsepbuffer= NString.getNull();
			int icounter;
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0181"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				//  1. is the string Zero Length?
				if ( istrlen.equals(0) )
				{
					if ( fieldPosition.greater(1) )
					{
						for ( icounter = 2; icounter <= fieldPosition.getValue(); icounter+= 1 )
						{
							vcsepbuffer = vcsepbuffer.append(delimiter);
						}
					}
					sourceString.val = vcsepbuffer.append(stringToAdd);
					if ( unterminated.not() )
					{
						sourceString.val = sourceString.val.append(delimiter);
						istrlen = isNull(length(sourceString.val), 0);
					}
				}
				else {
					//  2. Cope with unterminated strings 
					if ( unterminated.getValue() )
					{
						sourceString.val = sourceString.val.append(delimiter);
					}
					//  3. Locate the nth-1 separator
					if ( fieldPosition.greater(1) )
					{
						while (true) {
							iptrstart = toNumber((inStr(sourceString.val.append(vcsepbuffer), delimiter, toInt(1), fieldPosition.subtract(1)).subtract(1)).add(isNull(length(delimiter), 0)));
							if ( iptrstart.greater(0) ) 
								break;
							vcsepbuffer = vcsepbuffer.append(delimiter);
						}
						if ( !vcsepbuffer.isNull() )
						{
							iptrend = istrlen;
						}
						else {
							iptrend = inStr(sourceString.getValue(), delimiter, toInt(1), fieldPosition);
							if ( iptrend.equals(0) )
							{
								iptrend = istrlen;
							}
						}
					}
					else {
						iptrstart = toNumber(0);
						iptrend = inStr(sourceString.val, delimiter, toInt(1), fieldPosition);
						if ( iptrend.equals(0) )
						{
							iptrend = istrlen;
						}
					}
					//  3. Rebuild the string
					sourceString.val = substring(sourceString.val, toInt(1), toInt(iptrstart)).append(vcsepbuffer).append(stringToAdd).append(delimiter).append(substring(sourceString.val, toInt(iptrend.add(isNull(length(delimiter), 0)))));
					//  4. Sort out termination
					if ( unterminated.getValue() )
					{
						sourceString.val = substring(sourceString.val, toInt(1), toInt(((isNull(length(sourceString.val), 0).subtract(isNull(length(delimiter), 0))))));
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0182"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		*/
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition) {
			putnumber(sourceString, numberToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition, NBool unterminated) {
			putnumber(sourceString, numberToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void putnumber(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{

			//  1. Just do datatype conversions and call the varchar2 varsion of put..
			putstring(sourceString, toChar(numberToAdd), fieldPosition, unterminated, delimiter);
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		*/
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition) {
			putdate(sourceString, dateToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition, NBool unterminated) {
			putdate(sourceString, dateToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void putdate(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{

			//  1. Just do datatype conversions and call the varchar2 varsion of put..
			putstring(sourceString, toChar(dateToAdd, toStr("").append(getNameIn("GLOBAL.NLS_DATE_FORMAT")).append(" HH24:MI:SS")), fieldPosition, unterminated, delimiter);
		}
/* <p>
		*  Overloaded versions of the "Puts"
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param stringToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition) {
			put(sourceString, stringToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
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
		public void put(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition, NBool unterminated) {
			put(sourceString, stringToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void put(Ref<NString> sourceString, NString stringToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{
			//  1. Just do datatype conversions and call the varchar2 varsion of put..
			putstring(sourceString, stringToAdd, fieldPosition, unterminated, delimiter);
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition) {
			put(sourceString, numberToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param numberToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition, NBool unterminated) {
			put(sourceString, numberToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void put(Ref<NString> sourceString, NNumber numberToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{
			//  1. Just do datatype conversions and call the varchar2 varsion of put..
			putstring(sourceString, toChar(numberToAdd), fieldPosition, unterminated, delimiter);			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		*/
		public void put(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition) {
			put(sourceString, dateToAdd, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param dateToAdd
		* @param fieldPosition
		* @param unterminated
		*/
		public void put(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition, NBool unterminated) {
			put(sourceString, dateToAdd, fieldPosition, unterminated, toStr("\","));
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
		public void put(Ref<NString> sourceString, NDate dateToAdd, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{
			//  1. Just do datatype conversions and call the varchar2 varsion of put..
			putstring(sourceString, toChar(dateToAdd, toStr("").append(getNameIn("GLOBAL.NLS_DATE_FORMAT")).append(" HH24:MI:SS")), fieldPosition, unterminated, delimiter);
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		* @param fieldposition
		*/
		public NString getstring(NString sourcestring, NInteger fieldposition) {
			return getstring(sourcestring, fieldposition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		* @param fieldposition
		* @param unterminated
		*/
		public NString getstring(NString sourcestring, NInteger fieldposition, NBool unterminated) {
			return getstring(sourcestring, fieldposition, unterminated, toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourcestring
		* @param fieldposition
		* @param unterminated
		* @param delimiter
		*/
		public NString getstring(NString sourcestring, NInteger fieldposition, NBool unterminated, NString delimiter)
		{
			final NString VCCURRSUBPROG = toStr("GETSTRING");
			NString vcsourcestrcopy= NString.getNull();
			NInteger idelimiterlength = toInt(0);
			NInteger isubstringstartposn = toInt(0);
			NInteger isubstringendposn = toInt(0);
			NString vcsubstring= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0183"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( !sourcestring.isNull() )
				{
					idelimiterlength = isNull(length(delimiter), 0);
					if ( unterminated.getValue() )
					{
						vcsourcestrcopy = sourcestring.append(delimiter);
					}
					else {
						vcsourcestrcopy = sourcestring;
					}
					if ( fieldposition.greater(1) )
					{
						isubstringstartposn = inStr(vcsourcestrcopy, delimiter, toInt(1), ((fieldposition.subtract(1)))).add(idelimiterlength);
					}
					else {
						isubstringstartposn = toInt(1);
					}
					isubstringendposn = inStr(vcsourcestrcopy, delimiter, toInt(1), fieldposition);
					vcsubstring = substring(vcsourcestrcopy, isubstringstartposn, ((isubstringendposn.subtract(isubstringstartposn))));
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0184"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return vcsubstring;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NString.getNull();
			}

		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		*/
		public NNumber getnumber(NString sourceString, NInteger fieldPosition) {
			return getnumber(sourceString, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		*/
		public NNumber getnumber(NString sourceString, NInteger fieldPosition, NBool unterminated) {
			return getnumber(sourceString, fieldPosition, unterminated, toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		* @param delimiter
		*/
		public NNumber getnumber(NString sourceString, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{
			NInteger irc= NInteger.getNull();
			return toNumber(getstring(sourceString, fieldPosition, unterminated, delimiter));
		}
/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		*/
		public NDate getdate(NString sourceString, NInteger fieldPosition) {
			return getdate(sourceString, fieldPosition, toBool(NBool.False), toStr("\","));
		}

/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param fieldPosition
		* @param unterminated
		*/
		public NDate getdate(NString sourceString, NInteger fieldPosition, NBool unterminated) {
			return getdate(sourceString, fieldPosition, unterminated, toStr("\","));
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
		public NDate getdate(NString sourceString, NInteger fieldPosition, NBool unterminated, NString delimiter)
		{
			return toDate(getstring(sourceString, fieldPosition, unterminated, delimiter), toStr("").append(getNameIn("GLOBAL.NLS_DATE_FORMAT")).append(" HH24:MI:SS"));

		}
/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchString
		*/
		public NNumber locate(NString sourceString, NString searchString) {
			return locate(sourceString, searchString, toBool(NBool.False), toStr("\","));
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
			return locate(sourceString, searchString, unterminated, toStr("\","));
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
			NInteger ihit = toInt(0);
			int icounter;
			NString vccompare= NString.getNull();
			NInteger counter = counter(sourceString, unterminated, delimiter);
			if ( !counter.isNull() ) {
				for ( icounter = 1; icounter <= counter.getValue(); icounter+= 1 )
				{
					if ( getstring(sourceString, toInt(icounter), unterminated, delimiter).equals(searchString) )
					{
						ihit = toInt(icounter);
						break;
					}
				}
			}
			return toNumber(ihit);

		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber) {
			return locate(sourceString, searchNumber, toBool(NBool.False), toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		* @param unterminated
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber, NBool unterminated) {
			return locate(sourceString, searchNumber, unterminated, toStr("\","));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchNumber
		* @param unterminated
		* @param delimiter
		*/
		public NNumber locate(NString sourceString, NNumber searchNumber, NBool unterminated, NString delimiter)
		{
			return locate(sourceString, toChar(searchNumber), unterminated, delimiter);
		}
/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		*/
		public NNumber locate(NString sourceString, NDate searchDate) {
			return locate(sourceString, searchDate, toBool(NBool.False), toStr("\","));
		}

/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		* @param unterminated
		*/
		public NNumber locate(NString sourceString, NDate searchDate, NBool unterminated) {
			return locate(sourceString, searchDate, unterminated, toStr("\","));
		}

/* <p>
		*  Number Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceString
		* @param searchDate
		* @param unterminated
		* @param delimiter
		*/
		public NNumber locate(NString sourceString, NDate searchDate, NBool unterminated, NString delimiter)
		{
			return locate(sourceString, toChar(searchDate, toStr("").append(getNameIn("GLOBAL.NLS_DATE_FORMAT")).append(" HH24:MI:SS")), unterminated, delimiter);
		}
/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param substring
		* @param sourcestring
		* @param fieldposition
		* @param substringtotal
		*/
		public NString buildstring(NString substring, NString sourcestring, NInteger fieldposition, NInteger substringtotal) {
			return buildstring(substring, sourcestring, fieldposition, substringtotal, toBool(NBool.False), toStr("\","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param substring
		* @param sourcestring
		* @param fieldposition
		* @param substringtotal
		* @param unterminated
		*/
		public NString buildstring(NString substring, NString sourcestring, NInteger fieldposition, NInteger substringtotal, NBool unterminated) {
			return buildstring(substring, sourcestring, fieldposition, substringtotal, unterminated, toStr("\","));
		}

/* <p>
		*  Date Version 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param substring
		* @param sourcestring
		* @param fieldposition
		* @param substringtotal
		* @param unterminated
		* @param delimiter
		*/
		public NString buildstring(NString substring, NString sourcestring, NInteger fieldposition, NInteger substringtotal, NBool unterminated, NString delimiter)
		{

			final NString VCCURRSUBPROG = toStr("BUILDSTRING");
			NString vcnewstring= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0185"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( !sourcestring.isNull() )
				{
					if ( unterminated.not() && fieldposition.equals(substringtotal) )
					{
						vcnewstring = sourcestring.append(delimiter).append(substring).append(delimiter);
					}
					else {
						vcnewstring = sourcestring.append(delimiter).append(substring);
					}
				}
				else {
					if ( unterminated.not() && fieldposition.equals(substringtotal) )
					{
						vcnewstring = substring.append(delimiter);
					}
					else {
						vcnewstring = substring;
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0186"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
				return vcnewstring;
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				return NString.getNull();
			}
		}
		
	
	
}
