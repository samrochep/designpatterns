package com.sam.design_patterns.visitor;

import org.springframework.stereotype.Service;

@Service
public class StyleVisitor implements Visitor {

	@Override
	public void visit(ParentHtmlElement parentHtmlElement) {
		parentHtmlElement.setStartTag(parentHtmlElement.getStartTag().replace(">", " style='width:50px;>'"));
	}

	@Override
	public void visit(HtmlElement htmlElement) {
		htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " style='width:40px;>'"));
	}

}
