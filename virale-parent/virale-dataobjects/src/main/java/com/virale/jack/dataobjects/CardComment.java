package com.virale.jack.dataobjects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_COMMENTS")
public class CardComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENT_ID")
	private int commentId;

	@Column(name = "COMMENT")
	private String comment;

	@Column(name = "COMMENT_DATE")
	private Date commentdate;

	// uni directional many to one mapping
	@ManyToOne
	@JoinColumn(name = "CARD_ID")
	private Card card;

	// uni directional many to one mapping
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private CardStoreUser user;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentdate() {
		return commentdate;
	}

	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public CardStoreUser getUser() {
		return user;
	}

	public void setUser(CardStoreUser user) {
		this.user = user;
	}

}
