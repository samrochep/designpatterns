package com.sam.design_patterns.visitor;

public interface Visitor {
	
	void visit(ParentHtmlElement parentHtmlElement);
	void visit(HtmlElement htmlElement);

}
