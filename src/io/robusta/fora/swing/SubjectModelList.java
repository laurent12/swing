package io.robusta.fora.swing;

import io.robusta.fora.domain.Comment;

import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class SubjectModelList implements ListModel<Comment> {

	List<Comment> comments;
	
	
	
	public SubjectModelList(){
		super();
	}
	
	
	/**
	 * @param comments
	 */
	public SubjectModelList(List<Comment> comments) {
		super();
		this.comments = comments;
	}

	
	
	
	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	@Override
	public int getSize() {
		return comments.size();
	}

	@Override
	public Comment getElementAt(int index) {
		return comments.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		System.out.println("added some elements ");
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

}
