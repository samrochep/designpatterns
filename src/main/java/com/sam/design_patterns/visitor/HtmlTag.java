package com.sam.design_patterns.visitor;

import java.util.List;

public abstract class HtmlTag {
	
	protected String startTag;
	protected String endTag;

	
	public void setStartTag(String startTag) {
		this.startTag=startTag;
	}
	public String getStartTag() {
		return this.startTag;
	}
	public void setEndTag(String endTag){
		this.endTag=endTag;
	}
	public String getEndTag() {
		return this.endTag;
	}
	
	public void setTagBody(String tagBody) {
		throw new UnsupportedOperationException("Operation is not supported for the current object");
	}
	public String getTagBody() {
		throw new UnsupportedOperationException("Operation is not supported for the current object");
	}
	
	public void addChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Operation is not supported for the current object");
	}
	public void removeChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Operation is not supported for the current object");
	}
	public List<HtmlTag> getChildrenTags(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Operation is not supported for the current object");
	}
	
	public abstract void accept(Visitor visitor);
	
	
	public abstract void generateHtml();

}
