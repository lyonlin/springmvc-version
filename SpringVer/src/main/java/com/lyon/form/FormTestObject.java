package com.lyon.form;

import java.util.ArrayList;
import java.util.List;

import com.lyon.base.FormVersion;

public class FormTestObject extends FormVersion {

	public FormTestObject(String formId, String content, int ver){
		super(ver);
		this.setFormId(formId);
		this.setContent(content);
	}
	
	private String formId;
	private String content;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public static List<FormTestObject> getFormList(){
		List<FormTestObject> list = new ArrayList<FormTestObject>();
		for(int i=1;i<=5;i++){
			list.add(new FormTestObject(String.valueOf(i), "content"+i, 1));
		}
		for(int i=6;i<=10;i++){
			list.add(new FormTestObject(String.valueOf(i), "content"+i, 2));
		}
		return list;
		
	}

}
