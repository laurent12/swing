package io.robusta.fora.swing;

import io.robusta.fora.domain.Comment;
import io.robusta.fora.domain.Subject;

public class SubjectController {

	SubjectView view;
	Subject model;
	
	
	public SubjectController(SubjectView view, Subject model) {
		this.view = view;
		this.model = model;
	}
	
	public void addComment(Comment comment){
		model.addElement(comment);
		view.reInit();	
	}
	
	
}
