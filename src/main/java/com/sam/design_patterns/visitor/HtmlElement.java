package com.sam.design_patterns.visitor;

public class HtmlElement extends HtmlTag {
	
	private String tagBody;

	@Override
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	
	@Override
	public String getTagBody() {
		return this.tagBody;
	}

	@Override
	public void generateHtml() {
		System.out.println(this.startTag+""+this.tagBody+""+this.endTag);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	

}
