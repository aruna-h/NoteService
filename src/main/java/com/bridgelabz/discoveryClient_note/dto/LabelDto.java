package com.bridgelabz.discoveryClient_note.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;




/**
 * @author bridgelabz
 * @since 23/07/2018 <br>
 *        <p>
 *        Business Entity having the label DTO related information.<br>
 *        </p>
 */
@SuppressWarnings("serial")

public class LabelDto implements Serializable {
	private String userId;
	@Id
	private String labelId;
	private String labelName;

	public LabelDto() {

	}

	public LabelDto(String labelId, String labelName, String userId) {
		super();
		this.labelId = labelId;
		this.labelName = labelName;
		this.userId = userId;

	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "LabelDto [userId=" + userId + ", labelId=" + labelId + ", labelName=" + labelName + "]";
	}

}
