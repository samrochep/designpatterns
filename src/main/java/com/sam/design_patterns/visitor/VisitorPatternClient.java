package com.sam.design_patterns.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorPatternClient {
	
	@Autowired
	private ObjectStructure objectStructure;
	
	@Autowired
	private Visitor styleVisitor;
	
	@Autowired
	private Visitor classVisitor;
   
	public void generateHtml() {
		
		HtmlTag ulimateParentTag = new ParentHtmlElement();
		ulimateParentTag.setStartTag("<html>");
		ulimateParentTag.setEndTag("</html>");
		ulimateParentTag.accept(styleVisitor);
		ulimateParentTag.accept(classVisitor);
		objectStructure.addUltimateParent(ulimateParentTag);
		HtmlTag bodyParent = new ParentHtmlElement();
		bodyParent.setStartTag("<body>");
		bodyParent.setEndTag("</body>");
		bodyParent.accept(styleVisitor);
		bodyParent.accept(classVisitor);
		objectStructure.addParent(bodyParent);
		HtmlTag divParent = new ParentHtmlElement();
		divParent.setStartTag("<div>");
		divParent.setEndTag("</div>");
		divParent.accept(styleVisitor);
		divParent.accept(classVisitor);
		objectStructure.addParent(divParent);
		HtmlTag paragraphOneLeafTag = new HtmlElement();
		paragraphOneLeafTag.setStartTag("<p>");
		paragraphOneLeafTag.setEndTag("</p");
		paragraphOneLeafTag.setTagBody("I am Paragraph One...");
		paragraphOneLeafTag.accept(styleVisitor);
		paragraphOneLeafTag.accept(classVisitor);
		objectStructure.addLeafElement(paragraphOneLeafTag);
		HtmlTag paragraphTwoLeafTag = new HtmlElement();
		paragraphTwoLeafTag.setStartTag("<p>");
		paragraphTwoLeafTag.setEndTag("</p");
		paragraphTwoLeafTag.setTagBody("I am Paragraph Two...");
		paragraphTwoLeafTag.accept(styleVisitor);
		paragraphTwoLeafTag.accept(classVisitor);
		objectStructure.addLeafElement(paragraphTwoLeafTag);
		objectStructure.generateHtml();
	}
}
