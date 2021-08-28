package com.sam.design_patterns.visitor;

import org.springframework.stereotype.Service;

@Service
public class ObjectStructure {
	
	private HtmlTag ulimateParentTag;
	private HtmlTag currentParentTag;
		
	public void addUltimateParent(HtmlTag htmltag) {
		this.ulimateParentTag = htmltag;
		currentParentTag = this.ulimateParentTag;
	}
		
	public void addParent(HtmlTag htmlTag) {
		currentParentTag.addChildTag(htmlTag);
		currentParentTag = htmlTag;
	}
	
	public void addLeafElement(HtmlTag htmlTag) {
		currentParentTag.addChildTag(htmlTag);
	}
	
	public void generateHtml() {
		this.ulimateParentTag.generateHtml();
	}

}
