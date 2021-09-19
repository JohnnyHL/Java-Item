package com.hl.magic.server.common.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * 字符串长度约束
 */
public class LimitedDocument extends PlainDocument {
	private int max_length = 0;
	private String allowCharString = null;

	public LimitedDocument() {
		super();
	}

	public LimitedDocument(int length) {
		super();
		this.max_length = length;
	}

	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		if (str == null) return;
		char[] charcoal = str.toCharArray();
		String strOldValue = getText(0, getLength());
		byte[] tmp = strOldValue.getBytes();
		if (max_length != 0 && (tmp.length + charcoal.length > max_length)) {
			return;
		}
		super.insertString(offs, str, a);
	}

	public void setAllowChar(String str) {
		allowCharString = str;
	}
}