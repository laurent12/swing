package io.robusta.fora.swing;

import io.robusta.fora.ForaDataSource;
import io.robusta.fora.domain.Subject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class SwingApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingApp window = new SwingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		//Boilerplate for CommentView
		Comment model = ForaDataSource.getInstance().getComments().get(0);
		CommentView commentView = new CommentView(model);
		CommentController controller = new CommentController(model, commentView);
		commentView.setController(controller);		
		//frame.getContentPane().add(commentView, BorderLayout.CENTER);
		*/
		
		
		
		
		
		
		/*
		 * Boilerplate for SubjectView
		 * 
		 * 1 - récupere dans la base le prmier sujet
		 * 2 - créé une vue corrspondant aus sujets : subjectView.
		 * 3 - créé le controleur des sujets (param le sujet et la vue créés précédement)
		 * 4 - initialise le controleur dans la vue par une methode : setController
		 *     qui prend en param le controleur créé précédement
		 * 
		 */
		
		Subject subject = ForaDataSource.getInstance().getSubjects().get(0);
		
		SubjectView subjectView = new SubjectView();
		SubjectController subjectController = new SubjectController(subjectView, subject);
		subjectView.setController(subjectController);
		
		
		
		
		/*
		 * 1 - Création du modele
		 * 2 - initialise le sujet du model par setSubject() qui prend en parametre
		 *	   le subect créé précédement.	 
		 * 3 - création de la vue concernant les commentaires (qui prend en parametre
		 * 	   le modele qui vient d'etre créé.
		 * 4 - création du controleur CreateCommentController initialisation avec la vue
		 *     et le modele qui viennent d'être créés.
		 *     	
		 */
		CreateCommentModel createCommentModel = new CreateCommentModel();
		createCommentModel.setSubject(subject);
		CreateCommentView createCommentView = new CreateCommentView(createCommentModel);
		
		CreateCommentController createCommentController = new CreateCommentController(createCommentView, createCommentModel, subjectController);
		createCommentView.setController(createCommentController );
		
		frame.getContentPane().add(subjectView, BorderLayout.CENTER);
		frame.getContentPane().add(createCommentView, BorderLayout.SOUTH);
	}

}






