package net.hedtech.general.common.services;

import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.util.logging.LogTraceEvent;
import morphis.foundations.core.util.logging.LogTraceMessage;
import morphis.foundations.core.util.logging.LoggerFactory;

public class BannerFilter {
	
	private String _maskValue = null;
	private String _rule = null;
	private int _count = 0;
	private static final String LEFT = "L";
	private static final String RIGHT = "R";
	private char _replacementChar = '*';
	
	
	public BannerFilter(String rule) {		
		this._maskValue = rule;
		this._rule = rule.substring(0, 1);
		this._count = new Integer(rule.substring(2)).intValue();
	}
	
	public String getMaskedValue(String value) {
		if (checkMaskRule(_maskValue)) {
			try {
				return convertString(value);
			} catch (Exception e) {
				LoggerFactory.getInstance(Task.class).error(new LogTraceEvent(this, new LogTraceMessage(" ** Set Masking : Error " + e.getMessage()), e));
			}
		}
		return value;
	}

	private boolean checkMaskRule(String ruleText) {
		if ((ruleText != null)
				&& (ruleText.length() > 0)
				&& ((ruleText.indexOf("R:") == 0) || (ruleText.indexOf("L:") == 0))) {
			return true;
		}
		return false;
	}
	
	public char getReplacementChar(){
		return this._replacementChar;
	}

	public void setReplacementChar(char replacement){
		this._replacementChar = replacement;
	}

	private String convertString(String s) {
		if (s == null)
			return null;
		int i = s.length();
		char[] ac = new char[i];
		char c = getReplacementChar();
		if (this._rule.equals(LEFT)) {
			for (int j = 0; j < i; j++) {
				if (j <= this._count - 1) {
					ac[j] = s.charAt(j);
				} else {
					ac[j] = c;
				}
			}
			return new String(ac);
		}
		if (this._rule.equals(RIGHT)) {
			for (int j = i - 1; j >= 0; j--) {
				if (j >= i - this._count) {
					ac[j] = s.charAt(j);
				} else {
					ac[j] = c;
				}
			}
			return new String(ac);
		}
		return s;
	}

}
