package com.editab.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;



public class Score extends Observable{
	
	// TODO : Might be better to consider note as an 
	private List<String> note = new ArrayList<String> ();
	
	public List<String> getNote() {
		return note;
	}

	public void setNote(List<String> note) {
		this.note = note;
	}

	public void addNote(String not) {
		note.add(not);
		setChanged();
		notifyObservers();
	}
	
	public void clearNote() {
		note.clear();
		setChanged();
		notifyObservers();
	}
}
