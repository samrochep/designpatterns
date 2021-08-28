package com.sam.design_patterns.visitor;

import org.springframework.stereotype.Service;

@Service
public class ClassVisitor implements Visitor {

	@Override
	public void visit(ParentHtmlElement parentHtmlElement) {
		parentHtmlElement.setStartTag(parentHtmlElement.getStartTag().replace(">", " class='parent'>"));
	}

	@Override
	public void visit(HtmlElement htmlElement) {
		htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " class='leaf'>"));
	}

}
