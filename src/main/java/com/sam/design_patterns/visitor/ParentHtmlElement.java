package com.sam.design_patterns.visitor;

import java.util.List;

import com.google.common.collect.Lists;

public class ParentHtmlElement extends HtmlTag {
	
	private List<HtmlTag> childrenTags = Lists.newArrayList();

	@Override
	public void addChildTag(HtmlTag htmlTag) {
		childrenTags.add(htmlTag);
	}
	@Override
	public void removeChildTag(HtmlTag htmlTag) {
		childrenTags.remove(htmlTag);
	}
	@Override
	public List<HtmlTag> getChildrenTags(HtmlTag htmlTag) {
		return childrenTags;
	}
	
	@Override
	public void generateHtml() {
		System.out.println(this.startTag);
		for(HtmlTag child:this.childrenTags) {
			child.generateHtml();
		}
		System.out.println(this.endTag);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
