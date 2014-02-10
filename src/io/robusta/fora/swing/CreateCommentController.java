package io.robusta.fora.swing;

import io.robusta.fora.ForaDataSource;
import io.robusta.fora.domain.Comment;
import io.robusta.fora.domain.Subject;
import io.robusta.fora.domain.User;

public class CreateCommentController {

	CreateCommentView view;
	CreateCommentModel model;
	SubjectController controller;

	
	
	public CreateCommentController(CreateCommentView view, CreateCommentModel model,SubjectController controller) {
		this.view = view;
		this.model = model;
		this.controller = controller;
	}
	
	
	
	public String cancelAction(String content){	
		return content = null;		
	}
	
	
	
	public Comment createComment(String content, boolean isAnonymous){	
		if (content == null || content.isEmpty()){
			view.showError("Empty content");
			return null;
		}
		
		
		User user = ForaDataSource.getInstance().nicolas();
		Comment comment = new Comment();
		comment.setContent(content);
		
		
		if (isAnonymous){
			comment.setAnonymous(true);
		}else{
			comment.setUser(user);
		}
		
		model.setNewComment(comment);
		model.setAnonymous(isAnonymous);
		controller.addComment(comment);
		
		return comment;
	}
	
}
